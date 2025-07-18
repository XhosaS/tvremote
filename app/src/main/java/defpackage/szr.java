package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szr {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/utils/AudioParamsOptimizationUtils");

    public static int a(int i) {
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4 || i == 22) {
            return 4;
        }
        try {
            throw new IllegalArgumentException();
        } catch (RuntimeException unused) {
            ((zdv) ((zdv) a.d().o(zfi.a, "ALT.OptimizationUtils")).q("com/google/android/libraries/search/audio/utils/AudioParamsOptimizationUtils", "getBytesPerSample", 118, "AudioParamsOptimizationUtils.java")).v("#audio# invalid encoding(%d), fallback to PCM_16BIT", i);
            return 2;
        }
    }

    public static int b(ruo ruoVar) {
        return a(ruoVar.f) * Integer.bitCount(ruoVar.e) * ruoVar.d;
    }

    public static int c(ruo ruoVar) {
        return d(20000000L, ruoVar).intValue();
    }

    public static Long d(long j, ruo ruoVar) {
        int iA = a(ruoVar.f);
        return Long.valueOf(((long) Math.floor(((b(ruoVar) * j) / 1.0E9d) / iA)) * iA);
    }
}
