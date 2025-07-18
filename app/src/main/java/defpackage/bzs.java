package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.byq;
import defpackage.bzj;
import defpackage.bzm;
import defpackage.bzo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzs implements bys {
    public static volatile bzs a;
    public static final ReentrantLock b = new ReentrantLock();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final bzd d;

    public bzs(bzd bzdVar) {
        this.d = bzdVar;
        if (bzdVar != null) {
            final bzo bzoVar = (bzo) bzdVar;
            bzoVar.f = new bzm(new bzp(this));
            SidecarInterface sidecarInterface = bzoVar.b;
            if (sidecarInterface != null) {
                sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                        SidecarInterface sidecarInterface2;
                        sidecarDeviceState.getClass();
                        bzo bzoVar2 = bzoVar;
                        for (Activity activity : bzoVar2.d.values()) {
                            IBinder iBinderA = bzo.a.a(activity);
                            SidecarWindowLayoutInfo windowLayoutInfo = null;
                            if (iBinderA != null && (sidecarInterface2 = bzoVar2.b) != null) {
                                windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinderA);
                            }
                            bzm bzmVar = bzoVar2.f;
                            if (bzmVar != null) {
                                bzmVar.a(activity, bzoVar2.c.a(windowLayoutInfo, sidecarDeviceState));
                            }
                        }
                    }

                    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        SidecarDeviceState sidecarDeviceState;
                        iBinder.getClass();
                        sidecarWindowLayoutInfo.getClass();
                        bzo bzoVar2 = bzoVar;
                        Activity activity = (Activity) bzoVar2.d.get(iBinder);
                        if (activity == null) {
                            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                            return;
                        }
                        bzj bzjVar = bzoVar2.c;
                        SidecarInterface sidecarInterface2 = bzoVar2.b;
                        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        byq byqVarA = bzjVar.a(sidecarWindowLayoutInfo, sidecarDeviceState);
                        bzm bzmVar = bzoVar2.f;
                        if (bzmVar != null) {
                            bzmVar.a(activity, byqVarA);
                        }
                    }
                }, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bys
    public final void a(afe afeVar) {
        synchronized (b) {
            bzd bzdVar = this.d;
            if (bzdVar == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            Iterator it = copyOnWriteArrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                bzr bzrVar = (bzr) it.next();
                if (bzrVar.b == afeVar) {
                    bzrVar.getClass();
                    arrayList.add(bzrVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity activity = ((bzr) it2.next()).a;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (agvy.c(((bzr) it3.next()).a, activity)) {
                            break;
                        }
                    }
                }
                IBinder iBinderA = bzo.a.a(activity);
                if (iBinderA == null) {
                    continue;
                } else {
                    SidecarInterface sidecarInterface = ((bzo) bzdVar).b;
                    if (sidecarInterface != null) {
                        sidecarInterface.onWindowLayoutChangeListenerRemoved(iBinderA);
                    }
                    Map map = ((bzo) bzdVar).e;
                    afe afeVar2 = (afe) map.get(activity);
                    if (afeVar2 != null) {
                        if (activity instanceof abu) {
                            ((abu) activity).dn(afeVar2);
                        }
                        map.remove(activity);
                    }
                    bzm bzmVar = ((bzo) bzdVar).f;
                    if (bzmVar != null) {
                        ReentrantLock reentrantLock = bzmVar.a;
                        reentrantLock.lock();
                        try {
                            bzmVar.b.put(activity, null);
                            reentrantLock.unlock();
                        } finally {
                        }
                    }
                    Map map2 = ((bzo) bzdVar).d;
                    int size = map2.size();
                    map2.remove(iBinderA);
                    if (size == 1 && sidecarInterface != null) {
                        sidecarInterface.onDeviceStateListenersChanged(true);
                    }
                }
            }
        }
    }

    @Override // defpackage.bys
    public final void b(Context context, afe afeVar) {
        Object next;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            bzd bzdVar = this.d;
            if (bzdVar == null) {
                afeVar.accept(new byq(agrd.a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            boolean z = false;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (agvy.c(((bzr) it.next()).a, context)) {
                        z = true;
                        break;
                    }
                }
            }
            bzr bzrVar = new bzr((Activity) context, afeVar);
            copyOnWriteArrayList.add(bzrVar);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (agvy.c(context, ((bzr) next).a)) {
                            break;
                        }
                    }
                }
                bzr bzrVar2 = (bzr) next;
                byq byqVar = bzrVar2 != null ? bzrVar2.c : null;
                if (byqVar != null) {
                    bzrVar.a(byqVar);
                }
            } else {
                IBinder iBinderA = bzo.a.a((Activity) context);
                if (iBinderA != null) {
                    ((bzo) bzdVar).b(iBinderA, (Activity) context);
                } else {
                    ((Activity) context).getWindow().getDecorView().addOnAttachStateChangeListener(new bzn((bzo) bzdVar, (Activity) context));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
