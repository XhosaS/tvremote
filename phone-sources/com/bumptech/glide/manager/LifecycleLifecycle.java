package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.dvc;
import defpackage.dvd;
import defpackage.dve;
import defpackage.dvj;
import defpackage.dvk;
import defpackage.huc;
import defpackage.hud;
import defpackage.hwp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements huc, dvj {
    private final Set a = new HashSet();
    private final dve b;

    public LifecycleLifecycle(dve dveVar) {
        this.b = dveVar;
        dveVar.c(this);
    }

    @Override // defpackage.huc
    public final void a(hud hudVar) {
        this.a.add(hudVar);
        dve dveVar = this.b;
        if (dveVar.a() == dvd.a) {
            hudVar.k();
        } else if (dveVar.a().a(dvd.d)) {
            hudVar.l();
        } else {
            hudVar.m();
        }
    }

    @Override // defpackage.huc
    public final void b(hud hudVar) {
        this.a.remove(hudVar);
    }

    @OnLifecycleEvent(a = dvc.ON_DESTROY)
    public void onDestroy(dvk dvkVar) {
        Iterator it = hwp.f(this.a).iterator();
        while (it.hasNext()) {
            ((hud) it.next()).k();
        }
        dvkVar.getLifecycle().d(this);
    }

    @OnLifecycleEvent(a = dvc.ON_START)
    public void onStart(dvk dvkVar) {
        Iterator it = hwp.f(this.a).iterator();
        while (it.hasNext()) {
            ((hud) it.next()).l();
        }
    }

    @OnLifecycleEvent(a = dvc.ON_STOP)
    public void onStop(dvk dvkVar) {
        Iterator it = hwp.f(this.a).iterator();
        while (it.hasNext()) {
            ((hud) it.next()).m();
        }
    }
}
