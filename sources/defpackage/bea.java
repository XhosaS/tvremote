package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bea implements bdu {
    private final crv a;

    public bea(crv crvVar) {
        this.a = crvVar;
    }

    @Override // defpackage.bdu
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(new bdz(this, Thread.getDefaultUncaughtExceptionHandler(), 0));
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) ((cpj) this.a).a;
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((bdy) it.next()).a());
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                cja[] cjaVarArr = (cja[]) arrayList2.toArray(new cja[0]);
                cir cirVar = new cir(cjaVarArr);
                bzo bzoVarJ = bzs.j(cjaVarArr.length);
                for (int i = 0; i < cjaVarArr.length; i++) {
                    bzoVarJ.g(new ciq(cirVar));
                }
                bzs bzsVarF = bzoVarJ.f();
                for (int i2 = 0; i2 < cjaVarArr.length; i2++) {
                    cjaVarArr[i2].m(new bee(cirVar, bzsVarF, i2, 5), chz.a);
                }
                cbk it2 = bzsVarF.iterator();
                while (it2.hasNext()) {
                    cja cjaVar = (cja) it2.next();
                    try {
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(4000 - (SystemClock.elapsedRealtime() - jElapsedRealtime));
                        long jNanoTime = System.nanoTime() + nanos;
                        z = false;
                        while (true) {
                            try {
                                try {
                                    cjaVar.get(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    z = true;
                                    nanos = jNanoTime - System.nanoTime();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Throwable) it3.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
