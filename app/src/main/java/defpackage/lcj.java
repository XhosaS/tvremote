package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class lcj implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ lcl c;

    public lcj(lcl lclVar, AppMetadata appMetadata, Bundle bundle) {
        this.a = appMetadata;
        this.b = bundle;
        this.c = lclVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        lih lihVar = this.c.a;
        lihVar.t();
        return lihVar.s(this.a, this.b);
    }
}
