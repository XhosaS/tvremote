package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
class lbs implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lcl b;

    public lbs(lcl lclVar, AppMetadata appMetadata) {
        this.a = appMetadata;
        this.b = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        lih lihVar = this.b.a;
        lihVar.t();
        lihVar.K(this.a);
    }
}
