package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tv.remote.service.R;
import defpackage.bhg;
import defpackage.bjj;
import defpackage.bjk;
import defpackage.bjz;
import defpackage.bkc;
import defpackage.blh;
import defpackage.bs$$ExternalSyntheticApiModelOutline0;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] w = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private ImageView.ScaleType A;
    private Boolean B;
    private Integer x;
    private boolean y;
    private boolean z;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void z(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof bkc) {
            bjz.a(this, (bkc) background);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.y || this.z) {
            List listA = bjk.a(this, this.p);
            TextView textView = listA.isEmpty() ? null : (TextView) Collections.min(listA, bjk.a);
            List listA2 = bjk.a(this, this.q);
            TextView textView2 = listA2.isEmpty() ? null : (TextView) Collections.max(listA2, bjk.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.y && textView != null) {
                    z(textView, pair);
                }
                if (this.z && textView2 != null) {
                    z(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.e;
        Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.B;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.A;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void p(Drawable drawable) {
        if (drawable != null && this.x != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.x.intValue());
        }
        super.p(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof bkc) {
            ((bkc) background).l(f);
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        super(blh.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayC = bjj.c(context2, attributeSet, bhg.a, i, R.style.Widget_MaterialComponents_Toolbar);
        if (typedArrayC.hasValue(2)) {
            this.x = Integer.valueOf(typedArrayC.getColor(2, -1));
            Drawable drawableE = e();
            if (drawableE != null) {
                p(drawableE);
            }
        }
        this.y = typedArrayC.getBoolean(4, false);
        this.z = typedArrayC.getBoolean(3, false);
        int i2 = typedArrayC.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.A = w[i2];
        }
        if (typedArrayC.hasValue(0)) {
            this.B = Boolean.valueOf(typedArrayC.getBoolean(0, false));
        }
        typedArrayC.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else if (background instanceof ColorDrawable) {
            colorStateList = ColorStateList.valueOf(((ColorDrawable) background).getColor());
        } else {
            colorStateList = (Build.VERSION.SDK_INT < 29 || !bs$$ExternalSyntheticApiModelOutline0.m4m((Object) background)) ? null : bs$$ExternalSyntheticApiModelOutline0.m((Object) background).getColorStateList();
        }
        if (colorStateList != null) {
            bkc bkcVar = new bkc();
            bkcVar.m(colorStateList);
            bkcVar.j(context2);
            bkcVar.l(getElevation());
            setBackground(bkcVar);
        }
    }
}
