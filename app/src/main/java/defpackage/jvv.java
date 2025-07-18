package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvv {
    public static final void a(String str) {
        try {
            try {
                koo kooVar = kop.a;
                URL url = new URL(str);
                int i = kon.b;
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    koo kooVar2 = kop.a;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                koo kooVar3 = kop.a;
            } catch (IndexOutOfBoundsException e2) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
                koo kooVar4 = kop.a;
            } catch (RuntimeException e3) {
                e = e3;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                koo kooVar32 = kop.a;
            }
        } catch (Throwable th) {
            koo kooVar5 = kop.a;
            throw th;
        }
    }
}
