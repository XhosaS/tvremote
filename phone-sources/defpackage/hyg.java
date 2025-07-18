package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyg implements Cloneable {
    public hyq A;
    public Float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public iom L;
    public long a = 0;
    public hyq b;
    public Float c;
    public hyq d;
    public Float e;
    public hxr f;
    public Float g;
    public hxr[] h;
    public hxr i;
    public Float j;
    public hxi k;
    public List l;
    public hxr m;
    public Integer n;
    public Boolean o;
    public String p;
    public String q;
    public String r;
    public Boolean s;
    public Boolean t;
    public hyq u;
    public Float v;
    public String w;
    public String x;
    public hyq y;
    public Float z;

    public static hyg a() {
        hyg hygVar = new hyg();
        hygVar.a = -1L;
        hxi hxiVar = hxi.a;
        hygVar.b = hxiVar;
        hygVar.C = 1;
        Float fValueOf = Float.valueOf(1.0f);
        hygVar.c = fValueOf;
        hygVar.d = null;
        hygVar.e = fValueOf;
        hygVar.f = new hxr(1.0f);
        hygVar.D = 1;
        hygVar.E = 1;
        hygVar.g = Float.valueOf(4.0f);
        hygVar.h = null;
        hygVar.i = new hxr(0.0f);
        hygVar.j = fValueOf;
        hygVar.k = hxiVar;
        hygVar.l = null;
        hygVar.m = new hxr(12.0f, 7);
        hygVar.n = 400;
        hygVar.F = 1;
        hygVar.G = 1;
        hygVar.H = 1;
        hygVar.I = 1;
        hygVar.o = true;
        hygVar.L = null;
        hygVar.p = null;
        hygVar.q = null;
        hygVar.r = null;
        hygVar.s = Boolean.TRUE;
        hygVar.t = Boolean.TRUE;
        hygVar.u = hxiVar;
        hygVar.v = fValueOf;
        hygVar.w = null;
        hygVar.J = 1;
        hygVar.x = null;
        hygVar.y = null;
        hygVar.z = fValueOf;
        hygVar.A = null;
        hygVar.B = fValueOf;
        hygVar.K = 1;
        return hygVar;
    }

    protected final Object clone() {
        try {
            hyg hygVar = (hyg) super.clone();
            hxr[] hxrVarArr = this.h;
            if (hxrVarArr != null) {
                hygVar.h = (hxr[]) hxrVarArr.clone();
            }
            return hygVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
