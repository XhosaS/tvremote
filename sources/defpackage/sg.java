package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class sg extends qp {
    protected final Window a;

    public sg(Window window) {
        this.a = window;
    }

    protected final void w(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void x(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    protected final void y(int i) {
        this.a.clearFlags(i);
    }

    protected final void z() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
