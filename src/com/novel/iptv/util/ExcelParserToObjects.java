package com.novel.iptv.util;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;

import com.novel.iptv.exception.SysException;
import com.novel.iptv.model.ExcelBindObject;

/* Excel数据解析器<code>ExcelParserToObjects</code>参考<code>ExcelParser</code><br>
 * 本类是通用处理类,结合<code>ExcelBindObject</code>抽象类,实现了自定义Excel文档单行数据的解析转换.<br>
 * 当前本类支持单行数据(对应一个数据对象)方式.<br>
 * 实现思想:<br>
 * 本类实现对excel文档数据的读取,开发人员的<code>ExcelBindObject</code>匿名对象参数负责把指定位置(列)的数据写到对应的输出对象上.<br>
 *
 * 实现思想:<br>
 *    模板模式：自己干的部分为：创建<code>ExcelBindObject</code>匿名对象作为"调用方法"的参数：<br> 
 *    1：初始化ExcelBindObject构造参数Class<br> 
 *    2：实现抽象方法：public Object setValue(int index, Object value, Object v_ob)负责把指定位置(列)的数据赋值到对应的输出对象的属性上.<br>
 * 具体使用参考:<br>
 * <code></code> 
 * @see <code>ExcelBindObject</code>
 */

public class ExcelParserToObjects {

	public static List parseSingleSheet(InputStream inStream,
			ExcelBindObject excelBinder) {

		// 多sheet文件读取,可以参考此方法(循环调用 #getSheetData(...)方法即可)
		Workbook workbook = loadWorkbook(inStream);

		return getSheetData(workbook, 0, excelBinder);
	}

	private static Workbook loadWorkbook(InputStream inStream) {
		try {
			Workbook workbook = Workbook.getWorkbook(inStream);

			if (workbook == null) {
				throw new SysException("数据文件错误");
			}

			return workbook;

		} catch (Exception e) {
			e.printStackTrace();
			throw new SysException("读数据文件错误");
		}
	}

	private static List getSheetData(Workbook workbook, int indexSheet,
			ExcelBindObject eb) {

		// Sheet
		Sheet sheet = workbook.getSheet(indexSheet);

		if (sheet == null || (sheet.getRows() == 0)) {
			return Collections.EMPTY_LIST;
		}

		// Excel数据开始行号 目前是第一行
		int titleRowSeq = 1; //TODO Excel数据开始行号 目前是第一行
		try {
			List dataList = new ArrayList();

			Cell[] row;
			Cell cell;

			// 循环读取Sheet中的每一行数据
			for (int i = titleRowSeq, rowSize = sheet.getRows(); i < rowSize; i++) {

				// 取Excel行对象
				row = sheet.getRow(i);
				if (row == null) {
					continue;
				}
				// 获取导出数据对象
				Object ob = eb.bindObject();

				// 为导出数据对象赋值
				for (int y = 0, cellSize = row.length; y < cellSize; y++) {
					cell = row[y];

					if (cell == null) {
						continue;
					}

					// 每个Cell的值
					String value = getCellValue(cell);
					if (value != null && value.length() > 0) {
						eb.setValue(y, value, ob);
					}
				}

				// 保存数据对象到List.
				dataList.add(ob);
			}

			return dataList;
		} catch (Exception e) {
			throw new RuntimeException("读取Excel文件错误", e);
		}
	}

	private static String getCellValue(Cell cell) {

		String value = "";

		// Excel单元格的类型
		CellType cellType = cell.getType();

		if (cellType == CellType.LABEL) {
			value = cell.getContents();
		}

		if (cellType == CellType.STRING_FORMULA) {
			value = cell.getContents();
		}

		if (cellType == CellType.NUMBER) {
			value = DECIMALFORMAT.format(((NumberCell) cell).getValue());
			value = trimString(value);
		}

		if (cellType == CellType.NUMBER_FORMULA) {
			value = trimString(DECIMALFORMAT.format(((NumberCell) cell)
					.getValue()));
		}
		if(cellType == CellType.DATE){
			value =DateTimeUtils.formatDate(((DateCell) cell).getDate(), DateTimeUtils.PATTERN_4);
        }
		return value;
	}

	private static String trimString(String value) {
		if (value == null || value.length() <= 0) {
			return "";
		}

		String sValue = value.trim();

		if (sValue.endsWith("\\.")) {
			sValue = sValue.substring(0, sValue.length() - 1);
		}
		return sValue;
	}

	// 读取数字类型的数据时需要格式化
	private static DecimalFormat DECIMALFORMAT = new DecimalFormat(
			"##########.##");
}
