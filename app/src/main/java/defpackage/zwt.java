package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwt extends AtomicReference implements Executor, Runnable {
    zwv a;
    Executor b;
    Runnable c;
    Thread d;

    public zwt(Executor executor, zwv zwvVar) {
        super(zws.NOT_RUN);
        this.b = executor;
        this.a = zwvVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == zws.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            zwv zwvVar = this.a;
            zwvVar.getClass();
            zwu zwuVar = zwvVar.a;
            if (zwuVar.a == this.d) {
                this.a = null;
                yqw.L(zwuVar.b == null);
                zwuVar.b = runnable;
                Executor executor = this.b;
                executor.getClass();
                zwuVar.c = executor;
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
        zwu zwuVar = new zwu();
        zwuVar.a = threadCurrentThread;
        zwv zwvVar = this.a;
        zwvVar.getClass();
        zwvVar.a = zwuVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = zwuVar.b;
                if (runnable3 == null || (executor = zwuVar.c) == null) {
                    break;
                }
                zwuVar.b = null;
                zwuVar.c = null;
                executor.execute(runnable3);
            }
        } finally {
            zwuVar.a = null;
        }
    }
}
