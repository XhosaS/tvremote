package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tay extends FrameLayout {
    private static final View.OnTouchListener h = new tax();
    public taz a;
    szq b;
    public int c;
    public final float d;
    public final int e;
    public Rect f;
    public boolean g;
    private final float i;
    private final int j;
    private ColorStateList k;
    private PorterDuff.Mode l;

    protected tay(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        taz tazVar = this.a;
        if (tazVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = tazVar.j.getRootWindowInsets()) != null) {
            tazVar.r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            tazVar.j();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        taz tazVar = this.a;
        if (tazVar != null) {
            tbe tbeVarA = tbe.a();
            Object obj = tbeVarA.a;
            zft zftVar = tazVar.v;
            synchronized (obj) {
                z = true;
                if (!tbeVarA.g(zftVar) && !tbeVarA.h(zftVar)) {
                    z = false;
                }
            }
            if (z) {
                taz.a.post(new slt(tazVar, 19, null));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        taz tazVar = this.a;
        if (tazVar == null || !tazVar.t) {
            return;
        }
        tazVar.i();
        tazVar.t = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.k != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.k);
            drawable.setTintMode(this.l);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.l);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.l = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.g || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        taz tazVar = this.a;
        if (tazVar != null) {
            tazVar.j();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : h);
        super.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected tay(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(tde.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, tba.a);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.b = new szq(szq.c(context2, attributeSet, 0, 0));
        }
        float f = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        this.i = f;
        setBackgroundTintList(sin.h(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(a.ae(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(h);
        setFocusable(true);
        if (getBackground() == null) {
            int iF = sip.f(sip.c(this, R.attr.colorSurface), sip.c(this, R.attr.colorOnSurface), f);
            szq szqVar = this.b;
            if (szqVar != null) {
                String str = taz.b;
                szk szkVar = new szk(szqVar);
                szkVar.N(ColorStateList.valueOf(iF));
                gradientDrawable = szkVar;
            } else {
                Resources resources = getResources();
                String str2 = taz.b;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iF);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackgroundDrawable(gradientDrawable);
        }
    }
}
