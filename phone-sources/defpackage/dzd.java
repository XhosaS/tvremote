package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzd {
    public byte[] A;
    public int B;
    public dyt C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public String a;
    public String b;
    public List c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public ead k;
    public String l;
    public String m;
    public int n;
    public int o;
    public List p;
    public dza q;
    public long r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public int y;
    public float z;

    public dzd(dze dzeVar) {
        this.a = dzeVar.K;
        this.b = dzeVar.L;
        this.c = dzeVar.M;
        this.d = dzeVar.N;
        this.e = dzeVar.O;
        this.f = dzeVar.P;
        this.h = dzeVar.R;
        this.i = dzeVar.S;
        this.j = dzeVar.U;
        this.k = dzeVar.V;
        this.l = dzeVar.X;
        this.m = dzeVar.Y;
        this.n = dzeVar.Z;
        this.o = dzeVar.aa;
        this.p = dzeVar.ab;
        this.q = dzeVar.ac;
        this.r = dzeVar.ad;
        this.s = dzeVar.ae;
        this.t = dzeVar.af;
        this.u = dzeVar.ag;
        this.v = dzeVar.ah;
        this.w = dzeVar.ai;
        this.x = dzeVar.aj;
        this.y = dzeVar.ak;
        this.z = dzeVar.al;
        this.A = dzeVar.am;
        this.B = dzeVar.an;
        this.C = dzeVar.ao;
        this.D = dzeVar.ap;
        this.E = dzeVar.aq;
        this.F = dzeVar.ar;
        this.G = dzeVar.as;
        this.H = dzeVar.at;
        this.I = dzeVar.au;
        this.J = dzeVar.av;
        this.K = dzeVar.aw;
        this.L = dzeVar.ax;
        this.M = dzeVar.ay;
        this.N = dzeVar.az;
    }

    public final void a(String str) {
        this.l = eae.i(str);
    }

    public final void b(int i) {
        this.a = Integer.toString(i);
    }

    public final void c(List list) {
        this.c = ImmutableList.copyOf((Collection) list);
    }

    public final void d(String str) {
        this.m = eae.i(str);
    }

    public dzd() {
        this.c = ImmutableList.of();
        this.h = -1;
        this.i = -1;
        this.n = -1;
        this.o = -1;
        this.r = Long.MAX_VALUE;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1.0f;
        this.z = 1.0f;
        this.B = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.J = -1;
        this.K = 1;
        this.L = -1;
        this.M = -1;
        this.N = 0;
        this.g = 0;
    }
}
