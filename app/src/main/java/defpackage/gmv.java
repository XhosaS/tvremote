package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmv implements gmu {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl");
    private final agow e;
    private final agow f;
    private final ztw g;
    private final yrn h;
    boolean a = true;
    private Instant i = Instant.EPOCH;
    private Instant j = Instant.EPOCH;
    private Instant k = Instant.EPOCH;
    public Instant b = Instant.EPOCH;
    private gmc l = null;
    public Instant c = Instant.EPOCH;
    private Duration m = Duration.ZERO;
    private Duration n = Duration.ZERO;
    private Duration o = Duration.ZERO;

    public gmv(agow agowVar, agow agowVar2, yrx yrxVar, ztw ztwVar) {
        this.e = agowVar;
        this.f = agowVar2;
        this.g = ztwVar;
        this.h = yrn.c(yrxVar);
    }

    private final void a(gmt gmtVar) {
        gmtVar.getClass();
        ((qpk) this.f.a()).e(gmtVar.E, this.b.toEpochMilli(), this.c.toEpochMilli());
    }

    @Override // defpackage.gmu
    public final void A() {
        this.a = false;
    }

    @Override // defpackage.gmu
    public final void B() {
        this.a = true;
        this.i = this.g.a();
        this.j = Instant.EPOCH;
        this.k = Instant.EPOCH;
        this.b = Instant.EPOCH;
        this.l = null;
        this.c = Instant.EPOCH;
        this.m = Duration.ofNanos(this.h.b());
        this.n = Duration.ZERO;
        this.o = Duration.ZERO;
    }

    @Override // defpackage.gmu
    public final void C(gmc gmcVar, Instant instant) {
        gmc gmcVar2 = this.l;
        if (gmcVar2 == null || !gmcVar2.equals(gmcVar)) {
            this.l = gmcVar;
            if (instant == null || instant.equals(Instant.EPOCH)) {
                instant = this.g.a();
            }
            this.c = instant;
            if (!this.a) {
                ((zdv) ((zdv) d.b()).q("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl", "recordSearchResultMeasure", 142, "SearchResultLoggerImpl.java")).u("Search result Logger disabled. Not recording.");
                return;
            }
            if (gmcVar == null) {
                ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl", "recordSearchResultMeasure", 146, "SearchResultLoggerImpl.java")).u("No search result displayed event!");
                return;
            }
            if (!gms.b(this.b, instant)) {
                ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl", "recordSearchResultMeasure", 150, "SearchResultLoggerImpl.java")).u("Not a valid search result displayed event! Result display start time is wrong.");
                return;
            }
            if (gms.b(this.i, this.j, this.k, this.c)) {
                switch (gmcVar.ordinal()) {
                    case 30:
                        a(gmt.RESULT_DISPLAYED_CARD_COLD);
                        break;
                    case 31:
                        a(gmt.RESULT_DISPLAYED_CARD_XUIKIT_COLD);
                        break;
                    case 32:
                    default:
                        ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl", "recordColdStartupDurations", 190, "SearchResultLoggerImpl.java")).x("Not a valid search result displayed event! Recorded event is %s", gmcVar);
                        break;
                    case 33:
                        a(gmt.RESULT_DISPLAYED_SPOCK_COLD);
                        a(gmt.RESULT_DISPLAYED_SPOCK_CAROUSEL_COLD);
                        break;
                    case 34:
                        a(gmt.RESULT_DISPLAYED_SPOCK_COLD);
                        a(gmt.RESULT_DISPLAYED_SPOCK_ENTITY_COLD);
                        break;
                    case 35:
                        a(gmt.RESULT_DISPLAYED_TEXT_COLD);
                        break;
                }
                agow agowVar = this.e;
                ((gfr) agowVar.a()).b(rpm.c(), this.m, null);
                gfr gfrVar = (gfr) agowVar.a();
                rqs rqsVarB = rpm.b();
                abqb abqbVar = abqb.OK;
                gfrVar.a(rqsVarB, abqbVar, this.n, null);
                ((gfr) agowVar.a()).a(rpm.d(), abqbVar, this.o, null);
                return;
            }
            if (gms.b(this.i, this.k, this.c)) {
                switch (gmcVar.ordinal()) {
                    case 30:
                        a(gmt.RESULT_DISPLAYED_CARD_WARM);
                        break;
                    case 31:
                        a(gmt.RESULT_DISPLAYED_CARD_XUIKIT_WARM);
                        break;
                    case 32:
                    default:
                        ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl", "recordWarmStartupDurations", 236, "SearchResultLoggerImpl.java")).x("Not a valid search result displayed event! Recorded event is %s", gmcVar);
                        break;
                    case 33:
                        a(gmt.RESULT_DISPLAYED_SPOCK_WARM);
                        a(gmt.RESULT_DISPLAYED_SPOCK_CAROUSEL_WARM);
                        break;
                    case 34:
                        a(gmt.RESULT_DISPLAYED_SPOCK_WARM);
                        a(gmt.RESULT_DISPLAYED_SPOCK_ENTITY_WARM);
                        break;
                    case 35:
                        a(gmt.RESULT_DISPLAYED_TEXT_WARM);
                        break;
                }
                agow agowVar2 = this.e;
                ((gfr) agowVar2.a()).b(rpm.h(), this.m, null);
                ((gfr) agowVar2.a()).a(rpm.i(), abqb.OK, this.o, null);
                return;
            }
            if (!gms.b(this.i, this.c)) {
                ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl", "recordSearchResultMeasure", 164, "SearchResultLoggerImpl.java")).u("Not a valid search result displayed event! Result displayed time is not after start request time.");
                return;
            }
            switch (gmcVar.ordinal()) {
                case 30:
                    a(gmt.RESULT_DISPLAYED_CARD_HOT);
                    break;
                case 31:
                    a(gmt.RESULT_DISPLAYED_CARD_XUIKIT_HOT);
                    break;
                case 32:
                default:
                    ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/logging/searchresult/SearchResultLoggerImpl", "recordHotStartupDurations", 275, "SearchResultLoggerImpl.java")).x("Not a valid search result displayed event! Recorded event is %s", gmcVar);
                    break;
                case 33:
                    a(gmt.RESULT_DISPLAYED_SPOCK_HOT);
                    a(gmt.RESULT_DISPLAYED_SPOCK_CAROUSEL_HOT);
                    break;
                case 34:
                    a(gmt.RESULT_DISPLAYED_SPOCK_HOT);
                    a(gmt.RESULT_DISPLAYED_SPOCK_ENTITY_HOT);
                    break;
                case 35:
                    a(gmt.RESULT_DISPLAYED_TEXT_HOT);
                    break;
            }
        }
    }

    @Override // defpackage.gmu
    public final void D() {
        this.b = this.g.a();
    }

    @Override // defpackage.gmu
    public final void E(Instant instant, Duration duration) {
        this.j = instant;
        this.n = duration;
    }

    @Override // defpackage.gmu
    public final void F(Instant instant, Duration duration) {
        this.k = instant;
        this.o = duration;
    }
}
