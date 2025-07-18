package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfg extends Thread {
    public Runnable a;
    public Runnable b;
    public final mfz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfg(int i, Runnable runnable) throws SecurityException, IllegalArgumentException {
        super(runnable);
        runnable.getClass();
        mfz mfzVar = new mfz(this, 0, false, 0, true, 26);
        this.c = mfzVar;
        if (!mfzVar.c) {
            throw new IllegalStateException("Cannot override priority of non-boostable thread");
        }
        while (true) {
            long j = mfzVar.f.get();
            long jF = mfy.f(j, false, false, false, i, 0, 0L, 119);
            if (mfy.d(j)) {
                if (mfzVar.f.compareAndSet(j, jF)) {
                    return;
                }
            } else if (mfy.a(j) == mfy.a(jF)) {
                if (mfzVar.f.compareAndSet(j, jF)) {
                    return;
                }
            } else if (mfzVar.f.compareAndSet(j, mfy.f(jF, false, true, false, 0, 0, 0L, 125))) {
                mfzVar.a(mfy.a(j));
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        AtomicLong atomicLong;
        long j;
        mfz mfzVar = this.c;
        mfzVar.b = Process.myTid();
        do {
            atomicLong = mfzVar.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, mfy.f(j, true, true, false, 0, 0, 0L, 124)));
        if (!mfy.d(j)) {
            mfzVar.a(-21);
        }
        Runnable runnable = null;
        try {
            try {
                Runnable runnable2 = this.a;
                if (runnable2 == null) {
                    agvy.b("startedCallback");
                    runnable2 = null;
                }
                runnable2.run();
                super.run();
                Runnable runnable3 = this.b;
                if (runnable3 == null) {
                    agvy.b("finishedCallback");
                } else {
                    runnable = runnable3;
                }
                runnable.run();
                this.c.c();
            } catch (Throwable th) {
                th = th;
                Runnable runnable4 = this.b;
                if (runnable4 == null) {
                    agvy.b("finishedCallback");
                } else {
                    runnable = runnable4;
                }
                runnable.run();
                this.c.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.c.c();
            throw th;
        }
    }
}
