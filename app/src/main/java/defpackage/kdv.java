package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kdv {
    private static kdv b;
    private static volatile Set c;
    private static volatile Set d;
    public final Context a;
    private volatile String e;

    public kdv(Context context) {
        this.a = context.getApplicationContext();
    }

    public static kdv a(Context context) {
        kkk.k(context);
        synchronized (kdv.class) {
            if (b == null) {
                kdk.c(context);
                b = new kdv(context);
            }
        }
        return b;
    }

    private static kdg d(PackageInfo packageInfo, kdg... kdgVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            kdh kdhVar = new kdh(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < kdgVarArr.length; i++) {
                if (kdgVarArr[i].equals(kdhVar)) {
                    return kdgVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.content.pm.PackageInfo r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r12 == 0) goto L28
            java.lang.String r2 = r11.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r11.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r12 = r11.applicationInfo
            if (r12 != 0) goto L21
        L1f:
            r12 = r0
            goto L28
        L21:
            int r12 = r12.flags
            r12 = r12 & 129(0x81, float:1.81E-43)
            if (r12 == 0) goto L1f
            r12 = r1
        L28:
            if (r12 == 0) goto L2d
            yyk r2 = defpackage.kdj.c     // Catch: java.lang.IllegalArgumentException -> La7
            goto L2f
        L2d:
            yyk r2 = defpackage.kdj.b     // Catch: java.lang.IllegalArgumentException -> La7
        L2f:
            int r3 = defpackage.klg.a     // Catch: java.lang.IllegalArgumentException -> La7
            defpackage.yqw.L(r1)     // Catch: java.lang.IllegalArgumentException -> La7
            android.content.pm.SigningInfo r3 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m119m(r11)     // Catch: java.lang.IllegalArgumentException -> La7
            if (r3 == 0) goto L68
            boolean r4 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.IllegalArgumentException -> La7
            if (r4 != 0) goto L68
            android.content.pm.Signature[] r4 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m$1(r3)     // Catch: java.lang.IllegalArgumentException -> La7
            if (r4 != 0) goto L47
            goto L68
        L47:
            int r4 = defpackage.yyk.e     // Catch: java.lang.IllegalArgumentException -> La7
            yyf r4 = new yyf     // Catch: java.lang.IllegalArgumentException -> La7
            r5 = 4
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> La7
            android.content.pm.Signature[] r3 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m$1(r3)     // Catch: java.lang.IllegalArgumentException -> La7
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La7
            r6 = r0
        L55:
            if (r6 >= r5) goto L63
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La7
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La7
            r4.g(r7)     // Catch: java.lang.IllegalArgumentException -> La7
            int r6 = r6 + 1
            goto L55
        L63:
            yyk r3 = r4.f()     // Catch: java.lang.IllegalArgumentException -> La7
            goto L6c
        L68:
            int r3 = defpackage.yyk.e     // Catch: java.lang.IllegalArgumentException -> La7
            yyk r3 = defpackage.zcg.b     // Catch: java.lang.IllegalArgumentException -> La7
        L6c:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La7
            if (r4 != 0) goto L9f
            yyk r3 = r3.a()     // Catch: java.lang.IllegalArgumentException -> La7
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La7
            r5 = r0
        L7b:
            if (r5 >= r4) goto L9e
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La7
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La7
            zdm r7 = r2.listIterator(r0)     // Catch: java.lang.IllegalArgumentException -> La7
        L87:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La7
            int r9 = r5 + 1
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La7
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La7
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La7
            if (r8 == 0) goto L87
            return r1
        L9c:
            r5 = r9
            goto L7b
        L9e:
            return r0
        L9f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.String r3 = "Unable to obtain package certificate history."
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La7
            throw r2     // Catch: java.lang.IllegalArgumentException -> La7
        La7:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r12 == 0) goto Lb7
            kdg[] r12 = defpackage.kdj.a
            kdg r11 = d(r11, r12)
            goto Lc3
        Lb7:
            kdg[] r12 = new defpackage.kdg[r1]
            kdg[] r2 = defpackage.kdj.a
            r2 = r2[r0]
            r12[r0] = r2
            kdg r11 = d(r11, r12)
        Lc3:
            if (r11 == 0) goto Lc6
            return r1
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdv.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kdp c(java.lang.String r17, boolean r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdv.c(java.lang.String, boolean):kdp");
    }
}
