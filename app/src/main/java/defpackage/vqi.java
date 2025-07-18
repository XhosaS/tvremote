package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqi {
    public static final zdy a = zdy.h("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final Context b;
    public final Map c;
    public final Map d;
    private final PowerManager e;
    private final zyg f;
    private final zyh g;
    private final zyh h;
    private final rnw i;
    private boolean j;

    public vqi(Context context, PowerManager powerManager, zyg zygVar, Map map, Map map2, zyh zyhVar, zyh zyhVar2, rnw rnwVar) {
        yru.a(new yrp() { // from class: vqe
            @Override // defpackage.yrp
            public final Object eV() {
                vqi vqiVar = this.a;
                Map map3 = vqiVar.c;
                String strA = vqiVar.a();
                yqw.R(map3.containsKey(strA), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", strA);
                return new Intent(vqiVar.b, (Class<?>) ((agow) map3.get(strA)).a());
            }
        });
        yru.a(new yrp() { // from class: vqf
            @Override // defpackage.yrp
            public final Object eV() {
                vqi vqiVar = this.a;
                agow agowVar = (agow) vqiVar.d.get(vqiVar.a());
                if (agowVar != null) {
                    return (Class) agowVar.a();
                }
                ((zdv) ((zdv) vqi.a.d()).q("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 324, "AndroidFutures.java")).u("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
                return InternalForegroundService.class;
            }
        });
        this.j = false;
        this.b = context;
        this.e = powerManager;
        this.f = zygVar;
        this.g = zyhVar;
        this.h = zyhVar2;
        this.c = map;
        this.d = map2;
        this.i = rnwVar;
    }

    static /* synthetic */ void b(zyd zydVar, String str, String str2, int i, String str3, Object[] objArr) {
        try {
            zxn.o(zydVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e.getCause())).q(str, str2, i, null)).M(str3, objArr);
        }
    }

    public static void c(zyd zydVar, String str, Object... objArr) {
        d("", "", 0, zydVar, str, objArr);
    }

    public static void d(final String str, final String str2, final int i, final zyd zydVar, final String str3, final Object... objArr) {
        zydVar.d(wyo.h(new Runnable() { // from class: vqg
            @Override // java.lang.Runnable
            public final void run() {
                vqi.b(zydVar, str, str2, i, str3, objArr);
            }
        }), zwk.a);
    }

    public final String a() {
        rnw rnwVar = this.i;
        String strB = rnu.b();
        return rnwVar.a() ? "main_process_service_key" : strB.substring(strB.lastIndexOf(":") + 1);
    }

    public final void e(zyd zydVar, String str) {
        if (zydVar.isDone()) {
            return;
        }
        try {
            final PowerManager.WakeLock wakeLockNewWakeLock = this.e.newWakeLock(1, str);
            wakeLockNewWakeLock.acquire();
            zyd zydVarA = wyy.a(zxn.i(zydVar), 45L, TimeUnit.SECONDS, this.g);
            zxe zxeVarF = wyo.f(new vqh(str));
            zwk zwkVar = zwk.a;
            zxn.p(zydVarA, zxeVarF, zwkVar);
            zyd zydVarN = zxn.n(zxn.i(zydVar), 3600L, TimeUnit.SECONDS, this.h);
            wakeLockNewWakeLock.getClass();
            zydVarN.d(new Runnable() { // from class: vqd
                @Override // java.lang.Runnable
                public final void run() {
                    wakeLockNewWakeLock.release();
                }
            }, zwkVar);
        } catch (SecurityException e) {
            if (this.j) {
                return;
            }
            try {
                Context context = this.b;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String str2 : packageInfo.requestedPermissions) {
                        if ("android.permission.WAKE_LOCK".equals(str2)) {
                            this.j = true;
                            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", 168, "AndroidFutures.java")).u("Failed to acquire wakelock");
                            return;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public final void f(final zyd zydVar, final long j, final TimeUnit timeUnit) {
        final zyf zyfVarA = this.g.schedule(wyo.h(new Runnable() { // from class: vqb
            @Override // java.lang.Runnable
            public final void run() {
                zyd zydVar2 = zydVar;
                if (zydVar2.isDone()) {
                    return;
                }
                ((zdv) ((zdv) ((zdv) vqi.a.c()).p(wyy.b())).q("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 361, "AndroidFutures.java")).I("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", Long.valueOf(j), timeUnit, zydVar2);
            }
        }), j, timeUnit);
        zydVar.d(wyo.h(new Runnable() { // from class: vqc
            @Override // java.lang.Runnable
            public final void run() {
                zyfVarA.cancel(true);
                zyd zydVar2 = zydVar;
                if (((zuv) zydVar2).valueField instanceof zue) {
                    return;
                }
                try {
                    zxn.o(zydVar2);
                } catch (ExecutionException e) {
                    wyy.j(e.getCause());
                }
            }
        }), this.f);
    }
}
