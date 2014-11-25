package net.yasite.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;

import net.yasite.api.BaseAPI;
import net.yasite.api.DepartMentsAPI;
import net.yasite.api.HospitalsAPI;
import net.yasite.api.MJsonAPI;
import net.yasite.entity.MJsonClassString;
import net.yasite.entity.MJsonDeparments;
import net.yasite.entity.MJsonListClassEntity;
import android.content.Context;

public class MJsonService extends BaseService{

	public MJsonService(Context context) {
		super(context);
	}
	/*
	 * 医院介绍
	 */
	public MJsonClassString getClassMjson(int id){
		//dbParams={id:3}
		List<NameValuePair> pm = new ArrayList<NameValuePair>();
		pm.add(getValue("dbParams", "{id:"+id+"}"));
		BaseAPI api = new MJsonAPI(context, pm);
		try {
			if(api.doPost()){
				return (MJsonClassString) api.getHandleResult();
			}else{
				System.out.println("getClassMjson  doPost is  Error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * 医生列表
	 */
	public List<MJsonListClassEntity> getClassList(){
		List<NameValuePair> pm = new ArrayList<NameValuePair>();
		BaseAPI api = new HospitalsAPI(context, pm);
		try {
			if(api.doGet()){
				return (List<MJsonListClassEntity>) api.getHandleResult();
			}else{
				System.out.println("getClassList  doPost is  Error");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	/*
	 * 科室列表
	 */
	public List<MJsonDeparments> getClassDepartment(int id){
		List<NameValuePair> pm = new ArrayList<NameValuePair>();
		pm.add(getValue("dbParams", "{id:"+id+"}"));
		BaseAPI api = new DepartMentsAPI(context, pm);
		try {
			if(api.doPost()){
				return (List<MJsonDeparments>) api.getHandleResult();
			}else{
				System.out.println("getClassDepartment doPost is Error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
