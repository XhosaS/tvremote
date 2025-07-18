package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dh implements duz, ghe, dxd {
    public dvl a = null;
    public ghd b = null;
    private final bv c;
    private final dxc d;
    private final Runnable e;
    private dwx f;

    public dh(bv bvVar, dxc dxcVar, Runnable runnable) {
        this.c = bvVar;
        this.d = dxcVar;
        this.e = runnable;
    }

    final void a(dvc dvcVar) {
        this.a.e(dvcVar);
    }

    final void b() {
        if (this.a == null) {
            this.a = new dvl(this);
            ghd ghdVarY = gez.y(this);
            this.b = ghdVarY;
            ghdVarY.a();
            this.e.run();
        }
    }

    @Override // defpackage.duz
    public final dxj getDefaultViewModelCreationExtras() {
        Application application;
        bv bvVar = this.c;
        Context applicationContext = bvVar.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        dxl dxlVar = new dxl();
        if (application != null) {
            dxlVar.b(dww.b, application);
        }
        dxlVar.b(dwn.a, bvVar);
        dxlVar.b(dwn.b, this);
        if (bvVar.getArguments() != null) {
            dxlVar.b(dwn.c, bvVar.getArguments());
        }
        return dxlVar;
    }

    @Override // defpackage.duz
    public final dwx getDefaultViewModelProviderFactory() {
        Application application;
        bv bvVar = this.c;
        dwx defaultViewModelProviderFactory = bvVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(bvVar.mDefaultFactory)) {
            this.f = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f == null) {
            Context applicationContext = bvVar.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f = new dwq(application, bvVar, bvVar.getArguments());
        }
        return this.f;
    }

    @Override // defpackage.dvk
    public final dve getLifecycle() {
        b();
        return this.a;
    }

    @Override // defpackage.ghe
    public final ghc getSavedStateRegistry() {
        b();
        return (ghc) this.b.b;
    }

    @Override // defpackage.dxd
    public final dxc getViewModelStore() {
        b();
        return this.d;
    }
}
