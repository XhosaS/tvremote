package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kii implements yjz {
    final /* synthetic */ kiq a;
    final /* synthetic */ Context b;
    final /* synthetic */ boolean c;
    final /* synthetic */ yjk d;
    final /* synthetic */ kgv e;

    public kii(kiq kiqVar, Context context, boolean z, yjk yjkVar, kgv kgvVar) {
        this.a = kiqVar;
        this.b = context;
        this.c = z;
        this.d = yjkVar;
        this.e = kgvVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        } else {
            khk khkVar = khk.a;
            baoVar.x(-1633490746);
            kiq kiqVar = this.a;
            boolean zH = baoVar.H(kiqVar);
            Context context = this.b;
            boolean zH2 = zH | baoVar.H(context);
            Object objG = baoVar.g();
            if (zH2 || objG == ban.a) {
                objG = new jzx(kiqVar, context, 17);
                baoVar.A(objG);
            }
            baoVar.p();
            khkVar.h((yjk) objG, null, baoVar, 0);
            baoVar.x(5004770);
            boolean zH3 = baoVar.H(kiqVar);
            Object objG2 = baoVar.g();
            if (zH3 || objG2 == ban.a) {
                objG2 = new kic(kiqVar, 20);
                baoVar.A(objG2);
            }
            baoVar.p();
            khkVar.c((yjk) objG2, null, baoVar, 0);
            baoVar.x(-1853672083);
            if (this.c) {
                kik.a.a(this.d, kiqVar, baoVar, 448);
            }
            baoVar.p();
            rdd.P(wv.u(zi.a(bkp.g, 1.0f), 0.0f, 8.0f, 1), 0.0f, wv.K(baoVar).B, baoVar, 6);
            baoVar.x(5004770);
            boolean zH4 = baoVar.H(kiqVar);
            Object objG3 = baoVar.g();
            if (zH4 || objG3 == ban.a) {
                objG3 = new kih(kiqVar, 1);
                baoVar.A(objG3);
            }
            yjk yjkVar = (yjk) objG3;
            baoVar.p();
            kgv kgvVar = this.e;
            khkVar.i(yjkVar, kgvVar == kgv.d, null, baoVar, 0);
            baoVar.x(5004770);
            boolean zH5 = baoVar.H(kiqVar);
            Object objG4 = baoVar.g();
            if (zH5 || objG4 == ban.a) {
                objG4 = new kih(kiqVar, 0);
                baoVar.A(objG4);
            }
            yjk yjkVar2 = (yjk) objG4;
            baoVar.p();
            khkVar.d(yjkVar2, kgvVar == kgv.a, null, baoVar, 0);
        }
        return ygi.a;
    }
}
