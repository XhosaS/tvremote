package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuu implements View.OnLayoutChangeListener {
    public float a = 0.5f;
    public float b = 0.5f;
    public boolean c = true;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f;
        float f2;
        float f3;
        yqw.M(true, "Cannot use padding and fraction at the same time.");
        if (view.getLayoutDirection() != 0) {
            if (this.c) {
                f3 = (i3 - i) * (1.0f - this.a);
            } else {
                f3 = (i3 - this.a) - i;
            }
            view.setPivotX(f3);
        } else {
            if (this.c) {
                f = (i3 - i) * this.a;
            } else {
                f = this.a + 0.0f;
            }
            view.setPivotX(f);
        }
        if (this.c) {
            f2 = (i4 - i2) * this.b;
        } else {
            f2 = this.b + 0.0f;
        }
        view.setPivotY(f2);
    }
}
