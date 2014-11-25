package net.yasite.api.params;

public class Urls {
	//http://192.172.10.244/api/socerList.php
	public final static String PROTOCOL = "http";
	public final static String HOST = "121.52.221.85";
	public final static String PORT = "8888";
	//http://192.172.10.244:80/api/socerList.php
	//http://121.52.221.85:8888/cms/exp/ealExp.dhtml?rp=1&ps=20
	public final static String WEB_SERVER_PATH = PROTOCOL + "://" + HOST + ":" + PORT;

	public final static String API = "/api/";

	public final static String EC = "/ecshop/api/";
	public final static String COM = "/cms/exp/";
	public final static String list = "list.php"; 

	public final static String socerList = "socerList.php";

	public final static String postTmp = "posttmp.php";

	public final static String upload = "upload.php";

	public final static String goodsList = "goodList.php";

	public final static String GOODSINFO = "goods.php";
	public final static String Art= "1.php";

	public final static String DC = "worldcup.php";
	public final static String RANK = "socerList.php";
	public final static String MYINFO = "ealExp.dhtml?rp=1&ps=20";
}


