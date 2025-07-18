package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sj extends qp {
    final WindowInsetsController a;
    protected final Window b;

    public sj(Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        new mi();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.qp
    public final void g(boolean z) {
        if (z) {
            w(16);
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            x(16);
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.qp
    public final void h(boolean z) {
        if (z) {
            w(8192);
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            x(8192);
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    protected final void w(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void x(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
