package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmc {
    public tst a;
    private ieg b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean f;
    private ImmutableList g;
    private ImmutableList h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private ImmutableMap n;
    private String o;
    private byte p;

    public lmc() {
        throw null;
    }

    public final lmd a() {
        ieg iegVar;
        String str;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ImmutableMap immutableMap;
        String str2;
        if (this.p == -1 && (iegVar = this.b) != null && (str = this.c) != null && (immutableList = this.g) != null && (immutableList2 = this.h) != null && (immutableMap = this.n) != null && (str2 = this.o) != null) {
            return new lmd(iegVar, str, this.d, this.e, this.f, immutableList, immutableList2, this.i, this.a, this.j, this.k, this.l, this.m, immutableMap, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" account");
        }
        if (this.c == null) {
            sb.append(" videoId");
        }
        if ((this.p & 1) == 0) {
            sb.append(" episode");
        }
        if ((this.p & 2) == 0) {
            sb.append(" offline");
        }
        if ((this.p & 4) == 0) {
            sb.append(" rental");
        }
        if (this.g == null) {
            sb.append(" offlineStreams");
        }
        if (this.h == null) {
            sb.append(" onlineStreams");
        }
        if ((this.p & 8) == 0) {
            sb.append(" encrypted");
        }
        if ((this.p & 16) == 0) {
            sb.append(" cencSecurityLevel");
        }
        if ((this.p & 32) == 0) {
            sb.append(" downloadedPercentage");
        }
        if ((this.p & 64) == 0) {
            sb.append(" mainFeature");
        }
        if ((this.p & 128) == 0) {
            sb.append(" avod");
        }
        if (this.n == null) {
            sb.append(" avodData");
        }
        if (this.o == null) {
            sb.append(" sessionNonce");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null account");
        }
        this.b = iegVar;
    }

    public final void c(boolean z) {
        this.m = z;
        this.p = (byte) (this.p | Byte.MIN_VALUE);
    }

    public final void d(ImmutableMap immutableMap) {
        if (immutableMap == null) {
            throw new NullPointerException("Null avodData");
        }
        this.n = immutableMap;
    }

    public final void e(int i) {
        this.j = i;
        this.p = (byte) (this.p | 16);
    }

    public final void f(int i) {
        this.k = i;
        this.p = (byte) (this.p | 32);
    }

    public final void g(boolean z) {
        this.i = z;
        this.p = (byte) (this.p | 8);
    }

    public final void h(boolean z) {
        this.d = z;
        this.p = (byte) (this.p | 1);
    }

    public final void i(boolean z) {
        this.l = z;
        this.p = (byte) (this.p | 64);
    }

    public final void j(boolean z) {
        this.e = z;
        this.p = (byte) (this.p | 2);
    }

    public final void k(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null offlineStreams");
        }
        this.g = immutableList;
    }

    public final void l(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null onlineStreams");
        }
        this.h = immutableList;
    }

    public final void m(boolean z) {
        this.f = z;
        this.p = (byte) (this.p | 4);
    }

    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionNonce");
        }
        this.o = str;
    }

    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.c = str;
    }

    public lmc(byte[] bArr) {
        this.a = trk.a;
    }
}
