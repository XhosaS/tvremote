package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bq implements ComponentCallbacks, View.OnCreateContextMenuListener, bcl, bem, bbz, bqs {
    static final Object g = new Object();
    boolean A;
    int B;
    public de C;
    public ce D;
    public bq F;
    public int G;
    public int H;
    public String I;
    public boolean J;
    public boolean K;
    public boolean L;
    boolean M;
    boolean N;
    public boolean P;
    ViewGroup Q;
    public View R;
    boolean S;
    bn U;
    boolean V;
    public LayoutInflater W;
    boolean X;
    public String Y;
    public bco aa;
    dz ab;
    beg ad;
    bqr ae;
    Bundle i;
    SparseArray j;
    Bundle k;
    Boolean l;
    public Bundle n;
    bq o;
    public int q;
    boolean s;
    public boolean t;
    boolean u;
    boolean v;
    public boolean w;
    boolean x;
    public boolean y;
    boolean z;
    int h = -1;
    public String m = UUID.randomUUID().toString();
    public String p = null;
    public Boolean r = null;
    de E = new df();
    final boolean O = true;
    public boolean T = true;
    public bcf Z = bcf.e;
    final bcx ac = new bcx();
    public final AtomicInteger af = new AtomicInteger();
    public final ArrayList ag = new ArrayList();
    private final bp a = new bi(this);

    public bq() {
        cr();
    }

    private final void aB(bp bpVar) {
        if (this.h >= 0) {
            bpVar.a();
        } else {
            this.ag.add(bpVar);
        }
    }

    private final void cr() {
        this.aa = new bco(this);
        this.ae = bqr.a.a(this);
        this.ad = null;
        ArrayList arrayList = this.ag;
        bp bpVar = this.a;
        if (arrayList.contains(bpVar)) {
            return;
        }
        aB(bpVar);
    }

    @Deprecated
    public static bq ed(Context context, String str, Bundle bundle) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = cd.a;
            try {
                bq bqVar = (bq) cd.a(classLoader, str).getConstructor(null).newInstance(null);
                if (bundle != null) {
                    bundle.setClassLoader(bqVar.getClass().getClassLoader());
                    bqVar.ae(bundle);
                }
                return bqVar;
            } catch (ClassCastException e) {
                throw new bo("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new bo("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new bo(a.e(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new bo(a.e(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new bo(a.e(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new bo(a.e(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private final int ez() {
        bcf bcfVar = this.Z;
        return (bcfVar == bcf.b || this.F == null) ? bcfVar.ordinal() : Math.min(bcfVar.ordinal(), this.F.ez());
    }

    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    final ArrayList P() {
        ArrayList arrayList;
        bn bnVar = this.U;
        return (bnVar == null || (arrayList = bnVar.g) == null) ? new ArrayList() : arrayList;
    }

    final ArrayList Q() {
        ArrayList arrayList;
        bn bnVar = this.U;
        return (bnVar == null || (arrayList = bnVar.h) == null) ? new ArrayList() : arrayList;
    }

    public void R(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.H));
        printWriter.print(" mTag=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.h);
        printWriter.print(" mWho=");
        printWriter.print(this.m);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.s);
        printWriter.print(" mRemoving=");
        printWriter.print(this.t);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.w);
        printWriter.print(" mInLayout=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.J);
        printWriter.print(" mDetached=");
        printWriter.print(this.K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(true);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.L);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.T);
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.C);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.D);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.F);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.n);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.j);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.k);
        }
        bq bqVarEc = ec(false);
        if (bqVarEc != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(bqVarEc);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(an());
        if (dV() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(dV());
        }
        if (dW() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(dW());
        }
        if (dX() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(dX());
        }
        if (dY() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(dY());
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.R);
        }
        if (s() != null) {
            ((bfh) bfc.a(this)).b.a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.E + ":");
        this.E.A(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    final void S() {
        cr();
        this.Y = this.m;
        this.m = UUID.randomUUID().toString();
        this.s = false;
        this.t = false;
        this.w = false;
        this.x = false;
        this.z = false;
        this.B = 0;
        this.C = null;
        this.E = new df();
        this.D = null;
        this.G = 0;
        this.H = 0;
        this.I = null;
        this.J = false;
        this.K = false;
    }

    final /* synthetic */ void T() {
        dz dzVar = this.ab;
        dzVar.b.b.c(this.k);
        this.k = null;
    }

    @Deprecated
    public void U(Bundle bundle) {
        this.P = true;
    }

    @Deprecated
    public void V(int i, int i2, Intent intent) {
        if (de.S(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    public void W(Activity activity) {
        this.P = true;
    }

    public void X() {
        this.P = true;
    }

    public void Y() {
        this.P = true;
    }

    public void Z() {
        this.P = true;
    }

    final void ab() {
        Bundle bundle = this.i;
        aa(this.R, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.E.y(2);
    }

    final void ac() {
        Bundle bundle;
        Bundle bundle2 = this.i;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.E.I(bundle);
        this.E.o();
    }

    final void ad(int i, int i2, int i3, int i4) {
        if (this.U == null && i == 0) {
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
        eb().b = i;
        eb().c = i2;
        eb().d = i3;
        eb().e = i4;
    }

    public void ae(Bundle bundle) {
        de deVar = this.C;
        if (deVar != null && deVar.X()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.n = bundle;
    }

    public void af(Object obj) {
        eb().i = obj;
    }

    public void ag(Object obj) {
        eb().k = obj;
    }

    final void ah(int i) {
        if (this.U == null && i == 0) {
            return;
        }
        eb();
        this.U.f = i;
    }

    final void ai(boolean z) {
        if (this.U == null) {
            return;
        }
        eb().a = z;
    }

    public void aj(Object obj) {
        eb().l = obj;
    }

    public void ak(Object obj) {
        eb().j = obj;
    }

    public void al(Object obj) {
        eb().m = obj;
    }

    final void am(ArrayList arrayList, ArrayList arrayList2) {
        eb();
        bn bnVar = this.U;
        bnVar.g = arrayList;
        bnVar.h = arrayList2;
    }

    final boolean an() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return false;
        }
        return bnVar.a;
    }

    public final boolean ao() {
        return this.D != null && this.s;
    }

    public final boolean ap() {
        bq bqVar;
        if (this.J) {
            return true;
        }
        return (this.C == null || (bqVar = this.F) == null || !bqVar.ap()) ? false : true;
    }

    final boolean aq() {
        return this.B > 0;
    }

    @Deprecated
    public final LayoutInflater ar() {
        ce ceVar = this.D;
        if (ceVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterC = ceVar.c();
        layoutInflaterC.setFactory2(this.E.d);
        return layoutInflaterC;
    }

    public Animator as(int i, int i2) {
        return null;
    }

    @Deprecated
    public final void at() {
        if (!this.N) {
            this.N = true;
            if (!ao() || ap()) {
                return;
            }
            this.D.k();
        }
    }

    @Deprecated
    public final void au(bq bqVar) {
        asx asxVar = asx.a;
        ata ataVar = new ata(this, bqVar);
        asx asxVar2 = asx.a;
        asxVar2.c(ataVar);
        asw aswVarA = asxVar2.a(this);
        if (aswVarA.b.contains(asv.h) && asxVar2.e(aswVarA, getClass(), ataVar.getClass())) {
            asxVar2.b(aswVarA, ataVar);
        }
        de deVar = this.C;
        de deVar2 = bqVar.C;
        if (deVar != null && deVar2 != null && deVar != deVar2) {
            throw new IllegalArgumentException(a.c(bqVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (bq bqVarEc = bqVar; bqVarEc != null; bqVarEc = bqVarEc.ec(false)) {
            if (bqVarEc.equals(this)) {
                throw new IllegalArgumentException(a.f(this, bqVar, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (this.C == null || bqVar.C == null) {
            this.p = null;
            this.o = bqVar;
        } else {
            this.p = bqVar.m;
            this.o = null;
        }
        this.q = 0;
    }

    public boolean aw() {
        return false;
    }

    @Deprecated
    public boolean ay() {
        return false;
    }

    public final View cP() {
        View view = this.R;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.c(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final Object cQ() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return null;
        }
        return bnVar.i;
    }

    public ca cp() {
        return new bj(this);
    }

    public void dH(Bundle bundle) {
        this.P = true;
    }

    public void dI(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.E.noteStateNotSaved();
        this.A = true;
        this.ab = new dz(this, el(), new bg(this));
        View viewD = D(layoutInflater, viewGroup, bundle);
        this.R = viewD;
        if (viewD == null) {
            if (this.ab.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.ab = null;
            return;
        }
        this.ab.a();
        if (de.S(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.R + " for Fragment " + this);
        }
        ben.a(this.R, this.ab);
        beo.a(this.R, this.ab);
        bqt.a(this.R, this.ab);
        this.ac.g(this.ab);
    }

    @Override // defpackage.bbz
    public beg dM() {
        Application application;
        if (this.C == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.ad == null) {
            Context applicationContext = dZ().getApplicationContext();
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
            if (application == null && de.S(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + dZ().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.ad = new bdw(application, this, this.n);
        }
        return this.ad;
    }

    final float dU() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return 1.0f;
        }
        return bnVar.o;
    }

    final int dV() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.b;
    }

    final int dW() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.c;
    }

    final int dX() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.d;
    }

    final int dY() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return 0;
        }
        return bnVar.e;
    }

    public final Context dZ() {
        Context contextS = s();
        if (contextS != null) {
            return contextS;
        }
        throw new IllegalStateException(a.c(this, "Fragment ", " not attached to a context."));
    }

    public void e() {
        this.P = true;
    }

    public final Bundle ea() {
        Bundle bundle = this.n;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.c(this, "Fragment ", " does not have any arguments."));
    }

    public final bn eb() {
        if (this.U == null) {
            this.U = new bn();
        }
        return this.U;
    }

    public final bq ec(boolean z) {
        String str;
        if (z) {
            asx asxVar = asx.a;
            asz aszVar = new asz(this);
            asx asxVar2 = asx.a;
            asxVar2.c(aszVar);
            asw aswVarA = asxVar2.a(this);
            if (aswVarA.b.contains(asv.h) && asxVar2.e(aswVarA, getClass(), aszVar.getClass())) {
                asxVar2.b(aswVarA, aszVar);
            }
        }
        bq bqVar = this.o;
        if (bqVar != null) {
            return bqVar;
        }
        de deVar = this.C;
        if (deVar == null || (str = this.p) == null) {
            return null;
        }
        return deVar.b.b(str);
    }

    public final bw ee() {
        ce ceVar = this.D;
        if (ceVar == null) {
            return null;
        }
        return (bw) ceVar.b;
    }

    public final bw ef() {
        bw bwVarEe = ee();
        if (bwVarEe != null) {
            return bwVarEe;
        }
        throw new IllegalStateException(a.c(this, "Fragment ", " not attached to an activity."));
    }

    public final de eg() {
        if (this.D != null) {
            return this.E;
        }
        throw new IllegalStateException(a.c(this, "Fragment ", " has not been attached yet."));
    }

    public final de eh() {
        de deVar = this.C;
        if (deVar != null) {
            return deVar;
        }
        throw new IllegalStateException(a.c(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final LayoutInflater ei(Bundle bundle) {
        LayoutInflater layoutInflaterEv = ev(bundle);
        this.W = layoutInflaterEv;
        return layoutInflaterEv;
    }

    public final ur ej(vb vbVar, uq uqVar) {
        bl blVar = new bl(this);
        if (this.h > 1) {
            throw new IllegalStateException(a.c(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        aB(new bm(this, blVar, atomicReference, vbVar, uqVar));
        return new bh(atomicReference);
    }

    @Override // defpackage.bcl
    public bcg ek() {
        return this.aa;
    }

    @Override // defpackage.bem
    public final bel el() {
        if (this.C == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (ez() == bcf.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.C.y.d;
        bel belVar = (bel) map.get(this.m);
        if (belVar != null) {
            return belVar;
        }
        bel belVar2 = new bel();
        map.put(this.m, belVar2);
        return belVar2;
    }

    @Override // defpackage.bbz
    public bet em() {
        Application application;
        Context applicationContext = dZ().getApplicationContext();
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
        if (application == null && de.S(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + dZ().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        beu beuVar = new beu(ber.a);
        if (application != null) {
            beuVar.b(bee.b, application);
        }
        beuVar.b(bds.a, this);
        beuVar.b(bds.b, this);
        Bundle bundle = this.n;
        if (bundle != null) {
            beuVar.b(bds.c, bundle);
        }
        return beuVar;
    }

    @Override // defpackage.bqs
    public final bqo en() {
        return this.ae.c;
    }

    public final Object eo() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return null;
        }
        return bnVar.k;
    }

    public final Object ep() {
        ce ceVar = this.D;
        if (ceVar == null) {
            return null;
        }
        return ceVar.f();
    }

    public final Object eq() {
        bn bnVar = this.U;
        if (bnVar == null) {
            return null;
        }
        return bnVar.m;
    }

    public void er() {
        this.P = true;
    }

    public LayoutInflater ev(Bundle bundle) {
        return ar();
    }

    public void ex(Context context) {
        this.P = true;
        ce ceVar = this.D;
        Activity activity = ceVar == null ? null : ceVar.b;
        if (activity != null) {
            this.P = false;
            W(activity);
        }
    }

    public void ey(Bundle bundle) {
        this.P = true;
        ac();
        de deVar = this.E;
        if (deVar.m > 0) {
            return;
        }
        deVar.o();
    }

    public void h() {
        this.P = true;
    }

    public void i() {
        this.P = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.P = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ef().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.P = true;
    }

    public Context s() {
        ce ceVar = this.D;
        if (ceVar == null) {
            return null;
        }
        return ceVar.c;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.D == null) {
            throw new IllegalStateException(a.c(this, "Fragment ", " not attached to Activity"));
        }
        de deVarEh = eh();
        if (deVarEh.r == null) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        deVarEh.t.addLast(new FragmentManager$LaunchedFragmentInfo(this.m, i));
        deVarEh.r.b(intent);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.m);
        if (this.G != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.G));
        }
        if (this.I != null) {
            sb.append(" tag=");
            sb.append(this.I);
        }
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    public void aA() {
    }

    @Deprecated
    public void ax() {
    }

    @Deprecated
    public void az() {
    }

    public void g(Bundle bundle) {
    }

    public void aa(View view, Bundle bundle) {
    }

    public void av(int i, int i2) {
    }
}
