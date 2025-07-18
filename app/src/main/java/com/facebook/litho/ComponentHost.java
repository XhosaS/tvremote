package com.facebook.litho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.ahj;
import defpackage.dra;
import defpackage.drl;
import defpackage.drs;
import defpackage.drv;
import defpackage.drw;
import defpackage.drx;
import defpackage.dsa;
import defpackage.dsb;
import defpackage.dsc;
import defpackage.dsf;
import defpackage.dsg;
import defpackage.dsr;
import defpackage.dtf;
import defpackage.duh;
import defpackage.dup;
import defpackage.duz;
import defpackage.dvp;
import defpackage.dvr;
import defpackage.dvu;
import defpackage.dvz;
import defpackage.dww;
import defpackage.dyd;
import defpackage.dyf;
import defpackage.dyg;
import defpackage.dyh;
import defpackage.dzj;
import defpackage.ebc;
import defpackage.elr;
import defpackage.elv;
import defpackage.emy;
import defpackage.wy;
import defpackage.wz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ComponentHost extends elr implements emy, duh {
    private static boolean j = false;
    public wy a;
    public SparseArray b;
    public dsf c;
    public drv d;
    public dsc e;
    public drw f;
    public dsg g;
    public int h;
    public boolean i;
    private wy k;
    private wy l;
    private wy m;
    private wy n;
    private wy o;
    private ArrayList p;
    private CharSequence q;
    private final drx r;
    private int[] s;
    private boolean t;
    private boolean u;
    private drs v;
    private boolean w;
    private dtf x;
    private dyg y;

    public ComponentHost(Context context) {
        super(context);
        this.r = new drx(this);
        this.s = new int[0];
        this.w = false;
        this.h = 0;
        this.i = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        h(dra.b(context));
        this.a = new wy(10);
        this.l = new wy(10);
        this.n = new wy(10);
        this.p = new ArrayList();
    }

    private final void A(duz duzVar) {
        if (duzVar.a() && duzVar.c.W()) {
            this.i = true;
        }
        d();
        if (getMountItemCount() == 0) {
            this.i = false;
        }
    }

    private static String p(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "hw" : "sw" : "none";
    }

    private final void q() {
        if (this.p == null) {
            this.p = new ArrayList();
        }
    }

    private final void r() {
        if (this.n == null) {
            this.n = new wy(10);
        }
    }

    private final void s() {
        if (this.a == null) {
            this.a = new wy(10);
        }
    }

    private final void t() {
        if (this.k == null) {
            this.k = new wy(4);
        }
    }

    private final void u() {
        if (this.l == null) {
            this.l = new wy(10);
        }
    }

    private final void v(int i, elv elvVar) {
        if (this.y == null || equals(elvVar.a)) {
            return;
        }
        dyg dygVar = this.y;
        wy wyVar = dygVar.b;
        if (wyVar == null || ((dyf) wz.a(wyVar, i)) == null) {
            wz.b(dygVar.a, i);
        } else {
            wz.b(dygVar.b, i);
        }
    }

    private final void w(View view, dww dwwVar) {
        boolean zIsFocusable = view.isFocusable();
        int[] iArr = ahj.a;
        ahj.n(view, new drs(view, dwwVar, zIsFocusable, view.getImportantForAccessibility()));
    }

    private final void x() {
        wy wyVar = this.k;
        if (wyVar != null && wyVar.c() == 0) {
            this.k = null;
        }
        wy wyVar2 = this.m;
        if (wyVar2 == null || wyVar2.c() != 0) {
            return;
        }
        this.m = null;
    }

    private final void y(Drawable drawable) {
        dyd.a();
        drawable.setCallback(null);
        invalidate(drawable.getBounds());
        x();
    }

    private final void z(View view) {
        this.t = true;
        if (this.u) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
        view.setDuplicateParentStateEnabled(false);
        if (view instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) view;
            if (componentHost.addStatesFromChildren()) {
                componentHost.setAddStatesFromChildren(false);
            }
        }
    }

    @Override // defpackage.elr
    public final elv a(int i) {
        return (elv) this.a.d(i);
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    protected Map b(int i, int i2) {
        HashMap map = new HashMap();
        map.put("uptimeMs", Long.valueOf(SystemClock.uptimeMillis()));
        map.put("identity", Integer.toHexString(System.identityHashCode(this)));
        map.put("width", Integer.valueOf(i));
        map.put("height", Integer.valueOf(i2));
        map.put("layerType", p(getLayerType()));
        Map[] mapArr = new Map[getMountItemCount()];
        for (int i3 = 0; i3 < getMountItemCount(); i3++) {
            elv elvVarA = a(i3);
            Object obj = elvVarA.a;
            Rect rect = elvVarA.d.d;
            HashMap map2 = new HashMap();
            map2.put("class", obj.getClass().getName());
            map2.put("identity", Integer.toHexString(System.identityHashCode(obj)));
            if (obj instanceof View) {
                map2.put("layerType", p(((View) obj).getLayerType()));
            }
            map2.put("left", Integer.valueOf(rect.left));
            map2.put("right", Integer.valueOf(rect.right));
            map2.put("top", Integer.valueOf(rect.top));
            map2.put("bottom", Integer.valueOf(rect.bottom));
            mapArr[i3] = map2;
        }
        map.put("mountItems", mapArr);
        StringBuilder sb = new StringBuilder();
        for (ViewParent parent = this; parent != null; parent = parent.getParent()) {
            sb.append(parent.getClass().getName());
            sb.append(',');
            if ((parent instanceof dvz) && !map.containsKey("lithoViewDimens")) {
                dvz dvzVar = (dvz) parent;
                map.put("lithoViewDimens", "(" + dvzVar.getWidth() + ", " + dvzVar.getHeight() + ")");
            }
        }
        map.put("ancestors", sb.toString());
        return map;
    }

    protected void c(drl drlVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.c(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(true != ((elv) this.a.d(i)).c ? "unbound" : "bound");
        }
        drlVar.b("mMountItems.size(): %d", Integer.valueOf(this.a.c()));
        drlVar.b("mViewMountItems.size(): %d", Integer.valueOf(this.l.c()));
        drlVar.b("mDrawableMountItems.size(): %d", Integer.valueOf(this.n.c()));
        drlVar.b("mDisappearingItems.size(): %d", Integer.valueOf(this.p.size()));
        drlVar.b("mInLayout: %b", Boolean.valueOf(this.u));
        drlVar.b("mMountItems.boundState: %s", sb);
        drlVar.b("mSkippedUnboundItems: %d", Integer.valueOf(this.h));
    }

    public final void d() {
        drs drsVar;
        View view;
        ViewParent parent;
        if (this.w && this.i && (drsVar = this.v) != null && drsVar.a.isEnabled() && (parent = (view = drsVar.b).getParent()) != null) {
            AccessibilityEvent accessibilityEventJ = drsVar.j(2048);
            accessibilityEventJ.setContentChangeTypes(1);
            parent.requestSendAccessibilityEvent(view, accessibilityEventJ);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        drx drxVar = this.r;
        drxVar.a = canvas;
        int i = 0;
        drxVar.b = 0;
        wy wyVar = drxVar.d.a;
        drxVar.c = wyVar == null ? 0 : wyVar.c();
        try {
            super.dispatchDraw(canvas);
            drx drxVar2 = this.r;
            if (drxVar2.b()) {
                drxVar2.a();
            }
            drxVar2.a = null;
            ArrayList arrayList = this.p;
            int size = arrayList == null ? 0 : arrayList.size();
            while (i < size) {
                Object obj = ((elv) this.p.get(i)).a;
                if (obj instanceof Drawable) {
                    ((Drawable) obj).draw(canvas);
                }
                i++;
            }
            boolean z = ebc.a;
        } catch (dvp e) {
            int mountItemCount = getMountItemCount();
            StringBuilder sb = new StringBuilder("[");
            while (i < mountItemCount) {
                elv elvVar = (elv) wz.a(this.a, i);
                sb.append(elvVar != null ? ((dvu) elvVar.d.b).b.c.d() : "null");
                if (i < mountItemCount - 1) {
                    sb.append(", ");
                } else {
                    sb.append("]");
                }
                i++;
            }
            e.c.put("component_names_from_mount_items", sb.toString());
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            drs r0 = r9.v
            if (r0 == 0) goto L83
            boolean r1 = r9.i
            if (r1 == 0) goto L83
            android.view.accessibility.AccessibilityManager r1 = r0.a
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L83
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L18
            goto L83
        L18:
            int r1 = r10.getAction()
            r2 = 7
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L32
            r2 = 9
            if (r1 == r2) goto L32
            r2 = 10
            if (r1 == r2) goto L2a
            goto L83
        L2a:
            int r1 = r0.h
            if (r1 == r3) goto L83
            r0.p(r3)
            goto L89
        L32:
            float r1 = r10.getX()
            float r2 = r10.getY()
            android.view.View r4 = r0.i
            elv r4 = defpackage.drs.v(r4)
            if (r4 != 0) goto L44
        L42:
            r1 = r3
            goto L7d
        L44:
            eme r5 = r4.d
            emh r5 = r5.b
            dvu r5 = (defpackage.dvu) r5
            duz r5 = r5.b
            dru r6 = defpackage.dvu.a(r4)
            drq r5 = r5.c
            duv r7 = defpackage.drs.u(r4)     // Catch: java.lang.Exception -> L78
            int r7 = r5.al(r7)     // Catch: java.lang.Exception -> L78
            if (r7 != 0) goto L5d
            goto L42
        L5d:
            java.lang.Object r7 = r4.a     // Catch: java.lang.Exception -> L78
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7     // Catch: java.lang.Exception -> L78
            android.graphics.Rect r7 = r7.getBounds()     // Catch: java.lang.Exception -> L78
            int r1 = (int) r1     // Catch: java.lang.Exception -> L78
            int r8 = r7.left     // Catch: java.lang.Exception -> L78
            int r1 = r1 - r8
            int r2 = (int) r2     // Catch: java.lang.Exception -> L78
            int r7 = r7.top     // Catch: java.lang.Exception -> L78
            int r2 = r2 - r7
            duv r4 = defpackage.drs.u(r4)     // Catch: java.lang.Exception -> L78
            int r1 = r5.ak(r1, r2, r4)     // Catch: java.lang.Exception -> L78
            if (r1 >= 0) goto L7d
            goto L42
        L78:
            r1 = move-exception
            defpackage.dsq.d(r6, r1)
            goto L42
        L7d:
            r0.p(r1)
            if (r1 == r3) goto L83
            goto L89
        L83:
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L8b
        L89:
            r10 = 1
            return r10
        L8b:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentHost.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dtf dtfVar = this.x;
        if (dtfVar != null) {
            dtfVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        wy wyVar = this.n;
        int iC = wyVar == null ? 0 : wyVar.c();
        for (int i = 0; i < iC; i++) {
            elv elvVar = (elv) this.n.d(i);
            duz duzVar = ((dvu) elvVar.d.b).b;
            dsb.c(this, (Drawable) elvVar.a, duzVar.d, duzVar.a);
        }
    }

    @Override // defpackage.elr
    public final void e(int i, elv elvVar) {
        f(i, elvVar, elvVar.d.d);
    }

    public final void f(int i, elv elvVar, Rect rect) {
        duz duzVar = ((dvu) elvVar.d.b).b;
        Object obj = elvVar.a;
        if (obj instanceof Drawable) {
            dyd.a();
            r();
            this.n.f(i, elvVar);
            Drawable drawable = (Drawable) obj;
            duz duzVar2 = ((dvu) elvVar.d.b).b;
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setCallback(this);
            if (elvVar.e instanceof dvr) {
                dsb.c(this, drawable, duzVar2.d, duzVar2.a);
            }
            invalidate(rect);
        } else if (obj instanceof View) {
            u();
            this.l.f(i, elvVar);
            View view = (View) obj;
            if (duz.b(duzVar.d)) {
                view.setDuplicateParentStateEnabled(true);
            }
            boolean z = view instanceof ComponentHost;
            this.t = true;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(generateDefaultLayoutParams());
            }
            if (this.u) {
                super.addViewInLayout(view, -1, view.getLayoutParams(), true);
            } else {
                super.addView(view, -1, view.getLayoutParams());
            }
            dzj dzjVar = ((dvu) elvVar.d.b).b.b;
            if (dzjVar != null && dzjVar.a() != null && !equals(obj)) {
                if (this.y == null) {
                    dyg dygVar = new dyg(this);
                    this.y = dygVar;
                    setTouchDelegate(dygVar);
                }
                this.y.a.f(i, new dyf(view, elvVar));
            }
            if (ebc.l && !z) {
                dww dwwVar = (dww) view.getTag(R.id.component_node_info);
                if (this.w && dwwVar != null) {
                    w(view, dwwVar);
                }
            }
        }
        s();
        this.a.f(i, elvVar);
        A(duzVar);
    }

    @Override // defpackage.elr
    public final void g(elv elvVar, int i, int i2) {
        wy wyVar;
        dyg dygVar;
        wy wyVar2 = this.a;
        if ((wyVar2 == null || elvVar != wz.a(wyVar2, i)) && ((wyVar = this.k) == null || elvVar != wz.a(wyVar, i))) {
            String strC = elvVar.d.c();
            elv elvVar2 = (elv) wz.a(this.a, i);
            throw new IllegalStateException("Attempting to move MountItem from index: " + i + " to index: " + i2 + ", but given MountItem does not exist at provided old index.\nGiven MountItem: " + strC + "\nExisting MountItem at old index: " + (elvVar2 != null ? elvVar2.d.c() : "null"));
        }
        dzj dzjVar = ((dvu) elvVar.d.b).b.b;
        if (dzjVar != null && dzjVar.a() != null && (dygVar = this.y) != null) {
            wy wyVar3 = dygVar.a;
            if (wz.a(wyVar3, i2) != null) {
                if (dygVar.b == null) {
                    dygVar.b = new wy(4);
                }
                dsb.f(i2, wyVar3, dygVar.b);
            }
            dsb.d(i, i2, wyVar3, dygVar.b);
            wy wyVar4 = dygVar.b;
            if (wyVar4 != null && wyVar4.c() == 0) {
                dygVar.b = null;
            }
        }
        Object obj = elvVar.a;
        u();
        if (obj instanceof Drawable) {
            dyd.a();
            r();
            if (wz.a(this.n, i2) != null) {
                if (this.o == null) {
                    this.o = new wy(4);
                }
                dsb.f(i2, this.n, this.o);
            }
            dsb.d(i, i2, this.n, this.o);
            invalidate();
            x();
        } else if (obj instanceof View) {
            this.t = true;
            if (wz.a(this.l, i2) != null) {
                if (this.m == null) {
                    this.m = new wy(4);
                }
                dsb.f(i2, this.l, this.m);
            }
            dsb.d(i, i2, this.l, this.m);
        }
        s();
        if (wz.a(this.a, i2) != null) {
            t();
            dsb.f(i2, this.a, this.k);
        }
        dsb.d(i, i2, this.a, this.k);
        x();
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (this.t) {
            int childCount = getChildCount();
            if (this.s.length < childCount) {
                this.s = new int[childCount + 5];
            }
            wy wyVar = this.l;
            int iC = wyVar == null ? 0 : wyVar.c();
            int i3 = 0;
            int i4 = 0;
            while (i3 < iC) {
                this.s[i4] = indexOfChild((View) ((elv) this.l.d(i3)).a);
                i3++;
                i4++;
            }
            ArrayList arrayList = this.p;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = ((elv) this.p.get(i5)).a;
                if (obj instanceof View) {
                    this.s[i4] = indexOfChild((View) obj);
                    i4++;
                }
            }
            this.t = false;
        }
        drx drxVar = this.r;
        if (drxVar.b()) {
            drxVar.a();
        }
        return this.s[i2];
    }

    @Override // defpackage.elr, android.view.ViewGroup
    public boolean getClipChildren() {
        return super.getClipChildren();
    }

    public dsg getComponentTouchListener() {
        return this.g;
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        return this.q;
    }

    public List getContentDescriptions() {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        wy wyVar = this.n;
        int iC = wyVar == null ? 0 : wyVar.c();
        for (int i = 0; i < iC; i++) {
            dww dwwVar = ((dvu) ((elv) this.n.d(i)).d.b).b.a;
            if (dwwVar != null && (charSequence = dwwVar.a) != null) {
                arrayList.add(charSequence);
            }
        }
        CharSequence contentDescription = getContentDescription();
        if (contentDescription != null) {
            arrayList.add(contentDescription);
        }
        return arrayList;
    }

    public List getContentNames() {
        wy wyVar = this.a;
        if (wyVar == null || wyVar.c() == 0) {
            return Collections.EMPTY_LIST;
        }
        int iC = this.a.c();
        ArrayList arrayList = new ArrayList(iC);
        for (int i = 0; i < iC; i++) {
            arrayList.add(((dvu) a(i).d.b).b.c.d());
        }
        return arrayList;
    }

    @Override // defpackage.duh
    public dtf getDispatchTouchListener() {
        return this.x;
    }

    public List getDrawables() {
        wy wyVar = this.n;
        if (wyVar == null || wyVar.c() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.n.c());
        int iC = this.n.c();
        for (int i = 0; i < iC; i++) {
            arrayList.add((Drawable) ((elv) this.n.d(i)).a);
        }
        return arrayList;
    }

    public dup getImageContent() {
        s();
        List listB = dsb.b(this.a);
        int size = listB.size();
        if (size == 1) {
            Object obj = listB.get(0);
            return obj instanceof dup ? (dup) obj : dup.b;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj2 = listB.get(i);
            if (obj2 instanceof dup) {
                arrayList.addAll(((dup) obj2).a());
            }
        }
        return new dsa(arrayList);
    }

    public List getLinkedDrawablesForAnimation() {
        wy wyVar = this.n;
        int iC = wyVar == null ? 0 : wyVar.c();
        ArrayList arrayList = null;
        for (int i = 0; i < iC; i++) {
            elv elvVar = (elv) this.n.d(i);
            if ((((dvu) elvVar.d.b).b.d & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Drawable) elvVar.a);
            }
        }
        return arrayList;
    }

    @Override // defpackage.elr
    public int getMountItemCount() {
        wy wyVar = this.a;
        if (wyVar == null) {
            return 0;
        }
        return wyVar.c();
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.b;
        return (sparseArray == null || (obj = sparseArray.get(i)) == null) ? super.getTag(i) : obj;
    }

    public TextContent getTextContent() {
        s();
        return dsb.a(dsb.b(this.a));
    }

    public final void h(boolean z) {
        if (z == this.w) {
            return;
        }
        if (z && this.v == null) {
            boolean zIsFocusable = isFocusable();
            int[] iArr = ahj.a;
            this.v = new drs(this, null, zIsFocusable, getImportantForAccessibility());
        }
        ahj.n(this, z ? this.v : null);
        this.w = z;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof ComponentHost) {
                    ((ComponentHost) childAt).h(true);
                } else {
                    dww dwwVar = (dww) childAt.getTag(R.id.component_node_info);
                    if (dwwVar != null) {
                        w(childAt, dwwVar);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        int width = getWidth();
        int i = ebc.g;
        if (width > i || getHeight() > i) {
            return false;
        }
        return super.hasOverlappingRendering();
    }

    @Override // defpackage.duh
    public final void i(dtf dtfVar) {
        this.x = dtfVar;
    }

    @Override // defpackage.emy
    public final void j(elv elvVar) {
        wy wyVar = this.a;
        int iB = wyVar.b(wyVar.a(elvVar));
        Object obj = elvVar.a;
        if (obj instanceof Drawable) {
            r();
            dsb.e(iB, this.n, this.o);
        } else if (obj instanceof View) {
            u();
            dsb.e(iB, this.l, this.m);
            this.t = true;
            v(iB, elvVar);
        }
        s();
        dsb.e(iB, this.a, this.k);
        x();
        q();
        this.p.add(elvVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        wy wyVar = this.n;
        int iC = wyVar == null ? 0 : wyVar.c();
        for (int i = 0; i < iC; i++) {
            ((Drawable) ((elv) this.n.d(i)).a).jumpToCurrentState();
        }
    }

    @Override // defpackage.elr
    public final void k(elv elvVar) {
        int iB;
        s();
        int iA = this.a.a(elvVar);
        if (iA == -1) {
            t();
            iB = this.k.b(this.k.a(elvVar));
        } else {
            iB = this.a.b(iA);
        }
        l(iB, elvVar);
    }

    public final void l(int i, elv elvVar) {
        Object obj = elvVar.a;
        if (obj instanceof Drawable) {
            r();
            y((Drawable) obj);
            dsb.e(i, this.n, this.o);
        } else if (obj instanceof View) {
            z((View) obj);
            u();
            dsb.e(i, this.l, this.m);
            this.t = true;
            v(i, elvVar);
        }
        s();
        dsb.e(i, this.a, this.k);
        x();
        A(((dvu) elvVar.d.b).b);
    }

    @Override // defpackage.emy
    public final boolean m(elv elvVar) {
        q();
        if (!this.p.remove(elvVar)) {
            return false;
        }
        Object obj = elvVar.a;
        if (obj instanceof Drawable) {
            y((Drawable) obj);
        } else if (obj instanceof View) {
            z((View) obj);
            this.t = true;
        }
        A(((dvu) elvVar.d.b).b);
        return true;
    }

    protected boolean n() {
        return !this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.u = true;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        String str = null;
        if (i6 <= 0 || i5 <= 0) {
            boolean z2 = ebc.a;
        } else {
            int i7 = ebc.f;
            if (i6 >= i7 || i5 >= i7) {
                str = "TextureTooBig";
            }
        }
        if (str != null) {
            dsr.c(2, a.m(i6, i5, "abnormally sized litho layout (", ", ", ")"), b(i5, i6));
        }
        o(i, i2, i3, i4);
        this.u = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dyd.a();
        if (isEnabled()) {
            wy wyVar = this.n;
            int iC = wyVar == null ? 0 : wyVar.c();
            while (true) {
                iC--;
                if (iC < 0) {
                    break;
                }
                elv elvVar = (elv) this.n.d(iC);
                Object obj = elvVar.a;
                if ((obj instanceof dyh) && (((dvu) elvVar.d.b).b.d & 2) != 2) {
                    dyh dyhVar = (dyh) obj;
                    if (dyhVar.f(motionEvent) && dyhVar.e(motionEvent, this)) {
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performAccessibilityAction(int r3, android.os.Bundle r4) {
        /*
            r2 = this;
            r0 = 512(0x200, float:7.17E-43)
            if (r3 == r0) goto L9
            r0 = 256(0x100, float:3.59E-43)
            if (r3 != r0) goto L52
            r3 = r0
        L9:
            java.lang.CharSequence r0 = r2.getContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L18
            java.lang.CharSequence r0 = r2.getContentDescription()
            goto L49
        L18:
            java.util.List r0 = r2.getContentDescriptions()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = ", "
            if (r0 != 0) goto L2d
            java.util.List r0 = r2.getContentDescriptions()
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            goto L49
        L2d:
            com.facebook.litho.TextContent r0 = r2.getTextContent()
            java.util.List r0 = r0.getTextItems()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L48
            com.facebook.litho.TextContent r0 = r2.getTextContent()
            java.util.List r0 = r0.getTextItems()
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            goto L49
        L48:
            r0 = 0
        L49:
            if (r0 != 0) goto L4d
            r3 = 0
            return r3
        L4d:
            r2.q = r0
            super.setContentDescription(r0)
        L52:
            boolean r3 = super.performAccessibilityAction(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentHost.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    @Deprecated
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        for (ViewParent parent = this; parent instanceof ComponentHost; parent = parent.getParent()) {
            if (!((ComponentHost) parent).n()) {
                return;
            }
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.w = false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        if (f != 0.0f && f != 1.0f) {
            int width = getWidth();
            int i = ebc.h;
            if (width >= i || getHeight() >= i) {
                if (j) {
                    return;
                }
                j = true;
                dsr.b(2, "Partial alpha (" + f + ") with large view (" + getWidth() + ", " + getHeight() + ")");
            }
        }
        super.setAlpha(f);
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        if (!TextUtils.isEmpty(charSequence)) {
            int[] iArr = ahj.a;
            if (getImportantForAccessibility() == 0) {
                setImportantForAccessibility(1);
            }
        }
        d();
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i != R.id.component_node_info || obj == null) {
            return;
        }
        h(dra.b(getContext()));
        drs drsVar = this.v;
        if (drsVar != null) {
            drsVar.j = (dww) obj;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        dyd.a();
        super.setVisibility(i);
        wy wyVar = this.n;
        int iC = wyVar == null ? 0 : wyVar.c();
        for (int i2 = 0; i2 < iC; i2++) {
            ((Drawable) ((elv) this.n.d(i2)).a).setVisible(i == 0, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    public void o(int i, int i2, int i3, int i4) {
    }
}
