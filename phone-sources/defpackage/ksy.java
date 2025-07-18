package defpackage;

import android.os.Parcelable;
import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ksy implements Parcelable {
    public final int a;
    public final String b;
    public final String c;

    public ksy() {
        throw null;
    }

    public static ksy a(ksr ksrVar) {
        String str = ksrVar.b;
        krf.c(str);
        return new kth(1, str, o(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ksy b(defpackage.xaz r7) {
        /*
            int r0 = r7.b
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            defpackage.a.H(r0)
            kth r0 = new kth
            int r2 = r7.f
            xay r2 = defpackage.xay.b(r2)
            if (r2 != 0) goto L19
            xay r2 = defpackage.xay.ANDROID_APP
        L19:
            java.lang.String r3 = r7.c
            defpackage.krf.c(r3)
            int r4 = defpackage.ktc.a
            int r4 = r7.b
            r4 = r4 & r1
            r5 = 0
            if (r4 == 0) goto L70
            java.lang.String r4 = r7.c
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L42
            int r6 = r7.f
            xay r6 = defpackage.xay.b(r6)
            if (r6 != 0) goto L38
            xay r6 = defpackage.xay.ANDROID_APP
        L38:
            int r6 = r6.s
            java.lang.String r4 = defpackage.ktc.g(r6, r4)
            if (r4 == 0) goto L42
            r5 = r4
            goto L70
        L42:
            java.lang.String r4 = r7.d
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L70
            int r7 = r7.f
            xay r7 = defpackage.xay.b(r7)
            if (r7 != 0) goto L54
            xay r7 = defpackage.xay.ANDROID_APP
        L54:
            int r7 = r7.ordinal()
            r6 = 5
            if (r7 == r6) goto L63
            if (r7 == r1) goto L5e
            goto L70
        L5e:
            java.lang.String r5 = defpackage.ktc.l(r4)
            goto L70
        L63:
            defpackage.krf.c(r4)
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "m:movie:"
            java.lang.String r5 = r1.concat(r7)
        L70:
            int r7 = r2.s
            defpackage.krf.c(r5)
            r0.<init>(r7, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksy.b(xaz):ksy");
    }

    public static ksy c(int i, String str) {
        if (i == 5001) {
            i = 6;
        }
        xay xayVarB = xay.b(i);
        xayVarB.getClass();
        String strI = ktc.i(xayVarB, str);
        krf.c(strI);
        return new kth(i, str, strI);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ksy d(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksy.d(java.lang.String):ksy");
    }

    public static ksy e(String str) {
        krf.c(str);
        return new kth(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, str, ktc.j(str));
    }

    public static ksy f(String str) {
        krf.c(str);
        return new kth(70, str, ktc.k(str));
    }

    public static ksy g(kuf kufVar) {
        String str = kufVar.b;
        krf.c(str);
        return new kth(61, str, "pt:distributor:".concat(str));
    }

    public static ksy h(String str) {
        krf.c(str);
        return new kth(20, str, p(str));
    }

    public static ksy i(String str) {
        krf.c(str);
        return new kth(6, str, q(str));
    }

    public static ksy j(String str) {
        krf.c(str);
        return new kth(5000, str, q(str));
    }

    public static ksy k(String str) {
        krf.c(str);
        return new kth(19, str, r(str));
    }

    public static ksy l(String str) {
        krf.c(str);
        return new kth(18, str, s(str));
    }

    public static ksy m(String str) {
        krf.c(str);
        return new kth(6, str, q(str));
    }

    public static String o(String str) {
        krf.c(str);
        return "pt:android_app:".concat(str);
    }

    public static String p(String str) {
        krf.c(str);
        return "yt:episode:".concat(str);
    }

    @Deprecated
    public static String q(String str) {
        krf.c(str);
        return "yt:movie:".concat(String.valueOf(str));
    }

    @Deprecated
    public static String r(String str) {
        krf.c(str);
        return "yt:season:".concat(str);
    }

    @Deprecated
    public static String s(String str) {
        krf.c(str);
        return "yt:show:".concat(str);
    }

    public static boolean t(ksy ksyVar) {
        return ksyVar.a == 20;
    }

    public static boolean u(String str) {
        return str.startsWith("yt:episode:");
    }

    public static boolean v(ksy ksyVar) {
        return ksyVar.a == 6;
    }

    public static boolean w(ksy ksyVar) {
        return ksyVar.a == 5000;
    }

    public static boolean x(ksy ksyVar) {
        return ksyVar.a == 19;
    }

    public static boolean y(ksy ksyVar) {
        return ksyVar.a == 18;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksy) {
            ksy ksyVar = (ksy) obj;
            if (this.a == ksyVar.a && this.b.equals(ksyVar.b) && this.c.equals(ksyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Deprecated
    public final xay n() {
        int i = this.a;
        return i == 5001 ? xay.MOVIE : xay.b(i);
    }

    public final String toString() {
        return "AssetId{type=" + this.a + ", id=" + this.b + ", assetId=" + this.c + "}";
    }

    public ksy(int i, String str, String str2) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null assetId");
        }
        this.c = str2;
    }
}
