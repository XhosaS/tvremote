package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbg extends Thread {
    final /* synthetic */ lbh a;
    private final BlockingQueue c;
    private boolean d = false;
    private final Object b = new Object();

    public lbg(lbh lbhVar, String str, BlockingQueue blockingQueue) {
        this.a = lbhVar;
        this.c = blockingQueue;
        setName(str);
    }

    private final void b() {
        lbh lbhVar = this.a;
        Object obj = lbhVar.d;
        synchronized (obj) {
            if (!this.d) {
                lbhVar.e.release();
                obj.notifyAll();
                if (this == lbhVar.b) {
                    lbhVar.b = null;
                } else if (this != lbhVar.c) {
                    lbk lbkVar = lbhVar.y;
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.c.a("Current scheduler thread is neither worker nor network");
                } else {
                    lbhVar.c = null;
                }
                this.d = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        lbk lbkVar = this.a.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.f.b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.b;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.a.e.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.c;
                lbf lbfVar = (lbf) blockingQueue.poll();
                if (lbfVar != null) {
                    Process.setThreadPriority(true != lbfVar.a ? 10 : threadPriority);
                    lbfVar.run();
                } else {
                    Object obj = this.b;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            boolean z2 = this.a.f;
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    synchronized (this.a.d) {
                        if (this.c.peek() == null) {
                            b();
                            return;
                        }
                    }
                }
            }
        } finally {
            b();
        }
    }
}
