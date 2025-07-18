package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyn implements yka {
    final /* synthetic */ cfy a;
    final /* synthetic */ Context b;
    final /* synthetic */ yjk c;

    public jyn(cfy cfyVar, Context context, yjk yjkVar) {
        this.a = cfyVar;
        this.b = context;
        this.c = yjkVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((xx) obj).getClass();
        if ((iIntValue & 17) == 16 && baoVar.K()) {
            baoVar.t();
        } else {
            xf xfVar = xk.e;
            bkc bkcVar = bkb.k;
            bkm bkmVar = bkp.g;
            bkp bkpVarQ = wv.q(bkmVar, 24.0f, 20.0f);
            cfy cfyVar = this.a;
            Object obj4 = this.b;
            bvt bvtVarA = xu.a(xfVar, bkcVar, baoVar, 54);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarQ);
            yjk yjkVar = bxt.a;
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar);
            } else {
                baoVar.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVar, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVar, bhuVarO, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
                Object objValueOf = Integer.valueOf(iK);
                baoVar.A(objValueOf);
                baoVar.i(objValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVar, bkpVarC, yjzVar4);
            asg.a(ccf.y(R.drawable.ic_mobile_friendly_24dp, baoVar, 0), "", null, wv.K(baoVar).a, baoVar, 48, 4);
            axa.b(ccf.w(R.string.parental_controls_dialog_title, baoVar), wv.u(bkmVar, 0.0f, 6.0f, 1), wv.K(baoVar).a, 0L, null, 0L, new clk(), 0L, 0, false, 0, 0, null, wv.N(baoVar).h, baoVar, 48, 0, 130040);
            chc chcVarV = chc.v(wv.N(baoVar).k, wv.K(baoVar).s, 0L, null, null, null, 0L, 0L, null, null, 16777214);
            baoVar.x(-1633490746);
            boolean zF = baoVar.F(cfyVar) | baoVar.H(obj4);
            Object objG = baoVar.g();
            if (zF || objG == ban.a) {
                objG = new jzu(cfyVar, obj4, 1);
                baoVar.A(objG);
            }
            baoVar.p();
            hp.l(cfyVar, null, chcVarV, false, 0, 0, null, (yjv) objG, baoVar, 0);
            baoVar.o();
            xe xeVar = xk.b;
            bkp bkpVarA = zi.a(bkmVar, 1.0f);
            Object obj5 = this.c;
            bvt bvtVarA2 = zf.a(xeVar, bkb.m, baoVar, 6);
            int iK2 = a.k(zy.p(baoVar));
            bhu bhuVarO2 = baoVar.O();
            bkp bkpVarC2 = bdi.C(baoVar, bkpVarA);
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar);
            } else {
                baoVar.B();
            }
            beb.a(baoVar, bvtVarA2, yjzVar);
            beb.a(baoVar, bhuVarO2, yjzVar2);
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK2))) {
                Object objValueOf2 = Integer.valueOf(iK2);
                baoVar.A(objValueOf2);
                baoVar.i(objValueOf2, yjzVar3);
            }
            beb.a(baoVar, bkpVarC2, yjzVar4);
            baoVar.x(5004770);
            boolean zF2 = baoVar.F(obj5);
            Object objG2 = baoVar.g();
            if (zF2 || objG2 == ban.a) {
                objG2 = new jwz(obj5, 17);
                baoVar.A(objG2);
            }
            baoVar.p();
            kv.I((yjk) objG2, null, jya.a, baoVar, 510);
            baoVar.o();
        }
        return ygi.a;
    }
}
