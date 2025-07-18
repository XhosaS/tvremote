package defpackage;

import j$.time.Duration;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfs implements gfr {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor");
    private static final Map b = agrj.d(new agpi(rpm.b(), rpo.APP_COLD_START), new agpi(rpm.c(), rpo.APP_COLD_START), new agpi(rpm.d(), rpo.APP_COLD_START), new agpi(rpm.h(), rpo.APP_WARM_START), new agpi(rpm.i(), rpo.APP_WARM_START), new agpi(rpm.v(), rpo.ASSISTANT_TV_MEDIA_SESSION), new agpi(rpm.w(), rpo.ASSISTANT_TV_MEDIA_SESSION), new agpi(rpm.x(), rpo.ASSISTANT_TV_MEDIA_SESSION), new agpi(rpm.y(), rpo.ASSISTANT_TV_MEDIA_SESSION), new agpi(rpm.I(), rpo.DRAW_XUIKIT_CARD), new agpi(rpm.O(), rpo.HOMEGRAPH_SETUP), new agpi(rpm.ar(), rpo.IN_APP_INTERACTION_EXECUTION), new agpi(rpm.by(), rpo.OPERATOR_API), new agpi(rpm.bz(), rpo.OPERATOR_API), new agpi(rpm.bA(), rpo.OPERATOR_API), new agpi(rpm.bB(), rpo.OPERATOR_API), new agpi(rpm.bC(), rpo.OPERATOR_API), new agpi(rpm.bD(), rpo.OPERATOR_API), new agpi(rpm.bE(), rpo.OPERATOR_API), new agpi(rpm.bF(), rpo.PERFORMER_DEVICE_LINK_TOKEN), new agpi(rpm.bG(), rpo.PERFORMER_DEVICE_POWER), new agpi(rpm.bH(), rpo.PERFORMER_DEVICE_VOLUME), new agpi(rpm.bI(), rpo.PERFORMER_MEDIA), new agpi(rpm.bJ(), rpo.PERFORMER_OPEN), new agpi(rpm.bK(), rpo.PERFORMER_PLAY_MEDIA), new agpi(rpm.bL(), rpo.PERFORMER_UPLOAD_CRASH_REPORT), new agpi(rpm.cs(), rpo.SEARCH_BAR_STATE_UPDATE), new agpi(rpm.cu(), rpo.SEARCH_TAB_OPEN), new agpi(rpm.cA(), rpo.VOICE_PLATE_COLD_START), new agpi(rpm.cB(), rpo.VOICE_PLATE_WARM_START), new agpi(rpm.cJ(), rpo.SUGGESTED_QUERIES), new agpi(rpm.cK(), rpo.SUGGESTED_QUERIES), new agpi(rpm.cL(), rpo.SUGGESTED_QUERIES), new agpi(rpm.cM(), rpo.SUGGESTED_QUERIES), new agpi(rpm.cN(), rpo.SUGGESTED_QUERIES), new agpi(rpm.di(), rpo.VIEW_ADD_CARD), new agpi(rpm.dj(), rpo.VIEW_ADD_SPOCK), new agpi(rpm.dk(), rpo.VIEW_ADD_SPOCK), new agpi(rpm.dl(), rpo.VIEW_ADD_SPOCK), new agpi(rpm.dm(), rpo.VIEW_ADD_SPOCK), new agpi(rpm.dn(), rpo.VIEW_ADD_SPOCK), new agpi(rpm.m212do(), rpo.VIEW_ADD_TEXT), new agpi(rpm.dz(), rpo.VOICE_PLATE_COLD_START), new agpi(rpm.dA(), rpo.VOICE_PLATE_WARM_START), new agpi(rpm.dB(), rpo.VOICE_PLATE_COLD_START), new agpi(rpm.dC(), rpo.VOICE_PLATE_WARM_START), new agpi(rpm.dD(), rpo.VOICE_PLATE_COLD_START), new agpi(rpm.dE(), rpo.VOICE_PLATE_WARM_START), new agpi(rpm.dJ(), rpo.WEBVIEW_CONTENT_LOADING));
    private static final Set c = agqj.p(new rqs[]{rpm.g(), rpm.j(), rpm.k(), rpm.l(), rpm.m(), rpm.E(), rpm.N(), rpm.au(), rpm.av(), rpm.aw(), rpm.ax(), rpm.ay(), rpm.bs(), rpm.bV(), rpm.bW(), rpm.bX(), rpm.bZ(), rpm.ci(), rpm.cj(), rpm.ck(), rpm.cl(), rpm.cm(), rpm.cn(), rpm.co(), rpm.cp(), rpm.cq(), rpm.cr(), rpm.cE(), rpm.cF(), rpm.cG(), rpm.cZ(), rpm.de(), rpm.dy(), rpm.dH(), rpm.dI(), rpm.dK()});
    private final ros d;
    private final fex e;
    private final ConcurrentHashMap f;
    private volatile long g;
    private volatile long h;
    private final Set i;
    private final mcw j;

    public gfs(ros rosVar, mcw mcwVar, fex fexVar) {
        rosVar.getClass();
        mcwVar.getClass();
        fexVar.getClass();
        this.d = rosVar;
        this.j = mcwVar;
        this.e = fexVar;
        this.f = new ConcurrentHashMap();
        agwt agwtVar = agwu.a;
        this.g = -1L;
        this.h = -1L;
        this.i = agqj.p(new rqx[]{rpm.g(), rpm.j(), rpm.k(), rpm.l(), rpm.m(), rpm.B(), rpm.F(), rpm.J(), rpm.N(), rpm.P(), rpm.W(), rpm.X(), rpm.Y(), rpm.Z(), rpm.aa(), rpm.ab(), rpm.ac(), rpm.ad(), rpm.ae(), rpm.af(), rpm.ag(), rpm.ah(), rpm.ai(), rpm.aj(), rpm.ak(), rpm.al(), rpm.am(), rpm.an(), rpm.ao(), rpm.ap(), rpm.aq(), rpm.au(), rpm.av(), rpm.aw(), rpm.ax(), rpm.ay(), rpm.aA(), rpm.aC(), rpm.aD(), rpm.aM(), rpm.aN(), rpm.aR(), rpm.aT(), rpm.aU(), rpm.aV(), rpm.aX(), rpm.aY(), rpm.aZ(), rpm.bc(), rpm.bd(), rpm.be(), rpm.bf(), rpm.bk(), rpm.bl(), rpm.bm(), rpm.bn(), rpm.br(), rpm.bs(), rpm.ed(), rpm.bt(), rpm.bu(), rpm.bv(), rpm.bw(), rpm.bx(), rpm.bV(), rpm.bW(), rpm.bX(), rpm.bZ(), rpm.ca(), rpm.ci(), rpm.cj(), rpm.ck(), rpm.cl(), rpm.cm(), rpm.cn(), rpm.co(), rpm.cp(), rpm.cq(), rpm.cr(), rpm.cv(), rpm.cw(), rpm.cx(), rpm.cy(), rpm.cD(), rpm.cE(), rpm.cF(), rpm.cG(), rpm.cO(), rpm.da(), rpm.db(), rpm.dc(), rpm.dd(), rpm.de(), rpm.dh(), rpm.dH(), rpm.dI(), rpm.dK()});
    }

    private final Duration h(Duration duration) {
        if (duration != null) {
            return duration;
        }
        Duration durationOfNanos = Duration.ofNanos(this.j.a());
        durationOfNanos.getClass();
        return durationOfNanos;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(defpackage.rqs r6, defpackage.ahrs r7) {
        /*
            r5 = this;
            fex r0 = r5.e
            java.lang.String r0 = r0.b()
            if (r0 == 0) goto L5d
            abxc r1 = defpackage.ahrs.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L34
            ahrq r3 = new ahrq
            r3.<init>()
            r3.B(r7)
            abxd r7 = r3.b
            int r7 = r7.memoizedSerializedSize
            r7 = r7 & r2
            if (r7 != 0) goto L20
            r3.y()
        L20:
            abxd r7 = r3.b
            ahrs r7 = (defpackage.ahrs) r7
            int r4 = r7.e
            r4 = r4 | 2
            r7.e = r4
            r7.i = r0
            abxd r7 = r3.v()
            ahrs r7 = (defpackage.ahrs) r7
            if (r7 != 0) goto L58
        L34:
            ahrq r7 = new ahrq
            r7.<init>()
            abxd r3 = r7.b
            int r3 = r3.memoizedSerializedSize
            r2 = r2 & r3
            if (r2 != 0) goto L43
            r7.y()
        L43:
            abxd r2 = r7.b
            ahrs r2 = (defpackage.ahrs) r2
            int r3 = r2.e
            r3 = r3 | 2
            r2.e = r3
            r2.i = r0
            abxd r7 = r7.v()
            r7.getClass()
            ahrs r7 = (defpackage.ahrs) r7
        L58:
            rqt r6 = (defpackage.rqt) r6
            r6.f(r1, r7)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfs.i(rqs, ahrs):void");
    }

    private final void j(rqs rqsVar, abqb abqbVar, Duration duration, long j, boolean z, ahrs ahrsVar) {
        zdy zdyVar = a;
        rqt rqtVar = (rqt) rqsVar;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEvent", 338, "KatnissAppFlowLoggerInteractor.kt")).J("AppFlowEvent: %s, %s, %s, internalRequestId=%s", duration, true != z ? "EVENT_TYPE_MILESTONE" : "EVENT_TYPE_START", rqtVar.a.b, Long.valueOf(j));
        if (j <= 0) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEvent", 361, "KatnissAppFlowLoggerInteractor.kt")).w("Appflow logEvent is skipped. requestId=%d", j);
            return;
        }
        rqtVar.g(j);
        rqtVar.i("requestId", String.valueOf(j));
        rqsVar.b(abqbVar);
        rqtVar.c = yqt.i(duration);
        if (ahrsVar != null) {
            rqtVar.f(ahrs.d, ahrsVar);
        }
        if (z) {
            i(rqsVar, null);
        }
        this.d.a(rqsVar);
    }

    private final boolean k(rqs rqsVar) {
        return this.i.contains(rqsVar);
    }

    private final boolean l(rqs rqsVar) {
        return c.contains(rqsVar);
    }

    private final rqw m() {
        fex fexVar = this.e;
        if (fexVar.k()) {
            return rpm.eI();
        }
        if (fexVar.g()) {
            return rpm.dY();
        }
        if (fexVar.i()) {
            return rpm.eE();
        }
        return null;
    }

    private final void n(rqw rqwVar, long j, abqb abqbVar, Duration duration, ahrs ahrsVar) {
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEndEvent", 608, "KatnissAppFlowLoggerInteractor.kt")).J("AppFlowEvent: %s, %s, %s, internalRequestId=%s", duration, "EVENT_TYPE_END", rqwVar, Long.valueOf(j));
        if (j <= 0 || rqwVar == null) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEndEvent", 630, "KatnissAppFlowLoggerInteractor.kt")).R(j, rqwVar != null ? Integer.valueOf(rqwVar.c()) : null);
            return;
        }
        rqt rqtVar = (rqt) rqwVar.a;
        rqtVar.g(j);
        rqtVar.i("requestId", String.valueOf(j));
        rqs rqsVarB = rqwVar.b(abqbVar);
        rqt rqtVar2 = (rqt) rqsVarB;
        rqtVar2.c = yqt.i(duration);
        if (ahrsVar != null) {
            rqtVar2.f(ahrs.d, ahrsVar);
        }
        i(rqsVarB, ahrsVar);
        this.d.a(rqsVarB);
    }

    private final void o(rqs rqsVar, int i, Duration duration, long j) {
        zdy zdyVar = a;
        rqt rqtVar = (rqt) rqsVar;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEventWithCustomStatusCode", 480, "KatnissAppFlowLoggerInteractor.kt")).J("AppFlowEvent: %s, %s, %s, internalRequestId=%s", duration, "EVENT_TYPE_MILESTONE", rqtVar.a.b, Long.valueOf(j));
        if (j <= 0) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEventWithCustomStatusCode", 497, "KatnissAppFlowLoggerInteractor.kt")).w("Appflow logEvent is skipped. requestId=%d", j);
            return;
        }
        rqtVar.g(j);
        rqtVar.i("requestId", String.valueOf(j));
        rqsVar.a(ggj.a(i), "katniss_status_code");
        rqtVar.c = yqt.i(duration);
        this.d.a(rqsVar);
    }

    private final void p(rqw rqwVar, long j, int i, Duration duration) {
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEndEventWithCustomStatusCode", 564, "KatnissAppFlowLoggerInteractor.kt")).J("AppFlowEvent: %s, %s, %s, internalRequestId=%s", duration, "EVENT_TYPE_END", rqwVar, Long.valueOf(j));
        if (j <= 0 || rqwVar == null) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/appflow/KatnissAppFlowLoggerInteractor", "logEndEventWithCustomStatusCode", 583, "KatnissAppFlowLoggerInteractor.kt")).R(j, rqwVar != null ? Integer.valueOf(rqwVar.c()) : null);
            return;
        }
        rqt rqtVar = (rqt) rqwVar.a;
        rqtVar.g(j);
        rqtVar.i("requestId", String.valueOf(j));
        rqs rqsVarA = rqwVar.a(ggj.a(i), "katniss_status_code");
        ((rqt) rqsVarA).c = yqt.i(duration);
        i(rqsVarA, null);
        this.d.a(rqsVarA);
    }

    @Override // defpackage.gfr
    public final void a(rqs rqsVar, abqb abqbVar, Duration duration, ahrs ahrsVar) {
        gfs gfsVar;
        rqs rqsVar2;
        abqb abqbVar2;
        ahrs ahrsVar2;
        abqbVar.getClass();
        Duration durationH = h(duration);
        boolean zL = l(rqsVar);
        boolean zK = k(rqsVar);
        if (zL) {
            gfsVar = this;
            rqsVar2 = rqsVar;
            abqbVar2 = abqbVar;
            ahrsVar2 = ahrsVar;
            gfsVar.j(rqsVar2, abqbVar2, durationH, this.g, false, ahrsVar2);
        } else {
            gfsVar = this;
            rqsVar2 = rqsVar;
            abqbVar2 = abqbVar;
            ahrsVar2 = ahrsVar;
        }
        if (zK) {
            gfsVar.j(rqsVar2, abqbVar2, durationH, gfsVar.h, false, ahrsVar2);
        }
        if (zL || zK) {
            return;
        }
        Object orDefault = ConcurrentMap.EL.getOrDefault(gfsVar.f, (rpo) Map.EL.getOrDefault(b, rqsVar2, rpo.FLOW_TYPE_UNKNOWN), -1L);
        orDefault.getClass();
        gfsVar.j(rqsVar2, abqbVar2, durationH, ((Number) orDefault).longValue(), false, ahrsVar2);
    }

    @Override // defpackage.gfr
    public final void b(rqs rqsVar, Duration duration, ahrs ahrsVar) {
        gfs gfsVar;
        rqs rqsVar2;
        ahrs ahrsVar2;
        Duration durationH = h(duration);
        long jD = agwu.b.d();
        if (l(rqsVar)) {
            this.g = jD;
        } else if (k(rqsVar)) {
            this.h = jD;
        } else {
            this.f.put((rpo) Map.EL.getOrDefault(b, rqsVar, rpo.FLOW_TYPE_UNKNOWN), Long.valueOf(jD));
        }
        abqb abqbVar = abqb.OK;
        boolean zL = l(rqsVar);
        boolean zK = k(rqsVar);
        if (zL) {
            gfsVar = this;
            rqsVar2 = rqsVar;
            gfsVar.j(rqsVar2, abqbVar, durationH, this.g, true, null);
        } else {
            gfsVar = this;
            rqsVar2 = rqsVar;
        }
        if (zK) {
            ahrsVar2 = ahrsVar;
            gfsVar.j(rqsVar2, abqbVar, durationH, gfsVar.h, true, ahrsVar2);
        } else {
            ahrsVar2 = ahrsVar;
        }
        if (zL || zK) {
            return;
        }
        Object orDefault = ConcurrentMap.EL.getOrDefault(gfsVar.f, (rpo) Map.EL.getOrDefault(b, rqsVar2, rpo.FLOW_TYPE_UNKNOWN), -1L);
        orDefault.getClass();
        gfsVar.j(rqsVar2, abqbVar, durationH, ((Number) orDefault).longValue(), true, ahrsVar2);
    }

    @Override // defpackage.gfr
    public final void c(rqw rqwVar, abqb abqbVar, Duration duration, ahrs ahrsVar) {
        abqbVar.getClass();
        Duration durationH = h(duration);
        if (rqwVar == null) {
            n(m(), this.g, abqbVar, durationH, ahrsVar);
            return;
        }
        if (agvy.c(rqwVar, rpm.ed())) {
            n(rpm.ed(), this.h, abqbVar, durationH, ahrsVar);
            return;
        }
        rqp rqpVar = ((rqy) rqwVar.b(abqbVar).c()).c.f;
        rqpVar.getClass();
        Object orDefault = ConcurrentMap.EL.getOrDefault(this.f, (rpo) rqpVar, -1L);
        orDefault.getClass();
        n(rqwVar, ((Number) orDefault).longValue(), abqbVar, durationH, ahrsVar);
    }

    @Override // defpackage.gfr
    public final void d(rqs rqsVar, int i) {
        e(rqsVar, i, null);
    }

    @Override // defpackage.gfr
    public final void e(rqs rqsVar, int i, Duration duration) {
        gfs gfsVar;
        rqs rqsVar2;
        int i2;
        Duration durationH = h(duration);
        boolean zL = l(rqsVar);
        boolean zK = k(rqsVar);
        if (zL) {
            gfsVar = this;
            rqsVar2 = rqsVar;
            i2 = i;
            gfsVar.o(rqsVar2, i2, durationH, this.g);
        } else {
            gfsVar = this;
            rqsVar2 = rqsVar;
            i2 = i;
        }
        if (zK) {
            gfsVar.o(rqsVar2, i2, durationH, gfsVar.h);
        }
        if (zL || zK) {
            return;
        }
        Object orDefault = ConcurrentMap.EL.getOrDefault(gfsVar.f, (rpo) Map.EL.getOrDefault(b, rqsVar2, rpo.FLOW_TYPE_UNKNOWN), -1L);
        orDefault.getClass();
        gfsVar.o(rqsVar2, i2, durationH, ((Number) orDefault).longValue());
    }

    @Override // defpackage.gfr
    public final void f(rqw rqwVar, int i) {
        g(rqwVar, i, null);
    }

    @Override // defpackage.gfr
    public final void g(rqw rqwVar, int i, Duration duration) {
        Duration durationH = h(duration);
        if (rqwVar == null) {
            p(m(), this.g, i, durationH);
            return;
        }
        if (agvy.c(rqwVar, rpm.ed())) {
            p(rpm.ed(), this.h, i, durationH);
            return;
        }
        rqp rqpVar = ((rqy) rqwVar.a(ggj.a(i), "katniss_status_code").c()).c.f;
        rqpVar.getClass();
        Object orDefault = ConcurrentMap.EL.getOrDefault(this.f, (rpo) rqpVar, -1L);
        orDefault.getClass();
        p(rqwVar, ((Number) orDefault).longValue(), i, durationH);
    }
}
