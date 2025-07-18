package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebf {
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final boolean T;
    public final boolean U;
    public final ImmutableList V;
    public final ImmutableList W;
    public final int X;
    public final ImmutableList Y;
    public final int Z;
    public final int aa;
    public final int ab;
    public final ImmutableList ac;
    public final ebd ad;
    public final ImmutableList ae;
    public final int af;
    public final boolean ag;
    public final int ah;
    public final boolean ai;
    public final boolean aj;
    public final boolean ak;
    public final boolean al;
    public final ImmutableMap am;
    public final ImmutableSet an;
    public static final ebf a = new ebf(new ebe());
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);
    public static final String f = edt.Z(5);
    public static final String g = edt.Z(6);
    public static final String h = edt.Z(7);
    public static final String i = edt.Z(8);
    public static final String j = edt.Z(9);
    public static final String k = edt.Z(10);
    public static final String l = edt.Z(11);
    public static final String m = edt.Z(12);
    public static final String n = edt.Z(13);
    public static final String o = edt.Z(14);
    public static final String p = edt.Z(15);
    public static final String q = edt.Z(16);
    public static final String r = edt.Z(17);
    public static final String s = edt.Z(18);
    public static final String t = edt.Z(19);
    public static final String u = edt.Z(20);
    public static final String v = edt.Z(21);
    public static final String w = edt.Z(22);
    public static final String x = edt.Z(23);
    public static final String y = edt.Z(24);
    public static final String z = edt.Z(25);
    public static final String A = edt.Z(26);
    public static final String B = edt.Z(27);
    public static final String C = edt.Z(28);
    public static final String D = edt.Z(29);
    public static final String E = edt.Z(30);
    public static final String F = edt.Z(31);
    public static final String G = edt.Z(32);
    public static final String H = edt.Z(33);
    public static final String I = edt.Z(34);

    public ebf(ebe ebeVar) {
        this.J = ebeVar.a;
        this.K = ebeVar.b;
        this.L = ebeVar.c;
        this.M = ebeVar.d;
        this.N = ebeVar.e;
        this.O = ebeVar.f;
        this.P = ebeVar.g;
        this.Q = ebeVar.h;
        this.R = ebeVar.i;
        this.S = ebeVar.j;
        this.T = ebeVar.k;
        this.U = ebeVar.l;
        this.V = ebeVar.m;
        this.W = ebeVar.n;
        this.X = ebeVar.o;
        this.Y = ebeVar.p;
        this.Z = ebeVar.q;
        this.aa = ebeVar.r;
        this.ab = ebeVar.s;
        this.ac = ebeVar.t;
        this.ad = ebeVar.u;
        this.ae = ebeVar.v;
        this.af = ebeVar.w;
        this.ag = ebeVar.x;
        this.ah = ebeVar.y;
        this.ai = ebeVar.z;
        this.aj = ebeVar.A;
        this.ak = ebeVar.B;
        this.al = ebeVar.C;
        this.am = ImmutableMap.copyOf((Map) ebeVar.D);
        this.an = ImmutableSet.copyOf((Collection) ebeVar.E);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(g, this.J);
        bundle.putInt(h, this.K);
        bundle.putInt(i, this.L);
        bundle.putInt(j, this.M);
        bundle.putInt(k, this.N);
        bundle.putInt(l, this.O);
        bundle.putInt(m, this.P);
        bundle.putInt(n, this.Q);
        bundle.putInt(o, this.R);
        bundle.putInt(p, this.S);
        bundle.putBoolean(H, this.T);
        bundle.putBoolean(q, this.U);
        bundle.putStringArray(r, (String[]) this.V.toArray(new String[0]));
        bundle.putStringArray(G, (String[]) this.W.toArray(new String[0]));
        bundle.putInt(z, this.X);
        bundle.putStringArray(b, (String[]) this.Y.toArray(new String[0]));
        bundle.putInt(c, this.Z);
        bundle.putInt(s, this.aa);
        bundle.putInt(t, this.ab);
        bundle.putStringArray(u, (String[]) this.ac.toArray(new String[0]));
        bundle.putStringArray(d, (String[]) this.ae.toArray(new String[0]));
        bundle.putInt(e, this.af);
        bundle.putBoolean(I, this.ag);
        bundle.putInt(A, this.ah);
        bundle.putBoolean(f, this.ai);
        ebd ebdVar = this.ad;
        String str = B;
        int i2 = ebdVar.e;
        bundle.putInt(str, i2);
        String str2 = C;
        boolean z2 = ebdVar.f;
        bundle.putBoolean(str2, z2);
        String str3 = D;
        boolean z3 = ebdVar.g;
        bundle.putBoolean(str3, z3);
        String str4 = E;
        Bundle bundle2 = new Bundle();
        bundle2.putInt(ebd.b, i2);
        bundle2.putBoolean(ebd.c, z2);
        bundle2.putBoolean(ebd.d, z3);
        bundle.putBundle(str4, bundle2);
        bundle.putBoolean(F, this.aj);
        bundle.putBoolean(v, this.ak);
        bundle.putBoolean(w, this.al);
        bundle.putParcelableArrayList(x, ecm.b(this.am.values(), new dzc(7)));
        bundle.putIntArray(y, sfy.ae(this.an));
        return bundle;
    }

    public ebe b() {
        return new ebe(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ebf ebfVar = (ebf) obj;
            if (this.J == ebfVar.J && this.K == ebfVar.K && this.L == ebfVar.L && this.M == ebfVar.M && this.N == ebfVar.N && this.O == ebfVar.O && this.P == ebfVar.P && this.Q == ebfVar.Q && this.U == ebfVar.U && this.R == ebfVar.R && this.S == ebfVar.S && this.T == ebfVar.T && this.V.equals(ebfVar.V) && this.W.equals(ebfVar.W) && this.X == ebfVar.X && this.Y.equals(ebfVar.Y) && this.Z == ebfVar.Z && this.aa == ebfVar.aa && this.ab == ebfVar.ab && this.ac.equals(ebfVar.ac) && this.ad.equals(ebfVar.ad) && this.ae.equals(ebfVar.ae) && this.af == ebfVar.af && this.ag == ebfVar.ag && this.ah == ebfVar.ah && this.ai == ebfVar.ai && this.aj == ebfVar.aj && this.ak == ebfVar.ak && this.al == ebfVar.al && this.am.equals(ebfVar.am) && this.an.equals(ebfVar.an)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.J + 31) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + (this.U ? 1 : 0)) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0)) * 31) + this.V.hashCode()) * 31) + this.W.hashCode()) * 31) + this.X) * 31) + this.Y.hashCode()) * 31) + this.Z) * 31) + this.aa) * 31) + this.ab) * 31) + this.ac.hashCode()) * 31) + this.ad.hashCode()) * 31) + this.ae.hashCode()) * 31) + this.af) * 31) + (this.ag ? 1 : 0)) * 31) + this.ah) * 31) + (this.ai ? 1 : 0)) * 31) + (this.aj ? 1 : 0)) * 31) + (this.ak ? 1 : 0)) * 31) + (this.al ? 1 : 0)) * 31) + this.am.hashCode()) * 31) + this.an.hashCode();
    }
}
