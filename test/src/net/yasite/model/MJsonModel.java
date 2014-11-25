package net.yasite.model;

import java.util.List;

import android.content.Context;
import net.yasite.entity.MJsonClassString;
import net.yasite.entity.MJsonDeparments;
import net.yasite.entity.MJsonListClassEntity;
import net.yasite.service.MJsonService;

public class MJsonModel extends Model{
	private MJsonService service;

	public MJsonModel(Context context){
		service = new MJsonService(context);
	}
	public MJsonClassString RequestClass(int id){

		return service.getClassMjson(id);
	}
	public List<MJsonListClassEntity> RequestClassList(){
		return service.getClassList();
	}
	public List<MJsonDeparments> RequestDeparMents(int id){
		return service.getClassDepartment(id);
	}
}
