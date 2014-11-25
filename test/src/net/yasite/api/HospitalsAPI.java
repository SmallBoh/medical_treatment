package net.yasite.api;

import java.lang.reflect.Type;
import java.util.List;

import net.yasite.api.params.Urls;
import net.yasite.entity.MJosnStringEntity;
import net.yasite.entity.MJsonClassString;
import net.yasite.entity.MJsonListClassEntity;

import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.content.Context;
/**
 * 医生列表API
 * @author 波波
 *
 */
public class HospitalsAPI extends BaseAPI{

	public HospitalsAPI(Context context, List<NameValuePair> pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub;
		setMethod(Urls.WEB_SERVER_PATH+Urls.INTERFACES_HOSPLITALS+Urls.HOSPLITALS_LIST);
	//	setMethod("http://ambuf.vicp.net:9982/interfaces/hospitals/list.action");
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		Gson g = new Gson();
		MJosnStringEntity stringEntity = g.fromJson(json.toString(), MJosnStringEntity.class);
		Type type = new TypeToken<List<MJsonListClassEntity>>() {}.getType();
		List<MJsonListClassEntity> classString = g.fromJson(stringEntity.getResult().toString(), type);
		System.out.println("HospitalsAPI Handler Result "+classString.toString());
		return classString;
	}

}
