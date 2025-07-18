package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lct {
    public static final lct a = new lct(100);
    public final EnumMap b;
    public final int c;

    public lct(int i) {
        EnumMap enumMap = new EnumMap(lcs.class);
        this.b = enumMap;
        enumMap.put((EnumMap) lcs.AD_STORAGE, (lcs) f(null));
        enumMap.put((EnumMap) lcs.ANALYTICS_STORAGE, (lcs) f(null));
        this.c = i;
    }

    static char a(lcq lcqVar) {
        if (lcqVar == null) {
            return '-';
        }
        int iOrdinal = lcqVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    static lcq b(String str) {
        return str == null ? lcq.UNINITIALIZED : str.equals("granted") ? lcq.GRANTED : str.equals("denied") ? lcq.DENIED : lcq.UNINITIALIZED;
    }

    static lcq e(char c) {
        return c != '+' ? c != '0' ? c != '1' ? lcq.UNINITIALIZED : lcq.GRANTED : lcq.DENIED : lcq.POLICY;
    }

    static lcq f(Boolean bool) {
        return bool == null ? lcq.UNINITIALIZED : bool.booleanValue() ? lcq.GRANTED : lcq.DENIED;
    }

    public static lct g(Bundle bundle, int i) {
        if (bundle == null) {
            return new lct(i);
        }
        EnumMap enumMap = new EnumMap(lcs.class);
        for (lcs lcsVar : lcr.STORAGE.c) {
            enumMap.put((EnumMap) lcsVar, (lcs) b(bundle.getString(lcsVar.e)));
        }
        return new lct(enumMap, i);
    }

    public static lct h(String str, int i) {
        EnumMap enumMap = new EnumMap(lcs.class);
        lcs[] lcsVarArr = lcr.STORAGE.c;
        for (int i2 = 0; i2 < lcsVarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            lcs lcsVar = lcsVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) lcsVar, (lcs) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) lcsVar, (lcs) lcq.UNINITIALIZED);
            }
        }
        return new lct(enumMap, i);
    }

    static String j(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    static String k(lcq lcqVar) {
        int iOrdinal = lcqVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static boolean o(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final lcq c() {
        lcq lcqVar = (lcq) this.b.get(lcs.AD_STORAGE);
        return lcqVar == null ? lcq.UNINITIALIZED : lcqVar;
    }

    public final lcq d() {
        lcq lcqVar = (lcq) this.b.get(lcs.ANALYTICS_STORAGE);
        return lcqVar == null ? lcq.UNINITIALIZED : lcqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lct)) {
            return false;
        }
        lct lctVar = (lct) obj;
        for (lcs lcsVar : lcr.STORAGE.c) {
            if (this.b.get(lcsVar) != lctVar.b.get(lcsVar)) {
                return false;
            }
        }
        return this.c == lctVar.c;
    }

    public final int hashCode() {
        Iterator it = this.b.values().iterator();
        int iHashCode = this.c * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((lcq) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lct i(defpackage.lct r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<lcs> r1 = defpackage.lcs.class
            r0.<init>(r1)
            lcr r1 = defpackage.lcr.STORAGE
            lcs[] r1 = r1.c
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.b
            java.lang.Object r5 = r5.get(r4)
            lcq r5 = (defpackage.lcq) r5
            java.util.EnumMap r6 = r9.b
            java.lang.Object r6 = r6.get(r4)
            lcq r6 = (defpackage.lcq) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            lcq r7 = defpackage.lcq.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            lcq r7 = defpackage.lcq.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            lcq r7 = defpackage.lcq.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            lcq r5 = defpackage.lcq.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            lct r9 = new lct
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lct.i(lct):lct");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            lcr r1 = defpackage.lcr.STORAGE
            lcs[] r1 = r1.c
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.b
            java.lang.Object r4 = r5.get(r4)
            lcq r4 = (defpackage.lcq) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lct.l():java.lang.String");
    }

    public final String m() {
        StringBuilder sb = new StringBuilder("G1");
        for (lcs lcsVar : lcr.STORAGE.c) {
            sb.append(a((lcq) this.b.get(lcsVar)));
        }
        return sb.toString();
    }

    public final boolean n(lcs lcsVar) {
        return ((lcq) this.b.get(lcsVar)) != lcq.DENIED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(j(this.c));
        for (lcs lcsVar : lcr.STORAGE.c) {
            sb.append(",");
            sb.append(lcsVar.e);
            sb.append("=");
            lcq lcqVar = (lcq) this.b.get(lcsVar);
            if (lcqVar == null) {
                lcqVar = lcq.UNINITIALIZED;
            }
            sb.append(lcqVar);
        }
        return sb.toString();
    }

    public lct(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(lcs.class);
        this.b = enumMap2;
        enumMap2.putAll(enumMap);
        this.c = i;
    }
}
