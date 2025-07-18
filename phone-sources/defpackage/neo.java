package defpackage;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class neo implements nes {
    @Override // defpackage.nes
    public final int a(Uri uri, Map map) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(60000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return responseCode;
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
