package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaqp {
    public static final /* synthetic */ int e = 0;
    private static final long f = TimeUnit.HOURS.toSeconds(8);
    public final aapq a;
    public final FirebaseMessaging b;
    public final aaqn d;
    private final Context g;
    private final aapu h;
    private final ScheduledExecutorService i;
    public final Map c = new we();
    private boolean j = false;

    public aaqp(FirebaseMessaging firebaseMessaging, aapu aapuVar, aaqn aaqnVar, aapq aapqVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = firebaseMessaging;
        this.h = aapuVar;
        this.d = aaqnVar;
        this.a = aapqVar;
        this.g = context;
        this.i = scheduledExecutorService;
    }

    public static void a(lvf lvfVar) throws IOException {
        try {
            lvq.e(lvfVar, 30L, TimeUnit.SECONDS);
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

    static boolean e() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    final void b(Runnable runnable, long j) {
        this.i.schedule(runnable, j, TimeUnit.SECONDS);
    }

    final synchronized void c(boolean z) {
        this.j = z;
    }

    final void d(long j) {
        b(new aaqr(this, this.g, this.h, Math.min(Math.max(30L, j + j), f)), j);
        c(true);
    }

    final synchronized boolean f() {
        return this.j;
    }
}
