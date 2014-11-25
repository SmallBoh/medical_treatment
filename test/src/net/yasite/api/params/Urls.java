package net.yasite.api.params;

public class Urls {
	public final static String PROTOCOL = "http";
	public final static String HOST = "ambuf.vicp.net";
	public final static String PORT = "9982";
	//http://ambuf.vicp.net:9982/interfaces/doctors/item.action?dbParams={id:3}
	
	//http://ambuf.vicp.net:9982/interfaces/hospitals/list.action医院列表
	
	//http://ambuf.vicp.net:9982/interfaces/departments/list.action?dbParams={id:24}科室列表
	public final static String WEB_SERVER_PATH = PROTOCOL + "://" + HOST + ":" + PORT;
	//科室列表
	public final static String INTERFACES_DOTCTORS = "/interfaces/doctors/";
	public final static String DOTCTORS_ITEM = "item.action";
	
	//医院列表 
	public final static String INTERFACES_HOSPLITALS = "/interfaces/hospitals/";
	public final static String HOSPLITALS_LIST = "list.action";
	
	public final static String INTERFACES_DEPARTMENTS = "/interfaces/departments/";
}


