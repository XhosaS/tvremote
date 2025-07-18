package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eab {
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final Integer D;
    public final Integer E;
    public final CharSequence F;
    public final CharSequence G;
    public final CharSequence H;
    public final Integer I;
    public final Bundle J;
    public final ImmutableList K;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final Long i;
    public final eaq j;
    public final eaq k;
    public final byte[] l;
    public final Integer m;
    public final Uri n;
    public final Integer o;
    public final Integer p;

    @Deprecated
    public final Integer q;
    public final Boolean r;
    public final Boolean s;

    @Deprecated
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final Integer z;
    public static final eab a = new eab(new eaa());
    private static final String L = edt.Z(0);
    private static final String M = edt.Z(1);
    private static final String N = edt.Z(2);
    private static final String O = edt.Z(3);
    private static final String P = edt.Z(4);
    private static final String Q = edt.Z(5);
    private static final String R = edt.Z(6);
    private static final String S = edt.Z(8);
    private static final String T = edt.Z(9);
    private static final String U = edt.Z(10);
    private static final String V = edt.Z(11);
    private static final String W = edt.Z(12);
    private static final String X = edt.Z(13);
    private static final String Y = edt.Z(14);
    private static final String Z = edt.Z(15);
    private static final String aa = edt.Z(16);
    private static final String ab = edt.Z(17);
    private static final String ac = edt.Z(18);
    private static final String ad = edt.Z(19);
    private static final String ae = edt.Z(20);
    private static final String af = edt.Z(21);
    private static final String ag = edt.Z(22);
    private static final String ah = edt.Z(23);
    private static final String ai = edt.Z(24);
    private static final String aj = edt.Z(25);
    private static final String ak = edt.Z(26);
    private static final String al = edt.Z(27);
    private static final String am = edt.Z(28);
    private static final String an = edt.Z(29);
    private static final String ao = edt.Z(30);
    private static final String ap = edt.Z(31);
    private static final String aq = edt.Z(32);
    private static final String ar = edt.Z(33);
    private static final String as = edt.Z(34);
    private static final String at = edt.Z(1000);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eab(defpackage.eaa r8) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eab.<init>(eaa):void");
    }

    public static eab b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        eaa eaaVar = new eaa();
        eaaVar.a = bundle.getCharSequence(L);
        eaaVar.b = bundle.getCharSequence(M);
        eaaVar.c = bundle.getCharSequence(N);
        eaaVar.d = bundle.getCharSequence(O);
        eaaVar.e = bundle.getCharSequence(P);
        eaaVar.f = bundle.getCharSequence(Q);
        eaaVar.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = an;
        eaaVar.b(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        eaaVar.m = (Uri) bundle.getParcelable(V);
        eaaVar.y = bundle.getCharSequence(ag);
        eaaVar.z = bundle.getCharSequence(ah);
        eaaVar.A = bundle.getCharSequence(ai);
        eaaVar.D = bundle.getCharSequence(al);
        eaaVar.E = bundle.getCharSequence(am);
        eaaVar.F = bundle.getCharSequence(ao);
        eaaVar.H = bundle.getBundle(at);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            eaaVar.i = eaq.c(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            eaaVar.j = eaq.c(bundle2);
        }
        String str4 = ar;
        if (bundle.containsKey(str4)) {
            eaaVar.c(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            eaaVar.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            eaaVar.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            eaaVar.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = aq;
        if (bundle.containsKey(str8)) {
            eaaVar.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            eaaVar.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = aa;
        if (bundle.containsKey(str10)) {
            eaaVar.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = ab;
        if (bundle.containsKey(str11)) {
            eaaVar.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = ac;
        if (bundle.containsKey(str12)) {
            eaaVar.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = ad;
        if (bundle.containsKey(str13)) {
            eaaVar.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = ae;
        if (bundle.containsKey(str14)) {
            eaaVar.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = af;
        if (bundle.containsKey(str15)) {
            eaaVar.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = aj;
        if (bundle.containsKey(str16)) {
            eaaVar.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = ak;
        if (bundle.containsKey(str17)) {
            eaaVar.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = ap;
        if (bundle.containsKey(str18)) {
            eaaVar.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(as);
        if (stringArrayList != null) {
            eaaVar.d(stringArrayList);
        }
        return new eab(eaaVar);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.c;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.d;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.e;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.f;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.g;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.h;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.i;
        if (l != null) {
            bundle.putLong(ar, l.longValue());
        }
        byte[] bArr = this.l;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.n;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(ag, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(ah, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(ai, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(al, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(am, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(ao, charSequence13);
        }
        eaq eaqVar = this.j;
        if (eaqVar != null) {
            bundle.putBundle(S, eaqVar.a());
        }
        eaq eaqVar2 = this.k;
        if (eaqVar2 != null) {
            bundle.putBundle(T, eaqVar2.a());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.p;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.q;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.r;
        if (bool != null) {
            bundle.putBoolean(aq, bool.booleanValue());
        }
        Boolean bool2 = this.s;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.u;
        if (num4 != null) {
            bundle.putInt(aa, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(ab, num5.intValue());
        }
        Integer num6 = this.w;
        if (num6 != null) {
            bundle.putInt(ac, num6.intValue());
        }
        Integer num7 = this.x;
        if (num7 != null) {
            bundle.putInt(ad, num7.intValue());
        }
        Integer num8 = this.y;
        if (num8 != null) {
            bundle.putInt(ae, num8.intValue());
        }
        Integer num9 = this.z;
        if (num9 != null) {
            bundle.putInt(af, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(aj, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(ak, num11.intValue());
        }
        Integer num12 = this.m;
        if (num12 != null) {
            bundle.putInt(an, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(ap, num13.intValue());
        }
        ImmutableList immutableList = this.K;
        if (!immutableList.isEmpty()) {
            bundle.putStringArrayList(as, new ArrayList<>(immutableList));
        }
        Bundle bundle2 = this.J;
        if (bundle2 != null) {
            bundle.putBundle(at, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eab eabVar = (eab) obj;
            if (Objects.equals(this.b, eabVar.b) && Objects.equals(this.c, eabVar.c) && Objects.equals(this.d, eabVar.d) && Objects.equals(this.e, eabVar.e) && Objects.equals(this.f, eabVar.f) && Objects.equals(this.g, eabVar.g) && Objects.equals(this.h, eabVar.h) && Objects.equals(this.i, eabVar.i) && Objects.equals(this.j, eabVar.j) && Objects.equals(this.k, eabVar.k) && Arrays.equals(this.l, eabVar.l) && Objects.equals(this.m, eabVar.m) && Objects.equals(this.n, eabVar.n) && Objects.equals(this.o, eabVar.o) && Objects.equals(this.p, eabVar.p) && Objects.equals(this.q, eabVar.q) && Objects.equals(this.r, eabVar.r) && Objects.equals(this.s, eabVar.s) && Objects.equals(this.u, eabVar.u) && Objects.equals(this.v, eabVar.v) && Objects.equals(this.w, eabVar.w) && Objects.equals(this.x, eabVar.x) && Objects.equals(this.y, eabVar.y) && Objects.equals(this.z, eabVar.z) && Objects.equals(this.A, eabVar.A) && Objects.equals(this.B, eabVar.B) && Objects.equals(this.C, eabVar.C) && Objects.equals(this.D, eabVar.D) && Objects.equals(this.E, eabVar.E) && Objects.equals(this.F, eabVar.F) && Objects.equals(this.G, eabVar.G) && Objects.equals(this.H, eabVar.H) && Objects.equals(this.I, eabVar.I) && Objects.equals(this.K, eabVar.K)) {
                if ((this.J == null) == (eabVar.J == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(this.J == null), this.K);
    }
}
