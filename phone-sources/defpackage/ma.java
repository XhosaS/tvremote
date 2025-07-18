package defpackage;

import android.graphics.Canvas;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ma extends ykt implements yjv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(bdy bdyVar, bdy bdyVar2, bdy bdyVar3, int i) {
        super(1);
        this.d = i;
        this.a = bdyVar;
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ?? r0 = this.a;
            boi boiVar = (boi) obj;
            boiVar.m(r0 != 0 ? ((Number) r0.a()).floatValue() : 1.0f);
            boiVar.t(1.0f);
            boiVar.u(1.0f);
            boiVar.y(bop.a);
            return ygi.a;
        }
        boolean z = true;
        if (i == 1) {
            return new bic((bje) this.b, this.c, (lj) this.a, 1);
        }
        boolean zBooleanValue = false;
        if (i == 2) {
            bln blnVar = (bln) obj;
            if (!blnVar.A) {
                return caj.b;
            }
            if (blnVar.c != null) {
                bty.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            yjv yjvVar = blnVar.a;
            blnVar.c = yjvVar != null ? yjvVar.a(this.a) : null;
            boolean z2 = blnVar.c != null;
            if (z2) {
                ((bln) this.b).g().b.add(blnVar);
            }
            ylb ylbVar = (ylb) this.c;
            if (!ylbVar.a && !z2) {
                z = false;
            }
            ylbVar.a = z;
            return caj.a;
        }
        if (i == 3) {
            cak cakVar = (cak) obj;
            bln blnVar2 = (bln) cakVar;
            if (!((bln) this.b).g().b.contains(blnVar2) || !bga.A(blnVar2, bga.C((kw) this.a))) {
                return caj.a;
            }
            ((ylf) this.c).a = cakVar;
            return caj.c;
        }
        if (i == 4) {
            bmr bmrVar = (bmr) obj;
            if (!yks.e(bmrVar, this.b)) {
                if (yks.e(bmrVar, ((bmh) this.a).b)) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = ((Boolean) this.c.a(bmrVar)).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
        bnp bnpVarB = ((bpq) obj).p().b();
        cmv cmvVar = (cmv) this.b;
        if (cmvVar.c.getVisibility() != 8) {
            Object obj2 = this.a;
            cmvVar.u = true;
            bzz bzzVar = ((bys) obj2).i;
            bzz bzzVar2 = true == (bzzVar instanceof cbc) ? bzzVar : null;
            if (bzzVar2 != null) {
                Object obj3 = this.c;
                Canvas canvasA = bnc.a(bnpVarB);
                ((cbc) bzzVar2).E();
                ((cmv) obj3).draw(canvasA);
            }
            cmvVar.u = false;
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(bje bjeVar, Object obj, lj ljVar, int i) {
        super(1);
        this.d = i;
        this.b = bjeVar;
        this.c = obj;
        this.a = ljVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(kw kwVar, bln blnVar, ylb ylbVar, int i) {
        super(1);
        this.d = i;
        this.a = kwVar;
        this.b = blnVar;
        this.c = ylbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(ylf ylfVar, bln blnVar, kw kwVar, int i) {
        super(1);
        this.d = i;
        this.c = ylfVar;
        this.b = blnVar;
        this.a = kwVar;
    }
}
