package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cqu;
import defpackage.cqv;
import defpackage.cqx;
import defpackage.cww;
import defpackage.ko;
import defpackage.sin;
import defpackage.snw;
import defpackage.sss;
import defpackage.ssx;
import defpackage.stn;
import defpackage.sto;
import defpackage.str;
import defpackage.sts;
import defpackage.stu;
import defpackage.suc;
import defpackage.suy;
import defpackage.svf;
import defpackage.syj;
import defpackage.szg;
import defpackage.szk;
import defpackage.szq;
import defpackage.tab;
import defpackage.tbd;
import defpackage.tbf;
import defpackage.tde;
import defpackage.tko;
import defpackage.zft;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FloatingActionButton extends svf implements tab, cqu {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final AppCompatImageHelper m;
    private sts n;
    private final tbd o;

    /* compiled from: PG */
    public class BaseBehavior<T extends FloatingActionButton> extends cqv<T> {
        private Rect a;
        private final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private final boolean E(View view, FloatingActionButton floatingActionButton) {
            return (this.b && ((cqx) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0) ? false : true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof cqx) {
                return ((cqx) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (E(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            suc.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.i(null, false);
            return true;
        }

        private final boolean H(View view, FloatingActionButton floatingActionButton) {
            if (E(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((cqx) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.i(null, false);
            return true;
        }

        @Override // defpackage.cqv
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public void k(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                G(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (F(view)) {
                H(view, floatingActionButton);
            }
        }

        @Override // defpackage.cqv
        public final void b(cqx cqxVar) {
            if (cqxVar.h == 0) {
                cqxVar.h = 80;
            }
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listA.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (F(view2) && H(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (G(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.f(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            cqx cqxVar = (cqx) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - cqxVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= cqxVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - cqxVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= cqxVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int[] iArr = cww.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int[] iArr2 = cww.a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, stu.d);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int k(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    private final tko l(sss sssVar) {
        if (sssVar == null) {
            return null;
        }
        return new tko((View) this, (Object) sssVar);
    }

    @Override // defpackage.cqu
    public final cqv a() {
        return new Behavior();
    }

    public final int b() {
        return k(this.i);
    }

    public final sts c() {
        if (this.n == null) {
            this.n = new sts(this, new zft(this, null));
        }
        return this.n;
    }

    public final void e(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Rect rect2 = this.c;
        rect.left += rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void f(sss sssVar) {
        g(sssVar, true);
    }

    final void g(sss sssVar, boolean z) {
        sts stsVarC = c();
        tko tkoVarL = l(sssVar);
        if (stsVarC.n()) {
            return;
        }
        Animator animator = stsVarC.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!stsVarC.q()) {
            stsVarC.E.j(true != z ? 4 : 8, z);
            if (tkoVarL != null) {
                tkoVarL.b();
                return;
            }
            return;
        }
        snw snwVar = stsVarC.x;
        AnimatorSet animatorSetB = snwVar != null ? stsVarC.b(snwVar, 0.0f, 0.0f, 0.0f) : stsVarC.c(0.0f, 0.4f, 0.4f, sts.d, sts.e);
        animatorSetB.addListener(new stn(stsVarC, z, tkoVarL));
        ArrayList arrayList = stsVarC.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                animatorSetB.addListener((Animator.AnimatorListener) arrayList.get(i));
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    public final void h(sss sssVar) {
        i(sssVar, true);
    }

    final void i(sss sssVar, boolean z) {
        sts stsVarC = c();
        tko tkoVarL = l(sssVar);
        if (stsVarC.o()) {
            return;
        }
        Animator animator = stsVarC.v;
        if (animator != null) {
            animator.cancel();
        }
        snw snwVar = stsVarC.w;
        if (!stsVarC.q()) {
            FloatingActionButton floatingActionButton = stsVarC.E;
            floatingActionButton.j(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            stsVarC.i(1.0f);
            if (tkoVarL != null) {
                tkoVarL.c();
                return;
            }
            return;
        }
        FloatingActionButton floatingActionButton2 = stsVarC.E;
        if (floatingActionButton2.getVisibility() != 0) {
            floatingActionButton2.setAlpha(0.0f);
            float f = snwVar == null ? 0.4f : 0.0f;
            floatingActionButton2.setScaleY(f);
            floatingActionButton2.setScaleX(f);
            stsVarC.i(f);
        }
        snw snwVar2 = stsVarC.w;
        AnimatorSet animatorSetB = snwVar2 != null ? stsVarC.b(snwVar2, 1.0f, 1.0f, 1.0f) : stsVarC.c(1.0f, 1.0f, 1.0f, sts.b, sts.c);
        animatorSetB.addListener(new sto(stsVarC, z, tkoVarL));
        ArrayList arrayList = stsVarC.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                animatorSetB.addListener((Animator.AnimatorListener) arrayList.get(i));
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sts stsVarC = c();
        szk szkVar = stsVarC.m;
        if (szkVar != null) {
            szg.f(stsVarC.E, szkVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c().E.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB = b();
        this.a = (iB - this.k) / 2;
        c().l();
        int iMin = Math.min(View.resolveSize(iB, i), View.resolveSize(iB, i2));
        Rect rect = this.c;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof tbf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tbf tbfVar = (tbf) parcelable;
        super.onRestoreInstanceState(tbfVar.getSuperState());
        tbd tbdVar = this.o;
        Bundle bundle = (Bundle) tbfVar.a.get("expandableWidgetHelper");
        bundle.getClass();
        tbdVar.b = bundle.getBoolean("expanded", false);
        tbdVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (tbdVar.b) {
            View view = (View) tbdVar.c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(view);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        tbf tbfVar = new tbf(parcelableOnSaveInstanceState);
        ko koVar = tbfVar.a;
        tbd tbdVar = this.o;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", tbdVar.b);
        bundle.putInt("expandedComponentIdHint", tbdVar.a);
        koVar.put("expandableWidgetHelper", bundle);
        return tbfVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            e(rect);
            int i = -this.n.a();
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.tab
    public final void p(szq szqVar) {
        c().j(szqVar);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            sts stsVarC = c();
            szk szkVar = stsVarC.m;
            if (szkVar != null) {
                szkVar.setTintList(colorStateList);
            }
            ssx ssxVar = stsVarC.o;
            if (ssxVar != null) {
                ssxVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            szk szkVar = c().m;
            if (szkVar != null) {
                szkVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        szk szkVar = c().m;
        if (szkVar != null) {
            szkVar.M(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            c().k();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.m.setImageResource(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        c().f();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        c().f();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        c().g();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        c().g();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        c().g();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(tde.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, stu.c, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = sin.h(context2, typedArrayA, 1);
        this.f = a.ae(typedArrayA.getInt(2, -1), null);
        this.g = sin.h(context2, typedArrayA, 12);
        this.i = typedArrayA.getInt(7, -1);
        this.j = typedArrayA.getDimensionPixelSize(6, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(4, 0.0f);
        float dimension2 = typedArrayA.getDimension(9, 0.0f);
        float dimension3 = typedArrayA.getDimension(11, 0.0f);
        this.b = typedArrayA.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        sts stsVarC = c();
        if (stsVarC.z != dimensionPixelSize2) {
            stsVarC.z = dimensionPixelSize2;
            stsVarC.k();
        }
        snw snwVarB = snw.b(context2, typedArrayA, 15);
        snw snwVarB2 = snw.b(context2, typedArrayA, 8);
        szq szqVar = new szq(szq.d(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, szq.a));
        boolean z = typedArrayA.getBoolean(5, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.m = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i);
        this.o = new tbd(this);
        c().j(szqVar);
        sts stsVarC2 = c();
        ColorStateList colorStateList2 = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList3 = this.g;
        int i2 = this.h;
        szq szqVar2 = stsVarC2.l;
        szqVar2.getClass();
        stsVarC2.m = new str(szqVar2);
        stsVarC2.m.setTintList(colorStateList2);
        if (mode != null) {
            stsVarC2.m.setTintMode(mode);
        }
        stsVarC2.m.J(stsVarC2.E.getContext());
        if (i2 > 0) {
            Context context3 = stsVarC2.E.getContext();
            szq szqVar3 = stsVarC2.l;
            szqVar3.getClass();
            ssx ssxVar = new ssx(szqVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            ssxVar.c = color;
            ssxVar.d = color2;
            ssxVar.e = color3;
            ssxVar.f = color4;
            float f = i2;
            if (ssxVar.b != f) {
                ssxVar.b = f;
                ssxVar.a.setStrokeWidth(f * 1.3333f);
                ssxVar.g = true;
                ssxVar.invalidateSelf();
            }
            ssxVar.b(colorStateList2);
            stsVarC2.o = ssxVar;
            ssx ssxVar2 = stsVarC2.o;
            ssxVar2.getClass();
            szk szkVar = stsVarC2.m;
            szkVar.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{ssxVar2, szkVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            stsVarC2.o = null;
            layerDrawable = stsVarC2.m;
        }
        stsVarC2.n = new RippleDrawable(syj.b(colorStateList), layerDrawable, drawable);
        stsVarC2.p = stsVarC2.n;
        c().u = dimensionPixelSize;
        c().h(dimension);
        sts stsVarC3 = c();
        if (stsVarC3.s != dimension2) {
            stsVarC3.s = dimension2;
            stsVarC3.e(stsVarC3.r, dimension2, stsVarC3.t);
        }
        sts stsVarC4 = c();
        if (stsVarC4.t != dimension3) {
            stsVarC4.t = dimension3;
            stsVarC4.e(stsVarC4.r, stsVarC4.s, dimension3);
        }
        c().w = snwVarB;
        c().x = snwVarB2;
        c().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }
}
