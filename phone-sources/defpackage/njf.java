package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njf implements Runnable {
    public static final /* synthetic */ int b = 0;
    private static final rza d = new rza("RevokeAccessOperation", new String[0]);
    public final oac a;
    private final String c;

    public njf(String str) {
        ocv.aD(str);
        this.c = str;
        this.a = new oac(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Status status = Status.c;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.c).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.a;
            } else {
                d.e("Unable to revoke access!");
            }
            d.c(a.cf(responseCode, "Response Code: "));
        } catch (IOException e) {
            d.e("IOException when revoking access: ".concat(String.valueOf(e.toString())));
        } catch (Exception e2) {
            d.e("Exception when revoking access: ".concat(String.valueOf(e2.toString())));
        }
        this.a.q(status);
    }
}
