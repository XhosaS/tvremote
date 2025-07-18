package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfp implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ boolean b;
    final /* synthetic */ UserAttributeParcel c;
    final /* synthetic */ lgp d;

    public lfp(lgp lgpVar, AppMetadata appMetadata, boolean z, UserAttributeParcel userAttributeParcel) {
        this.a = appMetadata;
        this.b = z;
        this.c = userAttributeParcel;
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
            labVar.c.a("Discarding data. Failed to set user property");
        }
    }
}
