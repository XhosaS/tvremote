package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.googletv.app.presentation.widgets.actions.SearchClickActionV2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klm extends dlj {
    public static final long b = a.j(648.0f, 440.0f);
    public static final long c = a.j(464.0f, 440.0f);
    public static final long d = a.j(350.0f, 300.0f);
    public static final long e = a.j(100.0f, 200.0f);
    private static final oqe l = oqe.y;
    public Context f;
    public iyz i;
    public kgu j;
    public mdw k;
    private final dmq m = new dmq(yfm.aZ(new cmc[]{new cmc(e), new cmc(d), new cmc(c), new cmc(b)}));
    public final djo g = new dna(SearchClickActionV2.class, cry.i(new djr[0]));
    public int h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    @Override // defpackage.dlj
    public final /* synthetic */ dms a() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r8.g(true, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        if (defpackage.cwm.B(r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.content.Context r8, defpackage.yih r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klm.d(android.content.Context, yih):java.lang.Object");
    }

    public final djo f(String str) {
        ConcurrentHashMap concurrentHashMap = opz.a;
        Context context = this.f;
        if (context == null) {
            yks.c("context");
            context = null;
        }
        Intent intentPutExtra = jbr.V(context).putExtra("referrer", "widget_referrer");
        intentPutExtra.getClass();
        osk.k(intentPutExtra, l, str);
        return new dng(intentPutExtra, cry.i(new djr[0]));
    }

    public final void g(djh djhVar, wli wliVar, bao baoVar, int i) {
        int i2;
        djhVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1086328025);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(wliVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            cyf.m(djhVar, 1, 1, bga.k(-780361615, new khb(wliVar, 7), baoVarD), baoVarD, (i2 & 14) | 3072, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, djhVar, wliVar, i, 13);
        }
    }

    public final void h(bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1583026333);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            cyf.m(cyf.l(cyg.j(djh.b)), 1, 1, bga.k(-217105561, new azi((Context) baoVarD.f(diy.b), this, 7), baoVarD), baoVarD, 3072, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kny(this, i, i4);
        }
    }

    public final void i(djh djhVar, kly klyVar, boolean z, bao baoVar, int i) {
        int i2;
        djhVar.getClass();
        klyVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1350676351);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(klyVar) : baoVarD.H(klyVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            cyf.m(djhVar, 0, 0, bga.k(-989897013, new kfa(this, z, klyVar, 2), baoVarD), baoVarD, (i2 & 14) | 3072, 6);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(this, djhVar, klyVar, z, i, 13);
        }
    }

    public final void j(bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1236100309);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 20;
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(diy.b);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(false, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar.aa();
            baoVarD.x(1813548816);
            if (((Boolean) bcbVar.a()).booleanValue()) {
                h(baoVarD, i2 & 14);
                basVar.aa();
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new nu(this, i, 19);
                    return;
                }
                return;
            }
            basVar.aa();
            cyf.n(cyg.j(djh.b), dro.c, bga.k(1353269517, new kie(context, 2), baoVarD), baoVarD, 384);
            ygi ygiVar = ygi.a;
            baoVarD.x(5004770);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new jbb(bcbVar, (yih) null, 20);
                basVar.ae(objT2);
            }
            basVar.aa();
            bbn.f(ygiVar, (yjz) objT2, baoVarD);
        }
        bcr bcrVarM2 = baoVarD.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new nu(this, i, i4);
        }
    }

    public final void k(djh djhVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1715319115);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            cyf.n(djhVar, dro.c, bga.k(1546791977, new kie(this, 3), baoVarD), baoVarD, (i2 & 14) | 384);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(this, djhVar, i, i4);
        }
    }

    public final void l(djh djhVar, bao baoVar, int i) {
        int i2;
        djh djhVar2;
        djhVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-606966194);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            djhVar2 = djhVar;
        } else {
            djhVar2 = djhVar;
            cyf.m(djhVar2, 0, 1, bga.k(666082244, new khb(this, 8), baoVarD), baoVarD, (i2 & 14) | 3072, 2);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(this, djhVar2, i, 3);
        }
    }

    public final void m(woy woyVar, djh djhVar, djl djlVar, boolean z, bao baoVar, int i) {
        int i2;
        djo djoVarF;
        woyVar.getClass();
        djhVar.getClass();
        djlVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-543616625);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(woyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(djhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(djlVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(this) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (z) {
                Intent intent = new Intent("com.google.android.apps.googletv.ACTION_BROADCAST");
                Context context = this.f;
                if (context == null) {
                    yks.c("context");
                    context = null;
                }
                intent.setPackage(context.getPackageName());
                wkg wkgVar = woyVar.e;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                jbr.R(intent, wkgVar);
                intent.putExtra("referrer", "widget_referrer");
                intent.addFlags(268435456);
                ConcurrentHashMap concurrentHashMap = opz.a;
                osk.k(intent, l, "topPicksCard");
                djoVarF = new dnf(intent);
            } else {
                djoVarF = f("topPicksCard");
            }
            cyf.m(cry.k(djhVar, djoVarF), 0, 0, bga.k(-673906471, new kfa(woyVar, djlVar, z, 3), baoVarD), baoVarD, 3072, 6);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kes(this, woyVar, djhVar, djlVar, z, i, 6);
        }
    }

    public final void n(final djh djhVar, final List list, final int i, final boolean z, final boolean z2, bao baoVar, final int i2) {
        int i3;
        djhVar.getClass();
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(1950373696);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(djhVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.H(list) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.D(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.G(z) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.G(z2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != baoVarD.H(this) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && baoVarD.K()) {
            baoVarD.t();
        } else {
            krd.b("Card size: " + list.size());
            final ylb ylbVar = new ylb();
            ylbVar.a = true;
            final ylb ylbVar2 = new ylb();
            ylbVar2.a = z;
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            cwr.h(djhVar, new yjv() { // from class: klh
                @Override // defpackage.yjv
                public final Object a(Object obj) {
                    pku pkuVar = (pku) obj;
                    pkuVar.getClass();
                    yld yldVar = new yld();
                    List list2 = list;
                    klm klmVar = this;
                    List list3 = arrayList;
                    List list4 = arrayList2;
                    ylb ylbVar3 = ylbVar2;
                    ylb ylbVar4 = ylbVar;
                    boolean z3 = z2;
                    bhq bhqVar = new bhq(110504008, true, new klj(yldVar, list2, klmVar, list3, list4, ylbVar3, i, ylbVar4, z3));
                    cjp cjpVar = new cjp(13);
                    for (int i5 = 0; i5 < 10; i5++) {
                        pkuVar.t(((Number) cjpVar.a(Integer.valueOf(i5))).longValue(), new bhq(499182208, true, new dnu(bhqVar, i5, 0)));
                    }
                    if (z3) {
                        pkuVar.t(Long.MIN_VALUE, new bhq(-1867473576, true, new khb(klmVar, 9)));
                    }
                    return ygi.a;
                }
            }, baoVarD, i3 & 14);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kli
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    klm klmVar = this.a;
                    djh djhVar2 = djhVar;
                    List list2 = list;
                    int i5 = i;
                    boolean z3 = z;
                    klmVar.n(djhVar2, list2, i5, z3, z2, (bao) obj, bdi.n(i2 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public final void o(djh djhVar, List list, List list2, boolean z, boolean z2, bao baoVar, int i) {
        int i2;
        djhVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1074242279);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(list2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.G(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(this) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && baoVarD.K()) {
            baoVarD.t();
        } else {
            cyg.n(djhVar, bga.k(-1035913931, new aef(list, z, this, list2, z2, 2), baoVarD), baoVarD, (i2 & 14) | 3072);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khl(this, djhVar, list, list2, z, z2, i, 2);
        }
    }

    public final void p(djh djhVar, boolean z, bao baoVar, int i) {
        int i2;
        djhVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1403558503);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(this) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            cyg.n(djhVar, bga.k(1147174141, new kfc(z, this, 2), baoVarD), baoVarD, (i2 & 14) | 3072);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aly(this, djhVar, z, i, 6);
        }
    }

    public final void q() {
        if (this.j != null) {
            return;
        }
        yks.c("widgetBitmapManager");
    }

    public final mdw r() {
        mdw mdwVar = this.k;
        if (mdwVar != null) {
            return mdwVar;
        }
        yks.c("widgetManager");
        return null;
    }
}
