package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.gli;
import defpackage.gns;
import defpackage.goa;
import defpackage.goc;
import defpackage.goe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goh implements gnu {
    public static volatile goh a;
    public static final ReentrantLock b = new ReentrantLock();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final goe d;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    public goh(final goe goeVar) {
        this.d = goeVar;
        if (goeVar != null) {
            goeVar.e = new goc(new gof(this));
            ?? r0 = goeVar.a;
            if (r0 != 0) {
                r0.setSidecarCallback(new DistinctElementSidecarCallback(new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
                    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                        ?? r5;
                        sidecarDeviceState.getClass();
                        goe goeVar2 = goeVar;
                        for (Activity activity : goeVar2.c.values()) {
                            IBinder iBinderN = gli.N(activity);
                            SidecarWindowLayoutInfo windowLayoutInfo = null;
                            if (iBinderN != null && (r5 = goeVar2.a) != 0) {
                                windowLayoutInfo = r5.getWindowLayoutInfo(iBinderN);
                            }
                            Object obj = goeVar2.e;
                            if (obj != null) {
                                Object obj2 = goeVar2.b;
                                ((goc) obj).a(activity, goa.a(windowLayoutInfo, sidecarDeviceState));
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
                    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                        SidecarDeviceState sidecarDeviceState;
                        iBinder.getClass();
                        sidecarWindowLayoutInfo.getClass();
                        goe goeVar2 = goeVar;
                        Activity activity = (Activity) goeVar2.c.get(iBinder);
                        if (activity == null) {
                            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                            return;
                        }
                        Object obj = goeVar2.b;
                        ?? r1 = goeVar2.a;
                        if (r1 == 0 || (sidecarDeviceState = r1.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        gns gnsVarA = goa.a(sidecarWindowLayoutInfo, sidecarDeviceState);
                        Object obj2 = goeVar2.e;
                        if (obj2 != null) {
                            ((goc) obj2).a(activity, gnsVarA);
                        }
                    }
                }, null));
            }
        }
    }

    @Override // defpackage.gnu
    public final void a(Context context, Executor executor, cuh cuhVar) {
        Object next;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            cuhVar.accept(new gns(yhb.a));
            return;
        }
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            goe goeVar = this.d;
            if (goeVar == null) {
                cuhVar.accept(new gns(yhb.a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            boolean z = false;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (yks.e(((gog) it.next()).a, activity)) {
                        z = true;
                        break;
                    }
                }
            }
            gog gogVar = new gog(activity, executor, cuhVar);
            copyOnWriteArrayList.add(gogVar);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (yks.e(activity, ((gog) next).a)) {
                            break;
                        }
                    }
                }
                gog gogVar2 = (gog) next;
                Object obj = gogVar2 != null ? gogVar2.c : null;
                if (obj != null) {
                    gogVar.a((gns) obj);
                }
            } else {
                IBinder iBinderN = gli.N(activity);
                if (iBinderN != null) {
                    goeVar.b(iBinderN, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new god(goeVar, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.gnu
    public final void b(cuh cuhVar) {
        synchronized (b) {
            goe goeVar = this.d;
            if (goeVar == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            Iterator it = copyOnWriteArrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                gog gogVar = (gog) it.next();
                if (gogVar.b == cuhVar) {
                    gogVar.getClass();
                    arrayList.add(gogVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj = ((gog) it2.next()).a;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (yks.e(((gog) it3.next()).a, obj)) {
                            break;
                        }
                    }
                }
                IBinder iBinderN = gli.N((Activity) obj);
                if (iBinderN == null) {
                    continue;
                } else {
                    ?? r5 = goeVar.a;
                    if (r5 != 0) {
                        r5.onWindowLayoutChangeListenerRemoved(iBinderN);
                    }
                    ?? r6 = goeVar.d;
                    cuh<Configuration> cuhVar2 = (cuh) r6.get(obj);
                    if (cuhVar2 != null) {
                        if (obj instanceof csb) {
                            ((csb) obj).removeOnConfigurationChangedListener(cuhVar2);
                        }
                        r6.remove(obj);
                    }
                    Object obj2 = goeVar.e;
                    if (obj2 != null) {
                        ReentrantLock reentrantLock = ((goc) obj2).a;
                        reentrantLock.lock();
                        try {
                            ((goc) obj2).b.put(obj, null);
                            reentrantLock.unlock();
                        } finally {
                        }
                    }
                    ?? r2 = goeVar.c;
                    int size = r2.size();
                    r2.remove(iBinderN);
                    if (size == 1 && r5 != 0) {
                        r5.onDeviceStateListenersChanged(true);
                    }
                }
            }
        }
    }
}
