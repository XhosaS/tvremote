package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kfz extends kha implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final kcx d;

    public kfz(khb khbVar, kcx kcxVar) {
        super(khbVar);
        this.b = new AtomicReference(null);
        this.c = new kos(Looper.getMainLooper());
        this.d = kcxVar;
    }

    private final int l(kfw kfwVar) {
        if (kfwVar == null) {
            return -1;
        }
        return kfwVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        e(connectionResult, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.kha
    public final void c(int i, int i2, Intent intent) throws PackageManager.NameNotFoundException {
        kfw kfwVar = (kfw) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int iG = this.d.g(k(), kcy.c);
                if (iG == 0) {
                    b();
                    return;
                } else {
                    if (kfwVar == null) {
                        return;
                    }
                    if (kfwVar.b.c == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            b();
            return;
        } else if (i2 == 0) {
            if (kfwVar != null) {
                a(new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, kfwVar.b.toString()), l(kfwVar));
                return;
            }
            return;
        }
        if (kfwVar != null) {
            a(kfwVar.b, kfwVar.a);
        }
    }

    @Override // defpackage.kha
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new kfw(new ConnectionResult(1, bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void e(ConnectionResult connectionResult, int i);

    protected abstract void f();

    @Override // defpackage.kha
    public final void g(Bundle bundle) {
        kfw kfwVar = (kfw) this.b.get();
        if (kfwVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", kfwVar.a);
        ConnectionResult connectionResult = kfwVar.b;
        bundle.putInt("failed_status", connectionResult.c);
        bundle.putParcelable("failed_resolution", connectionResult.d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(1, 13, null, null), l((kfw) this.b.get()));
    }
}
