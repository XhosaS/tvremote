package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
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
/* loaded from: classes.dex */
public class lue {
    public final Object a;
    public int b;
    public boolean c;
    koj d;
    public final String e;
    public final Map f;
    public AtomicInteger g;
    private final PowerManager.WakeLock m;
    private Future n;
    private long o;
    private final Set p;
    private int q;
    private WorkSource r;
    private final ScheduledExecutorService s;
    private static final long i = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService j = null;
    private static final Object k = new Object();
    private static volatile boolean l = false;
    public static volatile lub h = new lub();

    public lue(Context context) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.p = new HashSet();
        this.c = true;
        this.f = new HashMap();
        this.g = new AtomicInteger(0);
        kkk.l(context, "WakeLock: context must not be null");
        kkk.i("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.d = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.e = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.e = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        yry.b(powerManager);
        this.m = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (klu.b(context)) {
            packageName = kls.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = kmb.a.a(context).a(packageName, 0);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        klu.a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.r = workSource;
            if (workSource != null) {
                f(this.m, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (k) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    koq koqVar = kor.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    j = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    private static void f(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a(long j2) {
        this.g.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, i), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.a) {
            if (!c()) {
                this.d = koj.a;
                this.m.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.q++;
            d();
            Map map = this.f;
            luc lucVar = (luc) map.get(null);
            if (lucVar == null) {
                lucVar = new luc();
                map.put(null, lucVar);
            }
            lucVar.a++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j3 > this.o) {
                this.o = j3;
                Future future = this.n;
                if (future != null) {
                    future.cancel(false);
                }
                this.n = this.s.schedule(new Runnable() { // from class: lua
                    @Override // java.lang.Runnable
                    public final void run() {
                        lue lueVar = this.a;
                        synchronized (lueVar.a) {
                            if (lueVar.c()) {
                                lue.h.a("%s ** IS FORCE-RELEASED ON TIMEOUT **", lueVar.e);
                                lueVar.b();
                                if (lueVar.c()) {
                                    lueVar.b = 1;
                                    lueVar.e();
                                }
                            }
                        }
                    }
                }, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        Set set = this.p;
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
                Map map = this.f;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((luc) it.next()).a = 0;
                }
                map.clear();
                Future future = this.n;
                if (future != null) {
                    future.cancel(false);
                    this.n = null;
                    this.o = 0L;
                }
                this.q = 0;
                PowerManager.WakeLock wakeLock = this.m;
                if (wakeLock.isHeld()) {
                    try {
                        try {
                            wakeLock.release();
                        } finally {
                            if (this.d != null) {
                                this.d = null;
                            }
                        }
                    } catch (RuntimeException e) {
                        if (!e.getClass().equals(RuntimeException.class)) {
                            throw e;
                        }
                        Log.e("WakeLock", String.format("%s failed to release!", this.e), e);
                        if (this.d != null) {
                            this.d = null;
                        }
                    }
                } else {
                    h.a("%s should be held!", this.e);
                }
            }
        }
    }
}
