package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cr {
    public static boolean a = false;
    public final bhi A;
    private boolean B;
    private ArrayList C;
    private final cuh F;
    private final cuh G;
    private final cuh H;
    private final cuh I;
    private final cvk J;
    private final cc K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private final Runnable P;
    private final d Q;
    public fx e;
    final ArrayList j;
    public final CopyOnWriteArrayList k;
    int l;
    public cd m;
    public ca n;
    public bv o;
    bv p;
    public gp q;
    public gp r;
    public gp s;
    ArrayDeque t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ct y;
    public final ArrayList b = new ArrayList();
    public final ajs z = new ajs((char[]) null);
    ArrayList c = new ArrayList();
    public final ce d = new ce(this);
    at f = null;
    boolean g = false;
    public final fv h = new cg(this);
    public final AtomicInteger i = new AtomicInteger();
    private final Map D = DesugarCollections.synchronizedMap(new HashMap());
    private final Map E = DesugarCollections.synchronizedMap(new HashMap());

    public cr() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.j = new ArrayList();
        this.A = new bhi(this);
        this.k = new CopyOnWriteArrayList();
        this.F = new bw(this, 2);
        this.G = new bw(this, 3);
        this.H = new bw(this, 4);
        this.I = new bw(this, 5);
        this.J = new ch(this);
        this.l = -1;
        this.K = new ci(this);
        this.Q = new d();
        this.t = new ArrayDeque();
        this.P = new bf(this, 9, null);
    }

    public static boolean Y(int i) {
        return a || Log.isLoggable("FragmentManager", i);
    }

    private final void aA(bv bvVar) {
        ViewGroup viewGroupAr = ar(bvVar);
        if (viewGroupAr == null || bvVar.getEnterAnim() + bvVar.getExitAnim() + bvVar.getPopEnterAnim() + bvVar.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupAr.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAr.setTag(R.id.visible_removing_fragment_view_tag, bvVar);
        }
        ((bv) viewGroupAr.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(bvVar.getPopDirection());
    }

    private final void aB() {
        Iterator it = this.z.d().iterator();
        while (it.hasNext()) {
            ao((nxo) it.next());
        }
    }

    static final Set ag(at atVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = atVar.d;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            bv bvVar = ((cx) arrayList.get(i)).b;
            if (bvVar != null && atVar.j) {
                hashSet.add(bvVar);
            }
            i++;
        }
    }

    public static final boolean ah(bv bvVar) {
        if (bvVar.mHasMenu && bvVar.mMenuVisible) {
            return true;
        }
        boolean zAh = false;
        for (bv bvVar2 : bvVar.mChildFragmentManager.z.e()) {
            if (bvVar2 != null) {
                zAh = ah(bvVar2);
            }
            if (zAh) {
                return true;
            }
        }
        return false;
    }

    static final boolean ai(bv bvVar) {
        if (bvVar == null) {
            return true;
        }
        return bvVar.isMenuVisible();
    }

    static final void aj(bv bvVar) {
        if (Y(2)) {
            Objects.toString(bvVar);
        }
        if (bvVar.mHidden) {
            bvVar.mHidden = false;
            bvVar.mHiddenChanged = !bvVar.mHiddenChanged;
        }
    }

    private final ViewGroup ar(bv bvVar) {
        ViewGroup viewGroup = bvVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bvVar.mContainerId <= 0 || !this.n.b()) {
            return null;
        }
        View viewA = this.n.a(bvVar.mContainerId);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    private final Set as() {
        HashSet hashSet = new HashSet();
        Iterator it = this.z.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((bv) ((nxo) it.next()).d).mContainer;
            if (viewGroup != null) {
                hashSet.add(a.bD(viewGroup, al()));
            }
        }
        return hashSet;
    }

    private final void at() {
        if (ab()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void au() {
        this.B = false;
        this.N.clear();
        this.M.clear();
    }

    private final void av() {
        if (this.L) {
            this.L = false;
            aB();
        }
    }

    private final void aw(boolean z) {
        if (this.B) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.m == null) {
            if (!this.x) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.m.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            at();
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0222 A[PHI: r14
  0x0222: PHI (r14v16 int) = (r14v15 int), (r14v17 int) binds: [B:99:0x0212, B:104:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ax(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr.ax(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void ay() {
        for (dp dpVar : as()) {
            if (dpVar.e) {
                dpVar.e = false;
                dpVar.f();
            }
        }
    }

    private final void az(ArrayList arrayList, ArrayList arrayList2) {
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
            if (!((at) arrayList.get(i)).s) {
                if (i2 != i) {
                    ax(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((at) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                ax(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            ax(arrayList, arrayList2, i2, size);
        }
    }

    public static bv d(View view) {
        bv bvVarG = g(view);
        if (bvVarG != null) {
            return bvVarG;
        }
        throw new IllegalStateException(a.cj(view, "View ", " does not have a Fragment set"));
    }

    public static bv g(View view) {
        while (view != null) {
            bv bvVarH = h(view);
            if (bvVarH != null) {
                return bvVarH;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static bv h(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof bv) {
            return (bv) tag;
        }
        return null;
    }

    final void A(boolean z, boolean z2) {
        if (z2 && (this.m instanceof dl)) {
            S(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null) {
                bvVar.performPictureInPictureModeChanged(z);
                if (z2) {
                    bvVar.mChildFragmentManager.A(z, true);
                }
            }
        }
    }

    final void B() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        D(7);
    }

    final void C() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        D(5);
    }

    public final void D(int i) {
        try {
            this.B = true;
            for (nxo nxoVar : ((HashMap) this.z.c).values()) {
                if (nxoVar != null) {
                    nxoVar.a = i;
                }
            }
            K(i, false);
            Iterator it = as().iterator();
            while (it.hasNext()) {
                ((dp) it.next()).g();
            }
            this.B = false;
            ak(true);
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    final void E() {
        this.w = true;
        this.y.g = true;
        D(4);
    }

    public final void F(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        ajs ajsVar = this.z;
        HashMap map = (HashMap) ajsVar.c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (nxo nxoVar : map.values()) {
                printWriter.print(str);
                if (nxoVar != null) {
                    String strValueOf = String.valueOf(str);
                    Object obj = nxoVar.d;
                    printWriter.println(obj);
                    ((bv) obj).dump(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) ajsVar.b;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                bv bvVar = (bv) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(bvVar.toString());
            }
        }
        ArrayList arrayList2 = this.C;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                bv bvVar2 = (bv) this.C.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(bvVar2.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                at atVar = (at) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(atVar.toString());
                atVar.h(strValueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        ArrayList arrayList3 = this.b;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    co coVar = (co) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(coVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
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

    public final void G() {
        Iterator it = as().iterator();
        while (it.hasNext()) {
            ((dp) it.next()).g();
        }
    }

    final void H(co coVar, boolean z) {
        if (!z) {
            if (this.m == null) {
                if (!this.x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            at();
        }
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (this.m == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(coVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    this.m.d.removeCallbacks(this.P);
                    this.m.d.post(this.P);
                    T();
                }
            }
        }
    }

    final void I(co coVar, boolean z) {
        if (z && (this.m == null || this.x)) {
            return;
        }
        aw(z);
        at atVar = this.f;
        if (atVar != null) {
            atVar.b = false;
            atVar.d();
            if (Y(3)) {
                Objects.toString(this.f);
                Objects.toString(coVar);
            }
            this.f.b(false, false);
            this.f.j(this.M, this.N);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bv bvVar = ((cx) arrayList.get(i)).b;
                if (bvVar != null) {
                    bvVar.mTransitioning = false;
                }
            }
            this.f = null;
        }
        coVar.j(this.M, this.N);
        this.B = true;
        try {
            az(this.M, this.N);
            au();
            T();
            av();
            this.z.h();
        } catch (Throwable th) {
            au();
            throw th;
        }
    }

    final void J(bv bvVar) {
        if (Y(2)) {
            Objects.toString(bvVar);
        }
        if (bvVar.mHidden) {
            return;
        }
        bvVar.mHidden = true;
        bvVar.mHiddenChanged = true ^ bvVar.mHiddenChanged;
        aA(bvVar);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final void K(int i, boolean z) {
        cd cdVar;
        if (this.m == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.l) {
            this.l = i;
            ajs ajsVar = this.z;
            ?? r7 = ajsVar.b;
            int size = r7.size();
            for (int i2 = 0; i2 < size; i2++) {
                nxo nxoVar = (nxo) ((HashMap) ajsVar.c).get(((bv) r7.get(i2)).mWho);
                if (nxoVar != null) {
                    nxoVar.i();
                }
            }
            for (nxo nxoVar2 : ((HashMap) ajsVar.c).values()) {
                if (nxoVar2 != null) {
                    nxoVar2.i();
                    bv bvVar = (bv) nxoVar2.d;
                    if (bvVar.mRemoving && !bvVar.isInBackStack()) {
                        if (bvVar.mBeingSaved) {
                            if (!((HashMap) ajsVar.a).containsKey(bvVar.mWho)) {
                                ajsVar.a(bvVar.mWho, nxoVar2.e());
                            }
                        }
                        ajsVar.t(nxoVar2);
                    }
                }
            }
            aB();
            if (this.u && (cdVar = this.m) != null && this.l == 7) {
                cdVar.e();
                this.u = false;
            }
        }
    }

    final void L() {
        if (this.m == null) {
            return;
        }
        this.v = false;
        this.w = false;
        this.y.g = false;
        for (bv bvVar : this.z.f()) {
            if (bvVar != null) {
                bvVar.noteStateNotSaved();
            }
        }
    }

    public final void M() {
        H(new cp(this, -1, 0), false);
    }

    final void N(bv bvVar) {
        if (Y(2)) {
            Objects.toString(bvVar);
            int i = bvVar.mBackStackNesting;
        }
        boolean zIsInBackStack = bvVar.isInBackStack();
        if (bvVar.mDetached && zIsInBackStack) {
            return;
        }
        this.z.i(bvVar);
        if (ah(bvVar)) {
            this.u = true;
        }
        bvVar.mRemoving = true;
        aA(bvVar);
    }

    final void O(Parcelable parcelable) {
        nxo nxoVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.m.c.getClassLoader());
                this.E.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.m.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        ajs ajsVar = this.z;
        HashMap map2 = (HashMap) ajsVar.a;
        map2.clear();
        map2.putAll(map);
        cs csVar = (cs) bundle3.getParcelable("state");
        if (csVar == null) {
            return;
        }
        ((HashMap) ajsVar.c).clear();
        ArrayList arrayList = csVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundleA = ajsVar.a((String) arrayList.get(i), null);
            if (bundleA != null) {
                bv bvVar = (bv) this.y.b.get(((cw) bundleA.getParcelable("state")).b);
                if (bvVar != null) {
                    if (Y(2)) {
                        Objects.toString(bvVar);
                    }
                    nxoVar = new nxo(this.A, ajsVar, bvVar, bundleA);
                } else {
                    nxoVar = new nxo(this.A, ajsVar, this.m.c.getClassLoader(), i(), bundleA);
                }
                Object obj = nxoVar.d;
                bv bvVar2 = (bv) obj;
                bvVar2.mSavedFragmentState = bundleA;
                bvVar2.mFragmentManager = this;
                if (Y(2)) {
                    String str3 = bvVar2.mWho;
                    Objects.toString(obj);
                }
                nxoVar.j(this.m.c.getClassLoader());
                ajsVar.s(nxoVar);
                nxoVar.a = this.l;
            }
        }
        for (bv bvVar3 : new ArrayList(this.y.b.values())) {
            if (!ajsVar.j(bvVar3.mWho)) {
                if (Y(2)) {
                    Objects.toString(bvVar3);
                    Objects.toString(csVar.a);
                }
                this.y.e(bvVar3);
                bvVar3.mFragmentManager = this;
                nxo nxoVar2 = new nxo(this.A, ajsVar, bvVar3);
                nxoVar2.a = 1;
                nxoVar2.i();
                bvVar3.mRemoving = true;
                nxoVar2.i();
            }
        }
        ArrayList<String> arrayList2 = csVar.b;
        ((ArrayList) ajsVar.b).clear();
        if (arrayList2 != null) {
            for (String str4 : arrayList2) {
                bv bvVarB = ajsVar.b(str4);
                if (bvVarB == null) {
                    throw new IllegalStateException(a.cg(str4, "No instantiated fragment for (", ")"));
                }
                if (Y(2)) {
                    Objects.toString(bvVarB);
                }
                ajsVar.g(bvVarB);
            }
        }
        au[] auVarArr = csVar.c;
        if (auVarArr != null) {
            this.c = new ArrayList(auVarArr.length);
            int i2 = 0;
            while (true) {
                au[] auVarArr2 = csVar.c;
                if (i2 >= auVarArr2.length) {
                    break;
                }
                au auVar = auVarArr2[i2];
                at atVar = new at(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = auVar.a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    cx cxVar = new cx();
                    int i5 = i3 + 1;
                    cxVar.a = iArr[i3];
                    if (Y(2)) {
                        atVar.toString();
                        int i6 = iArr[i5];
                    }
                    cxVar.h = dvd.values()[auVar.c[i4]];
                    cxVar.i = dvd.values()[auVar.d[i4]];
                    int i7 = i3 + 2;
                    cxVar.c = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    cxVar.d = i8;
                    int i9 = iArr[i3 + 3];
                    cxVar.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    cxVar.f = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    cxVar.g = i12;
                    atVar.e = i8;
                    atVar.f = i9;
                    atVar.g = i11;
                    atVar.h = i12;
                    atVar.o(cxVar);
                    i4++;
                }
                atVar.i = auVar.e;
                atVar.l = auVar.f;
                atVar.j = true;
                atVar.m = auVar.h;
                atVar.n = auVar.i;
                atVar.o = auVar.j;
                atVar.p = auVar.k;
                atVar.q = auVar.l;
                atVar.r = auVar.m;
                atVar.s = auVar.n;
                atVar.c = auVar.g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = auVar.b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str5 = (String) arrayList3.get(i13);
                    if (str5 != null) {
                        ((cx) atVar.d.get(i13)).b = c(str5);
                    }
                    i13++;
                }
                atVar.c(1);
                if (Y(2)) {
                    int i14 = atVar.c;
                    atVar.toString();
                    PrintWriter printWriter = new PrintWriter(new dj());
                    atVar.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.c.add(atVar);
                i2++;
            }
        } else {
            this.c = new ArrayList();
        }
        this.i.set(csVar.d);
        String str6 = csVar.e;
        if (str6 != null) {
            bv bvVarC = c(str6);
            this.p = bvVarC;
            y(bvVarC);
        }
        ArrayList arrayList4 = csVar.f;
        if (arrayList4 != null) {
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                this.D.put((String) arrayList4.get(i15), (aw) csVar.g.get(i15));
            }
        }
        this.t = new ArrayDeque(csVar.h);
    }

    final void P(bv bvVar, boolean z) {
        ViewGroup viewGroupAr = ar(bvVar);
        if (viewGroupAr == null || !(viewGroupAr instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupAr).a = !z;
    }

    final void Q(bv bvVar, dvd dvdVar) {
        if (!bvVar.equals(c(bvVar.mWho)) || (bvVar.mHost != null && bvVar.mFragmentManager != this)) {
            throw new IllegalArgumentException(a.ck(this, bvVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        bvVar.mMaxState = dvdVar;
    }

    final void R(bv bvVar) {
        if (bvVar != null && (!bvVar.equals(c(bvVar.mWho)) || (bvVar.mHost != null && bvVar.mFragmentManager != this))) {
            throw new IllegalArgumentException(a.ck(this, bvVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        bv bvVar2 = this.p;
        this.p = bvVar;
        y(bvVar2);
        y(this.p);
    }

    public final void S(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new dj());
        cd cdVar = this.m;
        if (cdVar != null) {
            try {
                cdVar.h(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            F("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void T() {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.h.g(true);
                if (Y(3)) {
                    toString();
                }
            } else {
                boolean z = a() > 0 && aa(this.o);
                if (Y(3)) {
                    toString();
                }
                this.h.g(z);
            }
        }
    }

    final boolean U(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null && bvVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean V(Menu menu, MenuInflater menuInflater) {
        if (this.l <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (bv bvVar : this.z.f()) {
            if (bvVar != null && ai(bvVar) && bvVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bvVar);
                z = true;
            }
        }
        if (this.C != null) {
            for (int i = 0; i < this.C.size(); i++) {
                bv bvVar2 = (bv) this.C.get(i);
                if (arrayList == null || !arrayList.contains(bvVar2)) {
                    bvVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.C = arrayList;
        return z;
    }

    final boolean W(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null && bvVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean X(Menu menu) {
        boolean z = false;
        if (this.l <= 0) {
            return false;
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null && ai(bvVar) && bvVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean Z() {
        bv bvVar = this.o;
        if (bvVar == null) {
            return true;
        }
        return bvVar.isAdded() && bvVar.getParentFragmentManager().Z();
    }

    public final int a() {
        return this.c.size() + (this.f != null ? 1 : 0);
    }

    final boolean aa(bv bvVar) {
        if (bvVar == null) {
            return true;
        }
        cr crVar = bvVar.mFragmentManager;
        return bvVar.equals(crVar.p) && aa(crVar.o);
    }

    public final boolean ab() {
        return this.v || this.w;
    }

    public final boolean ac() {
        return ad(null, -1, 0);
    }

    public final boolean ad(String str, int i, int i2) {
        ak(false);
        aw(true);
        bv bvVar = this.p;
        if (bvVar != null && i < 0 && str == null && bvVar.getChildFragmentManager().ac()) {
            return true;
        }
        boolean zAe = ae(this.M, this.N, str, i, i2);
        if (zAe) {
            this.B = true;
            try {
                az(this.M, this.N);
            } finally {
                au();
            }
        }
        T();
        av();
        this.z.h();
        return zAe;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean ae(java.util.ArrayList r6, java.util.ArrayList r7, java.lang.String r8, int r9, int r10) {
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
            at r3 = (defpackage.at) r3
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
            at r10 = (defpackage.at) r10
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
            at r0 = (defpackage.at) r0
            r6.add(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L7e
        L96:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr.ae(java.util.ArrayList, java.util.ArrayList, java.lang.String, int, int):boolean");
    }

    public final void af() {
        ak(true);
        ay();
    }

    final void ak(boolean z) {
        at atVar;
        aw(z);
        if (!this.g && (atVar = this.f) != null) {
            atVar.b = false;
            atVar.d();
            if (Y(3)) {
                Objects.toString(this.f);
                Objects.toString(this.b);
            }
            this.f.b(false, false);
            this.b.add(0, this.f);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bv bvVar = ((cx) arrayList.get(i)).b;
                if (bvVar != null) {
                    bvVar.mTransitioning = false;
                }
            }
            this.f = null;
        }
        while (true) {
            ArrayList arrayList2 = this.M;
            ArrayList arrayList3 = this.N;
            ArrayList arrayList4 = this.b;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zJ = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zJ |= ((co) arrayList4.get(i2)).j(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.m.d.removeCallbacks(this.P);
                    if (!zJ) {
                        break;
                    }
                    this.B = true;
                    try {
                        az(this.M, this.N);
                    } finally {
                        au();
                    }
                } catch (Throwable th) {
                    this.b.clear();
                    this.m.d.removeCallbacks(this.P);
                    throw th;
                }
            }
        }
        T();
        av();
        this.z.h();
    }

    final d al() {
        bv bvVar = this.o;
        return bvVar != null ? bvVar.mFragmentManager.al() : this.Q;
    }

    final nxo am(bv bvVar) {
        String str = bvVar.mPreviousWho;
        if (str != null) {
            dia.a(bvVar, str);
        }
        if (Y(2)) {
            Objects.toString(bvVar);
        }
        nxo nxoVarAn = an(bvVar);
        bvVar.mFragmentManager = this;
        ajs ajsVar = this.z;
        ajsVar.s(nxoVarAn);
        if (!bvVar.mDetached) {
            ajsVar.g(bvVar);
            bvVar.mRemoving = false;
            if (bvVar.mView == null) {
                bvVar.mHiddenChanged = false;
            }
            if (ah(bvVar)) {
                this.u = true;
            }
        }
        return nxoVarAn;
    }

    final nxo an(bv bvVar) {
        ajs ajsVar = this.z;
        nxo nxoVarR = ajsVar.r(bvVar.mWho);
        if (nxoVarR != null) {
            return nxoVarR;
        }
        nxo nxoVar = new nxo(this.A, ajsVar, bvVar);
        nxoVar.j(this.m.c.getClassLoader());
        nxoVar.a = this.l;
        return nxoVar;
    }

    final void ao(nxo nxoVar) {
        bv bvVar = (bv) nxoVar.d;
        if (bvVar.mDeferStart) {
            if (this.B) {
                this.L = true;
            } else {
                bvVar.mDeferStart = false;
                nxoVar.i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        ((java.util.concurrent.CopyOnWriteArrayList) r0).remove(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ap(defpackage.a r5) {
        /*
            r4 = this;
            bhi r0 = r4.A
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            r1 = r0
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1     // Catch: java.lang.Throwable -> L28
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L28
            r2 = 0
        Ld:
            if (r2 >= r1) goto L26
            r3 = r0
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L28
            cb r3 = (defpackage.cb) r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> L28
            if (r3 != r5) goto L23
            r5 = r0
            java.util.concurrent.CopyOnWriteArrayList r5 = (java.util.concurrent.CopyOnWriteArrayList) r5     // Catch: java.lang.Throwable -> L28
            r5.remove(r2)     // Catch: java.lang.Throwable -> L28
            goto L26
        L23:
            int r2 = r2 + 1
            goto Ld
        L26:
            monitor-exit(r0)
            return
        L28:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr.ap(a):void");
    }

    public final void aq(a aVar) {
        ((CopyOnWriteArrayList) this.A.a).add(new cb(aVar, (byte[]) null));
    }

    public final Bundle b() {
        au[] auVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        ay();
        G();
        ak(true);
        this.v = true;
        this.y.g = true;
        ajs ajsVar = this.z;
        HashMap map = (HashMap) ajsVar.c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (nxo nxoVar : map.values()) {
            if (nxoVar != null) {
                Object obj = nxoVar.d;
                bv bvVar = (bv) obj;
                ajsVar.a(bvVar.mWho, nxoVar.e());
                arrayList2.add(bvVar.mWho);
                if (Y(2)) {
                    Objects.toString(obj);
                    Objects.toString(bvVar.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = (HashMap) ajsVar.a;
        if (!map2.isEmpty()) {
            Object obj2 = ajsVar.b;
            synchronized (obj2) {
                auVarArr = null;
                if (((ArrayList) obj2).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) obj2).size());
                    Iterator it = ((ArrayList) obj2).iterator();
                    while (it.hasNext()) {
                        bv bvVar2 = (bv) it.next();
                        arrayList.add(bvVar2.mWho);
                        if (Y(2)) {
                            String str = bvVar2.mWho;
                            Objects.toString(bvVar2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                auVarArr = new au[size];
                for (int i = 0; i < size; i++) {
                    auVarArr[i] = new au((at) this.c.get(i));
                    if (Y(2)) {
                        Objects.toString(this.c.get(i));
                    }
                }
            }
            cs csVar = new cs();
            csVar.a = arrayList2;
            csVar.b = arrayList;
            csVar.c = auVarArr;
            csVar.d = this.i.get();
            bv bvVar3 = this.p;
            if (bvVar3 != null) {
                csVar.e = bvVar3.mWho;
            }
            ArrayList arrayList3 = csVar.f;
            Map map3 = this.D;
            arrayList3.addAll(map3.keySet());
            csVar.g.addAll(map3.values());
            csVar.h = new ArrayList(this.t);
            bundle.putParcelable("state", csVar);
            Map map4 = this.E;
            for (String str2 : map4.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str2)), (Bundle) map4.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str3)), (Bundle) map2.get(str3));
            }
        }
        return bundle;
    }

    public final bv c(String str) {
        return this.z.b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [bv] */
    public final bv e(int i) {
        ?? r3;
        ajs ajsVar = this.z;
        ArrayList arrayList = (ArrayList) ajsVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                Iterator it = ((HashMap) ajsVar.c).values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r3 = 0;
                        break;
                    }
                    nxo nxoVar = (nxo) it.next();
                    if (nxoVar != null) {
                        r3 = nxoVar.d;
                        if (((bv) r3).mFragmentId == i) {
                            break;
                        }
                    }
                }
            } else {
                r3 = (bv) arrayList.get(size);
                if (r3 != 0 && r3.mFragmentId == i) {
                    break;
                }
            }
        }
        return (bv) r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bv f(String str) {
        bv bvVar;
        ajs ajsVar = this.z;
        if (str != null) {
            ArrayList arrayList = (ArrayList) ajsVar.b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                bvVar = (bv) arrayList.get(size);
                if (bvVar != null && str.equals(bvVar.mTag)) {
                    break;
                }
            }
        } else {
            bvVar = null;
            if (str != null) {
                Iterator it = ((HashMap) ajsVar.c).values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    nxo nxoVar = (nxo) it.next();
                    if (nxoVar != null) {
                        Object obj = nxoVar.d;
                        if (str.equals(((bv) obj).mTag)) {
                            bvVar = obj;
                            break;
                        }
                    }
                }
            }
        }
        return bvVar;
    }

    public final cc i() {
        bv bvVar = this.o;
        return bvVar != null ? bvVar.mFragmentManager.i() : this.K;
    }

    public final List j() {
        return this.z.f();
    }

    final Set k(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((at) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                bv bvVar = ((cx) arrayList2.get(i3)).b;
                if (bvVar != null && (viewGroup = bvVar.mContainer) != null) {
                    hashSet.add(dp.c(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void l(cu cuVar) {
        this.k.add(cuVar);
    }

    public final void m(cn cnVar) {
        this.j.add(cnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void n(cd cdVar, ca caVar, bv bvVar) {
        if (this.m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.m = cdVar;
        this.n = caVar;
        this.o = bvVar;
        if (bvVar != null) {
            l(new cj(bvVar));
        } else if (cdVar instanceof cu) {
            l((cu) cdVar);
        }
        if (this.o != null) {
            T();
        }
        if (cdVar instanceof fz) {
            fz fzVar = (fz) cdVar;
            fx onBackPressedDispatcher = fzVar.getOnBackPressedDispatcher();
            this.e = onBackPressedDispatcher;
            dvk dvkVar = fzVar;
            if (bvVar != null) {
                dvkVar = bvVar;
            }
            onBackPressedDispatcher.b(dvkVar, this.h);
        }
        int i = 0;
        if (bvVar != null) {
            ct ctVar = bvVar.mFragmentManager.y;
            HashMap map = ctVar.c;
            ct ctVar2 = (ct) map.get(bvVar.mWho);
            if (ctVar2 == null) {
                ctVar2 = new ct(ctVar.e);
                map.put(bvVar.mWho, ctVar2);
            }
            this.y = ctVar2;
        } else {
            if (cdVar instanceof dxd) {
                this.y = (ct) new dxa(((dxd) cdVar).getViewModelStore(), ct.a).a(ct.class);
            } else {
                this.y = new ct(false);
            }
            bvVar = null;
        }
        ct ctVar3 = this.y;
        ctVar3.g = ab();
        this.z.d = ctVar3;
        Object obj = this.m;
        if ((obj instanceof ghe) && bvVar == null) {
            ghc savedStateRegistry = ((ghe) obj).getSavedStateRegistry();
            savedStateRegistry.b("android:support:fragments", new cf(this, i));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                O(bundleA);
            }
        }
        Object obj2 = this.m;
        if (obj2 instanceof gu) {
            gt activityResultRegistry = ((gu) obj2).getActivityResultRegistry();
            String strConcat = bvVar != null ? String.valueOf(bvVar.mWho).concat(":") : "";
            ha haVar = new ha();
            ck ckVar = new ck(this, 0);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.q = activityResultRegistry.a(strConcat2.concat("StartActivityForResult"), haVar, ckVar);
            this.r = activityResultRegistry.a(strConcat2.concat("StartIntentSenderForResult"), new cl(), new ck(this, 2));
            this.s = activityResultRegistry.a(strConcat2.concat("RequestPermissions"), new gy(), new ck(this, 1));
        }
        Object obj3 = this.m;
        if (obj3 instanceof csb) {
            ((csb) obj3).addOnConfigurationChangedListener(this.F);
        }
        Object obj4 = this.m;
        if (obj4 instanceof csc) {
            ((csc) obj4).addOnTrimMemoryListener(this.G);
        }
        Object obj5 = this.m;
        if (obj5 instanceof dk) {
            ((dk) obj5).addOnMultiWindowModeChangedListener(this.H);
        }
        Object obj6 = this.m;
        if (obj6 instanceof dl) {
            ((dl) obj6).addOnPictureInPictureModeChangedListener(this.I);
        }
        Object obj7 = this.m;
        if ((obj7 instanceof cve) && bvVar == null) {
            ((cve) obj7).addMenuProvider(this.J);
        }
    }

    final void o(bv bvVar) {
        if (Y(2)) {
            Objects.toString(bvVar);
        }
        if (bvVar.mDetached) {
            bvVar.mDetached = false;
            if (bvVar.mAdded) {
                return;
            }
            this.z.g(bvVar);
            if (Y(2)) {
                Objects.toString(bvVar);
            }
            if (ah(bvVar)) {
                this.u = true;
            }
        }
    }

    final void p(bv bvVar) {
        if (Y(2)) {
            Objects.toString(bvVar);
        }
        if (bvVar.mDetached) {
            return;
        }
        bvVar.mDetached = true;
        if (bvVar.mAdded) {
            if (Y(2)) {
                Objects.toString(bvVar);
            }
            this.z.i(bvVar);
            if (ah(bvVar)) {
                this.u = true;
            }
            aA(bvVar);
        }
    }

    final void q() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        D(4);
    }

    final void r(Configuration configuration, boolean z) {
        if (z && (this.m instanceof csb)) {
            S(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null) {
                bvVar.performConfigurationChanged(configuration);
                if (z) {
                    bvVar.mChildFragmentManager.r(configuration, true);
                }
            }
        }
    }

    final void s() {
        this.v = false;
        this.w = false;
        this.y.g = false;
        D(1);
    }

    final void t() {
        this.x = true;
        ak(true);
        G();
        cd cdVar = this.m;
        if (cdVar instanceof dxd ? ((ct) this.z.d).f : true ^ ((Activity) cdVar.c).isChangingConfigurations()) {
            Iterator it = this.D.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((aw) it.next()).a.iterator();
                while (it2.hasNext()) {
                    ((ct) this.z.d).c((String) it2.next(), false);
                }
            }
        }
        D(-1);
        Object obj = this.m;
        if (obj instanceof csc) {
            ((csc) obj).removeOnTrimMemoryListener(this.G);
        }
        Object obj2 = this.m;
        if (obj2 instanceof csb) {
            ((csb) obj2).removeOnConfigurationChangedListener(this.F);
        }
        Object obj3 = this.m;
        if (obj3 instanceof dk) {
            ((dk) obj3).removeOnMultiWindowModeChangedListener(this.H);
        }
        Object obj4 = this.m;
        if (obj4 instanceof dl) {
            ((dl) obj4).removeOnPictureInPictureModeChangedListener(this.I);
        }
        Object obj5 = this.m;
        if ((obj5 instanceof cve) && this.o == null) {
            ((cve) obj5).removeMenuProvider(this.J);
        }
        this.m = null;
        this.n = null;
        this.o = null;
        if (this.e != null) {
            this.h.f();
            this.e = null;
        }
        gp gpVar = this.q;
        if (gpVar != null) {
            gpVar.a();
            this.r.a();
            this.s.a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bv bvVar = this.o;
        if (bvVar != null) {
            sb.append(bvVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.o)));
            sb.append("}");
        } else {
            cd cdVar = this.m;
            if (cdVar != null) {
                sb.append(cdVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.m)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    final void u(boolean z) {
        if (z && (this.m instanceof csc)) {
            S(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null) {
                bvVar.performLowMemory();
                if (z) {
                    bvVar.mChildFragmentManager.u(true);
                }
            }
        }
    }

    final void v(boolean z, boolean z2) {
        if (z2 && (this.m instanceof dk)) {
            S(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null) {
                bvVar.performMultiWindowModeChanged(z);
                if (z2) {
                    bvVar.mChildFragmentManager.v(z, true);
                }
            }
        }
    }

    public final void w() {
        for (bv bvVar : this.z.e()) {
            if (bvVar != null) {
                bvVar.onHiddenChanged(bvVar.isHidden());
                bvVar.mChildFragmentManager.w();
            }
        }
    }

    final void x(Menu menu) {
        if (this.l <= 0) {
            return;
        }
        for (bv bvVar : this.z.f()) {
            if (bvVar != null) {
                bvVar.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void y(bv bvVar) {
        if (bvVar == null || !bvVar.equals(c(bvVar.mWho))) {
            return;
        }
        bvVar.performPrimaryNavigationFragmentChanged();
    }

    final void z() {
        D(5);
    }
}
