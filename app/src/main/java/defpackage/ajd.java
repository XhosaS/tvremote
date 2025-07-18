package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class ajd extends ajj {
    protected final Window a;

    public ajd(Window window) {
        this.a = window;
    }

    protected final void a(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void b(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    protected final void c() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
