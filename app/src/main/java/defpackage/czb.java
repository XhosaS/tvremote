package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czb implements ComponentCallbacks2, dne {
    private static final dor e;
    protected final cyg a;
    protected final Context b;
    final dnd c;
    public final CopyOnWriteArrayList d;
    private final dnn f;
    private final dnm g;
    private final dnu h;
    private final Runnable i;
    private final dmu j;
    private dor k;

    static {
        dor dorVarA = dor.a(Bitmap.class);
        dorVarA.L();
        e = dorVarA;
        dor.a(dlz.class).L();
    }

    public czb(cyg cygVar, dnd dndVar, dnm dnmVar, Context context) {
        dnn dnnVar = new dnn();
        dmw dmwVar = cygVar.f;
        this.h = new dnu();
        cyy cyyVar = new cyy(this);
        this.i = cyyVar;
        this.a = cygVar;
        this.c = dndVar;
        this.g = dnmVar;
        this.f = dnnVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        cza czaVar = new cza(this, dnnVar);
        int iA = abs.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", iA == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        dmu dmvVar = iA == 0 ? new dmv(applicationContext, czaVar) : new dni();
        this.j = dmvVar;
        synchronized (cygVar.e) {
            if (cygVar.e.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cygVar.e.add(this);
        }
        if (dqm.h()) {
            dqm.d().post(cyyVar);
        } else {
            dndVar.a(this);
        }
        dndVar.a(dmvVar);
        this.d = new CopyOnWriteArrayList(cygVar.c.c);
        r(cygVar.c.b());
    }

    private final synchronized void w() {
        Set set = this.h.a;
        Iterator it = dqm.e(set).iterator();
        while (it.hasNext()) {
            k((dpf) it.next());
        }
        set.clear();
    }

    public cyx a(Class cls) {
        return new cyx(this.a, this, cls, this.b);
    }

    public cyx b() {
        return a(Bitmap.class).n(e);
    }

    public cyx c() {
        return a(Drawable.class);
    }

    public cyx d(Bitmap bitmap) {
        return c().e(bitmap);
    }

    public cyx e(Drawable drawable) {
        return c().f(drawable);
    }

    public cyx f(Uri uri) {
        return c().g(uri);
    }

    public cyx g(Integer num) {
        return c().h(num);
    }

    public cyx h(byte[] bArr) {
        return c().j(bArr);
    }

    final synchronized dor i() {
        return this.k;
    }

    public final void j(View view) {
        t(new cyz(view));
    }

    public final void k(dpf dpfVar) {
        if (dpfVar == null) {
            return;
        }
        t(dpfVar);
    }

    @Override // defpackage.dne
    public final synchronized void l() {
        this.h.l();
        w();
        dnn dnnVar = this.f;
        Iterator it = dqm.e(dnnVar.a).iterator();
        while (it.hasNext()) {
            dnnVar.a((don) it.next());
        }
        dnnVar.b.clear();
        dnd dndVar = this.c;
        dndVar.b(this);
        dndVar.b(this.j);
        dqm.d().removeCallbacks(this.i);
        List list = this.a.e;
        synchronized (list) {
            if (!list.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(this);
        }
    }

    @Override // defpackage.dne
    public final synchronized void m() {
        q();
        this.h.m();
    }

    @Override // defpackage.dne
    public final synchronized void n() {
        this.h.n();
        p();
    }

    public final synchronized void o() {
        dnn dnnVar = this.f;
        dnnVar.c = true;
        for (don donVar : dqm.e(dnnVar.a)) {
            if (donVar.n() || donVar.l()) {
                donVar.c();
                dnnVar.b.add(donVar);
            }
        }
    }

    public final synchronized void p() {
        dnn dnnVar = this.f;
        dnnVar.c = true;
        for (don donVar : dqm.e(dnnVar.a)) {
            if (donVar.n()) {
                donVar.f();
                dnnVar.b.add(donVar);
            }
        }
    }

    public final synchronized void q() {
        dnn dnnVar = this.f;
        dnnVar.c = false;
        for (don donVar : dqm.e(dnnVar.a)) {
            if (!donVar.l() && !donVar.n()) {
                donVar.b();
            }
        }
        dnnVar.b.clear();
    }

    protected synchronized void r(dor dorVar) {
        this.k = (dor) ((dor) dorVar.o()).q();
    }

    final synchronized void s(dpf dpfVar, don donVar) {
        this.h.a.add(dpfVar);
        dnn dnnVar = this.f;
        dnnVar.a.add(donVar);
        if (!dnnVar.c) {
            donVar.b();
            return;
        }
        donVar.c();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        dnnVar.b.add(donVar);
    }

    public final void t(dpf dpfVar) {
        boolean zU = u(dpfVar);
        don donVarD = dpfVar.d();
        if (zU) {
            return;
        }
        List list = this.a.e;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((czb) it.next()).u(dpfVar)) {
                    return;
                }
            }
            if (donVarD != null) {
                dpfVar.f(null);
                donVarD.c();
            }
        }
    }

    public final synchronized String toString() {
        dnm dnmVar;
        dnn dnnVar;
        dnmVar = this.g;
        dnnVar = this.f;
        return super.toString() + "{tracker=" + String.valueOf(dnnVar) + ", treeNode=" + String.valueOf(dnmVar) + "}";
    }

    final synchronized boolean u(dpf dpfVar) {
        don donVarD = dpfVar.d();
        if (donVarD == null) {
            return true;
        }
        if (!this.f.a(donVarD)) {
            return false;
        }
        this.h.a.remove(dpfVar);
        dpfVar.f(null);
        return true;
    }

    public cyx v() {
        return c().i(null);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
