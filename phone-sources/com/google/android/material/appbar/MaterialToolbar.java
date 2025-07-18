package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.sok;
import defpackage.ssr;
import defpackage.suy;
import defpackage.suz;
import defpackage.szg;
import defpackage.szk;
import defpackage.tde;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] b = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer a;
    private boolean c;
    private boolean d;
    private ImageView.ScaleType e;
    private Boolean f;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void a(View view, Pair pair) {
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
        szg.e(this);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.c || this.d) {
            List listC = suz.c(this, getTitle());
            TextView textView = listC.isEmpty() ? null : (TextView) Collections.min(listC, suz.a);
            List listC2 = suz.c(this, getSubtitle());
            TextView textView2 = listC2.isEmpty() ? null : (TextView) Collections.max(listC2, suz.a);
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
                if (this.c && textView != null) {
                    a(textView, pair);
                }
                if (this.d && textView2 != null) {
                    a(textView2, pair);
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
            Boolean bool = this.f;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.e;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        szg.d(this, f);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.a != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.a.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListB;
        super(tde.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, sok.e, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayA.hasValue(2)) {
            this.a = Integer.valueOf(typedArrayA.getColor(2, -1));
            Drawable navigationIcon = getNavigationIcon();
            if (navigationIcon != null) {
                setNavigationIcon(navigationIcon);
            }
        }
        this.c = typedArrayA.getBoolean(4, false);
        this.d = typedArrayA.getBoolean(3, false);
        int i2 = typedArrayA.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.e = b[i2];
        }
        if (typedArrayA.hasValue(0)) {
            this.f = Boolean.valueOf(typedArrayA.getBoolean(0, false));
        }
        typedArrayA.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListB = ColorStateList.valueOf(0);
        } else {
            colorStateListB = ssr.b(background);
        }
        if (colorStateListB != null) {
            szk szkVar = new szk();
            szkVar.N(colorStateListB);
            szkVar.J(context2);
            szkVar.M(getElevation());
            setBackground(szkVar);
        }
    }
}
