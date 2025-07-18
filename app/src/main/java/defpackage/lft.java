package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
class lft implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lgp b;

    public lft(lgp lgpVar, AppMetadata appMetadata) {
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
            labVar.c.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AppMetadata appMetadata = this.a;
            ktx ktxVar = lgpVar.y.d;
            kzf kzfVar = kzg.bc;
            if (ktxVar.t(null, kzfVar)) {
                lgpVar.q(kzjVar, null, appMetadata);
            }
            kzjVar.n(appMetadata);
            lgpVar.y.f().m();
            ktxVar.t(null, kzfVar);
            lgpVar.q(kzjVar, null, appMetadata);
            lgpVar.o();
        } catch (RemoteException e) {
            lbk lbkVar2 = this.b.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Failed to send app launch to the service", e);
        }
    }
}
