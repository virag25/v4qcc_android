package amigoinn.example.v4sales;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.example.v4sales.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;



public class ProfileActivity extends Fragment implements OnClickListener {
	FloatLabeledEditText loginText,passText,newpass,confText;
	RobotoTextView btnLogin,btnRegister;
//	int myIp;
//	int intMyIp3;
//	int intMyIp3mod;
//	String myipfinal;
//	int intMyIp2;
//	int intMyIp2mod;
Context context;
	View view;
	int length=0;
	String result="";
	String user="",pass="";
	ProgressDialog dialog;
	ArrayList<String> list;
	JSONObject json_data;


	JSONArray jArray;
	String str="";
	String email;
	SharedPreferences preferences;


public View onCreateView(LayoutInflater inflater, ViewGroup container,
						 Bundle savedInstanceState)
{

	// Inflate the layout for this fragment
	view = inflater.inflate(R.layout.profile_activity, container, false);
	context = view.getContext();

	loginText = (FloatLabeledEditText)view.findViewById(R.id.user);
	passText = (FloatLabeledEditText)view.findViewById(R.id.etPassword);
	newpass = (FloatLabeledEditText)view.findViewById(R.id.etnewPassword);
	confText = (FloatLabeledEditText)view.findViewById(R.id.etnewPasswordConfirm);

	btnLogin=(RobotoTextView)view.findViewById(R.id.login);
//	btnLogin.setOnClickListener(this);
   // new AsynchTaskEx().execute();
	return  view;
}


	@Override
	public void onClick(View v) {

	}
}
