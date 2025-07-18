package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.videos.R;
import defpackage.cqu;
import defpackage.cqx;
import defpackage.fta;
import defpackage.kwx;
import defpackage.sil;
import defpackage.sim;
import defpackage.sin;
import defpackage.slt;
import defpackage.snw;
import defpackage.spe;
import defpackage.spi;
import defpackage.spj;
import defpackage.spk;
import defpackage.spl;
import defpackage.spn;
import defpackage.spo;
import defpackage.spp;
import defpackage.stk;
import defpackage.stl;
import defpackage.sts;
import defpackage.suo;
import defpackage.suy;
import defpackage.sva;
import defpackage.swp;
import defpackage.szg;
import defpackage.szk;
import defpackage.szp;
import defpackage.szq;
import defpackage.tde;
import defpackage.zft;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements cqu {
    public final szk a;
    public Animator b;
    public Animator c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final boolean h;
    public boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public AnimatorListenerAdapter r;
    zft s;
    private Integer t;
    private int u;
    private int v;
    private int w;
    private Behavior x;

    public BottomAppBar(Context context) {
        this(context, null);
    }

    private final ActionMenuView x() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private final boolean y() {
        FloatingActionButton floatingActionButtonL = l();
        return floatingActionButtonL != null && floatingActionButtonL.c().o();
    }

    public final float b() {
        return k().d;
    }

    public final float c() {
        return k().b;
    }

    public final float d() {
        return k().a;
    }

    public final float e() {
        return f(this.d);
    }

    public final float f(int i) {
        boolean zP = sil.p(this);
        if (i != 1) {
            return 0.0f;
        }
        View viewI = i();
        int measuredWidth = (zP ? this.q : this.p) + ((this.u == -1 || viewI == null) ? this.g : (viewI.getMeasuredWidth() / 2) + this.u);
        return ((getMeasuredWidth() / 2) - measuredWidth) * (true == zP ? -1 : 1);
    }

    public final int g(ActionMenuView actionMenuView, int i, boolean z) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.v != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zP = sil.p(this);
        int measuredWidth = zP ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) == 8388611) {
                measuredWidth = zP ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zP ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i3 = zP ? this.p : -this.q;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zP) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    public final int h() {
        return sim.b(getContext(), R.attr.motionDurationLong2, kwx.JSON3);
    }

    public final View i() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).b(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof stk)) {
                return view;
            }
        }
        return null;
    }

    @Override // defpackage.cqu
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Behavior a() {
        if (this.x == null) {
            this.x = new Behavior();
        }
        return this.x;
    }

    public final spo k() {
        return (spo) this.a.F().f;
    }

    public final FloatingActionButton l() {
        View viewI = i();
        if (viewI instanceof FloatingActionButton) {
            return (FloatingActionButton) viewI;
        }
        return null;
    }

    public final void m() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.b;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public final void n() {
        this.w--;
    }

    public final void o() {
        this.w++;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        szg.f(this, this.a);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m();
            t();
            View viewI = i();
            if (viewI != null && viewI.isLaidOut()) {
                viewI.post(new slt(viewI, 5));
            }
        }
        r();
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof spn)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        spn spnVar = (spn) parcelable;
        super.onRestoreInstanceState(spnVar.getSuperState());
        this.d = spnVar.a;
        this.n = spnVar.b;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        spn spnVar = new spn(super.onSaveInstanceState());
        spnVar.a = this.d;
        spnVar.b = this.n;
        return spnVar;
    }

    public final void p(int i, boolean z) {
        if (!isLaidOut()) {
            this.m = false;
            q(0);
            return;
        }
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        boolean zY = y();
        boolean z2 = z & zY;
        if (true != zY) {
            i = 0;
        }
        ActionMenuView actionMenuViewX = x();
        if (actionMenuViewX != null) {
            float fH = h();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuViewX, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fH));
            if (Math.abs(actionMenuViewX.getTranslationX() - g(actionMenuViewX, i, z2)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuViewX, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fH * 0.2f));
                objectAnimatorOfFloat2.addListener(new spj(this, actionMenuViewX, i, z2));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuViewX.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.c = animatorSet2;
        animatorSet2.addListener(new spi(this));
        this.c.start();
    }

    public final void q(int i) {
        if (i != 0) {
            getMenu().clear();
            inflateMenu(i);
        }
    }

    public final void r() {
        ActionMenuView actionMenuViewX = x();
        if (actionMenuViewX == null || this.c != null) {
            return;
        }
        actionMenuViewX.setAlpha(1.0f);
        if (y()) {
            w(actionMenuViewX, this.d, this.n);
        } else {
            w(actionMenuViewX, 0, false);
        }
    }

    public final void s(float f) {
        if (f != b()) {
            k().b(f);
            this.a.invalidateSelf();
            t();
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        szk szkVar = this.a;
        szkVar.M(f);
        int iB = szkVar.s.s - szkVar.B();
        Behavior behaviorA = a();
        behaviorA.e = iB;
        if (behaviorA.d == 1) {
            setTranslationY(behaviorA.a + iB);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.t != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.t.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public final void t() {
        float f;
        k().e = e();
        float f2 = 0.0f;
        if (this.n && y() && this.f == 1) {
            f2 = 1.0f;
        }
        this.a.O(f2);
        View viewI = i();
        if (viewI != null) {
            if (this.f == 1) {
                f = -k().d;
            } else {
                View viewI2 = i();
                f = viewI2 != null ? (-((getMeasuredHeight() + this.o) - viewI2.getMeasuredHeight())) / 2 : 0;
            }
            viewI.setTranslationY(f);
            viewI.setTranslationX(e());
        }
    }

    public final void u(float f) {
        if (f != c()) {
            k().b = f;
            this.a.invalidateSelf();
        }
    }

    public final void v(float f) {
        if (f != d()) {
            k().a = f;
            this.a.invalidateSelf();
        }
    }

    public final void w(ActionMenuView actionMenuView, int i, boolean z) {
        new spk(this, actionMenuView, i, z).run();
    }

    /* compiled from: PG */
    public class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect g;
        public WeakReference h;
        public int i;
        private final View.OnLayoutChangeListener j;

        public Behavior() {
            this.j = new fta(this, 5, null);
            this.g = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.h = new WeakReference(bottomAppBar);
            View viewI = bottomAppBar.i();
            if (viewI != null && !viewI.isLaidOut()) {
                cqx cqxVar = (cqx) viewI.getLayoutParams();
                cqxVar.d = 17;
                int i2 = bottomAppBar.f;
                if (i2 == 1) {
                    cqxVar.d = 49;
                } else if (i2 == 0) {
                    cqxVar.d = 81;
                }
                this.i = ((cqx) viewI.getLayoutParams()).bottomMargin;
                if (viewI instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewI;
                    if (bottomAppBar.f == 0 && bottomAppBar.h) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.c().h(0.0f);
                    }
                    if (floatingActionButton.c().w == null) {
                        floatingActionButton.c().w = snw.c(floatingActionButton.getContext(), R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.c().x == null) {
                        floatingActionButton.c().x = snw.c(floatingActionButton.getContext(), R.animator.mtrl_fab_hide_motion_spec);
                    }
                    AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.r;
                    sts stsVarC = floatingActionButton.c();
                    if (stsVarC.C == null) {
                        stsVarC.C = new ArrayList();
                    }
                    stsVarC.C.add(animatorListenerAdapter);
                    spl splVar = new spl(bottomAppBar);
                    sts stsVarC2 = floatingActionButton.c();
                    if (stsVarC2.B == null) {
                        stsVarC2.B = new ArrayList();
                    }
                    stsVarC2.B.add(splVar);
                    zft zftVar = bottomAppBar.s;
                    sts stsVarC3 = floatingActionButton.c();
                    stl stlVar = new stl(floatingActionButton, zftVar);
                    if (stsVarC3.D == null) {
                        stsVarC3.D = new ArrayList();
                    }
                    stsVarC3.D.add(stlVar);
                }
                viewI.addOnLayoutChangeListener(this.j);
                bottomAppBar.t();
            }
            coordinatorLayout.f(bottomAppBar, i);
            super.f(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.i && super.h(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.j = new fta(this, 5, null);
            this.g = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i);
        szk szkVar = new szk();
        this.a = szkVar;
        this.w = 0;
        this.m = false;
        this.n = true;
        this.r = new spe(this);
        this.s = new zft(this, null);
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, spp.a, i, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListH = sin.h(context2, typedArrayA, 1);
        if (typedArrayA.hasValue(12)) {
            this.t = Integer.valueOf(typedArrayA.getColor(12, -1));
            Drawable navigationIcon = getNavigationIcon();
            if (navigationIcon != null) {
                setNavigationIcon(navigationIcon);
            }
        }
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayA.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayA.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayA.getDimensionPixelOffset(9, 0);
        this.d = typedArrayA.getInt(3, 0);
        this.e = typedArrayA.getInt(6, 0);
        this.f = typedArrayA.getInt(5, 1);
        this.h = typedArrayA.getBoolean(16, true);
        this.v = typedArrayA.getInt(11, 0);
        this.i = typedArrayA.getBoolean(10, false);
        this.j = typedArrayA.getBoolean(13, false);
        this.k = typedArrayA.getBoolean(14, false);
        this.l = typedArrayA.getBoolean(15, false);
        this.u = typedArrayA.getDimensionPixelOffset(4, -1);
        boolean z = typedArrayA.getBoolean(0, true);
        typedArrayA.recycle();
        this.g = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        spo spoVar = new spo(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        szp szpVar = new szp();
        szpVar.e = spoVar;
        szkVar.p(new szq(szpVar));
        if (z) {
            szkVar.Q(2);
        } else {
            szkVar.Q(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        szkVar.P(Paint.Style.FILL);
        szkVar.J(context2);
        szkVar.setTintList(colorStateListH);
        setElevation(dimensionPixelSize);
        setBackground(szkVar);
        swp swpVar = new swp(this, 1);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, suo.c, i, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
        sil.n(this, new sva(z2, z3, z4, swpVar));
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void setTitle(CharSequence charSequence) {
    }
}
