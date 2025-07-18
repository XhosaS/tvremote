package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class kce extends kcc {
    public kce(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.kcc
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.kcc
    public final boolean b() {
        return false;
    }
}
