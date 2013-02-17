package com.example.icmprj.mydb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

class OURdb extends SQLiteOpenHelper {
/*	private String[][] CAPITALS = {
			{"경기도", "인천"},
			{"강원도", "강릉"},
			{"충청도", "충주"},
			{"경상도", "부산"},
			{"전라도", "광주"},
			{"제주도", "제주"},
		};
	*/	
	public OURdb(Context context) {
		// 2번째 인자로 db저장소를 지정: 메모리(null),파일(저장위치:/data/data/<패키지명>/database/<파일명>)
		super(context, "en.db", null, 1);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.beginTransaction();
		try {
		//	SQLiteStatement stmt;
			db.execSQL("create table db1 (_id text primary key,pictureid text, diary text,lati text,longi text);");
	//		db.execSQL("create table db1 (_id text primary key,pictureid text, diary text);");
			
		//	stmt = db.compileStatement("insert into db1 values (?, ?);");
		/*	for (String[] capital : CAPITALS) {
				stmt.bindString(1, capital[0]);
				stmt.bindString(2, capital[1]);
				stmt.executeInsert();
			}*/
			db.setTransactionSuccessful();
		} finally {
			db.endTransaction();
		}
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}
	
}
