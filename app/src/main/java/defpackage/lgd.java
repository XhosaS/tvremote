package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgd implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ConditionalUserPropertyParcel c;
    final /* synthetic */ lgp d;

    public lgd(lgp lgpVar, AppMetadata appMetadata, boolean z, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.a = appMetadata;
        this.b = z;
        this.c = conditionalUserPropertyParcel;
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
            labVar.c.a("Discarding data. Failed to send conditional user property to service");
        }
    }
}
