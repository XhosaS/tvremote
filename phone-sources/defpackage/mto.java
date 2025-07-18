package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mto extends GradientDrawable {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mto(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        super(orientation, iArr);
        this.a = i;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        int i = rect.bottom - rect.top;
        int i2 = this.a;
        if (i > i2) {
            rect.bottom = rect.top + i2;
        }
        super.onBoundsChange(rect);
    }
}
