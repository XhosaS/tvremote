package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nut extends nuu {
    public nut(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.nuu
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new nuv("Invalid response to one way request"));
        }
    }

    @Override // defpackage.nuu
    public final boolean b() {
        return true;
    }
}
