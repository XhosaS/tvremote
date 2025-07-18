package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aqa {
    private static final ThreadLocal i = new ThreadLocal();
    public final wx a = new wx(0);
    final ArrayList b = new ArrayList();
    public final apu c = new apu(this);
    public final Runnable d = new apt(this);
    public boolean e = false;
    public float f = 1.0f;
    public final apz g;
    public apx h;

    public aqa(apz apzVar) {
        this.g = apzVar;
    }

    public static aqa a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new aqa(new apz()));
        }
        return (aqa) threadLocal.get();
    }

    public final boolean b() {
        return Thread.currentThread() == this.g.a.getThread();
    }
}
