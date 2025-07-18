package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iek extends Handler {
    private static final ThreadLocal a = new ThreadLocal();
    private final ido b = new ido();

    private iek() {
    }

    static iek a() {
        ThreadLocal threadLocal = a;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        iek iekVar = weakReference != null ? (iek) weakReference.get() : null;
        if (iekVar != null) {
            return iekVar;
        }
        iek iekVar2 = new iek();
        threadLocal.set(new WeakReference(iekVar2));
        return iekVar2;
    }

    final synchronized void b(iej iejVar, Object obj) {
        this.b.a(iejVar, obj);
    }

    final synchronized void c(iej iejVar, Object obj) {
        if (this.b.b(iejVar, obj)) {
            obtainMessage(3, iejVar).sendToTarget();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ((icu) message.obj).ec();
            return;
        }
        if (i == 1) {
            ((icu) message.obj).ed();
            return;
        }
        int i2 = 0;
        boolean z = false;
        if (i != 2) {
            if (i == 3) {
                iej iejVar = (iej) message.obj;
                if (this.b.c(iejVar)) {
                    iejVar.dM();
                    return;
                }
                return;
            }
            if (i == 4) {
                ((ida) message.obj).c();
                return;
            }
            if (i != 5) {
                return;
            }
            ida idaVar = (ida) message.obj;
            synchronized (idaVar) {
                if (idaVar.g == 2) {
                    idaVar.g = 0;
                    Object obj = idaVar.j;
                    Object obj2 = idaVar.i;
                    if (obj != obj2) {
                        idaVar.j = obj2;
                    }
                    z = idaVar.h;
                }
            }
            if (z) {
                idaVar.c();
                return;
            }
            return;
        }
        icu icuVar = (icu) message.obj;
        Object obj3 = icuVar.b;
        synchronized (obj3) {
            if (!icuVar.f) {
                return;
            }
            int i3 = icuVar.c;
            if (i3 > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - icuVar.e;
                long j2 = i3;
                if (j < j2) {
                    iek iekVar = icuVar.a;
                    iekVar.sendMessageDelayed(iekVar.obtainMessage(2, icuVar), j2 - j);
                    return;
                }
                icuVar.e = jElapsedRealtime;
            }
            icuVar.f = false;
            while (true) {
                Object[] objArr = icuVar.d;
                if (i2 >= objArr.length) {
                    return;
                }
                iej iejVar2 = (iej) objArr[i2];
                iek iekVar2 = (iek) objArr[i2 + 1];
                if (iejVar2 != null) {
                    iekVar2.c(iejVar2, obj3);
                }
                i2 += 2;
            }
        }
    }
}
