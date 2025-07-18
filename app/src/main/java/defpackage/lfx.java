package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfx implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ EventParams c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ lgp e;

    public lfx(lgp lgpVar, AppMetadata appMetadata, boolean z, EventParams eventParams, Bundle bundle) {
        this.a = appMetadata;
        this.b = z;
        this.c = eventParams;
        this.d = bundle;
        this.e = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVar = this.e;
        kzj kzjVar = lgpVar.b;
        if (kzjVar == null) {
            lbk lbkVar = lgpVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Failed to send default event parameters to service");
            return;
        }
        if (lgpVar.y.d.t(null, kzg.bc)) {
            this.e.q(kzjVar, this.b ? null : this.c, this.a);
            return;
        }
        try {
            kzjVar.w(this.d, this.a);
            lgpVar.o();
        } catch (RemoteException e) {
            lbk lbkVar2 = this.e.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Failed to send default event parameters to service", e);
        }
    }
}
