package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgd {
    public static final mgb a = new mgb();
    public static final Thread b;
    public static mfz c;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        thread.getClass();
        b = thread;
    }
}
