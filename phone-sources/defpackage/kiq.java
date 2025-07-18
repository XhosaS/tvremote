package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiq extends dwt {
    public final Context a;
    public final itk b;
    public final yva c;
    public final yva d;
    public final yva e;
    public final yva f;
    public final yvc g;
    private yqe h;
    private final yva i;
    private final yva j;

    public kiq(Context context, itk itkVar, gag gagVar) {
        itkVar.getClass();
        gagVar.getClass();
        this.a = context;
        this.b = itkVar;
        yvc yvcVarA = yvd.a(kgv.a);
        this.g = yvcVarA;
        this.c = new yul(yvcVarA);
        yva yvaVarG = g(itkVar.n(), null, new jxd(18));
        this.d = yvaVarG;
        kio kioVar = new kio(null, 0);
        int i = ytx.a;
        this.e = g(new yvp(kioVar, yvaVarG), false, new kil(1));
        yva yvaVarG2 = g(yvaVarG, null, new kil(0));
        this.i = yvaVarG2;
        g(new yvp(new kio((yih) null, 2, (char[]) null), yvaVarG2), false, new kil(2));
        yva yvaVarG3 = g(new yvp(new kio((yih) null, 3, (short[]) null), yvaVarG2), null, new kil(3));
        this.j = yvaVarG3;
        this.f = g(new isv(yvaVarG3, 3), false, new kil(4));
        ykr.q(dwu.a(this), null, 0, new jbb(this, (yih) null, 18), 3);
    }

    private final yva g(ysx ysxVar, Object obj, yjv yjvVar) {
        return vyf.w(new ipi(ysxVar, yjvVar, 8), dwu.a(this), yut.a(5000L, 2), obj);
    }

    private final void h(int i) {
        a(new abs(i, 4));
    }

    private final void i(kgv kgvVar) {
        ykr.q(dwu.a(this), null, 0, new iyc(this, kgvVar, (yih) null, 7), 3);
    }

    public final void a(yjv yjvVar) {
        ykr.q(dwu.a(this), null, 0, new iyc(this, yjvVar, (yih) null, 5), 3);
    }

    public final void b(kgl kglVar) {
        int i = 19;
        if (kglVar instanceof kgi) {
            h(19);
            return;
        }
        int i2 = 20;
        if (kglVar instanceof kgc) {
            h(20);
            return;
        }
        if (kglVar instanceof kge) {
            h(21);
            return;
        }
        if (kglVar instanceof kgh) {
            h(22);
            return;
        }
        if (kglVar instanceof kgb) {
            h(23);
            return;
        }
        if (kglVar instanceof kga) {
            h(4);
            return;
        }
        if (kglVar instanceof kgd) {
            h(3);
            return;
        }
        if (kglVar instanceof kgf) {
            a(new kil(5));
            return;
        }
        if (kglVar instanceof kgk) {
            a(new kil(6));
        } else if (kglVar instanceof kgj) {
            a(new jxd(i));
        } else {
            if (!(kglVar instanceof kgg)) {
                throw new yfu();
            }
            a(new jxd(i2));
        }
    }

    public final void c(kgq kgqVar) {
        if (kgqVar instanceof kgo) {
            i(kgv.d);
        } else if (kgqVar instanceof kgn) {
            i(kgv.a);
        } else {
            if (!(kgqVar instanceof kgp)) {
                throw new yfu();
            }
            i(kgv.c);
        }
    }

    public final void e(kgt kgtVar) {
        if (kgtVar instanceof kgr) {
            this.b.h();
            return;
        }
        if (!(kgtVar instanceof kgs)) {
            throw new yfu();
        }
        yqe yqeVar = this.h;
        if (yqeVar != null) {
            yqeVar.t(null);
        }
        this.h = ykr.q(dwu.a(this), null, 0, new kim(this, (yih) null, 0), 3);
    }

    public final void f(kgm kgmVar) {
        ykr.q(dwu.a(this), null, 0, new iyc(kgmVar, this, (yih) null, 6), 3);
    }
}
