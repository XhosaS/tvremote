package defpackage;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import com.google.android.apps.googletv.app.notifications.ChimeBroadcastReceiver;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixs extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(bhi bhiVar, jxa jxaVar, Context context, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = bhiVar;
        this.c = jxaVar;
        this.d = context;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 17:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 18:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 19:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((ixs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, pis] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r6v26, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [bcb, java.lang.Object] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.e) {
            case 0:
                Object obj2 = this.b;
                return new ixs((ixt) obj2, (ssn) this.c, (ixp) this.d, yihVar, 0);
            case 1:
                Object obj3 = this.d;
                return new ixs((isn) obj3, (wll) this.b, (String) this.c, yihVar, 1);
            case 2:
                Object obj4 = this.b;
                return new ixs((ixt) obj4, (ssn) this.c, (ixp) this.d, yihVar, 2, (byte[]) null);
            case 3:
                Object obj5 = this.b;
                return new ixs((jan) obj5, (Context) this.d, (woi) this.c, yihVar, 3);
            case 4:
                Object obj6 = this.b;
                return new ixs((wlc) obj6, (ChimeBroadcastReceiver) this.d, (String) this.c, yihVar, 4);
            case 5:
                return new ixs((jdd) this.b, (yjk) this.c, (jbl) this.d, yihVar, 5);
            case 6:
                Object obj7 = this.d;
                return new ixs((jdd) obj7, (Long) this.c, (Long) this.b, yihVar, 6);
            case 7:
                Object obj8 = this.b;
                return new ixs((jdr) obj8, (Context) this.d, (ksy) this.c, yihVar, 7);
            case 8:
                Object obj9 = this.d;
                return new ixs((jdr) obj9, (ksy) this.b, (byte[]) this.c, yihVar, 8);
            case 9:
                Object obj10 = this.b;
                return new ixs((jgv) obj10, (wni) this.c, (joz) this.d, yihVar, 9);
            case 10:
                Object obj11 = this.b;
                return new ixs((jlw) obj11, (jlu) this.d, (jma) this.c, yihVar, 10);
            case 11:
                Object obj12 = this.b;
                return new ixs((joa) obj12, (jnz) this.d, (jod) this.c, yihVar, 11);
            case 12:
                Object obj13 = this.b;
                return new ixs((bhi) obj13, (jxa) this.c, (Context) this.d, yihVar, 12);
            case 13:
                Object obj14 = this.c;
                return new ixs((fwv) obj14, (Context) this.d, (bcb) this.b, yihVar, 13);
            case 14:
                return new ixs((ovq) this.b, (yjk) this.c, (bcb) this.d, yihVar, 14);
            case 15:
                Object obj15 = this.d;
                return new ixs((sj) obj15, (yld) this.c, (bcb) this.b, yihVar, 15);
            case 16:
                Object obj16 = this.d;
                return new ixs((oxe) obj16, (uwg) this.b, (uwl) this.c, yihVar, 16);
            case 17:
                Object obj17 = this.d;
                return new ixs((pfh) obj17, (String) this.c, (vlo) this.b, yihVar, 17);
            case 18:
                return new ixs((pis) this.d, (String) this.c, (uwj) this.b, yihVar, 18);
            case 19:
                Object obj18 = this.d;
                return new ixs((pfh) obj18, (String) this.c, (vlo) this.b, yihVar, 19, (byte[]) null);
            default:
                Object obj19 = this.b;
                return new ixs((vlo) obj19, (pfh) this.d, (String) this.c, yihVar, 20);
        }
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v88, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v148, types: [java.lang.Object, oxd] */
    /* JADX WARN: Type inference failed for: r1v155, types: [java.lang.Object, pis] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        Object objB2;
        Object objI;
        Object objC;
        Object objC2;
        Object objE;
        Object objX;
        int i = 10;
        irc ircVar = null;
        switch (this.e) {
            case 0:
                yio yioVar = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    objB = obj;
                } else {
                    ybn.f(obj);
                    Object obj2 = this.b;
                    Context context = ((AlertDialog.Builder) this.c).getContext();
                    context.getClass();
                    this.a = 1;
                    objB = ((ixt) obj2).b.b(context, this);
                    if (objB == yioVar) {
                        return yioVar;
                    }
                }
                if (((Boolean) objB).booleanValue()) {
                    ((ixp) this.d).b.a();
                } else {
                    Context context2 = ((AlertDialog.Builder) this.c).getContext();
                    context2.getClass();
                    by byVarF = hju.F(context2);
                    byVarF.getClass();
                    ssn ssnVar = new ssn(byVarF);
                    ssnVar.o(R.string.turn_on_logging_failed);
                    ssnVar.d(R.string.turn_on_logging_failed_explanation);
                    ssnVar.g(R.string.ok, new ixr(2));
                    ssnVar.show();
                }
                return ygi.a;
            case 1:
                yio yioVar2 = yio.a;
                try {
                    if (this.a != 0) {
                        ybn.f(obj);
                    } else {
                        ybn.f(obj);
                        kdj kdjVar = ((isn) this.d).g;
                        Object obj3 = this.b;
                        Object obj4 = this.c;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.a = 1;
                        Object objC3 = ((hfx) kdjVar.b.b()).c(new imm(kdjVar, (wll) obj3, (String) obj4, jCurrentTimeMillis, (yih) null, 0), this);
                        if (objC3 != yioVar2) {
                            objC3 = ygi.a;
                        }
                        if (objC3 == yioVar2) {
                            return yioVar2;
                        }
                    }
                    ((icu) this.d).eb();
                } catch (Exception e) {
                    krd.c("Failed to record watch event: " + this.b + ", " + ((String) this.c) + ". Error: " + e);
                }
                return ygi.a;
            case 2:
                yio yioVar3 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    objB2 = obj;
                } else {
                    ybn.f(obj);
                    Object obj5 = this.b;
                    Context context3 = ((AlertDialog.Builder) this.c).getContext();
                    context3.getClass();
                    this.a = 1;
                    objB2 = ((ixt) obj5).b.b(context3, this);
                    if (objB2 == yioVar3) {
                        return yioVar3;
                    }
                }
                if (((Boolean) objB2).booleanValue()) {
                    ((ixp) this.d).b.a();
                } else {
                    Context context4 = ((AlertDialog.Builder) this.c).getContext();
                    context4.getClass();
                    by byVarF2 = hju.F(context4);
                    byVarF2.getClass();
                    ssn ssnVar2 = new ssn(byVarF2);
                    ssnVar2.o(R.string.turn_on_logging_failed);
                    ssnVar2.d(R.string.turn_on_logging_failed_explanation);
                    ssnVar2.g(R.string.ok, new ixr(3));
                    ssnVar2.show();
                }
                return ygi.a;
            case 3:
                yio yioVar4 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj6 = this.b;
                    Object obj7 = this.d;
                    Object obj8 = this.c;
                    this.a = 1;
                    if (((jan) obj6).a((Context) obj7, (woi) obj8, this) == yioVar4) {
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
                    wlc wlcVar = (wlc) this.b;
                    vun vunVar = wlcVar.c;
                    vunVar.getClass();
                    if (!vunVar.isEmpty()) {
                        Iterator<E> it = vunVar.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                wnw wnwVar = (wnw) it.next();
                                if (wnwVar.b == 1) {
                                    wnx wnxVarB = wnx.b(((Integer) wnwVar.c).intValue());
                                    if (wnxVarB == null) {
                                        wnxVarB = wnx.UNRECOGNIZED;
                                    }
                                    if (wnxVarB == wnx.TVOD_TRANSACTION) {
                                        izo izoVar = ((ChimeBroadcastReceiver) this.d).e;
                                        if (izoVar == null) {
                                            yks.c("libraryManager");
                                            izoVar = null;
                                        }
                                        izoVar.b();
                                    }
                                }
                            }
                        }
                    }
                    ihq ihqVar = ((ChimeBroadcastReceiver) this.d).f;
                    if (ihqVar == null) {
                        yks.c("cacheManager");
                        ihqVar = null;
                    }
                    vun vunVar2 = wlcVar.b;
                    vunVar2.getClass();
                    ArrayList arrayList = new ArrayList(yfm.z(vunVar2, 10));
                    Iterator<E> it2 = vunVar2.iterator();
                    while (it2.hasNext()) {
                        wlh wlhVarB = wlh.b(((wkl) it2.next()).b);
                        if (wlhVarB == null) {
                            wlhVarB = wlh.UNRECOGNIZED;
                        }
                        wlhVarB.getClass();
                        arrayList.add(wlhVarB);
                    }
                    Object obj9 = this.c;
                    this.a = 1;
                    if (ihqVar.b(arrayList, (String) obj9, this) == yioVar5) {
                        return yioVar5;
                    }
                }
                ChimeBroadcastReceiver chimeBroadcastReceiver = (ChimeBroadcastReceiver) this.d;
                iea ieaVar = chimeBroadcastReceiver.a;
                if (ieaVar == null) {
                    yks.c("accountRepository");
                    ieaVar = null;
                }
                ksn ksnVar = (ksn) ((ldy) ieaVar).a().c;
                if (yks.e(ksnVar != null ? ksnVar.a : null, this.c)) {
                    wlc wlcVar2 = (wlc) this.b;
                    String str = wlcVar2.d;
                    str.getClass();
                    if (str.length() > 0) {
                        usc uscVar = chimeBroadcastReceiver.g;
                        if (uscVar == null) {
                            yks.c("consistencyTokenManager");
                            uscVar = null;
                        }
                        uscVar.a(ImmutableList.of(), wlcVar2.d);
                    }
                    irc ircVar2 = chimeBroadcastReceiver.h;
                    if (ircVar2 == null) {
                        yks.c("refreshTriggerManager");
                    } else {
                        ircVar = ircVar2;
                    }
                    vun vunVar3 = wlcVar2.c;
                    vunVar3.getClass();
                    ircVar.c(vunVar3);
                }
                return ygi.a;
            case 5:
                yio yioVar6 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    objI = obj;
                } else {
                    ybn.f(obj);
                    jdd jddVar = (jdd) this.b;
                    irc ircVarR = jddVar.R();
                    wni wniVarB = jddVar.I.c.b();
                    this.a = 1;
                    objI = ircVarR.i(wniVarB, this);
                    if (objI == yioVar6) {
                        return yioVar6;
                    }
                }
                wnj wnjVar = (wnj) objI;
                if (yks.e(wnjVar, wnj.a)) {
                    this.c.a();
                    return ygi.a;
                }
                vtl vtlVar = wnjVar.c;
                if (vtlVar == null) {
                    vtlVar = vtl.a;
                }
                Duration durationOfSeconds = Duration.ofSeconds(vtlVar.b);
                durationOfSeconds.getClass();
                vwe vweVar = wnjVar.d;
                if (vweVar == null) {
                    vweVar = vwe.a;
                }
                Instant instantOfEpochSecond = Instant.ofEpochSecond(vweVar.b);
                instantOfEpochSecond.getClass();
                ((jdd) this.b).r((jbl) this.d, new jbl(durationOfSeconds, instantOfEpochSecond));
                this.c.a();
                return ygi.a;
            case 6:
                yio yioVar7 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj10 = this.d;
                    Object obj11 = this.c;
                    Object obj12 = this.b;
                    dvk viewLifecycleOwner = ((bv) obj10).getViewLifecycleOwner();
                    dvd dvdVar = dvd.d;
                    dkg dkgVar = new dkg((jdd) obj10, (Long) obj11, (Long) obj12, (yih) null, 5);
                    this.a = 1;
                    if (dvb.h(viewLifecycleOwner, dvdVar, dkgVar, this) == yioVar7) {
                        return yioVar7;
                    }
                }
                return ygi.a;
            case 7:
                yio yioVar8 = yio.a;
                try {
                    if (this.a != 0) {
                        ybn.f(obj);
                    } else {
                        ybn.f(obj);
                        Object obj13 = this.b;
                        Object obj14 = this.c;
                        this.a = 1;
                        if (((jdr) obj13).c((ksy) obj14, this) == yioVar8) {
                            return yioVar8;
                        }
                    }
                    ((tug) jdr.a.e().j("com/google/android/apps/googletv/app/player/offline/OfflineControllerImpl$prepareDownloadHelper$1$onPrepared$1", "invokeSuspend", 239, "OfflineControllerImpl.kt")).v("Artwork loaded and cached for %s", ((ksy) this.c).c);
                } catch (Exception e2) {
                    ((tug) ((tug) jdr.a.g()).i(e2).j("com/google/android/apps/googletv/app/player/offline/OfflineControllerImpl$prepareDownloadHelper$1$onPrepared$1", "invokeSuspend", 244, "OfflineControllerImpl.kt")).B("Error loading artwork from URL (%s): %s", ((ksy) this.c).c, e2.getMessage());
                }
                return ygi.a;
            case 8:
                yio yioVar9 = yio.a;
                try {
                    if (this.a != 0) {
                        ybn.f(obj);
                    } else {
                        ybn.f(obj);
                        jec jecVar = ((jdr) this.d).e;
                        Object obj15 = this.b;
                        Object obj16 = this.c;
                        this.a = 1;
                        jecVar.a((ksy) obj15).b((byte[]) obj16);
                        if (ygi.a == yioVar9) {
                            return yioVar9;
                        }
                    }
                } catch (eow e3) {
                    krd.g("Offline license manager wasn't able to release license, probably because it's expired", e3);
                }
                return ygi.a;
            case 9:
                yio yioVar10 = yio.a;
                try {
                    if (this.a != 0) {
                        ybn.f(obj);
                    } else {
                        ybn.f(obj);
                        Object obj17 = this.b;
                        ino inoVar = ((jgv) obj17).e;
                        Object obj18 = this.c;
                        isg isgVar = new isg(obj17, this.d, i, 0 == true ? 1 : 0);
                        this.a = 1;
                        if (inoVar.j((wni) obj18, isgVar, this) == yioVar10) {
                            return yioVar10;
                        }
                    }
                } catch (Exception e4) {
                    krd.d("Failed to cancel preorder.", e4);
                }
                return ygi.a;
            case 10:
                yio yioVar11 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    objC = obj;
                } else {
                    ybn.f(obj);
                    Object obj19 = this.b;
                    wlx wlxVar = ((wvd) ((ixi) this.d).b).e;
                    if (wlxVar == null) {
                        wlxVar = wlx.a;
                    }
                    iyz iyzVar = ((jlw) obj19).s;
                    this.a = 1;
                    objC = hju.C(iyzVar, wlxVar, this);
                    if (objC == yioVar11) {
                        return yioVar11;
                    }
                }
                Integer num = (Integer) objC;
                if (num != null) {
                    Object obj20 = this.b;
                    Object obj21 = this.d;
                    Object obj22 = this.c;
                    num.intValue();
                    int iIntValue = num.intValue();
                    jlw jlwVar = (jlw) obj20;
                    kja kjaVar = jlwVar.g;
                    kjaVar.a(iIntValue);
                    jlwVar.q = ((wvd) ((ixi) obj21).b).c;
                    ((jma) obj22).r((wfo) ((kiz) kjaVar).a.d());
                }
                return ygi.a;
            case 11:
                yio yioVar12 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    objC2 = obj;
                } else {
                    ybn.f(obj);
                    Object obj23 = this.b;
                    wlx wlxVar2 = ((wsd) ((ixi) this.d).b).f;
                    if (wlxVar2 == null) {
                        wlxVar2 = wlx.a;
                    }
                    iyz iyzVar2 = ((joa) obj23).d;
                    this.a = 1;
                    objC2 = hju.C(iyzVar2, wlxVar2, this);
                    if (objC2 == yioVar12) {
                        return yioVar12;
                    }
                }
                Integer num2 = (Integer) objC2;
                if (num2 != null) {
                    wfo wfoVarC = kpt.c(num2.intValue(), 0, 6);
                    Object obj24 = this.c;
                    jod jodVar = (jod) obj24;
                    jodVar.r(new Integer(wfoVarC.o()));
                    Integer num3 = new Integer(wfoVarC.g());
                    if (!yks.e(jodVar.g, num3)) {
                        jodVar.g = num3;
                        ((scf) obj24).G(5);
                    }
                    Integer num4 = new Integer(wfoVarC.h());
                    if (!yks.e(jodVar.h, num4)) {
                        jodVar.h = num4;
                        ((scf) obj24).G(6);
                    }
                    Integer num5 = new Integer(wfoVarC.b());
                    if (!yks.e(jodVar.i, num5)) {
                        jodVar.i = num5;
                        ((scf) obj24).G(7);
                    }
                    Integer num6 = new Integer(wfoVarC.c());
                    if (!yks.e(jodVar.j, num6)) {
                        jodVar.j = num6;
                        ((scf) obj24).G(8);
                    }
                }
                return ygi.a;
            case 12:
                yio yioVar13 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    objE = obj;
                } else {
                    ybn.f(obj);
                    Object obj25 = this.b;
                    jxa jxaVar = (jxa) this.c;
                    String str2 = (String) jxaVar.b().a();
                    String str3 = (String) jxaVar.a().a();
                    this.a = 1;
                    objE = ((bhi) obj25).e(new avr(str2, str3), this);
                    if (objE == yioVar13) {
                        return yioVar13;
                    }
                }
                if (((awb) objE) == awb.b) {
                    ((jxa) this.c).i((Context) this.d);
                }
                return ygi.a;
            case 13:
                yio yioVar14 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj26 = this.c;
                    Object obj27 = this.d;
                    ill illVar = new ill(this.b, 20);
                    this.a = 1;
                    Object objA = new yuk(((fwv) obj26).b.s).a(new wp(obj27, illVar, 14, null), this);
                    if (objA != yioVar14) {
                        objA = ygi.a;
                    }
                    if (objA == yioVar14) {
                        return yioVar14;
                    }
                }
                return ygi.a;
            case 14:
                yio yioVar15 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    this.a = 1;
                    if (yoz.f(10000L, this) == yioVar15) {
                        return yioVar15;
                    }
                }
                ((ovq) this.b).a();
                this.c.a();
                jxl.h(this.d, false);
                return ygi.a;
            case 15:
                yio yioVar16 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    ysx ysxVarBS = a.bS(new kih(this.d, 9));
                    wp wpVar = new wp(this.c, this.b, 18);
                    this.a = 1;
                    if (ysxVarBS.a(wpVar, this) == yioVar16) {
                        return yioVar16;
                    }
                }
                return ygi.a;
            case 16:
                yio yioVar17 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                } else {
                    ybn.f(obj);
                    Object obj28 = this.d;
                    Object obj29 = this.b;
                    Object obj30 = this.c;
                    this.a = 1;
                    if (((oxe) obj28).a.a((uwg) obj29, (uwl) obj30, this) == yioVar17) {
                        return yioVar17;
                    }
                }
                return ygi.a;
            case 17:
                yio yioVar18 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                pfh pfhVar = (pfh) this.d;
                String str4 = (String) this.c;
                uhp uhpVarC = ((pdw) pfhVar.k.g(str4)).c();
                uhpVarC.getClass();
                Object obj31 = this.b;
                uwd uwdVarB = pfhVar.b();
                this.a = 1;
                Object objC4 = pfhVar.c(uhpVarC, uwdVarB, str4, (vlo) obj31, this);
                return objC4 == yioVar18 ? yioVar18 : objC4;
            case 18:
                yio yioVar19 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                ?? r1 = this.d;
                this.a = 1;
                Object objB3 = r1.b();
                return objB3 == yioVar19 ? yioVar19 : objB3;
            case 19:
                yio yioVar20 = yio.a;
                if (this.a != 0) {
                    ybn.f(obj);
                    return obj;
                }
                ybn.f(obj);
                pfh pfhVar2 = (pfh) this.d;
                String str5 = (String) this.c;
                uhp uhpVarC2 = ((pdw) pfhVar2.k.g(str5)).c();
                uhpVarC2.getClass();
                Object obj32 = this.b;
                uwd uwdVarB2 = pfhVar2.b();
                this.a = 1;
                Object objC5 = pfhVar2.c(uhpVarC2, uwdVarB2, str5, (vlo) obj32, this);
                return objC5 == yioVar20 ? yioVar20 : objC5;
            default:
                yio yioVar21 = yio.a;
                int i2 = this.a;
                ybn.f(obj);
                if (i2 != 0) {
                    objX = obj;
                } else {
                    Object obj33 = this.b;
                    if (obj33 == vlo.FETCH_REASON_UNSPECIFIED) {
                        Objects.toString(obj33);
                        return new qdj("Invalid fetchReason - ".concat(String.valueOf(obj33)), 39);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    pfh pfhVar3 = (pfh) this.d;
                    oza ozaVar = new oza(pfhVar3, (yih) null, 5);
                    yow yowVar = pfhVar3.i;
                    arrayList2.add(ykr.o(yowVar, null, ozaVar, 3));
                    Object obj34 = this.c;
                    if (obj34 == null && xgp.c()) {
                        arrayList2.add(ykr.o(yowVar, null, new pfd(pfhVar3, (vlo) obj33, (yih) null, 2), 3));
                    }
                    if (obj34 != null && xgp.b()) {
                        arrayList2.add(ykr.o(yowVar, null, new ixs(pfhVar3, (String) obj34, (vlo) obj33, (yih) null, 19, (byte[]) null), 3));
                    }
                    this.a = 1;
                    objX = ykn.x(arrayList2, this);
                    if (objX == yioVar21) {
                        return yioVar21;
                    }
                }
                return osk.aj((List) objX, pfh.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(fwv fwvVar, Context context, bcb bcbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = fwvVar;
        this.d = context;
        this.b = bcbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(isn isnVar, wll wllVar, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = isnVar;
        this.b = wllVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(ixt ixtVar, ssn ssnVar, ixp ixpVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = ixtVar;
        this.c = ssnVar;
        this.d = ixpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(ixt ixtVar, ssn ssnVar, ixp ixpVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.b = ixtVar;
        this.c = ssnVar;
        this.d = ixpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(jan janVar, Context context, woi woiVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = janVar;
        this.d = context;
        this.c = woiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(jdd jddVar, Long l, Long l2, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = jddVar;
        this.c = l;
        this.b = l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(jdd jddVar, yjk yjkVar, jbl jblVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = jddVar;
        this.c = yjkVar;
        this.d = jblVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(jdr jdrVar, Context context, ksy ksyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = jdrVar;
        this.d = context;
        this.c = ksyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(jdr jdrVar, ksy ksyVar, byte[] bArr, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = jdrVar;
        this.b = ksyVar;
        this.c = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(jgv jgvVar, wni wniVar, joz jozVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = jgvVar;
        this.c = wniVar;
        this.d = jozVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(jlw jlwVar, jlu jluVar, jma jmaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = jlwVar;
        this.d = jluVar;
        this.c = jmaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(joa joaVar, jnz jnzVar, jod jodVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = joaVar;
        this.d = jnzVar;
        this.c = jodVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(ovq ovqVar, yjk yjkVar, bcb bcbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = ovqVar;
        this.c = yjkVar;
        this.d = bcbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(oxe oxeVar, uwg uwgVar, uwl uwlVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = oxeVar;
        this.b = uwgVar;
        this.c = uwlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(pfh pfhVar, String str, vlo vloVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = pfhVar;
        this.c = str;
        this.b = vloVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(pfh pfhVar, String str, vlo vloVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.d = pfhVar;
        this.c = str;
        this.b = vloVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(pis pisVar, String str, uwj uwjVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = pisVar;
        this.c = str;
        this.b = uwjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(sj sjVar, yld yldVar, bcb bcbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = sjVar;
        this.c = yldVar;
        this.b = bcbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(vlo vloVar, pfh pfhVar, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = vloVar;
        this.d = pfhVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixs(wlc wlcVar, ChimeBroadcastReceiver chimeBroadcastReceiver, String str, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = wlcVar;
        this.d = chimeBroadcastReceiver;
        this.c = str;
    }
}
