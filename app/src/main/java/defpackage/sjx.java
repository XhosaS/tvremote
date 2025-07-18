package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjx {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/core/common/AudioBufferUtils");

    public static int a(ruo ruoVar) {
        int i = 8;
        int i2 = (ruoVar.b & 16) != 0 ? ruoVar.g : 8;
        if (i2 <= 0) {
            ((zdv) ((zdv) a.d().o(zfi.a, "ALT.BufferCalcUtils")).q("com/google/android/libraries/search/audio/core/common/AudioBufferUtils", "getCustomAudioBufferSize", 88, "AudioBufferUtils.java")).u("#audio# The length of buffered audio cannot be 0 or less, using the default.");
        } else {
            i = i2;
        }
        if (i > 20) {
            ((zdv) ((zdv) a.d().o(zfi.a, "ALT.BufferCalcUtils")).q("com/google/android/libraries/search/audio/core/common/AudioBufferUtils", "getCustomAudioBufferSize", 93, "AudioBufferUtils.java")).u("#audio# The length of buffered audio cannot exceed 20 seconds.");
            i = 20;
        }
        return szr.b(ruoVar) * i;
    }

    public static long b(int i, ruo ruoVar) {
        return (i * 1000000000) / szr.b(ruoVar);
    }
}
