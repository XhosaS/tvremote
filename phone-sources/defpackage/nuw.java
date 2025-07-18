package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nuw extends nuu {
    public nuw(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.nuu
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.nuu
    public final boolean b() {
        return false;
    }
}
