package defpackage;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class men {
    public static final /* synthetic */ int a = 0;
    private static final zdy b = zdy.h("com/google/android/libraries/concurrent/blockable/BlockableFutures");
    private static final ThreadLocal c = new mem();

    public static void a() {
        if (((Boolean) c.get()).booleanValue()) {
            return;
        }
        if (Binder.getCallingPid() != Process.myPid()) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!threadCurrentThread.getName().startsWith("Binder:")) {
                StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[length];
                    if (Binder.class.getName().equals(stackTraceElement.getClassName()) && "execTransact".equals(stackTraceElement.getMethodName())) {
                        c();
                        return;
                    }
                }
            } else {
                c();
                return;
            }
        }
        final IllegalStateException illegalStateException = new IllegalStateException("Cannot block on non-blocking thread: ".concat(String.valueOf(Thread.currentThread().getName())));
        int iOrdinal = mep.d.ordinal();
        if (iOrdinal == 0) {
            ((zdv) ((zdv) ((zdv) b.c()).p(illegalStateException)).q("com/google/android/libraries/concurrent/blockable/BlockableFutures", "validateThreadIsBlockable", (char) 132, "BlockableFutures.java")).u("Cannot block on non-blocking thread");
            return;
        }
        if (iOrdinal == 1) {
            StrictMode.noteSlowCall(illegalStateException.getMessage());
        } else {
            if (iOrdinal != 2) {
                return;
            }
            uea.a().post(new Runnable() { // from class: mel
                @Override // java.lang.Runnable
                public final void run() {
                    int i = men.a;
                    throw illegalStateException;
                }
            });
            throw illegalStateException;
        }
    }

    public static Object b(Future future, TimeUnit timeUnit) {
        a();
        return future.get(3000L, timeUnit);
    }

    public static void c() {
        c.set(true);
    }
}
