package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nzo {
    public final nzp f;

    protected nzo(nzp nzpVar) {
        this.f = nzpVar;
    }

    public static nzp l(Activity activity) {
        nzq nzqVar;
        oad oadVar;
        if (!(activity instanceof by)) {
            WeakReference weakReference = (WeakReference) nzq.a.get(activity);
            if (weakReference != null && (nzqVar = (nzq) weakReference.get()) != null) {
                return nzqVar;
            }
            try {
                nzq nzqVar2 = (nzq) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (nzqVar2 == null || nzqVar2.isRemoving()) {
                    nzqVar2 = new nzq();
                    activity.getFragmentManager().beginTransaction().add(nzqVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                nzq.a.put(activity, new WeakReference(nzqVar2));
                return nzqVar2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        by byVar = (by) activity;
        WeakHashMap weakHashMap = oad.a;
        cr supportFragmentManager = byVar.getSupportFragmentManager();
        WeakReference weakReference2 = (WeakReference) oad.a.get(byVar);
        if (weakReference2 != null && (oadVar = (oad) weakReference2.get()) != null) {
            return oadVar;
        }
        try {
            oad oadVar2 = (oad) supportFragmentManager.f("SLifecycleFragmentImpl");
            if (oadVar2 == null || oadVar2.isRemoving()) {
                oadVar2 = new oad();
                at atVar = new at(supportFragmentManager);
                atVar.r(oadVar2, "SLifecycleFragmentImpl");
                atVar.l();
            }
            oad.a.put(byVar, new WeakReference(oadVar2));
            return oadVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public final Activity k() {
        Activity activityA = this.f.a();
        ocv.aF(activityA);
        return activityA;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void d(Bundle bundle) {
    }

    public void g(Bundle bundle) {
    }

    public void c(int i, int i2, Intent intent) {
    }
}
