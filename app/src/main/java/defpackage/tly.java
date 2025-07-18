package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tly implements oin {
    public static final zdy b = zdy.h("com/google/android/libraries/search/rendering/xuikit/runtime/logging/CountingTimeSpanLogger");
    private static final Map c = agrj.d(new agpi(oij.COMPONENT_MATERIALIZATION.w, tlx.a), new agpi(oij.TEMPLATE_FETCHING.w, tlx.b), new agpi(oij.TEMPLATE_RESOLUTION.w, tlx.c), new agpi(oij.PB_TO_FB.w, tlx.d), new agpi(oij.FIRST_ROOT_PREPARATION.w, tlx.e), new agpi(oij.FIRST_ROOT_MATERIALIZATION.w, tlx.f), new agpi(oij.FIRST_ROOT_MEASUREMENT.w, tlx.g), new agpi(oij.ROOT_MOUNTING.w, tlx.h), new agpi(oij.COMMAND_EXECUTION.w, tlx.i), new agpi(oij.ELEMENTS_LIFECYCLE_CREATE_DRAW.w, tlx.n), new agpi(oij.ELEMENTS_LIFECYCLE_SET_DRAW.w, tlx.o));
    private static final Map d = agrj.d(new agpi("yoga", tlx.l), new agpi("elements", tlx.m));
    private static final Map e = agrj.d(new agpi("yoga", tlx.j), new agpi("elements", tlx.k));
    private final tmi f;
    private final oin g;

    public tly(tmi tmiVar, oin oinVar, Context context) {
        tmiVar.getClass();
        context.getClass();
        this.f = tmiVar;
        this.g = oinVar;
    }

    private final void e(oik oikVar) {
        ohm ohmVar = (ohm) oikVar;
        String str = ohmVar.a;
        tlx tlxVar = (tlx) c.get(str);
        if (tlxVar == null) {
            oii oiiVar = ohmVar.f;
            String str2 = oiiVar != null ? ((oho) oiiVar).c : null;
            tlxVar = agvy.c(str, oij.NATIVE_LIBRARY_CHECK.w) ? (tlx) d.get(str2) : agvy.c(str, oij.NATIVE_LIBRARY_LOAD.w) ? (tlx) e.get(str2) : null;
        }
        if (tlxVar == null) {
            ((zdv) ((zdv) b.d()).n(1, TimeUnit.MINUTES).q("com/google/android/libraries/search/rendering/xuikit/runtime/logging/CountingTimeSpanLogger", "count", 69, "CountingTimeSpanLogger.kt")).x("No counter name for %s", oikVar);
            return;
        }
        tmi tmiVar = this.f;
        Long l = ohmVar.b;
        Long l2 = ohmVar.c;
        Long lValueOf = (l == null || l2 == null) ? ohmVar.d : Long.valueOf(l2.longValue() - l.longValue());
        if (lValueOf != null) {
            tmiVar.h(tlxVar.p, lValueOf.longValue());
        } else {
            ((zdv) ((zdv) b.d()).n(1, TimeUnit.MINUTES).q("com/google/android/libraries/search/rendering/xuikit/runtime/logging/CountingTimeSpanLogger$PerfCounter", "increment", 116, "CountingTimeSpanLogger.kt")).x("Null duration for counter %s", tlxVar.p);
        }
    }

    @Override // defpackage.oin
    public final int a() {
        return this.g.a();
    }

    @Override // defpackage.oin
    public final String b() {
        return this.g.b();
    }

    @Override // defpackage.oin
    public final void c(String str, int i, oik oikVar) {
        e(oikVar);
        this.g.c(str, i, oikVar);
    }

    @Override // defpackage.oin
    public final int d(String str, oik oikVar) {
        e(oikVar);
        return this.g.d(str, oikVar);
    }
}
