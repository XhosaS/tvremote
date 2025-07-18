package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class oie {
    public static /* synthetic */ oif a() {
        Thread thread = Looper.getMainLooper().getThread();
        Thread threadCurrentThread = Thread.currentThread();
        return new oif(thread == threadCurrentThread, Thread.currentThread().getId());
    }
}
