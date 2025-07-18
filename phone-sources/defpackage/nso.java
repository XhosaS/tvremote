package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nso {
    private static final nsf a = new nsf("MetadataUtils");
    private static final String[] b;
    private static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static Calendar a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            nsf.e();
            return null;
        }
        String strD = d(str);
        if (TextUtils.isEmpty(strD)) {
            nsf.e();
            return null;
        }
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            str2 = "yyyyMMdd";
        } else {
            strD = a.cq(strE, strD, "T");
            str2 = strE.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
        }
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(strD));
            return gregorianCalendar;
        } catch (ParseException e) {
            a.c(e, "Error parsing string", new Object[0]);
            return null;
        }
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oak oakVar = (oak) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", oakVar.b.toString());
                jSONObject.put("width", oakVar.c);
                jSONObject.put("height", oakVar.d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                try {
                    Uri uri = Uri.EMPTY;
                    if (jSONObject.has("url")) {
                        try {
                            uri = Uri.parse(jSONObject.getString("url"));
                        } catch (JSONException unused) {
                        }
                    }
                    list.add(new oak(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
                } catch (IllegalArgumentException unused2) {
                }
            }
        } catch (JSONException unused3) {
        }
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            nsf.e();
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e) {
            a.c(e, "Error extracting the date", new Object[0]);
            return null;
        }
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            nsf.e();
            return null;
        }
        int iIndexOf = str.indexOf(84);
        int i = iIndexOf + 1;
        if (iIndexOf != 8) {
            nsf.e();
            return null;
        }
        try {
            String strSubstring = str.substring(i);
            if (strSubstring.length() == 6) {
                return strSubstring;
            }
            char cCharAt = strSubstring.charAt(6);
            if (cCharAt != '+' && cCharAt != '-') {
                if (cCharAt == 'Z' && strSubstring.length() == b[0].length() + 6) {
                    return String.valueOf(strSubstring.substring(0, strSubstring.length() - 1)).concat("+0000");
                }
                return null;
            }
            int length = strSubstring.length();
            String[] strArr = b;
            if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                return strSubstring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            a.c(e, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }
}
