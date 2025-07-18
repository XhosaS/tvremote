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
import android.os.Parcel;
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
import androidx.customview.view.AbsSavedState;
import defpackage.a;
import defpackage.afw;
import defpackage.afx;
import defpackage.agg;
import defpackage.agq;
import defpackage.ahe;
import defpackage.ahj;
import defpackage.aho;
import defpackage.ahq;
import defpackage.akv;
import defpackage.alf;
import defpackage.ejs;
import defpackage.hu;
import defpackage.lb;
import defpackage.lc;
import defpackage.na;
import defpackage.nn;
import defpackage.nz;
import defpackage.oe;
import defpackage.og;
import defpackage.pj;
import defpackage.pk;
import defpackage.pl;
import defpackage.pm;
import defpackage.pn;
import defpackage.po;
import defpackage.pp;
import defpackage.pq;
import defpackage.pu;
import defpackage.pw;
import defpackage.px;
import defpackage.py;
import defpackage.pz;
import defpackage.qd;
import defpackage.qe;
import defpackage.qf;
import defpackage.qg;
import defpackage.qh;
import defpackage.qi;
import defpackage.qj;
import defpackage.qk;
import defpackage.ql;
import defpackage.qm;
import defpackage.qn;
import defpackage.qr;
import defpackage.qs;
import defpackage.qt;
import defpackage.qu;
import defpackage.qv;
import defpackage.qx;
import defpackage.sk;
import defpackage.sl;
import defpackage.wx;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final /* synthetic */ int ac = 0;
    private static final Class[] af;
    public static final Interpolator c;
    static final qt d;
    boolean A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public EdgeEffect E;
    public px F;
    public qg G;
    public float H;
    public float I;
    public boolean J;
    public final qu K;
    public og L;
    public oe M;
    public final qs N;
    public List O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public qx S;
    public final int[] T;
    final List U;
    boolean V;
    afw W;
    private final int aA;
    private final int[] aB;
    private agg aC;
    private final int[] aD;
    private final int[] aE;
    private Runnable aF;
    private boolean aG;
    private int aH;
    private int aI;
    private final afx aJ;
    private py aK;
    private final pm aL;
    agq aa;
    public ejs ab;
    private final float ag;
    private final qm ah;
    private final Rect ai;
    private qh aj;
    private int ak;
    private boolean al;
    private int am;
    private final AccessibilityManager an;
    private int ao;
    private int ap;
    private pu aq;
    private int ar;
    private int as;
    private VelocityTracker at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private final int az;
    public final ql e;
    SavedState f;
    public lc g;
    public na h;
    public final sl i;
    boolean j;
    public final Runnable k;
    public final Rect l;
    public final RectF m;
    public pq n;
    public qd o;
    public final List p;
    public final ArrayList q;
    public final ArrayList r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public List y;
    public boolean z;
    private static final int[] ad = {R.attr.nestedScrollingEnabled};
    private static final float ae = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    public static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        af = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new pl();
        d = new qt();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void B(qv qvVar) {
        WeakReference weakReference = qvVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == qvVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            qvVar.b = null;
        }
    }

    public static void O(View view, Rect rect) {
        qe qeVar = (qe) view.getLayoutParams();
        Rect rect2 = qeVar.d;
        rect.set((view.getLeft() - rect2.left) - qeVar.leftMargin, (view.getTop() - rect2.top) - qeVar.topMargin, view.getRight() + rect2.right + qeVar.rightMargin, view.getBottom() + rect2.bottom + qeVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.B;
        float f2 = 0.0f;
        if (edgeEffect == null || akv.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && akv.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.D.onRelease();
                } else {
                    float fB = akv.b(this.D, width, height);
                    if (akv.a(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.B.onRelease();
            } else {
                float f3 = -akv.b(this.B, -width, 1.0f - height);
                if (akv.a(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private final int aB(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.C;
        float f2 = 0.0f;
        if (edgeEffect == null || akv.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.E;
            if (edgeEffect2 != null && akv.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.E.onRelease();
                } else {
                    float fB = akv.b(this.E, height, 1.0f - width);
                    if (akv.a(this.E) == 0.0f) {
                        this.E.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.C.onRelease();
            } else {
                float f3 = -akv.b(this.C, -height, width);
                if (akv.a(this.C) == 0.0f) {
                    this.C.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final agq aC() {
        if (this.aa == null) {
            this.aa = new agq(this);
        }
        return this.aa;
    }

    private final void aD() {
        aM();
        aj(0);
    }

    private final void aE() {
        this.N.b(1);
        N(this.N);
        this.N.i = false;
        am();
        sl slVar = this.i;
        slVar.e();
        U();
        aI();
        View focusedChild = (this.J && hasFocus() && this.n != null) ? getFocusedChild() : null;
        qv qvVarFb = focusedChild != null ? fb(focusedChild) : null;
        if (qvVarFb == null) {
            aL();
        } else {
            qs qsVar = this.N;
            qsVar.m = this.n.b ? qvVarFb.e : -1L;
            qsVar.l = this.z ? -1 : qvVarFb.s() ? qvVarFb.d : qvVarFb.cs();
            qs qsVar2 = this.N;
            View focusedChild2 = qvVarFb.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            qsVar2.n = id;
        }
        qs qsVar3 = this.N;
        qsVar3.h = qsVar3.j && this.Q;
        this.Q = false;
        this.P = false;
        qsVar3.g = qsVar3.k;
        qsVar3.e = this.n.a();
        aG(this.aB);
        if (this.N.j) {
            int iA = this.h.a();
            for (int i = 0; i < iA; i++) {
                qv qvVarM = m(this.h.d(i));
                if (!qvVarM.x() && (!qvVarM.q() || this.n.b)) {
                    px.s(qvVarM);
                    qvVarM.d();
                    pw pwVar = new pw();
                    pwVar.a(qvVarM);
                    slVar.d(qvVarM, pwVar);
                    if (this.N.h && qvVarM.v() && !qvVarM.s() && !qvVarM.x() && !qvVarM.q()) {
                        slVar.b.i(f(qvVarM), qvVarM);
                    }
                }
            }
        }
        if (this.N.k) {
            int iB = this.h.b();
            for (int i2 = 0; i2 < iB; i2++) {
                qv qvVarM2 = m(this.h.e(i2));
                if (!qvVarM2.x() && qvVarM2.d == -1) {
                    qvVarM2.d = qvVarM2.c;
                }
            }
            qs qsVar4 = this.N;
            boolean z = qsVar4.f;
            qsVar4.f = false;
            this.o.o(this.e, qsVar4);
            this.N.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                qv qvVarM3 = m(this.h.d(i3));
                if (!qvVarM3.x()) {
                    wx wxVar = slVar.a;
                    sk skVar = (sk) wxVar.get(qvVarM3);
                    if (skVar == null || (skVar.b & 4) == 0) {
                        px.s(qvVarM3);
                        boolean zN = qvVarM3.n(8192);
                        qvVarM3.d();
                        pw pwVar2 = new pw();
                        pwVar2.a(qvVarM3);
                        if (zN) {
                            Y(qvVarM3, pwVar2);
                        } else {
                            sk skVarA = (sk) wxVar.get(qvVarM3);
                            if (skVarA == null) {
                                skVarA = sk.a();
                                wxVar.put(qvVarM3, skVarA);
                            }
                            skVarA.b |= 2;
                            skVarA.c = pwVar2;
                        }
                    }
                }
            }
            C();
        } else {
            C();
        }
        V(true);
        an(false);
        this.N.d = 2;
    }

    private final void aF() {
        am();
        U();
        this.N.b(6);
        this.g.d();
        int iA = this.n.a();
        qs qsVar = this.N;
        qsVar.e = iA;
        qsVar.c = 0;
        SavedState savedState = this.f;
        if (savedState != null) {
            int i = this.n.c;
            Parcelable parcelable = savedState.a;
            if (parcelable != null) {
                this.o.Y(parcelable);
            }
            this.f = null;
        }
        qs qsVar2 = this.N;
        qsVar2.g = false;
        this.o.o(this.e, qsVar2);
        qs qsVar3 = this.N;
        qsVar3.f = false;
        qsVar3.j = qsVar3.j && this.F != null;
        qsVar3.d = 4;
        V(true);
        an(false);
    }

    private final void aG(int[] iArr) {
        int iA = this.h.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iA; i3++) {
            qv qvVarM = m(this.h.d(i3));
            if (!qvVarM.x()) {
                int iC = qvVarM.c();
                if (iC < i2) {
                    i2 = iC;
                }
                if (iC > i) {
                    i = iC;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aH(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.as) {
            int i = actionIndex == 0 ? 1 : 0;
            this.as = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.aw = x;
            this.au = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.ax = y;
            this.av = y;
        }
    }

    private final void aI() {
        boolean z;
        if (this.z) {
            this.g.i();
            if (this.A) {
                this.o.y();
            }
        }
        if (aQ()) {
            this.g.f();
        } else {
            this.g.d();
        }
        boolean z2 = this.P || this.Q;
        qs qsVar = this.N;
        boolean z3 = this.u && this.F != null && ((z = this.z) || z2 || this.o.y) && (!z || this.n.b);
        qsVar.j = z3;
        qsVar.k = z3 && z2 && !this.z && aQ();
    }

    private final void aJ() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.B.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.D;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aK(View view, View view2) {
        boolean z;
        RecyclerView recyclerView;
        View view3;
        View view4 = view2 != null ? view2 : view;
        Rect rect = this.l;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof qe) {
            qe qeVar = (qe) layoutParams;
            if (!qeVar.e) {
                Rect rect2 = qeVar.d;
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
        qd qdVar = this.o;
        boolean z2 = !this.u;
        if (view2 == null) {
            z = true;
            view3 = view;
            recyclerView = this;
        } else {
            z = false;
            recyclerView = this;
            view3 = view;
        }
        qdVar.br(recyclerView, view3, rect, z2, z);
    }

    private final void aL() {
        qs qsVar = this.N;
        qsVar.m = -1L;
        qsVar.l = -1;
        qsVar.n = -1;
    }

    private final void aM() {
        VelocityTracker velocityTracker = this.at;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        q().b(0);
        aJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aN(int i) {
        boolean zAd = this.o.ad();
        int i2 = zAd;
        if (this.o.ae()) {
            i2 = (zAd ? 1 : 0) | 2;
        }
        q().h(i2, i);
    }

    private final void aO() {
        qr qrVar;
        this.K.d();
        qd qdVar = this.o;
        if (qdVar == null || (qrVar = qdVar.x) == null) {
            return;
        }
        qrVar.n();
    }

    private final boolean aP(MotionEvent motionEvent) {
        ArrayList arrayList = this.r;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qh qhVar = (qh) arrayList.get(i);
            if (qhVar.f(this, motionEvent) && action != 3) {
                this.aj = qhVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aQ() {
        return this.F != null && this.o.v();
    }

    private final boolean aR(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fA = akv.a(edgeEffect) * i2;
        float fAbs = Math.abs(-i);
        float f = this.ag * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d2 = ae;
        return ((float) (((double) f) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fA;
    }

    private final void aS(Context context, String str, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
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
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(qd.class);
                try {
                    constructor = clsAsSubclass.getConstructor(af);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(a.g(strTrim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                ai((qd) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(a.g(strTrim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(a.g(strTrim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(a.g(strTrim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(a.g(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(a.g(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    private final void aT(pq pqVar, boolean z) {
        pq pqVar2 = this.n;
        if (pqVar2 != null) {
            pqVar2.a.unregisterObserver(this.ah);
        }
        Z();
        this.g.i();
        pq pqVar3 = this.n;
        this.n = pqVar;
        if (pqVar != null) {
            pqVar.a.registerObserver(this.ah);
        }
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.aU(pqVar3, this.n);
        }
        ql qlVar = this.e;
        pq pqVar4 = this.n;
        qlVar.d();
        qlVar.f(pqVar3, true);
        qk qkVarB = qlVar.b();
        if (pqVar3 != null) {
            qkVarB.d();
        }
        if (!z && qkVarB.b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = qkVarB.a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ArrayList arrayList = ((qj) sparseArray.valueAt(i)).a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    alf.b(((qv) arrayList.get(i2)).a);
                }
                arrayList.clear();
                i++;
            }
        }
        if (pqVar4 != null) {
            qkVarB.c();
        }
        qlVar.e();
        this.N.f = true;
    }

    public static qv m(View view) {
        if (view == null) {
            return null;
        }
        return ((qe) view.getLayoutParams()).c;
    }

    public static RecyclerView n(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewN = n(viewGroup.getChildAt(i));
            if (recyclerViewN != null) {
                return recyclerViewN;
            }
        }
        return null;
    }

    public final void A(String str) {
        if (au()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(r()));
        }
        if (this.ap > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(r())));
        }
    }

    final void C() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            qv qvVarM = m(this.h.e(i));
            if (!qvVarM.x()) {
                qvVarM.f();
            }
        }
        ql qlVar = this.e;
        ArrayList arrayList = qlVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((qv) arrayList.get(i2)).f();
        }
        ArrayList arrayList2 = qlVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((qv) arrayList2.get(i3)).f();
        }
        ArrayList arrayList3 = qlVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((qv) qlVar.b.get(i4)).f();
            }
        }
    }

    public final void D(int i, int i2) {
        EdgeEffect edgeEffect = this.B;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.B.onRelease();
            zIsFinished = this.B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.D;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.E.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void E() {
        if (!this.u || this.z) {
            Trace.beginSection("RV FullInvalidate");
            H();
            Trace.endSection();
            return;
        }
        if (this.g.k()) {
            if (!this.g.j(4) || this.g.j(11)) {
                if (this.g.k()) {
                    Trace.beginSection("RV FullInvalidate");
                    H();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            am();
            U();
            this.g.f();
            if (!this.v) {
                int iA = this.h.a();
                int i = 0;
                while (true) {
                    if (i < iA) {
                        qv qvVarM = m(this.h.d(i));
                        if (qvVarM != null && !qvVarM.x() && qvVarM.v()) {
                            H();
                            break;
                        }
                        i++;
                    } else {
                        this.g.c();
                        break;
                    }
                }
            }
            an(true);
            V(true);
            Trace.endSection();
        }
    }

    public final void F(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = ahj.a;
        setMeasuredDimension(qd.ar(i, paddingLeft, getMinimumWidth()), qd.ar(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void G(View view) {
        qv qvVarM = m(view);
        pq pqVar = this.n;
        if (pqVar != null && qvVarM != null) {
            pqVar.i(qvVarM);
        }
        List list = this.y;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qf) this.y.get(size)).a(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void H() {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.H():void");
    }

    public final void I(int i, int i2) {
        this.ap++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.O;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((qi) this.O.get(size)).d(this, i, i2);
                }
            }
        }
        this.ap--;
    }

    public final void J() {
        if (this.E != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.aq.a(this);
        this.E = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void K() {
        if (this.B != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.aq.a(this);
        this.B = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void L() {
        if (this.D != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.aq.a(this);
        this.D = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void M() {
        if (this.C != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.aq.a(this);
        this.C = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void N(qs qsVar) {
        if (getScrollState() != 2) {
            qsVar.o = 0;
            qsVar.p = 0;
        } else {
            OverScroller overScroller = this.K.a;
            qsVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            qsVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void P() {
        this.E = null;
        this.C = null;
        this.D = null;
        this.B = null;
    }

    public final void Q() {
        if (this.q.size() == 0) {
            return;
        }
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.U("Cannot invalidate item decorations during a scroll or layout");
        }
        S();
        requestLayout();
    }

    public final void R(int i) {
        if (this.o == null) {
            return;
        }
        aj(2);
        this.o.Z(i);
        awakenScrollBars();
    }

    final void S() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            ((qe) this.h.e(i).getLayoutParams()).e = true;
        }
        ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qe qeVar = (qe) ((qv) arrayList.get(i2)).a.getLayoutParams();
            if (qeVar != null) {
                qeVar.e = true;
            }
        }
    }

    public final void T(int i, int i2, boolean z) {
        int i3;
        int iB = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iB) {
                break;
            }
            qv qvVarM = m(this.h.e(i4));
            if (qvVarM != null && !qvVarM.x()) {
                int i5 = qvVarM.c;
                if (i5 >= i3) {
                    qvVarM.j(-i2, z);
                    this.N.f = true;
                } else if (i5 >= i) {
                    qvVarM.j |= 8;
                    qvVarM.j(-i2, z);
                    qvVarM.c = i - 1;
                    this.N.f = true;
                }
            }
            i4++;
        }
        ql qlVar = this.e;
        ArrayList arrayList = qlVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            qv qvVar = (qv) arrayList.get(size);
            if (qvVar != null) {
                int i6 = qvVar.c;
                if (i6 >= i3) {
                    qvVar.j(-i2, z);
                } else if (i6 >= i) {
                    qvVar.j |= 8;
                    qlVar.i(size);
                }
            }
        }
    }

    public final void U() {
        this.ao++;
    }

    public final void V(boolean z) {
        int i;
        int i2 = this.ao - 1;
        this.ao = i2;
        if (i2 <= 0) {
            this.ao = 0;
            if (z) {
                int i3 = this.am;
                this.am = 0;
                if (i3 != 0 && at()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                List list = this.U;
                for (int size = list.size() - 1; size >= 0; size--) {
                    qv qvVar = (qv) list.get(size);
                    View view = qvVar.a;
                    if (view.getParent() == this && !qvVar.x() && (i = qvVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        qvVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void W() {
        if (this.R || !this.s) {
            return;
        }
        Runnable runnable = this.aF;
        int[] iArr = ahj.a;
        postOnAnimation(runnable);
        this.R = true;
    }

    public final void X(boolean z) {
        this.A = z | this.A;
        this.z = true;
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            qv qvVarM = m(this.h.e(i));
            if (qvVarM != null && !qvVarM.x()) {
                qvVarM.j |= 6;
            }
        }
        S();
        ql qlVar = this.e;
        ArrayList arrayList = qlVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qv qvVar = (qv) arrayList.get(i2);
            if (qvVar != null) {
                qvVar.j |= 6;
                qvVar.e(null);
            }
        }
        pq pqVar = qlVar.h.n;
        if (pqVar == null || !pqVar.b) {
            qlVar.h();
        }
    }

    public final void Y(qv qvVar, pw pwVar) {
        qvVar.l(0, 8192);
        if (this.N.h && qvVar.v() && !qvVar.s() && !qvVar.x()) {
            this.i.b.i(f(qvVar), qvVar);
        }
        this.i.d(qvVar, pwVar);
    }

    public final void Z() {
        px pxVar = this.F;
        if (pxVar != null) {
            pxVar.d();
        }
        qd qdVar = this.o;
        if (qdVar != null) {
            ql qlVar = this.e;
            qdVar.ba(qlVar);
            this.o.bb(qlVar);
        }
        this.e.d();
    }

    public final void aA(int i, int i2, boolean z) {
        qd qdVar = this.o;
        if (qdVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) {
            return;
        }
        if (true != qdVar.ad()) {
            i = 0;
        }
        if (true != this.o.ae()) {
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
            q().h(i3, 1);
        }
        this.K.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void aa(pz pzVar) {
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.U("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.q;
        arrayList.remove(pzVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        S();
        requestLayout();
    }

    public final void ab(qh qhVar) {
        this.r.remove(qhVar);
        if (this.aj == qhVar) {
            this.aj = null;
        }
    }

    public final void ac(qi qiVar) {
        List list = this.O;
        if (list != null) {
            list.remove(qiVar);
        }
    }

    public final void ad(int i, int i2, int[] iArr) {
        qv qvVar;
        am();
        U();
        Trace.beginSection("RV Scroll");
        N(this.N);
        int iD = i != 0 ? this.o.d(i, this.e, this.N) : 0;
        int iE = i2 != 0 ? this.o.e(i2, this.e, this.N) : 0;
        Trace.endSection();
        int iA = this.h.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewD = this.h.d(i3);
            qv qvVarL = l(viewD);
            if (qvVarL != null && (qvVar = qvVarL.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = qvVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        an(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        qd qdVar = this.o;
        if (qdVar == null || !qdVar.bo(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void ae(int i) {
        if (this.w) {
            return;
        }
        ao();
        qd qdVar = this.o;
        if (qdVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qdVar.Z(i);
            awakenScrollBars();
        }
    }

    public final void af(qx qxVar) {
        this.S = qxVar;
        ahj.n(this, qxVar);
    }

    public final void ag(pq pqVar) {
        suppressLayout(false);
        aT(pqVar, false);
        X(false);
        requestLayout();
    }

    public final void ah(px pxVar) {
        px pxVar2 = this.F;
        if (pxVar2 != null) {
            pxVar2.d();
            this.F.h = null;
        }
        this.F = pxVar;
        if (pxVar != null) {
            pxVar.h = this.aK;
        }
    }

    public void ai(qd qdVar) {
        if (qdVar == this.o) {
            return;
        }
        ao();
        if (this.o != null) {
            px pxVar = this.F;
            if (pxVar != null) {
                pxVar.d();
            }
            qd qdVar2 = this.o;
            ql qlVar = this.e;
            qdVar2.ba(qlVar);
            this.o.bb(qlVar);
            qlVar.d();
            if (this.s) {
                this.o.bx(this);
            }
            this.o.bj(null);
            this.o = null;
        } else {
            this.e.d();
        }
        na naVar = this.h;
        naVar.a.d();
        List list = naVar.b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            naVar.e.a((View) list.get(size));
            list.remove(size);
        }
        RecyclerView recyclerView = naVar.e.a;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.G(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.o = qdVar;
        if (qdVar != null) {
            if (qdVar.u != null) {
                throw new IllegalArgumentException("LayoutManager " + qdVar + " is already attached to a RecyclerView:" + qdVar.u.r());
            }
            this.o.bj(this);
            if (this.s) {
                this.o.aP(this);
            }
        }
        this.e.o();
        requestLayout();
    }

    public final void aj(int i) {
        if (i == this.ar) {
            return;
        }
        this.ar = i;
        if (i != 2) {
            aO();
        }
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.aY(i);
        }
        List list = this.O;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qi) this.O.get(size)).b(this, i);
            }
        }
    }

    public void ak(int i, int i2) {
        ay(i, i2);
    }

    public void al(int i) {
        if (this.w) {
            return;
        }
        qd qdVar = this.o;
        if (qdVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qdVar.aq(this, i);
        }
    }

    public final void am() {
        int i = this.ak + 1;
        this.ak = i;
        if (i != 1 || this.w) {
            return;
        }
        this.v = false;
    }

    public final void an(boolean z) {
        int i = this.ak;
        if (i <= 0) {
            this.ak = 1;
            i = 1;
        }
        if (!z && !this.w) {
            this.v = false;
        }
        if (i == 1) {
            if (z && this.v && !this.w && this.o != null && this.n != null) {
                H();
            }
            if (!this.w) {
                this.v = false;
            }
        }
        this.ak--;
    }

    public final void ao() {
        aj(0);
        aO();
    }

    public final boolean aq(int i, int i2) {
        return ar(i, i2, this.az, this.aA);
    }

    public final boolean ar(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        qd qdVar = this.o;
        if (qdVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.w) {
            return false;
        }
        boolean zAd = qdVar.ad();
        boolean zAe = this.o.ae();
        if (!zAd || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zAe || Math.abs(i2) < i3) {
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
            EdgeEffect edgeEffect = this.B;
            if (edgeEffect == null || akv.a(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.D;
                if (edgeEffect2 != null && akv.a(edgeEffect2) != 0.0f) {
                    if (aR(this.D, i, getWidth())) {
                        this.D.onAbsorb(i);
                        i = 0;
                    }
                    i5 = i;
                    i = 0;
                }
                i5 = 0;
            } else {
                int i7 = -i;
                if (aR(this.B, i7, getWidth())) {
                    this.B.onAbsorb(i7);
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
            EdgeEffect edgeEffect3 = this.C;
            if (edgeEffect3 == null || akv.a(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.E;
                if (edgeEffect4 != null && akv.a(edgeEffect4) != 0.0f) {
                    if (aR(this.E, i2, getHeight())) {
                        this.E.onAbsorb(i2);
                        i2 = 0;
                    }
                    i6 = 0;
                }
                i6 = i2;
                i2 = 0;
            } else {
                int i8 = -i2;
                if (aR(this.C, i8, getHeight())) {
                    this.C.onAbsorb(i8);
                    i2 = 0;
                }
                i6 = 0;
            }
        }
        if (i5 != 0) {
            int i9 = -i4;
            iMax = Math.max(i9, Math.min(i5, i4));
            iMax2 = Math.max(i9, Math.min(i2, i4));
            aN(1);
            this.K.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i92 = -i4;
            iMax = Math.max(i92, Math.min(i5, i4));
            iMax2 = Math.max(i92, Math.min(i2, i4));
            aN(1);
            this.K.a(iMax, iMax2);
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
        if (!q().d(f, f2)) {
            boolean z = zAd || zAe;
            q().c(f, f2, z);
            qg qgVar = this.G;
            if (qgVar != null && qgVar.e(i, i6)) {
                return true;
            }
            if (z) {
                int i10 = -i4;
                aN(1);
                this.K.a(Math.max(i10, Math.min(i, i4)), Math.max(i10, Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    public final boolean as() {
        return !this.u || this.z || this.g.k();
    }

    public final boolean at() {
        AccessibilityManager accessibilityManager = this.an;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean au() {
        return this.ao > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean av(int r21, int r22, int r23, int r24, android.view.MotionEvent r25, int r26) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.av(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    public final void aw(pz pzVar) {
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.U("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.q;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(pzVar);
        S();
        requestLayout();
    }

    public final void ax(qv qvVar, int i) {
        if (!au()) {
            qvVar.a.setImportantForAccessibility(i);
        } else {
            qvVar.p = i;
            this.U.add(qvVar);
        }
    }

    public void ay(int i, int i2) {
        aA(i, i2, false);
    }

    public final void az(pq pqVar) {
        suppressLayout(false);
        aT(pqVar, true);
        X(true);
        requestLayout();
    }

    public final int cD(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && akv.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * akv.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || akv.a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * akv.b(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public final int cE(qv qvVar) {
        if (qvVar.n(524) || !qvVar.p()) {
            return -1;
        }
        lc lcVar = this.g;
        int i = qvVar.c;
        ArrayList arrayList = lcVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lb lbVar = (lb) arrayList.get(i2);
            int i3 = lbVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = lbVar.b;
                    if (i4 <= i) {
                        int i5 = lbVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = lbVar.b;
                    if (i6 == i) {
                        i = lbVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (lbVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (lbVar.b <= i) {
                i += lbVar.d;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof qe) && this.o.t((qe) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        qd qdVar = this.o;
        if (qdVar != null && qdVar.ad()) {
            return this.o.C(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        qd qdVar = this.o;
        if (qdVar != null && qdVar.ad()) {
            return this.o.D(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        qd qdVar = this.o;
        if (qdVar != null && qdVar.ad()) {
            return this.o.E(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        qd qdVar = this.o;
        if (qdVar != null && qdVar.ae()) {
            return this.o.F(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        qd qdVar = this.o;
        if (qdVar != null && qdVar.ae()) {
            return this.o.G(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        qd qdVar = this.o;
        if (qdVar != null && qdVar.ae()) {
            return this.o.H(this.N);
        }
        return 0;
    }

    public final int d(View view) {
        qv qvVarM = m(view);
        if (qvVarM != null) {
            return qvVarM.cs();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        qd layoutManager = getLayoutManager();
        int iA = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.ae()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    aA(0, measuredHeight, false);
                } else {
                    aA(0, -measuredHeight, false);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zAh = layoutManager.ah();
                if (keyCode == 122) {
                    if (zAh) {
                        iA = getAdapter().a();
                    }
                } else if (!zAh) {
                    iA = getAdapter().a();
                }
                al(iA);
                return true;
            }
        } else if (layoutManager.ad()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    aA(measuredWidth, 0, false);
                } else {
                    aA(-measuredWidth, 0, false);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zAh2 = layoutManager.ah();
                if (keyCode2 == 122) {
                    if (zAh2) {
                        iA = getAdapter().a();
                    }
                } else if (!zAh2) {
                    iA = getAdapter().a();
                }
                al(iA);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return q().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return q().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return q().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return q().f(i, i2, i3, i4, iArr, 0, null);
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
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((pz) arrayList.get(i)).g(canvas, this);
        }
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.B;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.C;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.D;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.D;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.E;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.j) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.E;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.F != null && arrayList.size() > 0 && this.F.i())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e(View view) {
        qv qvVarM = m(view);
        if (qvVarM != null) {
            return qvVarM.c();
        }
        return -1;
    }

    final long f(qv qvVar) {
        return this.n.b ? qvVar.e : qvVar.c;
    }

    public final qv fb(View view) {
        View viewP = p(view);
        if (viewP == null) {
            return null;
        }
        return l(viewP);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0173, code lost:
    
        if (r16 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0191, code lost:
    
        if (r5 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0194, code lost:
    
        if (r16 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0197, code lost:
    
        if (r5 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01a7, code lost:
    
        if ((r5 * r13) >= 0) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final long g() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        qd qdVar = this.o;
        if (qdVar != null) {
            return qdVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(r()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        qd qdVar = this.o;
        if (qdVar != null) {
            return qdVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(r()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    public pq getAdapter() {
        return this.n;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.o != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        return this.ab == null ? super.getChildDrawingOrder(i, i2) : (i - 1) - i2;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.j;
    }

    public qx getCompatAccessibilityDelegate() {
        return this.S;
    }

    public pu getEdgeEffectFactory() {
        return this.aq;
    }

    public px getItemAnimator() {
        return this.F;
    }

    public int getItemDecorationCount() {
        return this.q.size();
    }

    public qd getLayoutManager() {
        return this.o;
    }

    public int getMaxFlingVelocity() {
        return this.aA;
    }

    public int getMinFlingVelocity() {
        return this.az;
    }

    public qg getOnFlingListener() {
        return this.G;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.J;
    }

    public qk getRecycledViewPool() {
        return this.e.b();
    }

    public int getScrollState() {
        return this.ar;
    }

    public final Rect h(View view) {
        qe qeVar = (qe) view.getLayoutParams();
        if (!qeVar.e) {
            return qeVar.d;
        }
        if (this.N.g && (qeVar.c.v() || qeVar.c.q())) {
            return qeVar.d;
        }
        Rect rect = qeVar.d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.l;
            rect2.set(0, 0, 0, 0);
            ((pz) arrayList.get(i)).i(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qeVar.e = false;
        return rect;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return q().g(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return q().a;
    }

    public final qv j(int i) {
        qv qvVar = null;
        if (this.z) {
            return null;
        }
        int iB = this.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            qv qvVarM = m(this.h.e(i2));
            if (qvVarM != null && !qvVarM.s() && cE(qvVarM) == i) {
                if (!this.h.l(qvVarM.a)) {
                    return qvVarM;
                }
                qvVar = qvVarM;
            }
        }
        return qvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qv k(int r6, boolean r7) {
        /*
            r5 = this;
            na r0 = r5.h
            int r0 = r0.b()
            r1 = 0
            r2 = 0
        L8:
            if (r1 >= r0) goto L3a
            na r3 = r5.h
            android.view.View r3 = r3.e(r1)
            qv r3 = m(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.s()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 != r6) goto L37
            goto L2a
        L23:
            int r4 = r3.c()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            na r2 = r5.h
            android.view.View r4 = r3.a
            boolean r2 = r2.l(r4)
            if (r2 == 0) goto L36
            r2 = r3
            goto L37
        L36:
            return r3
        L37:
            int r1 = r1 + 1
            goto L8
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.k(int, boolean):qv");
    }

    public final qv l(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m(view);
        }
        throw new IllegalArgumentException(a.d(this, view, "View ", " is not a direct child of "));
    }

    public final View o(float f, float f2) {
        int iA = this.h.a();
        while (true) {
            iA--;
            if (iA < 0) {
                return null;
            }
            View viewD = this.h.d(iA);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f >= viewD.getLeft() + translationX && f <= viewD.getRight() + translationX && f2 >= viewD.getTop() + translationY && f2 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ao = 0;
        this.s = true;
        this.u = this.u && !isLayoutRequested();
        this.e.e();
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.aP(this);
        }
        this.R = false;
        if (b) {
            ThreadLocal threadLocal = og.a;
            og ogVar = (og) threadLocal.get();
            this.L = ogVar;
            if (ogVar == null) {
                this.L = new og();
                int[] iArr = ahj.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                og ogVar2 = this.L;
                ogVar2.e = (long) (1.0E9f / f);
                threadLocal.set(ogVar2);
            }
            this.L.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        og ogVar;
        super.onDetachedFromWindow();
        px pxVar = this.F;
        if (pxVar != null) {
            pxVar.d();
        }
        ao();
        this.s = false;
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.bx(this);
        }
        this.U.clear();
        removeCallbacks(this.aF);
        while (sk.a.a() != null) {
        }
        ql qlVar = this.e;
        int i = 0;
        while (true) {
            ArrayList arrayList = qlVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            alf.b(((qv) arrayList.get(i)).a);
            i++;
        }
        qlVar.f(qlVar.h.n, false);
        ahq ahqVar = new ahq(new aho(this).a);
        while (ahqVar.hasNext()) {
            alf.a((View) ahqVar.next()).a();
        }
        if (!b || (ogVar = this.L) == null) {
            return;
        }
        ogVar.c.remove(this);
        this.L = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pz) arrayList.get(i)).j(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.w) {
            return false;
        }
        this.aj = null;
        if (aP(motionEvent)) {
            aD();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                qh qhVar = (qh) arrayList.get(i);
                if (qhVar != null && qhVar != this.aj) {
                    qhVar.f(this, motionEventObtain);
                }
            }
            return true;
        }
        qd qdVar = this.o;
        if (qdVar == null) {
            return false;
        }
        boolean zAd = qdVar.ad();
        boolean zAe = this.o.ae();
        if (this.at == null) {
            this.at = VelocityTracker.obtain();
        }
        this.at.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.al) {
                this.al = false;
            }
            this.as = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.aw = x;
            this.au = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.ax = y;
            this.av = y;
            EdgeEffect edgeEffect = this.B;
            if (edgeEffect == null || akv.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                akv.b(this.B, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && akv.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                akv.b(this.D, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.C;
            if (edgeEffect3 != null && akv.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                akv.b(this.C, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.E;
            if (edgeEffect4 == null || akv.a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z || this.ar == 2) {
                }
                int[] iArr = this.aE;
                iArr[1] = 0;
                iArr[0] = 0;
                aN(0);
            } else {
                akv.b(this.E, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            aj(1);
            q().b(1);
            int[] iArr2 = this.aE;
            iArr2[1] = 0;
            iArr2[0] = 0;
            aN(0);
        } else if (actionMasked == 1) {
            this.at.clear();
            q().b(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.as);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.as + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.ar != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.au;
                int i5 = i2 - this.av;
                if (!zAd || Math.abs(i4) <= this.ay) {
                    z2 = false;
                } else {
                    this.aw = i3;
                    z2 = true;
                }
                if (zAe && Math.abs(i5) > this.ay) {
                    this.ax = i2;
                } else if (z2) {
                }
                aj(1);
            }
        } else if (actionMasked == 3) {
            aD();
        } else if (actionMasked == 5) {
            this.as = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.aw = x3;
            this.au = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ax = y3;
            this.av = y3;
        } else if (actionMasked == 6) {
            aH(motionEvent);
        }
        return this.ar == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        H();
        Trace.endSection();
        this.u = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        qd qdVar = this.o;
        if (qdVar == null) {
            F(i, i2);
            return;
        }
        boolean z = false;
        if (qdVar.af()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.o.aX(this.e, this.N, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aG = z;
            if (z || this.n == null) {
                return;
            }
            if (this.N.d == 1) {
                aE();
            }
            this.o.bh(i, i2);
            this.N.i = true;
            aF();
            this.o.bi(i, i2);
            if (this.o.aj()) {
                this.o.bh(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.N.i = true;
                aF();
                this.o.bi(i, i2);
            }
            this.aH = getMeasuredWidth();
            this.aI = getMeasuredHeight();
            return;
        }
        if (this.t) {
            qdVar.aX(this.e, this.N, i, i2);
            return;
        }
        if (this.x) {
            am();
            U();
            aI();
            V(true);
            qs qsVar = this.N;
            if (qsVar.k) {
                qsVar.g = true;
            } else {
                this.g.d();
                this.N.g = false;
            }
            this.x = false;
            an(false);
        } else if (this.N.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        pq pqVar = this.n;
        if (pqVar != null) {
            this.N.e = pqVar.a();
        } else {
            this.N.e = 0;
        }
        am();
        this.o.aX(this.e, this.N, i, i2);
        an(false);
        this.N.g = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (au()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f;
        if (savedState2 != null) {
            savedState.a = savedState2.a;
            return savedState;
        }
        qd qdVar = this.o;
        if (qdVar != null) {
            savedState.a = qdVar.Q();
            return savedState;
        }
        savedState.a = null;
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        P();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final View p(View view) {
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

    public final agg q() {
        if (this.aC == null) {
            this.aC = new agg(this);
        }
        return this.aC;
    }

    public final String r() {
        return " " + super.toString() + ", adapter:" + this.n + ", layout:" + this.o + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        qv qvVarM = m(view);
        if (qvVarM != null) {
            if (qvVarM.u()) {
                qvVarM.i();
            } else if (!qvVarM.x()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + qvVarM + r());
            }
        }
        view.clearAnimation();
        G(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.o.bv(this, view, view2) && view2 != null) {
            aK(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.o.bq(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qh) arrayList.get(i)).a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ak != 0 || this.w) {
            this.v = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        qd qdVar = this.o;
        if (qdVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) {
            return;
        }
        boolean zAd = qdVar.ad();
        boolean zAe = this.o.ae();
        if (!zAd) {
            if (!zAe) {
                return;
            } else {
                zAe = true;
            }
        }
        av(true != zAd ? 0 : i, true != zAe ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!au()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.am |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.j) {
            P();
        }
        this.j = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    public void setItemViewCacheSize(int i) {
        ql qlVar = this.e;
        qlVar.e = i;
        qlVar.o();
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
        q().a(z);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.ay = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", a.a(i, "setScrollingTouchSlop(): bad argument constant ", "; using default value"));
        }
        this.ay = viewConfiguration.getScaledTouchSlop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return q().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        q().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.w) {
            A("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.w = true;
                this.al = true;
                ao();
                return;
            }
            this.w = false;
            if (this.v && this.o != null && this.n != null) {
                requestLayout();
            }
            this.v = false;
        }
    }

    public final void x(qv qvVar) {
        View view = qvVar.a;
        ViewParent parent = view.getParent();
        this.e.n(l(view));
        if (qvVar.u()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.h.f(view, -1, true);
            return;
        }
        na naVar = this.h;
        int iIndexOfChild = naVar.e.a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        naVar.a.e(iIndexOfChild);
        naVar.i(view);
    }

    public final void y(qi qiVar) {
        if (this.O == null) {
            this.O = new ArrayList();
        }
        this.O.add(qiVar);
    }

    final void z(qv qvVar, pw pwVar, pw pwVar2) {
        qvVar.m(false);
        if (this.F.n(qvVar, pwVar, pwVar2)) {
            W();
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.katniss.R.attr.recyclerViewStyle);
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new qn();
        Parcelable a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readParcelable(classLoader == null ? qd.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.a, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i);
        RecyclerView recyclerView = this;
        recyclerView.ah = new qm(recyclerView);
        recyclerView.e = new ql(recyclerView);
        recyclerView.i = new sl();
        recyclerView.k = new pj(recyclerView);
        recyclerView.l = new Rect();
        recyclerView.ai = new Rect();
        recyclerView.m = new RectF();
        recyclerView.p = new ArrayList();
        recyclerView.q = new ArrayList();
        recyclerView.r = new ArrayList();
        recyclerView.ak = 0;
        recyclerView.z = false;
        recyclerView.A = false;
        recyclerView.ao = 0;
        recyclerView.ap = 0;
        recyclerView.aq = d;
        recyclerView.F = new nn();
        recyclerView.ar = 0;
        recyclerView.as = -1;
        recyclerView.H = Float.MIN_VALUE;
        recyclerView.I = Float.MIN_VALUE;
        recyclerView.J = true;
        recyclerView.K = new qu(recyclerView);
        recyclerView.M = b ? new oe() : null;
        recyclerView.N = new qs();
        recyclerView.P = false;
        recyclerView.Q = false;
        recyclerView.aK = new py(recyclerView);
        recyclerView.R = false;
        recyclerView.aB = new int[2];
        recyclerView.aD = new int[2];
        recyclerView.aE = new int[2];
        recyclerView.T = new int[2];
        recyclerView.U = new ArrayList();
        recyclerView.aF = new pk(recyclerView);
        recyclerView.aH = 0;
        recyclerView.aI = 0;
        recyclerView.aL = new pm(recyclerView);
        pn pnVar = new pn(recyclerView);
        recyclerView.aJ = pnVar;
        recyclerView.W = new afw(recyclerView.getContext(), pnVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.ay = viewConfiguration.getScaledTouchSlop();
        recyclerView.H = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.I = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.az = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.aA = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ag = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.F.h = recyclerView.aK;
        recyclerView.g = new lc(new pp(recyclerView));
        recyclerView.h = new na(new po(recyclerView));
        int[] iArr = ahj.a;
        if (ahe.a(recyclerView) == 0) {
            ahe.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.an = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.af(new qx(recyclerView));
        int[] iArr2 = hu.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ahj.m(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.j = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = recyclerView.getContext().getResources();
                new nz(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.katniss.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.katniss.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.katniss.R.dimen.fastscroll_margin));
                recyclerView = this;
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.r()));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.V = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aS(context, string, attributeSet, i);
        int[] iArr3 = ad;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        ahj.m(recyclerView, context, iArr3, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.q().a(z);
        recyclerView.setTag(com.google.android.katniss.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        qd qdVar = this.o;
        if (qdVar != null) {
            return qdVar.eH(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(r()));
    }
}
