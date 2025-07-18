package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cif extends AtomicReference implements Executor, Runnable {
    cih a;
    Executor b;
    Runnable c;
    Thread d;

    public cif(Executor executor, cih cihVar) {
        super(cie.NOT_RUN);
        this.b = executor;
        this.a = cihVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == cie.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            cih cihVar = this.a;
            cihVar.getClass();
            Object obj = cihVar.b;
            if (((cig) obj).a == this.d) {
                this.a = null;
                bdq.j(((cig) obj).b == null);
                ((cig) obj).b = runnable;
                Executor executor = this.b;
                executor.getClass();
                ((cig) obj).c = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        cig cigVar = new cig();
        cigVar.a = threadCurrentThread;
        cih cihVar = this.a;
        cihVar.getClass();
        cihVar.b = cigVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = cigVar.b;
                if (runnable3 == null || (executor = cigVar.c) == null) {
                    break;
                }
                cigVar.b = null;
                cigVar.c = null;
                executor.execute(runnable3);
            }
        } finally {
            cigVar.a = null;
        }
    }
}
