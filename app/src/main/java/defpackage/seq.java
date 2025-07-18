package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seq {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordPreferredDevice");
    public final AudioManager b;

    public seq(AudioManager audioManager) {
        this.b = audioManager;
    }

    public final void a(AudioRecord audioRecord, AudioDeviceInfo audioDeviceInfo, rxh rxhVar) throws sln {
        rxhVar.getClass();
        if (audioDeviceInfo == null) {
            return;
        }
        if (audioRecord.setPreferredDevice(audioDeviceInfo)) {
            ((zdv) a.b().o(zfi.a, "ALT.PreferredDevice").q("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordPreferredDevice", "maybeSetDevice", 49, "AudioRecordPreferredDevice.kt")).v("#audio# device type(%d) set as preferred for audio recording", audioDeviceInfo.getType());
        } else {
            audioRecord.release();
            throw new sln("#create failed: preferred device not set.", skj.b(rxhVar));
        }
    }
}
