package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bo extends ca {
    final /* synthetic */ bv a;

    public bo(bv bvVar) {
        this.a = bvVar;
    }

    @Override // defpackage.ca
    public final View a(int i) {
        bv bvVar = this.a;
        View view = bvVar.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(a.cj(bvVar, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.ca
    public final boolean b() {
        return this.a.mView != null;
    }
}
