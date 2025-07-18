package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqk extends bri {
    public yjv e;
    public float g;
    public float h;
    public float i;
    public float l;
    public float m;
    private float[] o;
    private bni r;
    private final List p = new ArrayList();
    public boolean a = true;
    public long b = bnq.g;
    public List c = brn.a;
    public boolean d = true;
    private final yjv q = new lk(this, 20);
    public String f = "";
    public float j = 1.0f;
    public float k = 1.0f;
    public boolean n = true;

    private final void g() {
        this.a = false;
        this.b = bnq.g;
    }

    private final void h(bnn bnnVar) {
        if (this.a && bnnVar != null) {
            if (bnnVar instanceof bon) {
                i(((bon) bnnVar).a);
            } else {
                g();
            }
        }
    }

    private final void i(long j) {
        if (this.a && j != 16) {
            long j2 = this.b;
            if (j2 == 16) {
                this.b = j;
                return;
            }
            List list = brn.a;
            if (bnq.d(j2) == bnq.d(j) && bnq.c(j2) == bnq.c(j) && bnq.b(j2) == bnq.b(j)) {
                return;
            }
            g();
        }
    }

    private final boolean j() {
        return !this.c.isEmpty();
    }

    @Override // defpackage.bri
    public final yjv a() {
        return this.e;
    }

    @Override // defpackage.bri
    public final void b(bpq bpqVar) {
        if (this.n) {
            float[] fArrE = this.o;
            if (fArrE == null) {
                fArrE = boa.e();
                this.o = fArrE;
            } else {
                boa.c(fArrE);
            }
            boa.g(fArrE, this.l + this.h, this.m + this.i);
            double d = this.g * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = fArrE[0];
            float f2 = fArrE[4];
            float f3 = -fSin;
            float f4 = fArrE[1];
            float f5 = fArrE[5];
            float f6 = fArrE[2];
            float f7 = fArrE[6];
            float f8 = fArrE[3];
            float f9 = fArrE[7];
            fArrE[0] = (fCos * f) + (fSin * f2);
            fArrE[1] = (fCos * f4) + (fSin * f5);
            fArrE[2] = (fCos * f6) + (fSin * f7);
            fArrE[3] = (fCos * f8) + (fSin * f9);
            fArrE[4] = (f * f3) + (f2 * fCos);
            fArrE[5] = (f4 * f3) + (f5 * fCos);
            fArrE[6] = (f6 * f3) + (f7 * fCos);
            fArrE[7] = (f3 * f8) + (fCos * f9);
            boa.f(fArrE, this.j, this.k);
            boa.g(fArrE, -this.h, -this.i);
            this.n = false;
        }
        if (this.d) {
            if (j()) {
                bni bniVar = this.r;
                if (bniVar == null) {
                    bniVar = new bni((byte[]) null);
                    this.r = bniVar;
                }
                brx.e(this.c, bniVar);
            }
            this.d = false;
        }
        bpn bpnVarP = bpqVar.p();
        long jA = bpnVarP.a();
        bpnVarP.b().g();
        try {
            pku pkuVar = bpnVarP.c;
            float[] fArr = this.o;
            if (fArr != null) {
                ((bpn) pkuVar.a).b().b(new boa(fArr).a);
            }
            bni bniVar2 = this.r;
            if (j() && bniVar2 != null) {
                pkuVar.z(bniVar2);
            }
            List list = this.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((bri) list.get(i)).b(bpqVar);
            }
        } finally {
            bpnVarP.b().e();
            bpnVarP.h(jA);
        }
    }

    public final void c(int i, bri briVar) {
        List list = this.p;
        if (i < list.size()) {
            list.set(i, briVar);
        } else {
            list.add(briVar);
        }
        d(briVar);
        briVar.e(this.q);
        f();
    }

    public final void d(bri briVar) {
        if (briVar instanceof bqn) {
            bqn bqnVar = (bqn) briVar;
            h(bqnVar.a);
            h(bqnVar.f);
        } else if (briVar instanceof bqk) {
            bqk bqkVar = (bqk) briVar;
            if (bqkVar.a && this.a) {
                i(bqkVar.b);
            } else {
                g();
            }
        }
    }

    @Override // defpackage.bri
    public final void e(yjv yjvVar) {
        this.e = yjvVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f);
        List list = this.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bri briVar = (bri) list.get(i);
            sb.append("\t");
            sb.append(briVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
