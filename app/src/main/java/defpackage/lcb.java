package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
class lcb implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lcl b;

    public lcb(lcl lclVar, AppMetadata appMetadata) {
        this.a = appMetadata;
        this.b = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.b.a;
        lihVar.t();
        lihVar.aC().g();
        lihVar.v();
        AppMetadata appMetadata = this.a;
        kkk.h(appMetadata.a);
        lihVar.f(appMetadata);
    }
}
