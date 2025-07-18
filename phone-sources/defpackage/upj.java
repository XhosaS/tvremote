package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upj implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private upi e;
    private boolean f;

    public upj(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (true) {
            Queue queue = this.d;
            if (queue.isEmpty()) {
                return;
            } else {
                ((usr) queue.poll()).e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r5.f == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r5.f = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (defpackage.ocn.a().c(r5.a, r5.b, r5, 65) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        android.util.Log.e("FirebaseMessaging", "binding to the service failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Exception while binding the service", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void c() {
        /*
            r5 = this;
            monitor-enter(r5)
        L1:
            java.util.Queue r0 = r5.d     // Catch: java.lang.Throwable -> L7e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L7c
            upi r1 = r5.e     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L4c
            boolean r1 = r1.isBinderAlive()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L4c
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L7e
            usr r0 = (defpackage.usr) r0     // Catch: java.lang.Throwable -> L7e
            upi r1 = r5.e     // Catch: java.lang.Throwable -> L7e
            int r2 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> L7e
            int r3 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r3) goto L44
            zft r1 = r1.a     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r0.b     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L7e
            uoj r1 = (defpackage.uoj) r1     // Catch: java.lang.Throwable -> L7e
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Throwable -> L7e
            onz r1 = r1.f(r2)     // Catch: java.lang.Throwable -> L7e
            fba r2 = new fba     // Catch: java.lang.Throwable -> L7e
            r3 = 15
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7e
            nmn r3 = new nmn     // Catch: java.lang.Throwable -> L7e
            r4 = 7
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L7e
            r1.l(r2, r3)     // Catch: java.lang.Throwable -> L7e
            goto L1
        L44:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "Binding only allowed within app"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L4c:
            boolean r0 = r5.f     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L51
            goto L7c
        L51:
            r0 = 1
            r5.f = r0     // Catch: java.lang.Throwable -> L7e
            ocn r0 = defpackage.ocn.a()     // Catch: java.lang.SecurityException -> L6c java.lang.Throwable -> L7e
            android.content.Context r1 = r5.a     // Catch: java.lang.SecurityException -> L6c java.lang.Throwable -> L7e
            android.content.Intent r2 = r5.b     // Catch: java.lang.SecurityException -> L6c java.lang.Throwable -> L7e
            r3 = 65
            boolean r0 = r0.c(r1, r2, r5, r3)     // Catch: java.lang.SecurityException -> L6c java.lang.Throwable -> L7e
            if (r0 != 0) goto L7c
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "binding to the service failed"
            android.util.Log.e(r0, r1)     // Catch: java.lang.SecurityException -> L6c java.lang.Throwable -> L7e
            goto L74
        L6c:
            r0 = move-exception
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L7e
        L74:
            r0 = 0
            r5.f = r0     // Catch: java.lang.Throwable -> L7e
            r5.b()     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r5)
            return
        L7c:
            monitor-exit(r5)
            return
        L7e:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upj.c():void");
    }

    final synchronized onz a(Intent intent) {
        usr usrVar;
        usrVar = new usr(intent);
        ufx ufxVar = new ufx(usrVar, 10);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ScheduledExecutorService scheduledExecutorService = this.c;
        usrVar.d().l(scheduledExecutorService, new nmn(scheduledExecutorService.schedule(ufxVar, 20L, timeUnit), 8));
        this.d.add(usrVar);
        c();
        return usrVar.d();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = false;
        if (iBinder instanceof upi) {
            this.e = (upi) iBinder;
            c();
        } else {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(iBinder))));
            b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c();
    }
}
