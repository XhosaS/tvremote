package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vnn extends vnx {
    private final xo a;

    public vnn(xo xoVar) {
        this.a = xoVar;
    }

    @Override // defpackage.vny
    public final void c(Bundle bundle) {
        try {
            this.a.d((Throwable) bundle.getSerializable("exception"));
        } catch (RuntimeException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.vny
    public final void d() {
        this.a.b(null);
    }
}
