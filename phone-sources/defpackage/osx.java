package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osx {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;

    private osx() {
    }

    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static uhp b(final Context context, Callable callable, Executor executor) {
        osv osvVar = new osv(callable, 0);
        if (g(context)) {
            return sfy.G(osvVar, executor);
        }
        final uic uicVar = new uic();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final osw oswVar = new osw(atomicBoolean, context, uicVar, osvVar, executor);
        context.registerReceiver(oswVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!g(context) || !atomicBoolean.compareAndSet(false, true)) {
            uicVar.c(new Runnable() { // from class: osu
                @Override // java.lang.Runnable
                public final void run() {
                    int i = osx.a;
                    if (uicVar.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
                        osx.e(context, oswVar);
                    }
                }
            }, ugk.a);
            return uicVar;
        }
        e(context, oswVar);
        uicVar.ev(sfy.G(osvVar, executor));
        return uicVar;
    }

    public static uhp c(Context context, Runnable runnable) {
        return b(context, Executors.callable(runnable, null), ugk.a);
    }

    public static uhp d(Context context, Runnable runnable, Executor executor) {
        return b(context, Executors.callable(runnable, null), executor);
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    public static boolean f(Context context) {
        return !h(context);
    }

    public static boolean g(Context context) {
        return h(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean h(android.content.Context r7) {
        /*
            boolean r0 = defpackage.osx.c
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<osx> r0 = defpackage.osx.class
            monitor-enter(r0)
            boolean r2 = defpackage.osx.c     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return r1
        Lf:
            r2 = r1
        L10:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = defpackage.osx.b     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L23
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L52
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L52
            defpackage.osx.b = r3     // Catch: java.lang.Throwable -> L52
        L23:
            android.os.UserManager r3 = defpackage.osx.b     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L29
            r5 = r1
            goto L4c
        L29:
            boolean r6 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            if (r6 != 0) goto L39
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            if (r7 != 0) goto L48
        L39:
            r5 = r1
            goto L48
        L3b:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
            defpackage.osx.b = r4     // Catch: java.lang.Throwable -> L52
            int r2 = r2 + 1
            goto L10
        L48:
            if (r5 == 0) goto L4c
            defpackage.osx.b = r4     // Catch: java.lang.Throwable -> L52
        L4c:
            if (r5 == 0) goto L50
            defpackage.osx.c = r1     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return r5
        L52:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osx.h(android.content.Context):boolean");
    }
}
