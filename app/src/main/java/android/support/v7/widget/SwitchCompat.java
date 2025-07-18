package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.agw;
import defpackage.ahj;
import defpackage.alc;
import defpackage.arx;
import defpackage.asi;
import defpackage.asj;
import defpackage.hs;
import defpackage.hv;
import defpackage.lq;
import defpackage.ms;
import defpackage.np;
import defpackage.ra;
import defpackage.rp;
import defpackage.rq;
import defpackage.rv;
import defpackage.sm;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property c = new rp(Float.class);
    private static final int[] d = {R.attr.state_checked};
    private float A;
    private VelocityTracker B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final ms Q;
    private lq R;
    private final Rect S;
    public float a;
    ObjectAnimator b;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final int f() {
        return (int) (((sm.a(this) ? 1.0f - this.a : this.a) * g()) + 0.5f);
    }

    private final int g() {
        Drawable drawable = this.j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.S;
        drawable.getPadding(rect);
        Drawable drawable2 = this.e;
        Rect rectB = drawable2 != null ? np.b(drawable2) : np.a;
        return ((((this.D - this.F) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private final lq h() {
        if (this.R == null) {
            this.R = new lq(this);
        }
        return this.R;
    }

    private final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.L, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence j(CharSequence charSequence) {
        asj asjVar = h().a;
        TransformationMethod transformationMethod = this.P;
        arx arxVar = arx.b;
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    private final void k() {
        if (((asi) this.R.a.a).a.a) {
            arx arxVar = arx.b;
        }
    }

    private final boolean l() {
        return this.a > 0.5f;
    }

    public final void a() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            Object string = this.u;
            if (string == null) {
                string = getResources().getString(com.google.android.katniss.R.string.abc_capital_off);
            }
            int[] iArr = ahj.a;
            new agw(CharSequence.class).e(this, string);
        }
    }

    public final void b() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            Object string = this.s;
            if (string == null) {
                string = getResources().getString(com.google.android.katniss.R.string.abc_capital_on);
            }
            int[] iArr = ahj.a;
            new agw(CharSequence.class).e(this, string);
        }
    }

    public final void c(Typeface typeface) {
        TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.u = charSequence;
        this.v = j(charSequence);
        this.O = null;
        if (this.w) {
            k();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.G;
        int i4 = this.H;
        int i5 = this.I;
        int i6 = this.J;
        int iF = f() + i3;
        Drawable drawable = this.e;
        Rect rectB = drawable != null ? np.b(drawable) : np.a;
        Rect rect = this.S;
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            iF += rect.left;
            if (rectB != null) {
                if (rectB.left > rect.left) {
                    i3 += rectB.left - rect.left;
                }
                i = rectB.top > rect.top ? (rectB.top - rect.top) + i4 : i4;
                if (rectB.right > rect.right) {
                    i5 -= rectB.right - rect.right;
                }
                if (rectB.bottom > rect.bottom) {
                    i2 = i6 - (rectB.bottom - rect.bottom);
                }
                this.j.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = iF - rect.left;
            int i8 = iF + this.F + rect.right;
            this.e.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.e;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        this.s = charSequence;
        this.t = j(charSequence);
        this.N = null;
        if (this.w) {
            k();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!sm.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (sm.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        alc.c(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    public boolean getShowText() {
        return this.w;
    }

    public boolean getSplitTrack() {
        return this.r;
    }

    public int getSwitchMinWidth() {
        return this.p;
    }

    public int getSwitchPadding() {
        return this.q;
    }

    public CharSequence getTextOff() {
        return this.u;
    }

    public CharSequence getTextOn() {
        return this.s;
    }

    public Drawable getThumbDrawable() {
        return this.e;
    }

    public int getThumbTextPadding() {
        return this.o;
    }

    public ColorStateList getThumbTintList() {
        return this.f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.g;
    }

    public Drawable getTrackDrawable() {
        return this.j;
    }

    public ColorStateList getTrackTintList() {
        return this.k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.b.end();
        this.b = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.j;
        Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.H;
        int i2 = this.J;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.e;
        if (drawable != null) {
            if (!this.r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = np.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = l() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.s : this.u;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.e != null) {
            Rect rect = this.S;
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = np.b(this.e);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (sm.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.D + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.D) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = (getPaddingTop() + getHeight()) - getPaddingBottom();
            i5 = this.E;
            paddingTop = (paddingTop2 / 2) - (i5 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.E;
                this.G = paddingLeft;
                this.H = paddingTop;
                this.J = height;
                this.I = width;
            }
            paddingTop = getPaddingTop();
            i5 = this.E;
        }
        height = i5 + paddingTop;
        this.G = paddingLeft;
        this.H = paddingTop;
        this.J = height;
        this.I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int i3;
        int iMax;
        if (this.w) {
            if (this.N == null) {
                this.N = i(this.t);
            }
            if (this.O == null) {
                this.O = i(this.v);
            }
        }
        Rect rect = this.S;
        Drawable drawable = this.e;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.e.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.e.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.w) {
            int iMax2 = Math.max(this.N.getWidth(), this.O.getWidth());
            int i4 = this.o;
            i3 = iMax2 + i4 + i4;
        } else {
            i3 = 0;
        }
        this.F = Math.max(i3, intrinsicWidth);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax3 = rect.left;
        int iMax4 = rect.right;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            Rect rectB = np.b(drawable3);
            iMax3 = Math.max(iMax3, rectB.left);
            iMax4 = Math.max(iMax4, rectB.right);
        }
        if (this.K) {
            int i5 = this.p;
            int i6 = this.F;
            iMax = Math.max(i5, i6 + i6 + iMax3 + iMax4);
        } else {
            iMax = this.p;
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.D = iMax;
        this.E = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.s : this.u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        asj asjVar = h().a;
        arx arxVar = arx.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            b();
        } else {
            a();
        }
        float f = true != zIsChecked ? 0.0f : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.a = f;
            invalidate();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) c, f);
        this.b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.b.setAutoCancel(true);
        this.b.start();
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        asj asjVar = h().a;
        arx arxVar = arx.b;
        super.setFilters(inputFilterArr);
    }

    public void setSwitchMinWidth(int i) {
        this.p = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.q = i;
        requestLayout();
    }

    public void setThumbResource(int i) {
        Drawable drawableC = ra.e().c(getContext(), i);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbTextPadding(int i) {
        this.o = i;
        requestLayout();
    }

    public void setTrackResource(int i) {
        Drawable drawableC = ra.e().c(getContext(), i);
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.j = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(this);
        }
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.katniss.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        Drawable drawable;
        Drawable drawable2;
        Typeface typeface;
        Typeface typefaceCreate;
        super(context, attributeSet, i);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        this.K = true;
        this.S = new Rect();
        rq.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = hs.v;
        rv rvVarF = rv.f(context, attributeSet, iArr, i, 0);
        ahj.m(this, context, iArr, attributeSet, rvVarF.b, i, 0);
        Drawable drawableB = rvVarF.b(2);
        this.e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = rvVarF.b(11);
        this.j = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        e(rvVarF.b.getText(0));
        d(rvVarF.b.getText(1));
        this.w = rvVarF.b.getBoolean(3, true);
        this.o = rvVarF.b.getDimensionPixelSize(8, 0);
        this.p = rvVarF.b.getDimensionPixelSize(5, 0);
        this.q = rvVarF.b.getDimensionPixelSize(6, 0);
        this.r = rvVarF.b.getBoolean(4, false);
        ColorStateList colorStateListA = rvVarF.a(9);
        if (colorStateListA != null) {
            this.f = colorStateListA;
            this.h = true;
        }
        PorterDuff.Mode modeA = np.a(rvVarF.b.getInt(10, -1), null);
        if (this.g != modeA) {
            this.g = modeA;
            this.i = true;
        }
        boolean z = this.h;
        if ((z || this.i) && (drawable = this.e) != null && (z || this.i)) {
            Drawable drawableMutate = drawable.mutate();
            this.e = drawableMutate;
            if (this.h) {
                drawableMutate.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(getDrawableState());
            }
        }
        ColorStateList colorStateListA2 = rvVarF.a(12);
        if (colorStateListA2 != null) {
            this.k = colorStateListA2;
            this.m = true;
        }
        PorterDuff.Mode modeA2 = np.a(rvVarF.b.getInt(13, -1), null);
        if (this.l != modeA2) {
            this.l = modeA2;
            this.n = true;
        }
        boolean z2 = this.m;
        if ((z2 || this.n) && (drawable2 = this.j) != null && (z2 || this.n)) {
            Drawable drawableMutate2 = drawable2.mutate();
            this.j = drawableMutate2;
            if (this.m) {
                drawableMutate2.setTintList(this.k);
            }
            if (this.n) {
                this.j.setTintMode(this.l);
            }
            if (this.j.isStateful()) {
                this.j.setState(getDrawableState());
            }
        }
        int resourceId = rvVarF.b.getResourceId(7, 0);
        if (resourceId != 0) {
            rv rvVarD = rv.d(context, resourceId, hs.w);
            ColorStateList colorStateListA3 = rvVarD.a(3);
            if (colorStateListA3 != null) {
                this.M = colorStateListA3;
            } else {
                this.M = getTextColors();
            }
            int dimensionPixelSize = rvVarD.b.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = rvVarD.b.getInt(1, -1);
            int i3 = rvVarD.b.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(i3);
                } else {
                    typefaceCreate = Typeface.create(typeface, i3);
                }
                c(typefaceCreate);
                int i4 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText(1 == (i4 & 1));
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                c(typeface);
            }
            if (rvVarD.b.getBoolean(14, false)) {
                this.P = new hv(getContext());
            } else {
                this.P = null;
            }
            e(this.s);
            d(this.u);
            rvVarD.b.recycle();
        }
        ms msVar = new ms(this);
        this.Q = msVar;
        msVar.c(attributeSet, i);
        rvVarF.b.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        h().a(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
