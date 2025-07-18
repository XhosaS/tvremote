package defpackage;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slg {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/core/timestamp/AudioTimestampAdjuster");
    private final ruo b;
    private final int c;
    private final long d;
    private long e;
    private long f;
    private long g;
    private final mcw h;
    private final slf i;

    public slg(mcw mcwVar, AudioRecord audioRecord, ruo ruoVar) {
        audioRecord.getClass();
        ruoVar.getClass();
        slf slfVar = new slf(audioRecord);
        this.h = mcwVar;
        this.i = slfVar;
        this.b = ruoVar;
        this.c = 1000000000 / ruoVar.d;
        run runVar = ruoVar.j;
        long j = (runVar == null ? run.a : runVar).c;
        if (j < 50) {
            ((zdv) ((zdv) szr.a.d().o(zfi.a, "ALT.OptimizationUtils")).q("com/google/android/libraries/search/audio/utils/AudioParamsOptimizationUtils", "getTimestampPollingIntervalMillis", 105, "AudioParamsOptimizationUtils.java")).w("#audio# timestamp polling interval is smaller than min value(%s), using min value", 50L);
            j = 50;
        }
        this.d = j;
        this.e = -j;
        this.f = mcwVar.a();
    }

    public final synchronized sle a(int i) {
        long j;
        int i2;
        AudioTimestamp audioTimestamp = null;
        if (i <= 0) {
            return new sle(this.f, null);
        }
        ruo ruoVar = this.b;
        long jA = i / (szr.a(ruoVar.f) * Integer.bitCount(ruoVar.e));
        long j2 = this.g + jA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.e >= this.d) {
            this.e = jElapsedRealtime;
            slf slfVar = this.i;
            AudioTimestamp audioTimestamp2 = new AudioTimestamp();
            if (slfVar.a.getTimestamp(audioTimestamp2, 1) != 0) {
                audioTimestamp2 = null;
            }
            if (audioTimestamp2 == null) {
                ((zdv) ((zdv) a.d().o(zfi.a, "ALT.TimestampAdjuster")).n(1, TimeUnit.SECONDS).q("com/google/android/libraries/search/audio/core/timestamp/AudioTimestampAdjuster", "getAndroidTimestampOrNull", 103, "AudioTimestampAdjuster.kt")).u("#audio# unable to retrieve audio timestamp");
            } else {
                audioTimestamp = audioTimestamp2;
            }
        }
        if (audioTimestamp != null) {
            if (audioTimestamp.framePosition != j2) {
                zer zerVar = zfi.a;
                TimeUnit.SECONDS.getClass();
                long j3 = audioTimestamp.framePosition;
            }
            long j4 = audioTimestamp.framePosition;
            j = audioTimestamp.nanoTime;
            jA = j2 - j4;
            i2 = this.c;
        } else {
            j = this.f;
            i2 = this.c;
        }
        long j5 = j + (jA * i2);
        this.f = j5;
        this.g = j2;
        return new sle(j5, audioTimestamp);
    }
}
