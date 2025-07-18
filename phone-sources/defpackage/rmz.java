package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.CancellationSignal;
import android.os.Process;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rmz implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rmz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rjp] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantReadWriteLock.ReadLock lock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        iwu iwuVar;
        SharedPreferences.Editor editorEdit = null;
        boolean z = true;
        switch (this.c) {
            case 0:
                int i = ((rna) this.a).a;
                if (i != 0) {
                    Process.setThreadPriority(i);
                }
                this.b.run();
                return;
            case 1:
                ((rjq) ((AtomicReference) ((rla) this.b).b).get()).c(this.a);
                return;
            case 2:
                tst tstVar = (tst) this.b;
                boolean zG = tstVar.g();
                Object obj = this.a;
                if (!zG || ((Boolean) ((yfo) tstVar.c()).b()).booleanValue()) {
                    synchronized (obj) {
                        ((rrv) obj).a = true;
                        Activity activity = ((rrv) obj).b;
                        if (activity != null) {
                            ((rrv) obj).c(activity);
                        }
                        ((rrv) obj).b = null;
                    }
                    return;
                }
                return;
            case 3:
                ((rst) this.b).b.d.a(5, ((rmp) this.a).a);
                return;
            case 4:
                ((rst) this.b).b.d.a(6, ((rmp) this.a).a);
                return;
            case 5:
                ((View) this.a).getViewTreeObserver().removeOnDrawListener(this.b);
                return;
            case 6:
                ((rvq) this.a).a(this.b);
                return;
            case 7:
                SharedPreferences sharedPreferencesG = rrx.G((Context) this.a);
                for (Map.Entry<String, ?> entry : sharedPreferencesG.getAll().entrySet()) {
                    if (entry.getValue() instanceof String) {
                        if (entry.getValue().equals(this.b)) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferencesG.edit();
                            }
                            editorEdit.remove(entry.getKey());
                        }
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    return;
                }
                return;
            case 8:
                ((ryp) this.a).b(this.b);
                return;
            case 9:
                try {
                    sfy.J(this.b);
                    return;
                } catch (Exception e) {
                    Log.w("FlagStore", "Failed to store account on flag read for: " + ((ryp) this.a).b + " which may lead to stale flags.", e);
                    return;
                }
            case 10:
                Map mapA = ryw.a(((rwv) this.a).c);
                Object obj2 = this.b;
                if (mapA.containsKey(obj2)) {
                    return;
                }
                Log.e("FilePhenotypeFlags", a.cg((String) obj2, "Config package ", " cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags."));
                return;
            case 11:
                Object obj3 = this.a;
                sej sejVar = (sej) obj3;
                sejVar.a.start();
                ?? r2 = this.b;
                int size = r2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sei seiVar = (sei) r2.get(i2);
                    Object obj4 = seiVar.e;
                    int i3 = seiVar.a;
                    int i4 = seiVar.b;
                    int i5 = seiVar.c;
                    int i6 = seiVar.d;
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj4;
                    View view = viewHolder.itemView;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    sejVar.f.add(obj4);
                    viewPropertyAnimatorAnimate.setDuration(((RecyclerView.ItemAnimator) obj3).getMoveDuration()).setListener(new see(sejVar, viewHolder, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                }
                ((ArrayList) r2).clear();
                sejVar.c.remove((Object) r2);
                return;
            case 12:
                ?? r0 = this.b;
                int size2 = r0.size();
                int i9 = 0;
                while (true) {
                    Object obj5 = this.a;
                    if (i9 >= size2) {
                        ((ArrayList) r0).clear();
                        ((sej) obj5).d.remove((Object) r0);
                        return;
                    }
                    seh sehVar = (seh) r0.get(i9);
                    RecyclerView.ViewHolder viewHolder2 = sehVar.a;
                    View view2 = viewHolder2 == null ? null : viewHolder2.itemView;
                    RecyclerView.ViewHolder viewHolder3 = sehVar.b;
                    View view3 = viewHolder3 != null ? viewHolder3.itemView : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(((RecyclerView.ItemAnimator) obj5).getChangeDuration());
                        sej sejVar2 = (sej) obj5;
                        sejVar2.h.add(sehVar.a);
                        duration.translationX(sehVar.e - sehVar.c);
                        duration.translationY(sehVar.f - sehVar.d);
                        duration.alpha(0.0f).setListener(new sef(sejVar2, sehVar, duration, view2)).start();
                    }
                    if (view3 != null) {
                        sej sejVar3 = (sej) obj5;
                        ArrayList arrayList = sejVar3.h;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList.add(sehVar.b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(((RecyclerView.ItemAnimator) obj5).getChangeDuration()).alpha(1.0f).setListener(new seg(sejVar3, sehVar, viewPropertyAnimatorAnimate2, view3)).start();
                    }
                    i9++;
                }
            case 13:
                ?? r02 = this.b;
                int size3 = r02.size();
                int i10 = 0;
                while (true) {
                    Object obj6 = this.a;
                    if (i10 >= size3) {
                        ((ArrayList) r02).clear();
                        ((sej) obj6).b.remove((Object) r02);
                        return;
                    }
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) r02.get(i10);
                    View view4 = viewHolder4.itemView;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    sej sejVar4 = (sej) obj6;
                    sejVar4.e.add(viewHolder4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(((RecyclerView.ItemAnimator) obj6).getAddDuration()).setListener(new sed(sejVar4, viewHolder4, view4, viewPropertyAnimatorAnimate3)).start();
                    i10++;
                }
            case 14:
                if (((uhq) this.b).isCancelled()) {
                    ((CancellationSignal) ((rzy) this.a).b).cancel();
                    return;
                }
                return;
            case 15:
                try {
                    ((snp) this.a).d.set((ko) sfy.J(this.b));
                    return;
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                }
            case 16:
                tlx tlxVar = (tlx) ((tjj) this.a).b.a;
                if (tlxVar.f != 5) {
                    Object obj7 = this.b;
                    ulo uloVar = tlxVar.g;
                    pku.h(new tme((Exception) obj7));
                    uloVar.f();
                    return;
                }
                return;
            case 17:
                ((tjj) this.a).b.i((Exception) this.b);
                return;
            case 18:
                ((itv) ((pku) this.a).a).v(new tmd((tkm) this.b));
                return;
            case 19:
                tmd tmdVar = new tmd((tkm) this.b);
                Object obj8 = ((pku) this.a).a;
                itv itvVar = (itv) obj8;
                iua iuaVar = itvVar.n;
                if (iuaVar != null && (iwuVar = iuaVar.j) != null && iwuVar.b.b(tmdVar)) {
                    ((tug) itv.a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteFound", 584, "MediaDeviceControllerImpl.kt")).s("Rediscovered a selected virtual remote device.");
                    return;
                }
                String strA = tmdVar.a();
                tui tuiVar = itv.a;
                ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteFound", 589, "MediaDeviceControllerImpl.kt")).v("New virtual remote device %s has been found.", strA);
                Object objA = itvVar.c.a(tmdVar, itvVar.d);
                ReentrantReadWriteLock reentrantReadWriteLock = itvVar.p;
                lock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i11 = 0; i11 < readHoldCount; i11++) {
                    lock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    HashMap map = ((itv) obj8).q;
                    iua iuaVarB = ipc.b(map, tmdVar);
                    if (iuaVarB != null) {
                        ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteFound", 598, "MediaDeviceControllerImpl.kt")).v("Device %s has been already discovered by other means. Adding virtual remote object.", strA);
                        iuaVarB.y((iwu) objA);
                        z = false;
                    } else {
                        ((tug) tuiVar.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteFound", 605, "MediaDeviceControllerImpl.kt")).v("%s has not been discovered yet. Adding a new discovered device.", strA);
                        String strA2 = tmdVar.a();
                        strA2.getClass();
                        iuaVarB = itv.B((itv) obj8, strA2, false, (iwu) objA, null, 21);
                        map.put(iuaVarB.b, iuaVarB);
                    }
                    for (int i12 = 0; i12 < readHoldCount; i12++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                    if (z) {
                        itvVar.r(iuaVarB);
                        return;
                    }
                    itvVar.q(iuaVarB);
                    if (yks.e(iuaVarB, itvVar.n)) {
                        ((tug) itv.a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteFound", 619, "MediaDeviceControllerImpl.kt")).s("Discovered virtual remote belongs to the currently selected device. Auto-connecting.");
                        itvVar.o((iwu) objA);
                        return;
                    }
                    return;
                } finally {
                    for (int i13 = 0; i13 < readHoldCount; i13++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                }
            default:
                tmd tmdVar2 = new tmd((tkm) this.b);
                String strA3 = tmdVar2.a();
                tui tuiVar2 = itv.a;
                ((tug) tuiVar2.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteChanged", 629, "MediaDeviceControllerImpl.kt")).v("Virtual remote for %s has changed.", strA3);
                Object obj9 = ((pku) this.a).a;
                itv itvVar2 = (itv) obj9;
                ReentrantReadWriteLock reentrantReadWriteLock2 = itvVar2.p;
                lock = reentrantReadWriteLock2.readLock();
                readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i14 = 0; i14 < readHoldCount; i14++) {
                    lock.unlock();
                }
                writeLock = reentrantReadWriteLock2.writeLock();
                writeLock.lock();
                try {
                    iua iuaVarB2 = ipc.b(((itv) obj9).q, tmdVar2);
                    if (iuaVarB2 == null) {
                        ((tug) tuiVar2.f().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl", "onVirtualRemoteChanged", 636, "MediaDeviceControllerImpl.kt")).v("Device %s has not been discovered. Callbacks will not be issued.", strA3);
                        return;
                    }
                    String strA4 = tmdVar2.a();
                    strA4.getClass();
                    iuaVarB2.c = strA4;
                    for (int i15 = 0; i15 < readHoldCount; i15++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                    itvVar2.q(iuaVarB2);
                    return;
                } finally {
                    for (int i16 = 0; i16 < readHoldCount; i16++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                }
        }
    }

    public /* synthetic */ rmz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
