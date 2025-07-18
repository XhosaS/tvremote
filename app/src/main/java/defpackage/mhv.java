package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.UserManager;
import android.util.Log;
import com.google.android.libraries.directboot.DirectBootHelperService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhv {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;
    private static boolean d = false;

    private mhv() {
    }

    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static zyd b(final Context context, zvh zvhVar, Executor executor) {
        if (h(context)) {
            return zxn.l(zvhVar, executor);
        }
        final zyu zyuVar = new zyu();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final mhu mhuVar = new mhu(atomicBoolean, context, zyuVar, zvhVar, executor);
        context.registerReceiver(mhuVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!h(context) || !atomicBoolean.compareAndSet(false, true)) {
            zyuVar.d(new Runnable() { // from class: mhs
                @Override // java.lang.Runnable
                public final void run() {
                    int i = mhv.a;
                    if ((zyuVar.valueField instanceof zue) && atomicBoolean.compareAndSet(false, true)) {
                        mhv.e(context, mhuVar);
                    }
                }
            }, zwk.a);
            return zyuVar;
        }
        e(context, mhuVar);
        zyuVar.eZ(zxn.l(zvhVar, executor));
        return zyuVar;
    }

    public static zyd c(Context context, final Callable callable, Executor executor) {
        return b(context, new zvh() { // from class: mht
            @Override // defpackage.zvh
            public final zyd a() {
                int i = mhv.a;
                return zxn.k(callable, zwk.a);
            }
        }, executor);
    }

    public static zyd d(Context context, Runnable runnable) {
        return c(context, Executors.callable(runnable, null), zwk.a);
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    public static synchronized void f() {
        d = true;
    }

    public static boolean g(Context context) {
        return !i(context);
    }

    public static boolean h(Context context) {
        return i(context);
    }

    private static boolean i(Context context) {
        boolean zJ;
        if (c) {
            return true;
        }
        synchronized (mhv.class) {
            if (c) {
                return true;
            }
            if (d) {
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName(context, DirectBootHelperService.class.getName()), 268435968);
                zJ = false;
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zJ = true;
                            break;
                        }
                        if (it.next().serviceInfo.directBootAware) {
                            Log.w("DirectBootUtils", "Falling back to user manager.");
                            d = false;
                            zJ = j(context);
                            break;
                        }
                    }
                }
            } else {
                zJ = j(context);
            }
            if (zJ) {
                c = true;
            }
            return zJ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean j(android.content.Context r6) {
        /*
            r0 = 1
            r1 = r0
        L2:
            r2 = 2
            r3 = 0
            r4 = 0
            if (r1 > r2) goto L38
            android.os.UserManager r2 = defpackage.mhv.b
            if (r2 != 0) goto L15
            java.lang.Class<android.os.UserManager> r2 = android.os.UserManager.class
            java.lang.Object r2 = r6.getSystemService(r2)
            android.os.UserManager r2 = (android.os.UserManager) r2
            defpackage.mhv.b = r2
        L15:
            android.os.UserManager r2 = defpackage.mhv.b
            if (r2 != 0) goto L1a
            return r0
        L1a:
            boolean r5 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r2)     // Catch: java.lang.NullPointerException -> L2b
            if (r5 != 0) goto L39
            android.os.UserHandle r5 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L2b
            boolean r6 = r2.isUserRunning(r5)     // Catch: java.lang.NullPointerException -> L2b
            if (r6 != 0) goto L38
            goto L39
        L2b:
            r2 = move-exception
            java.lang.String r4 = "DirectBootUtils"
            java.lang.String r5 = "Failed to check if user is unlocked."
            android.util.Log.w(r4, r5, r2)
            defpackage.mhv.b = r3
            int r1 = r1 + 1
            goto L2
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L3d
            defpackage.mhv.b = r3
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhv.j(android.content.Context):boolean");
    }
}
