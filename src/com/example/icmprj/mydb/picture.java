package com.example.icmprj.mydb;

import java.util.ArrayList;

public class picture {
	static ArrayList<picture> picturelist = new ArrayList<picture>();
			
	String _ID ="";
	String DATE ="";
	String LATI ="";
	String LONGI ="";
	String DATA ="";
	String BUCKET_NAME ="";
	String DIARY="";
	public picture(String id,String date, String lati, String longi, String data, String bucket) {
		_ID =id;
		DATE =date;
		LATI =lati;
		LONGI =longi;
		DATA =data;
		BUCKET_NAME =bucket;
	}
	
	public static ArrayList<picture> getlist() {
	       return picturelist;
	}
	
}
