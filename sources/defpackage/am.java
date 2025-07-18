package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tv.remote.service.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class am {
    private final oy B;
    private final oy C;
    private final oy D;
    private final oy E;
    private final x F;
    private boolean G;
    private ArrayList H;
    private ArrayList I;
    private ArrayList J;
    private final Runnable K;
    private bub L;
    private bub M;
    private bub N;
    private final ii O;
    private final byj P;
    final ArrayList i;
    public final CopyOnWriteArrayList j;
    int k;
    public y l;
    public v m;
    public q n;
    q o;
    ArrayDeque p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public ao u;
    public cih v;
    public final awy w;
    private boolean x;
    private ArrayList y;
    public final ArrayList a = new ArrayList();
    public final as b = new as();
    ArrayList c = new ArrayList();
    public final aa d = new aa(this);
    c e = null;
    boolean f = false;
    public final kt g = new ad(this);
    public final AtomicInteger h = new AtomicInteger();
    private final Map z = DesugarCollections.synchronizedMap(new HashMap());
    private final Map A = DesugarCollections.synchronizedMap(new HashMap());

    public am() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.i = new ArrayList();
        this.w = new awy(this);
        this.j = new CopyOnWriteArrayList();
        this.B = new r(this, 2);
        this.C = new r(this, 3);
        this.D = new r(this, 4);
        this.E = new r(this, 5);
        this.P = new byj(this, null);
        this.k = -1;
        this.F = new ae(this);
        this.O = new ii(null, null);
        this.p = new ArrayDeque();
        this.K = new ac(this, 2, null);
    }

    public static boolean S(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set X(c cVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = cVar.d;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            q qVar = ((at) arrayList.get(i)).b;
            if (qVar != null && cVar.j) {
                hashSet.add(qVar);
            }
            i++;
        }
    }

    public static final boolean Y(q qVar) {
        boolean z = qVar.H;
        boolean zY = false;
        for (q qVar2 : qVar.y.b.f()) {
            if (qVar2 != null) {
                zY = Y(qVar2);
            }
            if (zY) {
                return true;
            }
        }
        return false;
    }

    static final boolean Z(q qVar) {
        return qVar == null || qVar.w == null || Z(qVar.z);
    }

    static final void aa(q qVar) {
        if (S(2)) {
            Objects.toString(qVar);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(qVar)));
        }
        if (qVar.D) {
            qVar.D = false;
            qVar.P = !qVar.P;
        }
    }

    private final ViewGroup af(q qVar) {
        ViewGroup viewGroup = qVar.K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (qVar.B <= 0 || !this.m.b()) {
            return null;
        }
        View viewA = this.m.a(qVar.B);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    private final Set ag() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((ar) it.next()).a.K;
            if (viewGroup != null) {
                hashSet.add(ii.ae(viewGroup, ae()));
            }
        }
        return hashSet;
    }

    private final void ah() {
        if (V()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void ai() {
        this.x = false;
        this.I.clear();
        this.H.clear();
    }

    private final void aj() {
        if (this.G) {
            this.G = false;
            ao();
        }
    }

    private final void ak(boolean z) {
        if (this.x) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.l == null) {
            if (!this.t) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.l.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            ah();
        }
        if (this.H == null) {
            this.H = new ArrayList();
            this.I = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0229 A[PHI: r13
  0x0229: PHI (r13v46 int) = (r13v45 int), (r13v47 int) binds: [B:101:0x0219, B:106:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void al(java.util.ArrayList r26, java.util.ArrayList r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 2368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am.al(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void am(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((c) arrayList.get(i)).r) {
                if (i2 != i) {
                    al(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((c) arrayList.get(i2)).r) {
                        i2++;
                    }
                }
                al(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            al(arrayList, arrayList2, i2, size);
        }
    }

    private final void an(q qVar) {
        ViewGroup viewGroupAf = af(qVar);
        if (viewGroupAf == null || qVar.b() + qVar.c() + qVar.d() + qVar.e() <= 0) {
            return;
        }
        if (viewGroupAf.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAf.setTag(R.id.visible_removing_fragment_view_tag, qVar);
        }
        ((q) viewGroupAf.getTag(R.id.visible_removing_fragment_view_tag)).y(qVar.A());
    }

    private final void ao() {
        for (ar arVar : this.b.e()) {
            q qVar = arVar.a;
            if (qVar.M) {
                if (this.x) {
                    this.G = true;
                } else {
                    qVar.M = false;
                    arVar.d();
                }
            }
        }
    }

    private final void ap(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ay());
        y yVar = this.l;
        if (yVar == null) {
            try {
                B("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((s) yVar).a.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    static q d(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof q) {
            return (q) tag;
        }
        return null;
    }

    final void A() {
        this.s = true;
        this.u.g = true;
        z(4);
    }

    public final void B(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        as asVar = this.b;
        HashMap map = asVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (ar arVar : map.values()) {
                printWriter.print(str);
                if (arVar != null) {
                    String strValueOf = String.valueOf(str);
                    q qVar = arVar.a;
                    printWriter.println(qVar);
                    String strConcat = strValueOf.concat("    ");
                    printWriter.print(strConcat);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(qVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(qVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(qVar.C);
                    printWriter.print(strConcat);
                    printWriter.print("mState=");
                    printWriter.print(qVar.b);
                    printWriter.print(" mWho=");
                    printWriter.print(qVar.g);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(qVar.v);
                    printWriter.print(strConcat);
                    printWriter.print("mAdded=");
                    printWriter.print(qVar.m);
                    printWriter.print(" mRemoving=");
                    printWriter.print(qVar.n);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(qVar.q);
                    printWriter.print(" mInLayout=");
                    printWriter.println(qVar.r);
                    printWriter.print(strConcat);
                    printWriter.print("mHidden=");
                    printWriter.print(qVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(qVar.E);
                    printWriter.print(" mMenuVisible=");
                    boolean z = qVar.I;
                    printWriter.print(true);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strConcat);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(qVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(qVar.N);
                    if (qVar.w != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(qVar.w);
                    }
                    if (qVar.x != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mHost=");
                        printWriter.println(qVar.x);
                    }
                    if (qVar.z != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mParentFragment=");
                        printWriter.println(qVar.z);
                    }
                    if (qVar.h != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mArguments=");
                        printWriter.println(qVar.h);
                    }
                    if (qVar.c != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(qVar.c);
                    }
                    if (qVar.d != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(qVar.d);
                    }
                    if (qVar.e != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(qVar.e);
                    }
                    Object objB = qVar.i;
                    if (objB == null) {
                        am amVar = qVar.w;
                        objB = (amVar == null || (str2 = qVar.j) == null) ? null : amVar.b(str2);
                    }
                    if (objB != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mTarget=");
                        printWriter.print(objB);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(qVar.k);
                    }
                    printWriter.print(strConcat);
                    printWriter.print("mPopDirection=");
                    printWriter.println(qVar.A());
                    if (qVar.b() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getEnterAnim=");
                        printWriter.println(qVar.b());
                    }
                    if (qVar.c() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getExitAnim=");
                        printWriter.println(qVar.c());
                    }
                    if (qVar.d() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getPopEnterAnim=");
                        printWriter.println(qVar.d());
                    }
                    if (qVar.e() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getPopExitAnim=");
                        printWriter.println(qVar.e());
                    }
                    if (qVar.K != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mContainer=");
                        printWriter.println(qVar.K);
                    }
                    if (qVar.L != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mView=");
                        printWriter.println(qVar.L);
                    }
                    o oVar = qVar.O;
                    if (qVar.f() != null) {
                        yh.a(qVar).c(strConcat, printWriter);
                    }
                    printWriter.print(strConcat);
                    printWriter.println("Child " + qVar.y + ":");
                    qVar.y.B(strConcat.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = asVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                q qVar2 = (q) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(qVar2.toString());
            }
        }
        ArrayList arrayList2 = this.y;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                q qVar3 = (q) this.y.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(qVar3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                c cVar = (c) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.c(strValueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.h.get());
        ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (ak) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.m);
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.n);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.k);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.r);
        printWriter.print(" mStopped=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.q) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.q);
        }
    }

    public final void C() {
        Iterator it = ag().iterator();
        while (it.hasNext()) {
            ((bf) it.next()).f();
        }
    }

    public final void D(ak akVar, boolean z) {
        if (z && (this.l == null || this.t)) {
            return;
        }
        ak(z);
        c cVar = this.e;
        if (cVar != null) {
            cVar.b = false;
            cVar.b();
            if (S(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.e + " as part of execSingleAction for action " + akVar);
            }
            this.e.g(false);
            this.e.e(this.H, this.I);
            ArrayList arrayList = this.e.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                q qVar = ((at) arrayList.get(i)).b;
                if (qVar != null) {
                    qVar.o = false;
                }
            }
            this.e = null;
        }
        akVar.e(this.H, this.I);
        this.x = true;
        try {
            am(this.H, this.I);
            ai();
            N();
            aj();
            this.b.i();
        } catch (Throwable th) {
            ai();
            throw th;
        }
    }

    public final void E() {
        for (bf bfVar : ag()) {
        }
    }

    final void F(q qVar) {
        if (S(2)) {
            Objects.toString(qVar);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(qVar)));
        }
        if (qVar.D) {
            return;
        }
        qVar.D = true;
        qVar.P = true ^ qVar.P;
        an(qVar);
    }

    final void G(int i, boolean z) {
        y yVar;
        if (this.l == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.k) {
            this.k = i;
            as asVar = this.b;
            ArrayList arrayList = asVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ar arVar = (ar) asVar.b.get(((q) arrayList.get(i2)).g);
                if (arVar != null) {
                    arVar.d();
                }
            }
            for (ar arVar2 : asVar.b.values()) {
                if (arVar2 != null) {
                    arVar2.d();
                    q qVar = arVar2.a;
                    if (qVar.n && !qVar.C()) {
                        boolean z2 = qVar.p;
                        asVar.k(arVar2);
                    }
                }
            }
            ao();
            if (this.q && (yVar = this.l) != null && this.k == 7) {
                ((s) yVar).a.invalidateOptionsMenu();
                this.q = false;
            }
        }
    }

    public final void H() {
        if (this.l == null) {
            return;
        }
        this.r = false;
        this.s = false;
        this.u.g = false;
        for (q qVar : this.b.g()) {
            if (qVar != null) {
                qVar.y.H();
            }
        }
    }

    final void I(q qVar) {
        if (S(2)) {
            Log.v("FragmentManager", "remove: " + qVar + " nesting=" + qVar.v);
        }
        boolean zC = qVar.C();
        if (qVar.E && zC) {
            return;
        }
        this.b.l(qVar);
        if (Y(qVar)) {
            this.q = true;
        }
        qVar.n = true;
        an(qVar);
    }

    final void J(Parcelable parcelable) {
        int i;
        int i2;
        ar arVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.l.c.getClassLoader());
                this.A.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.l.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        as asVar = this.b;
        HashMap map2 = asVar.c;
        map2.clear();
        map2.putAll(map);
        an anVar = (an) bundle3.getParcelable("state");
        if (anVar == null) {
            return;
        }
        asVar.b.clear();
        ArrayList arrayList = anVar.a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= size) {
                break;
            }
            Bundle bundleA = asVar.a((String) arrayList.get(i3), null);
            if (bundleA != null) {
                q qVar = (q) this.u.b.get(((aq) bundleA.getParcelable("state")).b);
                if (qVar != null) {
                    if (S(2)) {
                        Objects.toString(qVar);
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(qVar.toString()));
                    }
                    arVar = new ar(this.w, asVar, qVar, bundleA);
                } else {
                    arVar = new ar(this.w, asVar, this.l.c.getClassLoader(), e(), bundleA);
                }
                q qVar2 = arVar.a;
                qVar2.c = bundleA;
                qVar2.w = this;
                if (S(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + qVar2.g + "): " + qVar2);
                }
                arVar.e(this.l.c.getClassLoader());
                asVar.j(arVar);
                arVar.b = this.k;
            }
            i3++;
        }
        for (q qVar3 : new ArrayList(this.u.b.values())) {
            if (!asVar.m(qVar3.g)) {
                if (S(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + qVar3 + " that was not found in the set of active Fragments " + anVar.a);
                }
                this.u.d(qVar3);
                qVar3.w = this;
                ar arVar2 = new ar(this.w, asVar, qVar3);
                arVar2.b = 1;
                arVar2.d();
                qVar3.n = true;
                arVar2.d();
            }
        }
        ArrayList<String> arrayList2 = anVar.b;
        asVar.a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                q qVarB = asVar.b(str3);
                if (qVarB == null) {
                    throw new IllegalStateException(b.c(str3, "No instantiated fragment for (", ")"));
                }
                if (S(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + qVarB);
                }
                asVar.h(qVarB);
            }
        }
        d[] dVarArr = anVar.c;
        if (dVarArr != null) {
            this.c = new ArrayList(dVarArr.length);
            int i4 = 0;
            while (true) {
                d[] dVarArr2 = anVar.c;
                if (i4 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i4];
                c cVar = new c(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = dVar.a;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    at atVar = new at();
                    int i7 = i5 + 1;
                    atVar.a = iArr[i5];
                    if (S(i)) {
                        i2 = i;
                        Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i6 + " base fragment #" + iArr[i7]);
                    } else {
                        i2 = i;
                    }
                    atVar.h = xb.values()[dVar.c[i6]];
                    atVar.i = xb.values()[dVar.d[i6]];
                    int i8 = i5 + 2;
                    atVar.c = iArr[i7] != 0;
                    int i9 = iArr[i8];
                    atVar.d = i9;
                    int i10 = iArr[i5 + 3];
                    atVar.e = i10;
                    int i11 = i5 + 5;
                    int i12 = iArr[i5 + 4];
                    atVar.f = i12;
                    i5 += 6;
                    int i13 = iArr[i11];
                    atVar.g = i13;
                    cVar.e = i9;
                    cVar.f = i10;
                    cVar.g = i12;
                    cVar.h = i13;
                    cVar.h(atVar);
                    i6++;
                    i = i2;
                }
                int i14 = i;
                cVar.i = dVar.e;
                cVar.k = dVar.f;
                cVar.j = true;
                cVar.l = dVar.h;
                cVar.m = dVar.i;
                cVar.n = dVar.j;
                cVar.o = dVar.k;
                cVar.p = dVar.l;
                cVar.q = dVar.m;
                cVar.r = dVar.n;
                cVar.c = dVar.g;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = dVar.b;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i15);
                    if (str4 != null) {
                        ((at) cVar.d.get(i15)).b = b(str4);
                    }
                    i15++;
                }
                cVar.a(1);
                if (S(i14)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + cVar.c + "): " + cVar);
                    PrintWriter printWriter = new PrintWriter(new ay());
                    cVar.d("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(cVar);
                i4++;
                i = i14;
            }
        } else {
            this.c = new ArrayList();
        }
        this.h.set(anVar.d);
        String str5 = anVar.e;
        if (str5 != null) {
            q qVarB2 = b(str5);
            this.o = qVarB2;
            u(qVarB2);
        }
        ArrayList arrayList4 = anVar.f;
        if (arrayList4 != null) {
            for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                this.z.put((String) arrayList4.get(i16), (f) anVar.g.get(i16));
            }
        }
        this.p = new ArrayDeque(anVar.h);
    }

    final void K(q qVar, boolean z) {
        ViewGroup viewGroupAf = af(qVar);
        if (viewGroupAf == null || !(viewGroupAf instanceof w)) {
            return;
        }
        ((w) viewGroupAf).a = !z;
    }

    final void L(q qVar, xb xbVar) {
        if (!qVar.equals(b(qVar.g)) || (qVar.x != null && qVar.w != this)) {
            throw new IllegalArgumentException(b.d(this, qVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        qVar.T = xbVar;
    }

    final void M(q qVar) {
        if (qVar != null && (!qVar.equals(b(qVar.g)) || (qVar.x != null && qVar.w != this))) {
            throw new IllegalArgumentException(b.d(this, qVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        q qVar2 = this.o;
        this.o = qVar;
        u(qVar2);
        u(this.o);
    }

    public final void N() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.g.f(true);
                if (S(3)) {
                    Log.d("FragmentManager", b.b(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = this.c.size() + (this.e != null ? 1 : 0) > 0 && U(this.n);
            if (S(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.g.f(z);
        }
    }

    final boolean O(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (q qVar : this.b.g()) {
            if (qVar != null && !qVar.D && qVar.y.O(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean P(Menu menu, MenuInflater menuInflater) {
        if (this.k <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (q qVar : this.b.g()) {
            if (qVar != null && Z(qVar) && !qVar.D && qVar.y.P(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qVar);
                z = true;
            }
        }
        if (this.y != null) {
            for (int i = 0; i < this.y.size(); i++) {
                q qVar2 = (q) this.y.get(i);
                if (arrayList != null) {
                    arrayList.contains(qVar2);
                }
            }
        }
        this.y = arrayList;
        return z;
    }

    public final boolean Q(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (q qVar : this.b.g()) {
            if (qVar != null && !qVar.D && qVar.y.Q(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean R(Menu menu) {
        boolean z = false;
        if (this.k <= 0) {
            return false;
        }
        for (q qVar : this.b.g()) {
            if (qVar != null && Z(qVar) && !qVar.D && qVar.y.R(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean T() {
        q qVar = this.n;
        if (qVar == null) {
            return true;
        }
        return qVar.B() && qVar.k().T();
    }

    final boolean U(q qVar) {
        if (qVar == null) {
            return true;
        }
        am amVar = qVar.w;
        return qVar.equals(amVar.o) && U(amVar.n);
    }

    public final boolean V() {
        return this.r || this.s;
    }

    public final boolean W() {
        ab(false);
        ak(true);
        q qVar = this.o;
        if (qVar != null && qVar.j().W()) {
            return true;
        }
        boolean zAd = ad(this.H, this.I);
        if (zAd) {
            this.x = true;
            try {
                am(this.H, this.I);
            } finally {
                ai();
            }
        }
        N();
        aj();
        this.b.i();
        return zAd;
    }

    final Bundle a() {
        int i;
        d[] dVarArr;
        ArrayList arrayList;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        C();
        ab(true);
        this.r = true;
        this.u.g = true;
        as asVar = this.b;
        HashMap map = asVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ar arVar = (ar) it.next();
            if (arVar != null) {
                q qVar = arVar.a;
                String str = qVar.g;
                Bundle bundle3 = new Bundle();
                if (qVar.b == -1 && (bundle = qVar.c) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new aq(qVar));
                if (qVar.b > 0) {
                    Bundle bundle4 = new Bundle();
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    arVar.c.O(qVar, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    qVar.Y.l(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleA = qVar.y.a();
                    if (!bundleA.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleA);
                    }
                    if (qVar.L != null) {
                        arVar.f();
                    }
                    SparseArray<? extends Parcelable> sparseArray = qVar.d;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = qVar.e;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = qVar.h;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                asVar.a(str, bundle3);
                arrayList2.add(qVar.g);
                if (S(2)) {
                    Log.v("FragmentManager", "Saved state of " + qVar + ": " + qVar.c);
                }
            }
        }
        HashMap map2 = asVar.c;
        if (!map2.isEmpty()) {
            ArrayList arrayList3 = asVar.a;
            synchronized (arrayList3) {
                dVarArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        q qVar2 = (q) it2.next();
                        arrayList.add(qVar2.g);
                        if (S(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + qVar2.g + "): " + qVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                dVarArr = new d[size];
                for (i = 0; i < size; i++) {
                    dVarArr[i] = new d((c) this.c.get(i));
                    if (S(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.c.get(i));
                    }
                }
            }
            an anVar = new an();
            anVar.a = arrayList2;
            anVar.b = arrayList;
            anVar.c = dVarArr;
            anVar.d = this.h.get();
            q qVar3 = this.o;
            if (qVar3 != null) {
                anVar.e = qVar3.g;
            }
            ArrayList arrayList4 = anVar.f;
            Map map3 = this.z;
            arrayList4.addAll(map3.keySet());
            anVar.g.addAll(map3.values());
            anVar.h = new ArrayList(this.p);
            bundle2.putParcelable("state", anVar);
            Map map4 = this.A;
            for (String str2 : map4.keySet()) {
                bundle2.putBundle("result_".concat(String.valueOf(str2)), (Bundle) map4.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle("fragment_".concat(String.valueOf(str3)), (Bundle) map2.get(str3));
            }
        } else if (S(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void ab(boolean z) {
        c cVar;
        ak(z);
        if (!this.f && (cVar = this.e) != null) {
            cVar.b = false;
            cVar.b();
            if (S(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.e + " as part of execPendingActions for actions " + this.a);
            }
            this.e.g(false);
            this.a.add(0, this.e);
            ArrayList arrayList = this.e.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                q qVar = ((at) arrayList.get(i)).b;
                if (qVar != null) {
                    qVar.o = false;
                }
            }
            this.e = null;
        }
        while (true) {
            ArrayList arrayList2 = this.H;
            ArrayList arrayList3 = this.I;
            ArrayList arrayList4 = this.a;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zE = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zE |= ((ak) arrayList4.get(i2)).e(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.l.d.removeCallbacks(this.K);
                    if (!zE) {
                        break;
                    }
                    this.x = true;
                    try {
                        am(this.H, this.I);
                    } finally {
                        ai();
                    }
                } catch (Throwable th) {
                    this.a.clear();
                    this.l.d.removeCallbacks(this.K);
                    throw th;
                }
            }
        }
        N();
        aj();
        this.b.i();
    }

    final void ac(ak akVar) {
        if (this.l == null) {
            if (!this.t) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        ah();
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.l == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            arrayList.add(akVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    Handler handler = this.l.d;
                    Runnable runnable = this.K;
                    handler.removeCallbacks(runnable);
                    this.l.d.post(runnable);
                    N();
                }
            }
        }
    }

    final boolean ad(ArrayList arrayList, ArrayList arrayList2) {
        int size = this.c.isEmpty() ? -1 : this.c.size() - 1;
        if (size < 0) {
            return false;
        }
        for (int size2 = this.c.size() - 1; size2 >= size; size2--) {
            arrayList.add((c) this.c.remove(size2));
            arrayList2.add(true);
        }
        return true;
    }

    final ii ae() {
        q qVar = this.n;
        return qVar != null ? qVar.w.ae() : this.O;
    }

    final q b(String str) {
        return this.b.b(str);
    }

    public final q c(int i) {
        as asVar = this.b;
        ArrayList arrayList = asVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (ar arVar : asVar.b.values()) {
                    if (arVar != null) {
                        q qVar = arVar.a;
                        if (qVar.A == i) {
                            return qVar;
                        }
                    }
                }
                return null;
            }
            q qVar2 = (q) arrayList.get(size);
            if (qVar2 != null && qVar2.A == i) {
                return qVar2;
            }
        }
    }

    /*  JADX ERROR: Failed to decode insn: 0x0004: IGET r0, r0
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.nodes.ClassNode.searchField(ClassNode.java:541)
        	at jadx.core.dex.nodes.RootNode.resolveField(RootNode.java:632)
        	at jadx.core.dex.instructions.InsnDecoder.tryResolveFieldType(InsnDecoder.java:548)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:372)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:51)
        	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:86)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:158)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:458)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:309)
        */
    public final defpackage.x e() {
        /*
            r1 = this;
            q r0 = r1.n
            if (r0 == 0) goto Lb
            am r0 = r0.w
            x r0 = r0.e()
            return r0
        Lb:
            x r0 = r1.F
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am.e():x");
    }

    final ar f(q qVar) {
        String str = qVar.S;
        if (str != null) {
            up.a(qVar, str);
        }
        if (S(2)) {
            Objects.toString(qVar);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(qVar)));
        }
        ar arVarG = g(qVar);
        qVar.w = this;
        as asVar = this.b;
        asVar.j(arVarG);
        if (!qVar.E) {
            asVar.h(qVar);
            qVar.n = false;
            if (qVar.L == null) {
                qVar.P = false;
            }
            if (Y(qVar)) {
                this.q = true;
            }
        }
        return arVarG;
    }

    final ar g(q qVar) {
        as asVar = this.b;
        ar arVarD = asVar.d(qVar.g);
        if (arVarD != null) {
            return arVarD;
        }
        ar arVar = new ar(this.w, asVar, qVar);
        arVar.e(this.l.c.getClassLoader());
        arVar.b = this.k;
        return arVar;
    }

    final Set h(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((c) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                q qVar = ((at) arrayList2.get(i3)).b;
                if (qVar != null && (viewGroup = qVar.K) != null) {
                    hashSet.add(bf.c(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void i(ap apVar) {
        this.j.add(apVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [abk, y] */
    public final void j(y yVar, v vVar, q qVar) {
        if (this.l != null) {
            throw new IllegalStateException("Already attached");
        }
        this.l = yVar;
        this.m = vVar;
        this.n = qVar;
        if (qVar != null) {
            i(new af());
        } else if (yVar instanceof ap) {
            i(yVar);
        }
        if (this.n != null) {
            N();
        }
        if (yVar instanceof kv) {
            cih cihVarO = ((s) yVar).a.o();
            this.v = cihVarO;
            q qVar2 = qVar != null ? qVar : yVar;
            kt ktVar = this.g;
            qVar2.getClass();
            ktVar.getClass();
            xc xcVarM = qVar2.m();
            if (xcVarM.a != xb.a) {
                ku kuVar = new ku(cihVarO, ktVar, xcVarM);
                xcVarM.a(kuVar);
                ktVar.c.add(kuVar);
            }
        }
        int i = 0;
        if (qVar != null) {
            ao aoVar = qVar.w.u;
            HashMap map = aoVar.c;
            ao aoVar2 = (ao) map.get(qVar.g);
            if (aoVar2 == null) {
                aoVar2 = new ao(aoVar.e);
                map.put(qVar.g, aoVar2);
            }
            this.u = aoVar2;
        } else {
            if (yVar instanceof yc) {
                asv asvVarK = yVar.K();
                xz xzVar = ao.a;
                yd ydVar = yd.a;
                ydVar.getClass();
                this.u = (ao) yb.a(ao.class, new cmt(asvVarK, xzVar, ydVar));
            } else {
                this.u = new ao(false);
            }
            qVar = null;
        }
        ao aoVar3 = this.u;
        aoVar3.g = V();
        this.b.d = aoVar3;
        ?? r5 = this.l;
        if ((r5 instanceof abk) && qVar == null) {
            adx adxVarJ = r5.J();
            adxVarJ.d("android:support:fragments", new ab(this, i));
            Bundle bundleC = adxVarJ.c("android:support:fragments");
            if (bundleC != null) {
                J(bundleC);
            }
        }
        y yVar2 = this.l;
        if (yVar2 instanceof ld) {
            lc lcVar = ((s) yVar2).a.h;
            String strConcat = qVar != null ? String.valueOf(qVar.g).concat(":") : "";
            lg lgVar = new lg();
            ag agVar = new ag(this, 0);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.L = lcVar.d(strConcat2.concat("StartActivityForResult"), lgVar, agVar);
            this.M = lcVar.d(strConcat2.concat("StartIntentSenderForResult"), new ah(), new ag(this, 2));
            this.N = lcVar.d(strConcat2.concat("RequestPermissions"), new lf(), new ag(this, 1));
        }
        y yVar3 = this.l;
        if (yVar3 instanceof ng) {
            ((s) yVar3).a.g(this.B);
        }
        y yVar4 = this.l;
        if (yVar4 instanceof nh) {
            oy oyVar = this.C;
            t tVar = ((s) yVar4).a;
            oyVar.getClass();
            tVar.j.add(oyVar);
        }
        y yVar5 = this.l;
        if (yVar5 instanceof az) {
            oy oyVar2 = this.D;
            t tVar2 = ((s) yVar5).a;
            oyVar2.getClass();
            tVar2.l.add(oyVar2);
        }
        y yVar6 = this.l;
        if (yVar6 instanceof ba) {
            oy oyVar3 = this.E;
            t tVar3 = ((s) yVar6).a;
            oyVar3.getClass();
            tVar3.m.add(oyVar3);
        }
        y yVar7 = this.l;
        if ((yVar7 instanceof pr) && qVar == null) {
            byj byjVar = this.P;
            t tVar4 = ((s) yVar7).a;
            byjVar.getClass();
            bzt bztVar = tVar4.o;
            ((CopyOnWriteArrayList) bztVar.b).add(byjVar);
            bztVar.c.run();
        }
    }

    final void k(q qVar) {
        if (S(2)) {
            Objects.toString(qVar);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(qVar)));
        }
        if (qVar.E) {
            qVar.E = false;
            if (qVar.m) {
                return;
            }
            this.b.h(qVar);
            if (S(2)) {
                Objects.toString(qVar);
                Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(qVar)));
            }
            if (Y(qVar)) {
                this.q = true;
            }
        }
    }

    final void l(q qVar) {
        if (S(2)) {
            Objects.toString(qVar);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(qVar)));
        }
        if (qVar.E) {
            return;
        }
        qVar.E = true;
        if (qVar.m) {
            if (S(2)) {
                Objects.toString(qVar);
                Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(qVar)));
            }
            this.b.l(qVar);
            if (Y(qVar)) {
                this.q = true;
            }
            an(qVar);
        }
    }

    final void m() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        z(4);
    }

    final void n(Configuration configuration, boolean z) {
        if (z && (this.l instanceof ng)) {
            ap(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (q qVar : this.b.g()) {
            if (qVar != null) {
                qVar.onConfigurationChanged(configuration);
                if (z) {
                    qVar.y.n(configuration, true);
                }
            }
        }
    }

    final void o() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        z(1);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    final void p() throws Exception {
        this.t = true;
        ab(true);
        C();
        y yVar = this.l;
        if (yVar instanceof yc ? this.b.d.f : true ^ ((Activity) yVar.c).isChangingConfigurations()) {
            Iterator it = this.z.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((f) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.b.d.b((String) it2.next(), false);
                }
            }
        }
        z(-1);
        y yVar2 = this.l;
        if (yVar2 instanceof nh) {
            oy oyVar = this.C;
            t tVar = ((s) yVar2).a;
            oyVar.getClass();
            tVar.j.remove(oyVar);
        }
        y yVar3 = this.l;
        if (yVar3 instanceof ng) {
            oy oyVar2 = this.B;
            t tVar2 = ((s) yVar3).a;
            oyVar2.getClass();
            tVar2.i.remove(oyVar2);
        }
        y yVar4 = this.l;
        if (yVar4 instanceof az) {
            oy oyVar3 = this.D;
            t tVar3 = ((s) yVar4).a;
            oyVar3.getClass();
            tVar3.l.remove(oyVar3);
        }
        y yVar5 = this.l;
        if (yVar5 instanceof ba) {
            oy oyVar4 = this.E;
            t tVar4 = ((s) yVar5).a;
            oyVar4.getClass();
            tVar4.m.remove(oyVar4);
        }
        y yVar6 = this.l;
        if ((yVar6 instanceof pr) && this.n == null) {
            byj byjVar = this.P;
            t tVar5 = ((s) yVar6).a;
            byjVar.getClass();
            bzt bztVar = tVar5.o;
            ((CopyOnWriteArrayList) bztVar.b).remove(byjVar);
            if (((qk) bztVar.a.remove(byjVar)) != null) {
                throw null;
            }
            bztVar.c.run();
        }
        this.l = null;
        this.m = null;
        this.n = null;
        if (this.v != null) {
            this.g.e();
            this.v = null;
        }
        bub bubVar = this.L;
        if (bubVar != null) {
            bubVar.a();
            this.M.a();
            this.N.a();
        }
    }

    final void q(boolean z) {
        if (z && (this.l instanceof nh)) {
            ap(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (q qVar : this.b.g()) {
            if (qVar != null) {
                qVar.onLowMemory();
                if (z) {
                    qVar.y.q(true);
                }
            }
        }
    }

    final void r(boolean z, boolean z2) {
        if (z2 && (this.l instanceof az)) {
            ap(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (q qVar : this.b.g()) {
            if (qVar != null && z2) {
                qVar.y.r(z, true);
            }
        }
    }

    final void s() {
        for (q qVar : this.b.f()) {
            if (qVar != null) {
                qVar.y.s();
            }
        }
    }

    public final void t(Menu menu) {
        if (this.k <= 0) {
            return;
        }
        for (q qVar : this.b.g()) {
            if (qVar != null && !qVar.D) {
                qVar.y.t(menu);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        q qVar = this.n;
        if (qVar != null) {
            sb.append(qVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.n)));
            sb.append("}");
        } else {
            y yVar = this.l;
            if (yVar != null) {
                sb.append(yVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.l)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(q qVar) {
        if (qVar == null || !qVar.equals(b(qVar.g))) {
            return;
        }
        boolean zU = qVar.w.U(qVar);
        Boolean bool = qVar.l;
        if (bool == null || bool.booleanValue() != zU) {
            qVar.l = Boolean.valueOf(zU);
            am amVar = qVar.y;
            amVar.N();
            amVar.u(amVar.o);
        }
    }

    final void v() {
        z(5);
    }

    final void w(boolean z, boolean z2) {
        if (z2 && (this.l instanceof ba)) {
            ap(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (q qVar : this.b.g()) {
            if (qVar != null && z2) {
                qVar.y.w(z, true);
            }
        }
    }

    final void x() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        z(7);
    }

    final void y() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        z(5);
    }

    public final void z(int i) {
        try {
            this.x = true;
            for (ar arVar : this.b.b.values()) {
                if (arVar != null) {
                    arVar.b = i;
                }
            }
            G(i, false);
            Iterator it = ag().iterator();
            while (it.hasNext()) {
                ((bf) it.next()).f();
            }
            this.x = false;
            ab(true);
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }
}
