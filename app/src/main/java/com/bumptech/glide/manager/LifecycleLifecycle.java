package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.bce;
import defpackage.bcf;
import defpackage.bcg;
import defpackage.bck;
import defpackage.bcl;
import defpackage.dnd;
import defpackage.dne;
import defpackage.dqm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements dnd, bck {
    private final Set a = new HashSet();
    private final bcg b;

    public LifecycleLifecycle(bcg bcgVar) {
        this.b = bcgVar;
        bcgVar.b(this);
    }

    @Override // defpackage.dnd
    public final void a(dne dneVar) {
        this.a.add(dneVar);
        bcg bcgVar = this.b;
        if (bcgVar.a() == bcf.a) {
            dneVar.l();
        } else if (bcgVar.a().a(bcf.d)) {
            dneVar.m();
        } else {
            dneVar.n();
        }
    }

    @Override // defpackage.dnd
    public final void b(dne dneVar) {
        this.a.remove(dneVar);
    }

    @OnLifecycleEvent(a = bce.ON_DESTROY)
    public void onDestroy(bcl bclVar) {
        Iterator it = dqm.e(this.a).iterator();
        while (it.hasNext()) {
            ((dne) it.next()).l();
        }
        bclVar.ek().c(this);
    }

    @OnLifecycleEvent(a = bce.ON_START)
    public void onStart(bcl bclVar) {
        Iterator it = dqm.e(this.a).iterator();
        while (it.hasNext()) {
            ((dne) it.next()).m();
        }
    }

    @OnLifecycleEvent(a = bce.ON_STOP)
    public void onStop(bcl bclVar) {
        Iterator it = dqm.e(this.a).iterator();
        while (it.hasNext()) {
            ((dne) it.next()).n();
        }
    }
}
