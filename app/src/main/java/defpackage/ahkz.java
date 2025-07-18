package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahkz {
    public static final Collection a;

    static {
        CoroutineExceptionHandler.class.getClassLoader();
        a = agxv.b(agxv.a(new agxz(Collections.singletonList(AndroidExceptionPreHandler.class.getDeclaredConstructor(null).newInstance(null)).iterator())));
    }

    public static final void a(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
