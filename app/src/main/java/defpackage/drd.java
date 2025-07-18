package defpackage;

import android.graphics.PathEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drd {
    public dxl b;
    private final PathEffect[] c = new PathEffect[2];
    public final dre a = new dre();

    public drd(dru druVar) {
        this.b = druVar.e;
    }

    public final dre a() {
        b();
        this.b = null;
        return this.a;
    }

    public final void b() {
        if (this.b == null) {
            throw new IllegalStateException("This builder has already been disposed / built!");
        }
    }

    public final void c(int i, float f) {
        b();
        int iA = this.b.a(f);
        b();
        this.a.a[i] = iA;
    }

    public final void d(int i) {
        b();
        dre.c(this.a.c, 9, i);
    }

    public final void e(int i) {
        b();
        if (i >= 0) {
            dre.c(this.a.b, 9, i);
            return;
        }
        throw new IllegalArgumentException("Given negative border width value: " + i + " for edge " + enz.a(9));
    }
}
