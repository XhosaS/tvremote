package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class vi implements yjz {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vi(joz jozVar, jgv jgvVar, wpm wpmVar, int i) {
        this.d = i;
        this.c = jozVar;
        this.b = jgvVar;
        this.a = wpmVar;
    }

    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, yow] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        View view;
        int i = this.d;
        if (i == 0) {
            float fFloatValue = ((Float) obj).floatValue();
            ((Float) obj2).floatValue();
            ylc ylcVar = (ylc) this.a;
            float f = fFloatValue - ylcVar.a;
            vx vxVar = (vx) this.b;
            ylcVar.a += vxVar.a(vxVar.b(((pku) this.c).F(vxVar.f(vxVar.a(f)))));
            return ygi.a;
        }
        if (i == 1) {
            bsz bszVar = (bsz) obj;
            bmx bmxVar = (bmx) obj2;
            ty tyVar = (ty) this.c;
            bvc bvcVar = tyVar.g;
            if (bvcVar != null) {
                Object obj3 = this.a;
                long jS = bty.s(bvcVar);
                yle yleVar = (yle) obj3;
                long j = yleVar.a;
                if (!a.s(jS, j)) {
                    tyVar.f = a.D(tyVar.f, a.at(jS, j));
                }
                yleVar.a = jS;
            }
            bty.g((btv) this.b, bszVar, tyVar.f);
            yrz yrzVar = tyVar.d;
            if (yrzVar != null) {
                yrzVar.b(new tl(bmxVar.a));
            }
            return ygi.a;
        }
        if (i == 2) {
            bsz bszVar2 = (bsz) obj;
            long j2 = ((bmx) obj2).a;
            yle yleVar2 = (yle) this.b;
            long jD = a.D(yleVar2.a, j2);
            yleVar2.a = jD;
            Object obj4 = this.a;
            afo afoVar = afo.a;
            long jD2 = a.D(((yle) obj4).a, jD);
            alg algVar = (alg) this.c;
            algVar.F(afoVar, jD2);
            if (algVar.J(algVar.a())) {
                bszVar2.b();
                brs brsVar = algVar.g;
                if (brsVar != null) {
                    brsVar.a(9);
                }
            }
            return ygi.a;
        }
        if (i == 3) {
            float fFloatValue2 = ((Float) obj).floatValue();
            ((Float) obj2).floatValue();
            ykr.q(this.a, null, 0, new fyn(fFloatValue2, (op) this.c, (fwr) this.b, (yih) null, 0), 3);
            return ygi.a;
        }
        if (i != 4) {
            View view2 = (View) obj2;
            ((jhs) obj).getClass();
            view2.getClass();
            lid lidVarA = lid.a();
            Object parent = view2.getParent();
            view = parent instanceof View ? (View) parent : null;
            Object obj5 = this.b;
            if (view != null) {
                ((jgv) obj5).b.d(view, hju.x(lidVarA));
            }
            joz jozVar = (joz) this.c;
            if (jozVar.i() != null) {
                Object obj6 = this.a;
                jan janVar = ((jgv) obj5).i;
                Context contextAj = a.aj(view2);
                wll wllVarG = jgv.g(jozVar);
                wnp wnpVarI = jozVar.i();
                wnpVarI.getClass();
                janVar.s(contextAj, wllVarG, wnpVarI, (wpm) obj6, false);
            }
            return ygi.a;
        }
        View view3 = (View) obj2;
        ((jhs) obj).getClass();
        view3.getClass();
        lid lidVarA2 = lid.a();
        Object parent2 = view3.getParent();
        view = parent2 instanceof View ? (View) parent2 : null;
        Object obj7 = this.b;
        if (view != null) {
            ((jgv) obj7).b.d(view, hju.x(lidVarA2));
        }
        joz jozVar2 = (joz) this.c;
        if (jozVar2.i() != null) {
            Object obj8 = this.a;
            jan janVar2 = ((jgv) obj7).i;
            Context contextAj2 = a.aj(view3);
            wll wllVarG2 = jgv.g(jozVar2);
            wnp wnpVarI2 = jozVar2.i();
            wnpVarI2.getClass();
            janVar2.s(contextAj2, wllVarG2, wnpVarI2, (wpm) obj8, false);
        }
        return ygi.a;
    }

    public /* synthetic */ vi(ty tyVar, yle yleVar, btv btvVar, int i) {
        this.d = i;
        this.c = tyVar;
        this.a = yleVar;
        this.b = btvVar;
    }

    public /* synthetic */ vi(ylc ylcVar, vx vxVar, pku pkuVar, int i) {
        this.d = i;
        this.a = ylcVar;
        this.b = vxVar;
        this.c = pkuVar;
    }

    public /* synthetic */ vi(yle yleVar, alg algVar, yle yleVar2, int i) {
        this.d = i;
        this.b = yleVar;
        this.c = algVar;
        this.a = yleVar2;
    }

    public /* synthetic */ vi(yow yowVar, op opVar, fwr fwrVar, int i) {
        this.d = i;
        this.a = yowVar;
        this.c = opVar;
        this.b = fwrVar;
    }
}
