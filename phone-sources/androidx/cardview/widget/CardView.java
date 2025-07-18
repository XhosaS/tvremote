package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.cww;
import defpackage.hv;
import defpackage.ih;
import defpackage.ii;
import defpackage.ij;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final ii e;
    private static final int[] g = {R.attr.colorBackground};
    public static final hv f = new hv();

    public CardView(Context context) {
        this(context, null);
    }

    public final float a() {
        return hv.c(this.e);
    }

    public void c(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ij ijVar = (ij) this.e.a;
        ijVar.a(colorStateListValueOf);
        ijVar.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        ii iiVar = new ii(this);
        this.e = iiVar;
        int[] iArr = ih.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.google.android.videos.R.style.CardView);
        cww.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, com.google.android.videos.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.android.videos.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.android.videos.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ij ijVar = new ij(colorStateListValueOf, dimension);
        iiVar.a = ijVar;
        CardView cardView = iiVar.b;
        cardView.setBackgroundDrawable(ijVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        Drawable drawable = iiVar.a;
        boolean zC = iiVar.c();
        boolean zB = iiVar.b();
        ij ijVar2 = (ij) drawable;
        if (dimension3 != ijVar2.b || ijVar2.c != zC || ijVar2.d != zB) {
            ijVar2.b = dimension3;
            ijVar2.c = zC;
            ijVar2.d = zB;
            ijVar2.b(null);
            ijVar2.invalidateSelf();
        }
        hv.e(iiVar);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
