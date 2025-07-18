package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shq {
    private final int A;
    private final int B;
    private final int C;
    private final boolean D;
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int j;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int t;
    private final int w;
    private final int x;
    private final int y;
    private final int z;
    private final int h = 0;
    private final int i = 0;
    private final boolean k = true;
    private final int s = 0;
    private final int u = 0;
    private final int v = 0;
    private final boolean E = false;
    private final int F = 0;
    private final int G = 0;

    public shq(shp shpVar) {
        this.a = shpVar.a;
        this.b = shpVar.b;
        this.e = shpVar.c;
        this.f = shpVar.d;
        this.g = shpVar.e;
        this.c = shpVar.f;
        this.j = shpVar.g;
        this.l = shpVar.h;
        this.m = shpVar.i;
        this.n = shpVar.j;
        this.o = shpVar.k;
        this.p = shpVar.l;
        this.q = shpVar.m;
        this.t = shpVar.n;
        this.w = shpVar.o;
        this.x = shpVar.p;
        this.r = shpVar.q;
        this.y = shpVar.r;
        this.z = shpVar.s;
        this.A = shpVar.t;
        this.B = shpVar.u;
        this.C = shpVar.v;
        this.D = shpVar.w;
        this.d = shpVar.x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof shq) {
            shq shqVar = (shq) obj;
            if (this.a == shqVar.a && this.b == shqVar.b && this.e == shqVar.e && this.f == shqVar.f && this.g == shqVar.g) {
                int i = shqVar.h;
                int i2 = shqVar.i;
                if (this.c == shqVar.c && this.j == shqVar.j) {
                    boolean z = shqVar.k;
                    if (this.l == shqVar.l && this.m == shqVar.m && this.n == shqVar.n && this.o == shqVar.o && this.p == shqVar.p && this.q == shqVar.q && this.r == shqVar.r) {
                        int i3 = shqVar.s;
                        if (this.t == shqVar.t && this.y == shqVar.y && this.z == shqVar.z) {
                            int i4 = shqVar.u;
                            int i5 = shqVar.v;
                            if (this.w == shqVar.w && this.x == shqVar.x && this.A == shqVar.A && this.B == shqVar.B && this.C == shqVar.C && this.D == shqVar.D && this.d == shqVar.d) {
                                boolean z2 = shqVar.E;
                                int i6 = shqVar.G;
                                int i7 = shqVar.F;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.c), Integer.valueOf(this.j), true, Integer.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), 0, Integer.valueOf(this.t), 0, 0, Integer.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C), Boolean.valueOf(this.D), Boolean.valueOf(this.d), false, 0, 0);
    }
}
