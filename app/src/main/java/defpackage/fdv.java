package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdv extends agtu implements agvb {
    public fdv(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new fdv((agsw) obj2).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws IOException {
        HttpURLConnection httpURLConnection;
        agpl.b(obj);
        try {
            URLConnection uRLConnectionOpenConnection = new URL("http://localhost:8008/setup/eureka_info?params=device_info,sign").openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (IOException e) {
            ((zdv) ((zdv) fdw.b.c()).p(e).q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$readCastInfo$2", "invokeSuspend", 59, "LoadCastServiceInfoTaskImpl.kt")).u("unable to connect to cast service");
        } catch (JSONException e2) {
            ((zdv) ((zdv) fdw.b.c()).p(e2).q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$readCastInfo$2", "invokeSuspend", 61, "LoadCastServiceInfoTaskImpl.kt")).u("malformed payload from cast service");
        }
        if (httpURLConnection.getResponseCode() != 200) {
            ((zdv) ((zdv) fdw.b.b()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$readCastInfo$2", "invokeSuspend", 52, "LoadCastServiceInfoTaskImpl.kt")).B("Network Problem: Code %d / %s", httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
            return null;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        inputStream.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, agyo.a), 8192);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = bufferedReader.read(cArr); i >= 0; i = bufferedReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            string.getClass();
            aguc.a(bufferedReader, null);
            httpURLConnection.disconnect();
            return new JSONObject(string);
        } finally {
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fdv(agswVar);
    }
}
