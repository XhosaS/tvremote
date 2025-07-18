package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.ahj;
import defpackage.vt;
import defpackage.vu;
import defpackage.vv;
import defpackage.vw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] c = {R.attr.colorBackground};
    private static final vv f = new vv();
    public final Rect a;
    public final Rect b;
    private boolean d;
    private boolean e;
    private final vu g;

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((vw) this.g.a).e;
    }

    public float getCardElevation() {
        return this.g.b.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.a.bottom;
    }

    public int getContentPaddingLeft() {
        return this.a.left;
    }

    public int getContentPaddingRight() {
        return this.a.right;
    }

    public int getContentPaddingTop() {
        return this.a.top;
    }

    public float getMaxCardElevation() {
        return ((vw) this.g.a).b;
    }

    public boolean getPreventCornerOverlap() {
        return this.e;
    }

    public float getRadius() {
        return ((vw) this.g.a).a;
    }

    public boolean getUseCompatPadding() {
        return this.d;
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        vw vwVar = (vw) this.g.a;
        vwVar.a(colorStateListValueOf);
        vwVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        this.g.b.setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f.a(this.g, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setRadius(float f2) {
        vw vwVar = (vw) this.g.a;
        if (f2 == vwVar.a) {
            return;
        }
        vwVar.a = f2;
        vwVar.b(null);
        vwVar.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.katniss.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.a = rect;
        this.b = new Rect();
        vu vuVar = new vu(this);
        this.g = vuVar;
        int[] iArr = vt.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.google.android.katniss.R.style.CardView);
        ahj.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, com.google.android.katniss.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(c);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.android.katniss.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.android.katniss.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.e = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        vv vvVar = f;
        vw vwVar = new vw(colorStateListValueOf, dimension);
        vuVar.a = vwVar;
        CardView cardView = vuVar.b;
        cardView.setBackgroundDrawable(vwVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        vvVar.a(vuVar, dimension3);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
