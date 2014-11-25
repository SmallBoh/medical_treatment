package net.yasite.api;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import net.yasite.api.params.Urls;
import net.yasite.entity.MJosnStringEntity;
import net.yasite.entity.MJsonDeparments;

import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.content.Context;
/**
 * 科室列表API
 * @author 波波
 *
 */
public class DepartMentsAPI extends BaseAPI{

	public DepartMentsAPI(Context context, List<NameValuePair> pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod(Urls.WEB_SERVER_PATH+Urls.INTERFACES_DEPARTMENTS+Urls.HOSPLITALS_LIST);
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		Gson g = new Gson();
		MJosnStringEntity stringEntity = g.fromJson(json.toString(), MJosnStringEntity.class);
		Type type = new TypeToken<List<MJsonDeparments>>() {}.getType();
		List<MJsonDeparments> mJsonDeparments = g.fromJson(stringEntity.getResult().toString(), type);
		
		System.out.println("DepartMentsAPI Handler Result :"+mJsonDeparments.toString());
		return mJsonDeparments;
	}

}
