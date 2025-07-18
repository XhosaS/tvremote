package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kve {
    private lcu A;
    private String B;
    private String C;
    private ImmutableList D;
    private ImmutableList E;
    private ImmutableList F;
    private ImmutableList G;
    private ImmutableList H;
    private ImmutableList I;
    private ieg J;
    private ImmutableList K;
    private ImmutableList L;
    private ieg M;
    private boolean N;
    private ieg O;
    private ieg P;
    private short Q;
    public ksy a;
    private ieg b;
    private String c;
    private String d;
    private String e;
    private ieg f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private Uri r;
    private Uri s;
    private String t;
    private int u;
    private float v;
    private long w;
    private int x;
    private ImmutableList y;
    private float z;

    public final void A(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.r = uri;
    }

    public final void B(String str) {
        if (str == null) {
            throw new NullPointerException("Null primaryCategoryId");
        }
        this.C = str;
    }

    public final void C(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null producers");
        }
        this.G = immutableList;
    }

    public final void D(String str) {
        if (str == null) {
            throw new NullPointerException("Null ratingId");
        }
        this.c = str;
    }

    public final void E(int i) {
        this.q = i;
        this.Q = (short) (this.Q | 512);
    }

    public final void F(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.s = uri;
    }

    public final void G(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null seller");
        }
        this.M = iegVar;
    }

    public final void H(float f) {
        this.v = f;
        this.Q = (short) (this.Q | 2048);
    }

    public final void I(long j) {
        this.w = j;
        this.Q = (short) (this.Q | 4096);
    }

    public final void J(int i) {
        this.u = i;
        this.Q = (short) (this.Q | 1024);
    }

    public final void K(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.e = str;
    }

    public final void L(lcu lcuVar) {
        if (lcuVar == null) {
            throw new NullPointerException("Null tomatometerRating");
        }
        this.A = lcuVar;
    }

    public final void M(String str) {
        if (str == null) {
            throw new NullPointerException("Null tomatometerRatingSourceUrl");
        }
        this.B = str;
    }

    public final void N(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null trailers");
        }
        this.y = immutableList;
    }

    public final void O(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null watchActionsResult");
        }
        this.O = iegVar;
    }

    public final void P(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null writers");
        }
        this.E = immutableList;
    }

    public final kvf a() {
        ieg iegVar;
        String str;
        String str2;
        ksy ksyVar;
        String str3;
        ieg iegVar2;
        String str4;
        Uri uri;
        Uri uri2;
        String str5;
        ImmutableList immutableList;
        lcu lcuVar;
        String str6;
        String str7;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        ImmutableList immutableList4;
        ImmutableList immutableList5;
        ImmutableList immutableList6;
        ImmutableList immutableList7;
        ieg iegVar3;
        ImmutableList immutableList8;
        ImmutableList immutableList9;
        ieg iegVar4;
        ieg iegVar5;
        ieg iegVar6;
        if (this.Q == -1 && (iegVar = this.b) != null && (str = this.c) != null && (str2 = this.d) != null && (ksyVar = this.a) != null && (str3 = this.e) != null && (iegVar2 = this.f) != null && (str4 = this.g) != null && (uri = this.r) != null && (uri2 = this.s) != null && (str5 = this.t) != null && (immutableList = this.y) != null && (lcuVar = this.A) != null && (str6 = this.B) != null && (str7 = this.C) != null && (immutableList2 = this.D) != null && (immutableList3 = this.E) != null && (immutableList4 = this.F) != null && (immutableList5 = this.G) != null && (immutableList6 = this.H) != null && (immutableList7 = this.I) != null && (iegVar3 = this.J) != null && (immutableList8 = this.K) != null && (immutableList9 = this.L) != null && (iegVar4 = this.M) != null && (iegVar5 = this.O) != null && (iegVar6 = this.P) != null) {
            return new ktq(iegVar, str, str2, ksyVar, str3, iegVar2, str4, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, uri, uri2, str5, this.u, this.v, this.w, this.x, immutableList, this.z, lcuVar, str6, str7, immutableList2, immutableList3, immutableList4, immutableList5, immutableList6, immutableList7, iegVar3, immutableList8, immutableList9, iegVar4, this.N, iegVar5, iegVar6);
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
            sb.append(" title");
        }
        if (this.f == null) {
            sb.append(" offersResult");
        }
        if (this.g == null) {
            sb.append(" eidrId");
        }
        if ((this.Q & 1) == 0) {
            sb.append(" hasCaption");
        }
        if ((this.Q & 2) == 0) {
            sb.append(" hasSurroundSound");
        }
        if ((this.Q & 4) == 0) {
            sb.append(" hasKnowledge");
        }
        if ((this.Q & 8) == 0) {
            sb.append(" has4KBadge");
        }
        if ((this.Q & 16) == 0) {
            sb.append(" hasHDRBadge");
        }
        if ((this.Q & 32) == 0) {
            sb.append(" hasDolbyVisionHDRBadge");
        }
        if ((this.Q & 64) == 0) {
            sb.append(" hasHDR10PlusBadge");
        }
        if ((this.Q & 128) == 0) {
            sb.append(" hasMoviesAnywhereBadge");
        }
        if ((this.Q & 256) == 0) {
            sb.append(" extra");
        }
        if ((this.Q & 512) == 0) {
            sb.append(" releaseYear");
        }
        if (this.r == null) {
            sb.append(" posterUrl");
        }
        if (this.s == null) {
            sb.append(" screenshotUrl");
        }
        if (this.t == null) {
            sb.append(" description");
        }
        if ((this.Q & 1024) == 0) {
            sb.append(" startOfCredit");
        }
        if ((this.Q & 2048) == 0) {
            sb.append(" starRating");
        }
        if ((this.Q & 4096) == 0) {
            sb.append(" starRatingCount");
        }
        if ((this.Q & 8192) == 0) {
            sb.append(" duration");
        }
        if (this.y == null) {
            sb.append(" trailers");
        }
        if ((this.Q & 16384) == 0) {
            sb.append(" floatTomatoRating");
        }
        if (this.A == null) {
            sb.append(" tomatometerRating");
        }
        if (this.B == null) {
            sb.append(" tomatometerRatingSourceUrl");
        }
        if (this.C == null) {
            sb.append(" primaryCategoryId");
        }
        if (this.D == null) {
            sb.append(" directors");
        }
        if (this.E == null) {
            sb.append(" writers");
        }
        if (this.F == null) {
            sb.append(" actors");
        }
        if (this.G == null) {
            sb.append(" producers");
        }
        if (this.H == null) {
            sb.append(" bundleIds");
        }
        if (this.I == null) {
            sb.append(" bonusItems");
        }
        if (this.J == null) {
            sb.append(" annotation");
        }
        if (this.K == null) {
            sb.append(" audioTracks");
        }
        if (this.L == null) {
            sb.append(" captionTracks");
        }
        if (this.M == null) {
            sb.append(" seller");
        }
        if ((this.Q & 32768) == 0) {
            sb.append(" includesVat");
        }
        if (this.O == null) {
            sb.append(" watchActionsResult");
        }
        if (this.P == null) {
            sb.append(" assetRestrictionListResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null actors");
        }
        this.F = immutableList;
    }

    public final void c(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null annotation");
        }
        this.J = iegVar;
    }

    public final void d(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null assetRestrictionListResult");
        }
        this.P = iegVar;
    }

    public final void e(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null audioTracks");
        }
        this.K = immutableList;
    }

    public final void f(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null bonusItems");
        }
        this.I = immutableList;
    }

    public final void g(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null bundleIds");
        }
        this.H = immutableList;
    }

    public final void h(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null captionTracks");
        }
        this.L = immutableList;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentRating");
        }
        this.d = str;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.t = str;
    }

    public final void k(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null directors");
        }
        this.D = immutableList;
    }

    public final void l(int i) {
        this.x = i;
        this.Q = (short) (this.Q | 8192);
    }

    public final void m(String str) {
        if (str == null) {
            throw new NullPointerException("Null eidrId");
        }
        this.g = str;
    }

    public final void n(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null entitlementAnnotation");
        }
        this.b = iegVar;
    }

    public final void o(boolean z) {
        this.p = z;
        this.Q = (short) (this.Q | 256);
    }

    public final void p(float f) {
        this.z = f;
        this.Q = (short) (this.Q | 16384);
    }

    public final void q(boolean z) {
        this.k = z;
        this.Q = (short) (this.Q | 8);
    }

    public final void r(boolean z) {
        this.h = z;
        this.Q = (short) (this.Q | 1);
    }

    public final void s(boolean z) {
        this.m = z;
        this.Q = (short) (this.Q | 32);
    }

    public final void t(boolean z) {
        this.n = z;
        this.Q = (short) (this.Q | 64);
    }

    public final void u(boolean z) {
        this.l = z;
        this.Q = (short) (this.Q | 16);
    }

    public final void v(boolean z) {
        this.j = z;
        this.Q = (short) (this.Q | 4);
    }

    public final void w(boolean z) {
        this.o = z;
        this.Q = (short) (this.Q | 128);
    }

    public final void x(boolean z) {
        this.i = z;
        this.Q = (short) (this.Q | 2);
    }

    public final void y(boolean z) {
        this.N = z;
        this.Q = (short) (this.Q | Short.MIN_VALUE);
    }

    public final void z(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null offersResult");
        }
        this.f = iegVar;
    }
}
