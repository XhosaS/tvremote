package defpackage;

import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goh implements gof {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl");
    public boolean a;
    private final AudioManager c;
    private final MediaSessionManager d;
    private final PackageManager e;
    private List f = agrd.a;
    private boolean g;
    private boolean h;

    public goh(AudioManager audioManager, MediaSessionManager mediaSessionManager, PackageManager packageManager) {
        this.c = audioManager;
        this.d = mediaSessionManager;
        this.e = packageManager;
    }

    @Override // defpackage.gof
    public final void a(String str) {
        this.g = false;
        if (str == null || agyv.n(str)) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "maybeResumeForegroundMedia", 87, "OnAssistantPresentMediaControllerImpl.kt")).u("foreground app is null");
            return;
        }
        if (this.h) {
            for (MediaController mediaController : this.f) {
                PlaybackState playbackState = mediaController.getPlaybackState();
                if (agvy.c(mediaController.getPackageName(), str)) {
                    if (playbackState == null || playbackState.getState() != 2) {
                        return;
                    }
                    if ((playbackState.getActions() & 4) == 4) {
                        ((zdv) b.b().q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "maybeResumeForegroundMedia", 101, "OnAssistantPresentMediaControllerImpl.kt")).u("Katniss auto-resuming foreground app.");
                        mediaController.getTransportControls().play();
                    } else {
                        ((zdv) b.d().q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "maybeResumeForegroundMedia", 104, "OnAssistantPresentMediaControllerImpl.kt")).u("Media app doesn't support resume function.");
                    }
                    this.a = true;
                    mediaController.registerCallback(new gog(this, mediaController));
                    return;
                }
            }
        }
    }

    @Override // defpackage.gof
    public final void b() {
        this.a = false;
        this.h = false;
        this.g = false;
    }

    @Override // defpackage.gof
    public final boolean c(String str) {
        int packageUid;
        if (str == null || agyv.n(str)) {
            return false;
        }
        List<MediaController> activeSessions = this.d.getActiveSessions(null);
        activeSessions.getClass();
        this.f = activeSessions;
        if (!(activeSessions instanceof Collection) || !activeSessions.isEmpty()) {
            Iterator<T> it = activeSessions.iterator();
            while (it.hasNext()) {
                if (agvy.c(((MediaController) it.next()).getPackageName(), str)) {
                    return true;
                }
            }
        }
        try {
            packageUid = Build.VERSION.SDK_INT >= 33 ? this.e.getPackageUid(str, PackageManager.PackageInfoFlags.of(0L)) : this.e.getPackageUid(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((zdv) ((zdv) b.d()).p(e).q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "getPackageUid", 191, "OnAssistantPresentMediaControllerImpl.kt")).u("Failed to find package with the given name in the system.");
            packageUid = -1;
        }
        List activePlaybackConfigurations = this.c.getActivePlaybackConfigurations();
        activePlaybackConfigurations.getClass();
        if (activePlaybackConfigurations.isEmpty()) {
            return false;
        }
        Iterator it2 = activePlaybackConfigurations.iterator();
        while (it2.hasNext()) {
            if (al$$ExternalSyntheticApiModelOutline0.m(it2.next()).getClientUid() == packageUid) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gof
    public final boolean d(String str) {
        if (this.g) {
            return true;
        }
        this.g = true;
        this.h = false;
        if (str == null || agyv.n(str)) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "maybePauseForegroundMedia", 76, "OnAssistantPresentMediaControllerImpl.kt")).u("foreground app is null");
            return false;
        }
        Object obj = null;
        List<MediaController> activeSessions = this.d.getActiveSessions(null);
        activeSessions.getClass();
        this.f = activeSessions;
        Iterator<T> it = activeSessions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (agvy.c(((MediaController) next).getPackageName(), str)) {
                obj = next;
                break;
            }
        }
        MediaController mediaController = (MediaController) obj;
        if (mediaController != null) {
            PlaybackState playbackState = mediaController.getPlaybackState();
            if (playbackState == null || (playbackState.getActions() & 2) != 2) {
                ((zdv) b.b().q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "pauseForegroundMediaViaMediaSession", 140, "OnAssistantPresentMediaControllerImpl.kt")).x("Pause is not supported by app: %s.", str);
                return false;
            }
            if (playbackState.getState() == 2 && !this.a) {
                return true;
            }
            if (playbackState.getState() == 3 || playbackState.getState() == 4 || this.a) {
                ((zdv) b.b().q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "pauseForegroundMediaViaMediaSession", 148, "OnAssistantPresentMediaControllerImpl.kt")).u("Katniss auto-pausing foreground app.");
                mediaController.getTransportControls().pause();
                this.h = true;
                return true;
            }
        }
        ((zdv) b.b().q("com/google/android/apps/tvsearch/media/control/OnAssistantPresentMediaControllerImpl", "pauseForegroundMediaViaMediaSession", 157, "OnAssistantPresentMediaControllerImpl.kt")).x("Did not find corresponding MediaSession for app: %s.", str);
        return false;
    }

    @Override // defpackage.gof
    public final void e() {
        this.h = false;
    }
}
