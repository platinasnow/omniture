/**
 * OmnitureWebServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public interface OmnitureWebServicePortType extends java.rmi.Remote {

    /**
     * Delete page code.
     */
    public int codeManagerDeleteCodeArchive(int archive_id) throws java.rmi.RemoteException;

    /**
     * Generates page code.
     */
    public com.omniture.www.Code_item[] codeManagerGenerateCode(java.lang.String char_set, java.lang.String code_type, int cookie_domain_periods, java.lang.String currency_code, java.lang.String rsid, int secure) throws java.rmi.RemoteException;

    /**
     * Returns a list of existing code archives.
     */
    public com.omniture.www.Code_archive[] codeManagerGetCodeArchives(int[] archive_id_list, java.lang.String binary_encoding, int populate_code_items) throws java.rmi.RemoteException;

    /**
     * Saves a page code archive.
     */
    public int codeManagerSaveCodeArchive(java.lang.String archive_description, int archive_id, java.lang.String archive_name, com.omniture.www.Code_item[] code) throws java.rmi.RemoteException;

    /**
     * Cancel a pending (queued) action that has yet to be approved.
     */
    public int companyCancelQueueItem(int qid) throws java.rmi.RemoteException;

    /**
     * Downloads a product. (Internal use only.)
     */
    public byte[] companyDownloadProduct(com.omniture.www.ProductType productType) throws java.rmi.RemoteException;

    /**
     * Returns the correct SOAP endpoint to be used for API calls
     */
    public java.lang.String companyGetEndpoint(java.lang.String company) throws java.rmi.RemoteException;

    /**
     * Returns queued items that are pending approval for the requesting
     * company.
     */
    public com.omniture.www.Queue_item[] companyGetQueue() throws java.rmi.RemoteException;

    /**
     * Retrieves all report suites associated with your company.
     */
    public com.omniture.www.Simple_report_suites_rval companyGetReportSuites(java.lang.String[] rs_types, java.lang.String sp) throws java.rmi.RemoteException;

    /**
     * Returns remaining tokens for a given auth key (note that this
     * call also consumes a token).
     */
    public int companyGetTokenCount() throws java.rmi.RemoteException;

    /**
     * Returns token usage information (note that this call also consumes
     * a token).
     */
    public com.omniture.www.Token_usage_container companyGetTokenUsage() throws java.rmi.RemoteException;

    /**
     * Returns the tracking server and namespace for the given report
     * suite
     */
    public com.omniture.www.Tracking_server_data companyGetTrackingServer(java.lang.String rsid) throws java.rmi.RemoteException;

    /**
     * Resets the token count for the given auth key.
     */
    public int companyResetTokenCount(java.lang.String auth_key) throws java.rmi.RemoteException;

    /**
     * Add rows of data to and optionally end a block of data begun
     * by a BeginDataBlock call
     */
    public void dataSourceAppendDataBlock(int blockID, java.lang.String dataSourceID, java.lang.String endOfBlock, java.lang.String reportSuiteID, java.lang.String[][] rows, javax.xml.rpc.holders.IntHolder fileID, javax.xml.rpc.holders.StringHolder status) throws java.rmi.RemoteException;

    /**
     * Begin and optionally end a block of data to be inserted into
     * the Data Sources processing queue
     */
    public void dataSourceBeginDataBlock(java.lang.String blockName, java.lang.String[] columnNames, java.lang.String dataSourceID, java.lang.String endOfBlock, java.lang.String reportSuiteID, java.lang.String[][] rows, javax.xml.rpc.holders.IntHolder blockID, javax.xml.rpc.holders.IntHolder fileID, javax.xml.rpc.holders.StringHolder status) throws java.rmi.RemoteException;

    /**
     * Deactivates a Data Source.
     */
    public com.omniture.www.Status dataSourceDeactivate(int dataSourceID, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Returns array of file ids for a given data source id.
     */
    public com.omniture.www.FileIDResult dataSourceGetFileIDs(java.lang.String dataSourceID, java.lang.String filter, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Returns dataSource file status information.
     */
    public com.omniture.www.DsFileStruct[] dataSourceGetFileInfo(java.lang.String dataSourceID, java.lang.String filter, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Returns dataSource file status information.
     */
    public com.omniture.www.FileStatusResult dataSourceGetFileStatus(java.lang.String dataSourceFileID, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Returns a list of data sources that belong to the specified
     * report suite.
     */
    public com.omniture.www.SimpleDataSource[] dataSourceGetIDs(java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Returns dataSource file status information.
     */
    public com.omniture.www.DataSourceInfo[] dataSourceGetInfo(java.lang.String filter, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Processes incomplete visits for a DataSource
     */
    public com.omniture.www.Status dataSourceProcessIncompleteVisits(int dataSourceID, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Sets DataSource file state to processing.
     */
    public com.omniture.www.Status dataSourceRestart(int dataSourceID, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Creates or modifies a Full Data Source.
     */
    public com.omniture.www.Ds_setup_result dataSourceSetupFull(int dataSourceID, com.omniture.www.Ds_full_settings dataSourceSettings, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Creates or modifies a Generic Data Source.
     */
    public com.omniture.www.Ds_setup_result dataSourceSetupGeneric(int dataSourceID, com.omniture.www.Ds_generic_settings dataSourceSettings, int dataSourceType, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Creates or modifies a Traffic Data Source.
     */
    public com.omniture.www.Ds_setup_result dataSourceSetupTraffic(int dataSourceID, com.omniture.www.Ds_traffic_settings dataSourceSettings, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Creates or modifies a Webserver Log Data Source.
     */
    public com.omniture.www.Ds_setup_result dataSourceSetupWebLog(int dataSourceID, com.omniture.www.Ds_weblog_settings dataSourceSettings, java.lang.String reportSuiteID) throws java.rmi.RemoteException;

    /**
     * Cancels a Data Warehouse Request.
     */
    public java.lang.String dataWarehouseCancelRequest(int request_Id) throws java.rmi.RemoteException;

    /**
     * Checks the status of a Data Warehouse Request.
     */
    public com.omniture.www.Data_warehouse_request dataWarehouseCheckRequest(int request_Id) throws java.rmi.RemoteException;

    /**
     * Create a new data warehouse segment
     */
    public int dataWarehouseCreateSegment(java.lang.String rsid, com.omniture.www.Data_warehouse_segment segment) throws java.rmi.RemoteException;

    /**
     * Obtain content for the given request
     */
    public com.omniture.www.Data_warehouse_report dataWarehouseGetReportData(int request_Id, java.lang.String rsid, int start_row) throws java.rmi.RemoteException;

    /**
     * Obtain a description of an existing data warehouse segment
     */
    public com.omniture.www.Data_warehouse_segment dataWarehouseGetSegment(java.lang.String rsid, int segment) throws java.rmi.RemoteException;

    /**
     * Gets available segments.
     */
    public com.omniture.www.Dwsegment[] dataWarehouseGetSegments(java.lang.String rsid) throws java.rmi.RemoteException;

    /**
     * Replace a data warehouse segment of the given id with the given
     * segment.
     */
    public int dataWarehouseReplaceSegment(int id, java.lang.String rsid, com.omniture.www.Data_warehouse_segment segment) throws java.rmi.RemoteException;

    /**
     * Creates a Data Warehouse Request.
     */
    public int dataWarehouseRequest(java.lang.String[] breakdown_List, java.lang.String contact_Name, java.lang.String contact_Phone, java.lang.String date_From, java.lang.String date_Granularity, java.lang.String date_Preset, java.lang.String date_To, java.lang.String date_Type, java.lang.String email_Subject, java.lang.String email_To, java.lang.String FTP_Dir, java.lang.String FTP_Host, java.lang.String FTP_Password, int FTP_Port, java.lang.String FTP_UserName, java.lang.String file_Name, java.lang.String[] metric_List, java.lang.String report_Description, java.lang.String report_Name, int segment_Id, java.lang.String rsid) throws java.rmi.RemoteException;

    /**
     * Verify the correctness of the given data warehouse segment
     */
    public boolean dataWarehouseVerifySegment(com.omniture.www.Data_warehouse_segment segment) throws java.rmi.RemoteException;

    /**
     * Delete a distribution list.
     */
    public int deliveryListDelete(int dist_list_id) throws java.rmi.RemoteException;

    /**
     * Gets Publishing list.
     */
    public com.omniture.www.PublishingList[] deliveryListGet(java.lang.String search_name) throws java.rmi.RemoteException;

    /**
     * Save delivery list.
     */
    public int deliveryListSave(java.lang.String delivery_list_name, int dist_list_id) throws java.rmi.RemoteException;

    /**
     * Retrieve a list of Discover segments for a given report suite.
     */
    public com.omniture.www.Segment_folder[] discoverGetSegments(java.util.Date end_date, java.lang.String rsid, java.util.Date start_date) throws java.rmi.RemoteException;

    /**
     * Queue a Discover overtime report.
     */
    public com.omniture.www.ReportQueueResponse discoverQueueDiscoverOvertime(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Queue a Discover ranked report.
     */
    public com.omniture.www.ReportQueueResponse discoverQueueDiscoverRanked(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Queue a Discover trended report.
     */
    public com.omniture.www.ReportQueueResponse discoverQueueDiscoverTrended(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Get console logs.
     */
    public com.omniture.www.Log_entry[] logsGetAdminConsoleCompanyLog(java.lang.String company, java.util.Date end_date, com.omniture.www.Log_rule_operators filter_rule, com.omniture.www.Log_filter[] filters, java.lang.String[] rsid_list, java.util.Date start_date) throws java.rmi.RemoteException;

    /**
     * Get console logs.
     */
    public com.omniture.www.Log_entry[] logsGetAdminConsoleLog(java.lang.String company, java.util.Date end_date, com.omniture.www.Log_rule_operators filter_rule, com.omniture.www.Log_filter[] filters, java.lang.String[] rsid_list, java.util.Date start_date) throws java.rmi.RemoteException;

    /**
     * Creates a new login for the company.
     */
    public int permissionsAddLogin(int admin, int change_password, int create_dashboards, java.lang.String dashboard_rsid, java.lang.String email, java.lang.String first_name, java.lang.String last_name, java.lang.String login, java.lang.String password, java.lang.String phone_number, com.omniture.www.Permission_group[] selected_group_list, int temp_login, java.util.Date temp_login_end, java.util.Date temp_login_start, java.lang.String title) throws java.rmi.RemoteException;

    /**
     * Indicates whether or not the login is valid for this company.
     */
    public boolean permissionsAuthenticate(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Removes the requested group from the company.
     */
    public int permissionsDeleteGroup(java.lang.String groupid) throws java.rmi.RemoteException;

    /**
     * Removes a user login from the company.
     */
    public int permissionsDeleteLogin(java.lang.String login) throws java.rmi.RemoteException;

    /**
     * Retrieves CRM login information for a specific user.
     */
    public com.omniture.www.Crm_info permissionsGetCRMInfo(java.lang.String company, java.lang.String login) throws java.rmi.RemoteException;

    /**
     * Retrieves subgroups for a category.
     */
    public com.omniture.www.Parent_category[] permissionsGetCategories(int categoryid, int groupid) throws java.rmi.RemoteException;

    /**
     * Retrieves information about a particular group.
     */
    public com.omniture.www.Group_data permissionsGetGroup(int group_type, java.lang.String groupid) throws java.rmi.RemoteException;

    /**
     * Retrieves all available groups for the company.
     */
    public com.omniture.www.Permission_group[] permissionsGetGroups(java.lang.String field, java.lang.String search) throws java.rmi.RemoteException;

    /**
     * Retrieves a user login for the company.
     */
    public com.omniture.www.Login permissionsGetLogin(java.lang.String login) throws java.rmi.RemoteException;

    /**
     * Retrieves user logins for the company.
     */
    public com.omniture.www.Perm_login[] permissionsGetLogins(java.lang.String login_search_field, java.lang.String login_search_value) throws java.rmi.RemoteException;

    /**
     * ReportBuilder login (Internal use only.)
     */
    public com.omniture.www.ReportBuilderLogin permissionsGetReportBuilderLogin() throws java.rmi.RemoteException;

    /**
     * Retrieves all available accounts for the company.
     */
    public com.omniture.www.Permissions_account[] permissionsGetReportSuiteGroupCount(java.lang.String search_field, java.lang.String search_val) throws java.rmi.RemoteException;

    /**
     * Returns the groups that this report suite is a part of.
     */
    public com.omniture.www.Permissions_account_groups permissionsGetReportSuiteGroups(java.lang.String rsid) throws java.rmi.RemoteException;

    /**
     * Determines if the current user has the given privilegeToken
     */
    public java.lang.String permissionsHasPrivilege(java.lang.String privilegeToken) throws java.rmi.RemoteException;

    /**
     * Saves group setting - if the group does not exist it creates
     * a new one.
     */
    public int permissionsSaveGroup(java.lang.String group_description, java.lang.String group_name, int group_type, java.lang.String groupid, com.omniture.www.Perm_data[] perm_info, com.omniture.www.Report_categories report_access_list, int[] report_id_list, java.lang.String[] rsid_list, java.lang.String[] user_list) throws java.rmi.RemoteException;

    /**
     * Saves the login for the company.
     */
    public int permissionsSaveLogin(int admin, int change_password, java.lang.String email, java.lang.String first_name, java.lang.String last_name, java.lang.String login, java.lang.String password, java.lang.String phone_number, com.omniture.www.Permission_group[] selected_group_list, java.lang.String send_welcome_email, java.util.Date temp_end_date, int temp_login, java.util.Date temp_start_date, java.lang.String title) throws java.rmi.RemoteException;

    /**
     * Assigns the provided groups to the indicated report suite ID.
     */
    public int permissionsSaveReportSuiteGroups(java.lang.String rsid, int[] selected_groups) throws java.rmi.RemoteException;

    /**
     * Cancel a report request.
     */
    public int reportCancelReport(int reportID) throws java.rmi.RemoteException;

    /**
     * Retrieve element names
     */
    public com.omniture.www.Report_element_mapping[] reportGetElementNames(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Get status and data for a queued report.
     */
    public com.omniture.www.ReportResponse reportGetReport(int reportID) throws java.rmi.RemoteException;

    /**
     * Retrieve the report queue for a given company.
     */
    public com.omniture.www.Report_queue_item[] reportGetReportQueue() throws java.rmi.RemoteException;

    /**
     * Get status for a queued report.
     */
    public com.omniture.www.Report_status reportGetStatus(int reportID) throws java.rmi.RemoteException;

    /**
     * Queue an overtime report.
     */
    public com.omniture.www.ReportQueueResponse reportQueueOvertime(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Queue an ranked report.
     */
    public com.omniture.www.ReportQueueResponse reportQueueRanked(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Queue a ranked report that is optimized for SearchCenter classifications.
     */
    public com.omniture.www.ReportQueueResponse reportQueueSCMRanked(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Queue an trended report.
     */
    public com.omniture.www.ReportQueueResponse reportQueueTrended(com.omniture.www.ReportDescription reportDescription) throws java.rmi.RemoteException;

    /**
     * Saves the given correlation for the requested report suites.
     */
    public int reportSuiteAddCorrelations(int[] rel_ids, java.lang.String[] rsid_list, com.omniture.www.Correlation_size_enum size) throws java.rmi.RemoteException;

    /**
     * Adds the internal URL filters for the requested report suites.
     */
    public int reportSuiteAddInternalURLFilters(java.lang.String[] filters, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Adds a key visitors for the selected report suites
     */
    public boolean reportSuiteAddKeyVisitors(java.lang.String[] key_visitors, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves filter. (Internal use only.)
     */
    public com.omniture.www.Saved_filter[] reportSuiteAddSavedFilters(com.omniture.www.Saved_filter[] savedFilters) throws java.rmi.RemoteException;

    /**
     * Creates a new report suite with the values specified
     */
    public boolean reportSuiteCreate(java.lang.String base_currency, java.lang.String base_url, java.lang.String default_page, java.lang.String duplicate_rsid, java.util.Date go_live_date, int hits_per_day, int latin1, java.lang.String rsid, java.lang.String site_title, com.omniture.www.Timezone_enum time_zone) throws java.rmi.RemoteException;

    /**
     * Deletes the base URL for the requested report suites.
     */
    public int reportSuiteDeleteBaseURL(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Deletes a calculated metric for the requested report suites.
     */
    public int reportSuiteDeleteCalculatedMetrics(com.omniture.www.Calculated_metric[] calculated_metrics, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Deletes a classification for one report suite.
     */
    public boolean reportSuiteDeleteClassifications(com.omniture.www.Classification_view c_view, int div_num, int parent_div_num, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Deletes the specified data correlations
     */
    public boolean reportSuiteDeleteCorrelations(int[] rel_ids, java.lang.String[] rsid_list, com.omniture.www.Correlation_size_enum size) throws java.rmi.RemoteException;

    /**
     * Deletes the default page for the requested report suites.
     */
    public int reportSuiteDeleteDefaultPage(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Delete an IP exclusion entry for a given report suite.
     */
    public int reportSuiteDeleteIPAddressExclusions(java.lang.String[] ip_list, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Deletes the specified internal URL filters
     */
    public boolean reportSuiteDeleteInternalURLFilters(java.lang.String[] filters, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * deletes a list of key visitors for the selected report suites
     */
    public boolean reportSuiteDeleteKeyVisitors(java.lang.String[] key_visitors, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Deletes a cost item for the selected report suites
     */
    public boolean reportSuiteDeleteMarketingChannelCost(int cost_group, java.lang.String id, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Delete marketing channels.
     */
    public int reportSuiteDeleteMarketingChannels(int[] channel_ids, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Deletes the given pages from the requested report suites
     */
    public int reportSuiteDeletePages(int[] page_id_list, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Removes the specified paid search rule.
     */
    public int reportSuiteDeletePaidSearch(java.lang.String filter, java.lang.String[] rsid_list, int rule, int search_engine) throws java.rmi.RemoteException;

    /**
     * Deletes a saved filter. (Internal use only.)
     */
    public boolean reportSuiteDeleteSavedFilter(int[] savedFilterIds) throws java.rmi.RemoteException;

    /**
     * Retrieves the activated status for the requested report suites.
     */
    public com.omniture.www.Report_suite_activation[] reportSuiteGetActivation(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Returns available elements for a given report suite.
     */
    public com.omniture.www.Report_suite_elements[] reportSuiteGetAvailableElements(int return_datawarehouse_elements, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Returns available metrics for a given report suite.
     */
    public com.omniture.www.Report_suite_metrics[] reportSuiteGetAvailableMetrics(int return_datawarehouse_metrics, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the base URL for the requested report suites.
     */
    public com.omniture.www.Report_suite_base_currency[] reportSuiteGetBaseCurrency(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the base URL for the requested report suites.
     */
    public com.omniture.www.Report_suite_base_url[] reportSuiteGetBaseURL(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the calculated metrics for the requested report suites.
     */
    public com.omniture.www.Report_suite_calculated_metric[] reportSuiteGetCalculatedMetrics(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the requested classifications from the requested
     * report suites
     */
    public com.omniture.www.Report_suite_hierarchies[] reportSuiteGetClassificationHierarchies(java.lang.String c_view, java.lang.String[] rel_id, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the requested classifications from the requested
     * report suites
     */
    public com.omniture.www.Report_suite_classification[] reportSuiteGetClassifications(java.lang.String c_view, java.lang.String[] rel_id, java.lang.String[] rsid_list, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * Retrieves the correlations for the specified report suites
     */
    public com.omniture.www.Report_suite_correlation[] reportSuiteGetCorrelations(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the custom calendar for the requested report suites.
     */
    public com.omniture.www.Report_suite_custom_calendar[] reportSuiteGetCustomCalendar(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the default page for the requested report suites.
     */
    public com.omniture.www.Report_suite_default_page[] reportSuiteGetDefaultPage(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the conversion variables for the requested report
     * suites.
     */
    public com.omniture.www.Report_suite_evar[] reportSuiteGetEVars(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the Conversion level for the requested report suites.
     */
    public com.omniture.www.Report_suite_ecommerce[] reportSuiteGetEcommerce(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the finding methods for the requested report suites.
     */
    public com.omniture.www.Report_suite_finding_method[] reportSuiteGetFindingMethods(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Returns the IP address exclusions for a given report suite.
     */
    public com.omniture.www.Report_suite_ip_exclusions[] reportSuiteGetIPAddressExclusions(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the IP Address Obfuscation setting.
     */
    public com.omniture.www.Report_suite_ip_obfuscation[] reportSuiteGetIPObfuscation(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the internal URL filters for the requested report
     * suites.
     */
    public com.omniture.www.Report_suite_internal_url_filter[] reportSuiteGetInternalURLFilters(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves a list of Key visitors for the specified report suites
     */
    public com.omniture.www.Report_suite_key_visitor[] reportSuiteGetKeyVisitors(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the status of the multibyte character setting for
     * the requested report suites.
     */
    public com.omniture.www.Report_suite_localization[] reportSuiteGetLocalization(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the marketing channel cost metrics for the requested
     * report suites.
     */
    public com.omniture.www.Report_suite_costs[] reportSuiteGetMarketingChannelCost(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the marketing channel engagement period expiration
     * information for the requested report suites.
     */
    public com.omniture.www.Expiration_event[] reportSuiteGetMarketingChannelExpiration(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the marketing channel rules for the requested report
     * suites.
     */
    public com.omniture.www.Rs_mchannel_rulesets[] reportSuiteGetMarketingChannelRules(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the marketing channels for the requested report suites.
     */
    public com.omniture.www.Mchannels[] reportSuiteGetMarketingChannels(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves a list of pages for the specified report suites.
     */
    public com.omniture.www.Report_suite_pages[] reportSuiteGetPages(int limit, java.lang.String page_search, java.lang.String[] rsid_list, java.util.Date sc_period, int start_point) throws java.rmi.RemoteException;

    /**
     * Retrieves the paid search settings for the requested report
     * suites.
     */
    public com.omniture.www.Report_suite_paid_search[] reportSuiteGetPaidSearch(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the permanent traffic settings for the requested
     * report suites.
     */
    public com.omniture.www.Permanent_traffic[] reportSuiteGetPermanentTraffic(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Returns processing status for the given report suites.
     */
    public com.omniture.www.Report_suite_processing_status[] reportSuiteGetProcessingStatus(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the rollups for the company.
     */
    public com.omniture.www.Rollup[] reportSuiteGetRollups() throws java.rmi.RemoteException;

    /**
     * Gets the saved filters for a report suite. (Internal use only.)
     */
    public com.omniture.www.Saved_filter[] reportSuiteGetSavedFilters() throws java.rmi.RemoteException;

    /**
     * Retrieves the scheduled traffic changes for the requested report
     * suites.
     */
    public com.omniture.www.Schedule_spike[] reportSuiteGetScheduledSpike(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Returns report suite settings.
     */
    public com.omniture.www.Report_suite_settings[] reportSuiteGetSettings(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the Site Title for the requested report suites.
     */
    public com.omniture.www.Report_suite_site_title[] reportSuiteGetSiteTitle(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the success events for the requested report suites.
     */
    public com.omniture.www.Report_suite_event[] reportSuiteGetSuccessEvents(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the templates for the requested report suites.
     */
    public com.omniture.www.Report_suite_template[] reportSuiteGetTemplate(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the Time Zone for the requested report suites.
     */
    public com.omniture.www.Report_suite_time_zone[] reportSuiteGetTimeZone(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the Traffic Vars for the requested report suites.
     */
    public com.omniture.www.Report_suite_traffic_var[] reportSuiteGetTrafficVars(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the visibility states for the requested report suites.
     */
    public com.omniture.www.Report_suite_ui_element[] reportSuiteGetUIVisibility(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves a list of unique visitor variables
     */
    public com.omniture.www.Report_suite_unique_visitor_variable[] reportSuiteGetUniqueVisitorVariable(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Retrieves the Video Tracking settings for the requested report
     * suites.
     */
    public com.omniture.www.Report_suite_video_tracking[] reportSuiteGetVideoTracking(java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the Base Currency setting.
     */
    public int reportSuiteSaveBaseCurrency(java.lang.String base_currency, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the base URL for the requested report suites.
     */
    public int reportSuiteSaveBaseURL(java.lang.String base_url, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves a calculated metric for the requested report suites.
     */
    public int reportSuiteSaveCalculatedMetrics(com.omniture.www.Calculated_metric[] calculated_metrics, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Modifies a classification hierarchy for one or more report
     * suites.
     */
    public int reportSuiteSaveClassificationHierarchies(java.lang.String[] c_options, com.omniture.www.Classification_view c_view, int camp_view, int div_num, java.lang.String name, int parent_div_num, java.lang.String[] rsid_list, com.omniture.www.Classification_type type, int update) throws java.rmi.RemoteException;

    /**
     * Saves a classification for one or more report suites.
     */
    public int reportSuiteSaveClassifications(java.lang.String[] c_options, com.omniture.www.Classification_view c_view, int camp_view, int div_num, java.lang.String name, int parent_div_num, java.lang.String[] rsid_list, com.omniture.www.Classification_type type, int update) throws java.rmi.RemoteException;

    /**
     * Enables custom calendars for the requested report suites.
     */
    public int reportSuiteSaveCustomCalendar(java.util.Date anchor_date, int cal_type, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the default page for the requested report suites.
     */
    public int reportSuiteSaveDefaultPage(java.lang.String default_page, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the conversion variables for the requested report suites.
     */
    public int reportSuiteSaveEVars(com.omniture.www.Evar[] evars, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the conversion level for the requested report suites.
     */
    public int reportSuiteSaveEcommerce(int ecommerce, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves finding method settings.
     */
    public int reportSuiteSaveFindingMethods(com.omniture.www.Finding_method[] reports, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Add an IP exclusion entry for a given report suite.
     */
    public int reportSuiteSaveIPAddressExclusions(java.lang.String[] ip_list, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the IP Address Obfuscation setting.
     */
    public int reportSuiteSaveIPObfuscation(int ip_obfuscation, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the marketing channel costs for the requested report
     * suites.
     */
    public int reportSuiteSaveMarketingChannelCost(com.omniture.www.Cost_item cost_item, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the visitor expiration period. Set the number of days
     * required before the visit expires, or 0 for never expires
     */
    public int reportSuiteSaveMarketingChannelExpiration(int days, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the marketing channel rules for the requested report
     * suites.
     */
    public int reportSuiteSaveMarketingChannelRules(com.omniture.www.Mchannel_ruleset[] mchannel_rules, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves a set of marketing channels.
     */
    public int reportSuiteSaveMarketingChannels(com.omniture.www.Mchannel[] channels, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Saves the paid search settings for the requested report suites.
     */
    public int reportSuiteSavePaidSearch(java.lang.String filter, java.lang.String[] rsid_list, java.lang.String rule, int search_engine) throws java.rmi.RemoteException;

    /**
     * Saves the permanent traffic settings for the requested report
     * suites.
     */
    public int reportSuiteSavePermanentTraffic(int new_hits_per_day, java.lang.String[] rsid_list, java.util.Date start_date) throws java.rmi.RemoteException;

    /**
     * Saves a rollup for the company.
     */
    public int reportSuiteSaveRollup(java.util.Date go_live_date, java.lang.String[] rollup_rsids, java.lang.String rsid, com.omniture.www.Timezone_enum time_zone) throws java.rmi.RemoteException;

    /**
     * Saves filter. (Internal use only.)
     */
    public com.omniture.www.Saved_filter[] reportSuiteSaveSavedFilters(com.omniture.www.Saved_filter[] savedFilters) throws java.rmi.RemoteException;

    /**
     * Saves scheduled traffic spikes for the requested report suites.
     */
    public int reportSuiteSaveScheduledSpike(java.util.Date end_date, java.lang.String[] rsid_list, int spike_hits_per_day, java.util.Date start_date) throws java.rmi.RemoteException;

    /**
     * Changes the Site Title of the report suites specified (it is
     * not recommended to update multiple report suites with the same site
     * title)
     */
    public int reportSuiteSaveSiteTitle(java.lang.String[] rsid_list, java.lang.String site_title) throws java.rmi.RemoteException;

    /**
     * Saves the success events to rsid_list
     */
    public int reportSuiteSaveSuccessEvents(com.omniture.www.Event[] events, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Changes the timezone (lookup ID) of the report suites specified
     */
    public int reportSuiteSaveTimeZone(java.lang.String[] rsid_list, com.omniture.www.Timezone_enum time_zone) throws java.rmi.RemoteException;

    /**
     * Saves the Traffic Vars for the requested report suites.
     */
    public int reportSuiteSaveTrafficVars(com.omniture.www.Traffic_var[] property, java.lang.String[] rsid_list) throws java.rmi.RemoteException;

    /**
     * Changes the visibility state of the UI element given for the
     * requested report suites.
     */
    public boolean reportSuiteSaveUIVisibility(java.lang.String[] rsid_list, int state, java.lang.String ui_element) throws java.rmi.RemoteException;

    /**
     * Sets the unique visitor variable specified
     */
    public int reportSuiteSaveUniqueVisitorVariable(java.lang.String[] rsid_list, java.lang.String unique_visitor_variable) throws java.rmi.RemoteException;

    /**
     * Return the current status of a Saint API Job.
     */
    public com.omniture.www.Saintresult[] saintCheckJobStatus(int job_id) throws java.rmi.RemoteException;

    /**
     * Creates Saint Export Job.
     */
    public java.lang.String saintExportCreateJob(java.lang.String campaign_filter_begin_range, java.lang.String campaign_filter_end_range, int campaign_filter_option, java.lang.String date_filter_row_end_date, java.lang.String date_filter_row_start_date, java.lang.String email_address, java.lang.String encoding, int relation_id, java.lang.String[] report_suite_array, java.lang.String row_match_filter_empty_column_name, java.lang.String row_match_filter_match_column_name, java.lang.String row_match_filter_match_column_value, int select_all_rows, int select_number_of_rows) throws java.rmi.RemoteException;

    /**
     * Returns the page details of a given file_id
     */
    public com.omniture.www.Pagedetail[] saintExportGetFileSegment(int file_id, int segment_id) throws java.rmi.RemoteException;

    /**
     * Returns Array of compatability information for a report suite(s),
     */
    public com.omniture.www.Compatability[] saintGetCompatabiltyMetrics(java.lang.String[] report_suite_array) throws java.rmi.RemoteException;

    /**
     * Get SAINT export filters.
     */
    public com.omniture.www.Export_filter[] saintGetFilters(int relation_id, java.lang.String[] report_suite_array) throws java.rmi.RemoteException;

    /**
     * Commits a specified Saint Import job for processing.
     */
    public java.lang.String saintImportCommitJob(int job_id) throws java.rmi.RemoteException;

    /**
     * Creates a Saint Import Job
     */
    public int saintImportCreateJob(int check_divisions, java.lang.String description, java.lang.String email_address, int export_results, java.lang.String[] header, int overwrite_conflicts, int relation_id, java.lang.String[] report_suite_array) throws java.rmi.RemoteException;

    /**
     * Attaches Import data to a given Saint Import job.
     */
    public java.lang.String saintImportPopulateJob(int job_id, int page, com.omniture.www.Row[] rows) throws java.rmi.RemoteException;

    /**
     * Creates a new published report. (Internal use only.)
     */
    public com.omniture.www.ScheduledReport schedulingCreatePublishedReport(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product, com.omniture.www.ScheduledReport scheduledReport, byte[] workbook) throws java.rmi.RemoteException;

    /**
     * Deletes published reports. (Internal use only)
     */
    public boolean schedulingDeletePublishedReport(com.omniture.www.ProductType product, int[] scheduledReportIds) throws java.rmi.RemoteException;

    /**
     * Deletes workbooks from the library. (Internal use only.)
     */
    public boolean schedulingDeleteWorkbook(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product, java.lang.String username, java.lang.String[] workbookNames) throws java.rmi.RemoteException;

    /**
     * Download a workbook. (Internal use only.)
     */
    public byte[] schedulingDownloadWorkbook(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType productType, java.lang.String username, java.lang.String workbookName) throws java.rmi.RemoteException;

    /**
     * Get published reports for a user. (Internal use only.)
     */
    public com.omniture.www.ScheduledReport[] schedulingGetPublishedReports(com.omniture.www.ProductType product, java.lang.String username) throws java.rmi.RemoteException;

    /**
     * Gets a history of reports published by a user.
     */
    public com.omniture.www.ScheduleLog[] schedulingGetReportsRunHistory(int limit, int offset, com.omniture.www.ProductType product, java.lang.String username) throws java.rmi.RemoteException;

    /**
     * Gets a list of workbooks for a user. (Internal use only.)
     */
    public com.omniture.www.ExcelWorkbook[] schedulingGetWorkbookList(com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product) throws java.rmi.RemoteException;

    /**
     * Re-enables a failed report. (Internal use only.)
     */
    public boolean schedulingReRunReport(int id) throws java.rmi.RemoteException;

    /**
     * Edits a published report. (Internal use only.)
     */
    public com.omniture.www.ScheduledReport schedulingUpdatePublishedReport(com.omniture.www.ProductType product, com.omniture.www.ScheduledReport scheduledReport, byte[] workbook) throws java.rmi.RemoteException;

    /**
     * Uploads a Workbook. (Internal use only.)
     */
    public boolean schedulingUploadWorkbook(java.lang.String description, java.lang.String filename, com.omniture.www.WorkbookLocation location, com.omniture.www.ProductType product, byte[] workbook) throws java.rmi.RemoteException;
}
