package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vi extends vj {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new vh());
    public volatile Handler c;

    @Override // defpackage.vj
    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
