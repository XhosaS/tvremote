package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezs extends Handler implements Runnable {
    public final int a;
    public IOException b;
    public int c;
    final /* synthetic */ ezw d;
    private final ezt e;
    private final long f;
    private ezr g;
    private Thread h;
    private boolean i;
    private volatile boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezs(ezw ezwVar, Looper looper, ezt eztVar, ezr ezrVar, int i, long j) {
        super(looper);
        this.d = ezwVar;
        this.e = eztVar;
        this.g = ezrVar;
        this.a = i;
        this.f = j;
    }

    private final void c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f;
        ezr ezrVar = this.g;
        ezrVar.getClass();
        ezrVar.dn(this.e, jElapsedRealtime, j, this.c);
        this.b = null;
        ezw ezwVar = this.d;
        ezs ezsVar = ezwVar.a;
        ezsVar.getClass();
        ezwVar.c.execute(ezsVar);
    }

    private final void d() {
        this.d.a = null;
    }

    public final void a(boolean z) {
        this.j = z;
        this.b = null;
        if (hasMessages(1)) {
            this.i = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.i = true;
                this.e.c();
                Thread thread = this.h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ezr ezrVar = this.g;
            ezrVar.getClass();
            ezrVar.ds(this.e, jElapsedRealtime, jElapsedRealtime - this.f, true);
            this.g = null;
        }
    }

    public final void b(long j) {
        ezw ezwVar = this.d;
        a.ab(ezwVar.a == null);
        ezwVar.a = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            c();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.j) {
            return;
        }
        if (message.what == 1) {
            c();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        d();
        long j = this.f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        ezr ezrVar = this.g;
        ezrVar.getClass();
        if (this.i) {
            ezrVar.ds(this.e, jElapsedRealtime, j2, false);
            return;
        }
        int i = message.what;
        if (i == 2) {
            try {
                ezrVar.du(this.e, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                edb.d("LoadTask", "Unexpected exception handling load completed", e);
                this.d.b = new ezv(e);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.b = iOException;
        int i2 = this.c + 1;
        this.c = i2;
        aacv aacvVarMo349do = ezrVar.mo349do(this.e, jElapsedRealtime, j2, iOException, i2);
        int i3 = aacvVarMo349do.a;
        if (i3 == 3) {
            this.d.b = this.b;
        } else if (i3 != 2) {
            if (i3 == 1) {
                this.c = 1;
            }
            long jMin = aacvVarMo349do.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.c - 1) * 1000, 5000);
            }
            b(jMin);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.i;
                this.h = Thread.currentThread();
            }
            if (!z) {
                ezt eztVar = this.e;
                Trace.beginSection("load:" + eztVar.getClass().getSimpleName());
                try {
                    eztVar.e();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.j) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.j) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            if (!this.j) {
                edb.d("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.j) {
                return;
            }
            edb.d("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(3, new ezv(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.j) {
                return;
            }
            edb.d("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(3, new ezv(e4)).sendToTarget();
        }
    }
}
