package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoViewTestHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvz extends ComponentHost implements emi, emx {
    private static final String x = "dvz";
    private static final int[] y = new int[2];
    private final dru A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private final Rect G;
    private final AccessibilityManager H;
    private final dvw I;
    private boolean J;
    public boolean j;
    public boolean k;
    public boolean l;
    public ComponentTree m;
    public final dwm n;
    public boolean o;
    public final Rect p;
    public boolean q;
    public ComponentTree r;
    public int s;
    public Map t;
    public dvy u;
    public mib v;
    public mia w;
    private boolean z;

    public dvz(Context context) {
        dru druVar = new dru(context, null, null, null);
        boolean z = ebc.a;
        this(druVar);
    }

    private static int B(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return mode == 0 ? i : View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - i2), mode);
    }

    private final void C() {
        if (this.B) {
            return;
        }
        this.B = true;
        ComponentTree componentTree = this.m;
        if (componentTree != null) {
            componentTree.j();
        }
        h(dra.b(getContext()));
        AccessibilityManager accessibilityManager = this.H;
        dvw dvwVar = this.I;
        if (dvwVar != null) {
            accessibilityManager.addAccessibilityStateChangeListener(new ajn(dvwVar));
        }
        if (z()) {
            return;
        }
        dwm dwmVar = this.n;
        dyd.a();
        if (dwmVar.d) {
            return;
        }
        dyd.a();
        if (dwmVar.f) {
            return;
        }
        boolean z = ebc.a;
        p();
    }

    private final void D() {
        if (this.B) {
            this.B = false;
            if (!z()) {
                boolean z = ebc.a;
                ComponentTree componentTree = this.m;
                if (componentTree != null && !componentTree.o) {
                    t(new Rect());
                }
            }
            dwm dwmVar = this.n;
            dyd.a();
            dwmVar.v();
            ComponentTree componentTree2 = this.m;
            if (componentTree2 != null) {
                componentTree2.m();
            }
            AccessibilityManager accessibilityManager = this.H;
            dvw dvwVar = this.I;
            if (dvwVar == null) {
                return;
            }
            accessibilityManager.removeAccessibilityStateChangeListener(new ajn(dvwVar));
        }
    }

    private final void E() {
        if (this.m == null || !(getParent() instanceof View)) {
            return;
        }
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int translationX = (int) getTranslationX();
        int translationY = (int) getTranslationY();
        int top = getTop() + translationY;
        int bottom = getBottom() + translationY;
        int left = getLeft() + translationX;
        int right = getRight() + translationX;
        Rect rect = this.p;
        if (left < 0 || top < 0 || right > width || bottom > height || rect.left < 0 || rect.top < 0 || rect.right > width || rect.bottom > height || rect.width() != getWidth() || rect.height() != getHeight()) {
            Rect rect2 = new Rect();
            if (getLocalVisibleRect(rect2)) {
                r(rect2, true);
            }
        }
    }

    private static void F(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        if (childCount == 0) {
            return;
        }
        View[] viewArr = new View[childCount];
        for (int i = 0; i < childCount; i++) {
            viewArr[i] = componentHost.getChildAt(i);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View view = viewArr[i2];
            if (view.getParent() == componentHost) {
                if (view.isLayoutRequested()) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                    view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                if (view instanceof ComponentHost) {
                    F((ComponentHost) view);
                }
            }
        }
    }

    private static void G(View view, drl drlVar) {
        drlVar.b(view.getClass().getSimpleName(), new Object[0]);
        drlVar.a();
        view.getGlobalVisibleRect(new Rect());
        drlVar.b("View.getVisibility(): %d", Integer.valueOf(view.getVisibility()));
        drlVar.b("View.rect: [%.2f, %.2f, %d, %d]", Float.valueOf(view.getX()), Float.valueOf(view.getY()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
        if (view instanceof dvz) {
            ((dvz) view).c(drlVar);
        } else if (view instanceof ComponentHost) {
            ((ComponentHost) view).c(drlVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                G(viewGroup.getChildAt(i), drlVar);
            }
        }
        drlVar.d();
    }

    public static void u(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof dvz) {
                if (z) {
                    dvz dvzVar = (dvz) childAt;
                    if (!dvzVar.o) {
                        super.onAttachedToWindow();
                        dvzVar.C();
                        dvzVar.o = true;
                        u(dvzVar, true);
                    }
                } else {
                    dvz dvzVar2 = (dvz) childAt;
                    if (dvzVar2.o) {
                        dvzVar2.o = false;
                        super.onDetachedFromWindow();
                        dvzVar2.D();
                        u(dvzVar2, dvzVar2.o);
                    }
                }
            } else if (childAt instanceof ViewGroup) {
                u((ViewGroup) childAt, z);
            }
        }
    }

    public final boolean A() {
        return this.k && this.j && !this.z;
    }

    @Override // com.facebook.litho.ComponentHost
    protected final Map b(int i, int i2) {
        Map mapB = super.b(i, i2);
        ComponentTree componentTree = getComponentTree();
        if (componentTree == null) {
            mapB.put("lithoView", null);
            return mapB;
        }
        HashMap map = new HashMap();
        mapB.put("lithoView", map);
        if (componentTree.b() == null) {
            map.put("root", null);
            return mapB;
        }
        map.put("root", componentTree.b().d());
        map.put("tree", dsp.a(componentTree.l));
        return mapB;
    }

    @Override // com.facebook.litho.ComponentHost
    protected final void c(drl drlVar) {
        drlVar.b("mIsAttached: %b", Boolean.valueOf(this.B));
        drlVar.b("mForceLayout: %b", Boolean.valueOf(this.q));
        drlVar.b("mSuppressMeasureComponentTree: %b", false);
        drlVar.b("mIsMeasuring: %b", Boolean.valueOf(this.C));
        drlVar.b("mHasNewComponentTree: %b", Boolean.valueOf(this.D));
        drlVar.b("mTemporaryDetachedComponent: %b", this.r);
        drlVar.b("mDoMeasureInLayout: %b", Boolean.valueOf(this.J));
        drlVar.b("mIsMountStateDirty: %b", false);
        super.c(drlVar);
        dwm dwmVar = this.n;
        if (dwmVar != null) {
            drlVar.b("MountState", new Object[0]);
            drlVar.a();
            drlVar.b("mIsDirty: %b", Boolean.valueOf(dwmVar.d));
            drlVar.b("mIsMounting: %b", Boolean.valueOf(dwmVar.e));
            drlVar.b("mNeedsRemount: %b", Boolean.valueOf(dwmVar.f));
            drlVar.b("mIsBound: %b", false);
            drlVar.d();
        }
        ComponentTree componentTree = this.m;
        if (componentTree != null) {
            drlVar.c("ComponentTree");
            drlVar.a();
            drlVar.b("mReleased: %b", Boolean.valueOf(componentTree.f));
            drlVar.b("mIsMounting: %b", Boolean.valueOf(componentTree.m));
            drlVar.b("mIncrementalMountEnabled: %b", Boolean.valueOf(componentTree.o));
            drlVar.b("mIsAttached: %b", Boolean.valueOf(componentTree.q));
            drlVar.b("mHasMounted: %b", Boolean.valueOf(componentTree.u));
            drlVar.b("mWidthSpec: %d", Integer.valueOf(componentTree.z));
            drlVar.b("mHeightSpec: %d", Integer.valueOf(componentTree.A));
            drlVar.b("mWidthSpec: %d", Integer.valueOf(componentTree.z));
            drlVar.b("mIsMereing: %b", Boolean.valueOf(componentTree.n));
            drlVar.b("mMainThreadLayoutState == null: %b", Boolean.valueOf(componentTree.B == null));
            drlVar.b("mCommittedLayoutState == null: %b", Boolean.valueOf(componentTree.C == null));
            dvd dvdVar = componentTree.C;
            if (dvdVar != null) {
                dvs dvsVar = dvdVar.n;
                drlVar.b("layoutRoot == null: %b", Boolean.valueOf(dvsVar == null));
                if (dvsVar != null) {
                    dvsVar.B(drlVar);
                }
            }
            drlVar.d();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z = ebc.a;
        mib mibVar = this.v;
        if (mibVar != null) {
            mid midVar = mibVar.a;
            midVar.c.a(3);
            midVar.a.v = null;
        }
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            super.draw(canvas);
            mia miaVar = this.w;
            if (miaVar != null) {
                hhs hhsVar = miaVar.a;
                hhw hhwVar = hhsVar.a;
                hhwVar.ao.c(rpm.dZ(), abqb.OK, null, null);
                hhwVar.aq.o(gmc.A, hhwVar.as.a(), hkb.c(hhwVar));
                hhsVar.b.a(null);
            }
        } catch (Throwable th) {
            throw new dvp(null, this.m, th);
        }
    }

    public Deque findTestItems(String str) {
        Map map = this.n.b;
        if (map == null) {
            throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
        }
        Deque deque = (Deque) map.get(str);
        return deque == null ? new LinkedList() : deque;
    }

    public List getChildLithoViewsFromCurrentlyMountedItems() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            wr wrVar = this.n.a;
            if (i >= wrVar.c()) {
                return arrayList;
            }
            elv elvVar = (elv) wrVar.e(wrVar.d(i));
            if (elvVar != null) {
                Object obj = elvVar.a;
                if (obj instanceof duj) {
                    ((duj) obj).a(arrayList);
                }
            }
            i++;
        }
    }

    public dru getComponentContext() {
        return this.A;
    }

    public ComponentTree getComponentTree() {
        return this.m;
    }

    public String getDebugInfo() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return "Failed to collect debug info: walkViewTreeForDebugInfo() called on non-UI thread.";
        }
        try {
            drl drlVar = new drl();
            drlVar.c("Elements Debug Info Dump Start");
            G(this, drlVar);
            drlVar.c("Elements Debug Info Dump End");
            drlVar.b.flush();
            return drlVar.a.toString("UTF-8");
        } catch (IOException e) {
            return "Failed to collect debug info: ".concat(e.toString());
        }
    }

    public dtk getDynamicPropsManager() {
        dwm dwmVar = this.n;
        if (dwmVar != null) {
            return dwmVar.k;
        }
        return null;
    }

    public elu getMountDelegateTarget() {
        return this.n;
    }

    public Rect getPreviousMountBounds() {
        return this.p;
    }

    @Override // com.facebook.litho.ComponentHost
    protected final boolean n() {
        ComponentTree componentTree = this.m;
        if (componentTree == null || !componentTree.m) {
            return super.n();
        }
        return false;
    }

    @Override // com.facebook.litho.ComponentHost
    public final void o(int i, int i2, int i3, int i4) {
        boolean z = ebc.a;
        dru druVar = this.A;
        ohv ohvVarO = druVar.o();
        dxc dxcVarA = ohvVarO != null ? dwb.a(druVar, ohvVarO, ohvVarO.a(druVar, 22)) : null;
        ComponentTree componentTree = this.m;
        if (componentTree != null) {
            if (componentTree.A()) {
                throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
            }
            if (this.J || componentTree.B == null) {
                this.m.o(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i4 - i2) - getPaddingTop()) - getPaddingBottom()), 1073741824), y, false);
                this.D = false;
                this.J = false;
            }
            ComponentTree componentTree2 = this.m;
            dyd.a();
            boolean zB = componentTree2.B();
            if (zB && !z()) {
                p();
            }
            if (!zB) {
                s();
            }
            if (!zB) {
                F(this);
            }
        }
        if (dxcVarA != null) {
            ohvVarO.c(dxcVarA);
        }
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        E();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        E();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        C();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvz.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        D();
    }

    public final void p() {
        ComponentTree componentTree = this.m;
        if (componentTree == null || componentTree.o) {
            return;
        }
        t(new Rect(0, 0, getWidth(), getHeight()));
    }

    @Override // defpackage.emb
    public final void q() {
        s();
    }

    @Override // defpackage.emx
    public final void r(Rect rect, boolean z) {
        ComponentTree componentTree = this.m;
        if (componentTree == null || componentTree.B == null) {
            return;
        }
        emc emcVar = emd.a;
        boolean z2 = ema.a;
        ComponentTree componentTree2 = this.m;
        if (componentTree2.o) {
            componentTree2.p(rect, z);
        } else if (z) {
            t(rect);
        }
    }

    public final void s() {
        ComponentTree componentTree = this.m;
        if (componentTree == null || componentTree.B == null) {
            return;
        }
        emc emcVar = emd.a;
        boolean z = ema.a;
        ComponentTree componentTree2 = this.m;
        if (componentTree2.o) {
            componentTree2.n();
            return;
        }
        Rect rect = new Rect();
        if (!getLocalVisibleRect(rect)) {
            rect.setEmpty();
        }
        t(rect);
    }

    @Override // defpackage.emx
    public void setAnimatedHeight(int i) {
        this.F = i;
        requestLayout();
    }

    @Override // defpackage.emx
    public void setAnimatedWidth(int i) {
        this.E = i;
        requestLayout();
    }

    @Override // android.view.View
    public final void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        if (z) {
            if (this.s == 0 && this.m != null) {
                r(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            this.s++;
            return;
        }
        int i = this.s - 1;
        this.s = i;
        if (i == 0 && this.m != null) {
            s();
        }
        if (this.s < 0) {
            this.s = 0;
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f == getTranslationX()) {
            return;
        }
        super.setTranslationX(f);
        E();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (f == getTranslationY()) {
            return;
        }
        super.setTranslationY(f);
        E();
    }

    final void t(Rect rect) {
        ComponentTree componentTree = this.m;
        if (componentTree == null || !componentTree.p) {
            return;
        }
        boolean z = ebc.a;
        dvd dvdVar = this.m.B;
        if (dvdVar == null) {
            Log.w(x, "Main Thread Layout state is not found");
            return;
        }
        dvdVar.N = true;
        dwm dwmVar = this.n;
        dyd.a();
        dwmVar.r(rect, dwmVar.d);
        this.p.set(rect);
    }

    @Override // android.view.View
    public final String toString() {
        return String.valueOf(super.toString()).concat(LithoViewTestHelper.viewToString(this, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.facebook.litho.ComponentTree r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvz.v(com.facebook.litho.ComponentTree, boolean):void");
    }

    public final void w() {
        dyd.a();
        dwm dwmVar = this.n;
        dwmVar.d = true;
        dwmVar.h.setEmpty();
        this.p.setEmpty();
    }

    public final void x(boolean z) {
        dyd.a();
        if (this.m == null) {
            return;
        }
        if (!this.j) {
            if (z) {
                return;
            } else {
                z = false;
            }
        }
        this.j = true;
        this.k = true;
        boolean zA = A();
        this.z = z;
        if (!z) {
            this.n.n();
            return;
        }
        if (zA) {
            s();
            return;
        }
        Rect rect = this.G;
        if (getLocalVisibleRect(rect)) {
            t(rect);
        }
    }

    @Deprecated
    public final void y() {
        dyd.a();
        dwm dwmVar = this.n;
        if (dwmVar.c != null) {
            emc emcVar = emd.a;
            boolean z = ema.a;
            dwmVar.x(0, dwmVar.g);
            dwmVar.h.setEmpty();
            dwmVar.f = true;
            if (dwmVar.i != null) {
                emm emmVar = dwmVar.j;
                eni.a(emmVar);
                enh enhVar = (enh) emmVar.c;
                enhVar.b.setEmpty();
                enhVar.f = null;
            }
            if (dwmVar.m != null) {
                emm emmVar2 = dwmVar.n;
                emmVar2.c();
                dzg.h(emmVar2);
                emmVar2.c();
                dzg.c(emmVar2);
            }
            els elsVar = dwmVar.l;
            dwmVar.m();
        }
        this.E = -1;
        this.F = -1;
        this.p.setEmpty();
    }

    public final boolean z() {
        ComponentTree componentTree = this.m;
        return componentTree != null && componentTree.o;
    }

    public dvz(dru druVar) {
        super(druVar.a);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.l = false;
        this.p = new Rect();
        this.C = false;
        this.D = false;
        this.E = -1;
        this.F = -1;
        this.G = new Rect();
        this.w = null;
        this.v = null;
        this.I = new dvw(this);
        this.A = druVar;
        boolean z = ebc.a;
        this.n = new dwm(this);
        this.H = (AccessibilityManager) druVar.a.getSystemService("accessibility");
        dvr.a(this);
    }
}
