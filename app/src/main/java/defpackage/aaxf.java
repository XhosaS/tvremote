package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxf extends zgv {
    public static final /* synthetic */ int c = 0;
    private static final long d = TimeUnit.HOURS.toSeconds(1);
    public final Context a;
    public final kak b;
    private final aaxg e;
    private final agow f;
    private final aaxm g;
    private final agow h;

    public aaxf(Context context, aaxg aaxgVar, kak kakVar, agow agowVar, agow agowVar2) {
        super(null);
        this.g = new aaxm(d);
        this.a = context;
        this.e = aaxgVar;
        this.b = kakVar;
        this.h = agowVar;
        this.f = new aaxc(context, agowVar2, agowVar);
    }

    private final void e(aaxz aaxzVar, zyd zydVar) {
        int iA;
        zyd zydVarH;
        wjv wjvVar = (wjv) this.e;
        wju wjuVar = wjvVar.c;
        int i = aaxzVar.memoizedSerializedSize;
        if ((i & Integer.MIN_VALUE) != 0) {
            iA = abza.a.a(aaxzVar.getClass()).a(aaxzVar);
            if (iA < 0) {
                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
            }
        } else {
            iA = i & Integer.MAX_VALUE;
            if (iA == Integer.MAX_VALUE) {
                iA = abza.a.a(aaxzVar.getClass()).a(aaxzVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
                aaxzVar.memoizedSerializedSize = (Integer.MIN_VALUE & aaxzVar.memoizedSerializedSize) | iA;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = (-86400000) + jElapsedRealtime;
        if (j > 0) {
            ConcurrentLinkedQueue concurrentLinkedQueue = wjuVar.a;
            for (wjt wjtVar = (wjt) concurrentLinkedQueue.peek(); wjtVar != null && wjtVar.b() <= j; wjtVar = (wjt) concurrentLinkedQueue.peek()) {
                if (concurrentLinkedQueue.remove(wjtVar)) {
                    wjuVar.b.addAndGet(-wjtVar.a());
                }
            }
        }
        AtomicLong atomicLong = wjuVar.b;
        long j2 = atomicLong.get();
        for (int i2 = 0; i2 < 10; i2++) {
            long j3 = iA;
            if (j2 + j3 >= 1048576) {
                break;
            }
            j2 = atomicLong.get();
            if (atomicLong.compareAndSet(j2, j2 + j3)) {
                wjuVar.a.offer(new wjp(jElapsedRealtime, j3));
                aaxi aaxiVar = wjvVar.a;
                rdr rdrVar = aaxiVar.b;
                if (rdrVar == null) {
                    synchronized (aaxiVar) {
                        rdrVar = aaxiVar.b;
                        if (rdrVar == null) {
                            rdrVar = new rdr();
                            aaxiVar.b = rdrVar;
                        }
                    }
                }
                Context context = aaxiVar.a;
                boolean z = aaxiVar.d;
                zydVarH = rdrVar.a(context, false, true);
                zxn.p(zydVarH, wyo.f(new aaxe(this, zydVar, aaxzVar)), zwk.a);
            }
        }
        Log.w("TikTokClientLogging", "Log rate too high, dropping logs.");
        zydVarH = zxn.h(false);
        zxn.p(zydVarH, wyo.f(new aaxe(this, zydVar, aaxzVar)), zwk.a);
    }

    @Override // defpackage.zgv, defpackage.zft
    public final void a(RuntimeException runtimeException, zfp zfpVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        r10 = r8.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if ((r10.c() - 1) == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        r8 = r8.a();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [aaxm] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [aaxm] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // defpackage.zft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.zfp r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxf.b(zfp):void");
    }

    @Override // defpackage.zft
    public final boolean c(Level level) {
        this.h.a();
        return level.intValue() >= Level.WARNING.intValue();
    }
}
