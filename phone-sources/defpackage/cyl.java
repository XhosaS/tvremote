package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
class cyl extends cwp {
    final WindowInsetsController a;
    protected final Window b;

    public cyl(Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        new ko();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.cwp
    public final void c(boolean z) {
        if (z) {
            if (this.b != null) {
                u(16);
            }
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            if (this.b != null) {
                v(16);
            }
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.cwp
    public final void d(boolean z) {
        if (z) {
            if (this.b != null) {
                u(8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            if (this.b != null) {
                v(8192);
            }
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.cwp
    public boolean e() {
        WindowInsetsController windowInsetsController = this.a;
        windowInsetsController.setSystemBarsAppearance(0, 0);
        return (windowInsetsController.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.cwp
    public void f() {
        Window window = this.b;
        if (window == null) {
            this.a.setSystemBarsBehavior(1);
            return;
        }
        window.getDecorView().setTag(356039078, 1);
        v(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        u(RecyclerView.ItemAnimator.FLAG_MOVED);
    }

    @Override // defpackage.cwp
    public final void g() {
        this.a.hide(519);
    }

    protected final void u(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void v(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
