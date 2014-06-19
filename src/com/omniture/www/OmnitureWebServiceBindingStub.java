/**
 * OmnitureWebServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class OmnitureWebServiceBindingStub extends org.apache.axis.client.Stub implements com.omniture.www.OmnitureWebServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[173];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CodeManager.DeleteCodeArchive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "archive_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CodeManager.GenerateCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "char_set"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "code_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cookie_domain_periods"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "currency_code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "secure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "code_items"));
        oper.setReturnClass(com.omniture.www.Code_item[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CodeManager.GetCodeArchives");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "archive_id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "binary_encoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "populate_code_items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "code_archives"));
        oper.setReturnClass(com.omniture.www.Code_archive[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "archives"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CodeManager.SaveCodeArchive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "archive_description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "archive_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "archive_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "code_items"), com.omniture.www.Code_item[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.CancelQueueItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.DownloadProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.GetEndpoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "endpoint"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.GetQueue");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "queue_items"));
        oper.setReturnClass(com.omniture.www.Queue_item[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "items"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.GetReportSuites");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rs_types"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suites_rval"));
        oper.setReturnClass(com.omniture.www.Simple_report_suites_rval.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.GetTokenCount");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.GetTokenUsage");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "token_usage_container"));
        oper.setReturnClass(com.omniture.www.Token_usage_container.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.GetTrackingServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "tracking_server_data"));
        oper.setReturnClass(com.omniture.www.Tracking_server_data.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Company.ResetTokenCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "auth_key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.AppendDataBlock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "blockID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endOfBlock"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "rowArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileID"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.BeginDataBlock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "blockName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "columnNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "colArray"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endOfBlock"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "rowArray"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "blockID"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileID"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.Deactivate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "status"));
        oper.setReturnClass(com.omniture.www.Status.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.GetFileIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "fileIDResult"));
        oper.setReturnClass(com.omniture.www.FileIDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.GetFileInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "fileInfoResult"));
        oper.setReturnClass(com.omniture.www.DsFileStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.GetFileStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceFileID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "fileStatusResult"));
        oper.setReturnClass(com.omniture.www.FileStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.GetIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "simpleDataSourceArray"));
        oper.setReturnClass(com.omniture.www.SimpleDataSource[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.GetInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "infoResult"));
        oper.setReturnClass(com.omniture.www.DataSourceInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.ProcessIncompleteVisits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "status"));
        oper.setReturnClass(com.omniture.www.Status.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.Restart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "status"));
        oper.setReturnClass(com.omniture.www.Status.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.SetupFull");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceSettings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "ds_full_settings"), com.omniture.www.Ds_full_settings.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_setup_result"));
        oper.setReturnClass(com.omniture.www.Ds_setup_result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.SetupGeneric");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceSettings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "ds_generic_settings"), com.omniture.www.Ds_generic_settings.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_setup_result"));
        oper.setReturnClass(com.omniture.www.Ds_setup_result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.SetupTraffic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceSettings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "ds_traffic_settings"), com.omniture.www.Ds_traffic_settings.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_setup_result"));
        oper.setReturnClass(com.omniture.www.Ds_setup_result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataSource.SetupWebLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSourceSettings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "ds_weblog_settings"), com.omniture.www.Ds_weblog_settings.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportSuiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "ds_setup_result"));
        oper.setReturnClass(com.omniture.www.Ds_setup_result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.CancelRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Request_Id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.CheckRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Request_Id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_request"));
        oper.setReturnClass(com.omniture.www.Data_warehouse_request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.CreateSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment"), com.omniture.www.Data_warehouse_segment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.GetReportData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Request_Id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start_row"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report"));
        oper.setReturnClass(com.omniture.www.Data_warehouse_report.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.GetSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment"));
        oper.setReturnClass(com.omniture.www.Data_warehouse_segment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.GetSegments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "dwsegments"));
        oper.setReturnClass(com.omniture.www.Dwsegment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.ReplaceSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment"), com.omniture.www.Data_warehouse_segment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.Request");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Breakdown_List"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Contact_Name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Contact_Phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Date_From"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Date_Granularity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Date_Preset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Date_To"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Date_Type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Email_Subject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Email_To"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FTP_Dir"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FTP_Host"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FTP_Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FTP_Port"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FTP_UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "File_Name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Metric_List"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Segment_Id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Request_Id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataWarehouse.VerifySegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment"), com.omniture.www.Data_warehouse_segment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryList.Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dist_list_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryList.Get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "publishingLists_array"));
        oper.setReturnClass(com.omniture.www.PublishingList[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "publishingLists"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeliveryList.Save");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "delivery_list_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dist_list_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Discover.GetSegments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "end_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "segment_folders"));
        oper.setReturnClass(com.omniture.www.Segment_folder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Discover.QueueDiscoverOvertime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        oper.setReturnClass(com.omniture.www.ReportQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Discover.QueueDiscoverRanked");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        oper.setReturnClass(com.omniture.www.ReportQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Discover.QueueDiscoverTrended");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        oper.setReturnClass(com.omniture.www.ReportQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Logs.GetAdminConsoleCompanyLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "end_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter_rule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "log_rule_operators"), com.omniture.www.Log_rule_operators.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "log_filters"), com.omniture.www.Log_filter[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "log_entries"));
        oper.setReturnClass(com.omniture.www.Log_entry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Logs.GetAdminConsoleLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "end_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter_rule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "log_rule_operators"), com.omniture.www.Log_rule_operators.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "log_filters"), com.omniture.www.Log_filter[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "log_entries"));
        oper.setReturnClass(com.omniture.www.Log_entry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.AddLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "change_password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "create_dashboards"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dashboard_rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "first_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "last_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone_number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "selected_group_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group_array"), com.omniture.www.Permission_group[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "temp_login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "temp_login_end"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "temp_login_start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.Authenticate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.DeleteGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.DeleteLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetCRMInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "crm_info"));
        oper.setReturnClass(com.omniture.www.Crm_info.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "perm_categories"));
        oper.setReturnClass(com.omniture.www.Parent_category[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "group_data"));
        oper.setReturnClass(com.omniture.www.Group_data.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group_array"));
        oper.setReturnClass(com.omniture.www.Permission_group[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "login"));
        oper.setReturnClass(com.omniture.www.Login.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetLogins");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login_search_field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login_search_value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "perm_login_array"));
        oper.setReturnClass(com.omniture.www.Perm_login[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetReportBuilderLogin");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportBuilderLogin"));
        oper.setReturnClass(com.omniture.www.ReportBuilderLogin.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "reportBuilderLogin"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetReportSuiteGroupCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search_field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search_val"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "permissions_account_array"));
        oper.setReturnClass(com.omniture.www.Permissions_account[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.GetReportSuiteGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "permissions_account_groups"));
        oper.setReturnClass(com.omniture.www.Permissions_account_groups.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.HasPrivilege");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "privilegeToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.SaveGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "perm_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "perm_info"), com.omniture.www.Perm_data[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report_access_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "report_categories"), com.omniture.www.Report_categories.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report_id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.SaveLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "change_password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "first_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "last_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "phone_number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "selected_group_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group_array"), com.omniture.www.Permission_group[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "send_welcome_email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "temp_end_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "temp_login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "temp_start_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Permissions.SaveReportSuiteGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "selected_groups"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.CancelReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.GetElementNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_element_mappings"));
        oper.setReturnClass(com.omniture.www.Report_element_mapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.GetReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportResponse"));
        oper.setReturnClass(com.omniture.www.ReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.GetReportQueue");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_queue"));
        oper.setReturnClass(com.omniture.www.Report_queue_item[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.GetStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_status"));
        oper.setReturnClass(com.omniture.www.Report_status.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.QueueOvertime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        oper.setReturnClass(com.omniture.www.ReportQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.QueueRanked");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        oper.setReturnClass(com.omniture.www.ReportQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.QueueSCMRanked");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        oper.setReturnClass(com.omniture.www.ReportQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report.QueueTrended");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription"), com.omniture.www.ReportDescription.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse"));
        oper.setReturnClass(com.omniture.www.ReportQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.AddCorrelations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rel_ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "correlation_size_enum"), com.omniture.www.Correlation_size_enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.AddInternalURLFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.AddKeyVisitors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "key_visitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.AddSavedFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "savedFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filters_array"), com.omniture.www.Saved_filter[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filters_array"));
        oper.setReturnClass(com.omniture.www.Saved_filter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "filters"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base_currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base_url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "default_page"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "duplicate_rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "go_live_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hits_per_day"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "latin1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "site_title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time_zone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "timezone_enum"), com.omniture.www.Timezone_enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteBaseURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteCalculatedMetrics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "calculated_metrics"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "calculated_metrics"), com.omniture.www.Calculated_metric[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteClassifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "c_view"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "classification_view"), com.omniture.www.Classification_view.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "div_num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parent_div_num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteCorrelations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rel_ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "correlation_size_enum"), com.omniture.www.Correlation_size_enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteDefaultPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteIPAddressExclusions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ip_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteInternalURLFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteKeyVisitors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "key_visitors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteMarketingChannelCost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cost_group"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteMarketingChannels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "channel_ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_id_list"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeletePages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page_id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeletePaidSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search_engine"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.DeleteSavedFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "savedFilterIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_activation"));
        oper.setReturnClass(com.omniture.www.Report_suite_activation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetAvailableElements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return_datawarehouse_elements"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_elements"));
        oper.setReturnClass(com.omniture.www.Report_suite_elements[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetAvailableMetrics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return_datawarehouse_metrics"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_metrics"));
        oper.setReturnClass(com.omniture.www.Report_suite_metrics[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetBaseCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_base_currency"));
        oper.setReturnClass(com.omniture.www.Report_suite_base_currency[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetBaseURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_base_url"));
        oper.setReturnClass(com.omniture.www.Report_suite_base_url[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetCalculatedMetrics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_calculated_metric"));
        oper.setReturnClass(com.omniture.www.Report_suite_calculated_metric[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetClassificationHierarchies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "c_view"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rel_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_hierarchy"));
        oper.setReturnClass(com.omniture.www.Report_suite_hierarchies[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetClassifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "c_view"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rel_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_classification"));
        oper.setReturnClass(com.omniture.www.Report_suite_classification[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetCorrelations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_correlation"));
        oper.setReturnClass(com.omniture.www.Report_suite_correlation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetCustomCalendar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_custom_calendar"));
        oper.setReturnClass(com.omniture.www.Report_suite_custom_calendar[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetDefaultPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_default_page"));
        oper.setReturnClass(com.omniture.www.Report_suite_default_page[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetEVars");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_evar"));
        oper.setReturnClass(com.omniture.www.Report_suite_evar[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetEcommerce");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ecommerce"));
        oper.setReturnClass(com.omniture.www.Report_suite_ecommerce[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetFindingMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_finding_method"));
        oper.setReturnClass(com.omniture.www.Report_suite_finding_method[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetIPAddressExclusions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ip_exclusions"));
        oper.setReturnClass(com.omniture.www.Report_suite_ip_exclusions[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetIPObfuscation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ip_obfuscation"));
        oper.setReturnClass(com.omniture.www.Report_suite_ip_obfuscation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetInternalURLFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_internal_url_filter"));
        oper.setReturnClass(com.omniture.www.Report_suite_internal_url_filter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetKeyVisitors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_key_visitor"));
        oper.setReturnClass(com.omniture.www.Report_suite_key_visitor[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetLocalization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_localization"));
        oper.setReturnClass(com.omniture.www.Report_suite_localization[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetMarketingChannelCost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_costs"));
        oper.setReturnClass(com.omniture.www.Report_suite_costs[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetMarketingChannelExpiration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "expiration_event_list"));
        oper.setReturnClass(com.omniture.www.Expiration_event[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetMarketingChannelRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "multi_rs_mchannel_rulesets"));
        oper.setReturnClass(com.omniture.www.Rs_mchannel_rulesets[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetMarketingChannels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "mchannels_list"));
        oper.setReturnClass(com.omniture.www.Mchannels[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page_search"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sc_period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start_point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_pages_array"));
        oper.setReturnClass(com.omniture.www.Report_suite_pages[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetPaidSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_paid_search"));
        oper.setReturnClass(com.omniture.www.Report_suite_paid_search[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetPermanentTraffic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "permanent_traffic_array"));
        oper.setReturnClass(com.omniture.www.Permanent_traffic[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetProcessingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_processing_status"));
        oper.setReturnClass(com.omniture.www.Report_suite_processing_status[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetRollups");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rollup_array"));
        oper.setReturnClass(com.omniture.www.Rollup[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetSavedFilters");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filters_array"));
        oper.setReturnClass(com.omniture.www.Saved_filter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "savedFilters"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetScheduledSpike");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "schedule_spike_array"));
        oper.setReturnClass(com.omniture.www.Schedule_spike[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_settings"));
        oper.setReturnClass(com.omniture.www.Report_suite_settings[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetSiteTitle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_site_title"));
        oper.setReturnClass(com.omniture.www.Report_suite_site_title[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetSuccessEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_event"));
        oper.setReturnClass(com.omniture.www.Report_suite_event[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_template"));
        oper.setReturnClass(com.omniture.www.Report_suite_template[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetTimeZone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_time_zone"));
        oper.setReturnClass(com.omniture.www.Report_suite_time_zone[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetTrafficVars");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_traffic_var"));
        oper.setReturnClass(com.omniture.www.Report_suite_traffic_var[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetUIVisibility");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ui_element"));
        oper.setReturnClass(com.omniture.www.Report_suite_ui_element[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetUniqueVisitorVariable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_unique_visitor_variable"));
        oper.setReturnClass(com.omniture.www.Report_suite_unique_visitor_variable[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.GetVideoTracking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_video_tracking"));
        oper.setReturnClass(com.omniture.www.Report_suite_video_tracking[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveBaseCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base_currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveBaseURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "base_url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveCalculatedMetrics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "calculated_metrics"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "calculated_metrics"), com.omniture.www.Calculated_metric[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveClassificationHierarchies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "c_options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "c_view"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "classification_view"), com.omniture.www.Classification_view.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "camp_view"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "div_num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parent_div_num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "classification_type"), com.omniture.www.Classification_type.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "update"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveClassifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "c_options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "c_view"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "classification_view"), com.omniture.www.Classification_view.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "camp_view"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "div_num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parent_div_num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "classification_type"), com.omniture.www.Classification_type.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "update"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveCustomCalendar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "anchor_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cal_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveDefaultPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "default_page"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveEVars");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "evars"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "evars"), com.omniture.www.Evar[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveEcommerce");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ecommerce"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveFindingMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reports"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "finding_methods"), com.omniture.www.Finding_method[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveIPAddressExclusions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ip_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveIPObfuscation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ip_obfuscation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveMarketingChannelCost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cost_item"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "cost_item"), com.omniture.www.Cost_item.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveMarketingChannelExpiration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "days"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveMarketingChannelRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mchannel_rules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rulesets"), com.omniture.www.Mchannel_ruleset[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveMarketingChannels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "channels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_list"), com.omniture.www.Mchannel[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SavePaidSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search_engine"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SavePermanentTraffic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new_hits_per_day"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveRollup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "go_live_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rollup_rsids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time_zone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "timezone_enum"), com.omniture.www.Timezone_enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveSavedFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "savedFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filters_array"), com.omniture.www.Saved_filter[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filters_array"));
        oper.setReturnClass(com.omniture.www.Saved_filter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "filters"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveScheduledSpike");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "end_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "spike_hits_per_day"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveSiteTitle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "site_title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveSuccessEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "events"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "events"), com.omniture.www.Event[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveTimeZone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "time_zone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "timezone_enum"), com.omniture.www.Timezone_enum.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveTrafficVars");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "property"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "traffic_vars"), com.omniture.www.Traffic_var[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveUIVisibility");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ui_element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportSuite.SaveUniqueVisitorVariable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rsid_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unique_visitor_variable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.CheckJobStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "job_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "saintresults"));
        oper.setReturnClass(com.omniture.www.Saintresult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.ExportCreateJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaign_filter_begin_range"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaign_filter_end_range"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaign_filter_option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_filter_row_end_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date_filter_row_start_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email_address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "encoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relation_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report_suite_array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "row_match_filter_empty_column_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "row_match_filter_match_column_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "row_match_filter_match_column_value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_all_rows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "select_number_of_rows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Job_Id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.ExportGetFileSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "pagedetails"));
        oper.setReturnClass(com.omniture.www.Pagedetail[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rows"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.GetCompatabiltyMetrics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report_suite_array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "compatabilitys"));
        oper.setReturnClass(com.omniture.www.Compatability[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "filedetails"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.GetFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relation_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report_suite_array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "export_filters"));
        oper.setReturnClass(com.omniture.www.Export_filter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.ImportCommitJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "job_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.ImportCreateJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "check_divisions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email_address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "export_results"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "overwrite_conflicts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relation_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report_suite_array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "job_id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saint.ImportPopulateJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "job_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "rows"), com.omniture.www.Row[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.CreatePublishedReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "workbookLocation"), com.omniture.www.WorkbookLocation.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduledReport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReport"), com.omniture.www.ScheduledReport.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workbook"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReport"));
        oper.setReturnClass(com.omniture.www.ScheduledReport.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.DeletePublishedReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduledReportIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "int_array"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.DeleteWorkbook");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "workbookLocation"), com.omniture.www.WorkbookLocation.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workbookNames"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "string_array"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.DownloadWorkbook");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "workbookLocation"), com.omniture.www.WorkbookLocation.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workbookName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.GetPublishedReports");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReports_array"));
        oper.setReturnClass(com.omniture.www.ScheduledReport[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "scheduledReports"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.GetReportsRunHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleLogs_array"));
        oper.setReturnClass(com.omniture.www.ScheduleLog[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "scheduleLogs"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.GetWorkbookList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "workbookLocation"), com.omniture.www.WorkbookLocation.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "excelWorkbooks_array"));
        oper.setReturnClass(com.omniture.www.ExcelWorkbook[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "excelWorkbooks"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.ReRunReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.UpdatePublishedReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scheduledReport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReport"), com.omniture.www.ScheduledReport.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workbook"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReport"));
        oper.setReturnClass(com.omniture.www.ScheduledReport.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Scheduling.UploadWorkbook");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filename"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "workbookLocation"), com.omniture.www.WorkbookLocation.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.omniture.com/", "productType"), com.omniture.www.ProductType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workbook"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[172] = oper;

    }

    public OmnitureWebServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OmnitureWebServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OmnitureWebServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "activation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Activation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "activations");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Activation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "activation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "base_currencies");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Base_currency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "base_currency");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "base_currency");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Base_currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "base_url");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Base_url.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "base_urls");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Base_url[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "base_url");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "booleanOperatorType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.BooleanOperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "calculated_metric");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Calculated_metric.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "calculated_metrics");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Calculated_metric[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "calculated_metric");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "channel_colors");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Channel_colors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "channel_types");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Channel_types.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "child_categories");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Child_category[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "child_category");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "child_category");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Child_category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Classification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification_container");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Classification_container.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification_node");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Classification_node.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification_node_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Classification_node[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification_node");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification_type");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Classification_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification_view");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Classification_view.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classifications");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Classification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "classification");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "code_archive");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Code_archive.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "code_archives");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Code_archive[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "code_archive");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "code_item");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Code_item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "code_items");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Code_item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "code_item");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "colArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "column");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Column.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "columns");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Column[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "column");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "comparisonOperatorType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ComparisonOperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "compatability");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Compatability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "compatabilitys");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Compatability[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "compatability");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "correlation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Correlation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "correlation_rel_id");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Correlation_rel_id.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "correlation_rel_id_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Correlation_rel_id[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "correlation_rel_id");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "correlation_size_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Correlation_size_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "correlations");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Correlation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "correlation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "cost");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Cost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "cost_item");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Cost_item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "cost_items");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Cost_item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "cost_item");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "costs");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Cost[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "cost");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "crm_info");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Crm_info.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "custom_calendar");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Custom_calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "custom_calendar_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Custom_calendar_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "custom_calendars");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Custom_calendar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "custom_calendar");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Data_warehouse_report.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report_headings");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report_row");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report_row_list");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_report_row");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_request");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Data_warehouse_request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Data_warehouse_segment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_group");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Data_warehouse_segment_group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_group_list");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Data_warehouse_segment_group[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_group");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_rule");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Data_warehouse_segment_rule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_rule_list");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Data_warehouse_segment_rule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "data_warehouse_segment_rule");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceFileInfo");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DataSourceFileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceFiles");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DataSourceFileInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceFileInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceFileStatus");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DataSourceFileStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceInfo");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DataSourceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "date_received");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Date_received.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "date_received_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Date_received[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "date_received");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "default_page");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Default_page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "default_pages");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Default_page[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "default_page");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "deliveryParameters");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DeliveryParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_full_injection_type");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_full_injection_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_full_settings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_full_settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_generic_settings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_generic_settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_setup_result");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_setup_result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_traffic_data_scope");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_traffic_data_scope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_traffic_settings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_traffic_settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_weblog_formats");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_weblog_formats.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ds_weblog_settings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ds_weblog_settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dsFileStruct");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DsFileStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dwsegment");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Dwsegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dwsegments");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Dwsegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dwsegment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ecommerce");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ecommerce.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ecommerce_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ecommerce_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ecommerces");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ecommerce[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ecommerce");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "element");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "element_mapping");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Element_mapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "element_mappings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Element_mapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "element_mapping");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "elements");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Element[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "element");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "errorList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar_alloc_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar_alloc_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar_exp_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar_exp_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar_merch_alloc_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar_merch_alloc_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar_merch_syntax_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar_merch_syntax_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar_sub_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar_sub_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evars");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Evar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "evar");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "event");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Event.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "event_type_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Event_type_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "events");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Event[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "event");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "excelWorkbook");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ExcelWorkbook.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "excelWorkbooks_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ExcelWorkbook[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "excelWorkbook");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "expiration_event");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Expiration_event.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "expiration_event_list");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Expiration_event[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "expiration_event");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "export_filter");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Export_filter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "export_filters");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Export_filter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "export_filter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "fileIDResult");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.FileIDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "fileInfoResult");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DsFileStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dsFileStruct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "fileStatusResult");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.FileStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "finding_method");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Finding_method.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "finding_methods");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Finding_method[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "finding_method");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_categories");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Group_category[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_category");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_category");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Group_category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_data");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Group_data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_report_list");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Group_report_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_sub_categories");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Group_sub_category[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_sub_category");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "group_sub_category");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Group_sub_category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchies");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Hierarchy[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Hierarchy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy_node");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Hierarchy_node.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy_node_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Hierarchy_node[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hierarchy_node");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hit_attribute");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Hit_attribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "hit_attribute_type");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Hit_attribute_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "infoResult");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.DataSourceInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "dataSourceInfo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "int_array");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "intArray");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "internal_url_filter");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Internal_url_filter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "internal_url_filters");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Internal_url_filter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "internal_url_filter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ip_exclusion");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ip_exclusion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ip_exclusions");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ip_exclusion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ip_exclusion");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ip_obfuscation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ip_obfuscation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ip_obfuscations");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ip_obfuscation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ip_obfuscation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "key_visitor");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Key_visitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "key_visitors");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Key_visitor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "key_visitor");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "localization");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "localizations");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Localization[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "localization");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_comparisons");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Log_comparisons.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_entries");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Log_entry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_entry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_entry");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Log_entry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_filter");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Log_filter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_filters");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Log_filter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_filter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_rule_operators");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Log_rule_operators.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "log_search_fields");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Log_search_fields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "login");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_id_list");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_list");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rule");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannel_rule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rule_list");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannel_rule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rule");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rule_matches");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_ruleset");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannel_ruleset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_rulesets");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannel_ruleset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannel_ruleset");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannels");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannels_list");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Mchannels[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "mchannels");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "metric");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Metric.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "metrics");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Metric[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "metric");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "multi_rs_mchannel_rulesets");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Rs_mchannel_rulesets[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rs_mchannel_rulesets");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "page");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "page_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Page[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "page");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "pagedetail");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Pagedetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "pagedetails");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Pagedetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "pagedetail");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "paid_search");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Paid_search.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "paid_searches");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Paid_search[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "paid_search");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "parent_category");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Parent_category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "perm_categories");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Parent_category[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "parent_category");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "perm_data");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Perm_data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "perm_info");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Perm_data[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "perm_data");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "perm_login");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Perm_login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "perm_login_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Perm_login[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "perm_login");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permanent_traffic");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Permanent_traffic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permanent_traffic_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Permanent_traffic[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permanent_traffic");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Permission_group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Permission_group[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permission_group");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permissions_account");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Permissions_account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permissions_account_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Permissions_account[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permissions_account");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "permissions_account_groups");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Permissions_account_groups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "processing_status");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Processing_status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "productType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "publishingList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.PublishingList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "publishingLists_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.PublishingList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "publishingList");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "queue_item");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Queue_item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "queue_items");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Queue_item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "queue_item");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_categories");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_categories.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_element_mapping");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_element_mapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_element_mappings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_element_mapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_element_mapping");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_queue");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_queue_item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_queue_item");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_queue_item");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_queue_item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_status");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_activation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_activation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_base_currency");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_base_currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_base_url");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_base_url.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_calculated_metric");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_calculated_metric.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_classification");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_classification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_correlation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_correlation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_costs");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_costs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_custom_calendar");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_custom_calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_default_page");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_default_page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ecommerce");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ecommerce.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_elements");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_elements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_evar");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_evar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_event");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_event.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_finding_method");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_finding_method.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_hierarchies");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_hierarchies.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_internal_url_filter");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_internal_url_filter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ip_exclusions");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ip_exclusions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ip_obfuscation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ip_obfuscation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_key_visitor");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_key_visitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_localization");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_metrics");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_metrics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_pages");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_pages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_pages_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_pages[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_pages");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_paid_search");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_paid_search.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_processing_status");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_processing_status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_settings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_site_title");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_site_title.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_template");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_template.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_time_zone");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_time_zone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_traffic_var");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_traffic_var.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ui_element");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ui_element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_unique_visitor_variable");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_unique_visitor_variable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_video_tracking");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_video_tracking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportBuilderLogin");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportBuilderLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportCountList");
            cachedSerQNames.add(qName);
            cls = double[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportData");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDataList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportData");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionDateGranularity");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionDateGranularity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionElement");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionElementList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionElement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionExpanded");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionExpanded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionLocale");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionLocale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionMetric");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionMetric.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionMetricList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionMetric[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionMetric");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearch");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearches");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSearch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearch");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSearchType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegment");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentCondition");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegmentCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentConditionList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegmentCondition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentCondition");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentConditions");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegmentConditions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentEvent");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegmentEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentEventList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegmentEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentEvent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDefinitionSegmentType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDefinitionSegmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportDescription");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportElement");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportElementList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportElement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportMetric");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportMetric.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportMetricList");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportMetric[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportMetric");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportMetricType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportMetricType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportQueueResponse");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportQueueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportReportSuite");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportReportSuite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportResponse");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "reportType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ReportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rollup");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Rollup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rollup_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Rollup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rollup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "row");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Row.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rowArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "colArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rows");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Row[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "row");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rs_mchannel_rulesets");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Rs_mchannel_rulesets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_activation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_activation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_activation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_base_currency");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_base_currency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_base_currency");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_base_url");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_base_url[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_base_url");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_calculated_metric");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_calculated_metric[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_calculated_metric");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_classification");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_classification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_classification");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_correlation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_correlation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_correlation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_costs");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_costs[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_costs");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_custom_calendar");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_custom_calendar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_custom_calendar");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_default_page");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_default_page[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_default_page");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ecommerce");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ecommerce[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ecommerce");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_elements");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_elements[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_elements");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_evar");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_evar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_evar");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_event");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_event[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_event");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_finding_method");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_finding_method[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_finding_method");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_hierarchy");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_hierarchies[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_hierarchies");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_internal_url_filter");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_internal_url_filter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_internal_url_filter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ip_exclusions");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ip_exclusions[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ip_exclusions");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ip_obfuscation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ip_obfuscation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ip_obfuscation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_key_visitor");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_key_visitor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_key_visitor");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_localization");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_localization[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_localization");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_metrics");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_metrics[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_metrics");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_paid_search");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_paid_search[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_paid_search");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_processing_status");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_processing_status[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_processing_status");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_settings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_settings[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_settings");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_site_title");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_site_title[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_site_title");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_template");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_template[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_template");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_time_zone");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_time_zone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_time_zone");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_traffic_var");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_traffic_var[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_traffic_var");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_ui_element");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_ui_element[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_ui_element");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_unique_visitor_variable");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_unique_visitor_variable[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_unique_visitor_variable");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "rscollection_video_tracking");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Report_suite_video_tracking[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "report_suite_video_tracking");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ruleset_junction_type");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ruleset_junction_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ruleset_operator_type");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ruleset_operator_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "saintresult");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Saintresult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "saintresults");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Saintresult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "saintresult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filter");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Saved_filter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filters_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Saved_filter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "saved_filter");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "schedule_spike");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Schedule_spike.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "schedule_spike_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Schedule_spike[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "schedule_spike");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleCancelType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleCancelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleDayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleDayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleDeliveryType");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleDeliveryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReport");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduledReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReports_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduledReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduledReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleFileFormat");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleFileFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleFrequency");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleLog");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleLogs_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleLog");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleMonth");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleMonth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleRecurrenceParameter");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleRecurrenceParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "scheduleSequence");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.ScheduleSequence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "segment");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Segment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "segment_folder");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Segment_folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "segment_folders");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Segment_folder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "segment_folder");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "segments");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Segment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "segment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "settings");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suite");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Simple_report_suite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suite_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Simple_report_suite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suite");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "simple_report_suites_rval");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Simple_report_suites_rval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "simpleDataSource");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.SimpleDataSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "simpleDataSourceArray");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.SimpleDataSource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "simpleDataSource");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "site_title");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Site_title.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "site_titles");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Site_title[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "site_title");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "status");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "string_array");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "tc_source_attribute");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Tc_source_attribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "tc_source_attribute_type");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Tc_source_attribute_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "template");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Template.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "templates");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Template[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "template");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "time_zone");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Time_zone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "time_zones");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Time_zone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "time_zone");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "timezone_enum");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Timezone_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "token_usage_array");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.User_token_usage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "user_token_usage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "token_usage_container");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Token_usage_container.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "tracking_server_data");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Tracking_server_data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "traffic_var");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Traffic_var.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "traffic_vars");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Traffic_var[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "traffic_var");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ui_element");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ui_element.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ui_elements");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Ui_element[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "ui_element");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "unique_visitor_variable");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Unique_visitor_variable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "unique_visitor_variables");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Unique_visitor_variable[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "unique_visitor_variable");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "user_token_usage");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.User_token_usage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "video_tracking");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.Video_tracking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "warningList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.omniture.com/", "workbookLocation");
            cachedSerQNames.add(qName);
            cls = com.omniture.www.WorkbookLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
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

    public int codeManagerDeleteCodeArchive(int archive_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#CodeManager.DeleteCodeArchive");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "CodeManager.DeleteCodeArchive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(archive_id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Code_item[] codeManagerGenerateCode(java.lang.String char_set, java.lang.String code_type, int cookie_domain_periods, java.lang.String currency_code, java.lang.String rsid, int secure) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#CodeManager.GenerateCode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "CodeManager.GenerateCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {char_set, code_type, new java.lang.Integer(cookie_domain_periods), currency_code, rsid, new java.lang.Integer(secure)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Code_item[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Code_item[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Code_item[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Code_archive[] codeManagerGetCodeArchives(int[] archive_id_list, java.lang.String binary_encoding, int populate_code_items) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#CodeManager.GetCodeArchives");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "CodeManager.GetCodeArchives"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {archive_id_list, binary_encoding, new java.lang.Integer(populate_code_items)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Code_archive[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Code_archive[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Code_archive[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int codeManagerSaveCodeArchive(java.lang.String archive_description, int archive_id, java.lang.String archive_name, com.omniture.www.Code_item[] code) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#CodeManager.SaveCodeArchive");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "CodeManager.SaveCodeArchive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {archive_description, new java.lang.Integer(archive_id), archive_name, code});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int companyCancelQueueItem(int qid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.CancelQueueItem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.CancelQueueItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(qid)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] companyDownloadProduct(com.omniture.www.ProductType productType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.DownloadProduct");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.DownloadProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String companyGetEndpoint(java.lang.String company) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.GetEndpoint");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.GetEndpoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {company});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Queue_item[] companyGetQueue() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.GetQueue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.GetQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Queue_item[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Queue_item[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Queue_item[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Simple_report_suites_rval companyGetReportSuites(java.lang.String[] rs_types, java.lang.String sp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.GetReportSuites");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.GetReportSuites"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rs_types, sp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Simple_report_suites_rval) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Simple_report_suites_rval) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Simple_report_suites_rval.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int companyGetTokenCount() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.GetTokenCount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.GetTokenCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Token_usage_container companyGetTokenUsage() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.GetTokenUsage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.GetTokenUsage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Token_usage_container) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Token_usage_container) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Token_usage_container.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Tracking_server_data companyGetTrackingServer(java.lang.String rsid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.GetTrackingServer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.GetTrackingServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Tracking_server_data) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Tracking_server_data) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Tracking_server_data.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int companyResetTokenCount(java.lang.String auth_key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Company.ResetTokenCount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Company.ResetTokenCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {auth_key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void dataSourceAppendDataBlock(int blockID, java.lang.String dataSourceID, java.lang.String endOfBlock, java.lang.String reportSuiteID, java.lang.String[][] rows, javax.xml.rpc.holders.IntHolder fileID, javax.xml.rpc.holders.StringHolder status) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.AppendDataBlock");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.AppendDataBlock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(blockID), dataSourceID, endOfBlock, reportSuiteID, rows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                fileID.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "fileID"))).intValue();
            } catch (java.lang.Exception _exception) {
                fileID.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "fileID")), int.class)).intValue();
            }
            try {
                status.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "status"));
            } catch (java.lang.Exception _exception) {
                status.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "status")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void dataSourceBeginDataBlock(java.lang.String blockName, java.lang.String[] columnNames, java.lang.String dataSourceID, java.lang.String endOfBlock, java.lang.String reportSuiteID, java.lang.String[][] rows, javax.xml.rpc.holders.IntHolder blockID, javax.xml.rpc.holders.IntHolder fileID, javax.xml.rpc.holders.StringHolder status) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.BeginDataBlock");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.BeginDataBlock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {blockName, columnNames, dataSourceID, endOfBlock, reportSuiteID, rows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                blockID.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "blockID"))).intValue();
            } catch (java.lang.Exception _exception) {
                blockID.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "blockID")), int.class)).intValue();
            }
            try {
                fileID.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "fileID"))).intValue();
            } catch (java.lang.Exception _exception) {
                fileID.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "fileID")), int.class)).intValue();
            }
            try {
                status.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "status"));
            } catch (java.lang.Exception _exception) {
                status.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "status")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Status dataSourceDeactivate(int dataSourceID, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.Deactivate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.Deactivate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dataSourceID), reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Status) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Status) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Status.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.FileIDResult dataSourceGetFileIDs(java.lang.String dataSourceID, java.lang.String filter, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.GetFileIDs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.GetFileIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSourceID, filter, reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.FileIDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.FileIDResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.FileIDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.DsFileStruct[] dataSourceGetFileInfo(java.lang.String dataSourceID, java.lang.String filter, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.GetFileInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.GetFileInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSourceID, filter, reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.DsFileStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.DsFileStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.DsFileStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.FileStatusResult dataSourceGetFileStatus(java.lang.String dataSourceFileID, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.GetFileStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.GetFileStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSourceFileID, reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.FileStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.FileStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.FileStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.SimpleDataSource[] dataSourceGetIDs(java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.GetIDs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.GetIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.SimpleDataSource[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.SimpleDataSource[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.SimpleDataSource[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.DataSourceInfo[] dataSourceGetInfo(java.lang.String filter, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.GetInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.GetInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filter, reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.DataSourceInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.DataSourceInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.DataSourceInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Status dataSourceProcessIncompleteVisits(int dataSourceID, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.ProcessIncompleteVisits");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.ProcessIncompleteVisits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dataSourceID), reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Status) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Status) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Status.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Status dataSourceRestart(int dataSourceID, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.Restart");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.Restart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dataSourceID), reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Status) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Status) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Status.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Ds_setup_result dataSourceSetupFull(int dataSourceID, com.omniture.www.Ds_full_settings dataSourceSettings, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.SetupFull");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.SetupFull"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dataSourceID), dataSourceSettings, reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Ds_setup_result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Ds_setup_result) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Ds_setup_result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Ds_setup_result dataSourceSetupGeneric(int dataSourceID, com.omniture.www.Ds_generic_settings dataSourceSettings, int dataSourceType, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.SetupGeneric");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.SetupGeneric"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dataSourceID), dataSourceSettings, new java.lang.Integer(dataSourceType), reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Ds_setup_result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Ds_setup_result) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Ds_setup_result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Ds_setup_result dataSourceSetupTraffic(int dataSourceID, com.omniture.www.Ds_traffic_settings dataSourceSettings, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.SetupTraffic");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.SetupTraffic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dataSourceID), dataSourceSettings, reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Ds_setup_result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Ds_setup_result) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Ds_setup_result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Ds_setup_result dataSourceSetupWebLog(int dataSourceID, com.omniture.www.Ds_weblog_settings dataSourceSettings, java.lang.String reportSuiteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataSource.SetupWebLog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataSource.SetupWebLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dataSourceID), dataSourceSettings, reportSuiteID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Ds_setup_result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Ds_setup_result) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Ds_setup_result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String dataWarehouseCancelRequest(int request_Id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.CancelRequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.CancelRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(request_Id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Data_warehouse_request dataWarehouseCheckRequest(int request_Id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.CheckRequest");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.CheckRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(request_Id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Data_warehouse_request) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Data_warehouse_request) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Data_warehouse_request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int dataWarehouseCreateSegment(java.lang.String rsid, com.omniture.www.Data_warehouse_segment segment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.CreateSegment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.CreateSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid, segment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Data_warehouse_report dataWarehouseGetReportData(int request_Id, java.lang.String rsid, int start_row) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.GetReportData");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.GetReportData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(request_Id), rsid, new java.lang.Integer(start_row)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Data_warehouse_report) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Data_warehouse_report) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Data_warehouse_report.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Data_warehouse_segment dataWarehouseGetSegment(java.lang.String rsid, int segment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.GetSegment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.GetSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid, new java.lang.Integer(segment)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Data_warehouse_segment) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Data_warehouse_segment) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Data_warehouse_segment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Dwsegment[] dataWarehouseGetSegments(java.lang.String rsid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.GetSegments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.GetSegments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Dwsegment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Dwsegment[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Dwsegment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int dataWarehouseReplaceSegment(int id, java.lang.String rsid, com.omniture.www.Data_warehouse_segment segment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.ReplaceSegment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.ReplaceSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id), rsid, segment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int dataWarehouseRequest(java.lang.String[] breakdown_List, java.lang.String contact_Name, java.lang.String contact_Phone, java.lang.String date_From, java.lang.String date_Granularity, java.lang.String date_Preset, java.lang.String date_To, java.lang.String date_Type, java.lang.String email_Subject, java.lang.String email_To, java.lang.String FTP_Dir, java.lang.String FTP_Host, java.lang.String FTP_Password, int FTP_Port, java.lang.String FTP_UserName, java.lang.String file_Name, java.lang.String[] metric_List, java.lang.String report_Description, java.lang.String report_Name, int segment_Id, java.lang.String rsid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.Request");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.Request"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {breakdown_List, contact_Name, contact_Phone, date_From, date_Granularity, date_Preset, date_To, date_Type, email_Subject, email_To, FTP_Dir, FTP_Host, FTP_Password, new java.lang.Integer(FTP_Port), FTP_UserName, file_Name, metric_List, report_Description, report_Name, new java.lang.Integer(segment_Id), rsid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean dataWarehouseVerifySegment(com.omniture.www.Data_warehouse_segment segment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DataWarehouse.VerifySegment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DataWarehouse.VerifySegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {segment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int deliveryListDelete(int dist_list_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DeliveryList.Delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DeliveryList.Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(dist_list_id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.PublishingList[] deliveryListGet(java.lang.String search_name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DeliveryList.Get");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DeliveryList.Get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {search_name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.PublishingList[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.PublishingList[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.PublishingList[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int deliveryListSave(java.lang.String delivery_list_name, int dist_list_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#DeliveryList.Save");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "DeliveryList.Save"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {delivery_list_name, new java.lang.Integer(dist_list_id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Segment_folder[] discoverGetSegments(java.util.Date end_date, java.lang.String rsid, java.util.Date start_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Discover.GetSegments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Discover.GetSegments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {end_date, rsid, start_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Segment_folder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Segment_folder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Segment_folder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportQueueResponse discoverQueueDiscoverOvertime(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Discover.QueueDiscoverOvertime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Discover.QueueDiscoverOvertime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportQueueResponse discoverQueueDiscoverRanked(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Discover.QueueDiscoverRanked");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Discover.QueueDiscoverRanked"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportQueueResponse discoverQueueDiscoverTrended(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Discover.QueueDiscoverTrended");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Discover.QueueDiscoverTrended"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Log_entry[] logsGetAdminConsoleCompanyLog(java.lang.String company, java.util.Date end_date, com.omniture.www.Log_rule_operators filter_rule, com.omniture.www.Log_filter[] filters, java.lang.String[] rsid_list, java.util.Date start_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Logs.GetAdminConsoleCompanyLog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Logs.GetAdminConsoleCompanyLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {company, end_date, filter_rule, filters, rsid_list, start_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Log_entry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Log_entry[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Log_entry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Log_entry[] logsGetAdminConsoleLog(java.lang.String company, java.util.Date end_date, com.omniture.www.Log_rule_operators filter_rule, com.omniture.www.Log_filter[] filters, java.lang.String[] rsid_list, java.util.Date start_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Logs.GetAdminConsoleLog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Logs.GetAdminConsoleLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {company, end_date, filter_rule, filters, rsid_list, start_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Log_entry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Log_entry[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Log_entry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int permissionsAddLogin(int admin, int change_password, int create_dashboards, java.lang.String dashboard_rsid, java.lang.String email, java.lang.String first_name, java.lang.String last_name, java.lang.String login, java.lang.String password, java.lang.String phone_number, com.omniture.www.Permission_group[] selected_group_list, int temp_login, java.util.Date temp_login_end, java.util.Date temp_login_start, java.lang.String title) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.AddLogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.AddLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(admin), new java.lang.Integer(change_password), new java.lang.Integer(create_dashboards), dashboard_rsid, email, first_name, last_name, login, password, phone_number, selected_group_list, new java.lang.Integer(temp_login), temp_login_end, temp_login_start, title});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean permissionsAuthenticate(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.Authenticate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.Authenticate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int permissionsDeleteGroup(java.lang.String groupid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.DeleteGroup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.DeleteGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {groupid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int permissionsDeleteLogin(java.lang.String login) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.DeleteLogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.DeleteLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Crm_info permissionsGetCRMInfo(java.lang.String company, java.lang.String login) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetCRMInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetCRMInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {company, login});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Crm_info) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Crm_info) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Crm_info.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Parent_category[] permissionsGetCategories(int categoryid, int groupid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetCategories");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(categoryid), new java.lang.Integer(groupid)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Parent_category[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Parent_category[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Parent_category[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Group_data permissionsGetGroup(int group_type, java.lang.String groupid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetGroup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(group_type), groupid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Group_data) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Group_data) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Group_data.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Permission_group[] permissionsGetGroups(java.lang.String field, java.lang.String search) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetGroups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {field, search});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Permission_group[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Permission_group[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Permission_group[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Login permissionsGetLogin(java.lang.String login) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetLogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Login) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Login) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Login.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Perm_login[] permissionsGetLogins(java.lang.String login_search_field, java.lang.String login_search_value) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetLogins");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetLogins"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login_search_field, login_search_value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Perm_login[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Perm_login[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Perm_login[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportBuilderLogin permissionsGetReportBuilderLogin() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetReportBuilderLogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetReportBuilderLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportBuilderLogin) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportBuilderLogin) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportBuilderLogin.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Permissions_account[] permissionsGetReportSuiteGroupCount(java.lang.String search_field, java.lang.String search_val) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetReportSuiteGroupCount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetReportSuiteGroupCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {search_field, search_val});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Permissions_account[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Permissions_account[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Permissions_account[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Permissions_account_groups permissionsGetReportSuiteGroups(java.lang.String rsid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.GetReportSuiteGroups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.GetReportSuiteGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Permissions_account_groups) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Permissions_account_groups) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Permissions_account_groups.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String permissionsHasPrivilege(java.lang.String privilegeToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.HasPrivilege");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.HasPrivilege"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {privilegeToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int permissionsSaveGroup(java.lang.String group_description, java.lang.String group_name, int group_type, java.lang.String groupid, com.omniture.www.Perm_data[] perm_info, com.omniture.www.Report_categories report_access_list, int[] report_id_list, java.lang.String[] rsid_list, java.lang.String[] user_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.SaveGroup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.SaveGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {group_description, group_name, new java.lang.Integer(group_type), groupid, perm_info, report_access_list, report_id_list, rsid_list, user_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int permissionsSaveLogin(int admin, int change_password, java.lang.String email, java.lang.String first_name, java.lang.String last_name, java.lang.String login, java.lang.String password, java.lang.String phone_number, com.omniture.www.Permission_group[] selected_group_list, java.lang.String send_welcome_email, java.util.Date temp_end_date, int temp_login, java.util.Date temp_start_date, java.lang.String title) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.SaveLogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.SaveLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(admin), new java.lang.Integer(change_password), email, first_name, last_name, login, password, phone_number, selected_group_list, send_welcome_email, temp_end_date, new java.lang.Integer(temp_login), temp_start_date, title});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int permissionsSaveReportSuiteGroups(java.lang.String rsid, int[] selected_groups) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Permissions.SaveReportSuiteGroups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Permissions.SaveReportSuiteGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid, selected_groups});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportCancelReport(int reportID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.CancelReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.CancelReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(reportID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_element_mapping[] reportGetElementNames(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.GetElementNames");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.GetElementNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_element_mapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_element_mapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_element_mapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportResponse reportGetReport(int reportID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.GetReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.GetReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(reportID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_queue_item[] reportGetReportQueue() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.GetReportQueue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.GetReportQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_queue_item[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_queue_item[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_queue_item[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_status reportGetStatus(int reportID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.GetStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.GetStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(reportID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_status) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_status) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_status.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportQueueResponse reportQueueOvertime(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.QueueOvertime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.QueueOvertime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportQueueResponse reportQueueRanked(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.QueueRanked");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.QueueRanked"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportQueueResponse reportQueueSCMRanked(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.QueueSCMRanked");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.QueueSCMRanked"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ReportQueueResponse reportQueueTrended(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Report.QueueTrended");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Report.QueueTrended"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reportDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ReportQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ReportQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ReportQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteAddCorrelations(int[] rel_ids, java.lang.String[] rsid_list, com.omniture.www.Correlation_size_enum size) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.AddCorrelations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.AddCorrelations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rel_ids, rsid_list, size});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteAddInternalURLFilters(java.lang.String[] filters, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.AddInternalURLFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.AddInternalURLFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filters, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteAddKeyVisitors(java.lang.String[] key_visitors, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.AddKeyVisitors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.AddKeyVisitors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {key_visitors, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Saved_filter[] reportSuiteAddSavedFilters(com.omniture.www.Saved_filter[] savedFilters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.AddSavedFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.AddSavedFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {savedFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Saved_filter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Saved_filter[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Saved_filter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteCreate(java.lang.String base_currency, java.lang.String base_url, java.lang.String default_page, java.lang.String duplicate_rsid, java.util.Date go_live_date, int hits_per_day, int latin1, java.lang.String rsid, java.lang.String site_title, com.omniture.www.Timezone_enum time_zone) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.Create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {base_currency, base_url, default_page, duplicate_rsid, go_live_date, new java.lang.Integer(hits_per_day), new java.lang.Integer(latin1), rsid, site_title, time_zone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteDeleteBaseURL(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteBaseURL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteBaseURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteDeleteCalculatedMetrics(com.omniture.www.Calculated_metric[] calculated_metrics, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteCalculatedMetrics");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteCalculatedMetrics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calculated_metrics, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteDeleteClassifications(com.omniture.www.Classification_view c_view, int div_num, int parent_div_num, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteClassifications");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteClassifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {c_view, new java.lang.Integer(div_num), new java.lang.Integer(parent_div_num), rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteDeleteCorrelations(int[] rel_ids, java.lang.String[] rsid_list, com.omniture.www.Correlation_size_enum size) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteCorrelations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteCorrelations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rel_ids, rsid_list, size});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteDeleteDefaultPage(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteDefaultPage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteDefaultPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteDeleteIPAddressExclusions(java.lang.String[] ip_list, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteIPAddressExclusions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteIPAddressExclusions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ip_list, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteDeleteInternalURLFilters(java.lang.String[] filters, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteInternalURLFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteInternalURLFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filters, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteDeleteKeyVisitors(java.lang.String[] key_visitors, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteKeyVisitors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteKeyVisitors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {key_visitors, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteDeleteMarketingChannelCost(int cost_group, java.lang.String id, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteMarketingChannelCost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteMarketingChannelCost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(cost_group), id, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteDeleteMarketingChannels(int[] channel_ids, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteMarketingChannels");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteMarketingChannels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {channel_ids, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteDeletePages(int[] page_id_list, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeletePages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeletePages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {page_id_list, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteDeletePaidSearch(java.lang.String filter, java.lang.String[] rsid_list, int rule, int search_engine) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeletePaidSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeletePaidSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filter, rsid_list, new java.lang.Integer(rule), new java.lang.Integer(search_engine)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteDeleteSavedFilter(int[] savedFilterIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.DeleteSavedFilter");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.DeleteSavedFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {savedFilterIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_activation[] reportSuiteGetActivation(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetActivation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_activation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_activation[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_activation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_elements[] reportSuiteGetAvailableElements(int return_datawarehouse_elements, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetAvailableElements");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetAvailableElements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(return_datawarehouse_elements), rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_elements[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_elements[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_elements[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_metrics[] reportSuiteGetAvailableMetrics(int return_datawarehouse_metrics, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetAvailableMetrics");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetAvailableMetrics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(return_datawarehouse_metrics), rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_metrics[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_metrics[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_metrics[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_base_currency[] reportSuiteGetBaseCurrency(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetBaseCurrency");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetBaseCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_base_currency[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_base_currency[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_base_currency[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_base_url[] reportSuiteGetBaseURL(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetBaseURL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetBaseURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_base_url[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_base_url[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_base_url[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_calculated_metric[] reportSuiteGetCalculatedMetrics(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetCalculatedMetrics");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetCalculatedMetrics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_calculated_metric[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_calculated_metric[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_calculated_metric[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_hierarchies[] reportSuiteGetClassificationHierarchies(java.lang.String c_view, java.lang.String[] rel_id, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetClassificationHierarchies");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetClassificationHierarchies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {c_view, rel_id, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_hierarchies[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_hierarchies[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_hierarchies[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_classification[] reportSuiteGetClassifications(java.lang.String c_view, java.lang.String[] rel_id, java.lang.String[] rsid_list, java.lang.String type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetClassifications");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetClassifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {c_view, rel_id, rsid_list, type});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_classification[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_classification[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_classification[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_correlation[] reportSuiteGetCorrelations(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetCorrelations");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetCorrelations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_correlation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_correlation[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_correlation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_custom_calendar[] reportSuiteGetCustomCalendar(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetCustomCalendar");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetCustomCalendar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_custom_calendar[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_custom_calendar[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_custom_calendar[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_default_page[] reportSuiteGetDefaultPage(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetDefaultPage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetDefaultPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_default_page[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_default_page[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_default_page[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_evar[] reportSuiteGetEVars(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetEVars");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetEVars"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_evar[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_evar[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_evar[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_ecommerce[] reportSuiteGetEcommerce(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetEcommerce");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetEcommerce"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_ecommerce[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_ecommerce[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_ecommerce[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_finding_method[] reportSuiteGetFindingMethods(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetFindingMethods");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetFindingMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_finding_method[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_finding_method[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_finding_method[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_ip_exclusions[] reportSuiteGetIPAddressExclusions(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetIPAddressExclusions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetIPAddressExclusions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_ip_exclusions[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_ip_exclusions[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_ip_exclusions[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_ip_obfuscation[] reportSuiteGetIPObfuscation(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetIPObfuscation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetIPObfuscation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_ip_obfuscation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_ip_obfuscation[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_ip_obfuscation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_internal_url_filter[] reportSuiteGetInternalURLFilters(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetInternalURLFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetInternalURLFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_internal_url_filter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_internal_url_filter[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_internal_url_filter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_key_visitor[] reportSuiteGetKeyVisitors(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetKeyVisitors");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetKeyVisitors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_key_visitor[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_key_visitor[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_key_visitor[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_localization[] reportSuiteGetLocalization(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetLocalization");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetLocalization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_localization[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_localization[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_localization[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_costs[] reportSuiteGetMarketingChannelCost(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetMarketingChannelCost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetMarketingChannelCost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_costs[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_costs[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_costs[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Expiration_event[] reportSuiteGetMarketingChannelExpiration(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetMarketingChannelExpiration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetMarketingChannelExpiration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Expiration_event[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Expiration_event[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Expiration_event[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Rs_mchannel_rulesets[] reportSuiteGetMarketingChannelRules(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetMarketingChannelRules");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetMarketingChannelRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Rs_mchannel_rulesets[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Rs_mchannel_rulesets[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Rs_mchannel_rulesets[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Mchannels[] reportSuiteGetMarketingChannels(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetMarketingChannels");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetMarketingChannels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Mchannels[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Mchannels[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Mchannels[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_pages[] reportSuiteGetPages(int limit, java.lang.String page_search, java.lang.String[] rsid_list, java.util.Date sc_period, int start_point) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetPages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(limit), page_search, rsid_list, sc_period, new java.lang.Integer(start_point)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_pages[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_pages[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_pages[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_paid_search[] reportSuiteGetPaidSearch(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetPaidSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetPaidSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_paid_search[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_paid_search[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_paid_search[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Permanent_traffic[] reportSuiteGetPermanentTraffic(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetPermanentTraffic");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetPermanentTraffic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Permanent_traffic[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Permanent_traffic[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Permanent_traffic[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_processing_status[] reportSuiteGetProcessingStatus(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetProcessingStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetProcessingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_processing_status[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_processing_status[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_processing_status[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Rollup[] reportSuiteGetRollups() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetRollups");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetRollups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Rollup[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Rollup[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Rollup[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Saved_filter[] reportSuiteGetSavedFilters() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetSavedFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetSavedFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Saved_filter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Saved_filter[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Saved_filter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Schedule_spike[] reportSuiteGetScheduledSpike(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetScheduledSpike");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetScheduledSpike"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Schedule_spike[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Schedule_spike[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Schedule_spike[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_settings[] reportSuiteGetSettings(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetSettings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_settings[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_settings[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_settings[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_site_title[] reportSuiteGetSiteTitle(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetSiteTitle");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetSiteTitle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_site_title[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_site_title[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_site_title[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_event[] reportSuiteGetSuccessEvents(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetSuccessEvents");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetSuccessEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_event[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_event[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_event[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_template[] reportSuiteGetTemplate(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetTemplate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_template[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_template[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_template[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_time_zone[] reportSuiteGetTimeZone(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetTimeZone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetTimeZone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_time_zone[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_time_zone[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_time_zone[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_traffic_var[] reportSuiteGetTrafficVars(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetTrafficVars");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetTrafficVars"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_traffic_var[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_traffic_var[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_traffic_var[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_ui_element[] reportSuiteGetUIVisibility(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetUIVisibility");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetUIVisibility"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_ui_element[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_ui_element[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_ui_element[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_unique_visitor_variable[] reportSuiteGetUniqueVisitorVariable(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetUniqueVisitorVariable");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetUniqueVisitorVariable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_unique_visitor_variable[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_unique_visitor_variable[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_unique_visitor_variable[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Report_suite_video_tracking[] reportSuiteGetVideoTracking(java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.GetVideoTracking");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.GetVideoTracking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Report_suite_video_tracking[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Report_suite_video_tracking[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Report_suite_video_tracking[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveBaseCurrency(java.lang.String base_currency, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveBaseCurrency");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveBaseCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {base_currency, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveBaseURL(java.lang.String base_url, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveBaseURL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveBaseURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {base_url, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveCalculatedMetrics(com.omniture.www.Calculated_metric[] calculated_metrics, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveCalculatedMetrics");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveCalculatedMetrics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {calculated_metrics, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveClassificationHierarchies(java.lang.String[] c_options, com.omniture.www.Classification_view c_view, int camp_view, int div_num, java.lang.String name, int parent_div_num, java.lang.String[] rsid_list, com.omniture.www.Classification_type type, int update) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveClassificationHierarchies");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveClassificationHierarchies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {c_options, c_view, new java.lang.Integer(camp_view), new java.lang.Integer(div_num), name, new java.lang.Integer(parent_div_num), rsid_list, type, new java.lang.Integer(update)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveClassifications(java.lang.String[] c_options, com.omniture.www.Classification_view c_view, int camp_view, int div_num, java.lang.String name, int parent_div_num, java.lang.String[] rsid_list, com.omniture.www.Classification_type type, int update) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveClassifications");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveClassifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {c_options, c_view, new java.lang.Integer(camp_view), new java.lang.Integer(div_num), name, new java.lang.Integer(parent_div_num), rsid_list, type, new java.lang.Integer(update)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveCustomCalendar(java.util.Date anchor_date, int cal_type, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveCustomCalendar");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveCustomCalendar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {anchor_date, new java.lang.Integer(cal_type), rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveDefaultPage(java.lang.String default_page, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveDefaultPage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveDefaultPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {default_page, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveEVars(com.omniture.www.Evar[] evars, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveEVars");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveEVars"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {evars, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveEcommerce(int ecommerce, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveEcommerce");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveEcommerce"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(ecommerce), rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveFindingMethods(com.omniture.www.Finding_method[] reports, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveFindingMethods");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveFindingMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reports, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveIPAddressExclusions(java.lang.String[] ip_list, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveIPAddressExclusions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveIPAddressExclusions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ip_list, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveIPObfuscation(int ip_obfuscation, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveIPObfuscation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveIPObfuscation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(ip_obfuscation), rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveMarketingChannelCost(com.omniture.www.Cost_item cost_item, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveMarketingChannelCost");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveMarketingChannelCost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cost_item, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveMarketingChannelExpiration(int days, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveMarketingChannelExpiration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveMarketingChannelExpiration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(days), rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveMarketingChannelRules(com.omniture.www.Mchannel_ruleset[] mchannel_rules, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveMarketingChannelRules");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveMarketingChannelRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mchannel_rules, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveMarketingChannels(com.omniture.www.Mchannel[] channels, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveMarketingChannels");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveMarketingChannels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {channels, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSavePaidSearch(java.lang.String filter, java.lang.String[] rsid_list, java.lang.String rule, int search_engine) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SavePaidSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SavePaidSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filter, rsid_list, rule, new java.lang.Integer(search_engine)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSavePermanentTraffic(int new_hits_per_day, java.lang.String[] rsid_list, java.util.Date start_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SavePermanentTraffic");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SavePermanentTraffic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(new_hits_per_day), rsid_list, start_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveRollup(java.util.Date go_live_date, java.lang.String[] rollup_rsids, java.lang.String rsid, com.omniture.www.Timezone_enum time_zone) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveRollup");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveRollup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {go_live_date, rollup_rsids, rsid, time_zone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Saved_filter[] reportSuiteSaveSavedFilters(com.omniture.www.Saved_filter[] savedFilters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveSavedFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveSavedFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {savedFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Saved_filter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Saved_filter[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Saved_filter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveScheduledSpike(java.util.Date end_date, java.lang.String[] rsid_list, int spike_hits_per_day, java.util.Date start_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveScheduledSpike");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveScheduledSpike"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {end_date, rsid_list, new java.lang.Integer(spike_hits_per_day), start_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveSiteTitle(java.lang.String[] rsid_list, java.lang.String site_title) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveSiteTitle");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveSiteTitle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list, site_title});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveSuccessEvents(com.omniture.www.Event[] events, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveSuccessEvents");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveSuccessEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {events, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveTimeZone(java.lang.String[] rsid_list, com.omniture.www.Timezone_enum time_zone) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveTimeZone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveTimeZone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list, time_zone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveTrafficVars(com.omniture.www.Traffic_var[] property, java.lang.String[] rsid_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveTrafficVars");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveTrafficVars"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {property, rsid_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean reportSuiteSaveUIVisibility(java.lang.String[] rsid_list, int state, java.lang.String ui_element) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveUIVisibility");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveUIVisibility"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list, new java.lang.Integer(state), ui_element});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reportSuiteSaveUniqueVisitorVariable(java.lang.String[] rsid_list, java.lang.String unique_visitor_variable) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#ReportSuite.SaveUniqueVisitorVariable");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "ReportSuite.SaveUniqueVisitorVariable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rsid_list, unique_visitor_variable});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Saintresult[] saintCheckJobStatus(int job_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.CheckJobStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.CheckJobStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(job_id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Saintresult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Saintresult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Saintresult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String saintExportCreateJob(java.lang.String campaign_filter_begin_range, java.lang.String campaign_filter_end_range, int campaign_filter_option, java.lang.String date_filter_row_end_date, java.lang.String date_filter_row_start_date, java.lang.String email_address, java.lang.String encoding, int relation_id, java.lang.String[] report_suite_array, java.lang.String row_match_filter_empty_column_name, java.lang.String row_match_filter_match_column_name, java.lang.String row_match_filter_match_column_value, int select_all_rows, int select_number_of_rows) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.ExportCreateJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.ExportCreateJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {campaign_filter_begin_range, campaign_filter_end_range, new java.lang.Integer(campaign_filter_option), date_filter_row_end_date, date_filter_row_start_date, email_address, encoding, new java.lang.Integer(relation_id), report_suite_array, row_match_filter_empty_column_name, row_match_filter_match_column_name, row_match_filter_match_column_value, new java.lang.Integer(select_all_rows), new java.lang.Integer(select_number_of_rows)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Pagedetail[] saintExportGetFileSegment(int file_id, int segment_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.ExportGetFileSegment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.ExportGetFileSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(file_id), new java.lang.Integer(segment_id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Pagedetail[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Pagedetail[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Pagedetail[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Compatability[] saintGetCompatabiltyMetrics(java.lang.String[] report_suite_array) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.GetCompatabiltyMetrics");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.GetCompatabiltyMetrics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {report_suite_array});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Compatability[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Compatability[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Compatability[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.Export_filter[] saintGetFilters(int relation_id, java.lang.String[] report_suite_array) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.GetFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.GetFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(relation_id), report_suite_array});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.Export_filter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.Export_filter[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.Export_filter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String saintImportCommitJob(int job_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.ImportCommitJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.ImportCommitJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(job_id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saintImportCreateJob(int check_divisions, java.lang.String description, java.lang.String email_address, int export_results, java.lang.String[] header, int overwrite_conflicts, int relation_id, java.lang.String[] report_suite_array) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.ImportCreateJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.ImportCreateJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(check_divisions), description, email_address, new java.lang.Integer(export_results), header, new java.lang.Integer(overwrite_conflicts), new java.lang.Integer(relation_id), report_suite_array});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String saintImportPopulateJob(int job_id, int page, com.omniture.www.Row[] rows) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Saint.ImportPopulateJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Saint.ImportPopulateJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(job_id), new java.lang.Integer(page), rows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ScheduledReport schedulingCreatePublishedReport(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product, com.omniture.www.ScheduledReport scheduledReport, byte[] workbook) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.CreatePublishedReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.CreatePublishedReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, product, scheduledReport, workbook});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ScheduledReport) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ScheduledReport) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ScheduledReport.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean schedulingDeletePublishedReport(com.omniture.www.ProductType product, int[] scheduledReportIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.DeletePublishedReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.DeletePublishedReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {product, scheduledReportIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean schedulingDeleteWorkbook(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product, java.lang.String username, java.lang.String[] workbookNames) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.DeleteWorkbook");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.DeleteWorkbook"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, product, username, workbookNames});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] schedulingDownloadWorkbook(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType productType, java.lang.String username, java.lang.String workbookName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.DownloadWorkbook");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.DownloadWorkbook"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, productType, username, workbookName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ScheduledReport[] schedulingGetPublishedReports(com.omniture.www.ProductType product, java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.GetPublishedReports");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.GetPublishedReports"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {product, username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ScheduledReport[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ScheduledReport[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ScheduledReport[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ScheduleLog[] schedulingGetReportsRunHistory(int limit, int offset, com.omniture.www.ProductType product, java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.GetReportsRunHistory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.GetReportsRunHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(limit), new java.lang.Integer(offset), product, username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ScheduleLog[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ScheduleLog[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ScheduleLog[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ExcelWorkbook[] schedulingGetWorkbookList(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.GetWorkbookList");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.GetWorkbookList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location, product});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ExcelWorkbook[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ExcelWorkbook[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ExcelWorkbook[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean schedulingReRunReport(int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.ReRunReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.ReRunReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.omniture.www.ScheduledReport schedulingUpdatePublishedReport(com.omniture.www.ProductType product, com.omniture.www.ScheduledReport scheduledReport, byte[] workbook) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.UpdatePublishedReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.UpdatePublishedReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {product, scheduledReport, workbook});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.omniture.www.ScheduledReport) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.omniture.www.ScheduledReport) org.apache.axis.utils.JavaUtils.convert(_resp, com.omniture.www.ScheduledReport.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean schedulingUploadWorkbook(java.lang.String description, java.lang.String filename, com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product, byte[] workbook) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.omniture.com/#Scheduling.UploadWorkbook");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.omniture.com/", "Scheduling.UploadWorkbook"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {description, filename, location, product, workbook});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
