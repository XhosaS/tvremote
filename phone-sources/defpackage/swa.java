package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class swa extends ViewGroup implements MenuView {
    public int A;
    public int B;
    public int C;
    public szq D;
    public boolean E;
    public ColorStateList F;
    public swd G;
    public svy H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public final Rect O;
    private final View.OnClickListener Q;
    private cuj R;
    private final SparseArray S;
    private ColorStateList T;
    private final ColorStateList U;
    private int V;
    private MenuItem W;
    public final gkc b;
    public int c;
    public int d;
    public svz[] e;
    public int f;
    public int g;
    public int h;
    public ColorStateList i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public ColorStateList o;
    public int p;
    public final SparseArray q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;
    private static final int[] a = {R.attr.state_checked};
    private static final int[] P = {-16842910};

    public swa(Context context) {
        super(context);
        this.S = new SparseArray();
        this.f = -1;
        this.g = -1;
        this.q = new SparseArray();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.C = 49;
        this.E = false;
        this.K = 1;
        this.V = 0;
        this.W = null;
        this.M = 7;
        this.N = false;
        this.O = new Rect();
        this.U = k();
        if (isInEditMode()) {
            this.b = null;
        } else {
            gkc gkcVar = new gkc(null);
            this.b = gkcVar;
            gkcVar.R(0);
            gkcVar.F(TextView.class);
            gkcVar.I(sim.b(getContext(), com.google.android.videos.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.videos.R.integer.material_motion_duration_long_1)));
            gkcVar.J(sim.k(getContext(), com.google.android.videos.R.attr.motionEasingStandard, sns.b));
            gkcVar.P(new suw());
        }
        this.Q = new phn(this, 18, null);
        setImportantForAccessibility(1);
    }

    private final svw l(int i, MenuItemImpl menuItemImpl, boolean z, boolean z2) throws Resources.NotFoundException {
        soo sooVar;
        this.G.b = true;
        menuItemImpl.setCheckable(true);
        this.G.b = false;
        cuj cujVar = this.R;
        svw svwVarA = cujVar != null ? (svw) cujVar.a() : null;
        if (svwVarA == null) {
            svwVarA = a(getContext());
        }
        svwVarA.E(z);
        svwVarA.B(this.K);
        svwVarA.t(this.T);
        svwVarA.s(this.h);
        svwVarA.I(this.U);
        svwVarA.H(this.j);
        svwVarA.F(this.k);
        svwVarA.q(this.l);
        svwVarA.p(this.m);
        svwVarA.G(this.n);
        svwVarA.I(this.i);
        int i2 = this.r;
        if (i2 != -1) {
            svwVarA.y(i2);
        }
        int i3 = this.s;
        if (i3 != -1) {
            svwVarA.x(i3);
        }
        svwVarA.D(this.I);
        svwVarA.A(this.J);
        int i4 = this.t;
        if (i4 != -1) {
            svwVarA.k(i4);
        }
        int i5 = this.u;
        if (i5 != -1) {
            svwVarA.r(i5);
        }
        svwVarA.n(this.w);
        svwVarA.j(this.x);
        svwVarA.i(this.y);
        svwVarA.g(this.z);
        svwVarA.l(this.A);
        svwVarA.v(this.C);
        svwVarA.q = this.O;
        svwVarA.h(this.B);
        svwVarA.e(c());
        svwVarA.l = this.E;
        svwVarA.f(this.v);
        svwVarA.u(this.p);
        svwVarA.z(this.o);
        svwVarA.C(this.c);
        svwVarA.w(this.d);
        svwVarA.p = z2;
        svwVarA.K();
        svwVarA.ex(this.L);
        svwVarA.initialize(menuItemImpl, 0);
        int itemId = menuItemImpl.getItemId();
        svwVarA.setOnTouchListener((View.OnTouchListener) this.S.get(itemId));
        svwVarA.setOnClickListener(this.Q);
        int i6 = this.f;
        if (i6 != 0 && itemId == i6) {
            this.g = i;
        }
        int id = svwVarA.getId();
        if (m(id) && (sooVar = (soo) this.q.get(id)) != null) {
            svwVarA.o(sooVar);
        }
        return svwVarA;
    }

    private static final boolean m(int i) {
        return i != -1;
    }

    protected abstract svw a(Context context);

    public final int b() {
        return this.L ? this.H.c : Math.min(this.M, this.H.d);
    }

    public final Drawable c() {
        if (this.D == null || this.F == null) {
            return null;
        }
        szk szkVar = new szk(this.D);
        szkVar.N(this.F);
        return szkVar;
    }

    public final svw d(int i) {
        i(i);
        svz[] svzVarArr = this.e;
        if (svzVarArr == null) {
            return null;
        }
        for (svz svzVar : svzVarArr) {
            if (svzVar instanceof svw) {
                svw svwVar = (svw) svzVar;
                if (svwVar.getId() == i) {
                    return svwVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() throws Resources.NotFoundException {
        svw svwVarL;
        removeAllViews();
        svz[] svzVarArr = this.e;
        if (svzVarArr != null && this.R != null) {
            for (svz svzVar : svzVarArr) {
                if (svzVar instanceof svw) {
                    svw svwVar = (svw) svzVar;
                    this.R.b(svwVar);
                    svwVar.d();
                    svwVar.h = null;
                    svwVar.i = 0.0f;
                    svwVar.a = false;
                }
            }
        }
        this.G.b = true;
        this.H.c();
        this.G.b = false;
        int i = this.H.b;
        if (i == 0) {
            this.f = 0;
            this.g = 0;
            this.e = null;
            this.R = null;
            return;
        }
        if (this.R == null || this.V != i) {
            this.V = i;
            this.R = new cul(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.H.a(); i2++) {
            hashSet.add(Integer.valueOf(this.H.b(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.q;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i3++;
        }
        int iA = this.H.a();
        this.e = new svz[iA];
        boolean zJ = j(this.c, b());
        int i4 = 0;
        int size = 0;
        for (int i5 = 0; i5 < iA; i5++) {
            MenuItem menuItemB = this.H.b(i5);
            boolean z = menuItemB instanceof svs;
            if (z) {
                svt svtVar = new svt(getContext());
                svtVar.a = true;
                svtVar.c();
                svtVar.a(this.N);
                svwVarL = svtVar;
            } else if (menuItemB.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                swf swfVar = new swf(getContext());
                int i6 = this.m;
                if (i6 == 0) {
                    i6 = this.k;
                }
                TextView textView = swfVar.a;
                textView.setTextAppearance(i6);
                ColorStateList colorStateList = swfVar.c;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                ColorStateList colorStateList2 = this.i;
                swfVar.c = colorStateList2;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                swfVar.b = true;
                swfVar.a();
                swfVar.initialize((MenuItemImpl) menuItemB, 0);
                size = menuItemB.getSubMenu().size();
                svwVarL = swfVar;
            } else if (size > 0) {
                size--;
                svwVarL = l(i5, (MenuItemImpl) menuItemB, zJ, true);
            } else {
                MenuItemImpl menuItemImpl = (MenuItemImpl) menuItemB;
                boolean z2 = i4 >= this.M;
                i4++;
                svwVarL = l(i5, menuItemImpl, zJ, z2);
            }
            if (!z && menuItemB.isCheckable() && this.g == -1) {
                this.g = i5;
            }
            this.e[i5] = svwVarL;
            addView(svwVarL);
        }
        int iMin = Math.min(iA - 1, this.g);
        this.g = iMin;
        f(this.e[iMin].getItemData());
    }

    public final void f(MenuItem menuItem) {
        if (this.W == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.W;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.W.setChecked(false);
        }
        menuItem.setChecked(true);
        this.W = menuItem;
    }

    public final void g(ColorStateList colorStateList) {
        this.T = colorStateList;
        svz[] svzVarArr = this.e;
        if (svzVarArr != null) {
            for (svz svzVar : svzVarArr) {
                if (svzVar instanceof svw) {
                    ((svw) svzVar).t(colorStateList);
                }
            }
        }
    }

    @Override // android.support.v7.view.menu.MenuView
    public final int getWindowAnimations() {
        return 0;
    }

    public final void h(int i) {
        this.C = i;
        svz[] svzVarArr = this.e;
        if (svzVarArr != null) {
            for (svz svzVar : svzVarArr) {
                if (svzVar instanceof svw) {
                    ((svw) svzVar).v(i);
                }
            }
        }
    }

    public final void i(int i) {
        if (m(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }

    @Override // android.support.v7.view.menu.MenuView
    public final void initialize(fb fbVar) {
        this.H = new svy(fbVar);
    }

    protected final boolean j(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public final ColorStateList k() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.google.android.videos.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = P;
        return new ColorStateList(new int[][]{iArr, a, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new cyq(accessibilityNodeInfo).v(cxe.k(1, b(), false, 1));
    }
}
