package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
class ajg extends ajj {
    final WindowInsetsController a;
    protected final Window b;

    public ajg(Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        new wx(0);
        this.a = insetsController;
        this.b = window;
    }

    protected final void a(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void b(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.ajj
    public final void d(boolean z) {
        if (z) {
            a(8192);
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            b(8192);
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.ajj
    public final void e(boolean z) {
        if (z) {
            a(16);
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            b(16);
            this.a.setSystemBarsAppearance(0, 16);
        }
    }
}
