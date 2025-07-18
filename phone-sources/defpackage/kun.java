package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kun {
    public ksy a;
    public float b;
    public String c;
    public String d;
    public byte e;
    private String f;
    private String g;
    private Uri h;
    private ieg i;
    private List j;
    private int k;
    private int l;
    private String m;
    private String n;
    private String o;
    private Uri p;
    private Uri q;
    private String r;
    private long s;
    private String t;
    private boolean u;
    private ImmutableList v;
    private ImmutableList w;
    private ieg x;
    private boolean y;
    private String z;

    public final kuo a() {
        ksy ksyVar;
        String str;
        String str2;
        Uri uri;
        ieg iegVar;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Uri uri2;
        Uri uri3;
        String str8;
        String str9;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ieg iegVar2;
        String str10;
        if (this.e == 63 && (ksyVar = this.a) != null && (str = this.f) != null && (str2 = this.g) != null && (uri = this.h) != null && (iegVar = this.i) != null && (list = this.j) != null && (str3 = this.c) != null && (str4 = this.d) != null && (str5 = this.m) != null && (str6 = this.n) != null && (str7 = this.o) != null && (uri2 = this.p) != null && (uri3 = this.q) != null && (str8 = this.r) != null && (str9 = this.t) != null && (immutableList = this.v) != null && (immutableList2 = this.w) != null && (iegVar2 = this.x) != null && (str10 = this.z) != null) {
            return new ktp(ksyVar, str, str2, uri, this.b, iegVar, list, str3, str4, this.k, this.l, str5, str6, str7, uri2, uri3, str8, this.s, str9, this.u, immutableList, immutableList2, iegVar2, this.y, str10);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" assetId");
        }
        if (this.f == null) {
            sb.append(" ratingId");
        }
        if (this.g == null) {
            sb.append(" title");
        }
        if (this.h == null) {
            sb.append(" posterUrl");
        }
        if ((this.e & 1) == 0) {
            sb.append(" posterAspectRatio");
        }
        if (this.i == null) {
            sb.append(" offersResult");
        }
        if (this.j == null) {
            sb.append(" watchActions");
        }
        if (this.c == null) {
            sb.append(" seasonId");
        }
        if (this.d == null) {
            sb.append(" showId");
        }
        if ((this.e & 2) == 0) {
            sb.append(" startOfCredit");
        }
        if ((this.e & 4) == 0) {
            sb.append(" duration");
        }
        if (this.m == null) {
            sb.append(" sequenceNumber");
        }
        if (this.n == null) {
            sb.append(" seasonTitle");
        }
        if (this.o == null) {
            sb.append(" seasonNumber");
        }
        if (this.p == null) {
            sb.append(" screenshotUrl");
        }
        if (this.q == null) {
            sb.append(" showBannerUrl");
        }
        if (this.r == null) {
            sb.append(" showTitle");
        }
        if ((this.e & 8) == 0) {
            sb.append(" releaseDate");
        }
        if (this.t == null) {
            sb.append(" description");
        }
        if ((this.e & 16) == 0) {
            sb.append(" bonusContent");
        }
        if (this.v == null) {
            sb.append(" audioTracks");
        }
        if (this.w == null) {
            sb.append(" captionTracks");
        }
        if (this.x == null) {
            sb.append(" seller");
        }
        if ((this.e & 32) == 0) {
            sb.append(" includesVat");
        }
        if (this.z == null) {
            sb.append(" contentRatingName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.v = ImmutableList.copyOf((Collection) list);
    }

    public final void c(boolean z) {
        this.u = z;
        this.e = (byte) (this.e | 16);
    }

    public final void d(List list) {
        this.w = ImmutableList.copyOf((Collection) list);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentRatingName");
        }
        this.z = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.t = str;
    }

    public final void g(int i) {
        this.l = i;
        this.e = (byte) (this.e | 4);
    }

    public final void h(boolean z) {
        this.y = z;
        this.e = (byte) (this.e | 32);
    }

    public final void i(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null offersResult");
        }
        this.i = iegVar;
    }

    public final void j(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.h = uri;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null ratingId");
        }
        this.f = str;
    }

    public final void l(long j) {
        this.s = j;
        this.e = (byte) (this.e | 8);
    }

    public final void m(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.p = uri;
    }

    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null seasonNumber");
        }
        this.o = str;
    }

    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null seasonTitle");
        }
        this.n = str;
    }

    public final void p(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null seller");
        }
        this.x = iegVar;
    }

    public final void q(String str) {
        if (str == null) {
            throw new NullPointerException("Null sequenceNumber");
        }
        this.m = str;
    }

    public final void r(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null showBannerUrl");
        }
        this.q = uri;
    }

    public final void s(String str) {
        if (str == null) {
            throw new NullPointerException("Null showTitle");
        }
        this.r = str;
    }

    public final void t(int i) {
        this.k = i;
        this.e = (byte) (this.e | 2);
    }

    public final void u(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.g = str;
    }

    public final void v(List list) {
        if (list == null) {
            throw new NullPointerException("Null watchActions");
        }
        this.j = list;
    }
}
