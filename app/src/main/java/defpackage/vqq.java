package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.os.Build;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqq {
    public static final zdy a = zdy.h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap(10);
    public final yxs d = new yxs();
    public final zbp e = new yxu(3);
    public vqp f;
    public Service g;
    public int h;
    public vqn i;
    private final vqm j;

    public vqq(zyh zyhVar, vqm vqmVar) {
        new zyt(zyhVar);
        this.j = vqmVar;
        this.f = vqp.STOPPED;
    }

    public final void a(Service service, Notification notification) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT < 29) {
            service.startForeground(174344743, notification);
            return;
        }
        zbp zbpVar = this.e;
        int i2 = 0;
        if (zbpVar.isEmpty()) {
            Context context = this.j.b;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = context.getApplicationInfo().targetSdkVersion;
            if (i4 >= 34) {
                z = true;
            } else {
                ((zdv) vqm.a.b().q("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "isTargetSdkAtLeastU", 61, "DefaultForegroundServiceType.kt")).z("targetSdk (%d) >= VERSION_CODES.UPSIDE_DOWN_CAKE (%d) == false", i4, 34);
                z = false;
            }
            boolean z2 = i3 >= 34;
            if (!z2 || !z) {
                ((zdv) vqm.a.b().q("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "get", 33, "DefaultForegroundServiceType.kt")).H("BuildCompat.isAtLeastU()=%b, isTargetSdkAtLeastU()=%b", z2, z);
            }
            i = (z2 && z) ? 2048 : 0;
        } else {
            Iterator itE = ((yvm) zbpVar.i()).a.e();
            int iIntValue = 0;
            while (itE.hasNext()) {
                iIntValue |= ((Integer) itE.next()).intValue();
            }
            i = iIntValue;
        }
        if (i == 0) {
            ((zdv) ((zdv) a.b()).q("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "startShortService", 371, "ForegroundServiceTracker.java")).u("starting foregroundService with type=none");
        } else {
            i2 = i;
        }
        service.startForeground(174344743, notification, i2);
    }

    public final void b() {
        vqp vqpVar = this.f;
        yqw.R(vqpVar == vqp.STARTED, "Destroyed in wrong state %s", vqpVar);
        this.f = vqp.STOPPED;
        this.g.stopForeground(true);
        this.i = null;
        this.g.stopSelf(this.h);
        this.g = null;
    }
}
