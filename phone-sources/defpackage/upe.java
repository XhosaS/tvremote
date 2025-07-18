package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upe {
    public static final /* synthetic */ int e = 0;
    private static final long f = TimeUnit.HOURS.toSeconds(8);
    public final uoq a;
    public final FirebaseMessaging b;
    public final upc d;
    private final Context g;
    private final uos h;
    private final ScheduledExecutorService i;
    public final Map c = new ir();
    private boolean j = false;

    public upe(FirebaseMessaging firebaseMessaging, uos uosVar, upc upcVar, uoq uoqVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = firebaseMessaging;
        this.h = uosVar;
        this.d = upcVar;
        this.a = uoqVar;
        this.g = context;
        this.i = scheduledExecutorService;
    }

    public static void a(onz onzVar) throws IOException {
        try {
            osk.t(onzVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e3);
            }
            throw ((RuntimeException) cause);
        }
    }

    final void b(Runnable runnable, long j) {
        this.i.schedule(runnable, j, TimeUnit.SECONDS);
    }

    final synchronized void c(boolean z) {
        this.j = z;
    }

    public final void d(long j) {
        b(new upg(this, this.g, this.h, Math.min(Math.max(30L, j + j), f)), j);
        c(true);
    }

    public final synchronized boolean e() {
        return this.j;
    }
}
