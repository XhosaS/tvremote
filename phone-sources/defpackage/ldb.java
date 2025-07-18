package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldb implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public ldb(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        packageName.getClass();
        return packageName;
    }

    public final String a() throws PackageManager.NameNotFoundException {
        MessageDigest messageDigest;
        byte[] bArrDigest;
        int i = this.b;
        if (i == 0) {
            return c(((rgq) this.a).a());
        }
        if (i == 1) {
            Context contextA = ((rgq) this.a).a();
            int i2 = kqf.a;
            try {
                return sij.E(((TelephonyManager) contextA.getSystemService("phone")).getSimOperator());
            } catch (Exception e) {
                krd.c("Error getting mcc/mnc: ".concat(String.valueOf(e.getMessage())));
                return "";
            }
        }
        if (i == 2) {
            String string = ((SharedPreferences) this.a.b()).getString("phenotype_server_token_key", "");
            string.getClass();
            return string;
        }
        if (i == 3) {
            return ((ldv) this.a.b()).l();
        }
        if (i == 4) {
            return ((ldv) this.a.b()).k();
        }
        if (i != 5) {
            return (String) ((zuw) this.a.b()).b;
        }
        Context contextA2 = ((rgq) this.a).a();
        try {
            PackageInfo packageInfo = contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0 || (messageDigest = MessageDigest.getInstance("SHA-1")) == null || (bArrDigest = messageDigest.digest(packageInfo.signatures[0].toByteArray())) == null) {
                return null;
            }
            return tzs.f.i(bArrDigest);
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? a() : a() : a() : a() : a() : a() : a();
    }
}
