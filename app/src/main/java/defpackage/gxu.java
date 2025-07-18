package defpackage;

import android.media.AudioManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxu implements gxt {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/platform/audio/VolumeManagerImpl");
    public final AudioManager a;
    private final urm c;
    private final agow d;
    private final urz e;

    public gxu(AudioManager audioManager, urm urmVar, agow agowVar, urz urzVar) {
        agowVar.getClass();
        this.a = audioManager;
        this.c = urmVar;
        this.d = agowVar;
        this.e = urzVar;
    }

    @Override // defpackage.gxt
    public final int a() {
        return this.a.getStreamMaxVolume(3);
    }

    @Override // defpackage.gxt
    public final int b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.a.getStreamMinVolume(3);
        }
        return 0;
    }

    @Override // defpackage.gxt
    public final int c() {
        return (int) (this.a.getStreamMaxVolume(3) * 0.1d);
    }

    @Override // defpackage.gxt
    public final int d() {
        return this.a.getStreamVolume(3);
    }

    @Override // defpackage.gxt
    public final int e() {
        return (int) ((Number) this.d.a()).longValue();
    }

    @Override // defpackage.gxt
    public final fnj f() {
        urz urzVar = this.e;
        if (urzVar == null) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/audio/VolumeManagerImpl", "getVolumeType", 68, "VolumeManagerImpl.kt")).u("Device doesn't have TvSystemAudioManager. Defaulting to SW volume.");
        } else if (urzVar.a(new ury()) == 1) {
            return this.c.a() ? fnj.CEC : fnj.IR;
        }
        return fnj.SOFTWARE;
    }

    @Override // defpackage.gxt
    public final void g(int i) {
        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/audio/VolumeManagerImpl", "adjustVolumeBy", 89, "VolumeManagerImpl.kt")).v("Adjust volume by %d", i);
        int i2 = i < 0 ? -1 : i > 0 ? 1 : 0;
        int iAbs = Math.abs(i);
        for (int i3 = 0; i3 < iAbs; i3++) {
            this.a.adjustStreamVolume(3, i2, 1);
        }
    }

    @Override // defpackage.gxt
    public final void h(boolean z, int i) {
        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/audio/VolumeManagerImpl", "setMute", 84, "VolumeManagerImpl.kt")).x("Set mute state: %b", Boolean.valueOf(z));
        this.a.adjustStreamVolume(3, true != z ? 100 : -100, i);
    }

    @Override // defpackage.gxt
    public final void i(int i, int i2) {
        ((zdv) b.b().q("com/google/android/apps/tvsearch/platform/audio/VolumeManagerImpl", "setVolumeLevel", 78, "VolumeManagerImpl.kt")).z("Set volume level: %d, flag %d", i, i2);
        AudioManager audioManager = this.a;
        agwy agwyVar = new agwy(0, audioManager.getStreamMaxVolume(3));
        if (agwyVar.b()) {
            throw new IllegalArgumentException(a.c(agwyVar, "Cannot coerce value to an empty range: ", "."));
        }
        Integer numValueOf = Integer.valueOf(agwyVar.a);
        if (i < numValueOf.intValue()) {
            i = numValueOf.intValue();
        } else {
            Integer numValueOf2 = Integer.valueOf(agwyVar.b);
            if (i > numValueOf2.intValue()) {
                i = numValueOf2.intValue();
            }
        }
        audioManager.setStreamVolume(3, i, i2);
    }
}
