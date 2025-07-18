package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugs extends AtomicReference implements Executor, Runnable {
    Executor a;
    Runnable b;
    Thread c;
    unx d;

    public ugs(Executor executor, unx unxVar) {
        super(ugr.NOT_RUN);
        this.a = executor;
        this.d = unxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == ugr.CANCELLED) {
            this.a = null;
            this.d = null;
            return;
        }
        this.c = Thread.currentThread();
        try {
            unx unxVar = this.d;
            unxVar.getClass();
            Object obj = unxVar.a;
            if (((xwk) obj).a == this.c) {
                this.d = null;
                a.ab(((xwk) obj).c == null);
                ((xwk) obj).c = runnable;
                Executor executor = this.a;
                executor.getClass();
                ((xwk) obj).b = executor;
                this.a = null;
            } else {
                Executor executor2 = this.a;
                executor2.getClass();
                this.a = null;
                this.b = runnable;
                executor2.execute(this);
            }
        } finally {
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.c) {
            Runnable runnable = this.b;
            runnable.getClass();
            this.b = null;
            runnable.run();
            return;
        }
        xwk xwkVar = new xwk();
        xwkVar.a = threadCurrentThread;
        unx unxVar = this.d;
        unxVar.getClass();
        unxVar.a = xwkVar;
        this.d = null;
        try {
            Runnable runnable2 = this.b;
            runnable2.getClass();
            this.b = null;
            runnable2.run();
            while (true) {
                ?? r0 = xwkVar.c;
                if (r0 == 0 || (r3 = xwkVar.b) == 0) {
                    break;
                }
                xwkVar.c = null;
                xwkVar.b = null;
                r3.execute(r0);
            }
        } finally {
            xwkVar.a = null;
        }
    }
}
