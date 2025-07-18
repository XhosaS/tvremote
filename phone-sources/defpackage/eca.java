package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eca {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int A;
    public final float B;
    public final int C;
    public final float D;
    public final float E;
    public final boolean F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final int L;
    public final CharSequence u;
    public final Layout.Alignment v;
    public final Layout.Alignment w;
    public final Bitmap x;
    public final float y;
    public final int z;

    static {
        ebz ebzVar = new ebz();
        ebzVar.e("");
        ebzVar.a();
        a = edt.Z(0);
        b = edt.Z(17);
        c = edt.Z(1);
        d = edt.Z(2);
        e = edt.Z(3);
        f = edt.Z(18);
        g = edt.Z(4);
        h = edt.Z(5);
        i = edt.Z(6);
        j = edt.Z(7);
        k = edt.Z(8);
        l = edt.Z(9);
        m = edt.Z(10);
        n = edt.Z(11);
        o = edt.Z(12);
        p = edt.Z(13);
        q = edt.Z(14);
        r = edt.Z(15);
        s = edt.Z(16);
        t = edt.Z(19);
    }

    public eca(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7, int i8) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            a.H(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.u = SpannedString.valueOf(charSequence);
        } else {
            this.u = charSequence != null ? charSequence.toString() : null;
        }
        this.v = alignment;
        this.w = alignment2;
        this.x = bitmap;
        this.y = f2;
        this.z = i2;
        this.A = i3;
        this.B = f3;
        this.C = i4;
        this.D = f5;
        this.E = f6;
        this.F = z;
        this.G = i6;
        this.H = i5;
        this.I = f4;
        this.J = i7;
        this.K = f7;
        this.L = i8;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.u;
        if (charSequence != null) {
            bundle.putCharSequence(a, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = ecc.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (ecf ecfVar : (ecf[]) spanned.getSpans(0, spanned.length(), ecf.class)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(ecf.a, ecfVar.c);
                    bundle2.putInt(ecf.b, ecfVar.d);
                    arrayList.add(ecc.a(spanned, ecfVar, 1, bundle2));
                }
                for (ecg ecgVar : (ecg[]) spanned.getSpans(0, spanned.length(), ecg.class)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(ecg.a, ecgVar.d);
                    bundle3.putInt(ecg.b, ecgVar.e);
                    bundle3.putInt(ecg.c, ecgVar.f);
                    arrayList.add(ecc.a(spanned, ecgVar, 2, bundle3));
                }
                for (ecd ecdVar : (ecd[]) spanned.getSpans(0, spanned.length(), ecd.class)) {
                    arrayList.add(ecc.a(spanned, ecdVar, 3, null));
                }
                for (ech echVar : (ech[]) spanned.getSpans(0, spanned.length(), ech.class)) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(ech.a, echVar.b);
                    arrayList.add(ecc.a(spanned, echVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(b, arrayList);
                }
            }
        }
        bundle.putSerializable(c, this.v);
        bundle.putSerializable(d, this.w);
        bundle.putFloat(g, this.y);
        bundle.putInt(h, this.z);
        bundle.putInt(i, this.A);
        bundle.putFloat(j, this.B);
        bundle.putInt(k, this.C);
        bundle.putInt(l, this.H);
        bundle.putFloat(m, this.I);
        bundle.putFloat(n, this.D);
        bundle.putFloat(o, this.E);
        bundle.putBoolean(q, this.F);
        bundle.putInt(p, this.G);
        bundle.putInt(r, this.J);
        bundle.putFloat(s, this.K);
        bundle.putInt(t, this.L);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eca ecaVar = (eca) obj;
            if (TextUtils.equals(this.u, ecaVar.u) && this.v == ecaVar.v && this.w == ecaVar.w && ((bitmap = this.x) != null ? !((bitmap2 = ecaVar.x) == null || !bitmap.sameAs(bitmap2)) : ecaVar.x == null) && this.y == ecaVar.y && this.z == ecaVar.z && this.A == ecaVar.A && this.B == ecaVar.B && this.C == ecaVar.C && this.D == ecaVar.D && this.E == ecaVar.E && this.F == ecaVar.F && this.G == ecaVar.G && this.H == ecaVar.H && this.I == ecaVar.I && this.J == ecaVar.J && this.K == ecaVar.K && this.L == ecaVar.L) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.u, this.v, this.w, this.x, Float.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D), Float.valueOf(this.E), Boolean.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Float.valueOf(this.I), Integer.valueOf(this.J), Float.valueOf(this.K), Integer.valueOf(this.L));
    }
}
