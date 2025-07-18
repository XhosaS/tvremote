package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lhh {
    public final Map a;

    public lhh(Map map) {
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.putAll(map);
    }

    private final int d() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final Bundle e() {
        int iD;
        Map map = this.a;
        if ("1".equals(map.get("GoogleConsent")) && (iD = d()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                if (str.length() > 0) {
                    bundle.putString(lcs.AD_STORAGE.e, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(lcs.AD_PERSONALIZATION.e, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iD >= 4) {
                    bundle.putString(lcs.AD_USER_DATA.e, (str.charAt(0) == '1' && str.charAt(6) == '1') ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            r9 = this;
            kzf r0 = defpackage.kzg.aZ
            r1 = 0
            java.lang.Object r2 = r0.a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "EnableAdvertiserConsentMode"
            java.lang.String r4 = "gdprApplies"
            java.lang.String r5 = "1"
            if (r2 == 0) goto L2c
            java.util.Map r2 = r9.a
            java.lang.Object r4 = r2.get(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lde
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lde
            goto L4e
        L2c:
            java.util.Map r2 = r9.a
            java.lang.String r6 = "GoogleConsent"
            java.lang.Object r6 = r2.get(r6)
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Lde
            java.lang.Object r4 = r2.get(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lde
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Lde
        L4e:
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld9
            java.util.Map r0 = r9.a
            java.lang.String r1 = "Version"
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L69
            android.os.Bundle r0 = r9.e()
            return r0
        L69:
            int r1 = r9.d()
            if (r1 >= 0) goto L71
            goto Lde
        L71:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            lcs r2 = defpackage.lcs.AD_STORAGE
            java.lang.String r2 = r2.e
            java.lang.String r3 = "AuthorizePurpose1"
            java.lang.Object r4 = r0.get(r3)
            boolean r4 = j$.util.Objects.equals(r4, r5)
            java.lang.String r6 = "denied"
            java.lang.String r7 = "granted"
            r8 = 1
            if (r8 == r4) goto L8d
            r4 = r6
            goto L8e
        L8d:
            r4 = r7
        L8e:
            r1.putString(r2, r4)
            lcs r2 = defpackage.lcs.AD_PERSONALIZATION
            java.lang.String r2 = r2.e
            java.lang.String r4 = "AuthorizePurpose3"
            java.lang.Object r4 = r0.get(r4)
            boolean r4 = j$.util.Objects.equals(r4, r5)
            if (r4 == 0) goto Laf
            java.lang.String r4 = "AuthorizePurpose4"
            java.lang.Object r4 = r0.get(r4)
            boolean r4 = j$.util.Objects.equals(r4, r5)
            if (r4 == 0) goto Laf
            r4 = r7
            goto Lb0
        Laf:
            r4 = r6
        Lb0:
            r1.putString(r2, r4)
            int r2 = r9.d()
            r4 = 4
            if (r2 < r4) goto Ld8
            lcs r2 = defpackage.lcs.AD_USER_DATA
            java.lang.String r2 = r2.e
            java.lang.Object r3 = r0.get(r3)
            boolean r3 = j$.util.Objects.equals(r3, r5)
            if (r3 == 0) goto Ld5
            java.lang.String r3 = "AuthorizePurpose7"
            java.lang.Object r0 = r0.get(r3)
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 == 0) goto Ld5
            r6 = r7
        Ld5:
            r1.putString(r2, r6)
        Ld8:
            return r1
        Ld9:
            android.os.Bundle r0 = r9.e()
            return r0
        Lde:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhh.a():android.os.Bundle");
    }

    public final String b() throws NumberFormatException {
        StringBuilder sb = new StringBuilder("1");
        int i = -1;
        try {
            String str = (String) this.a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iD = d();
        if (iD < 0 || iD > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iD));
        }
        Map map = this.a;
        int i2 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i3 = i2 | 4;
        if (zEquals) {
            i3 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb.toString();
    }

    final String c() {
        StringBuilder sb = new StringBuilder();
        yyk yykVar = lhk.a;
        int i = ((zcg) yykVar).d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) yykVar.get(i2);
            Map map = this.a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lhh) {
            return c().equalsIgnoreCase(((lhh) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return c();
    }
}
