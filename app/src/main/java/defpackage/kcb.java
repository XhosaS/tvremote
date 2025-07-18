package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class kcb extends kcc {
    public kcb(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.kcc
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new kcd("Invalid response to one way request", null));
        }
    }

    @Override // defpackage.kcc
    public final boolean b() {
        return true;
    }
}
