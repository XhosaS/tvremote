package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pv {
    public int a;
    public int b;

    public final int a() {
        return this.a | this.b;
    }

    public final void b(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public final void c(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }

    public final void d(ja jaVar) {
        View view = jaVar.b;
        this.b = view.getLeft();
        this.a = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
