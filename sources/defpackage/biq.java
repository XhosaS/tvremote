package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biq extends fi {
    private static final int e = 2132018961;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final abv x;
    private final abq y;

    /* JADX WARN: Illegal instructions before constructor call */
    public biq(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iG;
        ColorStateList colorStateListB;
        int i2 = e;
        super(blh.a(context, attributeSet, R.attr.checkboxStyle, i2), attributeSet);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        Context context2 = getContext();
        abv abvVar = new abv(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = nq.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(abvVar.d);
        new abu(drawable.getConstantState());
        abvVar.e = drawable;
        this.x = abvVar;
        this.y = new bin(this);
        Context context3 = getContext();
        ColorStateList colorStateList = this.b;
        this.b = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        fl flVar = this.a;
        if (flVar != null) {
            flVar.b = true;
            flVar.a();
        }
        int[] iArr = bir.a;
        bjj.a(context3, attributeSet, R.attr.checkboxStyle, i2);
        bjj.b(context3, attributeSet, R.attr.checkboxStyle, i2);
        aps apsVarR = aps.r(context3, attributeSet, iArr, R.attr.checkboxStyle, i2);
        this.q = apsVarR.i(2);
        if (this.p != null && xo.i(context3, R.attr.isMaterial3Theme, false)) {
            int iG2 = apsVarR.g(0, 0);
            int iG3 = apsVarR.g(1, 0);
            if (iG2 == i && iG3 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = ii.J(context3, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = ii.J(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = (!apsVarR.o(3) || (iG = apsVarR.g(3, 0)) == 0 || (colorStateListB = nf.b(context3, iG)) == null) ? apsVarR.h(3) : colorStateListB;
        this.s = ii.V(apsVarR.d(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = apsVarR.n(10, false);
        this.m = apsVarR.n(6, true);
        this.n = apsVarR.n(9, false);
        this.o = apsVarR.k(8);
        if (apsVarR.o(7)) {
            a(apsVarR.d(7, 0));
        }
        apsVarR.m();
        b();
    }

    private final void b() {
        ColorStateList colorStateList;
        Animator.AnimatorListener animatorListener;
        this.p = biu.b(this.p, this.b, getButtonTintMode());
        Drawable drawable = this.q;
        ColorStateList colorStateList2 = this.c;
        this.q = biu.b(drawable, colorStateList2, this.s);
        if (this.r) {
            abv abvVar = this.x;
            if (abvVar != null) {
                abq abqVar = this.y;
                if (abqVar != null) {
                    Drawable drawable2 = abvVar.e;
                    if (drawable2 != null) {
                        ((AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(abqVar.a());
                    }
                    ArrayList arrayList = abvVar.c;
                    if (arrayList != null) {
                        arrayList.remove(abqVar);
                        if (abvVar.c.size() == 0 && (animatorListener = abvVar.b) != null) {
                            abvVar.a.c.removeListener(animatorListener);
                            abvVar.b = null;
                        }
                    }
                }
                if (abqVar != null) {
                    Drawable drawable3 = abvVar.e;
                    if (drawable3 != null) {
                        ((AnimatedVectorDrawable) drawable3).registerAnimationCallback(abqVar.a());
                    } else {
                        if (abvVar.c == null) {
                            abvVar.c = new ArrayList();
                        }
                        if (!abvVar.c.contains(abqVar)) {
                            abvVar.c.add(abqVar);
                            if (abvVar.b == null) {
                                abvVar.b = new abs(abvVar);
                            }
                            abvVar.a.c.addListener(abvVar.b);
                        }
                    }
                }
            }
            Drawable drawable4 = this.p;
            if ((drawable4 instanceof AnimatedStateListDrawable) && abvVar != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, abvVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, abvVar, false);
            }
        }
        Drawable drawable5 = this.p;
        if (drawable5 != null && (colorStateList = this.b) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.q;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.p;
        Drawable drawable8 = this.q;
        if (drawable7 == null) {
            drawable7 = drawable8;
        } else if (drawable8 != null) {
            int intrinsicWidth = drawable8.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable7.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable8.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable7.getIntrinsicWidth() || intrinsicHeight > drawable7.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable7.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable7, drawable8});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable7 = layerDrawable;
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    private final void c() {
        if (Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public final void a(int i2) {
        AutofillManager autofillManagerM18m;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((bio) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerM18m = k$$ExternalSyntheticApiModelOutline0.m18m(getContext().getSystemService(k$$ExternalSyntheticApiModelOutline0.m$1()))) != null) {
                autofillManagerM18m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iC = bit.c(this, R.attr.colorControlActivated);
                int iC2 = bit.c(this, R.attr.colorError);
                int iC3 = bit.c(this, R.attr.colorSurface);
                int iC4 = bit.c(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{bit.d(iC3, iC2, 1.0f), bit.d(iC3, iC, 1.0f), bit.d(iC3, iC4, 0.54f), bit.d(iC3, iC4, 0.38f), bit.d(iC3, iC4, 0.38f)});
            }
            setButtonTintList(this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArr;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        int i3 = 0;
        while (true) {
            int length = iArrOnCreateDrawableState.length;
            if (i3 >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, length + 1);
                iArrCopyOf[length] = 16842912;
                iArr = iArrCopyOf;
                break;
            }
            int i4 = iArrOnCreateDrawableState[i3];
            if (i4 == 16842912) {
                iArr = iArrOnCreateDrawableState;
                break;
            }
            if (i4 == 0) {
                iArr = (int[]) iArrOnCreateDrawableState.clone();
                iArr[i3] = 16842912;
                break;
            }
            i3++;
        }
        this.d = iArr;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == biu.d(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bip)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bip bipVar = (bip) parcelable;
        super.onRestoreInstanceState(bipVar.getSuperState());
        a(bipVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        bip bipVar = new bip(super.onSaveInstanceState());
        bipVar.a = this.t;
        return bipVar;
    }

    @Override // defpackage.fi, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(ii.J(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        fl flVar = this.a;
        if (flVar != null) {
            flVar.a = mode;
            flVar.c = true;
            flVar.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.fi, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
