package com.dynesshely.android.mssage.client.core;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

public class SMS {

    public Activity activity;

    public Uri SMS_INBOX = Uri.parse("content://sms/");

    public void obtainPhoneMessage() {
        ContentResolver cr = activity.getContentResolver();
        String[] projection = new String[]{"_id", "address", "person", "body", "date", "type"};
        Cursor cur = cr.query(SMS_INBOX, projection, null, null, "date desc");
        if (null == cur) {
            Log.i("ooc", "************cur == null");
            return;
        }
        while (cur.moveToNext()) {
            int c_address = cur.getColumnIndex("address");
            int c_person = cur.getColumnIndex("person");
            int c_body = cur.getColumnIndex("body");
            if (c_address >= 0 && c_person >= 0 && c_body >= 0) {
                String number = cur.getString(c_address);//手机号
                String name = cur.getString(c_person);//联系人姓名列表
                String body = cur.getString(c_body);//短信内容

//                Map<String, Object> map = new HashMap<String, Object>();
//                //至此就获得了短信的相关的内容, 以下是把短信加入map中，构建listview,非必要。
//                map.put("num", number);
//                map.put("mess", body);
//                list.add(map);
            }
        }
    }



}
