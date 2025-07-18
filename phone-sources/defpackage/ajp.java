package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajp extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(ajq ajqVar, sp spVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = ajqVar;
        this.c = spVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((ajp) create((cbv) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((ajp) create((bco) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((ajp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((ajp) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((ajp) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((ajp) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((ajp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((ajp) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((ajp) create((iax) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((ajp) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((ajp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((ajp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, qpv] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, qpv] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.e) {
            case 0:
                ajp ajpVar = new ajp((ajq) this.b, (sp) this.c, yihVar, 0);
                ajpVar.d = obj;
                return ajpVar;
            case 1:
                ajp ajpVar2 = new ajp((pf) this.c, (bdy) this.b, yihVar, 1);
                ajpVar2.d = obj;
                return ajpVar2;
            case 2:
                ajp ajpVar3 = new ajp((kw) this.c, (aoo) this.b, yihVar, 2);
                ajpVar3.d = obj;
                return ajpVar3;
            case 3:
                ajp ajpVar4 = new ajp((gnr) this.b, (Context) this.c, yihVar, 3);
                ajpVar4.d = obj;
                return ajpVar4;
            case 4:
                ajp ajpVar5 = new ajp((gnr) this.b, (Activity) this.c, yihVar, 4);
                ajpVar5.d = obj;
                return ajpVar5;
            case 5:
                ajp ajpVar6 = new ajp((gou) this.c, (gsv) this.b, yihVar, 5);
                ajpVar6.d = obj;
                return ajpVar6;
            case 6:
                ajp ajpVar7 = new ajp((gzu) this.b, (riv) this.c, yihVar, 6);
                ajpVar7.d = obj;
                return ajpVar7;
            case 7:
                ajp ajpVar8 = new ajp((ity) this.c, this.b, yihVar, 7);
                ajpVar8.d = obj;
                return ajpVar8;
            case 8:
                ajp ajpVar9 = new ajp((ity) this.c, this.b, yihVar, 8, (byte[]) null);
                ajpVar9.d = obj;
                return ajpVar9;
            case 9:
                ajp ajpVar10 = new ajp((irc) this.c, this.b, yihVar, 9);
                ajpVar10.d = obj;
                return ajpVar10;
            case 10:
                ajp ajpVar11 = new ajp((qnx) this.c, (qpv) this.b, yihVar, 10);
                ajpVar11.d = obj;
                return ajpVar11;
            default:
                ajp ajpVar12 = new ajp((qnx) this.c, (qpv) this.b, yihVar, 11, (byte[]) null);
                ajpVar12.d = obj;
                return ajpVar12;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, qpv] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, qpv] */
    /* JADX WARN: Type inference failed for: r4v3, types: [bdy, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object bgVar;
        ysy ysyVar;
        Object objA;
        Object objE;
        Object objL;
        Object objE2;
        Object objL2;
        int i = 16;
        int i2 = 7;
        int i3 = 6;
        int i4 = 15;
        byte[] bArr = null;
        switch (this.e) {
            case 0:
                yio yioVar = yio.a;
                if (this.a == 0) {
                    ybn.f(obj);
                    cbv cbvVar = (cbv) this.d;
                    ?? r1 = this.b;
                    ajq ajqVar = (ajq) r1;
                    akb akbVar = ajqVar.a;
                    lhr lhrVar = ajqVar.p;
                    afw afwVar = ajqVar.d;
                    boolean z = ajqVar.e;
                    ckc ckcVar = new ckc(afwVar.b);
                    if (true == a.r(ckcVar.a, -1)) {
                        ckcVar = null;
                    }
                    int i5 = ckcVar != null ? ckcVar.a : 0;
                    Boolean bool = afwVar.c;
                    int i6 = afwVar.d;
                    ckd ckdVar = new ckd();
                    if (true == a.r(0, 0)) {
                        ckdVar = null;
                    }
                    cka ckaVar = new cka(z, i5, ckdVar != null ? 0 : 1, afwVar.a(), ckq.a);
                    Object obj2 = this.c;
                    ceq ceqVar = new ceq(r1, 1, null);
                    ajm ajmVar = new ajm(r1, 4);
                    yuj yujVar = ajqVar.f;
                    cds cdsVar = (cds) fh.P(r1, ccq.m);
                    this.a = 1;
                    if (aim.a(cbvVar, akbVar, lhrVar, ckaVar, (sp) obj2, ceqVar, ajmVar, yujVar, cdsVar, this) == yioVar) {
                        return yioVar;
                    }
                } else {
                    ybn.f(obj);
                }
                throw new yfs();
            case 1:
                yio yioVar2 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    bco bcoVar = (bco) this.d;
                    Object obj3 = this.c;
                    ysx ysxVarBS = a.bS(new bms(obj3, 1));
                    aob aobVar = new aob(bcoVar, (pf) obj3, (bdy) this.b, 1);
                    this.a = 1;
                    if (ysxVarBS.a(aobVar, this) == yioVar2) {
                        return yioVar2;
                    }
                }
                return ygi.a;
            case 2:
                yio yioVar3 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    yow yowVar = (yow) this.d;
                    ArrayList arrayList = new ArrayList();
                    Object obj4 = this.c;
                    aob aobVar2 = new aob((List) arrayList, yowVar, (aoo) this.b, 0);
                    this.a = 1;
                    if (yup.f((yup) ((kw) obj4).a, aobVar2, this) == yioVar3) {
                        return yioVar3;
                    }
                }
                return ygi.a;
            case 3:
                yio yioVar4 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysk yskVar = (ysk) this.d;
                    bw bwVar = new bw(yskVar, i3);
                    Object obj5 = this.b;
                    ((gnr) obj5).b.a((Context) this.c, new fba(2), bwVar);
                    aye ayeVar = new aye(obj5, bwVar, 14);
                    this.a = 1;
                    if (vyf.P(yskVar, ayeVar, this) == yioVar4) {
                        return yioVar4;
                    }
                }
                return ygi.a;
            case 4:
                yio yioVar5 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysk yskVar2 = (ysk) this.d;
                    bw bwVar2 = new bw(yskVar2, i2);
                    Object obj6 = this.b;
                    ((gnr) obj6).b.a((Context) this.c, new fba(3), bwVar2);
                    aye ayeVar2 = new aye(obj6, bwVar2, i4);
                    this.a = 1;
                    if (vyf.P(yskVar2, ayeVar2, this) == yioVar5) {
                        return yioVar5;
                    }
                }
                return ygi.a;
            case 5:
                yio yioVar6 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysk yskVar3 = (ysk) this.d;
                    NetworkRequest networkRequestA = ((gou) this.c).a();
                    if (networkRequestA == null) {
                        yskVar3.e((Throwable) null);
                        return ygi.a;
                    }
                    gsv gsvVar = (gsv) this.b;
                    bct bctVar = new bct(ykr.q(yskVar3, null, 0, new dbv(gsvVar, yskVar3, (yih) null, 15), 3), yskVar3, 13, bArr);
                    if (Build.VERSION.SDK_INT >= 30) {
                        gsy gsyVar = gsy.a;
                        ConnectivityManager connectivityManager = gsvVar.a;
                        synchronized (gsy.b) {
                            Map map = gsy.c;
                            boolean zIsEmpty = map.isEmpty();
                            map.put(networkRequestA, bctVar);
                            if (zIsEmpty) {
                                gpn.b();
                                int i7 = gta.a;
                                connectivityManager.registerDefaultNetworkCallback(gsy.a);
                            }
                        }
                        bgVar = new aye(networkRequestA, connectivityManager, i);
                    } else {
                        Object obj7 = this.b;
                        gsu gsuVar = new gsu(bctVar);
                        ylb ylbVar = new ylb();
                        ConnectivityManager connectivityManager2 = ((gsv) obj7).a;
                        try {
                            gpn.b();
                            int i8 = gta.a;
                            connectivityManager2.registerNetworkCallback(networkRequestA, gsuVar);
                            ylbVar.a = true;
                        } catch (RuntimeException e) {
                            String name = e.getClass().getName();
                            name.getClass();
                            if (!ylh.R(name, "TooManyRequestsException")) {
                                throw e;
                            }
                            gpn.b();
                            int i9 = gta.a;
                            bctVar.a(new gst(7));
                        }
                        bgVar = new bg(ylbVar, connectivityManager2, gsuVar, i4);
                    }
                    grq grqVar = new grq(bgVar, i3);
                    this.a = 1;
                    if (vyf.P(yskVar3, grqVar, this) == yioVar6) {
                        return yioVar6;
                    }
                }
                return ygi.a;
            case 6:
                yio yioVar7 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                yow yowVar2 = (yow) this.d;
                yot yotVar = ypk.a;
                ypc ypcVarO = ykr.o(yowVar2, yxi.a.i(), new dbv((riv) this.c, (gzu) this.b, (yih) null, 16), 2);
                this.a = 1;
                Object objN = ypcVarO.n(this);
                return objN == yioVar7 ? yioVar7 : objN;
            case 7:
                yio yioVar8 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysy ysyVar2 = (ysy) this.d;
                    Object obj8 = this.c;
                    Object obj9 = this.b;
                    obj9.getClass();
                    ?? A = ((hfx) ((ity) obj8).c).a.a(obj9);
                    this.a = 1;
                    if (vyf.K(ysyVar2, A, this) == yioVar8) {
                        return yioVar8;
                    }
                }
                return ygi.a;
            case 8:
                yio yioVar9 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object objC = ((iax) this.d).c();
                    if (objC != null) {
                        Object obj10 = this.c;
                        Object obj11 = this.b;
                        Object obj12 = ((ity) obj10).e;
                        if (obj12 != null) {
                            this.a = 1;
                            if (((kdj) obj12).g(obj11, objC, this) == yioVar9) {
                                return yioVar9;
                            }
                        }
                    }
                }
                return ygi.a;
            case 9:
                yio yioVar10 = yio.a;
                int i10 = this.a;
                if (i10 == 0) {
                    ybn.f(obj);
                    ysyVar = (ysy) this.d;
                    Object obj13 = this.c;
                    Object obj14 = this.b;
                    this.d = ysyVar;
                    this.a = 1;
                    objA = ((irc) obj13).a.a(obj14, this);
                    if (objA == yioVar10) {
                        return yioVar10;
                    }
                } else {
                    if (i10 != 1) {
                        ybn.f(obj);
                        return ygi.a;
                    }
                    ysyVar = (ysy) this.d;
                    ybn.f(obj);
                    objA = obj;
                }
                this.d = null;
                this.a = 2;
                if (ysyVar.emit(objA, this) == yioVar10) {
                    return yioVar10;
                }
                return ygi.a;
            case 10:
                yio yioVar11 = yio.a;
                try {
                    if (this.a != 0) {
                        ybn.f(obj);
                        objL = obj;
                    } else {
                        ybn.f(obj);
                        Object obj15 = this.c;
                        ?? r3 = this.b;
                        qnt qntVar = ((qnx) obj15).b;
                        int iAg = osk.ag(r3);
                        String strA = r3.a();
                        this.a = 1;
                        objL = gez.l(((qnw) qntVar).a, false, true, new aps(iAg, strA, 9), this);
                        if (objL == yioVar11) {
                            return yioVar11;
                        }
                    }
                    objE = new Integer(((Number) objL).intValue());
                } catch (Throwable th) {
                    objE = ybn.e(th);
                }
                return osk.am(objE, 32);
            default:
                yio yioVar12 = yio.a;
                try {
                    if (this.a != 0) {
                        ybn.f(obj);
                        objL2 = obj;
                    } else {
                        ybn.f(obj);
                        Object obj16 = this.c;
                        ?? r32 = this.b;
                        qnt qntVar2 = ((qnx) obj16).b;
                        int iAg2 = osk.ag(r32);
                        String strA2 = r32.a();
                        this.a = 1;
                        objL2 = gez.l(((qnw) qntVar2).a, true, false, new aps(iAg2, strA2, 8), this);
                        if (objL2 == yioVar12) {
                            return yioVar12;
                        }
                    }
                    objE2 = (qen) objL2;
                } catch (Throwable th2) {
                    objE2 = ybn.e(th2);
                }
                return osk.am(objE2, 32);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(gnr gnrVar, Activity activity, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = gnrVar;
        this.c = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(gnr gnrVar, Context context, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = gnrVar;
        this.c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(gou gouVar, gsv gsvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = gouVar;
        this.b = gsvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(gzu gzuVar, riv rivVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = gzuVar;
        this.c = rivVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(irc ircVar, Object obj, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = ircVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(ity ityVar, Object obj, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = ityVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(ity ityVar, Object obj, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.c = ityVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(kw kwVar, aoo aooVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = kwVar;
        this.b = aooVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(pf pfVar, bdy bdyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = pfVar;
        this.b = bdyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(qnx qnxVar, qpv qpvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = qnxVar;
        this.b = qpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajp(qnx qnxVar, qpv qpvVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.c = qnxVar;
        this.b = qpvVar;
    }
}
