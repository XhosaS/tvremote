package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
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
public class de {
    private ArrayList A;
    private final afe D;
    private final afe E;
    private final afe F;
    private final afe G;
    private final cd H;
    private ur I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final cr O;
    private final ct P;
    public ui e;
    public final ArrayList j;
    public final ci k;
    public final CopyOnWriteArrayList l;
    int m;
    public ce n;
    public ca o;
    public bq p;
    bq q;
    public ur r;
    public ur s;
    public ArrayDeque t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public di y;
    private boolean z;
    public final ArrayList a = new ArrayList();
    public final dn b = new dn();
    public ArrayList c = new ArrayList();
    public final cg d = new cg(this);
    public ab f = null;
    boolean g = false;
    public final ue h = new cq(this);
    public final AtomicInteger i = new AtomicInteger();
    private final Map B = DesugarCollections.synchronizedMap(new HashMap());
    private final Map C = DesugarCollections.synchronizedMap(new HashMap());

    public de() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.j = new ArrayList();
        this.k = new ci(this);
        this.l = new CopyOnWriteArrayList();
        this.D = new afe() { // from class: cl
            @Override // defpackage.afe
            public final void accept(Object obj) {
                de deVar = this.a;
                Configuration configuration = (Configuration) obj;
                if (deVar.U()) {
                    deVar.n(configuration, false);
                }
            }
        };
        this.E = new afe() { // from class: cm
            @Override // defpackage.afe
            public final void accept(Object obj) {
                de deVar = this.a;
                Integer num = (Integer) obj;
                if (deVar.U() && num.intValue() == 80) {
                    deVar.q(false);
                }
            }
        };
        this.F = new afe() { // from class: cn
            @Override // defpackage.afe
            public final void accept(Object obj) {
                de deVar = this.a;
                eb ebVar = (eb) obj;
                if (deVar.U()) {
                    deVar.r(ebVar.a, false);
                }
            }
        };
        this.G = new afe() { // from class: co
            @Override // defpackage.afe
            public final void accept(Object obj) {
                de deVar = this.a;
                ee eeVar = (ee) obj;
                if (deVar.U()) {
                    deVar.v(eeVar.a, false);
                }
            }
        };
        this.O = new cr(this);
        this.m = -1;
        this.H = new cs(this);
        this.P = new ct();
        this.t = new ArrayDeque();
        this.N = new cu(this);
    }

    public static boolean S(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    private final ViewGroup af(bq bqVar) {
        ViewGroup viewGroup = bqVar.Q;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bqVar.H <= 0 || !this.o.b()) {
            return null;
        }
        View viewA = this.o.a(bqVar.H);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    private final Set ag() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.g().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((dm) it.next()).b.Q;
            if (viewGroup != null) {
                hashSet.add(eo.a.b(viewGroup, ab()));
            }
        }
        return hashSet;
    }

    private final void ah() {
        if (X()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void ai() {
        this.z = false;
        this.L.clear();
        this.K.clear();
    }

    private final void aj() {
        if (this.J) {
            this.J = false;
            ap();
        }
    }

    private final void ak(boolean z) {
        if (this.z) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.n == null) {
            if (!this.x) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.n.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            ah();
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:487:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0227 A[PHI: r13
  0x0227: PHI (r13v28 int) = (r13v27 int), (r13v29 int) binds: [B:522:0x0217, B:527:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x05f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void al(java.util.ArrayList r26, java.util.ArrayList r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.al(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void am() {
        for (eo eoVar : ag()) {
        }
    }

    private final void an(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((ab) arrayList.get(i)).s) {
                if (i2 != i) {
                    al(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((ab) arrayList.get(i2)).s) {
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

    private final void ao(bq bqVar) {
        ViewGroup viewGroupAf = af(bqVar);
        if (viewGroupAf == null || bqVar.dV() + bqVar.dW() + bqVar.dX() + bqVar.dY() <= 0) {
            return;
        }
        if (viewGroupAf.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAf.setTag(R.id.visible_removing_fragment_view_tag, bqVar);
        }
        ((bq) viewGroupAf.getTag(R.id.visible_removing_fragment_view_tag)).ai(bqVar.an());
    }

    private final void ap() {
        for (dm dmVar : this.b.g()) {
            bq bqVar = dmVar.b;
            if (bqVar.S) {
                if (this.z) {
                    this.J = true;
                } else {
                    bqVar.S = false;
                    dmVar.d();
                }
            }
        }
    }

    private final void aq(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ea());
        ce ceVar = this.n;
        if (ceVar != null) {
            try {
                ceVar.s(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            A("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    static bq c(View view) {
        while (view != null) {
            bq bqVarD = d(view);
            if (bqVarD != null) {
                return bqVarD;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static bq d(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof bq) {
            return (bq) tag;
        }
        return null;
    }

    public final void A(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        dn dnVar = this.b;
        HashMap map = dnVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (dm dmVar : map.values()) {
                printWriter.print(str);
                if (dmVar != null) {
                    String strValueOf = String.valueOf(str);
                    bq bqVar = dmVar.b;
                    printWriter.println(bqVar);
                    bqVar.R(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = dnVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                bq bqVar2 = (bq) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(bqVar2.toString());
            }
        }
        ArrayList arrayList2 = this.A;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                bq bqVar3 = (bq) this.A.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(bqVar3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                ab abVar = (ab) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abVar.toString());
                abVar.g(strValueOf2.concat("    "), printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (db) arrayList3.get(i4);
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
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.o);
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    public final void B() {
        Iterator it = ag().iterator();
        while (it.hasNext()) {
            ((eo) it.next()).f();
        }
    }

    final void C(db dbVar, boolean z) {
        if (!z) {
            if (this.n == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            ah();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.n == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(dbVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    Handler handler = this.n.d;
                    Runnable runnable = this.N;
                    handler.removeCallbacks(runnable);
                    this.n.d.post(runnable);
                    N();
                }
            }
        }
    }

    final void D(db dbVar, boolean z) {
        if (z && (this.n == null || this.x)) {
            return;
        }
        ak(z);
        ab abVar = this.f;
        if (abVar != null) {
            abVar.b = false;
            abVar.d();
            if (S(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execSingleAction for action " + dbVar);
            }
            this.f.j(false, false);
            this.f.h(this.K, this.L);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bq bqVar = ((C0000do) arrayList.get(i)).b;
                if (bqVar != null) {
                    bqVar.u = false;
                }
            }
            this.f = null;
        }
        dbVar.h(this.K, this.L);
        this.z = true;
        try {
            an(this.K, this.L);
            ai();
            N();
            aj();
            this.b.k();
        } catch (Throwable th) {
            ai();
            throw th;
        }
    }

    final void E(bq bqVar) {
        if (S(2)) {
            Objects.toString(bqVar);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(bqVar)));
        }
        if (bqVar.J) {
            return;
        }
        bqVar.J = true;
        bqVar.V = true ^ bqVar.V;
        ao(bqVar);
    }

    final void F(int i, boolean z) {
        ce ceVar;
        if (this.n == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.m) {
            this.m = i;
            dn dnVar = this.b;
            ArrayList arrayList = dnVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dm dmVar = (dm) dnVar.b.get(((bq) arrayList.get(i2)).m);
                if (dmVar != null) {
                    dmVar.d();
                }
            }
            for (dm dmVar2 : dnVar.b.values()) {
                if (dmVar2 != null) {
                    dmVar2.d();
                    bq bqVar = dmVar2.b;
                    if (bqVar.t && !bqVar.aq()) {
                        boolean z2 = bqVar.v;
                        dnVar.m(dmVar2);
                    }
                }
            }
            ap();
            if (this.u && (ceVar = this.n) != null && this.m == 7) {
                ceVar.k();
                this.u = false;
            }
        }
    }

    public final void G() {
        C(new dc(this, -1, 0), false);
    }

    final void H(bq bqVar) {
        if (S(2)) {
            Log.v("FragmentManager", "remove: " + bqVar + " nesting=" + bqVar.B);
        }
        boolean zAq = bqVar.aq();
        if (bqVar.K && zAq) {
            return;
        }
        this.b.n(bqVar);
        if (T(bqVar)) {
            this.u = true;
        }
        bqVar.t = true;
        ao(bqVar);
    }

    final void I(Parcelable parcelable) {
        int i;
        int i2;
        dm dmVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.n.c.getClassLoader());
                this.C.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.n.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        dn dnVar = this.b;
        HashMap map2 = dnVar.c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        dnVar.b.clear();
        ArrayList arrayList = fragmentManagerState.a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= size) {
                break;
            }
            Bundle bundleA = dnVar.a((String) arrayList.get(i3), null);
            if (bundleA != null) {
                bq bqVar = (bq) this.y.b.get(((FragmentState) bundleA.getParcelable("state")).b);
                if (bqVar != null) {
                    if (S(2)) {
                        Objects.toString(bqVar);
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(bqVar.toString()));
                    }
                    dmVar = new dm(this.k, dnVar, bqVar, bundleA);
                } else {
                    dmVar = new dm(this.k, dnVar, this.n.c.getClassLoader(), e(), bundleA);
                }
                bq bqVar2 = dmVar.b;
                bqVar2.i = bundleA;
                bqVar2.C = this;
                if (S(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + bqVar2.m + "): " + bqVar2);
                }
                dmVar.e(this.n.c.getClassLoader());
                dnVar.l(dmVar);
                dmVar.c = this.m;
            }
            i3++;
        }
        for (bq bqVar3 : new ArrayList(this.y.b.values())) {
            if (!dnVar.o(bqVar3.m)) {
                if (S(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + bqVar3 + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                }
                this.y.d(bqVar3);
                bqVar3.C = this;
                dm dmVar2 = new dm(this.k, dnVar, bqVar3);
                dmVar2.c = 1;
                dmVar2.d();
                bqVar3.t = true;
                dmVar2.d();
            }
        }
        ArrayList<String> arrayList2 = fragmentManagerState.b;
        dnVar.a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                bq bqVarB = dnVar.b(str3);
                if (bqVarB == null) {
                    throw new IllegalStateException(a.e(str3, "No instantiated fragment for (", ")"));
                }
                if (S(2)) {
                    Log.v("FragmentManager", a.h(bqVarB, str3, "restoreSaveState: added (", "): "));
                }
                dnVar.j(bqVarB);
            }
        }
        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
        if (backStackRecordStateArr != null) {
            this.c = new ArrayList(backStackRecordStateArr.length);
            int i4 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.c;
                if (i4 >= backStackRecordStateArr2.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr2[i4];
                ab abVar = new ab(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.a;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    C0000do c0000do = new C0000do();
                    int i7 = i5 + 1;
                    int i8 = i;
                    c0000do.a = iArr[i5];
                    if (S(i8)) {
                        Log.v("FragmentManager", "Instantiate " + abVar + " op #" + i6 + " base fragment #" + iArr[i7]);
                    }
                    c0000do.h = bcf.values()[backStackRecordState.c[i6]];
                    c0000do.i = bcf.values()[backStackRecordState.d[i6]];
                    int i9 = i5 + 2;
                    c0000do.c = iArr[i7] != 0;
                    int i10 = iArr[i9];
                    c0000do.d = i10;
                    int i11 = iArr[i5 + 3];
                    c0000do.e = i11;
                    int i12 = i5 + 5;
                    int i13 = iArr[i5 + 4];
                    c0000do.f = i13;
                    i5 += 6;
                    int i14 = iArr[i12];
                    c0000do.g = i14;
                    abVar.e = i10;
                    abVar.f = i11;
                    abVar.g = i13;
                    abVar.h = i14;
                    abVar.l(c0000do);
                    i6++;
                    i = i8;
                }
                int i15 = i;
                abVar.i = backStackRecordState.e;
                abVar.l = backStackRecordState.f;
                abVar.j = true;
                abVar.m = backStackRecordState.h;
                abVar.n = backStackRecordState.i;
                abVar.o = backStackRecordState.j;
                abVar.p = backStackRecordState.k;
                abVar.q = backStackRecordState.l;
                abVar.r = backStackRecordState.m;
                abVar.s = backStackRecordState.n;
                abVar.c = backStackRecordState.g;
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = backStackRecordState.b;
                    if (i16 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i16);
                    if (str4 != null) {
                        ((C0000do) abVar.d.get(i16)).b = dnVar.b(str4);
                    }
                    i16++;
                }
                abVar.c(1);
                if (S(i15)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + abVar.c + "): " + abVar);
                    PrintWriter printWriter = new PrintWriter(new ea());
                    abVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(abVar);
                i4++;
                i = i15;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.c = new ArrayList();
        }
        this.i.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.e;
        if (str5 != null) {
            bq bqVarB2 = dnVar.b(str5);
            this.q = bqVarB2;
            u(bqVarB2);
        }
        ArrayList arrayList4 = fragmentManagerState.f;
        if (arrayList4 != null) {
            for (int i17 = i2; i17 < arrayList4.size(); i17++) {
                this.B.put((String) arrayList4.get(i17), (BackStackState) fragmentManagerState.g.get(i17));
            }
        }
        this.t = new ArrayDeque(fragmentManagerState.h);
    }

    final void J(bq bqVar, boolean z) {
        ViewGroup viewGroupAf = af(bqVar);
        if (viewGroupAf == null || !(viewGroupAf instanceof cb)) {
            return;
        }
        ((cb) viewGroupAf).a = !z;
    }

    final void K(bq bqVar, bcf bcfVar) {
        if (!bqVar.equals(this.b.b(bqVar.m)) || (bqVar.D != null && bqVar.C != this)) {
            throw new IllegalArgumentException(a.d(this, bqVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        bqVar.Z = bcfVar;
    }

    final void L(bq bqVar) {
        if (bqVar != null && (!bqVar.equals(this.b.b(bqVar.m)) || (bqVar.D != null && bqVar.C != this))) {
            throw new IllegalArgumentException(a.d(this, bqVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        bq bqVar2 = this.q;
        this.q = bqVar;
        u(bqVar2);
        u(this.q);
    }

    final void M(bq bqVar) {
        if (S(2)) {
            Objects.toString(bqVar);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(bqVar)));
        }
        if (bqVar.J) {
            bqVar.J = false;
            bqVar.V = !bqVar.V;
        }
    }

    public final void N() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.h.e(true);
                if (S(3)) {
                    Log.d("FragmentManager", a.c(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = a() > 0 && W(this.p);
            if (S(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.h.e(z);
        }
    }

    final boolean O(MenuItem menuItem) {
        if (this.m <= 0) {
            return false;
        }
        for (bq bqVar : this.b.i()) {
            if (bqVar != null && !bqVar.J && (bqVar.aw() || bqVar.E.O(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean P(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.m <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (bq bqVar : this.b.i()) {
            if (bqVar != null && V(bqVar) && !bqVar.J) {
                if (bqVar.N) {
                    bqVar.ax();
                    z = true;
                } else {
                    z = false;
                }
                if (z | bqVar.E.P(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bqVar);
                    z2 = true;
                }
            }
        }
        if (this.A != null) {
            for (int i = 0; i < this.A.size(); i++) {
                bq bqVar2 = (bq) this.A.get(i);
                if (arrayList != null) {
                    arrayList.contains(bqVar2);
                }
            }
        }
        this.A = arrayList;
        return z2;
    }

    public final boolean Q(MenuItem menuItem) {
        if (this.m <= 0) {
            return false;
        }
        for (bq bqVar : this.b.i()) {
            if (bqVar != null && !bqVar.J && ((bqVar.N && bqVar.ay()) || bqVar.E.Q(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean R(Menu menu) {
        boolean z;
        if (this.m <= 0) {
            return false;
        }
        boolean z2 = false;
        for (bq bqVar : this.b.i()) {
            if (bqVar != null && V(bqVar) && !bqVar.J) {
                if (bqVar.N) {
                    bqVar.az();
                    z = true;
                } else {
                    z = false;
                }
                if (bqVar.E.R(menu) | z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final boolean T(bq bqVar) {
        if (bqVar.N) {
            boolean z = bqVar.O;
            return true;
        }
        de deVar = bqVar.E;
        boolean zT = false;
        for (bq bqVar2 : deVar.b.h()) {
            if (bqVar2 != null) {
                zT = deVar.T(bqVar2);
            }
            if (zT) {
                return true;
            }
        }
        return false;
    }

    public final boolean U() {
        bq bqVar = this.p;
        if (bqVar == null) {
            return true;
        }
        return bqVar.ao() && bqVar.eh().U();
    }

    final boolean V(bq bqVar) {
        de deVar;
        return bqVar == null || (deVar = bqVar.C) == null || deVar.V(bqVar.F);
    }

    final boolean W(bq bqVar) {
        if (bqVar == null) {
            return true;
        }
        de deVar = bqVar.C;
        return bqVar.equals(deVar.q) && W(deVar.p);
    }

    public final boolean X() {
        return this.v || this.w;
    }

    public final boolean Y() {
        return Z(null, -1, 0);
    }

    public final boolean Z(String str, int i, int i2) {
        ae(false);
        ak(true);
        bq bqVar = this.q;
        if (bqVar != null && i < 0 && str == null && bqVar.eg().Y()) {
            return true;
        }
        boolean zAa = aa(this.K, this.L, str, i, i2);
        if (zAa) {
            this.z = true;
            try {
                an(this.K, this.L);
            } finally {
                ai();
            }
        }
        N();
        aj();
        this.b.k();
        return zAa;
    }

    public final int a() {
        return this.c.size() + (this.f != null ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean aa(java.util.ArrayList r6, java.util.ArrayList r7, java.lang.String r8, int r9, int r10) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.c
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = -1
            if (r0 == 0) goto Ld
        La:
            r8 = r2
            goto L74
        Ld:
            if (r8 != 0) goto L1e
            if (r9 >= 0) goto L1e
            if (r10 == 0) goto L16
            r8 = r1
            goto L74
        L16:
            java.util.ArrayList r8 = r5.c
            int r8 = r8.size()
            int r8 = r8 + r2
            goto L74
        L1e:
            java.util.ArrayList r0 = r5.c
            int r0 = r0.size()
            int r0 = r0 + r2
        L25:
            if (r0 < 0) goto L43
            java.util.ArrayList r3 = r5.c
            java.lang.Object r3 = r3.get(r0)
            ab r3 = (defpackage.ab) r3
            if (r8 == 0) goto L3a
            java.lang.String r4 = r3.l
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L3a
            goto L43
        L3a:
            if (r9 < 0) goto L40
            int r3 = r3.c
            if (r9 == r3) goto L43
        L40:
            int r0 = r0 + (-1)
            goto L25
        L43:
            if (r0 >= 0) goto L47
        L45:
            r8 = r0
            goto L74
        L47:
            if (r10 != 0) goto L56
            java.util.ArrayList r8 = r5.c
            int r8 = r8.size()
            int r8 = r8 + r2
            if (r0 != r8) goto L53
            goto La
        L53:
            int r8 = r0 + 1
            goto L74
        L56:
            if (r0 <= 0) goto L45
            java.util.ArrayList r10 = r5.c
            int r3 = r0 + (-1)
            java.lang.Object r10 = r10.get(r3)
            ab r10 = (defpackage.ab) r10
            if (r8 == 0) goto L6c
            java.lang.String r4 = r10.l
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L72
        L6c:
            if (r9 < 0) goto L45
            int r10 = r10.c
            if (r9 != r10) goto L45
        L72:
            r0 = r3
            goto L56
        L74:
            if (r8 >= 0) goto L77
            return r1
        L77:
            java.util.ArrayList r9 = r5.c
            int r9 = r9.size()
            int r9 = r9 + r2
        L7e:
            r10 = 1
            if (r9 < r8) goto L96
            java.util.ArrayList r0 = r5.c
            java.lang.Object r0 = r0.remove(r9)
            ab r0 = (defpackage.ab) r0
            r6.add(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L7e
        L96:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.aa(java.util.ArrayList, java.util.ArrayList, java.lang.String, int, int):boolean");
    }

    final ct ab() {
        bq bqVar = this.p;
        return bqVar != null ? bqVar.C.ab() : this.P;
    }

    public final void ac() {
        ae(true);
        am();
    }

    public final void ad(String str) {
        Z(str, -1, 1);
    }

    final void ae(boolean z) {
        ab abVar;
        ak(z);
        if (!this.g && (abVar = this.f) != null) {
            abVar.b = false;
            abVar.d();
            if (S(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f + " as part of execPendingActions for actions " + this.a);
            }
            this.f.j(false, false);
            this.a.add(0, this.f);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bq bqVar = ((C0000do) arrayList.get(i)).b;
                if (bqVar != null) {
                    bqVar.u = false;
                }
            }
            this.f = null;
        }
        while (true) {
            ArrayList arrayList2 = this.K;
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.a;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zH = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zH |= ((db) arrayList4.get(i2)).h(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.n.d.removeCallbacks(this.N);
                    if (!zH) {
                        break;
                    }
                    this.z = true;
                    try {
                        an(this.K, this.L);
                    } finally {
                        ai();
                    }
                } catch (Throwable th) {
                    this.a.clear();
                    this.n.d.removeCallbacks(this.N);
                    throw th;
                }
            }
        }
        N();
        aj();
        this.b.k();
    }

    final Bundle b() {
        int i;
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        am();
        B();
        ae(true);
        this.v = true;
        this.y.g = true;
        dn dnVar = this.b;
        HashMap map = dnVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dm dmVar = (dm) it.next();
            if (dmVar != null) {
                bq bqVar = dmVar.b;
                String str = bqVar.m;
                Bundle bundle3 = new Bundle();
                if (bqVar.h == -1 && (bundle = bqVar.i) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new FragmentState(bqVar));
                if (bqVar.h > 0) {
                    Bundle bundle4 = new Bundle();
                    bqVar.g(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    dmVar.a.j(bqVar, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    bqVar.ae.b.d(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleB = bqVar.E.b();
                    if (!bundleB.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleB);
                    }
                    if (bqVar.R != null) {
                        dmVar.f();
                    }
                    SparseArray<? extends Parcelable> sparseArray = bqVar.j;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = bqVar.k;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = bqVar.n;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                dnVar.a(str, bundle3);
                arrayList2.add(bqVar.m);
                if (S(2)) {
                    Log.v("FragmentManager", "Saved state of " + bqVar + ": " + bqVar.i);
                }
            }
        }
        HashMap map2 = dnVar.c;
        if (!map2.isEmpty()) {
            ArrayList arrayList3 = dnVar.a;
            synchronized (arrayList3) {
                backStackRecordStateArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        bq bqVar2 = (bq) it2.next();
                        arrayList.add(bqVar2.m);
                        if (S(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + bqVar2.m + "): " + bqVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((ab) this.c.get(i));
                    if (S(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.c.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.i.get();
            bq bqVar3 = this.q;
            if (bqVar3 != null) {
                fragmentManagerState.e = bqVar3.m;
            }
            ArrayList arrayList4 = fragmentManagerState.f;
            Map map3 = this.B;
            arrayList4.addAll(map3.keySet());
            fragmentManagerState.g.addAll(map3.values());
            fragmentManagerState.h = new ArrayList(this.t);
            bundle2.putParcelable("state", fragmentManagerState);
            Map map4 = this.C;
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

    public final cd e() {
        bq bqVar = this.p;
        return bqVar != null ? bqVar.C.e() : this.H;
    }

    final dm f(bq bqVar) {
        String str = bqVar.Y;
        if (str != null) {
            asx.d(bqVar, str);
        }
        if (S(2)) {
            Objects.toString(bqVar);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(bqVar)));
        }
        dm dmVarG = g(bqVar);
        bqVar.C = this;
        dn dnVar = this.b;
        dnVar.l(dmVarG);
        if (!bqVar.K) {
            dnVar.j(bqVar);
            bqVar.t = false;
            if (bqVar.R == null) {
                bqVar.V = false;
            }
            if (T(bqVar)) {
                this.u = true;
            }
        }
        return dmVarG;
    }

    final dm g(bq bqVar) {
        dn dnVar = this.b;
        dm dmVarF = dnVar.f(bqVar.m);
        if (dmVarF != null) {
            return dmVarF;
        }
        dm dmVar = new dm(this.k, dnVar, bqVar);
        dmVar.e(this.n.c.getClassLoader());
        dmVar.c = this.m;
        return dmVar;
    }

    final Set h(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((ab) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                bq bqVar = ((C0000do) arrayList2.get(i3)).b;
                if (bqVar != null && (viewGroup = bqVar.Q) != null) {
                    hashSet.add(eo.a.a(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    final Set i(ab abVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = abVar.d;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            bq bqVar = ((C0000do) arrayList.get(i)).b;
            if (bqVar != null && abVar.j) {
                hashSet.add(bqVar);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void j(ce ceVar, ca caVar, bq bqVar) {
        if (this.n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.n = ceVar;
        this.o = caVar;
        this.p = bqVar;
        if (bqVar != null) {
            this.l.add(new cv());
        } else if (ceVar instanceof dj) {
            this.l.add((dj) ceVar);
        }
        if (this.p != null) {
            N();
        }
        if (ceVar instanceof uj) {
            uj ujVar = (uj) ceVar;
            ui uiVarDc = ujVar.dc();
            this.e = uiVarDc;
            bcl bclVar = ujVar;
            if (bqVar != null) {
                bclVar = bqVar;
            }
            uiVarDc.b(bclVar, this.h);
        }
        if (bqVar != null) {
            di diVar = bqVar.C.y;
            HashMap map = diVar.c;
            di diVar2 = (di) map.get(bqVar.m);
            if (diVar2 == null) {
                diVar2 = new di(diVar.e);
                map.put(bqVar.m, diVar2);
            }
            this.y = diVar2;
        } else {
            bqVar = null;
            if (ceVar instanceof bem) {
                bek bekVar = new bek(((bem) ceVar).el(), di.a);
                agwj agwjVar = agwi.a;
                this.y = (di) bekVar.a(new agvq(di.class));
            } else {
                this.y = new di(false);
            }
        }
        di diVar3 = this.y;
        diVar3.g = X();
        this.b.d = diVar3;
        Object obj = this.n;
        if ((obj instanceof bqs) && bqVar == null) {
            bqo bqoVarEn = ((bqs) obj).en();
            bqoVarEn.a("android:support:fragments", new bqn() { // from class: cj
                @Override // defpackage.bqn
                public final Bundle a() {
                    return this.a.b();
                }
            });
            Bundle bundleA = bqoVarEn.a.a("android:support:fragments");
            if (bundleA != null) {
                I(bundleA);
            }
        }
        Object obj2 = this.n;
        if (obj2 instanceof uy) {
            ux uxVarDe = ((uy) obj2).de();
            String strConcat = bqVar != null ? String.valueOf(bqVar.m).concat(":") : "";
            vd vdVar = new vd();
            cw cwVar = new cw(this);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.r = uxVarDe.b(strConcat2.concat("StartActivityForResult"), vdVar, cwVar);
            this.I = uxVarDe.b(strConcat2.concat("StartIntentSenderForResult"), new cz(), new cx(this));
            this.s = uxVarDe.b(strConcat2.concat("RequestPermissions"), new vc(), new cp(this));
        }
        Object obj3 = this.n;
        if (obj3 instanceof abu) {
            ((abu) obj3).dg(this.D);
        }
        Object obj4 = this.n;
        if (obj4 instanceof abv) {
            ((abv) obj4).dj(this.E);
        }
        Object obj5 = this.n;
        if (obj5 instanceof ec) {
            ((ec) obj5).dh(this.F);
        }
        Object obj6 = this.n;
        if (obj6 instanceof ed) {
            ((ed) obj6).di(this.G);
        }
        Object obj7 = this.n;
        if ((obj7 instanceof agc) && bqVar == null) {
            ((agc) obj7).dr(this.O);
        }
    }

    final void k(bq bqVar) {
        if (S(2)) {
            Objects.toString(bqVar);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(bqVar)));
        }
        if (bqVar.K) {
            bqVar.K = false;
            if (bqVar.s) {
                return;
            }
            this.b.j(bqVar);
            if (S(2)) {
                Objects.toString(bqVar);
                Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(bqVar)));
            }
            if (T(bqVar)) {
                this.u = true;
            }
        }
    }

    final void l(bq bqVar) {
        if (S(2)) {
            Objects.toString(bqVar);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(bqVar)));
        }
        if (bqVar.K) {
            return;
        }
        bqVar.K = true;
        if (bqVar.s) {
            if (S(2)) {
                Objects.toString(bqVar);
                Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(bqVar)));
            }
            this.b.n(bqVar);
            if (T(bqVar)) {
                this.u = true;
            }
            ao(bqVar);
        }
    }

    final void m() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        y(4);
    }

    public final void n(Configuration configuration, boolean z) {
        if (z && (this.n instanceof abu)) {
            aq(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (bq bqVar : this.b.i()) {
            if (bqVar != null) {
                bqVar.onConfigurationChanged(configuration);
                if (z) {
                    bqVar.E.n(configuration, true);
                }
            }
        }
    }

    public void noteStateNotSaved() {
        if (this.n == null) {
            return;
        }
        this.v = false;
        this.w = false;
        this.y.g = false;
        for (bq bqVar : this.b.i()) {
            if (bqVar != null) {
                bqVar.E.noteStateNotSaved();
            }
        }
    }

    final void o() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        y(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void p() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.p():void");
    }

    final void q(boolean z) {
        if (z && (this.n instanceof abv)) {
            aq(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (bq bqVar : this.b.i()) {
            if (bqVar != null) {
                bqVar.onLowMemory();
                if (z) {
                    bqVar.E.q(true);
                }
            }
        }
    }

    final void r(boolean z, boolean z2) {
        if (z2 && (this.n instanceof ec)) {
            aq(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (bq bqVar : this.b.i()) {
            if (bqVar != null && z2) {
                bqVar.E.r(z, true);
            }
        }
    }

    final void s() {
        for (bq bqVar : this.b.h()) {
            if (bqVar != null) {
                bqVar.E.s();
            }
        }
    }

    public final void t(Menu menu) {
        if (this.m <= 0) {
            return;
        }
        for (bq bqVar : this.b.i()) {
            if (bqVar != null && !bqVar.J) {
                bqVar.E.t(menu);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bq bqVar = this.p;
        if (bqVar != null) {
            sb.append(bqVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.p)));
            sb.append("}");
        } else {
            ce ceVar = this.n;
            if (ceVar != null) {
                sb.append(ceVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(bq bqVar) {
        if (bqVar == null || !bqVar.equals(this.b.b(bqVar.m))) {
            return;
        }
        boolean zW = bqVar.C.W(bqVar);
        Boolean bool = bqVar.r;
        if (bool == null || bool.booleanValue() != zW) {
            bqVar.r = Boolean.valueOf(zW);
            de deVar = bqVar.E;
            deVar.N();
            deVar.u(deVar.q);
        }
    }

    final void v(boolean z, boolean z2) {
        if (z2 && (this.n instanceof ed)) {
            aq(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (bq bqVar : this.b.i()) {
            if (bqVar != null && z2) {
                bqVar.E.v(z, true);
            }
        }
    }

    final void w() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        y(7);
    }

    final void x() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        y(5);
    }

    public final void y(int i) {
        try {
            this.z = true;
            for (dm dmVar : this.b.b.values()) {
                if (dmVar != null) {
                    dmVar.c = i;
                }
            }
            F(i, false);
            Iterator it = ag().iterator();
            while (it.hasNext()) {
                ((eo) it.next()).f();
            }
            this.z = false;
            ae(true);
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    final void z() {
        this.w = true;
        this.y.g = true;
        y(4);
    }
}
