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
import com.google.android.katniss.R;
import defpackage.gf$$ExternalSyntheticApiModelOutline0;
import defpackage.uyd;
import defpackage.vam;
import defpackage.vao;
import defpackage.vbq;
import defpackage.vbr;
import defpackage.vdc;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] r = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer s;
    private boolean t;
    private boolean u;
    private ImageView.ScaleType v;
    private Boolean w;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final Drawable w(Drawable drawable) {
        if (drawable == null || this.s == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTint(this.s.intValue());
        return drawableMutate;
    }

    private final void x(View view, Pair pair) {
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

    public ImageView.ScaleType getLogoScaleType() {
        return this.v;
    }

    public Integer getNavigationIconTint() {
        return this.s;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void l(Drawable drawable) {
        super.l(w(drawable));
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof vbq) {
            vbr.b(this, (vbq) background);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.t || this.u) {
            List listA = vao.a(this, getTitle());
            TextView textView = listA.isEmpty() ? null : (TextView) Collections.min(listA, vao.a);
            List listA2 = vao.a(this, getSubtitle());
            TextView textView2 = listA2.isEmpty() ? null : (TextView) Collections.max(listA2, vao.a);
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
                if (this.t && textView != null) {
                    x(textView, pair);
                }
                if (this.u && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.w;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.v;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof vbq) {
            ((vbq) background).k(f);
        }
    }

    public void setNavigationIconTint(int i) {
        this.s = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            super.l(w(navigationIcon));
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        super(vdc.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayC = vam.c(context2, attributeSet, uyd.a, i, R.style.Widget_MaterialComponents_Toolbar);
        if (typedArrayC.hasValue(2)) {
            setNavigationIconTint(typedArrayC.getColor(2, -1));
        }
        this.t = typedArrayC.getBoolean(4, false);
        this.u = typedArrayC.getBoolean(3, false);
        int i2 = typedArrayC.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.v = r[i2];
        }
        if (typedArrayC.hasValue(0)) {
            this.w = Boolean.valueOf(typedArrayC.getBoolean(0, false));
        }
        typedArrayC.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else if (background instanceof ColorDrawable) {
            colorStateList = ColorStateList.valueOf(((ColorDrawable) background).getColor());
        } else {
            colorStateList = (Build.VERSION.SDK_INT < 29 || !gf$$ExternalSyntheticApiModelOutline0.m112m((Object) background)) ? null : gf$$ExternalSyntheticApiModelOutline0.m((Object) background).getColorStateList();
        }
        if (colorStateList != null) {
            vbq vbqVar = new vbq();
            vbqVar.l(colorStateList);
            vbqVar.i(context2);
            vbqVar.k(getElevation());
            setBackground(vbqVar);
        }
    }
}
