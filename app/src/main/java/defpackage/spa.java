package defpackage;

import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.Parcel;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spa {
    private static final zdy d = zdy.h("com/google/android/libraries/search/audio/micmuter/MicMuter");
    public final agzv a;
    public final agzv b;
    public final boolean c;
    private final boolean e;
    private final boolean f;
    private final AudioManager g;
    private final acfo h;
    private AudioManager$AudioPlaybackCallback i;

    public spa(boolean z, boolean z2, AudioManager audioManager, acfo acfoVar) {
        this.e = z;
        this.f = z2;
        this.g = audioManager;
        this.h = acfoVar;
        agzz agzzVar = agzz.a;
        this.a = new agzv(false, agzzVar);
        this.b = new agzv(false, agzzVar);
        this.c = z || z2;
    }

    private final synchronized void e() {
        if (this.i != null) {
            return;
        }
        soz sozVar = new soz(this);
        this.i = sozVar;
        ((zdv) d.b().o(zfi.a, "ALT.MicMuter").q("com/google/android/libraries/search/audio/micmuter/MicMuter", "registerAudioPlaybackCallbackListener", 80, "MicMuter.kt")).H("#audio# starting listening for configurations updates(a11=%b, nav=%b)", this.e, this.f);
        this.g.registerAudioPlaybackCallback(sozVar, null);
        List activePlaybackConfigurations = this.g.getActivePlaybackConfigurations();
        activePlaybackConfigurations.getClass();
        b(activePlaybackConfigurations);
        a(activePlaybackConfigurations);
    }

    private final synchronized void f() {
        this.a.a = 0;
        this.b.a = 0;
        AudioManager$AudioPlaybackCallback audioManager$AudioPlaybackCallback = this.i;
        if (audioManager$AudioPlaybackCallback != null) {
            this.g.unregisterAudioPlaybackCallback(audioManager$AudioPlaybackCallback);
            ((zdv) d.b().o(zfi.a, "ALT.MicMuter").q("com/google/android/libraries/search/audio/micmuter/MicMuter", "unregisterAudioPlaybackCallbackListener", 96, "MicMuter.kt")).u("#audio# stopping listening for configurations updates");
        }
        this.i = null;
    }

    private final boolean g(AudioPlaybackConfiguration audioPlaybackConfiguration, int i) {
        return audioPlaybackConfiguration.getAudioAttributes().getUsage() == i;
    }

    public final void a(List list) {
        if (this.f) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (g(al$$ExternalSyntheticApiModelOutline0.m(it.next()), 12)) {
                        this.h.b.getClass();
                    }
                }
            }
            if (this.b.a(false)) {
                ((zdv) d.b().o(zfi.a, "ALT.MicMuter").q("com/google/android/libraries/search/audio/micmuter/MicMuter", "setIsNavigationCuesAudioActive", 128, "MicMuter.kt")).x("#audio# Navigation cues audio %s", "stopped");
            }
        }
    }

    public final void b(List list) {
        if (this.e) {
            boolean z = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AudioPlaybackConfiguration audioPlaybackConfigurationM = al$$ExternalSyntheticApiModelOutline0.m(it.next());
                    if (g(audioPlaybackConfigurationM, 11)) {
                        int i = 4;
                        if (audioPlaybackConfigurationM.getAudioAttributes().getContentType() != 4) {
                            if (Build.VERSION.SDK_INT >= 30) {
                                Parcel parcelObtain = Parcel.obtain();
                                audioPlaybackConfigurationM.writeToParcel(parcelObtain, 0);
                                parcelObtain.setDataPosition(0);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    i = 6;
                                } else if (Build.VERSION.SDK_INT >= 31) {
                                    i = 5;
                                }
                                for (int i2 = 0; i2 < i; i2++) {
                                    parcelObtain.readInt();
                                }
                                if (parcelObtain.readInt() == 2) {
                                }
                            }
                            z = true;
                            break;
                        }
                        continue;
                    }
                }
            }
            if (this.a.a(z) != z) {
                ((zdv) d.b().o(zfi.a, "ALT.MicMuter").q("com/google/android/libraries/search/audio/micmuter/MicMuter", "setIsTalkbackAudioActive", 119, "MicMuter.kt")).x("#audio# Talkback audio %s", true != z ? "stopped" : "started");
            }
        }
    }

    public final synchronized void c() {
        if (this.c) {
            e();
        }
    }

    public final synchronized void d() {
        f();
    }
}
