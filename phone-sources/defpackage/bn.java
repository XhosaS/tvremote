package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bn extends bt {
    final /* synthetic */ bv a;

    public bn(bv bvVar) {
        this.a = bvVar;
    }

    @Override // defpackage.bt
    public final void a() {
        bv bvVar = this.a;
        bvVar.mSavedStateRegistryController.a();
        dwn.c(bvVar);
        Bundle bundle = bvVar.mSavedFragmentState;
        bvVar.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
