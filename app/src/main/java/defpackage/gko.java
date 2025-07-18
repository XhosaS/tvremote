package defpackage;

import android.media.session.MediaController;
import j$.time.Duration;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gko implements gkm, gnx {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/logging/clientexecution/MediaSessionStateClearcutLoggerImpl");
    private static final Duration c;
    private static final Set d;
    public final gnz a;
    private final ghr e;
    private String f;
    private String g;
    private final yrn h;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(3L);
        durationOfSeconds.getClass();
        c = durationOfSeconds;
        Set setSingleton = Collections.singleton("com.google.android.youtube.tv");
        setSingleton.getClass();
        d = setSingleton;
    }

    public gko(gnz gnzVar, yrx yrxVar, ghr ghrVar) {
        gnzVar.getClass();
        ghrVar.getClass();
        this.a = gnzVar;
        this.e = ghrVar;
        this.f = "";
        this.g = "";
        this.h = new yrn(yrxVar);
    }

    @Override // defpackage.gkm
    public final void a(String str, String str2) {
        str.getClass();
        if (d.contains(str)) {
            this.f = str2;
            this.g = str;
            yrn yrnVar = this.h;
            yrnVar.d();
            yrnVar.e();
        }
    }

    @Override // defpackage.gnx
    public final void d(MediaController mediaController, int i) {
        String packageName = mediaController.getPackageName();
        packageName.getClass();
        zdy zdyVar = b;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/clientexecution/MediaSessionStateClearcutLoggerImpl", "maybeLogTvMediaSessionEvent", 103, "MediaSessionStateClearcutLoggerImpl.kt")).B("#maybeLogTvMediaSessionEvent, %s, %s", i, packageName);
        if (i != 3) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/clientexecution/MediaSessionStateClearcutLoggerImpl", "maybeLogTvMediaSessionEvent", 107, "MediaSessionStateClearcutLoggerImpl.kt")).v("We do not track the playback state: %s", i);
            return;
        }
        if (!agvy.c(packageName, this.g)) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/clientexecution/MediaSessionStateClearcutLoggerImpl", "maybeLogTvMediaSessionEvent", 114, "MediaSessionStateClearcutLoggerImpl.kt")).u("The mediaSession's app package name does not match the cached package name.");
            return;
        }
        yrn yrnVar = this.h;
        if (!yrnVar.a) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/clientexecution/MediaSessionStateClearcutLoggerImpl", "maybeLogTvMediaSessionEvent", 119, "MediaSessionStateClearcutLoggerImpl.kt")).u("Never started tracking TvMediaSessionEvents.");
            return;
        }
        Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
        durationOfNanos.getClass();
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/clientexecution/MediaSessionStateClearcutLoggerImpl", "maybeLogTvMediaSessionEvent", 123, "MediaSessionStateClearcutLoggerImpl.kt")).x("Elapsed time since starting TvMediaSessionEvent tracking: %s", durationOfNanos);
        if (durationOfNanos.compareTo(c) <= 0) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/logging/clientexecution/MediaSessionStateClearcutLoggerImpl", "maybeLogTvMediaSessionEvent", 125, "MediaSessionStateClearcutLoggerImpl.kt")).v("Logging change in PlaybackState to: %s", 3);
            this.e.ag(this.f, packageName);
        }
    }

    @Override // defpackage.gnx
    public final void b(MediaController mediaController) {
    }

    @Override // defpackage.gnx
    public final void c(MediaController mediaController) {
    }
}
