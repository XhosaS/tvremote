package defpackage;

import android.app.ActivityManager;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import android.media.PlayerProxy;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evx implements evt {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl");
    public final DisplayManager b;
    public Boolean c;
    public boolean d;
    public boolean e;
    public final evw f;
    private final ActivityManager g;
    private final AudioManager h;
    private final ahbt i;
    private final boolean j;
    private final agow k;
    private final gtu l;
    private final goa m;
    private final MediaSessionManager n;
    private final gxt o;
    private final AudioManager$AudioPlaybackCallback p;
    private boolean q;
    private boolean r;
    private final ahdl s;

    public evx(ActivityManager activityManager, AudioManager audioManager, ahbt ahbtVar, boolean z, agow agowVar, DisplayManager displayManager, gtu gtuVar, goa goaVar, MediaSessionManager mediaSessionManager, vrm vrmVar, gxt gxtVar) {
        activityManager.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        displayManager.getClass();
        gtuVar.getClass();
        vrmVar.getClass();
        this.g = activityManager;
        this.h = audioManager;
        this.i = ahbtVar;
        this.j = z;
        this.k = agowVar;
        this.b = displayManager;
        this.l = gtuVar;
        this.m = goaVar;
        this.n = mediaSessionManager;
        this.o = gxtVar;
        this.p = new evv(this);
        this.f = new evw(this);
        this.s = ahal.e(ahbtVar, null, 0, new evu(this, vrmVar, null), 3);
    }

    private final void g(boolean z) {
        if (!z && agvy.c(ewj.b(this.g), "com.google.android.apps.mediashell")) {
            f();
        } else {
            this.q = true;
            this.o.h(true, 0);
        }
    }

    private final boolean h() {
        if (((Boolean) this.k.a()).booleanValue()) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "shouldMuteAudioOnScreenChanges", 184, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("Not changing mute status because of Mendel flag");
            return false;
        }
        if (!this.j) {
            return true;
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "shouldMuteAudioOnScreenChanges", 187, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("Not changing mute status because of OEM's flag ");
        return false;
    }

    @Override // defpackage.evt
    public final void a() {
        this.s.s(null);
        this.b.unregisterDisplayListener(this.f);
        this.h.unregisterAudioPlaybackCallback(this.p);
    }

    @Override // defpackage.evt
    public final void b(boolean z) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "setIsAssistantResponding", 133, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).x("setIsAssistantResponding(%b)", Boolean.valueOf(z));
        if (!z) {
            if (this.r && !agvy.c(ewj.b(this.g), "com.google.android.apps.mediashell")) {
                this.o.i(0, 0);
                this.r = false;
            }
            if (agvy.c(this.c, false) && !this.e && h()) {
                g(false);
            }
            this.d = false;
            return;
        }
        this.d = true;
        if (agvy.c(this.c, false) && h()) {
            f();
        }
        gxt gxtVar = this.o;
        boolean z2 = gxtVar.d() == gxtVar.b() && agvy.c(this.c, false);
        this.r = z2;
        if (z2) {
            gxtVar.i(gxtVar.c(), 0);
        }
    }

    @Override // defpackage.evt
    public final void c(boolean z) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "setIsAssistantTriggeredMusicPlaying", 164, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).x("isAssistantTriggeredMusicPlaying(%b)", Boolean.valueOf(z));
        this.e = z;
        if (agvy.c(this.c, false)) {
            if (!z) {
                g(false);
                return;
            }
            f();
            gxt gxtVar = this.o;
            if (gxtVar.d() == gxtVar.b()) {
                gxtVar.i(gxtVar.c(), 0);
            }
        }
    }

    public final void d(DisplayManager displayManager) {
        Display[] displays = displayManager.getDisplays();
        displays.getClass();
        for (Display display : displays) {
            if (display.getState() == 2) {
                if (agvy.c(this.c, true)) {
                    return;
                }
                this.c = true;
                this.h.unregisterAudioPlaybackCallback(this.p);
                if (h()) {
                    ((zdv) a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "handleScreenOn", 220, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("handleScreenOn: unmuting the device");
                    f();
                    return;
                }
                return;
            }
        }
        if (agvy.c(this.c, false)) {
            return;
        }
        this.c = false;
        this.e = false;
        this.d = false;
        if (h()) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "handleScreenOff", 201, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("handleScreenOff: muting the device");
            g(true);
            e();
        }
        this.h.registerAudioPlaybackCallback(this.p, null);
    }

    public final void e() {
        List<MediaController> activeSessions;
        if (agvy.c(ewj.b(this.g), "com.google.android.apps.mediashell")) {
            return;
        }
        if (this.l.a() != null) {
            goa goaVar = this.m;
            Iterator it = goaVar.a().iterator();
            while (it.hasNext()) {
                PlaybackState playbackState = ((goc) it.next()).b;
                if (playbackState.getState() == 3 && (playbackState.getActions() & 2) == 2) {
                    ((gob) goaVar).b("pause", new Bundle());
                }
            }
        } else {
            try {
                activeSessions = this.n.getActiveSessions(null);
                activeSessions.getClass();
            } catch (SecurityException e) {
                ((zdv) ((zdv) a.b()).p(e).q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "pause", 248, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("Failed to get active sessions.");
                activeSessions = agrd.a;
            }
            for (MediaController mediaController : activeSessions) {
                PlaybackState playbackState2 = mediaController.getPlaybackState();
                if (playbackState2 != null && playbackState2.getState() == 3 && (playbackState2.getActions() & 2) == 2) {
                    try {
                        mediaController.getTransportControls().pause();
                    } catch (NullPointerException e2) {
                        ((zdv) ((zdv) a.b()).p(e2).q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "pause", 259, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("Failed to pause.");
                    }
                }
            }
        }
        List activePlaybackConfigurations = this.h.getActivePlaybackConfigurations();
        activePlaybackConfigurations.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : activePlaybackConfigurations) {
            AudioPlaybackConfiguration audioPlaybackConfigurationM = al$$ExternalSyntheticApiModelOutline0.m(obj);
            if (audioPlaybackConfigurationM.getClientUid() != 1000 && audioPlaybackConfigurationM.getPlayerState() == 2) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                PlayerProxy playerProxy = al$$ExternalSyntheticApiModelOutline0.m(it2.next()).getPlayerProxy();
                if (playerProxy != null) {
                    playerProxy.pause();
                }
            } catch (IllegalStateException e3) {
                ((zdv) ((zdv) a.d()).p(e3).q("com/google/android/apps/tvsearch/app/audiopolicy/ScreenOffModeAudioPolicyEnforcerImpl", "pause", 273, "ScreenOffModeAudioPolicyEnforcerImpl.kt")).u("Attempted PlayerProxy.pause()");
            }
        }
    }

    public final void f() {
        if (this.q) {
            this.q = false;
            this.o.h(false, 0);
        }
    }
}
