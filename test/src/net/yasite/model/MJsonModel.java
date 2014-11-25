package net.yasite.model;

import android.content.Context;
import net.yasite.entity.MJsonClassString;
import net.yasite.service.MJsonService;

public class MJsonModel extends Model{
	private MJsonService service;

	public MJsonModel(Context context){
		service = new MJsonService(context);
	}
	public MJsonClassString RequestClass(int id){

		return service.getClassMjson(id);
	}
}
