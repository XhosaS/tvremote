package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkg implements ComponentCallbacks2, hud {
    private static final hvc e;
    protected final hjr a;
    protected final Context b;
    public final huc c;
    public final CopyOnWriteArrayList d;
    private final huj f;
    private final hui g;
    private final hup h;
    private final Runnable i;
    private final htw j;
    private hvc k;

    static {
        hvc hvcVarB = hvc.b(Bitmap.class);
        hvcVarB.I();
        e = hvcVarB;
        hvc.b(hti.class).I();
    }

    public hkg(hjr hjrVar, huc hucVar, hui huiVar, Context context) {
        huj hujVar = new huj();
        hur hurVar = hjrVar.e;
        this.h = new hup();
        gfe gfeVar = new gfe(this, 13, null);
        this.i = gfeVar;
        this.a = hjrVar;
        this.c = hucVar;
        this.g = huiVar;
        this.f = hujVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        htw htxVar = czi.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new htx(applicationContext, new hkf(this, hujVar)) : new hug();
        this.j = htxVar;
        synchronized (hjrVar.c) {
            if (hjrVar.c.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            hjrVar.c.add(this);
        }
        if (hwp.i()) {
            hwp.h(gfeVar);
        } else {
            hucVar.a(this);
        }
        hucVar.a(htxVar);
        this.d = new CopyOnWriteArrayList(hjrVar.b.b);
        p(hjrVar.b.a());
    }

    private final synchronized void s() {
        Set set = this.h.a;
        Iterator it = hwp.f(set).iterator();
        while (it.hasNext()) {
            j((hvm) it.next());
        }
        set.clear();
    }

    public final hke a(Class cls) {
        return new hke(this.a, this, cls, this.b);
    }

    public final hke b() {
        return a(Bitmap.class).h(e);
    }

    public final hke c() {
        return a(Drawable.class);
    }

    public final hke d() {
        hke hkeVarA = a(File.class);
        if (hvc.r == null) {
            hvc hvcVar = (hvc) new hvc().K();
            hvcVar.L();
            hvc.r = hvcVar;
        }
        return hkeVarA.h(hvc.r);
    }

    public final hke e(Uri uri) {
        return c().e(uri);
    }

    public final hke f(Object obj) {
        return c().f(obj);
    }

    public final hke g(String str) {
        return c().f(str);
    }

    final synchronized hvc h() {
        return this.k;
    }

    public final void i(View view) {
        j(new hvj(view));
    }

    public final void j(hvm hvmVar) {
        if (hvmVar == null) {
            return;
        }
        boolean zR = r(hvmVar);
        hux huxVarC = hvmVar.c();
        if (zR) {
            return;
        }
        List list = this.a.c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((hkg) it.next()).r(hvmVar)) {
                    return;
                }
            }
            if (huxVarC != null) {
                hvmVar.f(null);
                huxVarC.c();
            }
        }
    }

    @Override // defpackage.hud
    public final synchronized void k() {
        this.h.k();
        s();
        huj hujVar = this.f;
        Iterator it = hwp.f(hujVar.a).iterator();
        while (it.hasNext()) {
            hujVar.a((hux) it.next());
        }
        hujVar.b.clear();
        huc hucVar = this.c;
        hucVar.b(this);
        hucVar.b(this.j);
        hwp.e().removeCallbacks(this.i);
        List list = this.a.c;
        synchronized (list) {
            if (!list.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(this);
        }
    }

    @Override // defpackage.hud
    public final synchronized void l() {
        o();
        this.h.l();
    }

    @Override // defpackage.hud
    public final synchronized void m() {
        this.h.m();
        n();
    }

    public final synchronized void n() {
        huj hujVar = this.f;
        hujVar.c = true;
        for (hux huxVar : hwp.f(hujVar.a)) {
            if (huxVar.n()) {
                huxVar.f();
                hujVar.b.add(huxVar);
            }
        }
    }

    public final synchronized void o() {
        huj hujVar = this.f;
        hujVar.c = false;
        for (hux huxVar : hwp.f(hujVar.a)) {
            if (!huxVar.l() && !huxVar.n()) {
                huxVar.b();
            }
        }
        hujVar.b.clear();
    }

    protected final synchronized void p(hvc hvcVar) {
        hvc hvcVar2 = (hvc) hvcVar.i();
        hvcVar2.L();
        this.k = hvcVar2;
    }

    final synchronized void q(hvm hvmVar, hux huxVar) {
        this.h.a.add(hvmVar);
        huj hujVar = this.f;
        hujVar.a.add(huxVar);
        if (!hujVar.c) {
            huxVar.b();
        } else {
            huxVar.c();
            hujVar.b.add(huxVar);
        }
    }

    final synchronized boolean r(hvm hvmVar) {
        hux huxVarC = hvmVar.c();
        if (huxVarC == null) {
            return true;
        }
        if (!this.f.a(huxVarC)) {
            return false;
        }
        this.h.a.remove(hvmVar);
        hvmVar.f(null);
        return true;
    }

    public final synchronized String toString() {
        hui huiVar;
        huj hujVar;
        huiVar = this.g;
        hujVar = this.f;
        return super.toString() + "{tracker=" + String.valueOf(hujVar) + ", treeNode=" + String.valueOf(huiVar) + "}";
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
