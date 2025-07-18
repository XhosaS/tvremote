package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class teg extends tef {
    @Override // defpackage.tef
    public final void a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.h, i, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        int dimensionPixelSize = context.getTheme().obtainStyledAttributes(new int[]{R.attr.playCardCornerRadius}).getDimensionPixelSize(0, -1);
        if (dimensionPixelSize < 0) {
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        tee teeVar = new tee(colorStateList, dimensionPixelSize, typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0));
        int[] iArr = cww.a;
        int layoutDirection = view.getLayoutDirection();
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        int i2 = layoutDirection != 1 ? dimensionPixelSize2 : dimensionPixelSize4;
        if (layoutDirection != 1) {
            dimensionPixelSize2 = dimensionPixelSize4;
        }
        teeVar.e = new Rect(i2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize5);
        view.setClipToOutline(true);
        int dimensionPixelSize6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.playCardElevation}).getDimensionPixelSize(0, -1);
        if (dimensionPixelSize6 < 0) {
            dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        }
        view.setElevation(dimensionPixelSize6);
        view.setBackground(teeVar);
        view.setClipToOutline(typedArrayObtainStyledAttributes.getBoolean(1, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
