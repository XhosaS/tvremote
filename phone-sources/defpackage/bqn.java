package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqn extends bri {
    public bnn a;
    public float e;
    public bnn f;
    public float j;
    public float l;
    public boolean o;
    public bni p;
    private bpt q;
    private final yft r;
    private final bni s;
    public float b = 1.0f;
    public List c = brn.a;
    public float d = 1.0f;
    public int g = 0;
    public int h = 0;
    public float i = 4.0f;
    public float k = 1.0f;
    public boolean m = true;
    public boolean n = true;

    public bqn() {
        bni bniVar = new bni((byte[]) null);
        this.s = bniVar;
        this.p = bniVar;
        this.r = ybn.g(3, bmf.c);
    }

    private final void c() {
        if (this.j == 0.0f && this.k == 1.0f) {
            this.p = this.s;
            return;
        }
        bni bniVar = this.p;
        bni bniVar2 = this.s;
        if (yks.e(bniVar, bniVar2)) {
            this.p = new bni((byte[]) null);
        } else {
            int iA = this.p.a();
            this.p.l();
            this.p.m(iA);
        }
        d().p(bniVar2);
        float fN = d().n();
        float f = this.j;
        float f2 = this.l;
        float f3 = ((f + f2) % 1.0f) * fN;
        float f4 = ((this.k + f2) % 1.0f) * fN;
        if (f3 <= f4) {
            d().o(f3, f4, this.p);
        } else {
            d().o(f3, fN, this.p);
            d().o(0.0f, f4, this.p);
        }
    }

    private final kw d() {
        return (kw) this.r.a();
    }

    @Override // defpackage.bri
    public final void b(bpq bpqVar) {
        bpq bpqVar2;
        bpt bptVar;
        if (this.m) {
            brx.e(this.c, this.s);
            c();
        } else if (this.o) {
            c();
        }
        this.m = false;
        this.o = false;
        bnn bnnVar = this.a;
        if (bnnVar != null) {
            bpqVar2 = bpqVar;
            brx.J(bpqVar2, this.p, bnnVar, this.b, null, 56);
        } else {
            bpqVar2 = bpqVar;
        }
        bnn bnnVar2 = this.f;
        if (bnnVar2 != null) {
            bpt bptVar2 = this.q;
            if (this.n || bptVar2 == null) {
                bpt bptVar3 = new bpt(this.e, this.i, this.g, this.h, 16);
                this.q = bptVar3;
                this.n = false;
                bptVar = bptVar3;
            } else {
                bptVar = bptVar2;
            }
            brx.J(bpqVar2, this.p, bnnVar2, this.d, bptVar, 48);
        }
    }

    public final String toString() {
        return this.s.toString();
    }
}
