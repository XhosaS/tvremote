package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.cww;
import defpackage.cxe;
import defpackage.cyq;
import defpackage.gea;
import defpackage.sim;
import defpackage.src;
import defpackage.srd;
import defpackage.sre;
import defpackage.srf;
import defpackage.srg;
import defpackage.srj;
import defpackage.sui;
import defpackage.suy;
import defpackage.syh;
import defpackage.syi;
import defpackage.syj;
import defpackage.szg;
import defpackage.szq;
import defpackage.tab;
import defpackage.tde;
import defpackage.zft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements srf, tab, sui {
    private static final int a = 2132085916;
    public srg e;
    public View.OnClickListener f;
    public CompoundButton.OnCheckedChangeListener g;
    public boolean h;
    public zft i;
    private InsetDrawable j;
    private RippleDrawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private final sre r;
    private boolean s;
    private final Rect t;
    private final RectF u;
    private final syi v;
    public static final Rect d = new Rect();
    private static final int[] b = {R.attr.state_selected};
    private static final int[] c = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    private final void a() {
        if (this.j != null) {
            this.j = null;
            setMinWidth(0);
            srg srgVar = this.e;
            setMinHeight((int) (srgVar != null ? srgVar.b : 0.0f));
            o();
        }
    }

    private final void b(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
        }
    }

    private final void e(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private final void o() {
        RippleDrawable rippleDrawable = new RippleDrawable(syj.b(this.e.c), f(), null);
        this.k = rippleDrawable;
        setBackground(rippleDrawable);
        q();
    }

    private final void q() {
        srg srgVar;
        if (TextUtils.isEmpty(getText()) || (srgVar = this.e) == null) {
            return;
        }
        float fB = srgVar.n + srgVar.k + srgVar.b();
        int iA = (int) (srgVar.i + srgVar.j + srgVar.a());
        int i = (int) fB;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            iA += rect.left;
            i += rect.right;
        }
        setPaddingRelative(iA, getPaddingTop(), i, getPaddingBottom());
    }

    private final void r() {
        TextPaint paint = getPaint();
        srg srgVar = this.e;
        if (srgVar != null) {
            paint.drawableState = srgVar.getState();
        }
        srg srgVar2 = this.e;
        syh syhVarF = srgVar2 != null ? srgVar2.f() : null;
        if (syhVarF != null) {
            syhVarF.c(getContext(), paint, this.v);
        }
    }

    public final Rect c() {
        RectF rectFD = d();
        int i = (int) rectFD.left;
        int i2 = (int) rectFD.top;
        int i3 = (int) rectFD.right;
        int i4 = (int) rectFD.bottom;
        Rect rect = this.t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    public final RectF d() {
        RectF rectF = this.u;
        rectF.setEmpty();
        if (i() && this.f != null) {
            srg srgVar = this.e;
            Rect bounds = srgVar.getBounds();
            rectF.setEmpty();
            if (srgVar.s()) {
                float f = srgVar.n + srgVar.m + srgVar.g + srgVar.l + srgVar.k;
                if (srgVar.getLayoutDirection() == 0) {
                    rectF.right = bounds.right;
                    rectF.left = rectF.right - f;
                } else {
                    rectF.left = bounds.left;
                    rectF.right = bounds.left + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.s ? super.dispatchHoverEvent(motionEvent) : this.r.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sre sreVar = this.r;
        if (!sreVar.n(keyEvent) || sreVar.d == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        srg srgVar = this.e;
        if (srgVar == null || !srg.q(srgVar.f)) {
            return;
        }
        srg srgVar2 = this.e;
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.h) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.n) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.m) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.h) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.n) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.m) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        if (srgVar2.r(iArr)) {
            invalidate();
        }
    }

    public final Drawable f() {
        InsetDrawable insetDrawable = this.j;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    @Override // defpackage.srf
    public final void g() {
        m(this.q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (!j()) {
            return !isClickable() ? "android.view.View" : "android.widget.Button";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).e()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        srg srgVar = this.e;
        if (srgVar != null) {
            return srgVar.p;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.s) {
            sre sreVar = this.r;
            if (sreVar.d == 1 || sreVar.c == 1) {
                rect.set(c());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public final void h() {
        if (i() && k() && this.f != null) {
            cww.p(this, this.r);
            this.s = true;
        } else {
            cww.p(this, null);
            this.s = false;
        }
    }

    public final boolean i() {
        srg srgVar = this.e;
        return (srgVar == null || srgVar.d() == null) ? false : true;
    }

    public final boolean j() {
        srg srgVar = this.e;
        return srgVar != null && srgVar.h;
    }

    public final boolean k() {
        srg srgVar = this.e;
        return srgVar != null && srgVar.e;
    }

    public final boolean l() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.s) {
            this.r.q(1, 1);
        }
        return z;
    }

    public final void m(int i) {
        this.q = i;
        if (!this.o) {
            if (this.j != null) {
                a();
                return;
            } else {
                o();
                return;
            }
        }
        int iMax = Math.max(0, i - this.e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.j != null) {
                a();
                return;
            } else {
                o();
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 >> 1 : 0;
        int i3 = iMax > 0 ? iMax >> 1 : 0;
        if (this.j != null) {
            Rect rect = new Rect();
            this.j.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                o();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.j = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        o();
    }

    @Override // defpackage.sui
    public final void n(zft zftVar) {
        this.i = zftVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        szg.f(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, b);
        }
        if (j()) {
            mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.s) {
            this.r.e(z, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            b(d().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            b(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            cyq cyqVar = new cyq(accessibilityNodeInfo);
            if (chipGroup.e) {
                i = 0;
                for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.d(i2)) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(com.google.android.videos.R.id.row_index_key);
            cyqVar.w(cxe.j(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (d().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.p != i) {
            this.p = i;
            q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.d()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L2d
            r4 = 2
            if (r0 == r4) goto L23
            r1 = 3
            if (r0 == r1) goto L21
            goto L41
        L21:
            r0 = r2
            goto L35
        L23:
            boolean r0 = r5.m
            if (r0 == 0) goto L41
            if (r1 != 0) goto L47
            r5.e(r2)
            return r3
        L2d:
            boolean r0 = r5.m
            if (r0 == 0) goto L21
            r5.l()
            r0 = r3
        L35:
            r5.e(r2)
            if (r0 != 0) goto L47
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.e(r3)
            goto L47
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
        L47:
            return r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.tab
    public final void p(szq szqVar) {
        this.e.p(szqVar);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable == f() || drawable == this.k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == f() || drawable == this.k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        srg srgVar = this.e;
        if (srgVar == null) {
            this.l = z;
        } else if (srgVar.h) {
            super.setChecked(z);
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable2, null, drawable4);
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        srg srgVar = this.e;
        if (srgVar != null) {
            srgVar.M(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        srg srgVar = this.e;
        if (srgVar != null) {
            srgVar.p = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        srg srgVar = this.e;
        if (srgVar != null) {
            srgVar.r = i;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.g = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        srg srgVar = this.e;
        if (srgVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(true != srgVar.q ? charSequence : null, bufferType);
        srg srgVar2 = this.e;
        if (srgVar2 != null) {
            srgVar2.m(charSequence);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        srg srgVar = this.e;
        if (srgVar != null) {
            srgVar.o(i);
        }
        r();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        srg srgVar = this.e;
        if (srgVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            syh syhVarF = srgVar.f();
            if (syhVarF != null) {
                syhVarF.l = fApplyDimension;
                srgVar.o.a.setTextSize(fApplyDimension);
                srgVar.g();
            }
        }
        r();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = a;
        super(tde.a(context, attributeSet, i, i2), attributeSet, i);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new src(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        srg srgVarE = srg.e(context2, attributeSet, i, i2);
        int[] iArr = srj.a;
        TypedArray typedArrayA = suy.a(context2, attributeSet, iArr, i, i2, new int[0]);
        this.o = typedArrayA.getBoolean(32, false);
        this.q = (int) Math.ceil(typedArrayA.getDimension(20, sim.c(context2)));
        typedArrayA.recycle();
        srg srgVar = this.e;
        byte[] bArr = null;
        if (srgVar != srgVarE) {
            if (srgVar != null) {
                srgVar.l(null);
            }
            this.e = srgVarE;
            srgVarE.q = false;
            srgVarE.l(this);
            m(this.q);
        }
        srgVarE.M(getElevation());
        TypedArray typedArrayA2 = suy.a(context2, attributeSet, iArr, i, i2, new int[0]);
        boolean zHasValue = typedArrayA2.hasValue(37);
        typedArrayA2.recycle();
        this.r = new sre(this, this);
        h();
        if (!zHasValue) {
            setOutlineProvider(new srd(this));
        }
        setChecked(this.l);
        setText(srgVarE.d);
        setEllipsize(srgVarE.p);
        r();
        if (!this.e.q) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        q();
        if (this.o) {
            setMinHeight(this.q);
        }
        this.p = getLayoutDirection();
        super.setOnCheckedChangeListener(new gea(this, 10, bArr));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        srg srgVar = this.e;
        if (srgVar != null) {
            srgVar.o(i);
        }
        r();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }
}
