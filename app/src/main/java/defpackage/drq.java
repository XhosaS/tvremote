package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.facebook.litho.ComponentTree;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drq implements Cloneable, elz, dui, dtq, dty, dtn {
    private SparseArray c;
    public final int i;
    public int j = b.getAndIncrement();
    public String k;
    public String l;
    public boolean m;
    public dug n;
    public drk o;
    public Context p;
    static final dwa q = new dwa();
    public static final Map g = new HashMap();
    private static final AtomicInteger a = new AtomicInteger();
    private static final AtomicInteger b = new AtomicInteger(1);
    public static final dtl[] h = new dtl[0];

    protected drq() {
        int iIntValue;
        Map map = g;
        Class<?> cls = getClass();
        synchronized (map) {
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                int iIncrementAndGet = a.incrementAndGet();
                map.put(cls, Integer.valueOf(iIncrementAndGet));
                iIntValue = iIncrementAndGet;
            }
        }
        this.i = iIntValue;
    }

    static boolean Z(drq drqVar) {
        return drqVar != null && drqVar.ah() == 1;
    }

    static boolean aa(drq drqVar) {
        return drqVar != null && drqVar.ah() == 1 && drqVar.P();
    }

    static boolean ac(drq drqVar) {
        return (drqVar == null || drqVar.ah() == 1) ? false : true;
    }

    public static dtu o(Class cls, String str, dru druVar, int i, Object[] objArr) {
        dtu dtuVar;
        drq drqVar = druVar.c;
        if (drqVar == null) {
            dsr.b(3, "Creating event handler without scope.");
            return dws.a;
        }
        if (cls != drqVar.getClass()) {
            drqVar.d();
            dsr.c(2, String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a ComponentContext from its Component.", str, druVar.c.d()), eev.a(druVar));
        }
        drq drqVar2 = druVar.c;
        if (drqVar2 == null) {
            dsr.b(3, "Creating event handler without scope.");
            dtuVar = dws.a;
        } else {
            dtuVar = new dtu(drqVar2, i, objArr);
        }
        ComponentTree componentTree = druVar.h;
        if (componentTree != null) {
            componentTree.G.c(druVar.i(), dtuVar);
        }
        return dtuVar;
    }

    public static dtx p(dru druVar, int i, String str) {
        dtx dtxVarA;
        if (druVar.c == null) {
            return null;
        }
        ComponentTree componentTree = druVar.h;
        String str2 = druVar.i() + i + str;
        dtz dtzVar = componentTree.H;
        synchronized (dtzVar) {
            dtxVarA = dtzVar.a(str2);
        }
        return dtxVarA;
    }

    public static dtx q(dru druVar, drq drqVar, int i) {
        return druVar.e(i, drqVar.B(), drqVar.n);
    }

    protected Object A(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    final String B() {
        if (this.l == null) {
            if (this.m) {
                throw new IllegalStateException("Should not have null manual key! (" + d() + ")");
            }
            this.l = Integer.toString(this.i);
        }
        return this.l;
    }

    final void F(dru druVar, Object obj, duv duvVar) {
        if (druVar != null) {
            druVar.b = "mount";
        }
        emc emcVar = emd.a;
        boolean z = ema.a;
        try {
            try {
                L(druVar, obj, duvVar);
            } catch (Exception e) {
                if (druVar == null) {
                    throw e;
                }
                dsq.d(druVar, e);
                druVar.b = null;
            }
        } finally {
            if (druVar != null) {
                druVar.b = null;
            }
        }
    }

    protected void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        throw new IllegalStateException("You must override onMeasure() if you return true in canMeasure(), Component is: ".concat(toString()));
    }

    protected boolean P() {
        return false;
    }

    protected boolean Q() {
        return false;
    }

    protected boolean R() {
        return false;
    }

    public boolean S() {
        SparseArray sparseArray = this.c;
        return sparseArray != null && sparseArray.size() > 0;
    }

    final boolean T() {
        return this.n != null;
    }

    protected boolean U() {
        return false;
    }

    protected boolean V() {
        return false;
    }

    public boolean W() {
        return false;
    }

    protected boolean X() {
        return false;
    }

    protected boolean Y(dru druVar, dru druVar2) {
        return true;
    }

    @Override // defpackage.dtn
    public final /* synthetic */ boolean a(Object obj) {
        boolean z = ebc.a;
        return g((drq) obj);
    }

    protected boolean ab() {
        return false;
    }

    protected boolean ad() {
        return false;
    }

    @Override // defpackage.elz
    public boolean ae() {
        return h() == 0;
    }

    final boolean af(dru druVar, drq drqVar, dru druVar2, drq drqVar2) {
        dxx dxxVar;
        dxx dxxVar2 = null;
        if (drqVar == null || druVar == null) {
            dxxVar = null;
        } else {
            dxo dxoVar = druVar.j;
            dxoVar.getClass();
            dxxVar = dxoVar.c;
        }
        if (drqVar2 != null && druVar2 != null) {
            dxo dxoVar2 = druVar2.j;
            dxoVar2.getClass();
            dxxVar2 = dxoVar2.c;
        }
        boolean zAg = ag(drqVar, dxxVar, drqVar2, dxxVar2);
        if (X()) {
            return zAg;
        }
        if (zAg) {
            return true;
        }
        return (druVar == null || druVar2 == null || drqVar == null || drqVar.Y(druVar, druVar2)) ? false : true;
    }

    protected boolean ag(drq drqVar, dxx dxxVar, drq drqVar2, dxx dxxVar2) {
        return (ad() && drqVar != null && drqVar.g(drqVar2) && dsq.h(dxxVar, dxxVar2)) ? false : true;
    }

    public int ah() {
        return 1;
    }

    public int ak(int i, int i2, duv duvVar) {
        return Integer.MIN_VALUE;
    }

    public int al(duv duvVar) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void an(defpackage.dru r11, int r12, int r13, defpackage.dxt r14) {
        /*
            r10 = this;
            dvd r0 = r11.f()
            if (r0 == 0) goto L85
            dvd r9 = r11.f()
            dvk r0 = r9.e(r10)
            if (r0 == 0) goto L2c
            int r1 = r0.h
            eoe r3 = r0.e
            float r6 = r3.b()
            int r6 = (int) r6
            boolean r1 = defpackage.dwf.a(r1, r12, r6)
            if (r1 == 0) goto L2c
            int r1 = r0.i
            float r3 = r3.a()
            int r3 = (int) r3
            boolean r1 = defpackage.dwf.a(r1, r13, r3)
            if (r1 != 0) goto L72
        L2c:
            r9.q(r10)
            dve r0 = r9.f
            r0.getClass()
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            r2 = r10
            r1 = r11
            r4 = r12
            r5 = r13
            dvb r0 = defpackage.duy.i(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = r0.a()
            if (r1 == 0) goto L47
            goto L84
        L47:
            dvk r0 = r0.a
            if (r0 == 0) goto L84
            java.util.Map r1 = r9.l
            int r3 = r10.j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
            boolean r1 = Z(r10)
            if (r1 == 0) goto L72
            r0.h = r12
            r0.i = r13
            eoe r1 = r0.e
            float r3 = r1.b()
            int r3 = (int) r3
            float r3 = (float) r3
            r0.j = r3
            float r1 = r1.a()
            int r1 = (int) r1
            float r1 = (float) r1
            r0.k = r1
        L72:
            eoe r0 = r0.e
            float r1 = r0.b()
            int r1 = (int) r1
            r14.a = r1
            float r0 = r0.a()
            int r0 = (int) r0
            r14.b = r0
            boolean r0 = defpackage.ebc.a
        L84:
            return
        L85:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r10.d()
            java.lang.String r3 = ": Trying to measure a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drq.an(dru, int, int, dxt):void");
    }

    @Override // defpackage.dty
    public final void at(dtx dtxVar, Object obj) throws Exception {
        try {
            aw(dtxVar, obj);
        } catch (Exception e) {
            dru druVar = dtxVar.b;
            if (druVar == null) {
                throw e;
            }
            dsq.d(druVar, e);
        }
    }

    final void av(dru druVar, Object obj) {
        emc emcVar = emd.a;
        boolean z = ema.a;
        try {
            try {
                as(druVar, obj);
            } catch (Exception e) {
                dsq.d(druVar, e);
            }
        } finally {
            emc emcVar2 = emd.a;
        }
    }

    protected dxh ax(dru druVar, int i) {
        throw new RuntimeException("Render should not be called on a component which hasn't implemented render! ".concat(d()));
    }

    protected dvs c(dve dveVar, dru druVar) {
        return duy.c(dveVar, druVar, this, false, null);
    }

    public String d() {
        throw null;
    }

    public boolean e() {
        return false;
    }

    protected boolean f() {
        return false;
    }

    public boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        if (this.j == drqVar.j) {
            return true;
        }
        return dsq.g(this, drqVar);
    }

    protected int h() {
        return 3;
    }

    public SparseArray i() {
        return this.c;
    }

    public final SparseArray j() {
        if (this.c == null) {
            this.c = new SparseArray();
        }
        return this.c;
    }

    public final drk k() {
        if (this.o == null) {
            this.o = new drk();
        }
        return this.o;
    }

    public drq l() {
        try {
            return (drq) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final drq m() {
        drq drqVarL = l();
        drqVarL.j = b.getAndIncrement();
        return drqVarL;
    }

    protected duv r() {
        return null;
    }

    protected dwg s() {
        getClass().getSimpleName();
        return new dtb(h());
    }

    protected dxe t() {
        return null;
    }

    public final String toString() {
        return d();
    }

    protected dxx u() {
        return null;
    }

    @Override // defpackage.elz
    public final elw v() {
        return s();
    }

    @Override // defpackage.elz
    public final Object w(Context context) {
        boolean z = ebc.a;
        Object objA = A(context);
        if (objA != null) {
            return objA;
        }
        throw new RuntimeException("Component created null mount content, but mount content must never be null! Component: ".concat(d()));
    }

    @Override // defpackage.dtq
    public final Object x(dtu dtuVar, Object obj) {
        Object objY;
        boolean z = ebc.a;
        if (dtuVar.c == -1048037474) {
            return y(dtuVar, obj);
        }
        dtr dtrVar = dts.a;
        try {
            try {
                objY = y(dtuVar, obj);
            } catch (Exception e) {
                Object[] objArr = dtuVar.d;
                if (objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof dru) {
                        dsq.d((dru) obj2, e);
                        objY = null;
                    }
                }
                throw e;
            }
            return objY;
        } finally {
            dtr dtrVar2 = dts.a;
        }
    }

    protected Object y(dtu dtuVar, Object obj) {
        if (dtuVar.c != -1048037474) {
            return null;
        }
        Object[] objArr = dtuVar.d;
        objArr.getClass();
        dxo dxoVar = ((dru) objArr[0]).j;
        dxoVar.getClass();
        dtu dtuVar2 = dxoVar.f;
        dtuVar2.getClass();
        dtuVar2.cC((dto) obj);
        return null;
    }

    @Override // defpackage.elz
    public final Object z() {
        return getClass();
    }

    public void aj() {
    }

    protected void ao() {
    }

    protected void au() {
    }

    @Override // defpackage.dui
    @Deprecated
    public final dtq n() {
        return this;
    }

    protected void E(dru druVar) {
    }

    protected void G(dru druVar) {
    }

    protected void J(dru druVar) {
    }

    protected void M(dru druVar) {
    }

    public void ai(duv duvVar) {
    }

    protected dzh am(dzh dzhVar) {
        return dzhVar;
    }

    protected void ar(Object obj) {
    }

    protected void C(duv duvVar, duv duvVar2) {
    }

    protected void D(dxe dxeVar, dxe dxeVar2) {
    }

    public void N(dru druVar, dtz dtzVar) {
    }

    protected void O(dxx dxxVar, dxx dxxVar2) {
    }

    protected void ap(View view, ajr ajrVar) {
    }

    protected void as(dru druVar, Object obj) {
    }

    protected void aw(dtx dtxVar, Object obj) {
    }

    protected void H(dru druVar, Object obj, duv duvVar) {
    }

    protected void I(dru druVar, dse dseVar, duv duvVar) {
    }

    protected void L(dru druVar, Object obj, duv duvVar) {
    }

    protected void aq(ajr ajrVar, int i, int i2, int i3, duv duvVar) {
    }
}
