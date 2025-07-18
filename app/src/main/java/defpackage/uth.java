package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uth extends GradientDrawable {
    public boolean a;
    private final int b;

    public uth(int i, int i2, int i3, boolean z) {
        setStroke(i, i2);
        setCornerRadius(i3);
        if (Build.VERSION.SDK_INT >= 29) {
            setInnerRadius(i3);
        }
        setShape(0);
        this.b = z ? i - 1 : 0;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        int i = this.b;
        if (i != 0) {
            rect.set(rect.left - i, rect.top - i, rect.right + i, rect.bottom + i);
        }
        super.onBoundsChange(rect);
    }
}
