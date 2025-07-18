package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgc implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ EventParcel c;
    final /* synthetic */ lgp d;

    public lgc(lgp lgpVar, AppMetadata appMetadata, boolean z, EventParcel eventParcel) {
        this.a = appMetadata;
        this.b = z;
        this.c = eventParcel;
        this.d = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVar = this.d;
        kzj kzjVar = lgpVar.b;
        if (kzjVar != null) {
            lgpVar.q(kzjVar, this.b ? null : this.c, this.a);
            lgpVar.o();
        } else {
            lbk lbkVar = lgpVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Discarding data. Failed to send event to service");
        }
    }
}
