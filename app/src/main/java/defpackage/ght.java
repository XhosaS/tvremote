package defpackage;

import android.view.View;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ght {
    public final int a(View view) {
        pan panVarA = paq.a(view);
        if (panVarA != null) {
            return ((zpk) panVarA.a.b).d;
        }
        return 0;
    }

    public final Duration b(String str, Instant instant, Instant instant2) {
        Duration durationA = fep.a(instant, instant2);
        if (durationA.compareTo(gkh.c) < 0) {
            ((zdv) ((zdv) gkh.b.d()).r(zfc.MEDIUM).q("com/google/android/apps/tvsearch/logging/clearcut/TvLoggerImpl$Companion", "getDurationAndEnsureValid", 1820, "TvLoggerImpl.kt")).I("Large negative duration between %s timestamp and now; start: %s, end: %s", str, instant, instant2);
        }
        Duration duration = Duration.ZERO;
        if (durationA.compareTo(duration) < 0) {
            durationA = duration;
        }
        durationA.getClass();
        return durationA;
    }
}
