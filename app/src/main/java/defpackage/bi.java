package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class bi extends bp {
    final /* synthetic */ bq a;

    public bi(bq bqVar) {
        this.a = bqVar;
    }

    @Override // defpackage.bp
    public final void a() {
        bq bqVar = this.a;
        bqVar.ae.b.b();
        bds.c(bqVar);
        Bundle bundle = bqVar.i;
        bqVar.ae.b.c(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
