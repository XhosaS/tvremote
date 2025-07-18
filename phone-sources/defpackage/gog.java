package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gog {
    public final Object a;
    public final Object b;
    public Object c;
    private final Object d;

    public gog(Activity activity, Executor executor, cuh cuhVar) {
        this.a = activity;
        this.d = executor;
        this.b = cuhVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a(gns gnsVar) {
        this.c = gnsVar;
        this.d.execute(new foa(this, gnsVar, 16));
    }

    public final void b(gcd gcdVar, yjz yjzVar) {
        Object obj = this.d;
        try {
            ((ReentrantLock) obj).lock();
            if (gcdVar != null) {
                this.c = gcdVar;
            }
            yjzVar.a(this.b, this.a);
        } finally {
            ((ReentrantLock) obj).unlock();
        }
    }

    public gog() {
        this.b = new ghc((char[]) null);
        this.a = new ghc((char[]) null);
        this.d = new ReentrantLock();
    }
}
