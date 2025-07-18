package defpackage;

import android.support.v7.widget.ActivityChooserView;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aey implements yjz {
    final /* synthetic */ aic a;
    final /* synthetic */ chc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ akb e;
    final /* synthetic */ alg f;
    final /* synthetic */ bnn g;
    final /* synthetic */ boolean h;
    final /* synthetic */ sj i;
    final /* synthetic */ uv j;
    final /* synthetic */ boolean k;
    final /* synthetic */ afw l;
    final /* synthetic */ lhr m;
    final /* synthetic */ nxb n;

    public aey(aic aicVar, lhr lhrVar, chc chcVar, boolean z, boolean z2, akb akbVar, alg algVar, bnn bnnVar, boolean z3, sj sjVar, uv uvVar, nxb nxbVar, boolean z4, afw afwVar) {
        this.a = aicVar;
        this.m = lhrVar;
        this.b = chcVar;
        this.c = z;
        this.d = z2;
        this.e = akbVar;
        this.f = algVar;
        this.g = bnnVar;
        this.h = z3;
        this.i = sjVar;
        this.j = uvVar;
        this.n = nxbVar;
        this.k = z4;
        this.l = afwVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [bdy, java.lang.Object] */
    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int i;
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (baoVar.L((iIntValue & 3) != 2, iIntValue & 1)) {
            aic aicVar = this.a;
            if (aicVar instanceof aia) {
                i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            } else {
                i = 1;
            }
            lhr lhrVar = this.m;
            bkp bkpVarK = zi.k(bkp.g, ((cma) lhrVar.g.a()).a, 0.0f, 2);
            chc chcVar = this.b;
            bkp bkpVarX = bga.x(bdi.E(bdi.E(bkpVarK, new dnu(i, chcVar, 1)), new ro(chcVar, 6)));
            boolean z = this.c;
            boolean z2 = this.d;
            akb akbVar = this.e;
            alg algVar = this.f;
            bnn bnnVar = this.g;
            boolean z3 = this.h;
            bkp bkpVarA = bkpVarX.a(new TextFieldCoreModifier(z, z2, lhrVar, akbVar, algVar, bnnVar, z3, this.i, this.j, this.n));
            boolean z4 = this.k;
            afw afwVar = this.l;
            bvt bvtVarA = xo.a(bkb.a, true);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar);
            } else {
                baoVar.B();
            }
            beb.a(baoVar, bvtVarA, bxt.d);
            beb.a(baoVar, bhuVarO, bxt.c);
            yjz yjzVar = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            xo.b(new TextFieldTextLayoutModifier(lhrVar, akbVar, chcVar, z4, afwVar), baoVar, 0);
            if (z3 && z && algVar.I()) {
                baoVar.x(-810654004);
                afc.b(algVar, baoVar, 0);
                baoVar.x(-810526873);
                afc.a(algVar, baoVar, 0);
                baoVar.p();
                baoVar.p();
            } else {
                baoVar.x(-810390690);
                baoVar.p();
            }
            baoVar.o();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
