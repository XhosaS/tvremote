package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exz {
    private final agow a;
    private final Context b;
    private final PowerManager c;

    public exz(agow agowVar, Context context, PowerManager powerManager) {
        agowVar.getClass();
        context.getClass();
        powerManager.getClass();
        this.a = agowVar;
        this.b = context;
        this.c = powerManager;
    }

    private static final void e(PowerManager.WakeLock wakeLock) {
        try {
            wakeLock.release();
        } catch (RuntimeException unused) {
        }
    }

    public final void a() {
        PowerManager powerManager = this.c;
        if (powerManager.isInteractive()) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(805306378, "katniss:KatnissApplicationEntryPointImpl");
            if (wakeLockNewWakeLock.isHeld()) {
                wakeLockNewWakeLock.getClass();
                e(wakeLockNewWakeLock);
            }
            wakeLockNewWakeLock.acquire(1000L);
            wakeLockNewWakeLock.getClass();
            e(wakeLockNewWakeLock);
        }
    }

    public final void b(Intent intent) {
        ComponentName componentName = irm.a;
        intent.setComponent(irm.q);
        intent.addFlags(268435456);
        wyo.l(this.b, intent);
    }

    public final void c(Intent intent) {
        ComponentName componentName = irm.a;
        intent.setComponent(irm.v);
        intent.addFlags(268435456);
        wyo.l(this.b, intent);
    }

    public final void d(Intent intent) {
        ComponentName componentName = irm.a;
        intent.setComponent(irm.p);
        intent.putExtra("android.intent.extra.KEY_EVENT", 219);
        if (Build.VERSION.SDK_INT <= 29 || (Build.VERSION.SDK_INT == 30 && ((Boolean) this.a.a()).booleanValue())) {
            this.b.startForegroundService(intent);
        } else {
            this.b.startService(intent);
        }
    }
}
