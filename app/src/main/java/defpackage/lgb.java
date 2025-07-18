package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgb implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lgp b;

    public lgb(lgp lgpVar, AppMetadata appMetadata) {
        this.a = appMetadata;
        this.b = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVar = this.b;
        kzj kzjVar = lgpVar.b;
        if (kzjVar == null) {
            lbk lbkVar = lgpVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Failed to send consent settings to service");
            return;
        }
        try {
            kzjVar.u(this.a);
            lgpVar.o();
        } catch (RemoteException e) {
            lbk lbkVar2 = this.b.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Failed to send consent settings to the service", e);
        }
    }
}
