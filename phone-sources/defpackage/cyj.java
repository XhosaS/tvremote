package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class cyj extends cyi {
    public cyj(Window window, cvw cvwVar) {
        super(window, cvwVar);
    }

    @Override // defpackage.cwp
    public final void d(boolean z) {
        if (!z) {
            v(8192);
            return;
        }
        w(67108864);
        x();
        u(8192);
    }

    @Override // defpackage.cwp
    public final boolean e() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
