package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itv implements itk {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl");
    private String A;
    private wlx B;
    private final idr C;
    private ith D;
    private final SharedPreferences E;
    private final idr F;
    private final jah G;
    private final yvc H;
    private final iuh I;
    private ulo J;
    public final Context b;
    public final yjz c;
    public final lie d;
    public final CopyOnWriteArraySet e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public wpm i;
    public AtomicBoolean j;
    public fuy k;
    public boolean l;
    public final fur m;
    public iua n;
    public final iua o;
    public final ReentrantReadWriteLock p;
    public final HashMap q;
    public final idr r;
    public final itu s;
    public final iej t;
    public final kmy u;
    private final tmb v;
    private final Executor w;
    private final dve x;
    private String y;
    private final CopyOnWriteArraySet z;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0124, code lost:
    
        r9 = ((java.net.Inet4Address) r8).getHostAddress();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public itv(android.content.Context r8, defpackage.tmb r9, defpackage.kmy r10, defpackage.jah r11, defpackage.lfn r12, java.util.concurrent.Executor r13, defpackage.yjz r14, defpackage.dve r15, defpackage.lie r16) throws java.net.SocketException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itv.<init>(android.content.Context, tmb, kmy, jah, lfn, java.util.concurrent.Executor, yjz, dve, lie):void");
    }

    public static /* synthetic */ iua B(itv itvVar, String str, boolean z, iwu iwuVar, fux fuxVar, int i) {
        return new iua(itvVar.u, itvVar.G, (i & 1) != 0 ? UUID.randomUUID().toString() : null, str, ((i & 4) == 0) & z, itvVar.d, (i & 8) != 0 ? null : iwuVar, (i & 16) != 0 ? null : fuxVar);
    }

    private final void D(yjv yjvVar) {
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            this.w.execute(new gvj(yjvVar, (iti) next, 7, null));
        }
    }

    private final void E(ith ithVar) {
        yvc yvcVar;
        Object objD;
        this.C.c(ieg.a(ithVar));
        do {
            yvcVar = this.H;
            objD = yvcVar.d();
        } while (!yvcVar.f(objD, ithVar));
        Iterator it = this.z.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            this.w.execute(new gvj((itj) next, ithVar, 6, null));
        }
    }

    private final void F(iua iuaVar) {
        iuaVar.v();
        if (yks.e(iuaVar.b, ((iua) this.D).b)) {
            ((tug) a.e().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onDeviceDeleted", 861, "MediaDeviceControllerImpl.kt")).v("Last connected device %s has been lost. Switching default back to local device.", iuaVar.c);
            this.D = this.o;
        }
        this.d.aB(4, this.n, 0);
        this.F.c(f());
        D(new gwp(15));
        if (yks.e(iuaVar, this.n)) {
            C(3);
        }
    }

    private final void G() {
        z();
        p();
    }

    private final boolean H(iua iuaVar) {
        return yks.e(this.E.getString("com.google.android.apps.googletv.app.device.PREV_DEVICE", null), iuaVar.c);
    }

    public final void A(ith ithVar, boolean z) {
        Object objD;
        idr idrVar;
        iwc iwcVar;
        iua iuaVar;
        iwu iwuVar;
        iwu iwuVar2;
        String strD = ithVar.d();
        if (yks.e(ithVar, this.n)) {
            ((tug) a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "switchToMediaDeviceInternal", 320, "MediaDeviceControllerImpl.kt")).v("%s is already the active device. No further action required.", strD);
            return;
        }
        String strC = ithVar.c();
        iua iuaVar2 = this.o;
        if (!yks.e(strC, iuaVar2.b)) {
            ReentrantReadWriteLock.ReadLock lock = this.p.readLock();
            lock.lock();
            try {
                iuaVar2 = (iua) this.q.get(ithVar.c());
            } finally {
                lock.unlock();
            }
        }
        if (iuaVar2 == null) {
            ((tug) a.f().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "switchToMediaDeviceInternal", 333, "MediaDeviceControllerImpl.kt")).v("Unable to find matching discovered device for %s. Unable to make the switch.", strD);
            return;
        }
        iuaVar2.w();
        fux fuxVar = iuaVar2.i;
        boolean z2 = false;
        boolean z3 = fuxVar == null || !fuxVar.t();
        tui tuiVar = a;
        tug tugVar = (tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "closeActiveConnections", 474, "MediaDeviceControllerImpl.kt");
        iua iuaVar3 = this.n;
        tugVar.v("Closing active connections for %s.", iuaVar3 != null ? iuaVar3.c : null);
        iua iuaVar4 = this.n;
        if (iuaVar4 != null && (iwuVar2 = iuaVar4.j) != null) {
            iwuVar2.b(this.I);
        }
        iua iuaVar5 = this.n;
        if (iuaVar5 != null && (iwuVar = iuaVar5.j) != null) {
            iwuVar.j();
        }
        nmg nmgVarC = nmg.c();
        if (nmgVarC != null) {
            nmgVarC.h().d((!z3 || (iuaVar = this.n) == null || iuaVar.k) ? false : true);
        }
        iua iuaVar6 = this.n;
        if (iuaVar6 != null) {
            iuaVar6.w();
        }
        AtomicBoolean atomicBoolean = this.g;
        atomicBoolean.set(false);
        this.i = null;
        this.j.set(false);
        iwu iwuVar3 = iuaVar2.j;
        AtomicBoolean atomicBoolean2 = this.j;
        if (z && (iwuVar3 == null || (idrVar = iwuVar3.f) == null || (iwcVar = (iwc) idrVar.a()) == null || !yks.e(iwcVar.b(), true))) {
            z2 = true;
        }
        atomicBoolean2.set(z2);
        if (iwuVar3 != null) {
            o(iwuVar3);
        } else {
            atomicBoolean.set(true);
            ((tug) tuiVar.e().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "switchToMediaDeviceInternal", 352, "MediaDeviceControllerImpl.kt")).v("Device %s does not support virtual remote.", strD);
            if (z) {
                w(iuaVar2);
            }
        }
        boolean zE = yks.e(this.n, iuaVar2);
        this.n = iuaVar2;
        if (!zE) {
            E(iuaVar2);
        }
        yvc yvcVar = this.H;
        do {
            objD = yvcVar.d();
        } while (!yvcVar.f(objD, iuaVar2));
    }

    public final void C(int i) {
        iua iuaVar = this.n;
        if (iuaVar == null) {
            return;
        }
        tui tuiVar = a;
        ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "disconnectMediaDeviceWithReason", 455, "MediaDeviceControllerImpl.kt")).v("Disconnecting from media device %s.", iuaVar.c);
        this.d.aB(2, this.n, i);
        A(this.o, i != 3);
        if (i == 3) {
            ((tug) tuiVar.f().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "disconnectMediaDeviceWithReason", 461, "MediaDeviceControllerImpl.kt")).s("Unexpectedly lost selected device. Restarting discovery to clean up discovered devices.");
            G();
        }
    }

    @Override // defpackage.itk
    public final idr a() {
        return this.r;
    }

    @Override // defpackage.itk
    public final /* synthetic */ iea b() {
        return this.F;
    }

    @Override // defpackage.itk
    public final /* synthetic */ iea c() {
        return this.C;
    }

    @Override // defpackage.itk
    public final ith d() {
        return this.o;
    }

    @Override // defpackage.itk
    public final ith e() {
        return this.n;
    }

    @Override // defpackage.itk
    public final List f() {
        ReentrantReadWriteLock.ReadLock lock = this.p.readLock();
        lock.lock();
        try {
            Collection collectionValues = this.q.values();
            collectionValues.getClass();
            List listAl = yfm.al(collectionValues);
            lock.unlock();
            yhp yhpVar = new yhp((byte[]) null);
            yhpVar.add(this.o);
            yhpVar.addAll(yfm.aj(listAl, new fab(10)));
            List listSynchronizedList = DesugarCollections.synchronizedList(yfm.o(yhpVar));
            listSynchronizedList.getClass();
            return listSynchronizedList;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.itk
    public final void g(itj itjVar) {
        itjVar.getClass();
        this.z.add(itjVar);
    }

    @Override // defpackage.itk
    public final void h() {
        C(2);
    }

    @Override // defpackage.itk
    public final void i() {
        ((tug) a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "permissionsUpdated", 306, "MediaDeviceControllerImpl.kt")).s("Permissions have been updated. Restarting discovery.");
        G();
    }

    @Override // defpackage.itk
    public final void j(itj itjVar) {
        itjVar.getClass();
        this.z.remove(itjVar);
    }

    @Override // defpackage.itk
    public final void k(ith ithVar) {
        ithVar.getClass();
        ((tug) a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "switchToMediaDevice", 311, "MediaDeviceControllerImpl.kt")).v("Switching to media device %s.", ithVar.d());
        this.l = true;
        this.d.aB(1, ithVar, 0);
        A(ithVar, true);
    }

    @Override // defpackage.itk
    public final void l(String str, wlx wlxVar) {
        wlxVar.getClass();
        this.A = str;
        this.B = wlxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    @Override // defpackage.itk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(defpackage.wpm r13) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itv.m(wpm):boolean");
    }

    @Override // defpackage.itk
    public final yvc n() {
        return this.H;
    }

    public final void o(iwu iwuVar) {
        ((tug) a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "connectToVirtualRemote", 365, "MediaDeviceControllerImpl.kt")).v("Connecting to virtual remote for %s.", iwuVar.b.a());
        this.g.set(false);
        iwuVar.a(this.I);
        iwuVar.i();
        new Handler(Looper.getMainLooper()).post(new gfe(this, 19));
    }

    public final void p() {
        if (((dvl) this.x).b.a(dvd.e)) {
            if (this.e.isEmpty() && !this.h.get()) {
                return;
            }
            x();
        }
    }

    public final void q(iua iuaVar) {
        if (yks.e(this.n, iuaVar)) {
            E(iuaVar);
        }
        this.F.c(f());
        D(new gwp(13));
    }

    public final void r(iua iuaVar) {
        if (H(iuaVar)) {
            ((tug) a.e().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onDeviceDiscovered", 841, "MediaDeviceControllerImpl.kt")).v("Discovered last connected device %s.", iuaVar.c);
            this.D = iuaVar;
            A(iuaVar, false);
        }
        this.F.c(f());
        this.d.aB(3, this.n, 0);
        D(new gwp(14));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea A[LOOP:2: B:46:0x00e8->B:47:0x00ea, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.fux r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itv.s(fux):void");
    }

    public final void t(fux fuxVar) {
        fuxVar.getClass();
        if (ipc.d(fuxVar, this.m)) {
            String str = fuxVar.e;
            str.getClass();
            ReentrantReadWriteLock reentrantReadWriteLock = this.p;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                iua iuaVarC = ipc.c(this.q, fuxVar);
                if (iuaVarC == null) {
                    ((tug) a.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteChangedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 739, "MediaDeviceControllerImpl.kt")).v("There were no previously discovered devices matching %s. Attempting to add instead.", str);
                    s(fuxVar);
                    return;
                }
                iuaVarC.c = str;
                iuaVarC.x(fuxVar);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                q(iuaVarC);
            } finally {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
    }

    public final void u(fux fuxVar) {
        boolean z;
        if (ipc.d(fuxVar, this.m)) {
            String str = fuxVar.e;
            str.getClass();
            tui tuiVar = a;
            ((tug) tuiVar.e().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteRemovedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 757, "MediaDeviceControllerImpl.kt")).v("Cast route %s has been removed", str);
            ReentrantReadWriteLock reentrantReadWriteLock = this.p;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                HashMap map = this.q;
                iua iuaVarC = ipc.c(map, fuxVar);
                if (iuaVarC == null) {
                    ((tug) tuiVar.g().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteRemovedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 765, "MediaDeviceControllerImpl.kt")).v("There were no previously discovered devices matching %s. Skipping removal.", str);
                    return;
                }
                if (iuaVarC.j != null) {
                    ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteRemovedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 771, "MediaDeviceControllerImpl.kt")).v("There is still a virtual remote connected for %s. Removing route.", str);
                    iuaVarC.x(null);
                    z = false;
                } else {
                    ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onRouteRemovedInternal$java_com_google_android_apps_googletv_app_device_impl_impl", 779, "MediaDeviceControllerImpl.kt")).v("There are no more active connections remaining for %s. Removing from discovered devices.", str);
                    map.remove(iuaVarC.b);
                    z = true;
                }
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                if (z) {
                    F(iuaVarC);
                } else {
                    q(iuaVarC);
                }
            } finally {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
    }

    public final void v(tmd tmdVar) {
        boolean z;
        String strA = tmdVar.a();
        tui tuiVar = a;
        ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteLost", 648, "MediaDeviceControllerImpl.kt")).v("Virtual remote for %s has been lost.", strA);
        ReentrantReadWriteLock reentrantReadWriteLock = this.p;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            HashMap map = this.q;
            iua iuaVarB = ipc.b(map, tmdVar);
            if (iuaVarB == null) {
                ((tug) tuiVar.f().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteLost", 657, "MediaDeviceControllerImpl.kt")).v("Device %s has not been discovered. Callbacks will not be issued.", strA);
                return;
            }
            if (iuaVarB.i != null) {
                ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteLost", 663, "MediaDeviceControllerImpl.kt")).s("There is still a cast route for this device. Removing virtual remote.");
                iwu iwuVar = iuaVarB.j;
                if (iwuVar != null) {
                    iwuVar.j();
                }
                iuaVarB.y(null);
                z = false;
            } else {
                ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteLost", 670, "MediaDeviceControllerImpl.kt")).v("There are no more connections for this %s. Removing from discovered devices.", strA);
                map.remove(iuaVarB.b);
                z = true;
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (z) {
                F(iuaVarB);
            } else {
                q(iuaVarB);
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void w(iua iuaVar) {
        ((tug) a.e().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "saveDeviceAsLastConnection", 910, "MediaDeviceControllerImpl.kt")).v("Saving %s as the last connected device.", iuaVar.c);
        this.D = iuaVar;
        SharedPreferences sharedPreferences = this.E;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("com.google.android.apps.googletv.app.device.PREV_DEVICE", iuaVar.c);
        editorEdit.apply();
    }

    public final void x() {
        new Handler(Looper.getMainLooper()).post(new gfe(this, 18));
    }

    public final void y() {
        ((tug) a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "startVirtualRemoteDiscovery", 509, "MediaDeviceControllerImpl.kt")).s("Starting virtual remote discovery.");
        pku pkuVar = new pku(this);
        ((tug) ((tug) tmb.a.e()).j("com/google/android/tv/remote/virtual/client/VirtualRemote", "startDiscovery", 25, "VirtualRemote.java")).s("Discovery started");
        ulo uloVar = new ulo(this.v.c);
        Object obj = uloVar.b;
        tko tkoVar = new tko(uloVar, pkuVar, null);
        tkp tkpVar = (tkp) obj;
        if (tkpVar.c != null) {
            tkpVar.a();
        }
        tkpVar.c = new tkn(tkpVar, tkoVar);
        Iterator it = tkpVar.b.iterator();
        while (it.hasNext()) {
            ((tkr) it.next()).a(tkpVar.c);
        }
        this.J = uloVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void z() {
        int i = 0;
        if (this.f.compareAndSet(true, false)) {
            ((tug) a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "stopDiscovery", 564, "MediaDeviceControllerImpl.kt")).s("Stopping device discovery.");
            ulo uloVar = this.J;
            if (uloVar != null) {
                ((tkp) uloVar.b).a();
            }
            fuy fuyVar = this.k;
            if (fuyVar == null) {
                yks.c("mediaRouter");
                fuyVar = null;
            }
            fuyVar.f(this.s);
            try {
                this.u.k.ee(this.t);
            } catch (IllegalStateException unused) {
            }
            ReentrantReadWriteLock reentrantReadWriteLock = this.p;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                HashMap map = this.q;
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    iua iuaVar = this.n;
                    if (!yks.e(key, iuaVar != null ? iuaVar.b : null)) {
                        ((iua) entry.getValue()).v();
                    }
                }
                Set setEntrySet = map.entrySet();
                setEntrySet.getClass();
                yfm.M(setEntrySet, new ill(this, 4));
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                this.F.c(f());
                this.D = this.o;
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        }
    }
}
