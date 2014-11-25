package net.yasite.api;

import java.util.List;

import net.yasite.api.params.Urls;
import net.yasite.entity.MJosnStringEntity;
import net.yasite.entity.MJsonClassString;

import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;
/**
 * 医院介绍API
 * @author 波波
 *
 */
public class MJsonAPI extends BaseAPI{

	public MJsonAPI(Context context, List<NameValuePair> pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod(Urls.WEB_SERVER_PATH+Urls.INTERFACES_DOTCTORS+Urls.DOTCTORS_ITEM);
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		Gson g = new Gson();
		MJosnStringEntity string = g.fromJson(json.toString(),MJosnStringEntity.class);
		System.out.println("Handler Reault "+string.toString());

		MJsonClassString classString = g.fromJson(string.getResult(), MJsonClassString.class);
		System.out.println("MJsonAPI Calss String"+classString.toString());
		return classString;
	}

}
