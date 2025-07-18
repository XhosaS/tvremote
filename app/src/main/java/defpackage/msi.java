package defpackage;

import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msi {
    public int a = -1;
    public int b = Integer.MIN_VALUE;
    public boolean c = false;
    public boolean d = false;
    public final /* synthetic */ FlowLayoutManager e;

    public msi(FlowLayoutManager flowLayoutManager) {
        this.e = flowLayoutManager;
    }

    public final void a() {
        this.b = this.c ? this.e.b.f() : this.e.b.j();
    }

    public final void b(View view) {
        if (this.c) {
            FlowLayoutManager flowLayoutManager = this.e;
            this.b = flowLayoutManager.b.a(view) + flowLayoutManager.b.o();
        } else {
            this.b = this.e.b.d(view);
        }
        this.a = this.e.aD(view);
    }

    public final void c() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + "}";
    }
}
