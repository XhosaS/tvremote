package defpackage;

import android.os.SystemClock;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class paw implements pao {
    public static final tvn a = tvn.n("GnpSdk");
    public final xbw b;
    public final String c;
    private final pan d;
    private final unx e = new unx();

    public paw(pbg pbgVar, xbw xbwVar, String str) {
        this.d = pbgVar;
        this.b = xbwVar;
        this.c = str;
    }

    @Override // defpackage.pao
    public final uhp a(oyh oyhVar, String str) {
        vtw vtwVarM = oyf.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        oyf oyfVar = (oyf) vtwVarM.b;
        oyhVar.getClass();
        oyfVar.c = oyhVar;
        oyfVar.b = 2;
        final oyf oyfVar2 = (oyf) vtwVarM.r();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final pam pamVar = new pam(oyfVar2, str, Instant.now().toEpochMilli());
        final pan panVar = this.d;
        return this.e.e(new ufv() { // from class: pav
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ufv
            public final uhp a() {
                oyf oyfVar3 = oyfVar2;
                if (oyfVar3.b == 1) {
                    ((tvk) paw.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 141, "PromotionsManagerImpl.java")).E("Processing CC event. Code [%d] Source [%d] Package [%s].", Integer.valueOf((oyfVar3.b == 1 ? (uxl) oyfVar3.c : uxl.a).d), Integer.valueOf((oyfVar3.b == 1 ? (uxl) oyfVar3.c : uxl.a).c), (oyfVar3.b == 1 ? (uxl) oyfVar3.c : uxl.a).e);
                }
                int i = 0;
                if (oyfVar3.b == 2) {
                    tvn tvnVar = paw.a;
                    if (tvnVar.l().I()) {
                        oyh oyhVar2 = oyfVar3.b == 2 ? (oyh) oyfVar3.c : oyh.a;
                        tvk tvkVar = (tvk) tvnVar.l().j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 153, "PromotionsManagerImpl.java");
                        int size = oyhVar2.d.size();
                        uzg uzgVarB = uzg.b(oyhVar2.c);
                        if (uzgVarB == null) {
                            uzgVarB = uzg.UNKNOWN;
                        }
                        tvkVar.x("Processing VE event. Nodes [%d], Action [%s].", size, uzgVarB.name());
                        int i2 = 0;
                        while (i2 < oyhVar2.d.size()) {
                            int i3 = i2 + 1;
                            ((tvk) tvnVar.l().j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 160, "PromotionsManagerImpl.java")).x("  Node[%d]: [%s]", i3, TextUtils.join(",", ((oyg) oyhVar2.d.get(i2)).b));
                            i2 = i3;
                        }
                    }
                }
                final pam pamVar2 = pamVar;
                pan panVar2 = panVar;
                final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                final pbg pbgVar = (pbg) panVar2;
                rbi rbiVar = pbgVar.y;
                String str2 = pamVar2.b;
                uhp uhpVarC = ((pdw) rbiVar.g(str2)).c();
                oyj oyjVar = new oyj(10);
                ugk ugkVar = ugk.a;
                final uhp uhpVarI = ufn.i(uhpVarC, oyjVar, ugkVar);
                HashSet hashSet = new HashSet();
                Iterator it = pbgVar.k.a().iterator();
                while (it.hasNext()) {
                    hashSet.add(((pdw) pbgVar.z.g((String) it.next())).c());
                }
                hashSet.add(((pdw) pbgVar.z.g(null)).c());
                final uhp uhpVarA = sfy.O(hashSet).a(new eet(hashSet, 13), ugkVar);
                final uhp uhpVarC2 = ((pdw) pbgVar.A.g(str2)).c();
                final uhp uhpVarI2 = TextUtils.isEmpty(str2) ? ufn.i(((cb) pbgVar.v.b()).G(), new oyj(11), ugkVar) : sfy.C(trk.a);
                final long j = jElapsedRealtime;
                final paw pawVar = this.a;
                return ues.i(ufn.i(uhi.v(ufn.j(ufn.j(uhi.v(ufn.j(sfy.P(uhpVarI, uhpVarA, uhpVarC2, uhpVarI2).a(new Callable() { // from class: pba
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, yow] */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str3;
                        List<uwi> list;
                        String str4;
                        pam pamVar3;
                        qen qenVar;
                        pam pamVar4;
                        boolean z;
                        boolean zBooleanValue = ((Boolean) sfy.J(uhpVarA)).booleanValue();
                        List list2 = (List) sfy.J(uhpVarI);
                        Map map = (Map) sfy.J(uhpVarC2);
                        String str5 = (String) ((tst) sfy.J(uhpVarI2)).f();
                        String str6 = "com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor";
                        String str7 = "filterPromotionsBasedOnTriggeringAndExpiration";
                        tvk tvkVar2 = (tvk) pbg.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTriggeringAndExpiration", 269, "TriggeringEventProcessor.java");
                        int size2 = list2.size();
                        pam pamVar5 = pamVar2;
                        String str8 = pamVar5.b;
                        tvkVar2.x("Checking triggering conditions for [%d] promotions for account [%s].", size2, str8);
                        pbg pbgVar2 = pbgVar;
                        String str9 = null;
                        if (TextUtils.isEmpty(str8) && TextUtils.isEmpty(str5)) {
                            list = list2;
                            pamVar3 = pamVar5;
                            str4 = str8;
                        } else {
                            qpv qpvVarT = qtl.t(str8);
                            rbi rbiVar2 = pbgVar2.B.M() ? (rbi) pbgVar2.x.b() : (rbi) pbgVar2.w.b();
                            try {
                                list = list2;
                                pamVar3 = pamVar5;
                                str4 = str8;
                                str3 = null;
                                qenVar = (qen) ((qdl) wae.W(rbiVar2.a, new pfd(rbiVar2, qpvVarT, (yih) null, 14)).get()).d();
                            } catch (InterruptedException | ExecutionException e) {
                                str3 = null;
                                list = list2;
                                str4 = str8;
                                pamVar3 = pamVar5;
                                ((tvk) ((tvk) ((tvk) pbg.a.g()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTriggeringAndExpiration", (char) 292, "TriggeringEventProcessor.java")).s("Failed to fetch GnpAccount in the TriggeringEventProcessor, not setting rtid");
                                qenVar = null;
                            }
                            str9 = qenVar != null ? qenVar.i : str3;
                        }
                        ArrayList arrayList = new ArrayList();
                        String str10 = (str5 == null || str5.length() == 0) ? "SIGNED_IN" : "SIGNED_OUT";
                        int i4 = 0;
                        for (uwi uwiVar : list) {
                            uwm uwmVar = uwiVar.c;
                            if (uwmVar == null) {
                                uwmVar = uwm.a;
                            }
                            String strValueOf = String.valueOf(uwmVar.b);
                            String str11 = pamVar3.b;
                            String str12 = str10;
                            oyc oycVarA = oyd.a();
                            oycVarA.a = str11;
                            oycVarA.c(uwiVar);
                            String str13 = str6;
                            String str14 = str7;
                            oycVarA.d(pamVar3.c);
                            oycVarA.b = (vko) map.get(osk.u(uwiVar));
                            oycVarA.c = str9;
                            oyd oydVarA = oycVarA.a();
                            xbw xbwVar = pbgVar2.p;
                            qoj qojVar = (qoj) xbwVar.b();
                            Map map2 = map;
                            String str15 = pbgVar2.q;
                            ((snf) qojVar.o.get()).b(str15, str12);
                            Set set = pbgVar2.l;
                            uyr uyrVar = uwiVar.f;
                            if (uyrVar == null) {
                                uyrVar = uyr.a;
                            }
                            uyq uyqVarB = uyq.b(uyrVar.e);
                            if (uyqVarB == null) {
                                uyqVarB = uyq.UITYPE_NONE;
                            }
                            if (set.contains(uyqVarB)) {
                                ((snf) ((qoj) xbwVar.b()).p.get()).b(str15);
                                int i5 = 0;
                                while (true) {
                                    uzf uzfVar = uwiVar.e;
                                    if (uzfVar == null) {
                                        uzfVar = uzf.a;
                                    }
                                    if (i5 >= uzfVar.c.size()) {
                                        pamVar4 = pamVar3;
                                        i5 = -1;
                                        break;
                                    }
                                    uzf uzfVar2 = uwiVar.e;
                                    if (uzfVar2 == null) {
                                        uzfVar2 = uzf.a;
                                    }
                                    final uze uzeVar = (uze) uzfVar2.c.get(i5);
                                    uwm uwmVar2 = uwiVar.c;
                                    if (uwmVar2 == null) {
                                        uwmVar2 = uwm.a;
                                    }
                                    pamVar4 = pamVar3;
                                    final ozl ozlVar = new ozl(str11, uwmVar2, pamVar3.a);
                                    if (Collection.EL.stream(pbgVar2.i).anyMatch(new Predicate() { // from class: pay
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo438negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            tvn tvnVar2 = pbg.a;
                                            return ((ozm) obj).test(uzeVar, ozlVar);
                                        }
                                    })) {
                                        break;
                                    }
                                    i5++;
                                    pamVar3 = pamVar4;
                                }
                                if (i5 >= 0) {
                                    ((snf) ((qoj) xbwVar.b()).q.get()).b(str15);
                                    ozk ozkVar = pbgVar2.h;
                                    uzf uzfVar3 = uwiVar.e;
                                    if (uzfVar3 == null) {
                                        uzfVar3 = uzf.a;
                                    }
                                    uzd uzdVar = uzfVar3.d;
                                    if (uzdVar == null) {
                                        uzdVar = uzd.a;
                                    }
                                    uwm uwmVar3 = uwiVar.c;
                                    if (uwmVar3 == null) {
                                        uwmVar3 = uwm.a;
                                    }
                                    if (ozkVar.test(uzdVar, new ozj(str11, uwmVar3, oydVarA, zBooleanValue))) {
                                        ((snf) ((qoj) xbwVar.b()).m.get()).b(str15);
                                        xbw xbwVar2 = pbgVar2.o;
                                        ((oxp) xbwVar2.b()).l(oydVarA, i5);
                                        if (pbg.a(uwiVar)) {
                                            i4++;
                                            oyi oyiVar = pbgVar2.s;
                                            vwe vweVar = uwiVar.i;
                                            if (vweVar == null) {
                                                vweVar = vwe.a;
                                            }
                                            vxf.g(vweVar);
                                            long j2 = vweVar.b;
                                            int i6 = vweVar.c;
                                            StringBuilder sb = new StringBuilder();
                                            z = zBooleanValue;
                                            sb.append(((SimpleDateFormat) vxf.c.get()).format(new Date(j2 * 1000)));
                                            if (i6 != 0) {
                                                sb.append(".");
                                                sb.append(i6 % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i6 / 1000000)) : i6 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i6 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i6)));
                                            }
                                            sb.append("Z");
                                            oyiVar.c(oydVarA, "Promotion was expired on %s.", sb.toString());
                                            ((oxp) xbwVar2.b()).d(oydVarA);
                                            ((snf) ((qoj) xbwVar.b()).k.get()).b(str15, str12);
                                            vwe vweVar2 = uwiVar.i;
                                            if (vweVar2 == null) {
                                                vweVar2 = vwe.a;
                                            }
                                            ((snc) ((qoj) xbwVar.b()).l.get()).b((int) Duration.between(vxr.d(vweVar2), Instant.now()).toSeconds(), str15, str12);
                                        } else {
                                            z = zBooleanValue;
                                            arrayList.add(oydVarA);
                                        }
                                    } else {
                                        pbgVar2.s.c(oydVarA, "Failed Triggering Conditions.", new Object[0]);
                                    }
                                }
                                str10 = str12;
                                str6 = str13;
                                str7 = str14;
                                map = map2;
                                pamVar3 = pamVar4;
                                zBooleanValue = z;
                            } else {
                                oyi oyiVar2 = pbgVar2.s;
                                uyr uyrVar2 = uwiVar.f;
                                if (uyrVar2 == null) {
                                    uyrVar2 = uyr.a;
                                }
                                uyq uyqVarB2 = uyq.b(uyrVar2.e);
                                if (uyqVarB2 == null) {
                                    uyqVarB2 = uyq.UITYPE_NONE;
                                }
                                oyiVar2.b(oydVarA, "Promotion [%s] has an unsupported UI type [%s]", strValueOf, uyqVarB2.name());
                                pamVar4 = pamVar3;
                            }
                            z = zBooleanValue;
                            str10 = str12;
                            str6 = str13;
                            str7 = str14;
                            map = map2;
                            pamVar3 = pamVar4;
                            zBooleanValue = z;
                        }
                        String str16 = str6;
                        String str17 = str7;
                        if (i4 > 0) {
                            ((tvk) pbg.a.l().j(str16, str17, 385, "TriggeringEventProcessor.java")).x("Found %d expired promotion for account %s, dropping them from the DB.", i4, str4);
                            ((pdw) pbgVar2.y.g(str4)).b((ImmutableMap) Collection.EL.stream(list).filter(Predicate$CC.not(new pbd(0))).collect(ImmutableMap.toImmutableMap(new nrc(3), Function$CC.identity())));
                        }
                        return arrayList;
                    }
                }, ugkVar), new ufw() { // from class: pbc
                    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object, java.util.concurrent.Executor] */
                    @Override // defpackage.ufw
                    public final uhp a(Object obj) {
                        int i4;
                        pbf pbfVarA;
                        int i5;
                        uhp uhpVarJ;
                        final List list = (List) obj;
                        if (list.isEmpty()) {
                            return sfy.C(ImmutableList.of());
                        }
                        final pbg pbgVar2 = pbgVar;
                        pbe pbeVar = new pbe();
                        int i6 = 3;
                        if (list == null) {
                            pbfVarA = pbeVar.a();
                            i4 = 3;
                        } else {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                uxo uxoVar = ((oyd) it2.next()).c.d;
                                if (uxoVar == null) {
                                    uxoVar = uxo.a;
                                }
                                Iterator<E> it3 = uxoVar.b.iterator();
                                while (it3.hasNext()) {
                                    for (uxn uxnVar : ((uxm) it3.next()).b) {
                                        int i7 = uxnVar.c;
                                        int iAM = a.aM(i7);
                                        if (iAM == 0) {
                                            throw null;
                                        }
                                        int i8 = iAM - 1;
                                        if (i8 == 0) {
                                            for (uxp uxpVar : (i7 == 2 ? (uxt) uxnVar.d : uxt.a).c) {
                                                int i9 = uxpVar.b;
                                                int iS = sij.S(i9);
                                                int i10 = iS - 1;
                                                if (iS == 0) {
                                                    throw null;
                                                }
                                                if (i10 == 0) {
                                                    i5 = i6;
                                                    uxl uxlVar = i9 == 1 ? (uxl) uxpVar.c : uxl.a;
                                                    if (pbeVar.a == null) {
                                                        pbeVar.a = ImmutableSet.builder();
                                                    }
                                                    pbeVar.a.add((ImmutableSet.Builder) uxlVar);
                                                } else if (i10 != 1) {
                                                    i5 = i6;
                                                    ((tvk) pbg.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "getTargetingData", 809, "TriggeringEventProcessor.java")).s("Received an unknown targeting term, ignoring.");
                                                } else {
                                                    i5 = i6;
                                                    uzh uzhVar = i9 == 2 ? (uzh) uxpVar.c : uzh.a;
                                                    if (pbeVar.b == null) {
                                                        pbeVar.b = ImmutableSet.builder();
                                                    }
                                                    pbeVar.b.add((ImmutableSet.Builder) uzhVar);
                                                }
                                                i6 = i5;
                                            }
                                        } else if (i8 == 1) {
                                            String str3 = (i7 == i6 ? (uxk) uxnVar.d : uxk.a).e;
                                            if (pbeVar.c == null) {
                                                pbeVar.c = ImmutableSet.builder();
                                            }
                                            pbeVar.c.add((ImmutableSet.Builder) str3);
                                        } else if (i8 == i6) {
                                            uvu uvuVarB = uvu.b((i7 == 5 ? (uxh) uxnVar.d : uxh.a).c);
                                            if (uvuVarB == null) {
                                                uvuVarB = uvu.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
                                            }
                                            uvu uvuVar = uvu.ANDROID_POST_NOTIFICATIONS;
                                            if (uvuVarB != uvuVar || (qtl.K(pbgVar2.b) && uvuVarB == uvuVar)) {
                                                String strA = osk.A(uvuVarB);
                                                if (!pbeVar.b().build().contains(strA)) {
                                                    pbeVar.b().add((ImmutableSet.Builder) strA);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i4 = i6;
                            pbfVarA = pbeVar.a();
                        }
                        final pam pamVar3 = pamVar2;
                        ImmutableSet immutableSet = pbfVarA.a;
                        uhp uhpVarC3 = immutableSet.isEmpty() ? sfy.C(ImmutableMap.of()) : ((pdv) pbgVar2.c.b()).c(pamVar3.b, immutableSet);
                        ImmutableSet immutableSet2 = pbfVarA.b;
                        uhp uhpVarC4 = immutableSet2.isEmpty() ? sfy.C(ImmutableMap.of()) : ((pdy) pbgVar2.d.b()).d(pamVar3.b, immutableSet2);
                        ImmutableSet immutableSet3 = pbfVarA.c;
                        if (immutableSet3.isEmpty()) {
                            uhpVarJ = sfy.C(ImmutableMap.of());
                        } else {
                            paq paqVar = (paq) pbgVar2.n.b();
                            uhp uhpVarC5 = sfy.C(immutableSet3);
                            Object obj2 = paqVar.d;
                            uhpVarJ = ufn.j(uhpVarC5, new pap(paqVar, pamVar3, 0), paqVar.c);
                        }
                        uhp uhpVarI3 = !pbfVarA.d.isEmpty() ? ufn.i(((smc) ((kwy) ((ttd) pbgVar2.e).a).a).a(), new nbe(new oun(4), 20), ugk.a) : sfy.C(ImmutableMap.of());
                        uhp[] uhpVarArr = new uhp[4];
                        uhpVarArr[0] = uhpVarC3;
                        uhpVarArr[1] = uhpVarC4;
                        uhpVarArr[2] = uhpVarJ;
                        uhpVarArr[i4] = uhpVarI3;
                        final uhp uhpVar = uhpVarC4;
                        final uhp uhpVar2 = uhpVarI3;
                        final uhp uhpVar3 = uhpVarC3;
                        final uhp uhpVar4 = uhpVarJ;
                        return sfy.P(uhpVarArr).a(new Callable() { // from class: pax
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                pax paxVar = this;
                                Map map = (Map) uhpVar3.get();
                                Map map2 = (Map) uhpVar.get();
                                ImmutableMap immutableMap = (ImmutableMap) uhpVar4.get();
                                Map map3 = (Map) uhpVar2.get();
                                tvk tvkVar2 = (tvk) pbg.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTargeting", 472, "TriggeringEventProcessor.java");
                                pam pamVar4 = pamVar3;
                                List<oyd> list2 = list;
                                int size2 = list2.size();
                                String str4 = pamVar4.b;
                                tvkVar2.x("Checking targeting for [%d] triggered promotions for account [%s].", size2, str4);
                                ArrayList arrayList = new ArrayList();
                                for (oyd oydVar : list2) {
                                    pbg pbgVar3 = pbgVar2;
                                    uwi uwiVar = oydVar.c;
                                    pae paeVar = (pae) pbgVar3.j.b();
                                    uxo uxoVar2 = uwiVar.d;
                                    if (uxoVar2 == null) {
                                        uxoVar2 = uxo.a;
                                    }
                                    uwm uwmVar = uwiVar.c;
                                    if (uwmVar == null) {
                                        uwmVar = uwm.a;
                                    }
                                    if (paeVar.test(uxoVar2, new ozi(str4, uwmVar, oydVar, ImmutableMap.copyOf(map), ImmutableMap.copyOf(map2), ImmutableMap.copyOf((Map) immutableMap), ImmutableMap.copyOf(map3)))) {
                                        ((snf) ((qoj) pbgVar3.p.b()).n.get()).b(pbgVar3.q);
                                        arrayList.add(oydVar);
                                    } else {
                                        pbgVar3.s.c(oydVar, "Failed Targeting.", new Object[0]);
                                    }
                                    paxVar = this;
                                }
                                return arrayList;
                            }
                        }, ugk.a);
                    }
                }, ugkVar)), new pbb(panVar2, i), ugkVar), new ufw() { // from class: paz
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r16v0 */
                    /* JADX WARN: Type inference failed for: r16v3 */
                    /* JADX WARN: Type inference failed for: r16v4 */
                    /* JADX WARN: Type inference failed for: r19v1 */
                    /* JADX WARN: Type inference failed for: r19v3 */
                    /* JADX WARN: Type inference failed for: r19v4 */
                    @Override // defpackage.ufw
                    public final uhp a(Object obj) {
                        ?? r19;
                        ?? r16;
                        uhp uhpVarA2;
                        List arrayList;
                        tst tstVar = (tst) obj;
                        boolean z = false;
                        if (!tstVar.g()) {
                            return sfy.C(false);
                        }
                        oyd oydVar = (oyd) tstVar.c();
                        uwi uwiVar = oydVar.c;
                        vtw vtwVarM2 = uwg.a.m();
                        uwm uwmVar = uwiVar.c;
                        if (uwmVar == null) {
                            uwmVar = uwm.a;
                        }
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        uwg uwgVar = (uwg) vtwVarM2.b;
                        uwmVar.getClass();
                        uwgVar.c = uwmVar;
                        boolean z2 = true;
                        uwgVar.b |= 1;
                        uyr uyrVar = uwiVar.f;
                        if (uyrVar == null) {
                            uyrVar = uyr.a;
                        }
                        uxd uxdVar = uyrVar.f ? uxd.CONTROL_NOT_SEEN : pal.a;
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        pam pamVar3 = pamVar2;
                        ((uwg) vtwVarM2.b).d = uxdVar.a();
                        vtw vtwVarM3 = vwe.a.m();
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(pamVar3.c);
                        if (!vtwVarM3.b.A()) {
                            vtwVarM3.u();
                        }
                        ((vwe) vtwVarM3.b).b = seconds;
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        pbg pbgVar2 = pbgVar;
                        uwg uwgVar2 = (uwg) vtwVarM2.b;
                        vwe vweVar = (vwe) vtwVarM3.r();
                        vweVar.getClass();
                        uwgVar2.e = vweVar;
                        uwgVar2.b |= 2;
                        uwg uwgVar3 = (uwg) vtwVarM2.r();
                        String str3 = pamVar3.b;
                        uhp uhpVarD = ((pdw) pbgVar2.z.g(str3)).d(osk.u(uwiVar), uwgVar3);
                        uyr uyrVar2 = uwiVar.f;
                        if (uyrVar2 == null) {
                            uyrVar2 = uyr.a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = uyrVar2.c;
                        int iP = sij.P(i4);
                        if (iP == 0) {
                            throw null;
                        }
                        if (iP - 1 != 0) {
                            uhpVarA2 = sfy.C(ImmutableMap.of());
                            r19 = 0;
                            r16 = 1;
                        } else {
                            arrayList2.addAll((i4 == 2 ? (uyc) uyrVar2.d : uyc.a).i);
                            HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(arrayList2.size());
                            int size2 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                boolean z3 = z;
                                uxw uxwVar = (uxw) arrayList2.get(i5);
                                boolean z4 = z2;
                                mapNewHashMapWithExpectedSize.put(uxwVar, ((pfs) pbgVar2.r.b()).e(uxwVar.c == 8 ? (uxf) uxwVar.d : uxf.a, str3, uxwVar));
                                i5++;
                                z = z3;
                                z2 = z4;
                            }
                            r19 = z;
                            r16 = z2;
                            uhpVarA2 = sfy.O(mapNewHashMapWithExpectedSize.values()).a(new eet(mapNewHashMapWithExpectedSize, 11), ugk.a);
                        }
                        Map map = pbgVar2.t;
                        uyr uyrVar3 = uwiVar.f;
                        if (uyrVar3 == null) {
                            uyrVar3 = uyr.a;
                        }
                        uyq uyqVarB = uyq.b(uyrVar3.e);
                        if (uyqVarB == null) {
                            uyqVarB = uyq.UITYPE_NONE;
                        }
                        yfo yfoVar = (yfo) map.get(uyqVarB);
                        if (yfoVar != null) {
                            pkg pkgVar = (pkg) yfoVar.b();
                            uyr uyrVar4 = uwiVar.f;
                            if (uyrVar4 == null) {
                                uyrVar4 = uyr.a;
                            }
                            arrayList = pkgVar.h(uyrVar4.c == 2 ? (uyc) uyrVar4.d : uyc.a);
                            pkg pkgVar2 = (pkg) yfoVar.b();
                            uyr uyrVar5 = uwiVar.f;
                            if (uyrVar5 == null) {
                                uyrVar5 = uyr.a;
                            }
                            uyc uycVar = (uyrVar5.c == 6 ? (uyo) uyrVar5.d : uyo.a).d;
                            if (uycVar == null) {
                                uycVar = uyc.a;
                            }
                            arrayList.addAll(pkgVar2.h(uycVar));
                        } else {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(uhpVarA2);
                        arrayList.add(uhpVarD);
                        xqr xqrVarO = sfy.O(arrayList);
                        grz grzVar = new grz(oydVar, uhpVarA2, 5, null);
                        ugk ugkVar2 = ugk.a;
                        uhp uhpVarJ = ufn.j(xqrVarO.a(grzVar, ugkVar2), new pbb(pbgVar2, 3), ugkVar2);
                        int i6 = 2;
                        uhp uhpVarJ2 = ufn.j(uhpVarJ, new oyy(pbgVar2, pamVar3, uwiVar, i6), ugkVar2);
                        uhp uhpVarJ3 = ufn.j(uhpVarJ, new oyy(pbgVar2, uwgVar3, uwiVar, 3, (byte[]) null), ugkVar2);
                        uhp uhpVarJ4 = ufn.j(uhpVarJ, new pbb(pbgVar2, i6), ugkVar2);
                        uhp[] uhpVarArr = new uhp[3];
                        uhpVarArr[r19] = uhpVarJ2;
                        uhpVarArr[r16] = uhpVarJ3;
                        uhpVarArr[2] = uhpVarJ4;
                        return sfy.N(uhpVarArr).a(new eet(uhpVarJ, 12), ugkVar2);
                    }
                }, ugkVar)), new tsl() { // from class: pau
                    @Override // defpackage.tsl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        ((tvk) paw.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "instrumentProcessResult", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "PromotionsManagerImpl.java")).v("Promo shown: %s\n====", bool);
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        long j2 = jElapsedRealtime2;
                        paw pawVar2 = pawVar;
                        xbw xbwVar = pawVar2.b;
                        qoj qojVar = (qoj) xbwVar.b();
                        bool.booleanValue();
                        snc sncVar = (snc) qojVar.u.get();
                        String str3 = pawVar2.c;
                        sncVar.b(jElapsedRealtime3 - j2, str3, true, true, bool);
                        qoj qojVar2 = (qoj) xbwVar.b();
                        bool.booleanValue();
                        ((snc) qojVar2.v.get()).b(j2 - j, str3, true, true, bool);
                        return bool;
                    }
                }, ugkVar), Throwable.class, new oyj(9), ugkVar);
            }
        }, ugk.a);
    }
}
