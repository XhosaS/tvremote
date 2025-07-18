package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class dz implements bbz, bqs, bem {
    public bco a = null;
    public bqr b = null;
    private final bq c;
    private final bel d;
    private final Runnable e;

    public dz(bq bqVar, bel belVar, Runnable runnable) {
        this.c = bqVar;
        this.d = belVar;
        this.e = runnable;
    }

    final void a() {
        if (this.a == null) {
            this.a = new bco(this);
            bqr bqrVarA = bqr.a.a(this);
            this.b = bqrVarA;
            bqrVarA.b.b();
            ((bg) this.e).a.T();
        }
    }

    @Override // defpackage.bbz
    public final beg dM() {
        throw null;
    }

    @Override // defpackage.bcl
    public final bcg ek() {
        a();
        return this.a;
    }

    @Override // defpackage.bem
    public final bel el() {
        a();
        return this.d;
    }

    @Override // defpackage.bbz
    public final bet em() {
        Application application;
        bq bqVar = this.c;
        Context applicationContext = bqVar.dZ().getApplicationContext();
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
        beu beuVar = new beu(ber.a);
        if (application != null) {
            beuVar.b(bee.b, application);
        }
        beuVar.b(bds.a, bqVar);
        beuVar.b(bds.b, this);
        Bundle bundle = bqVar.n;
        if (bundle != null) {
            beuVar.b(bds.c, bundle);
        }
        return beuVar;
    }

    @Override // defpackage.bqs
    public final bqo en() {
        a();
        return this.b.c;
    }
}
