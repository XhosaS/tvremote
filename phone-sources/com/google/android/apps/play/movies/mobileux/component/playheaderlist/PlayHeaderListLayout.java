package com.google.android.apps.play.movies.mobileux.component.playheaderlist;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.play.widget.ScrollProxyView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.giy;
import defpackage.gls;
import defpackage.kwx;
import defpackage.mjo;
import defpackage.mma;
import defpackage.mpz;
import defpackage.mvo;
import defpackage.mvp;
import defpackage.mvq;
import defpackage.mvr;
import defpackage.mvs;
import defpackage.mvu;
import defpackage.mvw;
import defpackage.mvz;
import defpackage.pku;
import defpackage.teb;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayHeaderListLayout extends FrameLayout implements giy {
    public static final /* synthetic */ int f = 0;
    private static final Map g = new WeakHashMap();
    private int A;
    private int B;
    private teb C;
    private ViewGroup D;
    private SwipeRefreshLayout E;
    private ScrollProxyView F;
    private int G;
    private int H;
    private boolean I;
    private int J;
    private int K;
    private float L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private int Q;
    private int R;
    private boolean S;
    private Drawable T;
    private int U;
    private boolean V;
    private float W;
    public TextView a;
    private boolean aa;
    private float ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private float ag;
    private boolean ah;
    private ObjectAnimator ai;
    private boolean aj;
    private boolean ak;
    private final mvu al;
    private final mvw am;
    private final float an;
    private mvs ao;
    private Map ap;
    private final Runnable aq;
    private final Runnable ar;
    private final Runnable as;
    private pku at;
    public Toolbar b;
    public int c;
    public boolean d;
    public mma e;
    private final Handler h;
    private final gls i;
    private FrameLayout j;
    private teb k;
    private View l;
    private View m;
    private teb n;
    private ViewGroup o;
    private teb p;
    private View q;
    private teb r;
    private FrameLayout s;
    private teb t;
    private View u;
    private PlayHeaderListTabStrip v;
    private TextView w;
    private teb x;
    private PlayHeaderStatusBarUnderlay y;
    private ViewGroup z;

    public PlayHeaderListLayout(Context context) {
        this(context, null);
    }

    private static int A(Context context, int i) {
        if (i == 0 || i == 1) {
            return context.getResources().getDimensionPixelSize(R.dimen.play_header_list_tab_strip_height);
        }
        return 0;
    }

    private final ObjectAnimator B(String str, float f2, float f3) {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.ap.get(str);
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, str, f2, f3);
        this.ap.put(str, objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    private final void C() {
        Toolbar toolbar;
        int[] iArr = cww.a;
        if (!isAttachedToWindow() || (toolbar = this.b) == null || this.ak) {
            return;
        }
        this.ak = true;
        Map map = g;
        Integer num = (Integer) map.get(toolbar);
        map.put(this.b, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        I();
        if (this.O) {
            r(0.0f);
        } else {
            r(1.0f);
        }
        w();
    }

    private final void D(boolean z, boolean z2) {
        if (z == this.aa) {
            return;
        }
        float f2 = true != z ? 0.0f : 1.0f;
        this.aa = z;
        if (z2) {
            B("bannerFraction", this.W, f2).setDuration(200L).start();
        } else {
            s(f2);
        }
        int i = z ? i() : 0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m.getLayoutParams();
        layoutParams.setMargins(0, j(), 0, i);
        this.m.setLayoutParams(layoutParams);
    }

    private final void E(Drawable drawable, boolean z) {
        if (!z) {
            this.o.setBackgroundDrawable(drawable);
            return;
        }
        Drawable background = this.o.getBackground();
        if (background == null) {
            background = new ColorDrawable(0);
        }
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        if (background == drawable) {
            return;
        }
        mvq mvqVar = new mvq(new Drawable[]{background, drawable});
        mvqVar.setCrossFadeEnabled(true);
        mvqVar.startTransition(kwx.JSON3);
        this.o.setBackgroundDrawable(mvqVar);
    }

    private final void F(int i) {
        this.B = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams.height = i + this.U;
        this.o.setLayoutParams(layoutParams);
    }

    private final void G(boolean z, boolean z2) {
        if (this.ae == z) {
            return;
        }
        if (z) {
            float fH = h() + 0.0f;
            float fG = g();
            if (fG != 0.0f) {
                this.ab = Math.max(0.0f, Math.min(1.0f, fH / fG));
            } else {
                this.ab = 1.0f;
            }
        } else {
            this.ab = 0.0f;
        }
        this.ae = z;
        if (!this.P) {
            if (z) {
                E(this.T, z2);
            } else {
                E(new ColorDrawable(0), z2);
            }
        }
        if (this.O) {
            float f2 = true != this.ae ? 0.0f : 1.0f;
            if (z2) {
                float f3 = this.ag;
                if (f2 != f3) {
                    B("actionBarTitleAlpha", f3, f2).setDuration(200L).start();
                }
            } else {
                r(f2);
            }
        }
        I();
        M(z2);
        L();
    }

    private static void H(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    private final void I() {
        boolean z;
        int i = this.R;
        if (i != 1) {
            if (i != 2 && ((this.ae || this.P) && h() > 0.0f)) {
                if (this.j.getVisibility() == 0) {
                    if (getMeasuredHeight() != 0 && (this.ae || this.P)) {
                        float measuredHeight = this.j.getMeasuredHeight();
                        teb tebVar = this.k;
                        View view = tebVar.a;
                        if (Math.max(0.0f, Math.max(0.0f, measuredHeight + (view == null ? tebVar.b : view.getTranslationY())) - h()) > 0.0f) {
                        }
                    }
                }
            }
        } else {
            z = this.ae && h() > 0.0f;
        }
        if (this.af != z) {
            this.af = z;
            if (!this.aj) {
                this.q.setVisibility(true != z ? 4 : 0);
                return;
            }
            boolean z2 = z && ((double) e()) > 0.25d;
            float dimensionPixelSize = z ? getResources().getDimensionPixelSize(R.dimen.play_header_list_floating_elevation) : 0.0f;
            int i2 = true != z ? 0 : 150;
            int i3 = true == z2 ? 100 : 0;
            this.p.a(dimensionPixelSize, i2, i3);
            this.C.a(dimensionPixelSize, i2, i3);
            long j = i3;
            long j2 = i2;
            this.a.animate().z(dimensionPixelSize).setStartDelay(j).setDuration(j2);
            if (this.S) {
                this.y.animate().z(dimensionPixelSize).setStartDelay(j).setDuration(j2);
            }
        }
    }

    private final void J() {
        if (this.aj) {
            return;
        }
        int i = (this.K - this.N) + this.U;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.q.getLayoutParams();
        layoutParams.setMargins(0, i, 0, 0);
        this.q.setLayoutParams(layoutParams);
    }

    private final void K(boolean z) {
        if (this.S) {
            ((FrameLayout.LayoutParams) this.y.getLayoutParams()).height = this.U + this.a.getLayoutParams().height;
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay = this.y;
            int i = this.U;
            if (playHeaderStatusBarUnderlay.c != i) {
                playHeaderStatusBarUnderlay.c = i;
                playHeaderStatusBarUnderlay.invalidate();
            }
            this.y.requestLayout();
            P(this.l, this.U);
            P(this.m, this.U);
            P(this.o, -1);
            this.o.setClipToPadding(false);
            H(this.o, this.U);
            F(this.B);
            J();
            P(this.z, -3);
            if (this.I) {
                H(this.z, this.U);
            }
            if (z) {
                o();
            }
        }
    }

    private final void L() {
        boolean z = this.v.f;
    }

    private final void M(boolean z) {
        if (this.J == 0) {
            boolean z2 = this.Q != 1 ? this.ae : true;
            PlayHeaderListTabStrip playHeaderListTabStrip = this.v;
            PlayHeaderListTabContainer playHeaderListTabContainer = playHeaderListTabStrip.a;
            if (playHeaderListTabContainer.c != z2) {
                playHeaderListTabContainer.c = z2;
                playHeaderListTabContainer.a();
            }
            playHeaderListTabStrip.e = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean N() {
        /*
            r4 = this;
            int r0 = r4.c
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L26
            int r0 = r4.K
            int r1 = r4.N
            int r0 = r0 - r1
            boolean r1 = r4.ae
            float r0 = (float) r0
            if (r1 == 0) goto L19
            float r1 = r4.f()
            float r0 = r0 - r1
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L1a
        L19:
            r1 = 0
        L1a:
            float r0 = r0 + r1
            int r1 = r4.c
            int r0 = java.lang.Math.round(r0)
            if (r1 < r0) goto L24
            goto L26
        L24:
            r0 = r2
            goto L27
        L26:
            r0 = r3
        L27:
            boolean r1 = r4.ae
            if (r0 == r1) goto L2f
            r4.G(r0, r3)
            return r3
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout.N():boolean");
    }

    private final void O(ViewGroup viewGroup) {
        ViewParent viewParent = this.D;
        if (viewParent == viewGroup) {
            return;
        }
        if (viewParent != null) {
            if (viewParent instanceof ListView) {
                ((ListView) viewParent).setOnScrollListener(null);
                this.al.a(true);
            } else if (viewParent instanceof RecyclerView) {
                ((RecyclerView) viewParent).setOnScrollListener(null);
                this.am.a(true);
            } else if (viewParent instanceof mvz) {
                ((mvz) viewParent).b();
            }
            this.ac = true;
        }
        this.D = viewGroup;
        if (viewGroup != null) {
            boolean z = this.ac;
            if (!z) {
                this.ac = viewGroup.isLayoutRequested();
            }
            ViewParent viewParent2 = this.D;
            if (viewParent2 instanceof ListView) {
                ((ListView) viewParent2).setOnScrollListener(this.al);
            } else if (viewParent2 instanceof RecyclerView) {
                ((RecyclerView) viewParent2).setOnScrollListener(this.am);
            } else if (viewParent2 instanceof mvz) {
                ((mvz) viewParent2).b();
            }
            this.ac = z;
        }
    }

    private static final void P(View view, int i) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = i;
        view.requestLayout();
    }

    private final float d() {
        return this.c == -1 ? this.N : Math.max(this.N, this.K - r0);
    }

    protected static View l(Activity activity, int i) {
        return activity.getWindow().findViewById(i);
    }

    public static int y(Context context, int i, int i2) {
        return A(context, 2) + i + i2;
    }

    private final float z() {
        return A(getContext(), this.J);
    }

    protected void b(Toolbar toolbar, float f2) {
        int iMax = (Math.max(0, Math.min(255, Math.round(f2 * 255.0f))) << 24) | (this.M & 16777215);
        toolbar.setTitleTextColor(iMax);
        toolbar.setSubtitleTextColor(iMax);
    }

    protected void c(float f2, float f3) {
        this.C.b(f2 + f3);
    }

    protected final float e() {
        if (this.ae) {
            return this.ab;
        }
        return 0.0f;
    }

    public final float f() {
        return this.A + z() + 0.0f;
    }

    public final float g() {
        return z() + this.A + 0.0f;
    }

    public final float h() {
        return this.ae ? (g() * this.ab) + 0.0f : d() - this.N;
    }

    public final int i() {
        return getResources().getDimensionPixelSize(R.dimen.parental_control_min_height);
    }

    public final int j() {
        if (this.S) {
            return this.U;
        }
        return 0;
    }

    public final int k(ViewGroup viewGroup) {
        View childAt;
        int top;
        int i = 0;
        if (viewGroup instanceof ListView) {
            ListView listView = (ListView) viewGroup;
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int childCount = listView.getChildCount();
            if (firstVisiblePosition != 0 || childCount <= 0) {
                return -1;
            }
            top = listView.getChildAt(0).getTop();
        } else {
            if (!(viewGroup instanceof RecyclerView) && !(viewGroup instanceof mvz)) {
                return -1;
            }
            while (true) {
                if (i >= viewGroup.getChildCount()) {
                    childAt = null;
                    break;
                }
                childAt = viewGroup.getChildAt(i);
                if (childAt.getId() == this.H) {
                    break;
                }
                i++;
            }
            if (childAt == null) {
                return -1;
            }
            top = childAt.getTop();
        }
        return -top;
    }

    public final ViewGroup m() {
        ViewGroup viewGroup = this.z;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.I) {
            return (ViewGroup) l(this.at.c(), R.id.action_bar_container);
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.toolbar_container);
        viewGroup2.setVisibility(0);
        return viewGroup2;
    }

    public final void n(mvr mvrVar) {
        this.at = new pku(mvrVar);
        this.L = 0.7f;
        this.G = R.id.play_header_listview;
        this.H = R.id.play_header_spacer;
        this.I = true;
        this.J = 2;
        this.O = 1 == (mvrVar.m() ^ 1);
        this.R = mvrVar.b();
        this.P = mvrVar.n();
        this.S = mvrVar.j();
        this.Q = mvrVar.n() ? 1 : 0;
        this.aj = true;
        this.V = mvrVar.k();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        getContext();
        this.M = mvrVar.o();
        layoutInflaterFrom.inflate(R.layout.movies_play_header_list_layout, this);
        this.j = (FrameLayout) findViewById(R.id.background_container);
        this.k = new teb(this.j);
        this.l = findViewById(R.id.alt_play_background);
        this.m = findViewById(R.id.content_container);
        this.n = new teb(this.m);
        new ColorDrawable(mvrVar.b.getResources().getColor(R.color.play_main_background));
        this.o = (ViewGroup) findViewById(R.id.controls_container);
        this.p = new teb(this.o);
        this.q = findViewById(R.id.header_shadow);
        this.r = new teb(this.q);
        this.s = (FrameLayout) findViewById(R.id.hero_container);
        this.t = new teb(this.s);
        layoutInflaterFrom.inflate(R.layout.movies_phll_controls_just_tabs, this.o);
        this.u = findViewById(R.id.tab_bar);
        PlayHeaderListTabStrip playHeaderListTabStrip = (PlayHeaderListTabStrip) findViewById(R.id.pager_tab_strip);
        this.v = playHeaderListTabStrip;
        playHeaderListTabStrip.b = this.i;
        if (playHeaderListTabStrip.g != R.drawable.play_header_list_tab_high_contrast_bg) {
            playHeaderListTabStrip.g = R.drawable.play_header_list_tab_high_contrast_bg;
            int childCount = playHeaderListTabStrip.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                playHeaderListTabStrip.a.getChildAt(i).setBackgroundResource(R.drawable.play_header_list_tab_high_contrast_bg);
            }
        }
        this.w = (TextView) findViewById(R.id.tab_bar_title);
        this.K = mvrVar.a();
        int iP = mvrVar.p();
        this.N = iP;
        F(this.K - iP);
        J();
        if (this.I) {
            this.b = mvrVar.h(layoutInflaterFrom, m());
            m().addView(this.b);
            this.at.c().setSupportActionBar(this.b);
        } else {
            this.b = (Toolbar) l(this.at.c(), R.id.action_bar);
        }
        this.A = mvrVar.f(getContext());
        this.z = m();
        this.C = new teb(this.z);
        this.a = (TextView) findViewById(R.id.play_header_banner);
        this.x = new teb(this.a);
        if (this.S) {
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay = (PlayHeaderStatusBarUnderlay) findViewById(R.id.play_header_status_bar_underlay);
            this.y = playHeaderStatusBarUnderlay;
            playHeaderStatusBarUnderlay.setVisibility(0);
            this.y.setOutlineProvider(null);
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay2 = this.y;
            int iD = mvrVar.d();
            int iE = mvrVar.e();
            playHeaderStatusBarUnderlay2.a = iD;
            playHeaderStatusBarUnderlay2.b = iE;
            this.a.setBackground(null);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.E = swipeRefreshLayout;
        swipeRefreshLayout.a = this;
        ScrollProxyView scrollProxyView = (ScrollProxyView) findViewById(R.id.scroll_proxy);
        this.F = scrollProxyView;
        if (scrollProxyView.getScrollY() == 0) {
            this.F.scrollTo(0, 1);
        }
        mvrVar.l(this.j);
        ViewGroup viewGroup = (ViewGroup) this.m;
        mvrVar.i(layoutInflaterFrom, viewGroup);
        if (viewGroup.getChildCount() == 1) {
            View childAt = viewGroup.getChildAt(0);
            int iIndexOfChild = indexOfChild(this.m);
            removeViewAt(iIndexOfChild);
            viewGroup.removeViewAt(0);
            addView(childAt, iIndexOfChild);
            this.m = childAt;
            this.n = new teb(this.m);
        }
        P(this.z, -3);
        if (this.V) {
            c(0.0f, 3.0f);
        } else {
            this.C.b(3.0f);
        }
        P(this.a, -2);
        this.x.b((-i()) + 2);
        int i2 = this.J;
        if (i2 == 0) {
            this.u.setVisibility(0);
            this.w.setVisibility(4);
            this.v.setVisibility(0);
        } else if (i2 != 1) {
            this.u.setVisibility(4);
            this.w.setVisibility(0);
            this.v.setVisibility(0);
        } else {
            this.u.setVisibility(0);
            this.w.setVisibility(0);
            this.v.setVisibility(4);
        }
        this.l.setVisibility(8);
        this.o.setOnHoverListener(new mvp(this));
        if (this.P) {
            E(this.T, false);
        }
        if (this.S) {
            K(false);
        }
        s(this.W);
        M(false);
        L();
        C();
    }

    protected final void o() {
        boolean zX;
        int i;
        int i2 = i();
        int iJ = j();
        float f2 = this.W * (i2 + iJ);
        this.x.b((f2 - i2) + 2.0f);
        float fMax = Math.max(0.0f, f2 - iJ);
        this.n.b(fMax);
        float f3 = fMax + 0.0f;
        float fD = d();
        float fG = g();
        float f4 = f3 + (this.ae ? (-this.K) + 0.0f + (this.ab * fG) + this.N : fD - this.K);
        this.p.b(f4 + 1.0f);
        this.r.b(f4);
        boolean z = false;
        if (this.S) {
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay = this.y;
            boolean z2 = this.ae;
            float f5 = fD - this.N;
            boolean z3 = playHeaderStatusBarUnderlay.e;
            playHeaderStatusBarUnderlay.e = z2 || f5 < fG;
            int iRound = Math.round(f2);
            boolean z4 = playHeaderStatusBarUnderlay.e;
            if (z4 && (i = playHeaderStatusBarUnderlay.c) > iRound) {
                iRound = i;
            }
            if (f2 >= 1.0f || z2) {
                playHeaderStatusBarUnderlay.b(iRound);
                playHeaderStatusBarUnderlay.a(1, false);
            } else {
                int i3 = true != z4 ? 2 : 1;
                if (playHeaderStatusBarUnderlay.d != i3) {
                    if (!z4 && z3) {
                        iRound = playHeaderStatusBarUnderlay.c;
                    }
                    playHeaderStatusBarUnderlay.b(iRound);
                    if (iRound == 0) {
                        playHeaderStatusBarUnderlay.a(2, false);
                    } else {
                        playHeaderStatusBarUnderlay.a(i3, true);
                    }
                }
            }
        }
        float fMin = this.ae ? fMax - ((1.0f - this.ab) * fG) : Math.min(fMax, ((((fD - this.N) + fMax) - z()) - this.A) + 0.0f);
        if (this.V) {
            c(fMax, (fMin - fMax) + 3.0f);
        } else {
            this.C.b(3.0f + fMin);
        }
        float measuredHeight = f4 + (((this.K - this.s.getMeasuredHeight()) - this.N) * 0.5f);
        float f6 = fMin + this.A;
        boolean z5 = measuredHeight >= f6;
        if (this.ad != z5) {
            this.ad = z5;
            float f7 = measuredHeight >= f6 ? 1.0f : 0.0f;
            View view = this.t.a;
            if (view != null) {
                view.animate().scaleX(f7).scaleY(f7).setDuration(100L);
            }
        }
        if (this.c == -1) {
            this.j.setVisibility(4);
        } else {
            if (this.j.getVisibility() == 4) {
                this.j.setVisibility(0);
                z = true;
            }
            int i4 = -this.j.getMeasuredHeight();
            float f8 = this.L;
            float fMax2 = Math.max(i4 / f8, ((-this.c) * f8) + fMax);
            this.k.b(fMax2);
            float measuredHeight2 = (this.j.getMeasuredHeight() + fMax2) - fMax;
            if (z && measuredHeight2 > this.an) {
                View view2 = this.k.a;
                if (view2 != null) {
                    view2.setAlpha(0.0f);
                }
                View view3 = this.k.a;
                if (view3 != null) {
                    view3.animate().alpha(1.0f).setDuration(200L);
                }
            }
        }
        I();
        mma mmaVar = this.e;
        if (mmaVar == null || mmaVar.a == (zX = ((PlayHeaderListLayout) mmaVar.b).x())) {
            return;
        }
        mmaVar.a(zX);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int i = this.U;
        int iMax = Math.max(systemWindowInsetTop, i);
        this.U = iMax;
        if (!this.S) {
            return super.onApplyWindowInsets(windowInsets);
        }
        if (iMax != i) {
            K(true);
        }
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.ak) {
            this.ak = false;
            Map map = g;
            int iIntValue = ((Integer) map.get(this.b)) == null ? 0 : r2.intValue() - 1;
            Integer numValueOf = Integer.valueOf(iIntValue);
            numValueOf.getClass();
            if (iIntValue == 0) {
                map.remove(this.b);
            } else {
                map.put(this.b, numValueOf);
            }
            if (this.V) {
                c(0.0f, 0.0f);
            }
            O(null);
            this.h.removeCallbacksAndMessages(null);
            if (!this.I) {
                numValueOf.getClass();
                if (iIntValue == 0) {
                    this.C.b(0.0f);
                    P(this.z, 0);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r3 = r2
            r2 = r1
            r1.w()
            mvs r4 = r2.ao
            if (r4 == 0) goto L98
            android.view.ViewGroup r4 = r2.D
            if (r4 == 0) goto L98
            boolean r5 = r4 instanceof android.widget.ListView
            r6 = 0
            if (r5 == 0) goto L24
            r5 = r4
            android.widget.ListView r5 = (android.widget.ListView) r5
            android.widget.ListAdapter r5 = r5.getAdapter()
            if (r5 != 0) goto L1f
            goto L70
        L1f:
            int r5 = r5.getCount()
            goto L48
        L24:
            boolean r5 = r4 instanceof android.support.v7.widget.RecyclerView
            if (r5 == 0) goto L36
            r5 = r4
            android.support.v7.widget.RecyclerView r5 = (android.support.v7.widget.RecyclerView) r5
            android.support.v7.widget.RecyclerView$Adapter r5 = r5.getAdapter()
            if (r5 == 0) goto L70
            int r5 = r5.getItemCount()
            goto L48
        L36:
            boolean r5 = r4 instanceof defpackage.mvz
            if (r5 == 0) goto L88
            r5 = r4
            mvz r5 = (defpackage.mvz) r5
            android.widget.Adapter r5 = r5.a()
            if (r5 != 0) goto L44
            goto L70
        L44:
            int r5 = r5.getCount()
        L48:
            r0 = 1
            if (r5 <= r0) goto L70
            int r5 = r4.getChildCount()
            if (r5 <= r0) goto L52
            goto L64
        L52:
            int r5 = r4.getChildCount()
            if (r5 != r0) goto L70
            android.view.View r4 = r4.getChildAt(r6)
            int r4 = r4.getId()
            int r5 = r2.H
            if (r4 == r5) goto L70
        L64:
            android.view.ViewGroup r4 = r2.D
            int r4 = r1.k(r4)
            r2.c = r4
            r1.N()
            goto L76
        L70:
            mvs r4 = r2.ao
            int r4 = r4.a
            r2.c = r4
        L76:
            mvs r4 = r2.ao
            boolean r4 = r4.b
            r2.d = r4
            r1.v(r4, r6)
            r1.o()
            r4 = 0
            r2.ao = r4
            r2.ac = r6
            goto L98
        L88:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Unexpected listview type: "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            throw r3
        L98:
            if (r3 == 0) goto L9d
            r1.I()
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mvs)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mvs mvsVar = (mvs) parcelable;
        super.onRestoreInstanceState(mvsVar.getSuperState());
        this.ao = mvsVar;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new mvs(super.onSaveInstanceState(), this);
    }

    public final void p(int i, int i2, int i3) {
        float f2;
        if (this.ac && i == 0) {
            return;
        }
        this.c = i3;
        boolean z = true;
        if (i == 0) {
            this.ah = z;
        } else if (i == 1) {
            if (i2 > 0.0f) {
                z = false;
            }
            this.ah = z;
        }
        if (!N() && this.ae) {
            float fG = g();
            if (fG == 0.0f) {
                this.ab = 1.0f;
                f2 = 1.0f;
            } else {
                f2 = this.ab - (i2 / fG);
                this.ab = f2;
            }
            this.ab = Math.min(1.0f, Math.max(0.0f, f2));
        }
        o();
    }

    public final void q(int i) {
        Handler handler = this.h;
        Runnable runnable = this.aq;
        handler.removeCallbacks(runnable);
        Runnable runnable2 = this.ar;
        handler.removeCallbacks(runnable2);
        if (i == 0) {
            boolean z = false;
            boolean z2 = d() - ((float) this.N) > 0.0f;
            if (this.ah) {
                float f2 = this.A;
                float fH = h();
                if (z2 || fH >= f2 * 0.5f) {
                    z = true;
                }
            } else {
                z = z2;
            }
            this.d = z;
            if (true == z) {
                runnable = runnable2;
            }
            handler.postDelayed(runnable, 50L);
        }
    }

    protected final void r(float f2) {
        if (this.ag != f2) {
            this.ag = f2;
            b(this.b, f2);
        }
    }

    protected final void s(float f2) {
        if (f2 == this.W) {
            return;
        }
        this.W = f2;
        o();
    }

    public final void t(CharSequence charSequence, boolean z) {
        this.h.removeCallbacks(this.as);
        if (charSequence == null) {
            D(false, z);
            this.a.setVisibility(8);
        } else {
            this.a.setText(charSequence);
            this.a.setVisibility(0);
            D(true, z);
        }
    }

    public final void u(Drawable drawable) {
        this.T = drawable;
        if ((this.o == null || !this.ae) && !this.P) {
            return;
        }
        E(drawable, false);
    }

    public final void v(boolean z, boolean z2) {
        float f2;
        Handler handler = this.h;
        handler.removeCallbacks(this.aq);
        handler.removeCallbacks(this.ar);
        float fH = h();
        float f3 = f();
        if (z) {
            f2 = -1.0f;
        } else {
            if (d() - this.N > 0.0f) {
                return;
            }
            f3 += 1.0f;
            f2 = 0.0f;
        }
        if (fH <= f2 || fH >= f3) {
            return;
        }
        float f4 = true != z ? 0.0f : 1.0f;
        this.d = z;
        if (!this.ae) {
            G(true, z2);
        }
        if (!z2) {
            if (!this.ae || this.ab == f4) {
                return;
            }
            this.ab = f4;
            o();
            return;
        }
        ObjectAnimator objectAnimator = this.ai;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.ai = null;
        }
        ObjectAnimator duration = B("floatingFraction", e(), f4).setDuration(200L);
        this.ai = duration;
        duration.start();
    }

    public final void w() {
        View viewFindViewById = this.m.findViewById(this.G);
        if (viewFindViewById != null && !(viewFindViewById instanceof ListView) && !(viewFindViewById instanceof RecyclerView) && !(viewFindViewById instanceof mvz)) {
            throw new IllegalStateException("Found a view that isn't a ListView or a RecyclerView or a PlayScrollableContentView implementation");
        }
        O((ViewGroup) viewFindViewById);
    }

    public final boolean x() {
        return this.ae || this.P;
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Handler();
        this.i = new mvo(this);
        this.ad = true;
        this.ag = 0.5f;
        this.ah = true;
        this.al = new mvu(this);
        this.am = new mvw(this);
        new mjo((short[]) null);
        this.ap = new HashMap();
        this.aq = new mpz(this, 9);
        this.ar = new mpz(this, 10);
        this.as = new mpz(this, 11);
        this.an = context.getResources().getDisplayMetrics().density * 20.0f;
    }

    @Override // defpackage.giy
    public final void a() {
    }
}
