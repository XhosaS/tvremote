package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocn {
    private static final Object b = new Object();
    private static volatile ocn c;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    private ocn() {
    }

    public static ocn a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new ocn();
                }
            }
        }
        ocn ocnVar = c;
        ocv.aF(ocnVar);
        return ocnVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof obj);
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (f(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    e(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.a.remove(serviceConnection);
                }
            }
        }
        e(context, serviceConnection);
    }

    public final boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((oda.b(context).y(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            this.a.remove(serviceConnection, serviceConnection);
        }
    }
}
