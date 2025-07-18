package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.TintTypedArray;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.csq;
import defpackage.cuc;
import defpackage.cww;
import defpackage.gjk;
import defpackage.gjy;
import defpackage.sil;
import defpackage.sim;
import defpackage.sin;
import defpackage.sip;
import defpackage.sns;
import defpackage.spv;
import defpackage.ssr;
import defpackage.sub;
import defpackage.suc;
import defpackage.sur;
import defpackage.sus;
import defpackage.suy;
import defpackage.sze;
import defpackage.szg;
import defpackage.szi;
import defpackage.szk;
import defpackage.szp;
import defpackage.szq;
import defpackage.tcc;
import defpackage.tcd;
import defpackage.tce;
import defpackage.tci;
import defpackage.tcn;
import defpackage.tcq;
import defpackage.tcr;
import defpackage.tct;
import defpackage.tcv;
import defpackage.tcw;
import defpackage.tcx;
import defpackage.tcy;
import defpackage.tcz;
import defpackage.tdb;
import defpackage.tde;
import defpackage.zft;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int s = 0;
    private static final int[][] t = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private int C;
    private ColorStateList D;
    private int E;
    private gjk F;
    private gjk G;
    private ColorStateList H;
    private ColorStateList I;
    private ColorStateList J;
    private ColorStateList K;
    private boolean L;
    private CharSequence M;
    private szk N;
    private szk O;
    private StateListDrawable P;
    private boolean Q;
    private szk R;
    private szk S;
    private szq T;
    private boolean U;
    private final int V;
    private int W;
    public final tcw a;
    private ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final Rect af;
    private final Rect ag;
    private final RectF ah;
    private Drawable ai;
    private int aj;
    private Drawable ak;
    private int al;
    private Drawable am;
    private ColorStateList an;
    private ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private ColorStateList as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public final tcn b;
    public EditText c;
    public final tcr d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public TextView k;
    public boolean l;
    public int m;
    public final LinkedHashSet n;
    public int o;
    public boolean p;
    public final sub q;
    public boolean r;
    private final FrameLayout u;
    private final int v;
    private CharSequence w;
    private int x;
    private int y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private final int B() {
        if (this.L) {
            int i = this.m;
            if (i == 0) {
                return (int) this.q.c();
            }
            if (i == 2) {
                if (Z()) {
                    return (int) (this.q.c() / 2.0f);
                }
                sub subVar = this.q;
                return Math.max(0, (int) (subVar.c() - (subVar.b() / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int C(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.e()
            if (r2 == 0) goto L1d
            tcw r2 = r0.a
            int r2 = r2.a()
        Le:
            int r1 = r1 + r2
            return r1
        L10:
            java.lang.CharSequence r2 = r0.f()
            if (r2 == 0) goto L1d
            tcn r2 = r0.b
            int r2 = r2.a()
            goto Le
        L1d:
            android.widget.EditText r2 = r0.c
            int r2 = r2.getCompoundPaddingLeft()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.C(int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int D(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.f()
            if (r2 == 0) goto L1d
            tcn r2 = r0.b
            int r2 = r2.a()
        Le:
            int r1 = r1 - r2
            return r1
        L10:
            java.lang.CharSequence r2 = r0.e()
            if (r2 == 0) goto L1d
            tcw r2 = r0.a
            int r2 = r2.a()
            goto Le
        L1d:
            android.widget.EditText r2 = r0.c
            int r2 = r2.getCompoundPaddingRight()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.D(int, boolean):int");
    }

    private final Rect E(Rect rect) {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.ag;
        boolean zP = sil.p(this);
        rect2.bottom = rect.bottom;
        int i = this.m;
        if (i == 1) {
            rect2.left = C(rect.left, zP);
            rect2.top = rect.top + this.W;
            rect2.right = D(rect.right, zP);
            return rect2;
        }
        if (i != 2) {
            rect2.left = C(rect.left, zP);
            rect2.top = getPaddingTop();
            rect2.right = D(rect.right, zP);
            return rect2;
        }
        rect2.left = rect.left + this.c.getPaddingLeft();
        rect2.top = rect.top - B();
        rect2.right = rect.right - this.c.getPaddingRight();
        return rect2;
    }

    private final Drawable F() {
        if (this.O == null) {
            this.O = H(true);
        }
        return this.O;
    }

    private final gjk G() {
        gjk gjkVar = new gjk();
        gjkVar.b = sim.b(getContext(), com.google.android.videos.R.attr.motionDurationShort2, 87);
        gjkVar.c = sim.k(getContext(), com.google.android.videos.R.attr.motionEasingLinearInterpolator, sns.a);
        return gjkVar;
    }

    private final szk H(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.videos.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        float dimensionPixelOffset2 = editText instanceof tct ? ((tct) editText).b : getResources().getDimensionPixelOffset(com.google.android.videos.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        float f = true != z ? 0.0f : dimensionPixelOffset;
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.videos.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        szp szpVar = new szp();
        szpVar.c(f);
        szpVar.d(f);
        szpVar.a(dimensionPixelOffset);
        szpVar.b(dimensionPixelOffset);
        szq szqVar = new szq(szpVar);
        EditText editText2 = this.c;
        szk szkVarE = szk.E(getContext(), dimensionPixelOffset2, editText2 instanceof tct ? ((tct) editText2).c : null);
        szkVarE.p(szqVar);
        szi sziVar = szkVarE.s;
        if (sziVar.j == null) {
            sziVar.j = new Rect();
        }
        szkVarE.s.j.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        szkVarE.invalidateSelf();
        return szkVarE;
    }

    private final void I() {
        if (this.c == null || this.m != 1) {
            return;
        }
        if (!Z()) {
            EditText editText = this.c;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.q.c() + this.v), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (sin.l(getContext())) {
            EditText editText2 = this.c;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (sin.k(getContext())) {
            EditText editText3 = this.c;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private final void J() {
        szk szkVar = this.N;
        if (szkVar == null) {
            return;
        }
        szq szqVarF = szkVar.F();
        szq szqVar = this.T;
        if (szqVarF != szqVar) {
            this.N.p(szqVar);
        }
        if (this.m == 2 && X()) {
            this.N.S(this.aa, this.ad);
        }
        int iF = this.ae;
        if (this.m == 1) {
            iF = csq.f(this.ae, sip.d(getContext(), com.google.android.videos.R.attr.colorSurface, 0));
        }
        this.ae = iF;
        this.N.N(ColorStateList.valueOf(iF));
        szk szkVar2 = this.R;
        if (szkVar2 != null && this.S != null) {
            if (X()) {
                szkVar2.N(this.c.isFocused() ? ColorStateList.valueOf(this.ap) : ColorStateList.valueOf(this.ad));
                this.S.N(ColorStateList.valueOf(this.ad));
            }
            invalidate();
        }
        u();
    }

    private final void K() {
        if (Y()) {
            ((tce) this.N).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void L() {
        TextView textView = this.k;
        if (textView == null || !this.j) {
            return;
        }
        textView.setText((CharSequence) null);
        gjy.c(this.u, this.G);
        this.k.setVisibility(4);
    }

    private final void M() {
        int i = this.m;
        if (i == 0) {
            this.N = null;
            this.R = null;
            this.S = null;
        } else if (i == 1) {
            this.N = new szk(this.T);
            this.R = new szk();
            this.S = new szk();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(i + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.L || (this.N instanceof tce)) {
                this.N = new szk(this.T);
            } else {
                szq szqVar = this.T;
                int i2 = tce.b;
                if (szqVar == null) {
                    szqVar = new szq();
                }
                this.N = new tcd(new tcc(szqVar, new RectF()));
            }
            this.R = null;
            this.S = null;
        }
        u();
        x();
        if (this.m == 1) {
            if (sin.l(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (sin.k(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        I();
        if (this.m != 0) {
            T();
        }
        EditText editText = this.c;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.m;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(F());
                    return;
                }
                if (i3 == 1) {
                    if (this.P == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.P = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, F());
                        this.P.addState(new int[0], H(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.P);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void N() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.N():void");
    }

    private static void O(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                O((ViewGroup) childAt, z);
            }
        }
    }

    private final void P(boolean z) {
        if (this.j == z) {
            return;
        }
        if (z) {
            TextView textView = this.k;
            if (textView != null) {
                this.u.addView(textView);
                this.k.setVisibility(0);
            }
        } else {
            TextView textView2 = this.k;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.k = null;
        }
        this.j = z;
    }

    private final void Q() {
        if (this.h != null) {
            EditText editText = this.c;
            s(editText == null ? null : editText.getText());
        }
    }

    private final void R() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            r(textView, this.g ? this.B : this.C);
            if (!this.g && (colorStateList2 = this.H) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (!this.g || (colorStateList = this.I) == null) {
                return;
            }
            this.h.setTextColor(colorStateList);
        }
    }

    private final void S() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.J;
        if (colorStateListG == null) {
            colorStateListG = sip.g(getContext(), com.google.android.videos.R.attr.colorControlActivated);
        }
        EditText editText = this.c;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.c.getTextCursorDrawable().mutate();
        if ((z() || (this.h != null && this.g)) && (colorStateList = this.K) != null) {
            colorStateListG = colorStateList;
        }
        drawableMutate.setTintList(colorStateListG);
    }

    private final void T() {
        if (this.m != 1) {
            FrameLayout frameLayout = this.u;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iB = B();
            if (iB != layoutParams.topMargin) {
                layoutParams.topMargin = iB;
                frameLayout.requestLayout();
            }
        }
    }

    private final void U(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.c;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.an;
        if (colorStateList2 != null) {
            this.q.n(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.an;
            this.q.n(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.ax) : this.ax));
        } else if (z()) {
            sub subVar = this.q;
            TextView textView2 = this.d.h;
            subVar.n(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.g && (textView = this.h) != null) {
            this.q.n(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ao) != null) {
            this.q.s(colorStateList);
        }
        if (z3 || !this.ay || (isEnabled() && z4)) {
            if (z2 || this.p) {
                ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.az) {
                    g(1.0f);
                } else {
                    this.q.B(1.0f);
                }
                this.p = false;
                if (Y()) {
                    N();
                }
                V();
                this.a.b(false);
                this.b.e(false);
                return;
            }
            return;
        }
        if (z2 || !this.p) {
            ValueAnimator valueAnimator2 = this.aA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aA.cancel();
            }
            if (z && this.az) {
                g(0.0f);
            } else {
                this.q.B(0.0f);
            }
            if (Y() && !((tce) this.N).a.x.isEmpty()) {
                K();
            }
            this.p = true;
            L();
            this.a.b(true);
            this.b.e(true);
        }
    }

    private final void V() {
        EditText editText = this.c;
        w(editText == null ? null : editText.getText());
    }

    private final void W(boolean z, boolean z2) {
        int defaultColor = this.as.getDefaultColor();
        int colorForState = this.as.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.as.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ad = defaultColor;
    }

    private final boolean X() {
        return this.aa >= 0 && this.ad != 0;
    }

    private final boolean Y() {
        return this.L && !TextUtils.isEmpty(this.M) && (this.N instanceof tce);
    }

    private final boolean Z() {
        return this.q.q == 1;
    }

    private final boolean aa() {
        return this.m == 1 && this.c.getMinLines() <= 1;
    }

    static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final boolean A() {
        boolean z;
        if (this.c == null) {
            return false;
        }
        tcw tcwVar = this.a;
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((tcwVar.c.getDrawable() != null || (e() != null && tcwVar.a.getVisibility() == 0)) && tcwVar.getMeasuredWidth() > 0) {
            int measuredWidth = tcwVar.getMeasuredWidth() - this.c.getPaddingLeft();
            if (this.ai == null || this.aj != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ai = colorDrawable;
                this.aj = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ai;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ai != null) {
                Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
                this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ai = null;
                z = true;
            }
            z = false;
        }
        tcn tcnVar = this.b;
        if ((tcnVar.s() || ((tcnVar.q() && tcnVar.r()) || tcnVar.h != null)) && tcnVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = tcnVar.i.getMeasuredWidth() - this.c.getPaddingRight();
            if (tcnVar.s()) {
                checkableImageButton = tcnVar.b;
            } else if (tcnVar.q() && tcnVar.r()) {
                checkableImageButton = tcnVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ak;
            if (drawable3 != null && this.al != measuredWidth2) {
                this.al = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ak, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.ak = colorDrawable2;
                this.al = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.ak;
            if (drawable4 != drawable5) {
                this.am = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ak != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ak) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.am, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ak = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.u;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        T();
        EditText editText = (EditText) view;
        if (this.c != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        tcn tcnVar = this.b;
        int i2 = tcnVar.e;
        this.c = editText;
        int i3 = this.x;
        if (i3 != -1) {
            n(i3);
        } else {
            o(this.z);
        }
        int i4 = this.y;
        if (i4 != -1) {
            l(i4);
        } else {
            m(this.A);
        }
        this.Q = false;
        M();
        tcz tczVar = new tcz(this);
        EditText editText2 = this.c;
        if (editText2 != null) {
            cww.p(editText2, tczVar);
        }
        sub subVar = this.q;
        Typeface typeface = this.c.getTypeface();
        boolean zH = subVar.H(typeface);
        boolean zI = subVar.I(typeface);
        if (zH || zI) {
            subVar.l();
        }
        subVar.A(this.c.getTextSize());
        float letterSpacing = this.c.getLetterSpacing();
        if (subVar.n != letterSpacing) {
            subVar.n = letterSpacing;
            subVar.l();
        }
        int gravity = this.c.getGravity();
        subVar.t((gravity & (-113)) | 48);
        subVar.z(gravity);
        this.o = editText.getMinimumHeight();
        this.c.addTextChangedListener(new tcx(this, editText));
        if (this.an == null) {
            this.an = this.c.getHintTextColors();
        }
        if (this.L) {
            if (TextUtils.isEmpty(this.M)) {
                CharSequence hint = this.c.getHint();
                this.w = hint;
                k(hint);
                this.c.setHint((CharSequence) null);
            }
            this.l = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            S();
        }
        if (this.h != null) {
            s(this.c.getText());
        }
        t();
        this.d.b();
        this.a.bringToFront();
        tcnVar.bringToFront();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((zft) it.next()).j(this);
        }
        tcnVar.p();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        U(false, true);
    }

    public final CharSequence c() {
        tcr tcrVar = this.d;
        if (tcrVar.g) {
            return tcrVar.f;
        }
        return null;
    }

    public final CharSequence d() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w != null) {
            boolean z = this.l;
            this.l = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.l = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.u;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.c) {
                viewStructureNewChild.setHint(d());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        szk szkVar;
        super.draw(canvas);
        if (this.L) {
            this.q.h(canvas);
        }
        if (this.S == null || (szkVar = this.R) == null) {
            return;
        }
        szkVar.draw(canvas);
        if (this.c.isFocused()) {
            Rect bounds = this.S.getBounds();
            Rect bounds2 = this.R.getBounds();
            float f = this.q.a;
            int iCenterX = bounds2.centerX();
            bounds.left = sns.b(iCenterX, bounds2.left, f);
            bounds.right = sns.b(iCenterX, bounds2.right, f);
            this.S.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.aB) {
            return;
        }
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        sub subVar = this.q;
        boolean zJ = subVar != null ? subVar.J(drawableState) : false;
        if (this.c != null) {
            v(isLaidOut() && isEnabled());
        }
        t();
        x();
        if (zJ) {
            invalidate();
        }
        this.aB = false;
    }

    public final CharSequence e() {
        return this.a.b;
    }

    public final CharSequence f() {
        return this.b.h;
    }

    final void g(float f) {
        sub subVar = this.q;
        if (subVar.a == f) {
            return;
        }
        if (this.aA == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aA = valueAnimator;
            valueAnimator.setInterpolator(sim.k(getContext(), com.google.android.videos.R.attr.motionEasingEmphasizedInterpolator, sns.b));
            this.aA.setDuration(sim.b(getContext(), com.google.android.videos.R.attr.motionDurationMedium4, 167));
            this.aA.addUpdateListener(new spv(this, 8));
        }
        this.aA.setFloatValues(subVar.a, f);
        this.aA.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        return editText != null ? editText.getBaseline() + getPaddingTop() + B() : super.getBaseline();
    }

    public final void h(boolean z) {
        this.b.l(z);
    }

    public final void i(boolean z) {
        tcr tcrVar = this.d;
        if (tcrVar.g == z) {
            return;
        }
        tcrVar.c();
        if (z) {
            tcrVar.h = new AppCompatTextView(tcrVar.a);
            tcrVar.h.setId(com.google.android.videos.R.id.textinput_error);
            tcrVar.h.setTextAlignment(5);
            tcrVar.h(tcrVar.k);
            tcrVar.i(tcrVar.l);
            tcrVar.g(tcrVar.i);
            tcrVar.f(tcrVar.j);
            tcrVar.h.setVisibility(4);
            tcrVar.a(tcrVar.h, 0);
        } else {
            tcrVar.d();
            tcrVar.e(tcrVar.h, 0);
            tcrVar.h = null;
            TextInputLayout textInputLayout = tcrVar.b;
            textInputLayout.t();
            textInputLayout.x();
        }
        tcrVar.g = z;
    }

    public final void j(boolean z) {
        tcr tcrVar = this.d;
        if (tcrVar.n == z) {
            return;
        }
        tcrVar.c();
        if (z) {
            tcrVar.o = new AppCompatTextView(tcrVar.a);
            tcrVar.o.setId(com.google.android.videos.R.id.textinput_helper_text);
            tcrVar.o.setTextAlignment(5);
            tcrVar.o.setVisibility(4);
            tcrVar.o.setAccessibilityLiveRegion(1);
            tcrVar.j(tcrVar.p);
            tcrVar.k(tcrVar.q);
            tcrVar.a(tcrVar.o, 1);
            tcrVar.o.setAccessibilityDelegate(new tcq(tcrVar));
        } else {
            tcrVar.c();
            int i = tcrVar.d;
            if (i == 2) {
                tcrVar.e = 0;
            }
            tcrVar.l(i, tcrVar.e, tcrVar.m(tcrVar.o, ""));
            tcrVar.e(tcrVar.o, 1);
            tcrVar.o = null;
            TextInputLayout textInputLayout = tcrVar.b;
            textInputLayout.t();
            textInputLayout.x();
        }
        tcrVar.n = z;
    }

    public final void k(CharSequence charSequence) {
        if (this.L) {
            if (!TextUtils.equals(charSequence, this.M)) {
                this.M = charSequence;
                this.q.E(charSequence);
                if (!this.p) {
                    N();
                }
            }
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public final void l(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public final void m(int i) {
        this.A = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public final void n(int i) {
        this.x = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public final void o(int i) {
        this.z = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        tcn tcnVar = this.b;
        tcnVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aC = false;
        if (this.c != null) {
            int iMax = Math.max(tcnVar.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < iMax) {
                this.c.setMinimumHeight(iMax);
                z = true;
            }
        }
        boolean zA = A();
        if (z || zA) {
            this.c.post(new tci(this, 2));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.af;
            suc.a(this, editText, rect);
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.L) {
                sub subVar = this.q;
                subVar.A(this.c.getTextSize());
                int gravity = this.c.getGravity();
                subVar.t((gravity & (-113)) | 48);
                subVar.z(gravity);
                subVar.o(E(rect));
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.ag;
                float fE = Z() ? subVar.e() : subVar.d() * subVar.i;
                rect2.left = rect.left + this.c.getCompoundPaddingLeft();
                if (aa()) {
                    compoundPaddingTop = (int) (rect.centerY() - (fE / 2.0f));
                } else {
                    int iE = 0;
                    if (this.m == 0 && !Z()) {
                        iE = (int) (subVar.e() / 2.0f);
                    }
                    compoundPaddingTop = (rect.top + this.c.getCompoundPaddingTop()) - iE;
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.c.getCompoundPaddingRight();
                rect2.bottom = aa() ? (int) (rect2.top + fE) : rect.bottom - this.c.getCompoundPaddingBottom();
                subVar.u(rect2.left, rect2.top, rect2.right, rect2.bottom);
                subVar.l();
                if (!Y() || this.p) {
                    return;
                }
                N();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.k != null && (editText = this.c) != null) {
            this.k.setGravity(editText.getGravity());
            this.k.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.p();
        if (Z()) {
            return;
        }
        int measuredWidth = (this.c.getMeasuredWidth() - this.c.getCompoundPaddingLeft()) - this.c.getCompoundPaddingRight();
        sub subVar = this.q;
        TextPaint textPaint = subVar.m;
        subVar.i(textPaint);
        float f = measuredWidth;
        subVar.s = subVar.g(subVar.r, textPaint, subVar.k, (subVar.g / subVar.f) * f, subVar.l).getHeight();
        subVar.j(textPaint);
        subVar.t = subVar.g(subVar.q, textPaint, subVar.k, f, subVar.l).getHeight();
        Rect rect = this.af;
        suc.a(this, this.c, rect);
        subVar.o(E(rect));
        T();
        I();
        if (this.c == null) {
            return;
        }
        int i3 = subVar.t;
        float fE = i3 != -1 ? i3 : subVar.e();
        float height = 0.0f;
        if (this.i != null) {
            TextPaint textPaint2 = new TextPaint(129);
            textPaint2.set(this.k.getPaint());
            textPaint2.setTextSize(this.k.getTextSize());
            textPaint2.setTypeface(this.k.getTypeface());
            textPaint2.setLetterSpacing(this.k.getLetterSpacing());
            try {
                sus susVar = new sus(this.i, textPaint2, measuredWidth);
                susVar.e = getLayoutDirection() == 1;
                susVar.d = true;
                susVar.b(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier());
                susVar.g = new zft(this);
                height = susVar.a().getHeight() + (this.m == 1 ? subVar.c() + this.W + this.v : 0.0f);
            } catch (sur e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(fE, height);
        if (this.c.getMeasuredHeight() < fMax) {
            this.c.setMinimumHeight(Math.round(fMax));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onRestoreInstanceState(android.os.Parcelable r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tdb
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r6)
            return
        L8:
            tdb r6 = (defpackage.tdb) r6
            android.os.Parcelable r0 = r6.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r6.a
            tcr r1 = r5.d
            boolean r2 = r1.g
            r3 = 1
            if (r2 != 0) goto L24
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L21
            goto L49
        L21:
            r5.i(r3)
        L24:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L46
            r1.c()
            r1.f = r0
            android.widget.TextView r2 = r1.h
            r2.setText(r0)
            int r2 = r1.d
            if (r2 == r3) goto L3a
            r1.e = r3
        L3a:
            int r3 = r1.e
            android.widget.TextView r4 = r1.h
            boolean r0 = r1.m(r4, r0)
            r1.l(r2, r3, r0)
            goto L49
        L46:
            r1.d()
        L49:
            boolean r6 = r6.b
            if (r6 == 0) goto L57
            tci r6 = new tci
            r0 = 3
            r1 = 0
            r6.<init>(r5, r0, r1)
            r5.post(r6)
        L57:
            r5.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onRestoreInstanceState(android.os.Parcelable):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.U) {
            sze szeVar = this.T.b;
            RectF rectF = this.ah;
            float fA = szeVar.a(rectF);
            float fA2 = this.T.c.a(rectF);
            float fA3 = this.T.e.a(rectF);
            float fA4 = this.T.d.a(rectF);
            szq szqVar = this.T;
            sin sinVar = szqVar.j;
            sin sinVar2 = szqVar.k;
            sin sinVar3 = szqVar.m;
            sin sinVar4 = szqVar.l;
            szp szpVar = new szp();
            szpVar.k(sinVar2);
            szpVar.l(sinVar);
            szpVar.i(sinVar4);
            szpVar.j(sinVar3);
            szpVar.c(fA2);
            szpVar.d(fA);
            szpVar.a(fA4);
            szpVar.b(fA3);
            szq szqVar2 = new szq(szpVar);
            this.U = z;
            szk szkVar = this.N;
            if (szkVar == null || szkVar.F() == szqVar2) {
                return;
            }
            this.T = szqVar2;
            J();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        tdb tdbVar = new tdb(super.onSaveInstanceState());
        if (z()) {
            tdbVar.a = c();
        }
        tcn tcnVar = this.b;
        boolean z = false;
        if (tcnVar.q() && tcnVar.d.a) {
            z = true;
        }
        tdbVar.b = z;
        return tdbVar;
    }

    public final void p(int i) {
        this.E = i;
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public final void q(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            TextView textView = this.k;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public final void r(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132083992);
        textView.setTextColor(getContext().getColor(com.google.android.videos.R.color.design_error));
    }

    public final void s(Editable editable) {
        int iB = b(editable);
        boolean z = this.g;
        int i = this.f;
        if (i == -1) {
            this.h.setText(String.valueOf(iB));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            this.g = iB > i;
            Context context = getContext();
            TextView textView = this.h;
            int i2 = this.f;
            int i3 = true != this.g ? com.google.android.videos.R.string.character_counter_content_description : com.google.android.videos.R.string.character_counter_overflowed_content_description;
            Integer numValueOf = Integer.valueOf(iB);
            textView.setContentDescription(context.getString(i3, numValueOf, Integer.valueOf(i2)));
            if (z != this.g) {
                R();
            }
            this.h.setText(cuc.a().b(getContext().getString(com.google.android.videos.R.string.character_counter_pattern, numValueOf, Integer.valueOf(this.f))));
        }
        if (this.c == null || z == this.g) {
            return;
        }
        v(false);
        x();
        t();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        O(this, z);
        super.setEnabled(z);
    }

    public final void t() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText == null || this.m != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = DrawableUtils.INSETS_NONE;
        Drawable drawableMutate = background.mutate();
        if (z()) {
            drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(a(), PorterDuff.Mode.SRC_IN));
        } else if (this.g && (textView = this.h) != null) {
            drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.c.refreshDrawableState();
        }
    }

    public final void u() {
        Drawable rippleDrawable;
        EditText editText = this.c;
        if (editText == null || this.N == null) {
            return;
        }
        if ((this.Q || editText.getBackground() == null) && this.m != 0) {
            EditText editText2 = this.c;
            if (!(editText2 instanceof AutoCompleteTextView) || szg.g(editText2)) {
                rippleDrawable = this.N;
            } else {
                int iC = sip.c(this.c, com.google.android.videos.R.attr.colorControlHighlight);
                int i = this.m;
                if (i == 2) {
                    Context context = getContext();
                    szk szkVar = this.N;
                    int[][] iArr = t;
                    int iE = sip.e(context, com.google.android.videos.R.attr.colorSurface, "TextInputLayout");
                    szk szkVar2 = new szk(szkVar.F());
                    int iF = sip.f(iC, iE, 0.1f);
                    szkVar2.N(new ColorStateList(iArr, new int[]{iF, 0}));
                    szkVar2.setTint(iE);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, iE});
                    szk szkVar3 = new szk(szkVar.F());
                    szkVar3.setTint(-1);
                    rippleDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, szkVar2, szkVar3), szkVar});
                } else if (i == 1) {
                    szk szkVar4 = this.N;
                    int i2 = this.ae;
                    rippleDrawable = new RippleDrawable(new ColorStateList(t, new int[]{sip.f(iC, i2, 0.1f), i2}), szkVar4, szkVar4);
                } else {
                    rippleDrawable = null;
                }
            }
            this.c.setBackground(rippleDrawable);
            this.Q = true;
        }
    }

    public final void v(boolean z) {
        U(z, false);
    }

    public final void w(Editable editable) {
        if (b(editable) != 0 || this.p) {
            L();
            return;
        }
        if (this.k == null || !this.j || TextUtils.isEmpty(this.i)) {
            return;
        }
        this.k.setText(this.i);
        gjy.c(this.u, this.F);
        this.k.setVisibility(0);
        this.k.bringToFront();
    }

    public final void x() {
        int currentTextColor;
        TextView textView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.N == null || this.m == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.c) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.c) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.ad = this.ax;
        } else if (!z()) {
            if (!this.g || (textView = this.h) == null) {
                currentTextColor = z2 ? this.ar : z ? this.aq : this.ap;
            } else if (this.as != null) {
                W(z2, z);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            this.ad = currentTextColor;
        } else if (this.as != null) {
            W(z2, z);
        } else {
            this.ad = a();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            S();
        }
        tcn tcnVar = this.b;
        tcnVar.o();
        TextInputLayout textInputLayout = tcnVar.a;
        ssr.u(textInputLayout, tcnVar.b, tcnVar.c);
        tcnVar.f();
        if (tcnVar.c().u()) {
            if (!textInputLayout.z() || tcnVar.b() == null) {
                ssr.t(textInputLayout, tcnVar.d, tcnVar.f, tcnVar.g);
            } else {
                Drawable drawableMutate = tcnVar.b().mutate();
                drawableMutate.setTint(textInputLayout.a());
                tcnVar.d.setImageDrawable(drawableMutate);
            }
        }
        this.a.c();
        if (this.m == 2) {
            int i2 = this.aa;
            if (z2 && isEnabled()) {
                i = this.ac;
                this.aa = i;
            } else {
                i = this.ab;
                this.aa = i;
            }
            if (i != i2 && Y() && !this.p) {
                K();
                N();
            }
        }
        if (this.m == 1) {
            if (isEnabled()) {
                this.ae = (!z || z2) ? z2 ? this.av : this.at : this.aw;
            } else {
                this.ae = this.au;
            }
        }
        J();
    }

    public final boolean y() {
        return this.d.n;
    }

    public final boolean z() {
        tcr tcrVar = this.d;
        return (tcrVar.e != 1 || tcrVar.h == null || TextUtils.isEmpty(tcrVar.f)) ? false : true;
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateListI;
        super(tde.a(context, attributeSet, i, com.google.android.videos.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        tcr tcrVar = new tcr(this);
        this.d = tcrVar;
        this.af = new Rect();
        this.ag = new Rect();
        this.ah = new RectF();
        this.n = new LinkedHashSet();
        sub subVar = new sub(this);
        this.q = subVar;
        this.aC = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.u = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = sns.a;
        subVar.F(timeInterpolator);
        subVar.D(timeInterpolator);
        subVar.t(8388659);
        TintTypedArray tintTypedArrayB = suy.b(context2, attributeSet, tcv.c, i, com.google.android.videos.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        tcw tcwVar = new tcw(this, tintTypedArrayB);
        this.a = tcwVar;
        this.L = tintTypedArrayB.getBoolean(48, true);
        k(tintTypedArrayB.getText(4));
        this.az = tintTypedArrayB.getBoolean(47, true);
        this.ay = tintTypedArrayB.getBoolean(42, true);
        if (tintTypedArrayB.hasValue(6)) {
            n(tintTypedArrayB.getInt(6, -1));
        } else if (tintTypedArrayB.hasValue(3)) {
            o(tintTypedArrayB.getDimensionPixelSize(3, -1));
        }
        if (tintTypedArrayB.hasValue(5)) {
            l(tintTypedArrayB.getInt(5, -1));
        } else if (tintTypedArrayB.hasValue(2)) {
            m(tintTypedArrayB.getDimensionPixelSize(2, -1));
        }
        this.T = new szq(szq.c(context2, attributeSet, i, com.google.android.videos.R.style.Widget_Design_TextInputLayout));
        this.V = context2.getResources().getDimensionPixelOffset(com.google.android.videos.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.W = tintTypedArrayB.getDimensionPixelOffset(9, 0);
        this.v = getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.ab = tintTypedArrayB.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.ac = tintTypedArrayB.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.aa = this.ab;
        float dimension = tintTypedArrayB.getDimension(13, -1.0f);
        float dimension2 = tintTypedArrayB.getDimension(12, -1.0f);
        float dimension3 = tintTypedArrayB.getDimension(10, -1.0f);
        float dimension4 = tintTypedArrayB.getDimension(11, -1.0f);
        szp szpVar = new szp(this.T);
        if (dimension >= 0.0f) {
            szpVar.c(dimension);
        }
        if (dimension2 >= 0.0f) {
            szpVar.d(dimension2);
        }
        if (dimension3 >= 0.0f) {
            szpVar.b(dimension3);
        }
        if (dimension4 >= 0.0f) {
            szpVar.a(dimension4);
        }
        this.T = new szq(szpVar);
        ColorStateList colorStateListI2 = sin.i(context2, tintTypedArrayB, 7);
        if (colorStateListI2 != null) {
            int defaultColor = colorStateListI2.getDefaultColor();
            this.at = defaultColor;
            this.ae = defaultColor;
            if (colorStateListI2.isStateful()) {
                this.au = colorStateListI2.getColorForState(new int[]{-16842910}, -1);
                this.av = colorStateListI2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.aw = colorStateListI2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.av = this.at;
                ColorStateList colorStateList4 = AppCompatResources.getColorStateList(context2, com.google.android.videos.R.color.mtrl_filled_background_color);
                this.au = colorStateList4.getColorForState(new int[]{-16842910}, -1);
                this.aw = colorStateList4.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.ae = 0;
            this.at = 0;
            this.au = 0;
            this.av = 0;
            this.aw = 0;
        }
        if (tintTypedArrayB.hasValue(1)) {
            ColorStateList colorStateList5 = tintTypedArrayB.getColorStateList(1);
            this.ao = colorStateList5;
            this.an = colorStateList5;
        }
        ColorStateList colorStateListI3 = sin.i(context2, tintTypedArrayB, 14);
        this.ar = tintTypedArrayB.getColor(14, i2);
        this.ap = context2.getColor(com.google.android.videos.R.color.mtrl_textinput_default_box_stroke_color);
        this.ax = context2.getColor(com.google.android.videos.R.color.mtrl_textinput_disabled_color);
        this.aq = context2.getColor(com.google.android.videos.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListI3 != null) {
            if (colorStateListI3.isStateful()) {
                this.ap = colorStateListI3.getDefaultColor();
                this.ax = colorStateListI3.getColorForState(new int[]{-16842910}, -1);
                this.aq = colorStateListI3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
                this.ar = colorStateListI3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
            } else if (this.ar != colorStateListI3.getDefaultColor()) {
                this.ar = colorStateListI3.getDefaultColor();
            }
            x();
        }
        if (tintTypedArrayB.hasValue(15) && this.as != (colorStateListI = sin.i(context2, tintTypedArrayB, 15))) {
            this.as = colorStateListI;
            x();
        }
        if (tintTypedArrayB.getResourceId(50, -1) != -1) {
            subVar.r(tintTypedArrayB.getResourceId(50, 0));
            this.ao = subVar.h;
            if (this.c != null) {
                v(false);
                T();
            }
        }
        this.J = tintTypedArrayB.getColorStateList(24);
        this.K = tintTypedArrayB.getColorStateList(25);
        int resourceId = tintTypedArrayB.getResourceId(40, 0);
        CharSequence text = tintTypedArrayB.getText(35);
        int i3 = tintTypedArrayB.getInt(34, 1);
        boolean z2 = tintTypedArrayB.getBoolean(36, false);
        int resourceId2 = tintTypedArrayB.getResourceId(45, 0);
        boolean z3 = tintTypedArrayB.getBoolean(44, false);
        CharSequence text2 = tintTypedArrayB.getText(43);
        int resourceId3 = tintTypedArrayB.getResourceId(58, 0);
        CharSequence text3 = tintTypedArrayB.getText(57);
        boolean z4 = tintTypedArrayB.getBoolean(18, false);
        int i4 = tintTypedArrayB.getInt(19, -1);
        if (this.f != i4) {
            if (i4 > 0) {
                this.f = i4;
            } else {
                this.f = -1;
            }
            if (this.e) {
                Q();
            }
        }
        this.C = tintTypedArrayB.getResourceId(22, 0);
        this.B = tintTypedArrayB.getResourceId(20, 0);
        int i5 = tintTypedArrayB.getInt(8, 0);
        if (i5 != this.m) {
            this.m = i5;
            if (this.c != null) {
                M();
            }
        }
        tcrVar.g(text);
        tcrVar.f(i3);
        tcrVar.j(resourceId2);
        tcrVar.h(resourceId);
        if (this.k == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.k = appCompatTextView;
            appCompatTextView.setId(com.google.android.videos.R.id.textinput_placeholder);
            this.k.setImportantForAccessibility(1);
            this.k.setAccessibilityLiveRegion(1);
            gjk gjkVarG = G();
            this.F = gjkVarG;
            z = z2;
            gjkVarG.a = 67L;
            this.G = G();
            p(this.E);
            q(this.D);
            cww.p(this.k, new tcy());
        } else {
            z = z2;
        }
        if (TextUtils.isEmpty(text3)) {
            P(false);
        } else {
            if (!this.j) {
                P(true);
            }
            this.i = text3;
        }
        V();
        p(resourceId3);
        if (tintTypedArrayB.hasValue(41)) {
            tcrVar.i(tintTypedArrayB.getColorStateList(41));
        }
        if (tintTypedArrayB.hasValue(46)) {
            tcrVar.k(tintTypedArrayB.getColorStateList(46));
        }
        if (tintTypedArrayB.hasValue(51) && this.ao != (colorStateList3 = tintTypedArrayB.getColorStateList(51))) {
            if (this.an == null) {
                subVar.s(colorStateList3);
            }
            this.ao = colorStateList3;
            if (this.c != null) {
                v(false);
            }
        }
        if (tintTypedArrayB.hasValue(23) && this.H != (colorStateList2 = tintTypedArrayB.getColorStateList(23))) {
            this.H = colorStateList2;
            R();
        }
        if (tintTypedArrayB.hasValue(21) && this.I != (colorStateList = tintTypedArrayB.getColorStateList(21))) {
            this.I = colorStateList;
            R();
        }
        if (tintTypedArrayB.hasValue(59)) {
            q(tintTypedArrayB.getColorStateList(59));
        }
        tcn tcnVar = new tcn(this, tintTypedArrayB);
        this.b = tcnVar;
        boolean z5 = tintTypedArrayB.getBoolean(0, true);
        int i6 = tintTypedArrayB.getInt(49, 1);
        if (i6 != subVar.r) {
            subVar.r = i6;
            subVar.l();
        }
        subVar.w(i6);
        requestLayout();
        tintTypedArrayB.recycle();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(tcwVar);
        frameLayout.addView(tcnVar);
        addView(frameLayout);
        setEnabled(z5);
        j(z3);
        i(z);
        if (this.e != z4) {
            if (z4) {
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
                this.h = appCompatTextView2;
                appCompatTextView2.setId(com.google.android.videos.R.id.textinput_counter);
                this.h.setMaxLines(1);
                tcrVar.a(this.h, 2);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.google.android.videos.R.dimen.mtrl_textinput_counter_margin_start));
                R();
                Q();
            } else {
                tcrVar.e(this.h, 2);
                this.h = null;
            }
            this.e = z4;
        }
        if (TextUtils.isEmpty(text2)) {
            if (y()) {
                j(false);
                return;
            }
            return;
        }
        if (!y()) {
            j(true);
        }
        tcrVar.c();
        tcrVar.m = text2;
        tcrVar.o.setText(text2);
        int i7 = tcrVar.d;
        if (i7 != 2) {
            tcrVar.e = 2;
        }
        tcrVar.l(i7, tcrVar.e, tcrVar.m(tcrVar.o, text2));
    }
}
