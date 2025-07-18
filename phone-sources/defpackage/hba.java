package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hba implements ComponentCallbacks2 {
    public final WeakReference a;
    public volatile boolean b;
    private final Context c;
    private final gzj d;
    private final AtomicBoolean e;

    public hba(riv rivVar, Context context) {
        gzj gzhVar;
        this.c = context;
        this.a = new WeakReference(rivVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || czi.b(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            gzhVar = new gzh();
        } else {
            try {
                gzhVar = new gzl(connectivityManager, this);
            } catch (Exception unused) {
                gzhVar = new gzh();
            }
        }
        this.d = gzhVar;
        this.b = gzhVar.b();
        this.e = new AtomicBoolean(false);
        this.c.registerComponentCallbacks(this);
    }

    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.c.unregisterComponentCallbacks(this);
        this.d.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        if (((riv) this.a.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yft] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gzf, java.lang.Object] */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        riv rivVar = (riv) this.a.get();
        if (rivVar == null) {
            a();
            return;
        }
        fse fseVar = (fse) rivVar.c.a();
        if (fseVar != null) {
            fseVar.b.c(i);
            ((nue) fseVar.a).k(i);
        }
    }
}
