package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afq {
    private static afq a;
    private static volatile Set b;
    private static volatile Set c;
    private final Context d;
    private volatile String e;

    public afq(Context context) {
        this.d = context.getApplicationContext();
    }

    public static afq b(Context context) {
        qp.p(context);
        synchronized (afq.class) {
            if (a == null) {
                afg.a(context);
                a = new afq(context);
            }
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final boolean d(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afq.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static air e(PackageInfo packageInfo, air... airVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            afd afdVar = new afd(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < airVarArr.length; i++) {
                if (airVarArr[i].equals(afdVar)) {
                    return airVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.afm a(java.lang.String r17) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afq.a(java.lang.String):afm");
    }

    public final boolean c(int i) throws PackageManager.NameNotFoundException {
        int length;
        String[] packagesForUid = this.d.getPackageManager().getPackagesForUid(i);
        afm afmVar = null;
        int i2 = 0;
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            while (true) {
                if (i2 >= length) {
                    qp.p(afmVar);
                    break;
                }
                afmVar = a(packagesForUid[i2]);
                if (afmVar.b) {
                    break;
                }
                i2++;
            }
        } else {
            afmVar = new afm(false, "no pkgs", null);
        }
        afmVar.b();
        return afmVar.b;
    }
}
