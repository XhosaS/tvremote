package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onm {
    public final Object a;
    public int b;
    public boolean c;
    public final String d;
    public final Map e;
    public AtomicInteger f;
    rtq g;
    private final PowerManager.WakeLock l;
    private Future m;
    private long n;
    private final Set o;
    private int p;
    private WorkSource q;
    private final ScheduledExecutorService r;
    private static final long i = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService j = null;
    private static final Object k = new Object();
    public static volatile ocv h = new ocv();

    public onm(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.o = new HashSet();
        this.c = true;
        this.e = new HashMap();
        this.f = new AtomicInteger(0);
        ocv.aG(context, "WakeLock: context must not be null");
        ocv.aE("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.g = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.d = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.d = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        sij.k(powerManager);
        this.l = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (ocx.a(context)) {
            packageName = ocw.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoY = oda.b(context).y(packageName, 0);
                    if (applicationInfoY == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoY.uid;
                        workSource = new WorkSource();
                        Method method = ocx.b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method2 = ocx.a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.q = workSource;
            if (workSource != null) {
                f(this.l, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (k) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    ocv ocvVar = ogg.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    j = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    private static void f(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a(long j2) {
        this.f.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, i), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.a) {
            if (!c()) {
                this.g = rtq.a;
                this.l.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.p++;
            d();
            Map map = this.e;
            ydk ydkVar = (ydk) map.get(null);
            if (ydkVar == null) {
                ydkVar = new ydk();
                map.put(null, ydkVar);
            }
            ydkVar.a++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j3 > this.n) {
                this.n = j3;
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                }
                this.m = this.r.schedule(new nur(this, 9), jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        Set set = this.o;
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        set.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void d() {
        if (this.c) {
            TextUtils.isEmpty(null);
        }
    }

    public final void e() {
        synchronized (this.a) {
            if (c()) {
                if (this.c) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                b();
                Map map = this.e;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((ydk) it.next()).a = 0;
                }
                map.clear();
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                    this.m = null;
                    this.n = 0L;
                }
                this.p = 0;
                PowerManager.WakeLock wakeLock = this.l;
                if (wakeLock.isHeld()) {
                    try {
                        try {
                            wakeLock.release();
                        } finally {
                            if (this.g != null) {
                                this.g = null;
                            }
                        }
                    } catch (RuntimeException e) {
                        if (!e.getClass().equals(RuntimeException.class)) {
                            throw e;
                        }
                        Log.e("WakeLock", String.format("%s failed to release!", this.d), e);
                        if (this.g != null) {
                            this.g = null;
                        }
                    }
                } else {
                    ocv.k("%s should be held!", this.d);
                }
            }
        }
    }
}
