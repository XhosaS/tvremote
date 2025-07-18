package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdy implements View.OnLayoutChangeListener {
    public static final View.OnLayoutChangeListener a = new sdy(1);
    private final /* synthetic */ int b;

    public sdy(int i) {
        this.b = i;
    }

    public static Matrix a(float f, float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        if (f <= 0.0f || f2 <= 0.0f || f3 <= 0.0f || f4 <= 0.0f) {
            matrix.reset();
            return matrix;
        }
        float fMax = Math.max(f3 / f, f4 / f2);
        float fMax2 = Math.max(f - (f3 / fMax), 0.0f);
        float fMax3 = Math.max(f2 - (f4 / fMax), 0.0f);
        float f5 = 0.5f * fMax2;
        float f6 = 0.2f * fMax3;
        matrix.setRectToRect(new RectF(f5, f6, f - (fMax2 - f5), f2 - (fMax3 - f6)), new RectF(0.0f, 0.0f, f3, f4), Matrix.ScaleToFit.FILL);
        return matrix;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b != 0) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            imageView.setImageMatrix(a(drawable != null ? drawable.getIntrinsicWidth() : 0.0f, drawable != null ? drawable.getIntrinsicHeight() : 0.0f, i3 - i, i4 - i2));
        } else {
            view.requestFocus();
            view.sendAccessibilityEvent(8);
            view.removeOnLayoutChangeListener(this);
        }
    }
}
