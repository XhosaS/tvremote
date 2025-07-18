package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.ac;
import defpackage.asv;
import defpackage.awy;
import defpackage.b;
import defpackage.byj;
import defpackage.cmt;
import defpackage.cw;
import defpackage.fe;
import defpackage.gs;
import defpackage.hi;
import defpackage.hk;
import defpackage.hm;
import defpackage.ig;
import defpackage.ii;
import defpackage.ik;
import defpackage.in;
import defpackage.io;
import defpackage.ip;
import defpackage.ir;
import defpackage.is;
import defpackage.it;
import defpackage.iw;
import defpackage.ix;
import defpackage.iy;
import defpackage.iz;
import defpackage.ja;
import defpackage.jc;
import defpackage.kb;
import defpackage.mi;
import defpackage.pm;
import defpackage.pn;
import defpackage.ps;
import defpackage.pv;
import defpackage.qo;
import defpackage.qs;
import defpackage.qv;
import defpackage.qx;
import defpackage.ra;
import defpackage.tk;
import defpackage.tm;
import defpackage.ts;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final /* synthetic */ int aa = 0;
    private static final Class[] ad;
    public static final Interpolator c;
    static final iy d;
    public EdgeEffect A;
    public EdgeEffect B;
    public ik C;
    public int D;
    public float E;
    public float F;
    public boolean G;
    public final iz H;
    public hm I;
    public hk J;
    public final ix K;
    public List L;
    public boolean M;
    public boolean N;
    public boolean O;
    public jc P;
    public final int[] Q;
    final List R;
    boolean S;
    pm T;
    public cmt U;
    public final awy V;
    asv W;
    private boolean aA;
    private int aB;
    private int aC;
    private final pn aD;
    private ii aE;
    private byj aF;
    private final byj aG;
    private final float ae;
    private final Rect af;
    private int ag;
    private boolean ah;
    private int ai;
    private final AccessibilityManager aj;
    private int ak;
    private int al;
    private int am;
    private VelocityTracker an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private final int at;
    private final int au;
    private final int[] av;
    private ps aw;
    private final int[] ax;
    private final int[] ay;
    private Runnable az;
    public final is e;
    public final ir f;
    it g;
    public gs h;
    boolean i;
    public final Rect j;
    public final RectF k;
    public ig l;
    public in m;
    public final List n;
    public final ArrayList o;
    public final ArrayList p;
    public ip q;
    public boolean r;
    public boolean s;
    boolean t;
    boolean u;
    boolean v;
    public boolean w;
    boolean x;
    public EdgeEffect y;
    public EdgeEffect z;
    private static final int[] ab = {R.attr.nestedScrollingEnabled};
    private static final float ac = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    public static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        ad = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new ts(1);
        d = new iy();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void D(View view, Rect rect) {
        io ioVar = (io) view.getLayoutParams();
        Rect rect2 = ioVar.d;
        rect.set((view.getLeft() - rect2.left) - ioVar.leftMargin, (view.getTop() - rect2.top) - ioVar.topMargin, view.getRight() + rect2.right + ioVar.rightMargin, view.getBottom() + rect2.bottom + ioVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.y;
        float f2 = 0.0f;
        if (edgeEffect == null || qs.c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.A;
            if (edgeEffect2 != null && qs.c(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.A.onRelease();
                } else {
                    float fD = qs.d(this.A, width, height);
                    if (qs.c(this.A) == 0.0f) {
                        this.A.onRelease();
                    }
                    f2 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.y.onRelease();
            } else {
                float f3 = -qs.d(this.y, -width, 1.0f - height);
                if (qs.c(this.y) == 0.0f) {
                    this.y.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private final boolean aA(MotionEvent motionEvent) {
        ArrayList arrayList = this.p;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ip ipVar = (ip) arrayList.get(i);
            if (ipVar.j(motionEvent) && action != 3) {
                this.q = ipVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aB() {
        return this.C != null && this.m.u();
    }

    private final boolean aC(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fC = qs.c(edgeEffect) * i2;
        float fAbs = Math.abs(-i);
        float f = this.ae * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d2 = ac;
        return ((float) (((double) f) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fC;
    }

    private final void aD(Context context, String str, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = String.valueOf(context.getPackageName()).concat(String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(in.class);
                try {
                    constructor = clsAsSubclass.getConstructor(ad);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                    }
                }
                constructor.setAccessible(true);
                P((in) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
            }
        }
    }

    private final asv aE() {
        if (this.W == null) {
            this.W = new asv((View) this, (byte[]) null);
        }
        return this.W;
    }

    public static final int ae(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && qs.c(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * qs.d(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || qs.c(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * qs.d(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    static final long af(ja jaVar) {
        return jaVar.d;
    }

    public static final long ag() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    private final int an(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.z;
        float f2 = 0.0f;
        if (edgeEffect == null || qs.c(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.B;
            if (edgeEffect2 != null && qs.c(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.B.onRelease();
                } else {
                    float fD = qs.d(this.B, height, 1.0f - width);
                    if (qs.c(this.B) == 0.0f) {
                        this.B.onRelease();
                    }
                    f2 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.z.onRelease();
            } else {
                float f3 = -qs.d(this.z, -height, width);
                if (qs.c(this.z) == 0.0f) {
                    this.z.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final ps ao() {
        if (this.aw == null) {
            this.aw = new ps(this);
        }
        return this.aw;
    }

    private final void ap() {
        ax();
        Q(0);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    private final void aq() {
        View viewH;
        boolean z;
        boolean z2;
        char c2;
        ix ixVar = this.K;
        ixVar.b(1);
        C(ixVar);
        int i = 0;
        ixVar.i = false;
        T();
        awy awyVar = this.V;
        awyVar.q();
        I();
        if (this.w) {
            this.U.p();
            if (this.x) {
                this.m.x();
            }
        }
        int i2 = 2;
        char c3 = 65535;
        if (aB()) {
            cmt cmtVar = this.U;
            ?? r9 = cmtVar.b;
            for (int size = r9.size() - 1; size >= 0; size--) {
                int i3 = ((fe) r9.get(size)).a;
            }
            ArrayList arrayList = (ArrayList) r9;
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                fe feVarS = (fe) arrayList.get(i4);
                int i5 = feVarS.a;
                if (i5 == 1) {
                    cmtVar.m(feVarS);
                } else if (i5 == i2) {
                    int i6 = feVarS.b;
                    int i7 = feVarS.d + i6;
                    int i8 = i6;
                    int i9 = 0;
                    char c4 = 65535;
                    while (i8 < i7) {
                        if (((byj) cmtVar.d).r(i8) != null || cmtVar.q(i8)) {
                            if (c4 == 0) {
                                cmtVar.k(cmtVar.s(2, i6, i9));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c2 = 1;
                        } else {
                            if (c4 == 1) {
                                cmtVar.m(cmtVar.s(2, i6, i9));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c2 = 0;
                        }
                        if (z2) {
                            i8 -= i9;
                            i7 -= i9;
                            i9 = 1;
                        } else {
                            i9++;
                        }
                        i8++;
                        c4 = c2;
                    }
                    if (i9 != feVarS.d) {
                        cmtVar.n(feVarS);
                        feVarS = cmtVar.s(2, i6, i9);
                    }
                    if (c4 == 0) {
                        cmtVar.k(feVarS);
                    } else {
                        cmtVar.m(feVarS);
                    }
                } else if (i5 == 4) {
                    int i10 = feVarS.b;
                    int i11 = feVarS.d + i10;
                    int i12 = i10;
                    while (i10 < i11) {
                        if (((byj) cmtVar.d).r(i10) != null || cmtVar.q(i10)) {
                            if (c3 == 0) {
                                Object obj = feVarS.c;
                                cmtVar.k(cmtVar.s(4, i12, i));
                                i12 = i10;
                                i = 0;
                            }
                            c3 = 1;
                        } else {
                            if (c3 == 1) {
                                Object obj2 = feVarS.c;
                                cmtVar.m(cmtVar.s(4, i12, i));
                                i12 = i10;
                                i = 0;
                            }
                            c3 = 0;
                        }
                        i++;
                        i10++;
                    }
                    if (i != feVarS.d) {
                        Object obj3 = feVarS.c;
                        cmtVar.n(feVarS);
                        feVarS = cmtVar.s(4, i12, i);
                    }
                    if (c3 == 0) {
                        cmtVar.k(feVarS);
                    } else {
                        cmtVar.m(feVarS);
                    }
                }
                i4++;
                i = 0;
                i2 = 2;
                c3 = 65535;
            }
            arrayList.clear();
        } else {
            this.U.j();
        }
        boolean z3 = this.M || this.N;
        boolean z4 = this.t && this.C != null && ((z = this.w) || z3 || this.m.u) && !z;
        ixVar.j = z4;
        ixVar.k = z4 && z3 && !this.w && aB();
        ja jaVarE = null;
        View focusedChild = (this.G && hasFocus() && this.l != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewH = h(focusedChild)) != null) {
            jaVarE = e(viewH);
        }
        if (jaVarE == null) {
            aw();
        } else {
            ixVar.m = -1L;
            ixVar.l = this.w ? -1 : jaVarE.s() ? jaVarE.e : jaVarE.a();
            View focusedChild2 = jaVarE.b;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            ixVar.n = id;
        }
        ixVar.h = ixVar.j && this.N;
        this.N = false;
        this.M = false;
        ixVar.g = ixVar.k;
        ixVar.e = this.l.a();
        as(this.av);
        if (ixVar.j) {
            int iA = this.h.a();
            for (int i13 = 0; i13 < iA; i13++) {
                ja jaVarF = f(this.h.e(i13));
                if (!jaVarF.x() && !jaVarF.q()) {
                    ik.j(jaVarF);
                    awyVar.y(jaVarF, ik.k(jaVarF));
                    if (ixVar.h && jaVarF.v() && !jaVarF.s() && !jaVarF.x() && !jaVarF.q()) {
                        awyVar.p(af(jaVarF), jaVarF);
                    }
                }
            }
        }
        if (ixVar.k) {
            int iC = this.h.c();
            for (int i14 = 0; i14 < iC; i14++) {
                ja jaVarF2 = f(this.h.f(i14));
                if (!jaVarF2.x() && jaVarF2.e == -1) {
                    jaVarF2.e = jaVarF2.d;
                }
            }
            boolean z5 = ixVar.f;
            ixVar.f = false;
            this.m.o(this.f, ixVar);
            ixVar.f = z5;
            for (int i15 = 0; i15 < this.h.a(); i15++) {
                ja jaVarF3 = f(this.h.e(i15));
                if (!jaVarF3.x()) {
                    mi miVar = (mi) awyVar.b;
                    kb kbVar = (kb) miVar.get(jaVarF3);
                    if (kbVar == null || (kbVar.a & 4) == 0) {
                        ik.j(jaVarF3);
                        boolean zN = jaVarF3.n(8192);
                        pv pvVarK = ik.k(jaVarF3);
                        if (zN) {
                            am(jaVarF3, pvVarK);
                        } else {
                            kb kbVarA = (kb) miVar.get(jaVarF3);
                            if (kbVarA == null) {
                                kbVarA = kb.a();
                                miVar.put(jaVarF3, kbVarA);
                            }
                            kbVarA.a |= 2;
                            kbVarA.c = pvVarK;
                        }
                    }
                }
            }
            r();
        } else {
            r();
        }
        J();
        U(false);
        ixVar.d = 2;
    }

    private final void ar() {
        T();
        I();
        ix ixVar = this.K;
        ixVar.b(6);
        this.U.j();
        ixVar.e = this.l.a();
        ixVar.c = 0;
        it itVar = this.g;
        if (itVar != null) {
            int i = this.l.b;
            Parcelable parcelable = itVar.a;
            if (parcelable != null) {
                this.m.R(parcelable);
            }
            this.g = null;
        }
        ixVar.g = false;
        this.m.o(this.f, ixVar);
        ixVar.f = false;
        ixVar.j = ixVar.j && this.C != null;
        ixVar.d = 4;
        J();
        U(false);
    }

    private final void as(int[] iArr) {
        int iA = this.h.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iA; i3++) {
            ja jaVarF = f(this.h.e(i3));
            if (!jaVarF.x()) {
                int iB = jaVarF.b();
                if (iB < i2) {
                    i2 = iB;
                }
                if (iB > i) {
                    i = iB;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void at(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.am) {
            int i = actionIndex == 0 ? 1 : 0;
            this.am = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.aq = x;
            this.ao = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.ar = y;
            this.ap = y;
        }
    }

    private final void au() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.y.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.z;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.z.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void av(View view, View view2) {
        boolean z;
        RecyclerView recyclerView;
        View view3;
        View view4 = view2 != null ? view2 : view;
        Rect rect = this.j;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof io) {
            io ioVar = (io) layoutParams;
            if (!ioVar.e) {
                Rect rect2 = ioVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        in inVar = this.m;
        boolean z2 = !this.t;
        if (view2 == null) {
            z = true;
            view3 = view;
            recyclerView = this;
        } else {
            z = false;
            recyclerView = this;
            view3 = view;
        }
        inVar.bk(recyclerView, view3, rect, z2, z);
    }

    private final void aw() {
        ix ixVar = this.K;
        ixVar.m = -1L;
        ixVar.l = -1;
        ixVar.n = -1;
    }

    private final void ax() {
        VelocityTracker velocityTracker = this.an;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        V(0);
        au();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ay(int i) {
        boolean zV = this.m.V();
        int i2 = zV;
        if (this.m.W()) {
            i2 = (zV ? 1 : 0) | 2;
        }
        aj(i2, i);
    }

    private final void az() {
        iw iwVar;
        this.H.d();
        in inVar = this.m;
        if (inVar == null || (iwVar = inVar.t) == null) {
            return;
        }
        iwVar.e();
    }

    public static ja f(View view) {
        if (view == null) {
            return null;
        }
        return ((io) view.getLayoutParams()).c;
    }

    public static RecyclerView g(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewG = g(viewGroup.getChildAt(i));
            if (recyclerViewG != null) {
                return recyclerViewG;
            }
        }
        return null;
    }

    public static void q(ja jaVar) {
        WeakReference weakReference = jaVar.c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == jaVar.b) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            jaVar.c = null;
        }
    }

    public final void A() {
        if (this.A != null) {
            return;
        }
        EdgeEffect edgeEffectO = this.aE.o(this);
        this.A = edgeEffectO;
        if (this.i) {
            edgeEffectO.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectO.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.z != null) {
            return;
        }
        EdgeEffect edgeEffectO = this.aE.o(this);
        this.z = edgeEffectO;
        if (this.i) {
            edgeEffectO.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectO.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void C(ix ixVar) {
        if (this.D != 2) {
            ixVar.o = 0;
            ixVar.p = 0;
        } else {
            OverScroller overScroller = this.H.a;
            ixVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            ixVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void E() {
        this.B = null;
        this.z = null;
        this.A = null;
        this.y = null;
    }

    public final void F(int i) {
        if (this.m == null) {
            return;
        }
        Q(2);
        this.m.S(i);
        awakenScrollBars();
    }

    public final void G() {
        int iC = this.h.c();
        for (int i = 0; i < iC; i++) {
            ((io) this.h.f(i).getLayoutParams()).e = true;
        }
        ArrayList arrayList = this.f.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            io ioVar = (io) ((ja) arrayList.get(i2)).b.getLayoutParams();
            if (ioVar != null) {
                ioVar.e = true;
            }
        }
    }

    public final void H(int i, int i2, boolean z) {
        int i3;
        int iC = this.h.c();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iC) {
                break;
            }
            ja jaVarF = f(this.h.f(i4));
            if (jaVarF != null && !jaVarF.x()) {
                int i5 = jaVarF.d;
                if (i5 >= i3) {
                    jaVarF.h(-i2, z);
                    this.K.f = true;
                } else if (i5 >= i) {
                    jaVarF.c(8);
                    jaVarF.h(-i2, z);
                    jaVarF.d = i - 1;
                    this.K.f = true;
                }
            }
            i4++;
        }
        ir irVar = this.f;
        ArrayList arrayList = irVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            ja jaVar = (ja) arrayList.get(size);
            if (jaVar != null) {
                int i6 = jaVar.d;
                if (i6 >= i3) {
                    jaVar.h(-i2, z);
                } else if (i6 >= i) {
                    jaVar.c(8);
                    irVar.h(size);
                }
            }
        }
    }

    public final void I() {
        this.ak++;
    }

    final void J() {
        K(true);
    }

    public final void K(boolean z) {
        int i;
        int i2 = this.ak - 1;
        this.ak = i2;
        if (i2 <= 0) {
            this.ak = 0;
            if (z) {
                int i3 = this.ai;
                this.ai = 0;
                if (i3 != 0 && ab()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                List list = this.R;
                for (int size = list.size() - 1; size >= 0; size--) {
                    ja jaVar = (ja) list.get(size);
                    View view = jaVar.b;
                    if (view.getParent() == this && !jaVar.x() && (i = jaVar.o) != -1) {
                        view.setImportantForAccessibility(i);
                        jaVar.o = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void L() {
        if (this.O || !this.r) {
            return;
        }
        Runnable runnable = this.az;
        int[] iArr = qv.a;
        postOnAnimation(runnable);
        this.O = true;
    }

    public final void M(boolean z) {
        this.x = z | this.x;
        this.w = true;
        int iC = this.h.c();
        for (int i = 0; i < iC; i++) {
            ja jaVarF = f(this.h.f(i));
            if (jaVarF != null && !jaVarF.x()) {
                jaVarF.c(6);
            }
        }
        G();
        ir irVar = this.f;
        ArrayList arrayList = irVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ja jaVar = (ja) arrayList.get(i2);
            if (jaVar != null) {
                jaVar.c(6);
                jaVar.z();
            }
        }
        RecyclerView recyclerView = irVar.g;
        irVar.g();
    }

    public final void N() {
        ik ikVar = this.C;
        if (ikVar != null) {
            ikVar.e();
        }
        in inVar = this.m;
        if (inVar != null) {
            ir irVar = this.f;
            inVar.aS(irVar);
            this.m.aT(irVar);
        }
        this.f.d();
    }

    public final void O(int i, int i2, int[] iArr) {
        ja jaVar;
        T();
        I();
        Trace.beginSection("RV Scroll");
        ix ixVar = this.K;
        C(ixVar);
        int iD = i != 0 ? this.m.d(i, this.f, ixVar) : 0;
        int iE = i2 != 0 ? this.m.e(i2, this.f, ixVar) : 0;
        Trace.endSection();
        int iA = this.h.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewE = this.h.e(i3);
            ja jaVarE = e(viewE);
            if (jaVarE != null && (jaVar = jaVarE.j) != null) {
                int left = viewE.getLeft();
                int top = viewE.getTop();
                View view = jaVar.b;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        J();
        U(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public void P(in inVar) {
        if (inVar == this.m) {
            return;
        }
        W();
        if (this.m != null) {
            ik ikVar = this.C;
            if (ikVar != null) {
                ikVar.e();
            }
            in inVar2 = this.m;
            ir irVar = this.f;
            inVar2.aS(irVar);
            this.m.aT(irVar);
            irVar.d();
            if (this.r) {
                this.m.bv(this);
            }
            this.m.bc(null);
            this.m = null;
        } else {
            this.f.d();
        }
        gs gsVar = this.h;
        gsVar.a.d();
        List list = gsVar.b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            gsVar.e.z((View) list.get(size));
            list.remove(size);
        }
        byj byjVar = gsVar.e;
        int iW = byjVar.w();
        for (int i = 0; i < iW; i++) {
            View viewY = byjVar.y(i);
            f(viewY);
            viewY.clearAnimation();
        }
        ((RecyclerView) byjVar.a).removeAllViews();
        this.m = inVar;
        if (inVar != null) {
            if (inVar.s != null) {
                throw new IllegalArgumentException("LayoutManager " + inVar + " is already attached to a RecyclerView:" + inVar.s.i());
            }
            this.m.bc(this);
            if (this.r) {
                this.m.bm();
            }
        }
        this.f.m();
        requestLayout();
    }

    public final void Q(int i) {
        if (i == this.D) {
            return;
        }
        this.D = i;
        if (i != 2) {
            az();
        }
        in inVar = this.m;
        if (inVar != null) {
            inVar.aR(i);
        }
        List list = this.L;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public void R(int i, int i2) {
        ai(i, i2);
    }

    public void S(int i) {
        if (this.v) {
            return;
        }
        in inVar = this.m;
        if (inVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            inVar.aj(this, i);
        }
    }

    public final void T() {
        int i = this.ag + 1;
        this.ag = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void U(boolean z) {
        int i = this.ag;
        if (i <= 0) {
            this.ag = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.m != null && this.l != null) {
                v();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.ag--;
    }

    public final void V(int i) {
        ao().b(i);
    }

    public final void W() {
        Q(0);
        az();
    }

    public final boolean Y(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return ao().e(i, i2, iArr, iArr2, i3);
    }

    public final boolean Z(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        in inVar = this.m;
        if (inVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        boolean zV = inVar.V();
        boolean zW = inVar.W();
        if (!zV || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zW || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            EdgeEffect edgeEffect = this.y;
            if (edgeEffect == null || qs.c(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.A;
                if (edgeEffect2 != null && qs.c(edgeEffect2) != 0.0f) {
                    if (aC(this.A, i, getWidth())) {
                        this.A.onAbsorb(i);
                        i = 0;
                    }
                    i5 = i;
                    i = 0;
                }
                i5 = 0;
            } else {
                int i7 = -i;
                if (aC(this.y, i7, getWidth())) {
                    this.y.onAbsorb(i7);
                    i = 0;
                }
                i5 = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.z;
            if (edgeEffect3 == null || qs.c(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.B;
                if (edgeEffect4 != null && qs.c(edgeEffect4) != 0.0f) {
                    if (aC(this.B, i2, getHeight())) {
                        this.B.onAbsorb(i2);
                        i2 = 0;
                    }
                    i6 = 0;
                }
                i6 = i2;
                i2 = 0;
            } else {
                int i8 = -i2;
                if (aC(this.z, i8, getHeight())) {
                    this.z.onAbsorb(i8);
                    i2 = 0;
                }
                i6 = 0;
            }
        }
        if (i5 != 0) {
            int i9 = -i4;
            iMax = Math.max(i9, Math.min(i5, i4));
            iMax2 = Math.max(i9, Math.min(i2, i4));
            ay(1);
            this.H.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i92 = -i4;
            iMax = Math.max(i92, Math.min(i5, i4));
            iMax2 = Math.max(i92, Math.min(i2, i4));
            ay(1);
            this.H.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i == 0) {
            if (i6 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i = 0;
        }
        float f = i;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = zV || zW;
            dispatchNestedFling(f, f2, z);
            if (z) {
                int i10 = -i4;
                ay(1);
                this.H.a(Math.max(i10, Math.min(i, i4)), Math.max(i10, Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    public final boolean aa() {
        return !this.t || this.w || this.U.r();
    }

    public final boolean ab() {
        AccessibilityManager accessibilityManager = this.aj;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean ac() {
        return this.ak > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean ad(int r22, int r23, int r24, int r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ad(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        in inVar = this.m;
        if (inVar == null || !inVar.bh(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void ah(ja jaVar, int i) {
        if (!ac()) {
            jaVar.b.setImportantForAccessibility(i);
        } else {
            jaVar.o = i;
            this.R.add(jaVar);
        }
    }

    public void ai(int i, int i2) {
        ak(i, i2);
    }

    public final void aj(int i, int i2) {
        ao().i(i, i2);
    }

    public final void ak(int i, int i2) {
        al(i, i2, false);
    }

    public final void al(int i, int i2, boolean z) {
        in inVar = this.m;
        if (inVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != inVar.V()) {
            i = 0;
        }
        if (true != inVar.W()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            aj(i3, 1);
        }
        this.H.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void am(ja jaVar, pv pvVar) {
        jaVar.j(0, 8192);
        if (this.K.h && jaVar.v() && !jaVar.s() && !jaVar.x()) {
            this.V.p(af(jaVar), jaVar);
        }
        this.V.y(jaVar, pvVar);
    }

    public final int b(ja jaVar) {
        int i;
        if (jaVar.n(524) || !jaVar.p()) {
            return -1;
        }
        cmt cmtVar = this.U;
        int i2 = jaVar.d;
        ArrayList arrayList = (ArrayList) cmtVar.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            fe feVar = (fe) arrayList.get(i3);
            int i4 = feVar.a;
            if (i4 != 1) {
                if (i4 == 2 && (i = feVar.b) <= i2) {
                    int i5 = feVar.d;
                    if (i + i5 > i2) {
                        return -1;
                    }
                    i2 -= i5;
                }
            } else if (feVar.b <= i2) {
                i2 += feVar.d;
            }
        }
        return i2;
    }

    public final Rect c(View view) {
        io ioVar = (io) view.getLayoutParams();
        if (!ioVar.e) {
            return ioVar.d;
        }
        if (this.K.g && (ioVar.c() || ioVar.c.q())) {
            return ioVar.d;
        }
        Rect rect = ioVar.d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.j;
            rect2.set(0, 0, 0, 0);
            ((io) view.getLayoutParams()).b();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        ioVar.e = false;
        return rect;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof io) && this.m.s((io) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        in inVar = this.m;
        if (inVar != null && inVar.V()) {
            return inVar.A(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        in inVar = this.m;
        if (inVar != null && inVar.V()) {
            return inVar.B(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        in inVar = this.m;
        if (inVar != null && inVar.V()) {
            return inVar.C(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        in inVar = this.m;
        if (inVar != null && inVar.W()) {
            return inVar.D(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        in inVar = this.m;
        if (inVar != null && inVar.W()) {
            return inVar.E(this.K);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        in inVar = this.m;
        if (inVar != null && inVar.W()) {
            return inVar.F(this.K);
        }
        return 0;
    }

    public final ja d(int i) {
        ja jaVar = null;
        if (this.w) {
            return null;
        }
        int iC = this.h.c();
        for (int i2 = 0; i2 < iC; i2++) {
            ja jaVarF = f(this.h.f(i2));
            if (jaVarF != null && !jaVarF.s() && b(jaVarF) == i) {
                if (!this.h.k(jaVarF.b)) {
                    return jaVarF;
                }
                jaVar = jaVarF;
            }
        }
        return jaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        in inVar = this.m;
        int iA = 0;
        if (inVar == null) {
            return false;
        }
        if (inVar.W()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    ak(0, measuredHeight);
                } else {
                    ak(0, -measuredHeight);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean Z = inVar.Z();
                if (keyCode == 122) {
                    if (Z) {
                        iA = this.l.a();
                    }
                } else if (!Z) {
                    iA = this.l.a();
                }
                S(iA);
                return true;
            }
        } else if (inVar.V()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    ak(measuredWidth, 0);
                } else {
                    ak(-measuredWidth, 0);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean Z2 = inVar.Z();
                if (keyCode2 == 122) {
                    if (Z2) {
                        iA = this.l.a();
                    }
                } else if (!Z2) {
                    iA = this.l.a();
                }
                S(iA);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return ao().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return ao().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return ao().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return ao().f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ii) arrayList.get(i)).i(canvas);
        }
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.y;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.z;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.A;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.A;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.B;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.B;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.C != null && arrayList.size() > 0 && this.C.h())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final ja e(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f(view);
        }
        throw new IllegalArgumentException(b.d(this, view, "View ", " is not a direct child of "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x016f, code lost:
    
        if (r16 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x018d, code lost:
    
        if (r5 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0190, code lost:
    
        if (r16 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0193, code lost:
    
        if (r5 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01a3, code lost:
    
        if ((r5 * r13) >= 0) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        in inVar = this.m;
        if (inVar != null) {
            return inVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(i()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        in inVar = this.m;
        if (inVar != null) {
            return inVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(i()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.m != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final View h(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return ao().h(0);
    }

    public final String i() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return ao().a;
    }

    public final void o(ja jaVar) {
        View view = jaVar.b;
        ViewParent parent = view.getParent();
        this.f.l(e(view));
        if (jaVar.u()) {
            this.h.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.h.g(view, -1, true);
            return;
        }
        gs gsVar = this.h;
        int iX = gsVar.e.x(view);
        if (iX < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        gsVar.a.e(iX);
        gsVar.j(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ak = 0;
        this.r = true;
        this.t = this.t && !isLayoutRequested();
        this.f.e();
        in inVar = this.m;
        if (inVar != null) {
            inVar.bm();
        }
        this.O = false;
        if (b) {
            ThreadLocal threadLocal = hm.a;
            hm hmVar = (hm) threadLocal.get();
            this.I = hmVar;
            if (hmVar == null) {
                this.I = new hm();
                int[] iArr = qv.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                hm hmVar2 = this.I;
                hmVar2.e = (long) (1.0E9f / f);
                threadLocal.set(hmVar2);
            }
            this.I.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        hm hmVar;
        super.onDetachedFromWindow();
        ik ikVar = this.C;
        if (ikVar != null) {
            ikVar.e();
        }
        W();
        this.r = false;
        in inVar = this.m;
        if (inVar != null) {
            inVar.bv(this);
        }
        this.R.clear();
        removeCallbacks(this.az);
        while (kb.b.a() != null) {
        }
        ir irVar = this.f;
        int i = 0;
        while (true) {
            ArrayList arrayList = irVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            tk.d(((ja) arrayList.get(i)).b);
            i++;
        }
        irVar.f(irVar.g.l, false);
        Iterator itA = new ra(this, 1).a();
        while (itA.hasNext()) {
            tk.j((View) itA.next()).L();
        }
        if (!b || (hmVar = this.I) == null) {
            return;
        }
        hmVar.c.remove(this);
        this.I = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.q = null;
        if (aA(motionEvent)) {
            ap();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ip ipVar = (ip) arrayList.get(i);
                if (ipVar != null && ipVar != this.q) {
                    ipVar.j(motionEventObtain);
                }
            }
            return true;
        }
        in inVar = this.m;
        if (inVar == null) {
            return false;
        }
        boolean zV = inVar.V();
        boolean zW = inVar.W();
        if (this.an == null) {
            this.an = VelocityTracker.obtain();
        }
        this.an.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.ah) {
                this.ah = false;
            }
            this.am = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.aq = x;
            this.ao = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.ar = y;
            this.ap = y;
            EdgeEffect edgeEffect = this.y;
            if (edgeEffect == null || qs.c(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                qs.d(this.y, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.A;
            if (edgeEffect2 != null && qs.c(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                qs.d(this.A, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.z;
            if (edgeEffect3 != null && qs.c(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                qs.d(this.z, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.B;
            if (edgeEffect4 == null || qs.c(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z || this.D == 2) {
                }
                int[] iArr = this.ay;
                iArr[1] = 0;
                iArr[0] = 0;
                ay(0);
            } else {
                qs.d(this.B, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            Q(1);
            V(1);
            int[] iArr2 = this.ay;
            iArr2[1] = 0;
            iArr2[0] = 0;
            ay(0);
        } else if (actionMasked == 1) {
            this.an.clear();
            V(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.am);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.am + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.D != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.ao;
                int i5 = i2 - this.ap;
                if (!zV || Math.abs(i4) <= this.as) {
                    z2 = false;
                } else {
                    this.aq = i3;
                    z2 = true;
                }
                if (zW && Math.abs(i5) > this.as) {
                    this.ar = i2;
                } else if (z2) {
                }
                Q(1);
            }
        } else if (actionMasked == 3) {
            ap();
        } else if (actionMasked == 5) {
            this.am = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.aq = x3;
            this.ao = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ar = y3;
            this.ap = y3;
        } else if (actionMasked == 6) {
            at(motionEvent);
        }
        return this.D == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        v();
        Trace.endSection();
        this.t = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        in inVar = this.m;
        if (inVar == null) {
            u(i, i2);
            return;
        }
        boolean z = false;
        if (!inVar.X()) {
            if (this.s) {
                inVar.aQ(this.f, this.K, i, i2);
                return;
            }
            ix ixVar = this.K;
            if (ixVar.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            ig igVar = this.l;
            if (igVar != null) {
                ixVar.e = igVar.a();
            } else {
                ixVar.e = 0;
            }
            T();
            this.m.aQ(this.f, ixVar, i, i2);
            U(false);
            ixVar.g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        in inVar2 = this.m;
        ir irVar = this.f;
        ix ixVar2 = this.K;
        inVar2.aQ(irVar, ixVar2, i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.aA = z;
        if (z || this.l == null) {
            return;
        }
        if (ixVar2.d == 1) {
            aq();
        }
        this.m.aZ(i, i2);
        ixVar2.i = true;
        ar();
        this.m.bb(i, i2);
        if (this.m.ab()) {
            this.m.aZ(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            ixVar2.i = true;
            ar();
            this.m.bb(i, i2);
        }
        this.aB = getMeasuredWidth();
        this.aC = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (ac()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof it)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        it itVar = (it) parcelable;
        this.g = itVar;
        super.onRestoreInstanceState(itVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        it itVar = new it(super.onSaveInstanceState());
        it itVar2 = this.g;
        if (itVar2 != null) {
            itVar.a = itVar2.a;
            return itVar;
        }
        in inVar = this.m;
        if (inVar != null) {
            itVar.a = inVar.K();
            return itVar;
        }
        itVar.a = null;
        return itVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(String str) {
        if (ac()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(i()));
        }
        if (this.al > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(i())));
        }
    }

    final void r() {
        int iC = this.h.c();
        for (int i = 0; i < iC; i++) {
            ja jaVarF = f(this.h.f(i));
            if (!jaVarF.x()) {
                jaVarF.d();
            }
        }
        ir irVar = this.f;
        ArrayList arrayList = irVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ja) arrayList.get(i2)).d();
        }
        ArrayList arrayList2 = irVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ja) arrayList2.get(i3)).d();
        }
        ArrayList arrayList3 = irVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ja) irVar.b.get(i4)).d();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        ja jaVarF = f(view);
        if (jaVarF != null) {
            if (jaVarF.u()) {
                jaVarF.g();
            } else if (!jaVarF.x()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + jaVarF + i());
            }
        }
        view.clearAnimation();
        f(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.m.bt(this, view, view2) && view2 != null) {
            av(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.m.bj(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ip) arrayList.get(i)).k();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ag != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2) {
        EdgeEffect edgeEffect = this.y;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.y.onRelease();
            zIsFinished = this.y.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A.onRelease();
            zIsFinished |= this.A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.z.onRelease();
            zIsFinished |= this.z.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        in inVar = this.m;
        if (inVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zV = inVar.V();
        boolean zW = inVar.W();
        if (!zV) {
            if (!zW) {
                return;
            } else {
                zW = true;
            }
        }
        ad(true != zV ? 0 : i, true != zW ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!ac()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.ai |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            E();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.t) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        ao().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return ao().i(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        ao().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            p("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.ah = true;
                W();
                return;
            }
            this.v = false;
            if (this.u && this.m != null && this.l != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t() {
        if (!this.t || this.w) {
            Trace.beginSection("RV FullInvalidate");
            v();
            Trace.endSection();
        } else if (this.U.r() && this.U.r()) {
            Trace.beginSection("RV FullInvalidate");
            v();
            Trace.endSection();
        }
    }

    public final void u(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = qv.a;
        setMeasuredDimension(in.ak(i, paddingLeft, getMinimumWidth()), in.ak(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c8  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void v() {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.v():void");
    }

    public final void w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ao().g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void x(int i, int i2) {
        this.al++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.L;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ii) this.L.get(size)).c(this);
                }
            }
        }
        this.al--;
    }

    public final void y() {
        if (this.B != null) {
            return;
        }
        EdgeEffect edgeEffectO = this.aE.o(this);
        this.B = edgeEffectO;
        if (this.i) {
            edgeEffectO.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectO.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.y != null) {
            return;
        }
        EdgeEffect edgeEffectO = this.aE.o(this);
        this.y = edgeEffectO;
        if (this.i) {
            edgeEffectO.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectO.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.tv.remote.service.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        float fA;
        float fA2;
        super(context, attributeSet, i);
        RecyclerView recyclerView = this;
        recyclerView.e = new is(recyclerView);
        recyclerView.f = new ir(recyclerView);
        recyclerView.V = new awy((char[]) null, (byte[]) null);
        recyclerView.j = new Rect();
        recyclerView.af = new Rect();
        recyclerView.k = new RectF();
        recyclerView.n = new ArrayList();
        recyclerView.o = new ArrayList();
        recyclerView.p = new ArrayList();
        recyclerView.ag = 0;
        recyclerView.w = false;
        recyclerView.x = false;
        recyclerView.ak = 0;
        recyclerView.al = 0;
        recyclerView.aE = d;
        recyclerView.C = new ik(null);
        recyclerView.D = 0;
        recyclerView.am = -1;
        recyclerView.E = Float.MIN_VALUE;
        recyclerView.F = Float.MIN_VALUE;
        recyclerView.G = true;
        recyclerView.H = new iz(recyclerView);
        recyclerView.J = b ? new hk() : null;
        recyclerView.K = new ix();
        recyclerView.M = false;
        recyclerView.N = false;
        recyclerView.aF = new byj(recyclerView, null);
        recyclerView.O = false;
        recyclerView.av = new int[2];
        recyclerView.ax = new int[2];
        recyclerView.ay = new int[2];
        recyclerView.Q = new int[2];
        recyclerView.R = new ArrayList();
        recyclerView.az = new ac(recyclerView, 14, null);
        recyclerView.aB = 0;
        recyclerView.aC = 0;
        recyclerView.aG = new byj(recyclerView, null);
        tm tmVar = new tm(recyclerView, 1);
        recyclerView.aD = tmVar;
        recyclerView.T = new pm(recyclerView.getContext(), tmVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.as = viewConfiguration.getScaledTouchSlop();
        int i2 = qx.a;
        if (Build.VERSION.SDK_INT >= 26) {
            fA = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            fA = qx.a(viewConfiguration, context);
        }
        recyclerView.E = fA;
        if (Build.VERSION.SDK_INT >= 26) {
            fA2 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            fA2 = qx.a(viewConfiguration, context);
        }
        recyclerView.F = fA2;
        recyclerView.at = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.au = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ae = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.C.m = recyclerView.aF;
        recyclerView.U = new cmt(new byj(recyclerView, null));
        recyclerView.h = new gs(new byj(recyclerView, null));
        int[] iArr = qv.a;
        if ((Build.VERSION.SDK_INT < 26 || qo.a(recyclerView) == 0) && Build.VERSION.SDK_INT >= 26) {
            qo.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.aj = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        jc jcVar = new jc(recyclerView);
        recyclerView.P = jcVar;
        qv.l(recyclerView, jcVar);
        int[] iArr2 = cw.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        qv.k(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = recyclerView.getContext().getResources();
                new hi(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.tv.remote.service.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.tv.remote.service.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.tv.remote.service.R.dimen.fastscroll_margin));
                recyclerView = this;
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.i()));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.S = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aD(context, string, attributeSet, i);
        int[] iArr3 = ab;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        qv.k(recyclerView, context, iArr3, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(com.google.android.tv.remote.service.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        in inVar = this.m;
        if (inVar != null) {
            return inVar.g(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(i()));
    }
}
