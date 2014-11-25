package net.yasite.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;

import net.yasite.api.BaseAPI;
import net.yasite.api.MJsonAPI;
import net.yasite.entity.MJsonClassString;
import android.content.Context;

public class MJsonService extends BaseService{

	public MJsonService(Context context) {
		super(context);
	}
	public MJsonClassString getClassMjson(int id){
		//dbParams={id:3}
		List<NameValuePair> pm = new ArrayList<NameValuePair>();
		pm.add(getValue("dbParams", "{id:"+id+"}"));
		BaseAPI api = new MJsonAPI(context, pm);
		try {
			if(api.doPost()){
				return (MJsonClassString) api.getHandleResult();
			}else{
				System.out.println("doPost is  Error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
