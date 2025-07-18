package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jym implements yka {
    final /* synthetic */ yjk a;
    final /* synthetic */ Context b;

    public jym(yjk yjkVar, Context context) {
        this.a = yjkVar;
        this.b = context;
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
                Integer numValueOf = Integer.valueOf(iK);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVar, bkpVarC, yjzVar4);
            asg.a(ccf.y(R.drawable.ic_info_24dp, baoVar, 0), "", null, wv.K(baoVar).a, baoVar, 48, 4);
            axa.b(ccf.w(R.string.screen_lock_dialog_title, baoVar), wv.u(bkmVar, 0.0f, 6.0f, 1), wv.K(baoVar).a, 0L, null, 0L, new clk(), 0L, 0, false, 0, 0, null, wv.N(baoVar).h, baoVar, 48, 0, 130040);
            axa.b(ccf.w(R.string.screen_lock_dialog_subtitle, baoVar), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, chc.v(wv.N(baoVar).k, wv.K(baoVar).s, 0L, null, null, null, 0L, 0L, null, null, 16777214), baoVar, 0, 0, 131070);
            baoVar.o();
            xe xeVar = xk.b;
            bkp bkpVarV = wv.v(zi.a(bkmVar, 1.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            yjk yjkVar2 = this.a;
            Context context = this.b;
            bvt bvtVarA2 = zf.a(xeVar, bkb.m, baoVar, 6);
            int iK2 = a.k(zy.p(baoVar));
            bhu bhuVarO2 = baoVar.O();
            bkp bkpVarC2 = bdi.C(baoVar, bkpVarV);
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
                Integer numValueOf2 = Integer.valueOf(iK2);
                baoVar.A(numValueOf2);
                baoVar.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVar, bkpVarC2, yjzVar4);
            baoVar.x(5004770);
            boolean zF = baoVar.F(yjkVar2);
            Object objG = baoVar.g();
            if (zF || objG == ban.a) {
                objG = new jwz(yjkVar2, 16);
                baoVar.A(objG);
            }
            baoVar.p();
            kv.I((yjk) objG, null, jya.b, baoVar, 510);
            baoVar.x(-1633490746);
            boolean zH = baoVar.H(context) | baoVar.F(yjkVar2);
            Object objG2 = baoVar.g();
            if (zH || objG2 == ban.a) {
                objG2 = new isg(context, yjkVar2, 17);
                baoVar.A(objG2);
            }
            baoVar.p();
            kv.I((yjk) objG2, null, jya.c, baoVar, 510);
            baoVar.o();
        }
        return ygi.a;
    }
}
