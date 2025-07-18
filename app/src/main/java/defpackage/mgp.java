package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgp implements ThreadFactory {
    private final ThreadFactory a;

    public mgp(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return this.a.newThread(new Runnable() { // from class: mgo
            @Override // java.lang.Runnable
            public final void run() {
                Process.myTid();
                runnable.run();
            }
        });
    }
}
