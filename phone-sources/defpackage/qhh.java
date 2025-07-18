package defpackage;

import android.text.TextUtils;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhh {
    private static final tvn a = tvn.n("GnpSdk");

    public static SSLContext a(String str) throws KeyManagementException {
        try {
            SSLContext sSLContext = TextUtils.isEmpty(str) ? SSLContext.getDefault() : SSLContext.getInstance(str);
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException unused) {
            tvk tvkVar = (tvk) ((tvk) a.f()).j("com/google/android/libraries/notifications/platform/http/impl/url/GnpHttpClientModule", "getSSLContext", 55, "GnpHttpClientModule.java");
            if (true == TextUtils.isEmpty(str)) {
                str = "Default";
            }
            tvkVar.v("KeyManagementException encountered for %s algorithm.", str);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            tvk tvkVar2 = (tvk) ((tvk) a.f()).j("com/google/android/libraries/notifications/platform/http/impl/url/GnpHttpClientModule", "getSSLContext", 51, "GnpHttpClientModule.java");
            if (true == TextUtils.isEmpty(str)) {
                str = "Default";
            }
            tvkVar2.v("%s not available as an algorithm.", str);
            return null;
        }
    }
}
