package net.yasite.test;

import java.util.ArrayList;
import java.util.List;

import net.yasite.entity.MJsonDeparments;
import net.yasite.entity.MJsonListClassEntity;
import net.yasite.model.MJsonModel;
import net.yasite.net.HandlerHelp;
import android.content.Context;
import android.os.Message;
import android.widget.TextView;

public class MjsonActivity extends BaseNewActivity{
	private TextView tv;
	private MJsonModel model;
	//private MJsonClassString cs;
	private List<MJsonListClassEntity> listClass;
	private List<MJsonDeparments> deparments;
	@Override
	public void setupView() {
		// TODO Auto-generated method stub
		tv = (TextView) findViewById(R.id.mjson_layout_text);
	}

	@Override
	public void setContent() {
		// TODO Auto-generated method stub
		setContentView(R.layout.mjson_layout);
	}

	@Override
	public void setModel() {
		// TODO Auto-generated method stub
		new UpUI(context).execute();
	}

	@Override
	public boolean getIntentValue() {
		// TODO Auto-generated method stub
		return true;
	}
	private class UpUI extends HandlerHelp{

		public UpUI(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
			model = new MJsonModel(context);
		//	cs = new MJsonClassString();
			//listClass = new ArrayList<MJsonListClassEntity>();
			deparments = new ArrayList<MJsonDeparments>();
		}

		@Override
		public void updateUI() {
			// TODO Auto-generated method stub
			if(deparments != null){

				tv.setText(deparments.toString());
			}else{
				System.out.println("deparments "+deparments.toString());
			}
		}

		@Override
		public void doTask(Message msg) throws Exception {
			// TODO Auto-generated method stub
			//cs = model.RequestClass(3);
			//listClass = model.RequestClassList();
			deparments = model.RequestDeparMents(24);
		}

		@Override
		public void doTaskAsNoNetWork(Message msg) throws Exception {
			// TODO Auto-generated method stub

		}

	}

}
