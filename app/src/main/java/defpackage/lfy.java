package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfy implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ krc c;
    final /* synthetic */ lgp d;

    public lfy(lgp lgpVar, EventParcel eventParcel, String str, krc krcVar) {
        this.a = eventParcel;
        this.b = str;
        this.c = krcVar;
        this.d = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lbk lbkVar;
        lio lioVar;
        lgp lgpVar;
        kzj kzjVar;
        byte[] bArrC = null;
        try {
            try {
                lgpVar = this.d;
                kzjVar = lgpVar.b;
            } catch (RemoteException e) {
                lbk lbkVar2 = this.d.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.c.b("Failed to send event to the service to bundle", e);
            }
            if (kzjVar != null) {
                bArrC = kzjVar.C(this.a, this.b);
                lgpVar.o();
                lbkVar = this.d.y;
                lioVar = lbkVar.i;
                lbkVar.m(lioVar);
                lioVar.R(this.c, bArrC);
            }
            lbkVar = lgpVar.y;
            lab labVar2 = lbkVar.f;
            lbkVar.o(labVar2);
            labVar2.c.a("Discarding data. Failed to send event to service to bundle");
            lioVar = lbkVar.i;
            lbkVar.m(lioVar);
            lioVar.R(this.c, bArrC);
        } catch (Throwable th) {
            lbk lbkVar3 = this.d.y;
            lio lioVar2 = lbkVar3.i;
            lbkVar3.m(lioVar2);
            lioVar2.R(this.c, null);
            throw th;
        }
    }
}
