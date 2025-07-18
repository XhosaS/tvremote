package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ax implements wy, abk, yc {
    public xc a = null;
    public awy b = null;
    private final q c;
    private final Runnable d;
    private final asv e;

    public ax(q qVar, asv asvVar, Runnable runnable) {
        this.c = qVar;
        this.e = asvVar;
        this.d = runnable;
    }

    @Override // defpackage.abk
    public final adx J() {
        b();
        return (adx) this.b.a;
    }

    @Override // defpackage.yc
    public final asv K() {
        b();
        return this.e;
    }

    final void a(xa xaVar) {
        this.a.b(xaVar);
    }

    final void b() {
        if (this.a == null) {
            this.a = new xc(this);
            awy awyVarG = wz.g(this);
            this.b = awyVarG;
            awyVarG.j();
            this.d.run();
        }
    }

    @Override // defpackage.xf
    public final xc m() {
        b();
        return this.a;
    }

    @Override // defpackage.wy
    public final yf n() {
        Application application;
        q qVar = this.c;
        Context applicationContext = qVar.g().getApplicationContext();
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
        yf yfVar = new yf((byte[]) null);
        if (application != null) {
            yfVar.a(xy.a, application);
        }
        yfVar.a(xu.a, qVar);
        yfVar.a(xu.b, this);
        Bundle bundle = qVar.h;
        if (bundle != null) {
            yfVar.a(xu.c, bundle);
        }
        return yfVar;
    }
}
