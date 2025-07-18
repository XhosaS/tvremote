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
import com.google.android.katniss.R;
import com.google.android.material.checkbox.MaterialCheckBox$SavedState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uzr extends lg {
    private static final int d = 2131953749;
    private static final int[] e = {R.attr.state_indeterminate};
    private static final int[] f = {R.attr.state_error};
    private static final int[][] g = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int h = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList a;
    final ColorStateList b;
    public int[] c;
    private final LinkedHashSet i;
    private ColorStateList j;
    private boolean k;
    private final boolean l;
    private final boolean m;
    private CharSequence n;
    private Drawable o;
    private Drawable p;
    private boolean q;
    private final PorterDuff.Mode r;
    private int s;
    private boolean t;
    private CharSequence u;
    private CompoundButton.OnCheckedChangeListener v;
    private final bwi w;
    private final bwd x;

    /* JADX WARN: Illegal instructions before constructor call */
    public uzr(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        ColorStateList colorStateListB;
        int i = d;
        super(vdc.a(context, attributeSet, R.attr.checkboxStyle, i), attributeSet);
        new LinkedHashSet();
        this.i = new LinkedHashSet();
        Context context2 = getContext();
        bwi bwiVar = new bwi(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        WeakHashMap weakHashMap = aco.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(bwiVar.d);
        new bwh(drawable.getConstantState());
        bwiVar.e = drawable;
        this.w = bwiVar;
        this.x = new uzo(this);
        Context context3 = getContext();
        this.o = getButtonDrawable();
        ColorStateList colorStateList = this.a;
        this.a = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList() : colorStateList;
        b();
        int[] iArr = uzs.a;
        vam.a(context3, attributeSet, R.attr.checkboxStyle, i);
        vam.b(context3, attributeSet, R.attr.checkboxStyle, i);
        rv rvVarF = rv.f(context3, attributeSet, iArr, R.attr.checkboxStyle, i);
        this.p = rvVarF.b(2);
        if (this.o != null && vaz.c(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId2 = rvVarF.b.getResourceId(0, 0);
            int resourceId3 = rvVarF.b.getResourceId(1, 0);
            if (resourceId2 == h && resourceId3 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.o = ra.e().c(context3, R.drawable.mtrl_checkbox_button);
                this.q = true;
                if (this.p == null) {
                    this.p = ra.e().c(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.b = (!rvVarF.b.hasValue(3) || (resourceId = rvVarF.b.getResourceId(3, 0)) == 0 || (colorStateListB = abs.b(context3, resourceId)) == null) ? rvVarF.a(3) : colorStateListB;
        this.r = vas.a(rvVarF.b.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.k = rvVarF.b.getBoolean(10, false);
        this.l = rvVarF.b.getBoolean(6, true);
        this.m = rvVarF.b.getBoolean(9, false);
        this.n = rvVarF.b.getText(8);
        if (rvVarF.b.hasValue(7)) {
            setCheckedState(rvVarF.b.getInt(7, 0));
        }
        rvVarF.b.recycle();
        c();
    }

    private final void c() {
        ColorStateList colorStateList;
        Animator.AnimatorListener animatorListener;
        this.o = uzx.a(this.o, this.a, getButtonTintMode());
        Drawable drawable = this.p;
        ColorStateList colorStateList2 = this.b;
        this.p = uzx.a(drawable, colorStateList2, this.r);
        if (this.q) {
            bwi bwiVar = this.w;
            if (bwiVar != null) {
                bwd bwdVar = this.x;
                if (bwdVar != null) {
                    Drawable drawable2 = bwiVar.e;
                    if (drawable2 != null) {
                        ((AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(bwdVar.a());
                    }
                    ArrayList arrayList = bwiVar.c;
                    if (arrayList != null) {
                        arrayList.remove(bwdVar);
                        if (bwiVar.c.size() == 0 && (animatorListener = bwiVar.b) != null) {
                            bwiVar.a.c.removeListener(animatorListener);
                            bwiVar.b = null;
                        }
                    }
                }
                if (bwdVar != null) {
                    Drawable drawable3 = bwiVar.e;
                    if (drawable3 != null) {
                        ((AnimatedVectorDrawable) drawable3).registerAnimationCallback(bwdVar.a());
                    } else {
                        if (bwiVar.c == null) {
                            bwiVar.c = new ArrayList();
                        }
                        if (!bwiVar.c.contains(bwdVar)) {
                            bwiVar.c.add(bwdVar);
                            if (bwiVar.b == null) {
                                bwiVar.b = new bwf(bwiVar);
                            }
                            bwiVar.a.c.addListener(bwiVar.b);
                        }
                    }
                }
            }
            Drawable drawable4 = this.o;
            if ((drawable4 instanceof AnimatedStateListDrawable) && bwiVar != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, bwiVar, false);
                ((AnimatedStateListDrawable) this.o).addTransition(R.id.indeterminate, R.id.unchecked, bwiVar, false);
            }
        }
        Drawable drawable5 = this.o;
        if (drawable5 != null && (colorStateList = this.a) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.p;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.o;
        Drawable drawable8 = this.p;
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

    private final void d() {
        if (Build.VERSION.SDK_INT < 30 || this.u != null) {
            return;
        }
        int i = this.s;
        super.setStateDescription(i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.o;
    }

    public Drawable getButtonIconDrawable() {
        return this.p;
    }

    public ColorStateList getButtonIconTintList() {
        return this.b;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.r;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.a;
    }

    public int getCheckedState() {
        return this.s;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.n;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && this.a == null && this.b == null) {
            this.k = true;
            if (this.j == null) {
                int[][] iArr = g;
                int length = iArr.length;
                int iA = uzt.a(this, R.attr.colorControlActivated);
                int iA2 = uzt.a(this, R.attr.colorError);
                int iA3 = uzt.a(this, R.attr.colorSurface);
                int iA4 = uzt.a(this, R.attr.colorOnSurface);
                this.j = new ColorStateList(iArr, new int[]{uzt.b(iA3, iA2, 1.0f), uzt.b(iA3, iA, 1.0f), uzt.b(iA3, iA4, 0.54f), uzt.b(iA3, iA4, 0.38f), uzt.b(iA3, iA4, 0.38f)});
            }
            setButtonTintList(this.j);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArr;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        if (this.m) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        int i2 = 0;
        while (true) {
            int length = iArrOnCreateDrawableState.length;
            if (i2 >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, length + 1);
                iArrCopyOf[length] = 16842912;
                iArr = iArrCopyOf;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArr = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArr = (int[]) iArrOnCreateDrawableState.clone();
                iArr[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.c = iArr;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.l || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int i = true == vas.b(this) ? -1 : 1;
        int width = getWidth() - buttonDrawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i2 = (width / 2) * i;
        canvas.translate(i2, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i2, bounds.top, bounds.right + i2, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.m) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.n));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialCheckBox$SavedState materialCheckBox$SavedState = (MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        setCheckedState(materialCheckBox$SavedState.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.a = getCheckedState();
        return materialCheckBox$SavedState;
    }

    @Override // defpackage.lg, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ra.e().c(getContext(), i));
    }

    public void setButtonIconDrawableResource(int i) {
        this.p = ra.e().c(getContext(), i);
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.a == colorStateList) {
            return;
        }
        this.a = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        a(mode);
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.s != i) {
            this.s = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            d();
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet = this.i;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((uzp) it.next()).a();
                }
            }
            if (this.s != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManagerM210m = rbe$$ExternalSyntheticApiModelOutline5.m210m(getContext().getSystemService(rbe$$ExternalSyntheticApiModelOutline5.m()));
            if (autofillManagerM210m != null) {
                autofillManagerM210m.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    public void setErrorAccessibilityLabelResource(int i) {
        this.n = i != 0 ? getResources().getText(i) : null;
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence == null) {
            d();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setCheckedState(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.lg, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.o = drawable;
        this.q = false;
        c();
    }
}
