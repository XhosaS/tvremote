package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umy {
    public static final Executor a = new fba(8);

    public static ExecutorService a() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ocy("firebase-iid-executor", 0));
    }
}
