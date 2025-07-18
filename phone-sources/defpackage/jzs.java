package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobileux.screen.details.userfeedback.UserFeedbackView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzs {
    public final Object a;
    public final Object b;
    public final Object c;

    public jzs(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public static final wpi a(vsl vslVar) throws vuq {
        try {
            vsz vszVar = vslVar.c;
            vtp vtpVarA = vtp.a();
            wpi wpiVar = wpi.a;
            vte vteVarK = vszVar.k();
            vuc vucVarO = wpiVar.o();
            try {
                try {
                    try {
                        try {
                            vvy vvyVarB = vvs.a.b(vucVarO);
                            vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVarA);
                            vvyVarB.g(vucVarO);
                            try {
                                vteVarK.z(0);
                                vuc.B(vucVarO);
                                return (wpi) vucVarO;
                            } catch (vuq e) {
                                throw e;
                            }
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof vuq) {
                                throw ((vuq) e2.getCause());
                            }
                            throw e2;
                        }
                    } catch (vuq e3) {
                        if (e3.a) {
                            throw new vuq(e3);
                        }
                        throw e3;
                    }
                } catch (IOException e4) {
                    if (e4.getCause() instanceof vuq) {
                        throw ((vuq) e4.getCause());
                    }
                    throw new vuq(e4);
                }
            } catch (vwf e5) {
                throw e5.a();
            }
        } catch (vuq e6) {
            e6.toString();
            krd.c("Chime UI notification received invalid payload. Caught error ".concat(e6.toString()));
            return null;
        }
    }

    public static jzs w(final iea ieaVar, final idw idwVar, final idf idfVar, final idf idfVar2, ids idsVar, lio lioVar, Resources resources, final boolean z, pkg pkgVar, pjx pjxVar, final boolean z2) {
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{ieaVar, idsVar};
        krzVar.d(new ieh() { // from class: nas
            @Override // defpackage.ieh
            public final Object a() {
                iea ieaVar2 = ieaVar;
                if (!((ieg) ieaVar2.a()).m() || !idwVar.b((kst) ((ieg) ieaVar2.a()).g())) {
                    return ieg.a;
                }
                boolean z3 = z2;
                boolean z4 = z;
                idf idfVar3 = idfVar2;
                idf idfVar4 = idfVar;
                kst kstVar = (kst) ((ieg) ieaVar2.a()).g();
                ksy ksyVarO = kstVar.o();
                nat natVarA = nau.a();
                natVarA.a = ((kwz) kstVar).E();
                natVarA.b = jys.ab((kwi) kstVar);
                natVarA.e((kxe) idfVar3.b(ksyVarO));
                natVarA.g(((Boolean) idfVar4.b(ksyVarO)).booleanValue());
                natVarA.d(true);
                natVarA.b(z4);
                natVarA.c(z3);
                return ieg.f(natVarA.a());
            }
        });
        return new jzs(krzVar.a(), lioVar, resources, pkgVar, pjxVar, z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final ixh b(wkx wkxVar) {
        wkxVar.getClass();
        if (!f(wkxVar)) {
            wkw wkwVarB = wkw.b(wkxVar.d);
            if (wkwVarB == null) {
                wkwVarB = wkw.TYPE_UNSPECIFIED;
            }
            Objects.toString(wkwVarB);
            throw new IllegalArgumentException("Component is not supported ".concat(String.valueOf(wkwVarB)));
        }
        ?? r0 = this.a;
        wkw wkwVarB2 = wkw.b(wkxVar.d);
        if (wkwVarB2 == null) {
            wkwVarB2 = wkw.TYPE_UNSPECIFIED;
        }
        Object obj = r0.get(wkwVarB2);
        obj.getClass();
        return ((ixj) obj).a(wkxVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final sbx c(ixh ixhVar) {
        ixhVar.getClass();
        sbx sbxVar = (sbx) ((Map) this.b.b()).get(ixhVar.dQ());
        if (sbxVar != null) {
            return sbxVar;
        }
        wkw wkwVarDQ = ixhVar.dQ();
        Objects.toString(wkwVarDQ);
        throw new IllegalStateException("Missing presenter for component ".concat(String.valueOf(wkwVarDQ)));
    }

    public final scf d(ixh ixhVar) {
        return (scf) c(ixhVar).l(ixhVar);
    }

    public final void e(bv bvVar, View view, ixh ixhVar) {
        ixhVar.getClass();
        sfy.l(bvVar, view).a(d(ixhVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final boolean f(wkx wkxVar) {
        wkw wkwVarB = wkw.b(wkxVar.d);
        if (wkwVarB == null) {
            wkwVarB = wkw.TYPE_UNSPECIFIED;
        }
        return this.c.contains(wkwVarB);
    }

    public final boolean g(Class cls, Class cls2) {
        return ((Class) this.b).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.c);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized Executor h(int i) {
        Object obj = this.a;
        Executor executor = (Executor) ((SparseArray) obj).get(i);
        if (executor != null) {
            return executor;
        }
        mbo mboVar = new mbo(i, this.c, (AtomicInteger) this.b);
        ((SparseArray) obj).put(i, mboVar);
        return mboVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized ImmutableList i() {
        ImmutableList immutableListCopyOf;
        ?? r0 = this.c;
        immutableListCopyOf = ImmutableList.copyOf((Collection) r0);
        r0.clear();
        return immutableListCopyOf;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    public final synchronized void j(ksy ksyVar, List list) {
        ?? r0 = this.a;
        r0.add(ksyVar);
        this.b.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ksy ksyVar2 = (ksy) it.next();
            if (r0.contains(ksyVar2)) {
                this.c.add(ksyVar2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean k(ksy ksyVar) {
        return this.b.contains(ksyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v1, types: [idf, java.lang.Object] */
    public final tha l(ksn ksnVar, ImmutableList immutableList, boolean z) {
        lyz lyzVar = (lyz) this.c.b();
        lyzVar.getClass();
        ?? r0 = this.a;
        ?? B = this.b.b();
        Object objB = r0.b();
        immutableList.getClass();
        return new tha(lyzVar, B, (Locale) objB, ksnVar, immutableList, z);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final String m() {
        Object obj = this.a;
        ?? r1 = this.c;
        String str = (String) obj;
        return r1.contains(str) ? r1.getString(str, null) : r1.getString((String) this.b, null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void n(kwx kwxVar) {
        if (kwxVar == null || kwxVar.isDisableTrack()) {
            this.c.edit().putString((String) this.a, "").putString((String) this.b, "").apply();
        } else {
            if (kwxVar.isForced()) {
                return;
            }
            ?? r0 = this.c;
            r0.edit().putString((String) this.a, kwxVar.languageCode()).apply();
            r0.edit().putString((String) this.b, kwxVar.languageCode()).apply();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void o(kwx kwxVar) {
        boolean z = false;
        if (kwxVar != null && !kwxVar.isDisableTrack()) {
            z = true;
        }
        this.c.edit().putBoolean(krh.SELECT_SUBTITLE_WHEN_NO_AUDIO_IN_DEVICE_LANGUAGE, z).apply();
    }

    public final uhp p(plk plkVar, boolean z) {
        return q(plkVar, z, false);
    }

    public final uhp q(final plk plkVar, boolean z, final boolean z2) {
        final uhp uhpVarAS = (z || z2) ? qtl.aS(plkVar.b, (jzs) this.b) : sfy.C(null);
        final pjy pjyVar = plkVar.c.a;
        final ArrayList arrayList = new ArrayList();
        ((jzs) this.a).r(pjyVar, pjyVar.d, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        ((jzs) this.c).r(pjyVar, pjyVar.d, null, arrayList2);
        return sfy.O(Iterables.concat(arrayList, arrayList2)).a(new Callable() { // from class: pmt
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v33, types: [int] */
            /* JADX WARN: Type inference failed for: r2v58 */
            /* JADX WARN: Type inference failed for: r2v59 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                vtw vtwVarM = uao.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                plk plkVar2 = plkVar;
                ucz uczVar = plkVar2.a;
                uao uaoVar = (uao) vtwVarM.b;
                uczVar.getClass();
                uaoVar.c = uczVar;
                uaoVar.b |= 1;
                if (!plkVar2.e) {
                    ucz uczVarAk = qtl.ak(plkVar2, true);
                    sij.x(uczVarAk != null, "No Parent Event");
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uao uaoVar2 = (uao) vtwVarM.b;
                    uczVarAk.getClass();
                    uaoVar2.e = uczVarAk;
                    uaoVar2.b |= 2;
                }
                pka pkaVarAq = qtl.aq(plkVar2);
                vvd vvdVar = pmx.a;
                pkaVarAq.i(vvdVar);
                if (pkaVarAq.l.m((vub) vvdVar.c)) {
                    vtw vtwVarM2 = uap.a.m();
                    ucy ucyVar = pkaVarAq.d;
                    if (ucyVar == null) {
                        ucyVar = ucy.a;
                    }
                    ucz uczVar2 = ucyVar.e;
                    if (uczVar2 == null) {
                        uczVar2 = ucz.a;
                    }
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    uap uapVar = (uap) vtwVarM2.b;
                    uczVar2.getClass();
                    uapVar.c = uczVar2;
                    uapVar.b |= 1;
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uao uaoVar3 = (uao) vtwVarM.b;
                    uap uapVar2 = (uap) vtwVarM2.r();
                    uapVar2.getClass();
                    uaoVar3.h = uapVar2;
                    uaoVar3.b |= 128;
                }
                ucy ucyVar2 = qtl.ar(plkVar2).d;
                if (ucyVar2 == null) {
                    ucyVar2 = ucy.a;
                }
                vty vtyVar = (vty) uci.a.m();
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                pjy pjyVar2 = pjyVar;
                uci uciVar = (uci) vtyVar.b;
                ucyVar2.getClass();
                uciVar.c = ucyVar2;
                uciVar.b |= 1;
                int iAz = sfy.az(pjyVar2.c);
                if (iAz == 0) {
                    iAz = 1;
                }
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                uci uciVar2 = (uci) vtyVar.b;
                uciVar2.b |= 16;
                uciVar2.e = iAz - 1;
                int iAz2 = sfy.az(pjyVar2.c);
                if (iAz2 == 0) {
                    iAz2 = 1;
                }
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                uci uciVar3 = (uci) vtyVar.b;
                uciVar3.b |= 16;
                uciVar3.e = iAz2 - 1;
                Iterator it = pjyVar2.d.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 100000001:
                            vvd vvdVar2 = ple.b;
                            pjyVar2.i(vvdVar2);
                            Object objK = pjyVar2.l.k((vub) vvdVar2.c);
                            if (objK == null) {
                                objK = vvdVar2.b;
                            } else {
                                vvdVar2.c(objK);
                            }
                            int iAL = a.aL(((plf) objK).c);
                            if (iAL == 0) {
                                iAL = 1;
                            }
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            uci uciVar4 = (uci) vtyVar.b;
                            uciVar4.b |= 32;
                            uciVar4.f = iAL - 1;
                            break;
                        case 100000002:
                            vvd vvdVar3 = ple.c;
                            pjyVar2.i(vvdVar3);
                            Object objK2 = pjyVar2.l.k((vub) vvdVar3.c);
                            if (objK2 == null) {
                                objK2 = vvdVar3.b;
                            } else {
                                vvdVar3.c(objK2);
                            }
                            int iBm = a.bm(((udh) objK2).c);
                            if (iBm == 0) {
                                iBm = 1;
                            }
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            uci uciVar5 = (uci) vtyVar.b;
                            uciVar5.b |= 64;
                            uciVar5.g = iBm - 1;
                            break;
                        case 100000003:
                            vvd vvdVar4 = pmu.b;
                            pjyVar2.i(vvdVar4);
                            Object objK3 = pjyVar2.l.k((vub) vvdVar4.c);
                            if (objK3 == null) {
                                objK3 = vvdVar4.b;
                            } else {
                                vvdVar4.c(objK3);
                            }
                            int i = ((pmd) objK3).b;
                            if (!vtyVar.b.A()) {
                                vtyVar.u();
                            }
                            uci uciVar6 = (uci) vtyVar.b;
                            uciVar6.b |= 128;
                            uciVar6.h = i;
                            break;
                    }
                }
                vty vtyVar2 = (vty) uan.a.m();
                long j = plkVar2.d;
                if (j != -1) {
                    vvd vvdVar5 = uau.b;
                    vtw vtwVarM3 = uas.a.m();
                    vtw vtwVarM4 = uat.a.m();
                    if (!vtwVarM4.b.A()) {
                        vtwVarM4.u();
                    }
                    uat uatVar = (uat) vtwVarM4.b;
                    uatVar.b |= 1;
                    uatVar.c = j;
                    uat uatVar2 = (uat) vtwVarM4.r();
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    uas uasVar = (uas) vtwVarM3.b;
                    uatVar2.getClass();
                    uasVar.c = uatVar2;
                    uasVar.b = 1 | uasVar.b;
                    vtyVar2.bL(vvdVar5, (uas) vtwVarM3.r());
                }
                List list = arrayList;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((plr) sfy.J((uhp) it2.next())).a(vtyVar2);
                    }
                }
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                List list2 = arrayList2;
                uci uciVar7 = (uci) vtyVar.b;
                uan uanVar = (uan) vtyVar2.r();
                uanVar.getClass();
                uciVar7.j = uanVar;
                uciVar7.b |= 16384;
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((plr) sfy.J((uhp) it3.next())).a(vtyVar);
                    }
                }
                vty[] vtyVarArr = (vty[]) sfy.J(uhpVarAS);
                if (vtyVarArr != null) {
                    for (?? r2 = z2; r2 < vtyVarArr.length; r2++) {
                        vty vtyVar3 = vtyVarArr[r2];
                        if (!vtyVar.b.A()) {
                            vtyVar.u();
                        }
                        uci uciVar8 = (uci) vtyVar.b;
                        ucj ucjVar = (ucj) vtyVar3.r();
                        ucjVar.getClass();
                        vun vunVar = uciVar8.i;
                        if (!vunVar.c()) {
                            uciVar8.i = vuc.s(vunVar);
                        }
                        uciVar8.i.add(ucjVar);
                    }
                }
                uci uciVar9 = (uci) vtyVar.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                uao uaoVar4 = (uao) vtwVarM.b;
                uciVar9.getClass();
                uaoVar4.f = uciVar9;
                uaoVar4.b |= 16;
                return (uao) vtwVarM.r();
            }
        }, ugk.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, pkq] */
    public final void r(vtz vtzVar, List list, vvi vviVar, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            yfo yfoVar = (yfo) this.c.get(num);
            pls plsVar = yfoVar == null ? null : (pls) yfoVar.b();
            if (plsVar != null) {
                vvd vvdVarB = ((vtp) this.b).b((vtz) ((vuc) vtzVar.a(6, null)), num.intValue());
                if (vvdVarB == null) {
                    this.a.a(new IllegalStateException("Extension with tag #" + num + " not found. Ensure " + String.valueOf(vtzVar.getClass()) + "is properly extended."));
                } else {
                    vtzVar.i(vvdVarB);
                    Object objK = vtzVar.l.k((vub) vvdVarB.c);
                    if (objK == null) {
                        objK = vvdVarB.b;
                    } else {
                        vvdVarB.c(objK);
                    }
                    uhp uhpVarA = plsVar.a((vvj) objK);
                    if (pls.a.equals(uhpVarA)) {
                        continue;
                    } else if (vviVar != null) {
                        try {
                            ((plr) sfy.J(uhpVarA)).a(vviVar);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(uhpVarA);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, nfd] */
    public final nex s(Context context, owe oweVar) {
        Object obj = this.b;
        ovy ovyVar = oweVar.a;
        int i = 0;
        owf owfVar = new owf(ovyVar.c, (List) ((tst) obj).e(yhb.a), ovyVar.d, i);
        int i2 = owi.a;
        return new nex(context, "https://s.youtube.com/api/stats/qoe", this.c, owfVar, new owh(oweVar, i), new elg());
    }

    public final void t(Map map) {
        Resources resources = (Resources) this.b;
        map.put(Integer.valueOf(R.layout.details_userfeedback_section), new tid(resources.getInteger(R.integer.details_user_feedback_row_span_with_userfeedback_text), resources.getInteger(R.integer.details_section_row_span_default)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [iea, java.lang.Object] */
    public final void u(ntp ntpVar) {
        ntpVar.c(this.c, (ifc) this.a);
    }

    public final cb v(final boolean z) {
        wly wlyVar = ((wso) this.b).e;
        if (wlyVar == null) {
            wlyVar = wly.a;
        }
        if (a.bm(wlyVar.b) == 3) {
            Object obj = this.c;
            final String str = wlyVar.b == 2 ? (String) wlyVar.c : "";
            str.getClass();
            final isf isfVar = (isf) obj;
            return new cb(iob.a, new yjk() { // from class: inw
                @Override // defpackage.yjk
                public final Object a() {
                    isf isfVar2 = isfVar;
                    String str2 = str;
                    return new ioa(str2, z, new inx(isfVar2, str2, null), isfVar2);
                }
            });
        }
        Object obj2 = this.c;
        final vun vunVar = (wlyVar.b == 1 ? (wom) wlyVar.c : wom.a).c;
        vunVar.getClass();
        final String str2 = (wlyVar.b == 1 ? (wom) wlyVar.c : wom.a).e;
        str2.getClass();
        final isf isfVar2 = (isf) obj2;
        return new cb(iob.a, new yjk() { // from class: inv
            @Override // defpackage.yjk
            public final Object a() {
                return new ioa("FIRST_PAGE_TOKEN", z, new iyc(vunVar, str2, (yih) null, 1), isfVar2);
            }
        });
    }

    public jzs(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public jzs(String str, nfa nfaVar, nez[] nezVarArr) {
        this.c = str;
        this.b = nfaVar;
        this.a = nezVarArr;
    }

    public jzs(jzs jzsVar, jzs jzsVar2, jzs jzsVar3) {
        this.b = jzsVar;
        this.a = jzsVar2;
        this.c = jzsVar3;
    }

    public jzs(ldv ldvVar, lyz lyzVar, Executor executor) {
        this.c = ldvVar;
        this.a = lyzVar;
        this.b = executor;
    }

    public jzs(iea ieaVar, final lio lioVar, Resources resources, final ieh iehVar, final pkg pkgVar, final pjx pjxVar, final boolean z) {
        this.c = ieaVar;
        iff iffVar = new iff();
        iffVar.f(R.layout.details_userfeedback_section);
        iffVar.c = new icv() { // from class: nao
            @Override // defpackage.icv
            public final void a(Object obj, Object obj2) {
                nau nauVar = (nau) obj;
                UserFeedbackView userFeedbackView = (UserFeedbackView) ((View) obj2);
                lio lioVar2 = lioVar;
                pkg pkgVar2 = pkgVar;
                pjx pjxVar2 = pjxVar;
                jxl.I(nauVar, userFeedbackView, lioVar2, pkgVar2, pjxVar2, z);
                ((pke) pkgVar2.b).b(109943).b(userFeedbackView.findViewById(R.id.download_button));
                lif lifVar = new lif(liq.e(612), lioVar2);
                lioVar2.d(lifVar.b);
                Object objA = iehVar.a();
                View viewFindViewById = userFeedbackView.findViewById(R.id.feedback_section_download);
                View view = userFeedbackView.d;
                int i = true != nauVar.e ? 8 : 0;
                view.setVisibility(i);
                userFeedbackView.h.setVisibility(i);
                userFeedbackView.f.e(nauVar.a);
                kuj kujVar = (kuj) objA;
                userFeedbackView.f.c(kujVar);
                userFeedbackView.h.setSelected(kujVar.f());
                boolean zF = kujVar.f();
                int i2 = R.style.DetailsUserFeedbackSectionItemTextMedium;
                if (zF) {
                    TextView textView = userFeedbackView.h;
                    if (true == nauVar.g) {
                        i2 = R.style.GtvDetailsUserFeedbackSectionItemClickedTextMedium;
                    }
                    textView.setTextAppearance(i2);
                } else {
                    TextView textView2 = userFeedbackView.h;
                    if (true == nauVar.g) {
                        i2 = R.style.GtvDetailsUserFeedbackSectionItemTextMedium;
                    }
                    textView2.setTextAppearance(i2);
                }
                if (nauVar.g) {
                    if (kujVar.f()) {
                        viewFindViewById.setVisibility(8);
                        userFeedbackView.g.setVisibility(0);
                        userFeedbackView.g.setImageResource(R.drawable.ic_downloaded);
                    } else if (kujVar.h()) {
                        viewFindViewById.setVisibility(0);
                        userFeedbackView.g.setVisibility(8);
                    } else {
                        viewFindViewById.setVisibility(8);
                        userFeedbackView.g.setVisibility(0);
                        userFeedbackView.g.setImageResource(R.drawable.ic_download_grey600_24dp);
                    }
                    userFeedbackView.e.setVisibility(true != kujVar.h() ? 0 : 8);
                }
                TextView textView3 = userFeedbackView.h;
                Resources resources2 = userFeedbackView.getResources();
                textView3.setText(kujVar.h() ? resources2.getString(R.string.downloading) : kujVar.f() ? resources2.getString(R.string.download_successful) : (kujVar.i() || kujVar.j()) ? resources2.getString(R.string.alert_download_failed) : kujVar.k() ? resources2.getString(R.string.download_pending) : resources2.getString(R.string.download));
                userFeedbackView.d.setOnClickListener(new iuy(pjxVar2, lifVar, 20));
            }
        };
        iffVar.g(ksd.a());
        iffVar.d();
        this.a = iffVar.c();
        this.b = resources;
    }

    public jzs(ieg iegVar, String str, String str2, SharedPreferences sharedPreferences) {
        String strCq;
        sharedPreferences.getClass();
        this.c = sharedPreferences;
        String strConcat = iegVar.m() ? krh.MULTI_AUDIO_SUBTITLE_ASSET_PREFIX.concat(iegVar.g().toString()) : krh.MULTI_AUDIO_SUBTITLE_ASSET_PREFIX;
        if (str2 == null) {
            strCq = a.cq(str, strConcat, "_");
        } else {
            strCq = a.cq(str2, strConcat, "_");
        }
        this.a = strCq;
        this.b = iegVar.m() ? krh.MULTI_AUDIO_SUBTITLE_FUTURE_PREFIX.concat(iegVar.g().toString()) : krh.MULTI_AUDIO_SUBTITLE_FUTURE_PREFIX;
    }

    public jzs(String str, ocv ocvVar, npj npjVar) {
        ocv.aG(ocvVar, "Cannot construct an Api with a null ClientBuilder");
        this.a = str;
        this.c = ocvVar;
        this.b = npjVar;
    }

    public jzs(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, byte[] bArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
    }

    public jzs(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
    }

    public jzs(nem nemVar, nes nesVar, tst tstVar) {
        this.a = nemVar;
        this.b = tstVar;
        this.c = new ner(yhc.a, nesVar, new nem() { // from class: owa
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nem] */
            @Override // defpackage.nem
            public final void a(long j, Runnable runnable) {
                this.b.a.a(j, runnable);
            }
        });
    }

    public jzs(Map map, pkq pkqVar) {
        this.b = vtp.a();
        this.c = map;
        this.a = pkqVar;
    }

    public jzs(Map map, xbw xbwVar) {
        map.getClass();
        xbwVar.getClass();
        this.a = map;
        this.b = xbwVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            ((ixj) entry.getValue()).b();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.c = linkedHashMap.keySet();
    }

    public jzs(yfo yfoVar, yfo yfoVar2, yfo yfoVar3) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
    }

    private jzs(iea ieaVar, final lio lioVar, Resources resources, final pkg pkgVar, final pjx pjxVar, final boolean z) {
        this.c = ieaVar;
        iff iffVar = new iff();
        iffVar.f(R.layout.details_userfeedback_section);
        iffVar.c = new icv() { // from class: nap
            @Override // defpackage.icv
            public final void a(Object obj, Object obj2) {
                jxl.I((nau) obj, (UserFeedbackView) ((View) obj2), lioVar, pkgVar, pjxVar, z);
            }
        };
        iffVar.g(ksd.a());
        iffVar.d();
        this.a = iffVar.c();
        this.b = resources;
    }

    public jzs(isf isfVar, wkx wkxVar) {
        this.c = isfVar;
        this.a = wkxVar;
        vvd vvdVar = wso.i;
        wkx wkxVar2 = wkxVar;
        wkxVar2.i(vvdVar);
        Object objK = wkxVar2.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        objK.getClass();
        this.b = (wso) objK;
    }

    public jzs(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        this.a = yfoVar3;
    }

    public jzs(byte[] bArr) {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new ArrayList();
    }

    public jzs(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
    }

    public jzs(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
    }

    public jzs() {
        this.a = new SparseArray();
        this.c = new ThreadPoolExecutor(4, 4, 30L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new rna("sync", 10, 1));
        this.b = new AtomicInteger();
    }
}
