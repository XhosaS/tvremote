package defpackage;

import android.net.Uri;
import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqs implements idf {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public lqs(idf idfVar, int i) {
        this.a = i;
        this.b = new kzj(14);
        this.c = idfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v55, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v61, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v81, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r1v37, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [idf, java.lang.Object] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        vbz vbzVar;
        int i = 5;
        int i2 = 4;
        switch (this.a) {
            case 0:
                lqt lqtVar = (lqt) obj;
                vek vekVar = vek.a;
                vtw vtwVarM = vekVar.m();
                ksn ksnVar = lqtVar.a;
                vdn vdnVarC = ((moz) this.c).c(ksnVar);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vek vekVar2 = (vek) vtwVarM.b;
                vdnVarC.getClass();
                vekVar2.c = vdnVarC;
                vekVar2.b |= 1;
                vtw vtwVarM2 = vej.a.m();
                val valVarO = kgu.o(lqtVar.b);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vej vejVar = (vej) vtwVarM2.b;
                valVarO.getClass();
                vejVar.c = valVarO;
                vejVar.b = 1 | vejVar.b;
                vtwVarM2.ay(lqtVar.c);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vek vekVar3 = (vek) vtwVarM.b;
                vej vejVar2 = (vej) vtwVarM2.r();
                vejVar2.getClass();
                vekVar3.d = vejVar2;
                vekVar3.b = 2 | vekVar3.b;
                vek vekVar4 = (vek) vtwVarM.r();
                Object obj2 = this.b;
                xsq xsqVar = vef.b;
                if (xsqVar == null) {
                    synchronized (vef.class) {
                        xsqVar = vef.b;
                        if (xsqVar == null) {
                            xsn xsnVarA = xsq.a();
                            xsnVarA.d = xsp.UNARY;
                            xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.commerce.CommerceService", "Share");
                            xsnVarA.b();
                            vtp vtpVar = yer.a;
                            xsnVarA.b = new yep(vekVar);
                            xsnVarA.c = new yep(vel.a);
                            xsq xsqVarA = xsnVarA.a();
                            vef.b = xsqVarA;
                            xsqVar = xsqVarA;
                        }
                    }
                }
                return ((lql) obj2).b(ksnVar, vekVar4, xsqVar, new lqp(i2)).e(new lqp(i));
            case 1:
                return ((Integer) obj).intValue() != 3 ? this.b : this.c;
            case 2:
                lqw lqwVar = (lqw) obj;
                vem vemVar = vem.a;
                vtw vtwVarM3 = vemVar.m();
                ksn ksnVar2 = lqwVar.a;
                vdn vdnVarC2 = ((moz) this.c).c(ksnVar2);
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vem vemVar2 = (vem) vtwVarM3.b;
                vdnVarC2.getClass();
                vemVar2.c = vdnVarC2;
                vemVar2.b |= 1;
                vtw vtwVarM4 = vej.a.m();
                val valVarO2 = kgu.o(lqwVar.b);
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                vej vejVar3 = (vej) vtwVarM4.b;
                valVarO2.getClass();
                vejVar3.c = valVarO2;
                vejVar3.b = 1 | vejVar3.b;
                vtwVarM4.ay(lqwVar.c);
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vem vemVar3 = (vem) vtwVarM3.b;
                vej vejVar4 = (vej) vtwVarM4.r();
                vejVar4.getClass();
                vemVar3.d = vejVar4;
                vemVar3.b = 2 | vemVar3.b;
                vem vemVar4 = (vem) vtwVarM3.r();
                Object obj3 = this.b;
                xsq xsqVar2 = vef.c;
                if (xsqVar2 == null) {
                    synchronized (vef.class) {
                        xsqVar2 = vef.c;
                        if (xsqVar2 == null) {
                            xsn xsnVarA2 = xsq.a();
                            xsnVarA2.d = xsp.UNARY;
                            xsnVarA2.e = xsq.c("google.internal.play.movies.dfe.v1beta.commerce.CommerceService", "UnShare");
                            xsnVarA2.b();
                            vtp vtpVar2 = yer.a;
                            xsnVarA2.b = new yep(vemVar);
                            xsnVarA2.c = new yep(ven.a);
                            xsq xsqVarA2 = xsnVarA2.a();
                            vef.c = xsqVarA2;
                            xsqVar2 = xsqVarA2;
                        }
                    }
                }
                return ((lql) obj3).b(ksnVar2, vemVar4, xsqVar2, new lqp(6)).e(new lqp(7));
            case 3:
                ltr ltrVar = (ltr) obj;
                ksn ksnVar3 = ltrVar.b;
                tst tstVar = ltrVar.a;
                if (tstVar.g()) {
                    Object objC = tstVar.c();
                    vtw vtwVarM5 = vbz.a.m();
                    String str = (String) objC;
                    vtwVarM5.aw(kgu.o(ksy.i(str)));
                    vtwVarM5.aw(kgu.o(ksy.h(str)));
                    vbzVar = (vbz) vtwVarM5.r();
                } else {
                    vtw vtwVarM6 = vbz.a.m();
                    vtwVarM6.ax(vak.MOVIE);
                    vtwVarM6.ax(vak.EPISODE);
                    vbzVar = (vbz) vtwVarM6.r();
                }
                vdn vdnVarC3 = ((moz) this.c).c(ksnVar3);
                vtw vtwVarM7 = wbh.a.m();
                if (!vtwVarM7.b.A()) {
                    vtwVarM7.u();
                }
                wbh wbhVar = (wbh) vtwVarM7.b;
                vbzVar.getClass();
                wbhVar.d = vbzVar;
                wbhVar.b |= 4;
                wbh wbhVar2 = (wbh) vtwVarM7.r();
                vtw vtwVarM8 = wbv.a.m();
                if (!vtwVarM8.b.A()) {
                    vtwVarM8.u();
                }
                wbv wbvVar = (wbv) vtwVarM8.b;
                wbhVar2.getClass();
                wbvVar.c = wbhVar2;
                wbvVar.b |= 1;
                wbv wbvVar2 = (wbv) vtwVarM8.r();
                vtw vtwVarM9 = wbj.a.m();
                if (!vtwVarM9.b.A()) {
                    vtwVarM9.u();
                }
                wbj wbjVar = (wbj) vtwVarM9.b;
                vdnVarC3.getClass();
                wbjVar.c = vdnVarC3;
                wbjVar.b |= 1;
                vtw vtwVarM10 = wbx.a.m();
                if (!vtwVarM10.b.A()) {
                    vtwVarM10.u();
                }
                Object obj4 = this.b;
                wbx wbxVar = (wbx) vtwVarM10.b;
                wbvVar2.getClass();
                wbxVar.c = wbvVar2;
                wbxVar.b = 5;
                vtwVarM9.bG(vtwVarM10);
                return ((lql) obj4).b(ksnVar3, (wbj) vtwVarM9.r(), wcq.a(), new lsl(17)).c(new lsl(18));
            case 4:
                try {
                    return ieg.f(((Subtitles.Builder) ((mfa) this.b).a(new ByteArrayInputStream((byte[]) obj), this.c)).build());
                } catch (Exception e) {
                    return ieg.b(new mfh(e));
                }
            case 5:
                kuw kuwVar = (kuw) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = lxo.b((String) kuwVar.a, 2, kuwVar.b, (String) this.c).iterator();
                while (it.hasNext()) {
                    arrayList.addAll((Collection) this.b.b((lxo) it.next()));
                }
                return arrayList;
            case 6:
                xax xaxVar = (xax) obj;
                int i3 = xaxVar.b;
                if ((i3 & 16) == 0 || (i3 & 1) == 0) {
                    return ieg.b(new RuntimeException("Incomplete show asset resource:".concat(String.valueOf(String.valueOf(xaxVar)))));
                }
                xaz xazVar = xaxVar.c;
                if (xazVar == null) {
                    xazVar = xaz.a;
                }
                if ((xazVar.b & 8) != 0) {
                    xay xayVarB = xay.b(xazVar.f);
                    if (xayVarB == null) {
                        xayVarB = xay.ANDROID_APP;
                    }
                    if (xayVarB == xay.SHOW) {
                        xar xarVar = xaxVar.g;
                        if (xarVar == null) {
                            xarVar = xar.a;
                        }
                        ksy ksyVarB = ksy.b(xazVar);
                        ?? r2 = this.c;
                        String str2 = xarVar.c;
                        Object objB = r2.b(xarVar.h);
                        Object objB2 = this.b.b(xarVar.h);
                        String str3 = xarVar.d;
                        String str4 = xarVar.k.size() > 0 ? ((xaj) xarVar.k.get(0)).c : "";
                        String str5 = xarVar.k.size() > 0 ? ((xaj) xarVar.k.get(0)).b : "";
                        xah xahVar = xaxVar.h;
                        if (xahVar == null) {
                            xahVar = xah.a;
                        }
                        boolean z = xahVar.b;
                        boolean z2 = xarVar.l;
                        int iA = ktc.a(xarVar);
                        ImmutableList.Builder builder = ImmutableList.builder();
                        Iterator<E> it2 = xaxVar.e.iterator();
                        while (it2.hasNext()) {
                            builder.add((ImmutableList.Builder) ksy.b((xaz) it2.next()));
                        }
                        lcv lcvVarQ = lbk.q(xaxVar.k);
                        kwm kwmVarC = kwn.c(ksyVarB);
                        kwmVarC.r(str2);
                        kux kuxVar = (kux) objB;
                        kwmVarC.m(kuxVar.a);
                        kwmVarC.l(kuxVar.b);
                        kwmVarC.c((Uri) objB2);
                        kwmVarC.q(lcvVarQ.b);
                        kwmVarC.i(lcvVarQ.d);
                        lcu lcuVarB = lcu.b(lcvVarQ.e);
                        if (lcuVarB == null) {
                            lcuVarB = lcu.UNRECOGNIZED;
                        }
                        kwmVarC.s(lcuVarB);
                        kwmVarC.t(lcvVarQ.f);
                        kwmVarC.f(str3);
                        kwmVarC.n(str4);
                        kwmVarC.e(str5);
                        kwmVarC.k(z);
                        kwmVarC.j(z2);
                        kwmVarC.o(iA);
                        xar xarVar2 = xaxVar.g;
                        if (xarVar2 == null) {
                            xarVar2 = xar.a;
                        }
                        kwmVarC.d(xarVar2.m);
                        kwmVarC.h(ktc.e(xaxVar.q));
                        kwmVarC.g(ktc.c(xaxVar.q));
                        xar xarVar3 = xaxVar.g;
                        if (xarVar3 == null) {
                            xarVar3 = xar.a;
                        }
                        kwmVarC.b(lbk.b(lbk.v(xarVar3)));
                        kwmVarC.p(builder.build());
                        return ieg.f(kwmVarC.a());
                    }
                }
                return ieg.b(new RuntimeException("Asset resource not show: ".concat(String.valueOf(String.valueOf(xaxVar)))));
            case 7:
                lzh lzhVar = (lzh) this.c;
                ieg iegVarA = lzhVar.a(obj);
                if (iegVarA.m()) {
                    return iegVarA;
                }
                ieg iegVar = (ieg) this.b.b(obj);
                if (iegVar.m()) {
                    lzhVar.c(obj, iegVar.g());
                }
                return iegVar;
            case 8:
                Throwable th = (Throwable) obj;
                if (!this.c.d()) {
                    return new llt(6, -1, th, false, false, trk.a);
                }
                return new llt(((kwy) this.b).f(th, true), -1, th, false, false, trk.a);
            case 9:
                kvf kvfVar = (kvf) obj;
                kva kvaVar = (kva) this.c.a();
                UnmodifiableIterator it3 = kvfVar.t().iterator();
                while (it3.hasNext()) {
                    ksy ksyVar = (ksy) it3.next();
                    if (kvaVar.b(ksyVar).b) {
                        ieg iegVar2 = (ieg) this.b.b(ksyVar);
                        if (iegVar2.m()) {
                            return iegVar2;
                        }
                    }
                }
                return kvaVar.a(kvfVar).b ? ieg.f(kvfVar) : ieg.a;
            case 10:
                return mne.f((kwl) obj, (kva) this.c.a());
            default:
                kst kstVar = (kst) obj;
                ieg iegVar3 = (ieg) this.b.a();
                if (iegVar3.k()) {
                    return ieg.a;
                }
                kuf kufVar = (kuf) iegVar3.g();
                if (kuf.b(kufVar)) {
                    return ((kva) this.c.a()).a(kstVar).b ? ieg.f(kxg.a) : ieg.a;
                }
                for (kxg kxgVar : ((kxh) kstVar).dY()) {
                    if (kufVar.equals(kxgVar.c)) {
                        return ieg.f(kxgVar);
                    }
                }
                return ieg.a;
        }
    }

    public lqs(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public lqs(Object obj, Object obj2, int i, byte[] bArr) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public lqs(iea ieaVar, lxp lxpVar, int i) {
        this.a = i;
        this.c = ieaVar;
        this.b = lxpVar.c(kst.class);
    }
}
