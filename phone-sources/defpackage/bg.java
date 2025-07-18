package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bg implements yjk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bg(bdy bdyVar, aan aanVar, bhi bhiVar, int i) {
        this.d = i;
        this.a = bdyVar;
        this.c = aanVar;
        this.b = bhiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v80, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v88, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v91, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, tb] */
    /* JADX WARN: Type inference failed for: r2v16, types: [bvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r2v37, types: [bfq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, yow] */
    @Override // defpackage.yjk
    public final Object a() throws Throwable {
        tf tfVar;
        bmy bmyVarF;
        Object objA;
        int i = 13;
        int i2 = 1;
        kcn kcnVar = null;
        switch (this.d) {
            case 0:
                ((bh) this.b).d.f((ViewGroup) this.c, this.a);
                return ygi.a;
            case 1:
                Object obj = this.b;
                bh bhVar = (bh) obj;
                List list = bhVar.a;
                if (list.isEmpty()) {
                    Object obj2 = this.c;
                    dg dgVar = bhVar.d;
                    Object obj3 = bhVar.g;
                    obj3.getClass();
                    dgVar.u(obj3, new be(obj, obj2, 4, (byte[]) (0 == true ? 1 : 0)));
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((bi) it.next()).a.d) {
                            Object obj4 = this.a;
                            ctl ctlVar = new ctl();
                            dg dgVar2 = bhVar.d;
                            C0038do c0038do = ((bi) list.get(0)).a;
                            dgVar2.r(obj4, ctlVar, new bf(obj, i2));
                            ctlVar.a();
                        }
                    }
                    Object obj22 = this.c;
                    dg dgVar3 = bhVar.d;
                    Object obj32 = bhVar.g;
                    obj32.getClass();
                    dgVar3.u(obj32, new be(obj, obj22, 4, (byte[]) (0 == true ? 1 : 0)));
                }
                return ygi.a;
            case 2:
                break;
            case 3:
                aad aadVar = (aad) this.a.a();
                aan aanVar = (aan) this.c;
                return new aae(aanVar, aadVar, (bhi) this.b, new eph(aanVar.e.c.a(), aadVar));
            case 4:
                ?? r1 = this.a;
                ?? r2 = this.c;
                aed aedVar = (aed) this.b;
                bmy bmyVarB = aed.b(aedVar, r2, r1);
                if (bmyVarB == null) {
                    return null;
                }
                tf tfVar2 = aedVar.a;
                if (a.s(tfVar2.g, 0L)) {
                    wv.d("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return bmyVarB.i(tfVar2.e(bmyVarB, tfVar2.g) ^ (-9223372034707292160L));
            case 5:
                alg.w((yle) this.c, (alg) this.b, (yle) this.a);
                return ygi.a;
            case 6:
                alg.w((yle) this.c, (alg) this.b, (yle) this.a);
                return ygi.a;
            case 7:
                alg.v((yle) this.c, (yle) this.a, (alg) this.b);
                return ygi.a;
            case 8:
                alg.v((yle) this.c, (yle) this.a, (alg) this.b);
                return ygi.a;
            case 9:
                long j = atc.a;
                Object obj5 = this.b;
                auv auvVar = (auv) obj5;
                if (((Boolean) auvVar.b.b.a(auw.a)).booleanValue()) {
                    ykr.q(this.a, null, 0, new ajn(auvVar, (yih) null, 12, (short[]) null), 3).r(new afk(obj5, this.c, 12));
                }
                return ygi.a;
            case 10:
                if (((Boolean) ((auv) this.b).b.b.a(auw.b)).booleanValue()) {
                    ykr.q(this.a, null, 0, new ajn((auv) this.c, (yih) null, 15, (float[]) null), 3);
                }
                return true;
            case 11:
                auv auvVar2 = (auv) this.b;
                int iOrdinal = auvVar2.b().ordinal();
                ?? r9 = this.a;
                if (iOrdinal == 1) {
                    this.c.a();
                } else if (iOrdinal != 2) {
                    ykr.q(r9, null, 0, new ajn(auvVar2, (yih) null, 14, (boolean[]) null), 3);
                } else {
                    ykr.q(r9, null, 0, new ajn(auvVar2, (yih) null, 13, (int[]) null), 3);
                }
                return ygi.a;
            case 12:
                Object obj6 = this.c;
                Object obj7 = this.b;
                if (obj7 != null) {
                    bdj bdjVar = (bdj) obj6;
                    bdjVar.u(bdjVar.a((bac) obj7) - bdjVar.o);
                }
                bdj bdjVar2 = (bdj) obj6;
                List listP = bcm.p(bdjVar2, bdjVar2.o, null);
                if (((bjr) yfm.X(listP)) == null) {
                    return yfm.af(listP, this.a.a());
                }
                throw null;
            case 13:
                gvk.a(new grd((grs) this.c, (String) this.a, 2, yfm.p(this.b)));
                return ygi.a;
            case 14:
                Object obj8 = this.b;
                Object obj9 = this.a;
                Object obj10 = this.c;
                bg bgVar = new bg(obj8, obj10, obj9, i);
                grs grsVar = (grs) obj10;
                gux guxVarD = grsVar.c.D();
                String str = (String) obj9;
                List listK = guxVarD.k(str);
                if (listK.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                guu guuVar = (guu) yfm.U(listK);
                if (guuVar == null) {
                    bgVar.a();
                    return ygi.a;
                }
                String str2 = guuVar.a;
                guw guwVarC = guxVarD.c(str2);
                if (guwVarC == null) {
                    throw new IllegalStateException(a.ci(str, str2, "WorkSpec with ", ", that matches a name \"", "\", wasn't found"));
                }
                if (!guwVarC.e()) {
                    throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                }
                if (guuVar.b == gpx.f) {
                    guxVarD.n(str2);
                    bgVar.a();
                    return ygi.a;
                }
                cvi cviVar = (cvi) obj8;
                final guw guwVarF = guw.f((guw) cviVar.b, str2, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                gqr gqrVar = grsVar.e;
                gqrVar.getClass();
                final WorkDatabase workDatabase = grsVar.c;
                workDatabase.getClass();
                tae taeVar = grsVar.h;
                taeVar.getClass();
                final List list2 = grsVar.d;
                list2.getClass();
                final ?? r3 = cviVar.a;
                final String str3 = guwVarF.b;
                final guw guwVarC2 = workDatabase.D().c(str3);
                if (guwVarC2 == null) {
                    throw new IllegalArgumentException(a.cg(str3, "Worker with ", " doesn't exist"));
                }
                if (!guwVarC2.c.a()) {
                    if (guwVarC2.e() ^ guwVarF.e()) {
                        fyh fyhVar = new fyh(20);
                        throw new UnsupportedOperationException("Can't update " + ((String) fyhVar.a(guwVarC2)) + " Worker to " + ((String) fyhVar.a(guwVarF)) + " Worker. Update operation must preserve worker's type.");
                    }
                    final boolean zE = gqrVar.e(str3);
                    if (!zE) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            ((gqt) it2.next()).b(str3);
                        }
                    }
                    workDatabase.q(new Runnable() { // from class: grv
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            guw guwVar = guwVarF;
                            guw guwVar2 = guwVarC2;
                            int i3 = guwVar2.s;
                            WorkDatabase workDatabase2 = workDatabase;
                            gux guxVarD2 = workDatabase2.D();
                            gvg gvgVarE = workDatabase2.E();
                            guw guwVarF2 = guw.f(guwVar, null, guwVar2.c, null, null, guwVar2.l, guwVar2.n, guwVar2.r, i3 + 1, guwVar2.t, guwVar2.u, 29613053);
                            if (guwVar.u == 1) {
                                guwVarF2.t = guwVar.t;
                                guwVarF2.u++;
                            }
                            boolean z = zE;
                            Set set = r3;
                            String str4 = str3;
                            guxVarD2.u(fki.aw(list2, guwVarF2));
                            gvgVarE.b(str4);
                            gvgVarE.c(str4, set);
                            if (z) {
                                return;
                            }
                            guxVarD2.x(str4, -1L);
                            workDatabase2.C().a(str4);
                        }
                    });
                    if (!zE) {
                        gqv.a(taeVar, workDatabase, list2);
                    }
                }
                return ygi.a;
            case 15:
                if (((ylb) this.a).a) {
                    Object obj11 = this.c;
                    Object obj12 = this.b;
                    gpn.b();
                    int i3 = gta.a;
                    ((ConnectivityManager) obj12).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj11);
                }
                return ygi.a;
            case 16:
                ((jtr) this.c).d.a(this.a);
                this.b.b(Boolean.valueOf(false));
                return ygi.a;
            case 17:
                wkg wkgVar = ((wsa) this.a).f;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                Object obj13 = this.b;
                Object obj14 = this.c;
                wkgVar.getClass();
                ((irc) obj14).e(wkgVar, (Context) obj13, "");
                return ygi.a;
            case 18:
                this.c.aj(0.0f);
                ((ovq) this.a).b();
                jxl.h(this.b, true);
                return ygi.a;
            case 19:
                Object obj15 = this.c;
                kcn kcnVar2 = ((kch) obj15).a;
                if (kcnVar2 == null) {
                    yks.c("managedServicesPagePresenter");
                } else {
                    kcnVar = kcnVar2;
                }
                Object obj16 = this.b;
                kcq kcqVar = (kcq) kcnVar.l(this.a);
                obj16.getClass();
                sfy.l((bv) obj15, (View) obj16).a(kcqVar);
                return ygi.a;
            default:
                return ProviderSelectionMenuFragment.onCreateReplayDialogView$lambda$0((ProviderSelectionMenuFragment) this.c, (kdi) this.a, (View) this.b);
        }
        while (true) {
            tfVar = (tf) this.c;
            bfz bfzVar = (bfz) tfVar.i.a;
            if (bfzVar.b != 0 && ((objA = ((te) bfzVar.c()).a.a()) == null || tfVar.l((bmy) objA, tfVar.g))) {
                ((te) bfzVar.d(bfzVar.b - 1)).b.resumeWith(ygi.a);
            }
        }
        if (tfVar.e && (bmyVarF = tfVar.f()) != null && tfVar.l(bmyVarF, tfVar.g)) {
            tfVar.e = false;
        }
        ((wh) this.a).e = tfVar.b(this.b);
        return ygi.a;
    }

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ bg(ylb ylbVar, ConnectivityManager connectivityManager, gsu gsuVar, int i) {
        this.d = i;
        this.a = ylbVar;
        this.b = connectivityManager;
        this.c = gsuVar;
    }

    public /* synthetic */ bg(yle yleVar, alg algVar, yle yleVar2, int i) {
        this.d = i;
        this.c = yleVar;
        this.b = algVar;
        this.a = yleVar2;
    }
}
