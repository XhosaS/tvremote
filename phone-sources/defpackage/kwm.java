package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwm {
    public ksy a;
    private ieg b;
    private String c;
    private String d;
    private Uri e;
    private float f;
    private String g;
    private Uri h;
    private float i;
    private float j;
    private lcu k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;
    private int p;
    private ImmutableList q;
    private ImmutableList r;
    private ieg s;
    private ImmutableList t;
    private byte u;

    public final kwn a() {
        ieg iegVar;
        String str;
        String str2;
        ksy ksyVar;
        Uri uri;
        String str3;
        Uri uri2;
        lcu lcuVar;
        String str4;
        String str5;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ieg iegVar2;
        ImmutableList immutableList3;
        if (this.u == 63 && (iegVar = this.b) != null && (str = this.c) != null && (str2 = this.d) != null && (ksyVar = this.a) != null && (uri = this.e) != null && (str3 = this.g) != null && (uri2 = this.h) != null && (lcuVar = this.k) != null && (str4 = this.l) != null && (str5 = this.m) != null && (immutableList = this.q) != null && (immutableList2 = this.r) != null && (iegVar2 = this.s) != null && (immutableList3 = this.t) != null) {
            return new ktu(iegVar, str, str2, ksyVar, uri, this.f, str3, uri2, this.i, this.j, lcuVar, str4, str5, this.n, this.o, this.p, immutableList, immutableList2, iegVar2, immutableList3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" entitlementAnnotation");
        }
        if (this.c == null) {
            sb.append(" ratingId");
        }
        if (this.d == null) {
            sb.append(" contentRating");
        }
        if (this.a == null) {
            sb.append(" assetId");
        }
        if (this.e == null) {
            sb.append(" posterUrl");
        }
        if ((this.u & 1) == 0) {
            sb.append(" posterAspectRatio");
        }
        if (this.g == null) {
            sb.append(" title");
        }
        if (this.h == null) {
            sb.append(" bannerUrl");
        }
        if ((this.u & 2) == 0) {
            sb.append(" starRating");
        }
        if ((this.u & 4) == 0) {
            sb.append(" floatTomatoRating");
        }
        if (this.k == null) {
            sb.append(" tomatometerRating");
        }
        if (this.l == null) {
            sb.append(" tomatometerRatingSourceUrl");
        }
        if (this.m == null) {
            sb.append(" description");
        }
        if ((this.u & 8) == 0) {
            sb.append(" hasSurroundSound");
        }
        if ((this.u & 16) == 0) {
            sb.append(" hasCaption");
        }
        if ((this.u & 32) == 0) {
            sb.append(" releaseYear");
        }
        if (this.q == null) {
            sb.append(" broadcasters");
        }
        if (this.r == null) {
            sb.append(" episodeAvailability");
        }
        if (this.s == null) {
            sb.append(" assetRestrictionListResult");
        }
        if (this.t == null) {
            sb.append(" showItemIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null assetRestrictionListResult");
        }
        this.s = iegVar;
    }

    public final void c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null bannerUrl");
        }
        this.h = uri;
    }

    public final void d(List list) {
        this.q = ImmutableList.copyOf((Collection) list);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentRating");
        }
        this.d = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.m = str;
    }

    public final void g(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null entitlementAnnotation");
        }
        this.b = iegVar;
    }

    public final void h(List list) {
        this.r = ImmutableList.copyOf((Collection) list);
    }

    public final void i(float f) {
        this.j = f;
        this.u = (byte) (this.u | 4);
    }

    public final void j(boolean z) {
        this.o = z;
        this.u = (byte) (this.u | 16);
    }

    public final void k(boolean z) {
        this.n = z;
        this.u = (byte) (this.u | 8);
    }

    public final void l(float f) {
        this.f = f;
        this.u = (byte) (this.u | 1);
    }

    public final void m(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.e = uri;
    }

    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null ratingId");
        }
        this.c = str;
    }

    public final void o(int i) {
        this.p = i;
        this.u = (byte) (this.u | 32);
    }

    public final void p(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null showItemIds");
        }
        this.t = immutableList;
    }

    public final void q(float f) {
        this.i = f;
        this.u = (byte) (this.u | 2);
    }

    public final void r(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.g = str;
    }

    public final void s(lcu lcuVar) {
        if (lcuVar == null) {
            throw new NullPointerException("Null tomatometerRating");
        }
        this.k = lcuVar;
    }

    public final void t(String str) {
        if (str == null) {
            throw new NullPointerException("Null tomatometerRatingSourceUrl");
        }
        this.l = str;
    }
}
