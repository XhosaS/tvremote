package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvg implements bwx, bvv {
    final /* synthetic */ bvp a;
    private final /* synthetic */ bvj b;

    public bvg(bvp bvpVar) {
        this.a = bvpVar;
        this.b = bvpVar.f;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.b.b;
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.b.c;
    }

    @Override // defpackage.buz
    public final boolean cA() {
        return this.b.cA();
    }

    @Override // defpackage.bvv
    public final bvu cB(int i, int i2, Map map, yjv yjvVar) {
        return this.b.cB(i, i2, map, yjvVar);
    }

    @Override // defpackage.cmd
    public final float cn(long j) {
        return cme.e(this.b, j);
    }

    @Override // defpackage.clx
    public final float co(float f) {
        return cme.g(this.b, f);
    }

    @Override // defpackage.clx
    public final float cp(int i) {
        return cme.h(this.b, i);
    }

    @Override // defpackage.clx
    public final float cq(long j) {
        return cme.i(this.b, j);
    }

    @Override // defpackage.clx
    public final float cr(float f) {
        return cme.j(this.b, f);
    }

    @Override // defpackage.clx
    public final int cu(float f) {
        return cme.k(this.b, f);
    }

    @Override // defpackage.clx
    public final long cv(long j) {
        return cme.l(this.b, j);
    }

    @Override // defpackage.clx
    public final long cw(long j) {
        return cme.m(this.b, j);
    }

    @Override // defpackage.cmd
    public final long cx(float f) {
        return cme.f(this.b, f);
    }

    @Override // defpackage.clx
    public final long cy(float f) {
        return cme.n(this.b, f);
    }

    @Override // defpackage.bvv
    public final bvu cz(int i, int i2, Map map, yjv yjvVar) {
        return fh.U(this.b, i, i2, map, yjvVar);
    }

    @Override // defpackage.buz
    public final cmi n() {
        return this.b.a;
    }

    @Override // defpackage.bwx
    public final List q(Object obj, yjz yjzVar) {
        bvp bvpVar = this.a;
        bys bysVar = (bys) bvpVar.m.a(obj);
        if (bysVar != null && bvpVar.a.u().indexOf(bysVar) < bvpVar.d) {
            return bysVar.s();
        }
        bfz bfzVar = bvpVar.h;
        if (bfzVar.b < bvpVar.e) {
            bty.b("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = bfzVar.b;
        int i2 = bvpVar.e;
        if (i == i2) {
            bfzVar.o(obj);
        } else {
            bfzVar.e(i2, obj);
        }
        bvpVar.e++;
        ki kiVar = bvpVar.n;
        if (ki.e(kiVar, obj)) {
            bys bysVar2 = (bys) kiVar.a(obj);
            bvh bvhVar = bysVar2 != null ? (bvh) bvpVar.l.a(bysVar2) : null;
            if (bvhVar != null && bvhVar.c) {
                bvpVar.l(bysVar2, obj, yjzVar);
            }
        } else {
            bvpVar.o.j(obj, bvpVar.d(obj, yjzVar));
            bys bysVar3 = bvpVar.a;
            if (bysVar3.av() == 3) {
                bysVar3.R(true);
            } else {
                bys.ao(bysVar3, true, 6);
            }
        }
        bys bysVar4 = (bys) kiVar.a(obj);
        if (bysVar4 == null) {
            return yhb.a;
        }
        List listR = bysVar4.m().r();
        int size = listR.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bzh) listR.get(i3)).f.b = true;
        }
        return listR;
    }
}
