package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgc {
    public int a;
    public String b;
    public String c;
    public byte d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private int j;
    private int k;
    private String l;
    private boolean m;
    private int n;
    private boolean o;
    private ImmutableList p;

    public final lgd a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ImmutableList immutableList;
        if (this.d == 63 && (str = this.b) != null && (str2 = this.c) != null && (str3 = this.e) != null && (str4 = this.f) != null && (str5 = this.g) != null && (str6 = this.h) != null && (str7 = this.i) != null && (str8 = this.l) != null && (immutableList = this.p) != null) {
            return new lgd(this.a, str, str2, str3, str4, str5, str6, str7, this.j, this.k, str8, this.m, this.n, this.o, immutableList);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" assetType");
        }
        if (this.b == null) {
            sb.append(" assetId");
        }
        if (this.c == null) {
            sb.append(" rootId");
        }
        if (this.e == null) {
            sb.append(" eidrId");
        }
        if (this.f == null) {
            sb.append(" title");
        }
        if (this.g == null) {
            sb.append(" posterUri");
        }
        if (this.h == null) {
            sb.append(" ratingId");
        }
        if (this.i == null) {
            sb.append(" ratingName");
        }
        if ((this.d & 2) == 0) {
            sb.append(" seasonSequenceNumber");
        }
        if ((this.d & 4) == 0) {
            sb.append(" episodeSequenceNumber");
        }
        if (this.l == null) {
            sb.append(" nextEpisodeId");
        }
        if ((this.d & 8) == 0) {
            sb.append(" nextEpisodeInSameSeason");
        }
        if ((this.d & 16) == 0) {
            sb.append(" endCreditStartSeconds");
        }
        if ((this.d & 32) == 0) {
            sb.append(" isBonusContent");
        }
        if (this.p == null) {
            sb.append(" inBundles");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null eidrId");
        }
        this.e = str;
    }

    public final void c(int i) {
        this.n = i;
        this.d = (byte) (this.d | 16);
    }

    public final void d(int i) {
        this.k = i;
        this.d = (byte) (this.d | 4);
    }

    public final void e(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null inBundles");
        }
        this.p = immutableList;
    }

    public final void f(boolean z) {
        this.o = z;
        this.d = (byte) (this.d | 32);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null nextEpisodeId");
        }
        this.l = str;
    }

    public final void h(boolean z) {
        this.m = z;
        this.d = (byte) (this.d | 8);
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null posterUri");
        }
        this.g = str;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null ratingId");
        }
        this.h = str;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null ratingName");
        }
        this.i = str;
    }

    public final void l(int i) {
        this.j = i;
        this.d = (byte) (this.d | 2);
    }

    public final void m(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.f = str;
    }
}
