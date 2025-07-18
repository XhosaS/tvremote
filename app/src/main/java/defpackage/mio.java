package defpackage;

import com.google.android.libraries.elements.adl.UpbArena;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mio extends PhantomReference {
    public static final ReferenceQueue a = new ReferenceQueue();
    public static final Object b;
    public static final AtomicReference c;
    public final long d;
    public mio e;
    public mio f;

    static {
        Object obj = new Object();
        b = obj;
        c = new AtomicReference(obj);
    }

    public mio(Object obj, long j, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.d = j;
    }

    public static void a() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        Thread thread = new Thread(threadGroup, new Runnable() { // from class: min
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue = mio.a;
                mio mioVar = new mio(mio.class, 0L, referenceQueue);
                mioVar.f = mioVar;
                mioVar.e = mioVar;
                while (true) {
                    try {
                        try {
                            mio mioVar2 = (mio) referenceQueue.remove();
                            mio mioVar3 = (mio) mio.c.getAndSet(null);
                            if (mioVar3 != null) {
                                mio mioVar4 = mioVar3;
                                while (true) {
                                    mio mioVar5 = mioVar4.f;
                                    if (mioVar5 == null) {
                                        break;
                                    }
                                    mioVar5.e = mioVar4;
                                    mioVar4 = mioVar5;
                                }
                                mioVar3.e = mioVar;
                                mioVar4.f = mioVar.f;
                                mioVar3.e.f = mioVar3;
                                mioVar4.f.e = mioVar4;
                            }
                            mio mioVar6 = mioVar2.e;
                            mioVar6.f = mioVar2.f;
                            mioVar2.f.e = mioVar6;
                            UpbArena.jniDecrementReferenceCount(mioVar2.d);
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th) {
                        Reference.reachabilityFence(mioVar);
                        throw th;
                    }
                }
            }
        }, "UpbCleaner");
        thread.setPriority(5);
        thread.setContextClassLoader(null);
        thread.setDaemon(true);
        thread.start();
    }
}
