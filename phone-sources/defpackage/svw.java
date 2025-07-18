package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.BaselineLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class svw extends FrameLayout implements svz {
    private float A;
    private float B;
    private float C;
    private int D;
    private boolean E;
    private final LinearLayout F;
    private final FrameLayout G;
    private final TextView H;
    private final TextView I;
    private final TextView J;
    private final TextView K;
    private BaselineLayout L;
    private int M;
    private int N;
    private int O;
    private int P;
    private ColorStateList Q;
    private boolean R;
    private ColorStateList S;
    private Drawable T;
    private Drawable U;
    private ValueAnimator V;
    private boolean W;
    public boolean a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private sim ak;
    Drawable b;
    public final LinearLayout c;
    public final View d;
    public final ImageView e;
    public final BaselineLayout f;
    public final BaselineLayout g;
    public MenuItemImpl h;
    public float i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public soo n;
    public int o;
    public boolean p;
    public Rect q;
    private ColorStateList s;
    private int t;
    private int u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z;
    private static final int[] r = {R.attr.state_checked};
    private static final sim ai = new sim(null, null);
    private static final sim aj = new svv();

    public svw(Context context) throws Resources.NotFoundException {
        super(context);
        this.a = false;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.R = false;
        this.ak = ai;
        this.i = 0.0f;
        this.W = false;
        this.j = 0;
        this.aa = 0;
        this.k = -2;
        this.ab = 0;
        this.l = false;
        this.m = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 49;
        this.af = false;
        this.p = false;
        this.ag = false;
        this.ah = false;
        this.q = new Rect();
        LayoutInflater.from(context).inflate(b(), (ViewGroup) this, true);
        this.F = (LinearLayout) findViewById(com.google.android.videos.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.google.android.videos.R.id.navigation_bar_item_inner_content_container);
        this.c = linearLayout;
        this.d = findViewById(com.google.android.videos.R.id.navigation_bar_item_active_indicator_view);
        this.G = (FrameLayout) findViewById(com.google.android.videos.R.id.navigation_bar_item_icon_container);
        this.e = (ImageView) findViewById(com.google.android.videos.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.google.android.videos.R.id.navigation_bar_item_labels_group);
        this.f = baselineLayout;
        TextView textView = (TextView) findViewById(com.google.android.videos.R.id.navigation_bar_item_small_label_view);
        this.H = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.videos.R.id.navigation_bar_item_large_label_view);
        this.I = textView2;
        float dimension = getResources().getDimension(com.google.android.videos.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.google.android.videos.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.g = baselineLayout2;
        baselineLayout2.setVisibility(8);
        baselineLayout2.setDuplicateParentStateEnabled(true);
        baselineLayout2.a = this.ag;
        TextView textView3 = new TextView(getContext());
        this.J = textView3;
        textView3.setMaxLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setDuplicateParentStateEnabled(true);
        textView3.setIncludeFontPadding(false);
        textView3.setGravity(16);
        textView3.setTextSize(dimension);
        TextView textView4 = new TextView(getContext());
        this.K = textView4;
        textView4.setMaxLines(1);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setDuplicateParentStateEnabled(true);
        textView4.setVisibility(4);
        textView4.setIncludeFontPadding(false);
        textView4.setGravity(16);
        textView4.setTextSize(dimension2);
        baselineLayout2.addView(textView3);
        baselineLayout2.addView(textView4);
        this.L = baselineLayout;
        setBackgroundResource(com.google.android.videos.R.drawable.mtrl_navigation_bar_item_background);
        this.t = getResources().getDimensionPixelSize(a());
        this.u = baselineLayout.getPaddingBottom();
        this.v = 0;
        this.w = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        textView3.setImportantForAccessibility(2);
        textView4.setImportantForAccessibility(2);
        setFocusable(true);
        M();
        this.ab = getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new fta(this, 6));
    }

    private final void M() {
        TextView textView = this.I;
        float textSize = this.H.getTextSize();
        float textSize2 = textView.getTextSize();
        this.x = textSize - textSize2;
        this.y = textSize2 / textSize;
        this.z = textSize / textSize2;
        TextView textView2 = this.K;
        float textSize3 = this.J.getTextSize();
        float textSize4 = textView2.getTextSize();
        this.A = textSize3 - textSize4;
        this.B = textSize4 / textSize3;
        this.C = textSize3 / textSize4;
    }

    private final void N() {
        MenuItemImpl menuItemImpl = this.h;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    private final void O() {
        Drawable rippleDrawable = this.b;
        boolean z = true;
        RippleDrawable rippleDrawable2 = null;
        if (this.s != null) {
            Drawable drawableC = c();
            if (this.W && c() != null && drawableC != null) {
                rippleDrawable2 = new RippleDrawable(syj.b(this.s), null, drawableC);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(syj.a(this.s), null, null);
            }
        }
        FrameLayout frameLayout = this.G;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    private final void P() {
        int i = this.e.getLayoutParams().width > 0 ? this.w : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    private final void Q(View view, View view2, float f, float f2) {
        T(this.F, this.o == 0 ? (int) (this.t + f2) : 0, 0, this.ae);
        T(this.c, this.o == 0 ? 0 : this.q.top, this.o == 0 ? 0 : this.q.bottom, this.o == 0 ? 17 : 8388627);
        Z(this.f, this.u);
        this.L.setVisibility(0);
        U(view, 1.0f, 1.0f, 0);
        U(view2, f, f, 4);
    }

    private final void R() {
        int i = this.t;
        T(this.F, i, i, this.o == 0 ? 17 : this.ae);
        T(this.c, 0, 0, 17);
        Z(this.f, 0);
        this.L.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void S(android.widget.TextView r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.ah
            if (r0 != 0) goto L59
            r5.setTextAppearance(r6)
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 != 0) goto L10
        Le:
            r6 = r1
            goto L52
        L10:
            int[] r2 = android.support.v7.appcompat.R.styleable.TextAppearance
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r3 = r6.getValue(r3, r2)
            r6.recycle()
            if (r3 != 0) goto L27
            goto Le
        L27:
            int r6 = r2.getComplexUnit()
            r3 = 2
            if (r6 != r3) goto L44
            int r6 = r2.data
            float r6 = android.util.TypedValue.complexToFloat(r6)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            goto L52
        L44:
            int r6 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = android.util.TypedValue.complexToDimensionPixelSize(r6, r0)
        L52:
            if (r6 == 0) goto L58
            float r6 = (float) r6
            r5.setTextSize(r1, r6)
        L58:
            return
        L59:
            r5.setTextAppearance(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svw.S(android.widget.TextView, int):void");
    }

    private static void T(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private static void U(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private final void V(View view) {
        if (L()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                soo sooVar = this.n;
                if (sooVar != null) {
                    if (sooVar.c() != null) {
                        sooVar.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(sooVar);
                    }
                }
            }
            this.n = null;
        }
    }

    private final void W() {
        TextView textView = this.I;
        textView.setTypeface(textView.getTypeface(), this.R ? 1 : 0);
        TextView textView2 = this.K;
        textView2.setTypeface(textView2.getTypeface(), this.R ? 1 : 0);
    }

    private final void X(TextView textView, int i) throws Resources.NotFoundException {
        if (textView == null) {
            return;
        }
        S(textView, i);
        M();
        textView.setMinimumHeight(sin.n(textView.getContext(), i));
        ColorStateList colorStateList = this.Q;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        W();
    }

    private final void Y(TextView textView, int i) throws Resources.NotFoundException {
        if (textView == null) {
            return;
        }
        S(textView, i);
        M();
        textView.setMinimumHeight(sin.n(textView.getContext(), i));
        ColorStateList colorStateList = this.Q;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private static void Z(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private final boolean aa() {
        return this.l && this.D == 2;
    }

    private static final void ab(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void A(boolean z) throws Resources.NotFoundException {
        this.ah = z;
        F(this.M);
        H(this.N);
        p(this.O);
        q(this.P);
    }

    public final void B(int i) {
        TextView textView = this.H;
        textView.setMaxLines(i);
        TextView textView2 = this.I;
        textView2.setMaxLines(i);
        this.J.setMaxLines(i);
        this.K.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public final void C(int i) {
        if (this.D != i) {
            this.D = i;
            if (aa()) {
                this.ak = aj;
            } else {
                this.ak = ai;
            }
            J(getWidth());
            N();
        }
    }

    public final void D(boolean z) {
        this.ag = z;
        this.f.a = z;
        this.H.setIncludeFontPadding(z);
        this.I.setIncludeFontPadding(z);
        this.g.a = z;
        this.J.setIncludeFontPadding(z);
        this.K.setIncludeFontPadding(z);
        requestLayout();
    }

    public final void E(boolean z) {
        if (this.E != z) {
            this.E = z;
            N();
        }
    }

    public final void F(int i) throws Resources.NotFoundException {
        this.M = i;
        X(this.I, i);
    }

    public final void G(boolean z) throws Resources.NotFoundException {
        this.R = z;
        F(this.M);
        p(this.O);
        W();
    }

    public final void H(int i) throws Resources.NotFoundException {
        this.N = i;
        Y(this.H, i);
    }

    public final void I(ColorStateList colorStateList) {
        this.Q = colorStateList;
        if (colorStateList != null) {
            this.H.setTextColor(colorStateList);
            this.I.setTextColor(colorStateList);
            this.J.setTextColor(colorStateList);
            this.K.setTextColor(colorStateList);
        }
    }

    public final void J(int i) {
        if (i > 0 || getVisibility() != 0) {
            int i2 = this.j;
            int i3 = this.m;
            int iMin = Math.min(i2, i - (i3 + i3));
            int iMax = this.aa;
            if (this.o == 1) {
                int i4 = this.ac;
                int measuredWidth = i - (i4 + i4);
                int i5 = this.k;
                if (i5 != -1) {
                    measuredWidth = i5 == -2 ? this.F.getMeasuredWidth() : Math.min(i5, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.ab, this.c.getMeasuredHeight());
            }
            View view = this.d;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (true == aa()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void K() {
        MenuItemImpl menuItemImpl = this.h;
        if (menuItemImpl != null) {
            int i = 8;
            if (menuItemImpl.isVisible() && (this.af || !this.p)) {
                i = 0;
            }
            setVisibility(i);
        }
    }

    public final boolean L() {
        return this.n != null;
    }

    protected int a() {
        throw null;
    }

    protected abstract int b();

    public final Drawable c() {
        return this.d.getBackground();
    }

    final void d() {
        V(this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.W) {
            this.G.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(Drawable drawable) {
        this.d.setBackground(drawable);
        O();
    }

    @Override // defpackage.svz
    public final void ex(boolean z) {
        this.af = z;
        K();
    }

    public final void f(boolean z) {
        this.W = z;
        O();
        this.d.setVisibility(true != z ? 8 : 0);
        requestLayout();
    }

    public final void g(int i) {
        this.ab = i;
        J(getWidth());
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final MenuItemImpl getItemData() {
        return this.h;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        if (this.o == 1) {
            LinearLayout linearLayout = this.c;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.f;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        int measuredWidth = layoutParams2.leftMargin + baselineLayout.getMeasuredWidth() + layoutParams2.rightMargin;
        soo sooVar = this.n;
        int minimumWidth = sooVar == null ? 0 : sooVar.getMinimumWidth() - this.n.b.g();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.G.getLayoutParams();
        return Math.max(Math.max(minimumWidth, layoutParams3.leftMargin) + this.e.getMeasuredWidth() + Math.max(minimumWidth, layoutParams3.rightMargin), measuredWidth);
    }

    public final void h(int i) {
        this.ac = i;
        if (this.o == 1) {
            setPadding(i, 0, i, 0);
        }
        J(getWidth());
    }

    public final void i(int i) {
        this.k = i;
        J(getWidth());
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i) {
        this.h = menuItemImpl;
        menuItemImpl.isCheckable();
        refreshDrawableState();
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        Drawable icon = menuItemImpl.getIcon();
        if (icon != this.T) {
            this.T = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = icon.mutate();
                this.U = icon;
                ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    icon.setTintList(colorStateList);
                }
            }
            this.e.setImageDrawable(icon);
        }
        CharSequence title = menuItemImpl.getTitle();
        this.H.setText(title);
        this.I.setText(title);
        this.J.setText(title);
        this.K.setText(title);
        MenuItemImpl menuItemImpl2 = this.h;
        if (menuItemImpl2 == null || TextUtils.isEmpty(menuItemImpl2.getContentDescription())) {
            setContentDescription(title);
        }
        MenuItemImpl menuItemImpl3 = this.h;
        if (menuItemImpl3 != null && !TextUtils.isEmpty(menuItemImpl3.getTooltipText())) {
            title = this.h.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, title);
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        K();
        this.a = true;
    }

    public final void j(int i) {
        this.aa = i;
        J(getWidth());
    }

    public final void k(int i) {
        if (this.v != i) {
            this.v = i;
            ((LinearLayout.LayoutParams) this.f.getLayoutParams()).topMargin = i;
            BaselineLayout baselineLayout = this.g;
            if (baselineLayout.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public final void l(int i) {
        this.m = i;
        J(getWidth());
    }

    public final void m(float f, float f2) {
        sim simVar = this.ak;
        View view = this.d;
        view.setScaleX(sim.j(f));
        view.setScaleY(simVar.i(f));
        view.setAlpha(sns.a(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.i = f;
    }

    public final void n(int i) {
        this.j = i;
        J(getWidth());
    }

    final void o(soo sooVar) {
        ImageView imageView;
        if (this.n == sooVar) {
            return;
        }
        if (L() && (imageView = this.e) != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            V(imageView);
        }
        this.n = sooVar;
        int i = this.ad;
        soq soqVar = sooVar.b;
        if (soqVar.l != i) {
            soqVar.l = i;
            sooVar.j();
        }
        ImageView imageView2 = this.e;
        if (imageView2 == null || !L()) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        soo sooVar2 = this.n;
        sin.a(sooVar2, imageView2);
        if (sooVar2.c() != null) {
            sooVar2.c().setForeground(sooVar2);
        } else {
            imageView2.getOverlay().add(sooVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.h;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && menuItemImpl.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        soo sooVar = this.n;
        if (sooVar != null && sooVar.isVisible()) {
            CharSequence title = this.h.getTitle();
            if (!TextUtils.isEmpty(this.h.getContentDescription())) {
                title = this.h.getContentDescription();
            }
            String strValueOf = String.valueOf(title);
            soo sooVar2 = this.n;
            Object quantityString = null;
            if (sooVar2.isVisible()) {
                if (sooVar2.l()) {
                    quantityString = sooVar2.b.b.o;
                    if (quantityString == null) {
                        quantityString = sooVar2.d();
                    }
                } else if (sooVar2.k()) {
                    soq soqVar = sooVar2.b;
                    if (soqVar.f() != 0 && (context = (Context) sooVar2.a.get()) != null) {
                        int i = sooVar2.c;
                        quantityString = (i == -2 || sooVar2.b() <= i) ? context.getResources().getQuantityString(soqVar.f(), sooVar2.b(), Integer.valueOf(sooVar2.b())) : context.getString(soqVar.b.r, Integer.valueOf(i));
                    }
                } else {
                    quantityString = sooVar2.b.b.p;
                }
            }
            accessibilityNodeInfo.setContentDescription(strValueOf + ", " + String.valueOf(quantityString));
        }
        cyq cyqVar = new cyq(accessibilityNodeInfo);
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < iIndexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof svw) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        cyqVar.w(cxe.j(0, 1, i2, 1, isSelected()));
        if (isSelected()) {
            cyqVar.u(false);
            cyqVar.ai(cyp.a);
        }
        cyqVar.N(getResources().getString(com.google.android.videos.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new csl(this, i, 18, (char[]) null));
    }

    public final void p(int i) throws Resources.NotFoundException {
        this.O = i;
        if (i == 0) {
            i = this.M;
        }
        X(this.K, i);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    public final void q(int i) throws Resources.NotFoundException {
        this.P = i;
        if (i == 0) {
            i = this.N;
        }
        Y(this.J, i);
    }

    public final void r(int i) {
        if (this.w != i) {
            this.w = i;
            P();
            requestLayout();
        }
    }

    public final void s(int i) {
        ImageView imageView = this.e;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        P();
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setChecked(boolean z) {
        TextView textView = this.I;
        ab(textView);
        TextView textView2 = this.H;
        ab(textView2);
        TextView textView3 = this.K;
        ab(textView3);
        TextView textView4 = this.J;
        ab(textView4);
        boolean z2 = this.W;
        float f = true != z ? 0.0f : 1.0f;
        if (z2 && this.a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.i, f);
            this.V = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new svu(this, f));
            this.V.setInterpolator(sim.k(getContext(), com.google.android.videos.R.attr.motionEasingEmphasizedInterpolator, sns.b));
            this.V.setDuration(sim.b(getContext(), com.google.android.videos.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.videos.R.integer.material_motion_duration_long_1)));
            this.V.start();
        } else {
            m(f, f);
        }
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.z;
        if (this.o == 1) {
            f2 = this.A;
            f3 = this.B;
            f4 = this.C;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.D;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        R();
                    }
                } else if (z) {
                    Q(textView, textView2, f3, f2);
                    z = true;
                } else {
                    Q(textView2, textView, f4, 0.0f);
                    z = false;
                }
            } else if (z) {
                Q(textView, textView2, f3, 0.0f);
                z = true;
            } else {
                R();
                z = false;
            }
        } else if (this.E) {
            if (z) {
                Q(textView, textView2, f3, 0.0f);
                z = true;
            } else {
                R();
                z = false;
            }
        } else if (z) {
            Q(textView, textView2, f3, f2);
            z = true;
        } else {
            Q(textView2, textView, f4, 0.0f);
            z = false;
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View, android.support.v7.view.menu.MenuView.ItemView
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.H.setEnabled(z);
        this.I.setEnabled(z);
        this.J.setEnabled(z);
        this.K.setEnabled(z);
        this.e.setEnabled(z);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setIcon(Drawable drawable) {
        if (drawable == this.T) {
            return;
        }
        this.T = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.U = drawable;
            ColorStateList colorStateList = this.S;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.e.setImageDrawable(drawable);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setTitle(CharSequence charSequence) {
        this.H.setText(charSequence);
        this.I.setText(charSequence);
        this.J.setText(charSequence);
        this.K.setText(charSequence);
        MenuItemImpl menuItemImpl = this.h;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.h;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.h.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return true;
    }

    public final void t(ColorStateList colorStateList) {
        Drawable drawable;
        this.S = colorStateList;
        if (this.h == null || (drawable = this.U) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.U.invalidateSelf();
    }

    public final void u(int i) {
        Drawable drawable = i == 0 ? null : getContext().getDrawable(i);
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.b = drawable;
        O();
    }

    public final void v(int i) {
        this.ae = i;
        requestLayout();
    }

    public final void w(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.o != i) {
            this.o = i;
            this.ad = 0;
            BaselineLayout baselineLayout = this.f;
            this.L = baselineLayout;
            int i8 = 8;
            if (i == 1) {
                BaselineLayout baselineLayout2 = this.g;
                if (baselineLayout2.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    this.c.addView(baselineLayout2, layoutParams);
                    P();
                }
                i3 = this.q.left;
                i4 = this.q.right;
                i5 = this.q.top;
                i6 = this.q.bottom;
                this.ad = 1;
                i2 = this.ac;
                this.L = baselineLayout2;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            this.g.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.F.getLayoutParams()).gravity = this.ae;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i4;
            layoutParams2.topMargin = i5;
            layoutParams2.bottomMargin = i6;
            setPadding(i2, 0, i2, 0);
            J(getWidth());
            O();
        }
    }

    public final void x(int i) {
        if (this.u != i) {
            this.u = i;
            N();
        }
    }

    public final void y(int i) {
        if (this.t != i) {
            this.t = i;
            N();
        }
    }

    public final void z(ColorStateList colorStateList) {
        this.s = colorStateList;
        O();
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z, char c) {
    }
}
