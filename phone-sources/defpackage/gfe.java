package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Process;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.videos.R;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gfe implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gfe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r0v31, types: [hud, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [cuh, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException, SecurityException, IllegalArgumentException {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                gfh gfhVar = (gfh) obj;
                AtomicBoolean atomicBoolean = gfhVar.h;
                boolean zL = ((dvs) obj).l();
                if (atomicBoolean.compareAndSet(false, true) && zL) {
                    ykr.q(gfhVar.g.l(), gfhVar.i, 0, new btr(gfhVar, (yih) null, 18), 2);
                    return;
                }
                return;
            case 1:
                ((gdo) this.a).b();
                return;
            case 2:
                ((SwipeRefreshLayout) this.a).b();
                return;
            case 3:
                ViewPager viewPager = (ViewPager) this.a;
                viewPager.l(0);
                viewPager.f();
                return;
            case 4:
                gmd gmdVar = (gmd) this.a;
                gmdVar.d = false;
                gmdVar.c();
                return;
            case 5:
                this.a.accept(new gns(yhb.a));
                return;
            case 6:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 7:
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.t(null);
                    return;
                }
                return;
            case 8:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 9:
                gsk gskVar = (gsk) this.a;
                if (gskVar.e >= 2) {
                    gpn.b();
                    return;
                }
                gun gunVar = gskVar.c;
                gskVar.e = 2;
                gpn.b();
                Context context = gskVar.a;
                String str = gsh.a;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                gsh.f(intent, gunVar);
                Executor executor = gskVar.g;
                gso gsoVar = gskVar.d;
                int i = gskVar.b;
                executor.execute(new gsm(gsoVar, intent, i));
                if (!gsoVar.d.e(gunVar.a)) {
                    gpn.b();
                    return;
                } else {
                    gpn.b();
                    executor.execute(new gsm(gsoVar, gsh.d(context, gunVar), i));
                    return;
                }
            case 10:
                Object obj2 = this.a;
                gsk gskVar2 = (gsk) obj2;
                if (gskVar2.e != 0) {
                    gpn.b();
                    gun gunVar2 = gskVar2.c;
                    Objects.toString(gunVar2);
                    gunVar2.toString();
                    return;
                }
                gskVar2.e = 1;
                gpn.b();
                gun gunVar3 = gskVar2.c;
                Objects.toString(gunVar3);
                gunVar3.toString();
                gso gsoVar2 = gskVar2.d;
                if (!gsoVar2.d.g(gskVar2.m)) {
                    gskVar2.a();
                    return;
                }
                gvy gvyVar = gsoVar2.c;
                synchronized (gvyVar.c) {
                    gpn.b();
                    Objects.toString(gunVar3);
                    gvyVar.a(gunVar3);
                    gqz gqzVar = new gqz(gvyVar, gunVar3, 3, null);
                    gvyVar.a.put(gunVar3, gqzVar);
                    gvyVar.b.put(gunVar3, obj2);
                    gvyVar.d.n(600000L, gqzVar);
                }
                return;
            case 11:
                hcd hcdVar = (hcd) this.a;
                hcb hcbVar = hcdVar.b;
                if (hcbVar == null) {
                    return;
                }
                Object obj3 = hcbVar.a;
                if (obj3 != null) {
                    hcdVar.b(obj3);
                    return;
                } else {
                    hcdVar.a(hcbVar.b);
                    return;
                }
            case 12:
                hid hidVar = (hid) this.a;
                hia hiaVar = hidVar.c;
                hiaVar.z(0);
                hij hijVar = hik.h;
                hiaVar.v(24, hijVar);
                hidVar.b(hijVar);
                return;
            case 13:
                ?? r02 = this.a;
                ((hkg) r02).c.a(r02);
                return;
            case 14:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 15:
                break;
            case 16:
                ifq.c((Context) this.a, R.string.movie_added_to_watchlist);
                return;
            case 17:
                ifq.c((Context) this.a, R.string.movie_not_added_to_watchlist);
                return;
            case 18:
                tui tuiVar = itv.a;
                ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "startDiscovery$lambda$11", 497, "MediaDeviceControllerImpl.kt")).s("Starting device discovery.");
                itv itvVar = (itv) this.a;
                if (!itvVar.f.compareAndSet(false, true)) {
                    ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "startDiscovery$lambda$11", 499, "MediaDeviceControllerImpl.kt")).s("Discovery is already in progress. Ignoring.");
                    return;
                }
                itvVar.k = fuy.b(itvVar.b);
                itvVar.y();
                ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "startCastDiscovery", 533, "MediaDeviceControllerImpl.kt")).s("Starting cast discovery.");
                fuy fuyVar = itvVar.k;
                if (fuyVar == null) {
                    yks.c("mediaRouter");
                    fuyVar = null;
                }
                fuyVar.d(itvVar.m, itvVar.s, 2);
                if (itvVar.k == null) {
                    yks.c("mediaRouter");
                }
                for (fux fuxVar : fuy.m()) {
                    fuxVar.getClass();
                    itvVar.s(fuxVar);
                }
                iua iuaVar = itvVar.n;
                fux fuxVar2 = iuaVar != null ? iuaVar.i : null;
                if (fuxVar2 != null) {
                    if (itvVar.k == null) {
                        yks.c("mediaRouter");
                    }
                    if (!fuy.m().contains(fuxVar2)) {
                        ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "startCastDiscovery", 545, "MediaDeviceControllerImpl.kt")).s("Lost selected cast route while paused.");
                        itvVar.u(fuxVar2);
                    }
                }
                try {
                    itvVar.u.k.ea(itvVar.t);
                } catch (IllegalStateException unused) {
                }
                itvVar.t.dM();
                return;
            case 19:
                ((itv) this.a).y();
                return;
            default:
                Object obj4 = this.a;
                nmg nmgVarC = nmg.c();
                if (nmgVarC != null) {
                    nmgVarC.h().e(((iua) obj4).p, nmq.class);
                }
                ((iua) obj4).s();
                return;
        }
        while (true) {
            Object obj5 = this.a;
            boolean z = ((hmr) obj5).c;
            try {
                ((hmr) obj5).c((hmq) ((hmr) obj5).b.remove());
                hmp hmpVar = ((hmr) obj5).d;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public gfe(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
