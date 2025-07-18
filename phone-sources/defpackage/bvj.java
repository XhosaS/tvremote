package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvj implements bwx {
    public cmi a = cmi.b;
    public float b;
    public float c;
    final /* synthetic */ bvp d;

    public bvj(bvp bvpVar) {
        this.d = bvpVar;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.b;
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.c;
    }

    @Override // defpackage.buz
    public final boolean cA() {
        bys bysVar = this.d.a;
        return bysVar.av() == 4 || bysVar.av() == 2;
    }

    @Override // defpackage.bvv
    public final bvu cB(int i, int i2, Map map, yjv yjvVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bty.c(a.cn(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new bvi(i, i2, map, this, this.d, yjvVar);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ float cn(long j) {
        return cme.e(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float co(float f) {
        return cme.g(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cp(int i) {
        return cme.h(this, i);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cq(long j) {
        return cme.i(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cr(float f) {
        return cme.j(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ int cu(float f) {
        return cme.k(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cv(long j) {
        return cme.l(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cw(long j) {
        return cme.m(this, j);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ long cx(float f) {
        return cme.f(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cy(float f) {
        return cme.n(this, f);
    }

    @Override // defpackage.bvv
    public final /* synthetic */ bvu cz(int i, int i2, Map map, yjv yjvVar) {
        return fh.U(this, i, i2, map, yjvVar);
    }

    @Override // defpackage.buz
    public final cmi n() {
        return this.a;
    }

    @Override // defpackage.bwx
    public final List q(Object obj, yjz yjzVar) {
        bvp bvpVar = this.d;
        bvpVar.i();
        bys bysVar = bvpVar.a;
        int iAv = bysVar.av();
        if (iAv != 1 && iAv != 3 && iAv != 2 && iAv != 4) {
            bty.c("subcompose can only be used inside the measure or layout blocks");
        }
        ki kiVar = bvpVar.m;
        Object objA = kiVar.a(obj);
        if (objA == null) {
            objA = (bys) bvpVar.n.g(obj);
            if (objA != null) {
                if (bvpVar.j <= 0) {
                    bty.c("Check failed.");
                }
                bvpVar.j--;
            } else {
                objA = bvpVar.f(obj);
                if (objA == null) {
                    objA = bvpVar.e(bvpVar.d);
                }
            }
            kiVar.j(obj, objA);
        }
        bys bysVar2 = (bys) objA;
        if (yfm.V(bysVar.u(), bvpVar.d) != bysVar2) {
            int iIndexOf = bysVar.u().indexOf(bysVar2);
            if (iIndexOf < bvpVar.d) {
                bty.b(a.cj(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int i = bvpVar.d;
            if (i != iIndexOf) {
                bvpVar.k(iIndexOf, i);
            }
        }
        bvpVar.d++;
        bvpVar.l(bysVar2, obj, yjzVar);
        return (iAv == 1 || iAv == 3) ? bysVar2.s() : bysVar2.r();
    }
}
