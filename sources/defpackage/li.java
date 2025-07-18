package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class li extends mo {
    private static volatile li b;
    public final mo a;
    private final mo c;

    private li() {
        super((char[]) null);
        lk lkVar = new lk();
        this.c = lkVar;
        this.a = lkVar;
    }

    public static li a() {
        if (b == null) {
            synchronized (li.class) {
                if (b == null) {
                    b = new li();
                }
            }
        }
        return b;
    }

    public static final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
