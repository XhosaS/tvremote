package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgf implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AppMetadata c;
    final /* synthetic */ krc d;
    final /* synthetic */ lgp e;

    public lgf(lgp lgpVar, String str, String str2, AppMetadata appMetadata, krc krcVar) {
        this.a = str;
        this.b = str2;
        this.c = appMetadata;
        this.d = krcVar;
        this.e = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lbk lbkVar;
        lio lioVar;
        lgp lgpVar;
        kzj kzjVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                lgpVar = this.e;
                kzjVar = lgpVar.b;
            } catch (RemoteException e) {
                lbk lbkVar2 = this.e.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.c.d("Failed to get conditional properties; remote exception", this.a, this.b, e);
            }
            if (kzjVar == null) {
                lbkVar = lgpVar.y;
                lab labVar2 = lbkVar.f;
                lbkVar.o(labVar2);
                labVar2.c.c("Failed to get conditional properties; not connected to service", this.a, this.b);
                lioVar = lbkVar.i;
                lbkVar.m(lioVar);
                lioVar.P(this.d, arrayList);
            }
            arrayList = lio.G(kzjVar.i(this.a, this.b, this.c));
            lgpVar.o();
            lbkVar = this.e.y;
            lioVar = lbkVar.i;
            lbkVar.m(lioVar);
            lioVar.P(this.d, arrayList);
        } catch (Throwable th) {
            lbk lbkVar3 = this.e.y;
            lio lioVar2 = lbkVar3.i;
            lbkVar3.m(lioVar2);
            lioVar2.P(this.d, arrayList);
            throw th;
        }
    }
}
