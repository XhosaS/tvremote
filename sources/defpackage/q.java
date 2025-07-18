package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class q implements ComponentCallbacks, View.OnCreateContextMenuListener, xf, yc, wy, abk {
    static final Object a = new Object();
    int A;
    int B;
    String C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    public boolean J;
    public ViewGroup K;
    public View L;
    boolean M;
    public o O;
    boolean P;
    LayoutInflater Q;
    boolean R;
    public String S;
    ax U;
    public final ArrayList W;
    xc X;
    public awy Y;
    private final byj Z;
    public Bundle c;
    SparseArray d;
    Bundle e;
    Boolean f;
    Bundle h;
    q i;
    int k;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    int v;
    am w;
    y x;
    public q z;
    int b = -1;
    String g = UUID.randomUUID().toString();
    String j = null;
    public Boolean l = null;
    am y = new am();
    final boolean I = true;
    boolean N = true;
    xb T = xb.e;
    final xl V = new xl();

    public q() {
        new AtomicInteger();
        this.W = new ArrayList();
        this.Z = new byj(this, null);
        M();
    }

    @Deprecated
    public static q D(Context context, String str) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = x.a;
            try {
                return (q) x.a(classLoader, str).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                throw new p("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new p("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new p(b.c(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new p(b.c(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new p(b.c(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new p(b.c(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private final int L() {
        xb xbVar = this.T;
        return (xbVar == xb.b || this.z == null) ? xbVar.ordinal() : Math.min(xbVar.ordinal(), this.z.L());
    }

    private final void M() {
        this.X = new xc(this);
        this.Y = wz.g(this);
        ArrayList arrayList = this.W;
        byj byjVar = this.Z;
        if (arrayList.contains(byjVar)) {
            return;
        }
        if (this.b >= 0) {
            byjVar.E();
        } else {
            arrayList.add(byjVar);
        }
    }

    final boolean A() {
        o oVar = this.O;
        if (oVar == null) {
            return false;
        }
        return oVar.a;
    }

    public final boolean B() {
        return this.x != null && this.m;
    }

    final boolean C() {
        return this.v > 0;
    }

    public View E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final void F() {
        this.J = true;
    }

    public final void H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.y.H();
        this.u = true;
        this.U = new ax(this, K(), new ac(this, 1));
        View viewE = E(layoutInflater, viewGroup);
        this.L = viewE;
        if (viewE == null) {
            if (this.U.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.U = null;
            return;
        }
        this.U.b();
        if (am.S(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.L + " for Fragment " + this);
        }
        qr.f(this.L, this.U);
        qr.e(this.L, this.U);
        xo.d(this.L, this.U);
        this.V.e(this.U);
    }

    final LayoutInflater I() {
        y yVar = this.x;
        if (yVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        t tVar = ((s) yVar).a;
        LayoutInflater layoutInflaterCloneInContext = tVar.getLayoutInflater().cloneInContext(tVar);
        layoutInflaterCloneInContext.setFactory2(this.y.d);
        this.Q = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    @Override // defpackage.abk
    public final adx J() {
        return (adx) this.Y.a;
    }

    @Override // defpackage.yc
    public final asv K() {
        if (this.w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (L() == xb.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.w.u.d;
        asv asvVar = (asv) map.get(this.g);
        if (asvVar != null) {
            return asvVar;
        }
        asv asvVar2 = new asv((short[]) null);
        map.put(this.g, asvVar2);
        return asvVar2;
    }

    final float a() {
        o oVar = this.O;
        if (oVar == null) {
            return 1.0f;
        }
        return oVar.l;
    }

    public final int b() {
        o oVar = this.O;
        if (oVar == null) {
            return 0;
        }
        return oVar.b;
    }

    public final int c() {
        o oVar = this.O;
        if (oVar == null) {
            return 0;
        }
        return oVar.c;
    }

    public final int d() {
        o oVar = this.O;
        if (oVar == null) {
            return 0;
        }
        return oVar.d;
    }

    public final int e() {
        o oVar = this.O;
        if (oVar == null) {
            return 0;
        }
        return oVar.e;
    }

    public final Context f() {
        y yVar = this.x;
        if (yVar == null) {
            return null;
        }
        return yVar.c;
    }

    public final Context g() {
        Context contextF = f();
        if (contextF != null) {
            return contextF;
        }
        throw new IllegalStateException(b.b(this, "Fragment ", " not attached to a context."));
    }

    public final o h() {
        if (this.O == null) {
            this.O = new o();
        }
        return this.O;
    }

    public final t i() {
        y yVar = this.x;
        if (yVar == null) {
            return null;
        }
        return (t) yVar.b;
    }

    public final am j() {
        if (this.x != null) {
            return this.y;
        }
        throw new IllegalStateException(b.b(this, "Fragment ", " has not been attached yet."));
    }

    public final am k() {
        am amVar = this.w;
        if (amVar != null) {
            return amVar;
        }
        throw new IllegalStateException(b.b(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final View l() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(b.b(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    @Override // defpackage.xf
    public final xc m() {
        return this.X;
    }

    @Override // defpackage.wy
    public final yf n() {
        Application application;
        Context applicationContext = g().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && am.S(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + g().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        yf yfVar = new yf((byte[]) null);
        if (application != null) {
            yfVar.a(xy.a, application);
        }
        yfVar.a(xu.a, this);
        yfVar.a(xu.b, this);
        Bundle bundle = this.h;
        if (bundle != null) {
            yfVar.a(xu.c, bundle);
        }
        return yfVar;
    }

    final void o() {
        M();
        this.S = this.g;
        this.g = UUID.randomUUID().toString();
        this.m = false;
        this.n = false;
        this.q = false;
        this.r = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new am();
        this.x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        t tVarI = i();
        if (tVarI == null) {
            throw new IllegalStateException(b.b(this, "Fragment ", " not attached to an activity."));
        }
        tVarI.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.J = true;
    }

    @Deprecated
    public final void p(int i, int i2, Intent intent) {
        if (am.S(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void q(Context context) {
        this.J = true;
    }

    public void r() {
        this.J = true;
    }

    public void s() {
        this.J = true;
    }

    final void t() {
        Bundle bundle = this.c;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        G(this.L);
        this.y.z(2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.g);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    final void u() {
        Bundle bundle;
        Bundle bundle2 = this.c;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.y.J(bundle);
        this.y.o();
    }

    public final void v(int i, int i2, int i3, int i4) {
        if (this.O == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        h().b = i;
        h().c = i2;
        h().d = i3;
        h().e = i4;
    }

    final void w(View view) {
        h().m = view;
    }

    final void x(int i) {
        if (this.O == null && i == 0) {
            return;
        }
        h();
        this.O.f = i;
    }

    final void y(boolean z) {
        if (this.O == null) {
            return;
        }
        h().a = z;
    }

    final void z(ArrayList arrayList, ArrayList arrayList2) {
        h();
        o oVar = this.O;
        oVar.g = arrayList;
        oVar.h = arrayList2;
    }

    public void G(View view) {
    }
}
