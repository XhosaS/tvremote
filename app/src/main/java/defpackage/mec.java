package defpackage;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mec {
    static /* synthetic */ Thread a(ThreadFactory threadFactory, Runnable runnable) {
        Thread threadNewThread = threadFactory.newThread(runnable);
        if (threadNewThread.getContextClassLoader() == null) {
            threadNewThread.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
        }
        return threadNewThread;
    }
}
