package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class kgs implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ kgt b;

    public kgs(kgt kgtVar, ConnectionResult connectionResult) {
        this.a = connectionResult;
        this.b = kgtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kgt kgtVar = this.b;
        kgq kgqVar = (kgq) kgtVar.e.l.get(kgtVar.b);
        if (kgqVar == null) {
            return;
        }
        if (!this.a.c()) {
            kgqVar.j(this.a, null);
            return;
        }
        kgtVar.d = true;
        keg kegVar = kgtVar.a;
        if (kegVar.o()) {
            kgtVar.c();
            return;
        }
        try {
            kegVar.s(null, kegVar.j());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.b.a.l("Failed to get service from broker.");
            kgqVar.j(new ConnectionResult(1, 10, null, null), null);
        }
    }
}
