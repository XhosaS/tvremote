package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.litho.ComponentTree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eiz implements efb, egw, egg {
    public volatile boolean A;
    public final String B;
    public final boolean[] C;
    public final boolean[] D;
    public final Set E;
    public final ell F;
    public int G;
    public final ejn H;
    public final Runnable I;
    public final eiv K;
    private final boolean P;
    private final dvn Q;
    private final eji R;
    private final boolean S;
    private final boolean T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    private final ebc X;
    private boolean ai;
    private eij aj;
    private final eli ak;
    private final tll al;
    private final eht an;
    private ekh ap;
    public final egy c;
    public final pq d;
    public final dru e;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    final boolean m;
    public final boolean p;
    public boolean q;
    public dxt r;
    public RecyclerView s;
    public int w;
    public int x;
    volatile dxt y;
    public dtu z;
    private static final dxt L = new dxt();
    private static final Rect M = new Rect();
    static final ehr J = new ehr();
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Handler f = new Handler(Looper.getMainLooper());
    private final AtomicBoolean N = new AtomicBoolean(false);
    private final AtomicBoolean O = new AtomicBoolean(false);
    public final Map l = new HashMap();
    private final AtomicLong Y = new AtomicLong(-1);
    private final Deque Z = new ArrayDeque();
    private final AtomicBoolean aa = new AtomicBoolean(false);
    private final AtomicBoolean ab = new AtomicBoolean(false);
    public final Deque n = new ArrayDeque();
    final Runnable o = new ehy(this);
    private final eib am = new eib(this);
    private final ViewTreeObserver.OnPreDrawListener ac = new eic(this);
    private final Runnable ad = new eid(this);
    private final ArrayList ae = new ArrayList();
    private final eig ao = new eig(this);
    private final eay af = new eih(this);
    private int ag = -1;
    private int ah = -1;
    public int t = -1;
    int u = -1;
    int v = -1;

    public eiz(eis eisVar) {
        new AtomicInteger(0);
        this.x = -1;
        this.A = false;
        this.ai = false;
        this.B = "";
        this.C = new boolean[1];
        this.D = new boolean[1];
        this.E = new HashSet();
        this.aj = null;
        this.ak = new eii(this);
        this.I = new ehq(this);
        dru druVar = eisVar.d;
        this.e = druVar;
        this.Q = eisVar.m;
        this.h = eisVar.f;
        this.K = new eiv(this);
        this.d = new eix(this);
        this.j = eisVar.o;
        this.g = eisVar.a;
        egy egyVar = eisVar.b;
        this.c = egyVar;
        this.al = eisVar.p;
        this.i = true;
        this.W = eisVar.l;
        this.X = eisVar.c;
        this.k = eisVar.n;
        boolean z = ebc.a;
        this.H = new ejn();
        boolean z2 = egyVar.i() == 0 ? eisVar.e : false;
        this.p = z2;
        egyVar.i();
        this.an = z2 ? new eht(this) : null;
        this.q = false;
        qd qdVarJ = egyVar.j();
        boolean z3 = qdVarJ instanceof LinearLayoutManager ? ((LinearLayoutManager) qdVarJ).o : false;
        this.m = z3;
        if (z3) {
            this.R = eji.b;
        } else {
            this.R = eji.a;
        }
        this.F = new ell(this.t, this.u, eisVar.b);
        int i = eisVar.i;
        if (i != -1) {
            this.x = i;
            this.U = true;
        } else {
            this.U = false;
        }
        this.S = eisVar.g;
        this.P = eisVar.k;
        this.T = eisVar.h;
        this.V = eisVar.j;
        float f = druVar.a.getResources().getDisplayMetrics().density;
    }

    public static void B(efn efnVar, boolean z) {
        if (efnVar.o()) {
            Object objD = efnVar.e.d("prevent_release");
            if (((objD instanceof Boolean) && ((Boolean) objD).booleanValue()) || efnVar.c().h() || efnVar.b() == null || efnVar.b().getLithoView() != null) {
                return;
            }
            efnVar.d(z);
        }
    }

    public static void K(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((efn) list.get(i)).i();
        }
    }

    static boolean S(int i, int i2, int i3, boolean z) {
        if (i3 == 1) {
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                return false;
            }
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            return false;
        }
        return z;
    }

    private final dxt U(int i, int i2, boolean z) {
        int size;
        dxt dxtVar = new dxt();
        int i3 = this.c.i();
        boolean zS = S(i, i2, i3, z);
        int size2 = 0;
        if (i3 != 1) {
            int size3 = View.MeasureSpec.getSize(i);
            if (!zS) {
                size2 = View.MeasureSpec.getSize(i2);
            } else if (this.y != null) {
                size2 = this.y.b;
            }
            size = size2;
            size2 = size3;
        } else {
            size = View.MeasureSpec.getSize(i2);
            if (!zS) {
                size2 = View.MeasureSpec.getSize(i);
            } else if (this.y != null) {
                size2 = this.y.a;
            }
        }
        dxtVar.a = size2;
        dxtVar.b = size;
        return dxtVar;
    }

    private final eiu V() {
        int iQ;
        List list = this.a;
        if (list.isEmpty()) {
            List list2 = this.b;
            if (list2.isEmpty() || (iQ = q(list2, this.m)) < 0) {
                return null;
            }
            return new eiu(iQ, list2);
        }
        int iQ2 = q(list, this.m);
        if (this.t >= list.size() || iQ2 < 0) {
            return null;
        }
        return new eiu(iQ2, list);
    }

    private final synchronized void W(boolean z, efg efgVar) {
        if (this.aj == null) {
            this.aj = new eij();
        }
        eij eijVar = this.aj;
        eijVar.b = z;
        eijVar.c = efgVar;
        this.Z.addLast(eijVar);
        this.aa.set(true);
        this.aj = null;
    }

    private final void X(efn efnVar) {
        int iS = s(efnVar);
        int iR = r(efnVar);
        if (!efnVar.p(iS, iR)) {
            efnVar.t(this.e, iS, iR, null);
        } else if (efnVar.m()) {
            ComponentTree componentTreeB = efnVar.b();
            if (componentTreeB.L != null) {
                componentTreeB.L = null;
            }
        }
    }

    private final void Y(int i, int i2, eji ejiVar) {
        int i3 = this.t;
        if (i3 != this.v) {
            this.v = i3;
        }
        boolean z = ebc.a;
        synchronized (this) {
            if (((this.k && this.p) ? this.N.get() : ad()) && this.x != -1) {
                if (i == -1 || i2 == -1) {
                    i = 0;
                    i2 = 0;
                }
                this.c.i();
                int iMax = Math.max(this.x, i2 - i);
                int size = this.a.size();
                int i4 = (int) (iMax * this.g);
                ejiVar.a(size, new ehz(this, i - i4, i + iMax + i4, size));
            }
        }
    }

    private final void Z() {
        if (dyd.b()) {
            x(0);
        } else {
            ebb.b().a(this.af);
        }
    }

    private final void aa(List list) {
        this.f.post(new ehs(list));
    }

    private final void ab(eij eijVar) {
        ArrayList arrayList = eijVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eim eimVar = (eim) arrayList.get(i);
            if (eimVar instanceof eik) {
                X(((eik) eimVar).b);
            }
        }
    }

    private final boolean ac() {
        return !(this.y == null || this.x == -1) || this.U;
    }

    private final boolean ad() {
        return this.N.get() && !this.O.get();
    }

    private final boolean ae() {
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.au();
        }
        return false;
    }

    static int q(List list, boolean z) {
        if (z) {
            int size = list.size() - 1;
            if (size >= 0) {
                ((efn) list.get(size)).c().l();
                return size;
            }
        } else if (list.size() > 0) {
            ((efn) list.get(0)).c().l();
            return 0;
        }
        return -1;
    }

    public static void y(ejm ejmVar) {
        if (ejmVar == null) {
            throw new RuntimeException("Received null RenderInfo to insert/update!");
        }
    }

    public final void A(int i, ejm ejmVar) {
        z();
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + hashCode() + ") insertItemAtAsync " + i + ", name: " + ejmVar.o());
        }
        y(ejmVar);
        eik eikVarV = v(i, ejmVar);
        synchronized (this) {
            this.A = true;
            this.b.add(i, eikVarV.b);
            J(eikVarV);
        }
    }

    public final void C() {
        dyd.a();
        Deque deque = this.n;
        if (!deque.isEmpty() && this.ai) {
            RecyclerView recyclerView = this.s;
            if (recyclerView != null && recyclerView.as() && recyclerView.s && recyclerView.getWindowVisibility() == 0) {
                Object parent = recyclerView;
                while (true) {
                    if (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                            break;
                        } else {
                            parent = view.getParent();
                        }
                    } else {
                        Rect rect = M;
                        if (recyclerView.getGlobalVisibleRect(rect)) {
                            if (deque.size() > 20) {
                                deque.clear();
                                StringBuilder sb = new StringBuilder("recyclerView: ");
                                sb.append(recyclerView);
                                sb.append(", hasPendingAdapterUpdates(): ");
                                sb.append(recyclerView.as());
                                sb.append(", isAttachedToWindow(): ");
                                sb.append(recyclerView.s);
                                sb.append(", getWindowVisibility(): ");
                                sb.append(recyclerView.getWindowVisibility());
                                sb.append(", vie visible hierarchy: ");
                                ArrayList arrayList = new ArrayList();
                                Object parent2 = recyclerView;
                                while (parent2 instanceof View) {
                                    View view2 = (View) parent2;
                                    arrayList.add("view=" + view2.getClass().getSimpleName() + ", alpha=" + view2.getAlpha() + ", visibility=" + view2.getVisibility());
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    } else {
                                        parent2 = view2.getParent();
                                    }
                                }
                                sb.append(arrayList);
                                sb.append(", getGlobalVisibleRect(): ");
                                sb.append(recyclerView.getGlobalVisibleRect(rect));
                                sb.append(", isComputingLayout(): ");
                                sb.append(recyclerView.au());
                                sb.append(", isSubAdapter: false, visible range: [");
                                sb.append(this.t);
                                sb.append(", ");
                                sb.append(this.u);
                                sb.append("]");
                                dsr.c(2, "@OnDataRendered callbacks aren't triggered as expected: ".concat(sb.toString()), eev.a(this.e));
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            boolean z = recyclerView != null;
            ArrayDeque arrayDeque = new ArrayDeque(deque);
            deque.clear();
            this.f.postAtFrontOfQueue(new ehw(arrayDeque, z));
        }
    }

    public final void D() {
        if (this.s != null && this.F.d()) {
            RecyclerView recyclerView = this.s;
            Runnable runnable = this.I;
            recyclerView.removeCallbacks(runnable);
            RecyclerView recyclerView2 = this.s;
            int[] iArr = ahj.a;
            recyclerView2.postOnAnimation(runnable);
        }
        Y(this.t, this.u, this.R);
    }

    public final void E(eit eitVar) {
        efn efnVarA = eitVar.next();
        if (this.a.isEmpty() || efnVarA == null || this.x != -1) {
            return;
        }
        int iS = s(efnVarA);
        int iR = r(efnVarA);
        if (efnVarA.p(iS, iR)) {
            return;
        }
        efnVarA.t(this.e, iS, iR, new ehx(this, eitVar, efnVarA));
    }

    public final void F() {
        eiu eiuVarV;
        List list;
        int iQ;
        if (this.N.get()) {
            if (!this.O.get()) {
                if (!ac() && (iQ = q((list = this.a), this.m)) >= 0) {
                    eiu eiuVar = new eiu(iQ, list);
                    dxt dxtVar = this.r;
                    int i = dxtVar.a;
                    int i2 = dxtVar.b;
                    this.c.i();
                    T(i, i2, eiuVar);
                }
                D();
                return;
            }
            dxt dxtVar2 = this.r;
            if (dxtVar2.a == 0 || dxtVar2.b == 0) {
                N();
                return;
            }
            dxt dxtVarU = U(this.ag, this.ah, true);
            dxt dxtVar3 = new dxt();
            int i3 = dxtVarU.a;
            int i4 = dxtVarU.b;
            boolean z = ebc.a;
            egy egyVar = this.c;
            int iC = egyVar.c();
            int i5 = 0;
            if (iC == -1) {
                iC = 0;
            }
            List list2 = this.a;
            egx egxVarK = egyVar.k(i3, i4);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            dxt dxtVar4 = new dxt();
            while (egxVarK.c() && iC < list2.size()) {
                efn efnVar = (efn) list2.get(iC);
                ejm ejmVarC = efnVar.c();
                ejmVarC.m();
                efnVar.g(this.e, egyVar.g(iMakeMeasureSpec, ejmVarC), egyVar.f(iMakeMeasureSpec2, ejmVarC), dxtVar4);
                egxVarK.b(ejmVarC, dxtVar4.a, dxtVar4.b);
                i5++;
                iC++;
            }
            int iA = egxVarK.a();
            if (egyVar.i() == 1) {
                dxtVar3.a = i3;
                dxtVar3.b = Math.min(iA, i4);
            } else {
                dxtVar3.a = Math.min(iA, i3);
                dxtVar3.b = i4;
            }
            int size = list2.size();
            if (ejr.a) {
                Log.d("SectionsDebug", "(" + hashCode() + ") filled viewport with " + i5 + " items (holder.size() = " + size + ")");
            }
            if (!ac() && (eiuVarV = V()) != null) {
                egyVar.i();
                T(i3, i4, eiuVarV);
            }
            int i6 = dxtVar3.a;
            dxt dxtVar5 = this.r;
            if (i6 == dxtVar5.a && dxtVar3.b == dxtVar5.b) {
                return;
            }
            N();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.efb
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void g(RecyclerView recyclerView) {
        dyd.a();
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            i(recyclerView2);
        }
        if (this.A) {
            x(0);
        }
        this.s = recyclerView;
        this.ai = true;
        egy egyVar = this.c;
        boolean z = this.W;
        qd qdVarJ = egyVar.j();
        qdVarJ.bg(z);
        recyclerView.getPaddingLeft();
        recyclerView.ai(qdVarJ);
        recyclerView.ag(this.d);
        ell ellVar = this.F;
        recyclerView.y(ellVar.d);
        if (qdVarJ instanceof ehi) {
            new Rect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            ((ehi) qdVarJ).a();
        }
        if (recyclerView instanceof egf) {
            ((egf) recyclerView).b(this.am);
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(this.ac);
        }
        egyVar.m(this);
        ellVar.a(this.ak);
        int i = this.t;
        if (i != -1 && i >= 0) {
            egyVar.l(i, this.w);
        }
        RecyclerView recyclerView3 = this.s;
        if (recyclerView3 != null) {
            int i2 = ejt.q;
            ejt ejtVar = recyclerView3.getParent() instanceof ejt ? (ejt) recyclerView3.getParent() : null;
            if (ejtVar != null) {
                ekh ekhVar = new ekh(this);
                this.ap = ekhVar;
                if (ekhVar.a != null) {
                    throw new RuntimeException("SectionsRecyclerView has already been initialized but never reset.");
                }
                ekhVar.a = ejtVar;
                ekhVar.a.n();
                ekhVar.b = ejtVar.getRecyclerView().getLayoutManager();
                if (ekhVar.b == null) {
                    throw new RuntimeException("LayoutManager of RecyclerView is not initialized yet.");
                }
                ekhVar.a.getRecyclerView().y(ekhVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(int r9, int r10) {
        /*
            r8 = this;
            defpackage.dyd.a()
            boolean r0 = defpackage.ejr.a
            if (r0 == 0) goto L2e
            int r0 = r8.hashCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ") moveItem "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "SectionsDebug"
            android.util.Log.d(r1, r0)
        L2e:
            monitor-enter(r8)
            java.util.List r0 = r8.a     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r0.remove(r9)     // Catch: java.lang.Throwable -> L9e
            efn r1 = (defpackage.efn) r1     // Catch: java.lang.Throwable -> L9e
            r0.add(r10, r1)     // Catch: java.lang.Throwable -> L9e
            int r0 = r8.x     // Catch: java.lang.Throwable -> L9e
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L58
            float r5 = (float) r10     // Catch: java.lang.Throwable -> L9e
            int r6 = r8.t     // Catch: java.lang.Throwable -> L9e
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L9e
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L9e
            float r7 = r8.g     // Catch: java.lang.Throwable -> L9e
            float r0 = r0 * r7
            float r6 = r6 - r0
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 < 0) goto L58
            int r6 = r8.u     // Catch: java.lang.Throwable -> L9e
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L9e
            float r6 = r6 + r0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 > 0) goto L58
            r0 = r3
            goto L59
        L58:
            r0 = r4
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r1.o()
            if (r5 == 0) goto L67
            if (r0 != 0) goto L67
            boolean r0 = r8.i
            r1.d(r0)
        L67:
            pq r0 = r8.d
            pr r0 = r0.a
            r0.b(r9, r10)
            ell r0 = r8.F
            int r1 = r8.u
            int r5 = r8.t
            int r1 = r1 - r5
            int r1 = r1 + r3
            boolean r5 = r0.d()
            if (r5 != 0) goto L9a
            if (r1 != r2) goto L7f
            goto L9a
        L7f:
            int r5 = r0.a
            if (r10 < r5) goto L8a
            int r6 = r5 + r1
            int r6 = r6 + r2
            if (r10 > r6) goto L8a
            r10 = r3
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r9 < r5) goto L93
            int r5 = r5 + r1
            int r5 = r5 + r2
            if (r9 > r5) goto L93
            r9 = r3
            goto L94
        L93:
            r9 = r4
        L94:
            if (r10 != 0) goto L9a
            if (r9 == 0) goto L99
            goto L9a
        L99:
            r3 = r4
        L9a:
            r0.c(r3)
            return
        L9e:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9e
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiz.H(int, int):void");
    }

    public final void I(boolean z, efg efgVar) {
        boolean z2 = ebc.a;
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + hashCode() + ") notifyChangeSetCompleteAsync");
        }
        this.A = true;
        z();
        W(z, efgVar);
        if (dyd.b()) {
            x(0);
            if (z) {
                if (dvv.b(null)) {
                    throw null;
                }
                F();
            }
        } else if (this.N.get()) {
            ebb.b().a(this.af);
        }
        if (ebc.a) {
            this.Y.set(-1L);
        }
    }

    public final void J(eik eikVar) {
        w(eikVar);
        efn efnVar = eikVar.b;
        efnVar.r(this.ao);
        if (ad()) {
            X(efnVar);
        }
    }

    public final void L(int i) {
        efn efnVar;
        dyd.a();
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + hashCode() + ") removeItemAt " + i);
        }
        synchronized (this) {
            efnVar = (efn) this.a.remove(i);
        }
        this.d.a.e(i, 1);
        ell ellVar = this.F;
        ellVar.c(ellVar.g(i));
        this.f.post(new ehv(efnVar));
    }

    public final void M(int i, int i2) {
        dyd.a();
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + hashCode() + ") removeRangeAt " + i + ", size: " + i2);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add((efn) this.a.remove(i));
            }
        }
        this.d.a.e(i, i2);
        ell ellVar = this.F;
        ellVar.c(ellVar.g(i));
        aa(arrayList);
    }

    public final void N() {
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + hashCode() + ") requestRemeasure");
        }
        if (this.s == null) {
            Handler handler = this.f;
            Runnable runnable = this.o;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            return;
        }
        Handler handler2 = this.f;
        Runnable runnable2 = this.o;
        handler2.removeCallbacks(runnable2);
        this.s.removeCallbacks(runnable2);
        RecyclerView recyclerView = this.s;
        int[] iArr = ahj.a;
        recyclerView.postOnAnimation(runnable2);
    }

    public final void O(int i) {
        if (this.y == null || this.U) {
            return;
        }
        List list = this.a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            efn efnVar = (efn) list.get(i3);
            int iA = efnVar.a();
            if ((!this.k || !this.p || !efnVar.q()) && iA > i2) {
                i2 = iA;
            }
        }
        if (i2 != this.y.b) {
            int iMax = Math.max(this.c.a(View.MeasureSpec.getSize(this.ag), View.MeasureSpec.getSize(this.ah), i, i2), 1);
            this.y.b = i2;
            this.x = iMax;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.efb
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void i(RecyclerView recyclerView) {
        int iAA;
        int paddingTop;
        int iAw;
        int paddingLeft;
        dyd.a();
        egy egyVar = this.c;
        qd qdVarJ = egyVar.j();
        View viewT = qdVarJ.T(this.t);
        if (viewT != null) {
            qd qdVarJ2 = egyVar.j();
            boolean z = qdVarJ2 instanceof LinearLayoutManager ? ((LinearLayoutManager) qdVarJ2).m : false;
            if (egyVar.i() == 0) {
                if (z) {
                    iAw = recyclerView.getWidth() - qdVarJ.getPaddingRight();
                    paddingLeft = qdVarJ.az(viewT);
                } else {
                    iAw = qdVarJ.aw(viewT);
                    paddingLeft = qdVarJ.getPaddingLeft();
                }
                this.w = iAw - paddingLeft;
            } else {
                if (z) {
                    iAA = recyclerView.getHeight() - qdVarJ.getPaddingBottom();
                    paddingTop = qdVarJ.av(viewT);
                } else {
                    iAA = qdVarJ.aA(viewT);
                    paddingTop = qdVarJ.getPaddingTop();
                }
                this.w = iAA - paddingTop;
            }
        } else {
            this.w = 0;
        }
        ell ellVar = this.F;
        recyclerView.ac(ellVar.d);
        if (recyclerView instanceof egf) {
            ((egf) recyclerView).c();
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.ac);
        }
        C();
        recyclerView.ag(null);
        recyclerView.ai(null);
        eli eliVar = this.ak;
        if (eliVar != null) {
            synchronized (ellVar) {
                List list = ellVar.c;
                if (!list.isEmpty()) {
                    list.remove(eliVar);
                }
            }
        }
        synchronized (this) {
            List list2 = this.a;
            int size = list2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((efn) list2.get(size)).d(this.i);
                }
            }
        }
        if (this.s != recyclerView) {
            return;
        }
        this.s = null;
        ekh ekhVar = this.ap;
        if (ekhVar != null) {
            ejt ejtVar = ekhVar.a;
            if (ejtVar == null) {
                throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
            }
            ejtVar.getRecyclerView().ac(ekhVar);
            ekhVar.b = null;
            ekhVar.a = null;
        }
        this.c.m(null);
        this.E.clear();
    }

    public final void Q(int i, ejm ejmVar) {
        dyd.a();
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + hashCode() + ") updateItemAt " + i + ", name: " + ejmVar.o());
        }
        synchronized (this) {
            List list = this.a;
            if (list.isEmpty()) {
                int size = list.size();
                String strO = ejmVar.o();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = this.ae;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sb.append((String) arrayList.get(i2));
                    sb.append("\n");
                }
                throw new RuntimeException("Trying to update an item while the list of components is empty (index=" + i + ", size=" + size + "). This likely means data passed to the section had duplicates or a mutable data model. Component involved in the error whose backing data model may have duplicates: " + strO + ". Read more here: https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception. Operations Info: " + sb.toString());
            }
            efn efnVar = (efn) list.get(i);
            efnVar.c().m();
            y(ejmVar);
            ejmVar.m();
            efnVar.c();
            efnVar.l(ejmVar);
        }
        ejmVar.m();
        ell ellVar = this.F;
        ellVar.c(ellVar.e(i, 1));
    }

    public final void R(int i, List list) {
        dyd.a();
        if (ejr.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((ejm) list.get(i2)).o();
            }
            Log.d("SectionsDebug", "(" + hashCode() + ") updateRangeAt " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr));
        }
        list.size();
        synchronized (this) {
            try {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    efn efnVar = (efn) this.a.get(i + i3);
                    ejm ejmVar = (ejm) list.get(i3);
                    y(ejmVar);
                    ejmVar.m();
                    efnVar.c().m();
                    ejmVar.m();
                    efnVar.c();
                    efnVar.l(ejmVar);
                }
            } catch (IndexOutOfBoundsException e) {
                String[] strArr2 = new String[list.size()];
                for (int i4 = 0; i4 < list.size(); i4++) {
                    strArr2[i4] = ((ejm) list.get(i4)).o();
                }
                throw new IndexOutOfBoundsException(("(" + hashCode() + ") updateRangeAt " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr2)) + e.getMessage());
            }
        }
        ell ellVar = this.F;
        ellVar.c(ellVar.e(i, list.size()));
    }

    final void T(int i, int i2, eiu eiuVar) {
        ohv ohvVarI;
        String strE;
        if (this.U) {
            return;
        }
        boolean z = ebc.a;
        List list = eiuVar.b;
        int i3 = eiuVar.a;
        List<efn> list2 = this.a;
        boolean zB = dvv.b(null);
        eit eitVar = new eit(list, i3, list2.size() - 1, this.m);
        if (!list2.isEmpty()) {
            for (int i4 = 0; i4 <= 0; i4++) {
                E(eitVar);
            }
        }
        efn efnVar = (efn) list.get(i3);
        int iS = s(efnVar);
        int iR = r(efnVar);
        if (zB) {
            throw null;
        }
        dru druVar = this.e;
        if (druVar.o() != null) {
            ohvVarI = druVar.o();
            strE = druVar.j();
        } else {
            ohvVarI = efnVar.c().i();
            strE = efnVar.c().e();
        }
        dxc dxcVarB = ohvVarI != null ? dwb.b(ohvVarI, strE, ohvVarI.a(druVar, 20), druVar.f) : null;
        try {
            dxt dxtVar = new dxt();
            efnVar.g(druVar, iS, iR, dxtVar);
            if (this.j) {
                Map map = this.l;
                dxt dxtVar2 = new dxt();
                int iMax = 0;
                for (efn efnVar2 : list2) {
                    efnVar2.g(druVar, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), dxtVar2);
                    iMax = Math.max(iMax, dxtVar2.b);
                    map.put(efnVar2, Integer.valueOf(dxtVar2.b));
                }
                dxtVar.b = iMax;
            }
            int iMax2 = Math.max(this.c.a(dxtVar.a, dxtVar.b, i, i2), 1);
            this.y = dxtVar;
            this.x = iMax2;
            if (dxcVarB != null) {
                ohvVarI.c(dxcVarB);
            }
        } catch (Throwable th) {
            if (dxcVarB != null) {
                ohvVarI.c(dxcVarB);
            }
            throw th;
        }
    }

    @Override // defpackage.egg
    public final synchronized ComponentTree a(int i) {
        efn efnVar = (efn) this.a.get(i);
        int iS = s(efnVar);
        int iR = r(efnVar);
        if (efnVar.p(iS, iR)) {
            return efnVar.b();
        }
        efnVar.g(this.e, iS, iR, null);
        return efnVar.b();
    }

    @Override // defpackage.efb
    public final void af() {
        ArrayList arrayList;
        if (this.Q != null) {
            return;
        }
        if (dyd.b()) {
            K(this.a);
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.a);
        }
        aa(arrayList);
    }

    @Override // defpackage.efb
    public final synchronized void ag(int i, int i2) {
        if (this.ag != -1) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            if (this.r != null) {
                int i3 = this.c.i();
                int i4 = this.ag;
                if (i4 != -1) {
                    if (i3 != 0 ? dwf.a(i4, iMakeMeasureSpec, this.r.a) : dwf.a(this.ah, iMakeMeasureSpec2, this.r.b)) {
                        return;
                    }
                }
            }
        }
        f(L, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824), this.z);
    }

    @Override // defpackage.elj
    public final int b() {
        throw null;
    }

    @Override // defpackage.elj
    public final int c() {
        return this.c.c();
    }

    @Override // defpackage.elj
    public final int d() {
        throw null;
    }

    @Override // defpackage.elj
    public final int e() {
        return this.c.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3 A[Catch: all -> 0x0188, Merged into TryCatch #1 {all -> 0x018b, blocks: (B:32:0x005d, B:103:0x018a, B:33:0x005e, B:35:0x0064, B:38:0x006e, B:40:0x0072, B:42:0x007c, B:43:0x0088, B:52:0x00a8, B:54:0x00b3, B:55:0x00b5, B:57:0x00c0, B:58:0x00cc, B:60:0x00d6, B:62:0x00dc, B:63:0x00e4, B:45:0x008b, B:47:0x008f, B:49:0x0099, B:50:0x00a5, B:64:0x00ee, B:66:0x00f8, B:68:0x00fe, B:69:0x0109, B:72:0x0111, B:75:0x0116, B:86:0x013c, B:87:0x0156, B:89:0x015c, B:90:0x0166, B:92:0x016a, B:93:0x016d, B:95:0x0171, B:96:0x017a, B:76:0x011e, B:79:0x0123, B:81:0x012d, B:84:0x0132, B:85:0x013a), top: B:112:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0 A[Catch: all -> 0x0188, LOOP:0: B:56:0x00be->B:57:0x00c0, LOOP_END, Merged into TryCatch #1 {all -> 0x018b, blocks: (B:32:0x005d, B:103:0x018a, B:33:0x005e, B:35:0x0064, B:38:0x006e, B:40:0x0072, B:42:0x007c, B:43:0x0088, B:52:0x00a8, B:54:0x00b3, B:55:0x00b5, B:57:0x00c0, B:58:0x00cc, B:60:0x00d6, B:62:0x00dc, B:63:0x00e4, B:45:0x008b, B:47:0x008f, B:49:0x0099, B:50:0x00a5, B:64:0x00ee, B:66:0x00f8, B:68:0x00fe, B:69:0x0109, B:72:0x0111, B:75:0x0116, B:86:0x013c, B:87:0x0156, B:89:0x015c, B:90:0x0166, B:92:0x016a, B:93:0x016d, B:95:0x0171, B:96:0x017a, B:76:0x011e, B:79:0x0123, B:81:0x012d, B:84:0x0132, B:85:0x013a), top: B:112:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4 A[Catch: all -> 0x0188, Merged into TryCatch #1 {all -> 0x018b, blocks: (B:32:0x005d, B:103:0x018a, B:33:0x005e, B:35:0x0064, B:38:0x006e, B:40:0x0072, B:42:0x007c, B:43:0x0088, B:52:0x00a8, B:54:0x00b3, B:55:0x00b5, B:57:0x00c0, B:58:0x00cc, B:60:0x00d6, B:62:0x00dc, B:63:0x00e4, B:45:0x008b, B:47:0x008f, B:49:0x0099, B:50:0x00a5, B:64:0x00ee, B:66:0x00f8, B:68:0x00fe, B:69:0x0109, B:72:0x0111, B:75:0x0116, B:86:0x013c, B:87:0x0156, B:89:0x015c, B:90:0x0166, B:92:0x016a, B:93:0x016d, B:95:0x0171, B:96:0x017a, B:76:0x011e, B:79:0x0123, B:81:0x012d, B:84:0x0132, B:85:0x013a), top: B:112:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c A[Catch: all -> 0x0188, LOOP:1: B:87:0x0156->B:89:0x015c, LOOP_END, Merged into TryCatch #1 {all -> 0x018b, blocks: (B:32:0x005d, B:103:0x018a, B:33:0x005e, B:35:0x0064, B:38:0x006e, B:40:0x0072, B:42:0x007c, B:43:0x0088, B:52:0x00a8, B:54:0x00b3, B:55:0x00b5, B:57:0x00c0, B:58:0x00cc, B:60:0x00d6, B:62:0x00dc, B:63:0x00e4, B:45:0x008b, B:47:0x008f, B:49:0x0099, B:50:0x00a5, B:64:0x00ee, B:66:0x00f8, B:68:0x00fe, B:69:0x0109, B:72:0x0111, B:75:0x0116, B:86:0x013c, B:87:0x0156, B:89:0x015c, B:90:0x0166, B:92:0x016a, B:93:0x016d, B:95:0x0171, B:96:0x017a, B:76:0x011e, B:79:0x0123, B:81:0x012d, B:84:0x0132, B:85:0x013a), top: B:112:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a A[Catch: all -> 0x0188, Merged into TryCatch #1 {all -> 0x018b, blocks: (B:32:0x005d, B:103:0x018a, B:33:0x005e, B:35:0x0064, B:38:0x006e, B:40:0x0072, B:42:0x007c, B:43:0x0088, B:52:0x00a8, B:54:0x00b3, B:55:0x00b5, B:57:0x00c0, B:58:0x00cc, B:60:0x00d6, B:62:0x00dc, B:63:0x00e4, B:45:0x008b, B:47:0x008f, B:49:0x0099, B:50:0x00a5, B:64:0x00ee, B:66:0x00f8, B:68:0x00fe, B:69:0x0109, B:72:0x0111, B:75:0x0116, B:86:0x013c, B:87:0x0156, B:89:0x015c, B:90:0x0166, B:92:0x016a, B:93:0x016d, B:95:0x0171, B:96:0x017a, B:76:0x011e, B:79:0x0123, B:81:0x012d, B:84:0x0132, B:85:0x013a), top: B:112:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171 A[Catch: all -> 0x0188, Merged into TryCatch #1 {all -> 0x018b, blocks: (B:32:0x005d, B:103:0x018a, B:33:0x005e, B:35:0x0064, B:38:0x006e, B:40:0x0072, B:42:0x007c, B:43:0x0088, B:52:0x00a8, B:54:0x00b3, B:55:0x00b5, B:57:0x00c0, B:58:0x00cc, B:60:0x00d6, B:62:0x00dc, B:63:0x00e4, B:45:0x008b, B:47:0x008f, B:49:0x0099, B:50:0x00a5, B:64:0x00ee, B:66:0x00f8, B:68:0x00fe, B:69:0x0109, B:72:0x0111, B:75:0x0116, B:86:0x013c, B:87:0x0156, B:89:0x015c, B:90:0x0166, B:92:0x016a, B:93:0x016d, B:95:0x0171, B:96:0x017a, B:76:0x011e, B:79:0x0123, B:81:0x012d, B:84:0x0132, B:85:0x013a), top: B:112:0x005d }] */
    @Override // defpackage.efb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.dxt r12, int r13, int r14, defpackage.dtu r15) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiz.f(dxt, int, int, dtu):void");
    }

    @Override // defpackage.elj
    public final int h() {
        throw null;
    }

    @Override // defpackage.efb
    public final boolean j() {
        return this.q;
    }

    @Override // defpackage.egg
    public final boolean n(int i) {
        return o(i) && ((efn) this.a.get(i)).c().h();
    }

    @Override // defpackage.egg
    public final boolean o(int i) {
        return i >= 0 && i < this.a.size();
    }

    @Override // defpackage.egw
    public final synchronized ejm p(int i) {
        dyd.a();
        return ((efn) this.a.get(i)).c();
    }

    public final int r(efn efnVar) {
        if (this.j) {
            return this.y == null ? this.c.f(this.ah, efnVar.c()) : this.c.f(View.MeasureSpec.makeMeasureSpec(this.y.b, 1073741824), efnVar.c());
        }
        if (this.p) {
            return 0;
        }
        return ad() ? this.c.f(View.MeasureSpec.makeMeasureSpec(this.r.b, 1073741824), efnVar.c()) : this.c.f(this.ah, efnVar.c());
    }

    public final int s(efn efnVar) {
        return ad() ? this.c.g(View.MeasureSpec.makeMeasureSpec(this.r.a, 1073741824), efnVar.c()) : this.c.g(this.ag, efnVar.c());
    }

    public final int t() {
        if (this.y == null) {
            return -1;
        }
        return this.c.i() == 0 ? this.y.b : this.y.a;
    }

    public final efn u(ejm ejmVar) {
        tll tllVar = this.al;
        emk emkVar = tllVar != null ? tllVar.a : null;
        eht ehtVar = this.an;
        ebc ebcVar = this.X;
        boolean z = this.S;
        boolean z2 = this.P;
        boolean z3 = this.T;
        boolean z4 = this.V;
        dvn dvnVar = this.Q;
        int i = efn.f;
        efl eflVar = new efl();
        if (ejmVar == null) {
            ejmVar = efk.n();
        }
        eflVar.a = ejmVar;
        eflVar.c = emkVar;
        eflVar.i = ehtVar;
        eflVar.b = ebcVar;
        eflVar.d = z;
        eflVar.g = z2;
        eflVar.e = z3;
        eflVar.f = z4;
        eflVar.h = dvnVar;
        if (eflVar.a != null) {
            return new efn(eflVar);
        }
        throw new IllegalArgumentException("A RenderInfo must be specified to create a ComponentTreeHolder");
    }

    public final eik v(int i, ejm ejmVar) {
        efn efnVarU = u(ejmVar);
        efnVarU.j(false);
        return new eik(i, efnVarU);
    }

    public final void w(eim eimVar) {
        if (this.aj == null) {
            this.aj = new eij();
        }
        this.aj.a.add(eimVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        r0 = r1.a;
        r2 = r0.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
    
        if (r5 >= r2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
    
        r6 = (defpackage.eim) r0.get(r5);
        r7 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
    
        if (r7 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
    
        if (r7 == 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
    
        if (r7 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        if (r7 == 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
    
        if (r7 == 4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
    
        r6 = (defpackage.eil) r6;
        H(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012e, code lost:
    
        r6 = (defpackage.eio) r6;
        M(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        L(((defpackage.ein) r6).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
    
        r6 = (defpackage.eiq) r6;
        R(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        r6 = (defpackage.eip) r6;
        Q(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
    
        r6 = (defpackage.eik) r6;
        r7 = r6.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        if (r7.n() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0160, code lost:
    
        if (defpackage.ejr.a == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0162, code lost:
    
        android.util.Log.d("SectionsDebug", "(" + hashCode() + ") applyAsyncInsert " + r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        r7.c().m();
        r8 = r13.a;
        r6 = r6.a;
        r8.add(r6, r7);
        r7.j(true);
        r13.d.t(r6);
        r7 = r13.F;
        r7.c(r7.f(r6, r13.x));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a7, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ab, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(int r14) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiz.x(int):void");
    }

    public final void z() {
        boolean z = ebc.a;
        if (ebc.a) {
            long id = Thread.currentThread().getId();
            long andSet = this.Y.getAndSet(id);
            if (id == andSet || andSet == -1) {
                return;
            }
            throw new IllegalStateException("Multiple threads applying change sets at once! (" + andSet + " and " + id + ")");
        }
    }

    @Override // defpackage.efb
    public final /* bridge */ /* synthetic */ void k() {
    }

    @Override // defpackage.efb
    public final /* bridge */ /* synthetic */ void l() {
    }

    @Override // defpackage.efb
    public final void m() {
    }
}
