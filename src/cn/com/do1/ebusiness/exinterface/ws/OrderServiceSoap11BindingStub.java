/**
 * OrderServiceSoap11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.do1.ebusiness.exinterface.ws;

public class OrderServiceSoap11BindingStub extends org.apache.axis.client.Stub implements cn.com.do1.ebusiness.exinterface.ws.OrderServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("detailOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "DetailOrderRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailOrderRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "DetailOrderResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("shoppingCartOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartOrderRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartOrderRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartOrderResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryShoppingCart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryShoppingCartRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryShoppingCartRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryShoppingCartResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("directBuy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "DirectBuyRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.DirectBuyRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "DirectBuyResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryOrderRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryOrderRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryOrderResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addShoppingCarts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartsRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartsRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delShoppingCart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "DelShoppingCartRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.DelShoppingCartRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "DelShoppingCartResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addShoppingCart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addOrderForMerchant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "requestVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddOrderForMerRequestVO"), cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddOrderForMerRequestVO.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddOrderForMerResponseVO"));
        oper.setReturnClass(cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddOrderForMerResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public OrderServiceSoap11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OrderServiceSoap11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OrderServiceSoap11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddOrderForMerRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddOrderForMerRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartsRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartsRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "BaseRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.BaseRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "DelShoppingCartRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.DelShoppingCartRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "DetailOrderRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailOrderRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "DirectBuyRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.DirectBuyRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryOrderRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryOrderRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryShoppingCartRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryShoppingCartRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartItem");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://request.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartOrderRequestVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartOrderRequestVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddOrderForMerResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddOrderForMerResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "AddShoppingCartResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "BaseResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.BaseResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "DelShoppingCartResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "DetailOrderResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "DirectBuyResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryOrderResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "QueryShoppingCartResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShopCartInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShopCartInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://response.vo.exinterface.ebusiness.do1.com.cn/xsd", "ShoppingCartOrderResponseVO");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "AddressInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.AddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "CsMdInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.CsMdInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "MdShopCar");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.MdShopCar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "MerchantShopCar");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.MerchantShopCar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.OrderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderItem");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderItemDetail");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderItemInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.OrderItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.exinterface.ebusiness.do1.com.cn/xsd", "OrderPromotionInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.do1.ebusiness.exinterface.vo.xsd.OrderPromotionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO detailOrder(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DetailOrderRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:detailOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "detailOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.DetailOrderResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO shoppingCartOrder(cn.com.do1.ebusiness.exinterface.vo.request.xsd.ShoppingCartOrderRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:shoppingCartOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "shoppingCartOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.ShoppingCartOrderResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO queryShoppingCart(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryShoppingCartRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:queryShoppingCart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "queryShoppingCart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryShoppingCartResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO directBuy(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DirectBuyRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:directBuy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "directBuy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.DirectBuyResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO queryOrder(cn.com.do1.ebusiness.exinterface.vo.request.xsd.QueryOrderRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:queryOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "queryOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.QueryOrderResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO addShoppingCarts(cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartsRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:addShoppingCarts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "addShoppingCarts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO delShoppingCart(cn.com.do1.ebusiness.exinterface.vo.request.xsd.DelShoppingCartRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:delShoppingCart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "delShoppingCart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.DelShoppingCartResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO addShoppingCart(cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddShoppingCartRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:addShoppingCart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "addShoppingCart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddShoppingCartResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddOrderForMerResponseVO addOrderForMerchant(cn.com.do1.ebusiness.exinterface.vo.request.xsd.AddOrderForMerRequestVO requestVO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:addOrderForMerchant");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.exinterface.ebusiness.do1.com.cn", "addOrderForMerchant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddOrderForMerResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddOrderForMerResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.do1.ebusiness.exinterface.vo.response.xsd.AddOrderForMerResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
