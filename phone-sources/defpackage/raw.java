package defpackage;

import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raw implements czy {
    private boolean a;
    private final xzg b;

    public raw(xzg xzgVar) {
        this.b = xzgVar;
    }

    @Override // defpackage.czy
    public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        nestedScrollView.getClass();
        boolean z = i2 > 0;
        if (this.a != z) {
            this.a = z;
            this.b.f(new voz(z));
        }
    }
}
