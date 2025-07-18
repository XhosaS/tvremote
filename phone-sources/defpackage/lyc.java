package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyc {
    public final int a;
    public final String b;

    public lyc() {
        throw null;
    }

    public static lyc a(ksy ksyVar) {
        int iOrdinal = ksyVar.n().ordinal();
        String str = ksyVar.b;
        if (iOrdinal == 0) {
            return new lyc(1, str);
        }
        if (iOrdinal == 5) {
            return new lyc(6, str);
        }
        if (iOrdinal == 13) {
            return new lyc(61, str);
        }
        switch (iOrdinal) {
            case 8:
                return new lyc(18, str);
            case 9:
                return new lyc(19, str);
            case 10:
                return new lyc(20, str);
            default:
                switch (iOrdinal) {
                    case 15:
                        return new lyc(70, str);
                    case 16:
                        return new lyc(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, str);
                    case 17:
                        return new lyc(5000, str);
                    default:
                        throw new IllegalArgumentException("Invalid AssetId type");
                }
        }
    }

    public static lyc b(ksy ksyVar) {
        a.H(ksy.v(ksyVar));
        return new lyc(10001, ksyVar.b);
    }

    public static lyc c(ksy ksyVar) {
        a.H(ksy.y(ksyVar));
        return new lyc(10002, ksyVar.b);
    }

    public static tst d(lyc lycVar) {
        String str = lycVar.b;
        int i = lycVar.a;
        if (i == 6) {
            return tst.i(ksy.i(str));
        }
        if (i == 70) {
            return tst.i(ksy.f(str));
        }
        if (i == 107) {
            return tst.i(ksy.e(str));
        }
        if (i == 5000) {
            return tst.i(ksy.j(str));
        }
        switch (i) {
            case 18:
                return tst.i(ksy.l(str));
            case 19:
                return tst.i(ksy.k(str));
            case 20:
                return tst.i(ksy.h(str));
            default:
                return trk.a;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyc) {
            lyc lycVar = (lyc) obj;
            if (this.a == lycVar.a && this.b.equals(lycVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CacheId{type=" + this.a + ", key='" + this.b + "'}";
    }

    public lyc(int i, String str) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.b = str;
    }
}
