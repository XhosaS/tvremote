package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goe implements god {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl");
    public final gtu b;
    public final goa c;
    public final Supplier d;
    private final Context e;
    private final DisplayManager f;
    private final gol g;
    private final Supplier h;

    public goe(Context context, DisplayManager displayManager, gtu gtuVar, gol golVar, goa goaVar, Supplier supplier, Supplier supplier2) {
        context.getClass();
        displayManager.getClass();
        gtuVar.getClass();
        golVar.getClass();
        this.e = context;
        this.f = displayManager;
        this.b = gtuVar;
        this.g = golVar;
        this.c = goaVar;
        this.h = supplier;
        this.d = supplier2;
    }

    @Override // defpackage.god
    public final boolean a() {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "next", 125, "MediaControlExecutorImpl.kt")).u("Executing next");
        if (this.b.a() != null) {
            ((gob) this.c).b("skipToNext", new Bundle());
            return true;
        }
        MediaController mediaController = (MediaController) this.h.get();
        if (mediaController == null) {
            return false;
        }
        mediaController.getTransportControls().skipToNext();
        return true;
    }

    @Override // defpackage.god
    public final boolean b() {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "prev", 113, "MediaControlExecutorImpl.kt")).u("Executing prev");
        if (this.b.a() != null) {
            ((gob) this.c).b("skipToPrevious", new Bundle());
            return true;
        }
        MediaController mediaController = (MediaController) this.h.get();
        if (mediaController == null) {
            return false;
        }
        mediaController.getTransportControls().skipToPrevious();
        return true;
    }

    @Override // defpackage.god
    public final boolean c(Duration duration, boolean z) {
        Duration durationOfMillis;
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "seek", 137, "MediaControlExecutorImpl.kt")).G("Executing seek(newPosition = %s, relative = %b)", duration, z);
        if (this.b.a() != null) {
            goa goaVar = this.c;
            Bundle bundle = new Bundle();
            bundle.putLong("DURATION", duration.toMillis());
            bundle.putBoolean("IS_RELATIVE", z);
            ((gob) goaVar).b("seekTo", bundle);
            return true;
        }
        MediaController mediaController = (MediaController) this.h.get();
        if (mediaController == null) {
            return false;
        }
        if (z) {
            PlaybackState playbackState = mediaController.getPlaybackState();
            if (playbackState != null) {
                durationOfMillis = Duration.ofMillis(playbackState.getPosition());
                durationOfMillis.getClass();
            } else {
                durationOfMillis = null;
            }
            if (durationOfMillis == null) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "seek", 148, "MediaControlExecutorImpl.kt")).u("Current playbackState position is null. Assuming ZERO.");
                durationOfMillis = Duration.ZERO;
                durationOfMillis.getClass();
            }
            duration = durationOfMillis.plus(duration);
            Duration duration2 = Duration.ZERO;
            duration2.getClass();
            duration.getClass();
            if (duration.compareTo(duration2) < 0) {
                duration = duration2;
            }
        }
        MediaController.TransportControls transportControls = mediaController.getTransportControls();
        transportControls.getClass();
        transportControls.seekTo(duration.toMillis());
        return true;
    }

    @Override // defpackage.god
    public final void d() {
        if (this.b.a() != null) {
            ((gob) this.c).b("pause", new Bundle());
            return;
        }
        MediaController mediaController = (MediaController) this.h.get();
        if (mediaController != null) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "pause", 66, "MediaControlExecutorImpl.kt")).u("Executing pause via MediaSession.");
            mediaController.getTransportControls().pause();
        } else {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "pause", 69, "MediaControlExecutorImpl.kt")).u("Executing pause via keycode injection.");
            this.g.b(127);
        }
    }

    @Override // defpackage.god
    public final void e() {
        if (this.b.a() != null) {
            ((gob) this.c).b("play", new Bundle());
            return;
        }
        MediaController mediaController = (MediaController) this.h.get();
        if (mediaController != null) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "play", 102, "MediaControlExecutorImpl.kt")).u("Executing play via MediaSession");
            mediaController.getTransportControls().play();
        } else {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "play", 105, "MediaControlExecutorImpl.kt")).u("Executing play via keycode injection");
            this.g.b(126);
        }
    }

    @Override // defpackage.god
    public final void f() {
        if (this.b.a() != null) {
            ((gob) this.c).b("stop", new Bundle());
            return;
        }
        if (!ewd.a.a(this.f)) {
            this.g.b(86);
            return;
        }
        MediaController mediaController = (MediaController) this.h.get();
        if (mediaController != null) {
            PlaybackState playbackState = mediaController.getPlaybackState();
            Long lValueOf = playbackState != null ? Long.valueOf(playbackState.getActions()) : null;
            if (lValueOf == null) {
                lValueOf = 0L;
            }
            if ((lValueOf.longValue() & 1) == 1) {
                mediaController.getTransportControls().stop();
            }
        }
        Intent intent = new Intent("com.google.android.apps.castshell.intent.action.GOING_HOME");
        intent.setPackage("com.google.android.apps.mediashell");
        Context context = this.e;
        context.sendBroadcast(intent);
        gbw.a(context);
    }
}
