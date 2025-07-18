package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class cyi extends cwp {
    protected final Window a;
    private final cvw b;

    public cyi(Window window, cvw cvwVar) {
        this.a = window;
        this.b = cvwVar;
    }

    @Override // defpackage.cwp
    public final void f() {
        this.a.getDecorView().setTag(356039078, 1);
        v(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        u(RecyclerView.ItemAnimator.FLAG_MOVED);
    }

    @Override // defpackage.cwp
    public final void g() {
        for (int i = 1; i <= 512; i += i) {
            if ((i & 519) != 0) {
                if (i == 1) {
                    u(4);
                } else if (i == 2) {
                    u(2);
                } else if (i == 8) {
                    this.b.c();
                }
            }
        }
    }

    protected final void u(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void v(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    protected final void w(int i) {
        this.a.clearFlags(i);
    }

    protected final void x() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
