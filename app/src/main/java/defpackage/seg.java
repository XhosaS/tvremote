package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.AudioEffect;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seg {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils");

    public static yqt a(AudioRecord audioRecord, Function function) {
        try {
            AudioEffect audioEffect = (AudioEffect) function.apply(Integer.valueOf(audioRecord.getAudioSessionId()));
            if (audioEffect.setEnabled(true) != 0) {
                ypv ypvVar = ypv.a;
                ((zdv) ((zdv) a.b()).q("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils", "createAudioEffect", 42, "AudioEffectUtils.java")).x("#audio# Failed to enable audio effect: %s", audioEffect.getDescriptor().uuid);
                return ypvVar;
            }
            yqt yqtVarI = yqt.i(audioEffect);
            if (audioEffect.getDescriptor() != null) {
                ((zdv) ((zdv) a.b()).q("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils", "createAudioEffect", 47, "AudioEffectUtils.java")).x("#audio# Using audio effect: %s", audioEffect.getDescriptor().uuid);
            }
            return yqtVarI;
        } catch (RuntimeException unused) {
            ypv ypvVar2 = ypv.a;
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/search/audio/audiosource/impl/AudioEffectUtils", "createAudioEffect", 52, "AudioEffectUtils.java")).u("#audio# Error in initializing the audio effect.");
            return ypvVar2;
        }
    }
}
