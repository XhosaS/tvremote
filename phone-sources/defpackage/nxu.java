package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nxu extends nzo implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    public final AtomicReference b;
    public final Handler c;
    public final nvj d;

    public nxu(nzp nzpVar, nvj nvjVar) {
        super(nzpVar);
        this.b = new AtomicReference(null);
        this.c = new ogh(Looper.getMainLooper());
        this.d = nvjVar;
    }

    private static final int m(zuw zuwVar) {
        if (zuwVar == null) {
            return -1;
        }
        return zuwVar.a;
    }

    public final void a(nve nveVar, int i) {
        this.b.set(null);
        e(nveVar, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.nzo
    public final void c(int i, int i2, Intent intent) {
        zuw zuwVar = (zuw) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int iG = this.d.g(k());
                if (iG == 0) {
                    b();
                    return;
                } else {
                    if (zuwVar == null) {
                        return;
                    }
                    if (((nve) zuwVar.b).c == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (zuwVar != null) {
                a(new nve(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, ((nve) zuwVar.b).toString()), m(zuwVar));
                return;
            }
            return;
        }
        if (zuwVar != null) {
            a((nve) zuwVar.b, zuwVar.a);
        }
    }

    @Override // defpackage.nzo
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new zuw(new nve(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(nve nveVar, int i);

    protected abstract void f();

    @Override // defpackage.nzo
    public final void g(Bundle bundle) {
        zuw zuwVar = (zuw) this.b.get();
        if (zuwVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zuwVar.a);
        nve nveVar = (nve) zuwVar.b;
        bundle.putInt("failed_status", nveVar.c);
        bundle.putParcelable("failed_resolution", nveVar.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new nve(13, null), m((zuw) this.b.get()));
    }
}
