package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConsentParcel;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class lce implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lcl b;

    public lce(lcl lclVar, AppMetadata appMetadata) {
        this.a = appMetadata;
        this.b = lclVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        lih lihVar = this.b.a;
        lihVar.t();
        return new ConsentParcel(lihVar.d(this.a.a));
    }
}
