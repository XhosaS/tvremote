package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sum {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/playback/impl/session/impl/PlaybackAudioUpdater");
    public static final long b;
    public final sgo c;
    public final ruo d;
    public final tae e;
    public final ahbt f;
    public final zyd g;
    public long h;
    public final mcw i;
    public int j;
    private final zyh k;
    private final Executor l;
    private final abwf m;
    private final wzw n;

    static {
        Duration durationOfMillis = Duration.ofMillis(100L);
        durationOfMillis.getClass();
        b = durationOfMillis.toNanos();
    }

    public sum(sgo sgoVar, ruo ruoVar, tae taeVar, long j, mcw mcwVar, zyh zyhVar, ahbt ahbtVar, Executor executor, abwf abwfVar) {
        mcwVar.getClass();
        zyhVar.getClass();
        ahbtVar.getClass();
        executor.getClass();
        this.c = sgoVar;
        this.d = ruoVar;
        this.e = taeVar;
        this.i = mcwVar;
        this.k = zyhVar;
        this.f = ahbtVar;
        this.l = executor;
        this.m = abwfVar;
        this.n = new wzw();
        this.h = j;
        ((zdv) a.b().q("com/google/android/libraries/search/audio/playback/impl/session/impl/PlaybackAudioUpdater", "<init>", 78, "PlaybackAudioUpdater.kt")).x("#audio# Starting playback audio updater job with params %s.", ruoVar);
        Runnable runnableH = wyo.h(new Runnable() { // from class: suj
            @Override // java.lang.Runnable
            public final void run() {
                sum sumVar = this.a;
                sumVar.a(new sul(sumVar, null));
            }
        });
        Duration durationB = acbh.b(abwfVar);
        durationB.getClass();
        long millis = durationB.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jElapsedRealtime = SystemClock.elapsedRealtime() + TimeUnit.MILLISECONDS.convert(0L, timeUnit);
        long jConvert = TimeUnit.MILLISECONDS.convert(millis, timeUnit);
        zyu zyuVar = new zyu();
        final AtomicReference atomicReference = new AtomicReference(null);
        zyf zyfVarSchedule = zyhVar.schedule(new ypu(zyuVar, runnableH, atomicReference, zyhVar, jElapsedRealtime, jConvert), 0L, timeUnit);
        while (!atomicReference.compareAndSet(null, zyfVarSchedule) && atomicReference.get() == null) {
        }
        zyuVar.d(new Runnable() { // from class: ypt
            @Override // java.lang.Runnable
            public final void run() {
                ((Future) atomicReference.get()).cancel(false);
            }
        }, zwk.a);
        this.g = zyuVar;
    }

    public final void a(final agvb agvbVar) {
        this.n.b(new zvh() { // from class: sui
            @Override // defpackage.zvh
            public final zyd a() {
                return ahkr.c(this.a.f, 0, agvbVar, 3);
            }
        }, this.l).getClass();
    }
}
