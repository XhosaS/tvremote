package com.google.android.libraries.play.widget.fireball;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.csq;
import defpackage.cww;
import defpackage.sdy;
import defpackage.sdz;
import defpackage.seb;
import defpackage.seo;
import defpackage.sfa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FireballTextTagView extends FrameLayout implements seo {
    private static final int[][] c = {new int[]{R.attr.state_selected}, new int[0]};
    public final int[] a;
    public final int b;
    private final ColorStateList d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final GradientDrawable k;
    private final View.OnLayoutChangeListener l;
    private boolean m;
    private boolean n;
    private TextView o;

    public FireballTextTagView(Context context) {
        this(context, null);
    }

    @Override // defpackage.seo
    public final void a(sfa sfaVar) {
        Drawable drawableMutate;
        this.o.getClass();
        TextView textView = this.o;
        String str = sfaVar.b;
        textView.setText(str);
        String str2 = sfaVar.c;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        setContentDescription(str);
        int i = sfaVar.d;
        if (i != 0) {
            Drawable drawable = AppCompatResources.getDrawable(getContext(), i);
            drawable.getClass();
            drawableMutate = drawable.mutate();
            float intrinsicWidth = drawableMutate.getIntrinsicHeight() > 0 ? drawableMutate.getIntrinsicWidth() / drawableMutate.getIntrinsicHeight() : 1.0f;
            int i2 = this.i;
            drawableMutate.setBounds(0, 0, Math.round(intrinsicWidth * i2), i2);
            int i3 = sfaVar.e;
            drawableMutate.setTintList(i3 == 0 ? this.d : AppCompatResources.getColorStateList(getContext(), i3));
        } else {
            drawableMutate = null;
        }
        TextView textView2 = this.o;
        textView2.setCompoundDrawablePadding(TextUtils.isEmpty(textView2.getText()) ? 0 : this.e);
        this.o.setCompoundDrawablesRelative(drawableMutate, null, null, null);
        setSelected(sfaVar.f());
        boolean z = this.n;
        c(sfaVar.e());
        if (!z || this.n) {
            return;
        }
        addOnLayoutChangeListener(this.l);
    }

    @Override // defpackage.seo
    public final void b() {
        this.o.getClass();
        this.o.setText((CharSequence) null);
        this.o.setCompoundDrawablePadding(this.e);
        this.o.setCompoundDrawables(null, null, null, null);
        c(false);
        setSelected(false);
        setContentDescription(null);
        removeOnLayoutChangeListener(this.l);
    }

    public final void c(boolean z) {
        this.n = z;
        setFocusable(!z);
        setForeground(z ? this.k : null);
        setImportantForAccessibility(true != z ? 0 : 2);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(com.google.android.videos.R.id.text);
        textView.getClass();
        this.o = textView;
        textView.setOutlineProvider(new sdz(this));
        this.o.setClipToOutline(true);
        this.o.setMinHeight(this.g);
        TextView textView2 = this.o;
        int i = this.h;
        textView2.setPadding(i, 0, i, 0);
        this.o.setTextAppearance(this.f);
        this.o.setTextColor(this.d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CompoundButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setSelected(false);
        accessibilityNodeInfo.setChecked(isSelected());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        GradientDrawable.Orientation orientation;
        int[] iArr = cww.a;
        boolean z2 = true;
        boolean z3 = getLayoutDirection() == 1;
        if (this.m != z3) {
            GradientDrawable gradientDrawable = this.k;
            if (z3) {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                z2 = false;
            }
            gradientDrawable.setOrientation(orientation);
            this.m = z2;
        }
        if (!this.n) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int measuredWidth = this.o.getMeasuredWidth();
        int measuredHeight = this.o.getMeasuredHeight();
        int i5 = ((i4 - i2) - measuredHeight) / 2;
        int i6 = measuredHeight + i5;
        if (!z3) {
            this.o.layout(0, i5, measuredWidth, i6);
        } else {
            int i7 = i3 - i;
            this.o.layout(i7 - measuredWidth, i5, i7, i6);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.n) {
            setMeasuredDimension(this.j, getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        if (this.n) {
            return;
        }
        super.setSelected(z);
    }

    public FireballTextTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = false;
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, seb.c, com.google.android.videos.R.attr.fireballViewStyle, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(com.google.android.videos.R.dimen.play__fireball__tag_padding));
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(com.google.android.videos.R.dimen.play__fireball__outline_height));
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(com.google.android.videos.R.dimen.play__fireball__tag_drawable_height));
        this.j = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.play__fireball__obscured_tag_width);
        int color = typedArrayObtainStyledAttributes.getColor(6, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(8, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(7, 0);
        typedArrayObtainStyledAttributes.recycle();
        int[] iArr = {color, color2};
        this.a = iArr;
        this.d = new ColorStateList(c, iArr);
        this.e = resources.getDimensionPixelSize(com.google.android.videos.R.dimen.play__fireball__tag_drawable_padding);
        int[] iArr2 = cww.a;
        this.m = getLayoutDirection() == 1;
        this.k = new GradientDrawable(this.m ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT, new int[]{csq.g(color3, 0), color3});
        this.l = new sdy(0);
    }
}
