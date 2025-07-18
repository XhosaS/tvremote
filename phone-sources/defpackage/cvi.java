package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvi {
    public final Object a;
    public final Object b;
    public final Object c;

    public cvi(Uri uri, dze dzeVar, String str) {
        this.c = uri;
        this.b = dzeVar;
        this.a = str;
    }

    public static final fzd K(fzd fzdVar, fzw fzwVar) {
        fzv fzvVar = fzdVar != null ? fzdVar.a : fzu.b;
        fzv fzvVar2 = fzwVar.b;
        return new fzd(S(fzvVar, fzvVar2, fzvVar2, null), S(fzdVar != null ? fzdVar.b : fzu.b, fzvVar2, fzwVar.c, null), S(fzdVar != null ? fzdVar.c : fzu.b, fzvVar2, fzwVar.d, null), fzwVar);
    }

    public static /* synthetic */ void N(fpe fpeVar) {
        if (fpeVar.F()) {
            return;
        }
        fph fphVar = fpeVar.a;
        fphVar.G(fphVar.b.q);
    }

    private final boolean R() {
        return gli.F("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new gem(this, 15));
    }

    private final void T(egl eglVar) {
        long j = eglVar.b;
        ezn eznVar = new ezn(j, eglVar.c + j);
        TreeSet treeSet = (TreeSet) this.b;
        ezn eznVar2 = (ezn) treeSet.floor(eznVar);
        ezn eznVar3 = (ezn) treeSet.ceiling(eznVar);
        boolean zU = U(eznVar2, eznVar);
        if (U(eznVar, eznVar3)) {
            if (zU) {
                eznVar2.b = eznVar3.b;
                eznVar2.c = eznVar3.c;
            } else {
                eznVar.b = eznVar3.b;
                eznVar.c = eznVar3.c;
                treeSet.add(eznVar);
            }
            treeSet.remove(eznVar3);
            return;
        }
        if (!zU) {
            int iBinarySearch = Arrays.binarySearch(((fdg) this.a).c, eznVar.b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            eznVar.c = iBinarySearch;
            treeSet.add(eznVar);
            return;
        }
        eznVar2.b = eznVar.b;
        int i = eznVar2.c;
        while (true) {
            fdg fdgVar = (fdg) this.a;
            if (i >= fdgVar.a - 1) {
                break;
            }
            int i2 = i + 1;
            if (fdgVar.c[i2] > eznVar2.b) {
                break;
            } else {
                i = i2;
            }
        }
        eznVar2.c = i;
    }

    private static final boolean U(ezn eznVar, ezn eznVar2) {
        return (eznVar == null || eznVar2 == null || eznVar.b != eznVar2.a) ? false : true;
    }

    public static cvi v(String str) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), String.valueOf((String) arrayList.get(arrayList2.size())).concat(String.valueOf(str.substring(length))));
                length = str.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), String.valueOf((String) arrayList.get(arrayList2.size())).concat(String.valueOf(str.substring(length, iIndexOf))));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), String.valueOf((String) arrayList.get(arrayList2.size())).concat("$"));
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = str.indexOf("$", i);
                String strSubstring2 = str.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = String.valueOf(strSubstring).concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    int iHashCode = strSubstring2.hashCode();
                    if (iHashCode != -1950496919) {
                        if (iHashCode != 2606829) {
                            if (iHashCode != 38199441 || !strSubstring2.equals("Bandwidth")) {
                                throw new IllegalArgumentException("Invalid template: ".concat(String.valueOf(str)));
                            }
                            arrayList2.add(3);
                            arrayList3.set(arrayList2.size() - 1, strSubstring);
                        } else {
                            if (!strSubstring2.equals("Time")) {
                                throw new IllegalArgumentException("Invalid template: ".concat(String.valueOf(str)));
                            }
                            arrayList2.add(4);
                            arrayList3.set(arrayList2.size() - 1, strSubstring);
                        }
                    } else {
                        if (!strSubstring2.equals("Number")) {
                            throw new IllegalArgumentException("Invalid template: ".concat(String.valueOf(str)));
                        }
                        arrayList2.add(2);
                        arrayList3.set(arrayList2.size() - 1, strSubstring);
                    }
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new cvi((List) arrayList, (List) arrayList2, (List) arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a3 -> B:24:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(defpackage.gyo r9, defpackage.gag r10, defpackage.gzu r11, java.lang.Object r12, defpackage.gzy r13, defpackage.gwj r14, defpackage.yih r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.A(gyo, gag, gzu, java.lang.Object, gzy, gwj, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cb -> B:29:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(defpackage.gag r18, defpackage.gzu r19, java.lang.Object r20, defpackage.gzy r21, defpackage.gwj r22, defpackage.yih r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.B(gag, gzu, java.lang.Object, gzy, gwj, yih):java.lang.Object");
    }

    public final WindowLayoutComponent C() {
        Object obj = this.c;
        if (gli.G(new gem(obj, 7)) && gli.F("WindowExtensionsProvider#getWindowExtensions is not valid", new gem(obj, 8)) && gli.F("WindowExtensions#getWindowLayoutComponent is not valid", new gem(this, 10)) && gli.F("FoldingFeature class is not valid", new gem(this, 11))) {
            int i = gnb.a;
            int iA = gnb.a();
            if (iA <= 0) {
                return null;
            }
            boolean zG = true;
            if (iA == 1) {
                zG = R();
            } else if (iA < 5) {
                zG = G();
            } else if (!G() || !gli.F("DisplayFoldFeature is not valid", new gem(this, 13)) || !gli.F("SupportedWindowFeatures is not valid", new gem(this, 12)) || !gli.F("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new gem(this, 14))) {
                zG = false;
            }
            if (zG) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        return null;
    }

    public final Class D() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.a).loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class E() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.a).loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final Class F() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.a).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final boolean G() {
        if (!R()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return gli.F(sb.toString(), new gem(this, 16));
    }

    public final void H() {
        synchronized (this) {
            Object obj = this.b;
            ((AtomicInteger) obj).decrementAndGet();
            if (((AtomicInteger) obj).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean I() {
        synchronized (this) {
            if (((AtomicBoolean) this.c).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void J(yjv yjvVar) {
        yvc yvcVar;
        Object objD;
        fzd fzdVar;
        do {
            yvcVar = (yvc) this.b;
            objD = yvcVar.d();
            fzd fzdVar2 = (fzd) objD;
            fzdVar = (fzd) yjvVar.a(fzdVar2);
            if (yks.e(fzdVar2, fzdVar)) {
                return;
            }
        } while (!yvcVar.f(objD, fzdVar));
        if (fzdVar != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((yjv) it.next()).a(fzdVar);
            }
        }
    }

    public final void L(fzw fzwVar) {
        J(new fyq(fzwVar, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uhp] */
    public final uhp M() {
        ?? r0 = this.a;
        eci.e(r0);
        return r0;
    }

    public final synchronized int O(long j) {
        int i;
        Object obj = this.c;
        ((ezn) obj).a = j;
        ezn eznVar = (ezn) ((TreeSet) this.b).floor(obj);
        if (eznVar != null) {
            long j2 = eznVar.b;
            if (j <= j2 && (i = eznVar.c) != -1) {
                Object obj2 = this.a;
                if (i == ((fdg) obj2).a - 1) {
                    if (j2 == ((fdg) obj2).c[i] + ((fdg) obj2).b[i]) {
                        return -2;
                    }
                }
                return (int) ((((fdg) obj2).e[i] + ((((fdg) obj2).d[i] * (j2 - ((fdg) obj2).c[i])) / ((fdg) obj2).b[i])) / 1000);
            }
        }
        return -1;
    }

    public final synchronized void P(egl eglVar) {
        T(eglVar);
    }

    public final synchronized void Q(egl eglVar) {
        long j = eglVar.b;
        ezn eznVar = new ezn(j, eglVar.c + j);
        Object obj = this.b;
        ezn eznVar2 = (ezn) ((TreeSet) obj).floor(eznVar);
        if (eznVar2 == null) {
            edb.c("CachedRegionTracker", "Removed a span we were not aware of");
            return;
        }
        ((TreeSet) obj).remove(eznVar2);
        long j2 = eznVar2.a;
        long j3 = eznVar.a;
        if (j2 < j3) {
            ezn eznVar3 = new ezn(j2, j3);
            int iBinarySearch = Arrays.binarySearch(((fdg) this.a).c, eznVar3.b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            eznVar3.c = iBinarySearch;
            ((TreeSet) obj).add(eznVar3);
        }
        long j4 = eznVar2.b;
        long j5 = eznVar.b;
        if (j4 > j5) {
            ezn eznVar4 = new ezn(j5 + 1, j4);
            eznVar4.c = eznVar2.c;
            ((TreeSet) obj).add(eznVar4);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a(cvk cvkVar) {
        ((CopyOnWriteArrayList) this.b).add(cvkVar);
        this.a.run();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void b(cvk cvkVar, dvk dvkVar) {
        a(cvkVar);
        ?? r0 = this.c;
        dve lifecycle = dvkVar.getLifecycle();
        cvh cvhVar = (cvh) r0.remove(cvkVar);
        if (cvhVar != null) {
            cvhVar.a();
        }
        r0.put(cvkVar, new cvh(lifecycle, new cvg(this, cvkVar, 0)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void c(final cvk cvkVar, dvk dvkVar, final dvd dvdVar) {
        ?? r0 = this.c;
        dve lifecycle = dvkVar.getLifecycle();
        cvh cvhVar = (cvh) r0.remove(cvkVar);
        if (cvhVar != null) {
            cvhVar.a();
        }
        r0.put(cvkVar, new cvh(lifecycle, new dvi() { // from class: cvf
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.Runnable] */
            @Override // defpackage.dvi
            public final void a(dvk dvkVar2, dvc dvcVar) {
                cvi cviVar = this.a;
                cvk cvkVar2 = cvkVar;
                dvd dvdVar2 = dvdVar;
                if (dvcVar == dvb.c(dvdVar2)) {
                    cviVar.a(cvkVar2);
                    return;
                }
                if (dvcVar == dvc.ON_DESTROY) {
                    cviVar.f(cvkVar2);
                } else if (dvcVar == dvb.a(dvdVar2)) {
                    ((CopyOnWriteArrayList) cviVar.b).remove(cvkVar2);
                    cviVar.a.run();
                }
            }
        }));
    }

    public final void d(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((cvk) it.next()).a(menu, menuInflater);
        }
    }

    public final void e(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((cvk) it.next()).c(menu);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void f(cvk cvkVar) {
        ((CopyOnWriteArrayList) this.b).remove(cvkVar);
        cvh cvhVar = (cvh) this.c.remove(cvkVar);
        if (cvhVar != null) {
            cvhVar.a();
        }
        this.a.run();
    }

    public final boolean g(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (((cvk) it.next()).d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void h(cpe cpeVar) {
        ArrayList arrayList = (ArrayList) this.c;
        arrayList.clear();
        int size = cpeVar.aJ.size();
        for (int i = 0; i < size; i++) {
            cpd cpdVar = (cpd) cpeVar.aJ.get(i);
            if (cpdVar.O() == 3 || cpdVar.P() == 3) {
                arrayList.add(cpdVar);
            }
        }
        cpeVar.c();
    }

    public final boolean i(cqf cqfVar, cpd cpdVar, int i) {
        cpm cpmVar = (cpm) this.a;
        cpmVar.i = cpdVar.O();
        cpmVar.j = cpdVar.P();
        cpmVar.a = cpdVar.j();
        cpmVar.b = cpdVar.h();
        cpmVar.g = false;
        cpmVar.h = i;
        int i2 = cpmVar.i;
        int i3 = cpmVar.j;
        boolean z = i2 == 3 && cpdVar.Y > 0.0f;
        boolean z2 = i3 == 3 && cpdVar.Y > 0.0f;
        if (z && cpdVar.v[0] == 4) {
            cpmVar.i = 1;
        }
        if (z2 && cpdVar.v[1] == 4) {
            cpmVar.j = 1;
        }
        cqfVar.a(cpdVar, cpmVar);
        cpdVar.E(cpmVar.c);
        cpdVar.z(cpmVar.d);
        cpdVar.G = cpmVar.f;
        cpdVar.w(cpmVar.e);
        cpmVar.h = 0;
        return cpmVar.g;
    }

    public final void j(cpe cpeVar, int i, int i2, int i3) {
        int i4 = cpeVar.ad;
        int i5 = cpeVar.ae;
        cpeVar.D(0);
        cpeVar.C(0);
        cpeVar.E(i2);
        cpeVar.z(i3);
        cpeVar.D(i4);
        cpeVar.C(i5);
        Object obj = this.b;
        ((cpe) obj).b = i;
        ((cpl) obj).W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final boolean k() {
        if (this.a.a() != this.c) {
            return true;
        }
        Object obj = this.b;
        return obj != null && ((cvi) obj).k();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, my] */
    public final Object l(yih yihVar) {
        Object objJ = mr.j((mr) this.a, new Float(1.0f), this.b, null, yihVar, 12);
        return objJ == yio.a ? objJ : ygi.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yjk] */
    public final boolean m(Menu menu) {
        Object objA = this.b.a();
        if (yks.e(objA, null)) {
            return false;
        }
        menu.clear();
        List list = ((agk) objA).b;
        int size = list.size();
        int i = 1;
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            agj agjVar = (agj) list.get(i4);
            if (agjVar instanceof agl) {
                int i5 = i2 + 1;
                MenuItem menuItemAdd = menu.add(i3, i2, i2, ((agl) agjVar).b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new kae(agjVar, this, i));
                i2 = i5;
            } else if (agjVar instanceof agn) {
                i3++;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v5, types: [acy, java.lang.Object] */
    public final Object n(Object obj) {
        if (obj == null) {
            return null;
        }
        acw acwVar = (acw) ((ki) this.a).a(obj);
        if (acwVar != null) {
            return acwVar.b;
        }
        ?? A = this.c.a();
        int iA = A.a(obj);
        if (iA == -1) {
            return null;
        }
        return A.c(iA);
    }

    public final yjz o(int i, Object obj, Object obj2) {
        ki kiVar = (ki) this.a;
        acw acwVar = (acw) kiVar.a(obj);
        if (acwVar != null && acwVar.c == i && yks.e(acwVar.b, obj2)) {
            return acwVar.a();
        }
        acw acwVar2 = new acw(this, i, obj, obj2);
        kiVar.j(obj, acwVar2);
        return acwVar2.a();
    }

    public final int p() {
        return ((int[]) this.c).length;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public final String q(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            ?? r3 = this.b;
            if (i2 >= r3.size()) {
                sb.append((String) this.a.get(r3.size()));
                return sb.toString();
            }
            sb.append((String) this.a.get(i2));
            if (((Integer) r3.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) r3.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), Long.valueOf(j)));
            } else if (((Integer) r3.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), Integer.valueOf(i)));
            } else if (((Integer) r3.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), Long.valueOf(j2)));
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [yyk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.yjv r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dco
            if (r0 == 0) goto L13
            r0 = r7
            dco r0 = (defpackage.dco) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dco r0 = new dco
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.a
            yyk r6 = (defpackage.yyk) r6
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            yyk r6 = r0.d
            java.lang.Object r2 = r0.a
            yjv r2 = (defpackage.yjv) r2
            defpackage.ybn.f(r7)
            goto L58
        L42:
            defpackage.ybn.f(r7)
            java.lang.Object r7 = r5.c
            r0.a = r6
            r2 = r7
            yyk r2 = (defpackage.yyk) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L72
            r2 = r6
            r6 = r7
        L58:
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r0.d = r7     // Catch: java.lang.Throwable -> L2e
            r0.c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r2.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L66
            goto L72
        L66:
            yyk r6 = (defpackage.yyk) r6
            r6.d()
            return r7
        L6c:
            yyk r6 = (defpackage.yyk) r6
            r6.d()
            throw r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.r(yjv, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.yjz r7, defpackage.yih r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dcp
            if (r0 == 0) goto L13
            r0 = r8
            dcp r0 = (defpackage.dcp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dcp r0 = new dcp
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.a
            yyk r0 = r0.d
            defpackage.ybn.f(r8)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r8 = move-exception
            goto L64
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ybn.f(r8)
            java.lang.Object r8 = r6.c
            r2 = r8
            yyk r2 = (defpackage.yyk) r2
            boolean r2 = r2.c()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L60
            r5 = r8
            yyk r5 = (defpackage.yyk) r5     // Catch: java.lang.Throwable -> L60
            r0.d = r5     // Catch: java.lang.Throwable -> L60
            r0.a = r2     // Catch: java.lang.Throwable -> L60
            r0.c = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r7.a(r4, r0)     // Catch: java.lang.Throwable -> L60
            if (r7 == r1) goto L5f
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5e
            yyk r0 = (defpackage.yyk) r0
            r0.d()
        L5e:
            return r8
        L5f:
            return r1
        L60:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L64:
            if (r7 == 0) goto L6b
            yyk r0 = (defpackage.yyk) r0
            r0.d()
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.s(yjz, yih):java.lang.Object");
    }

    public final Object t() {
        return new Integer(((cvw) this.b).d());
    }

    public final cvi u(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            Random random = (Random) this.a;
            iArr[i3] = random.nextInt(((int[]) this.c).length + 1);
            int i4 = i3 + 1;
            int iNextInt = random.nextInt(i4);
            iArr2[i3] = iArr2[iNextInt];
            iArr2[iNextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr);
        int[] iArr3 = (int[]) this.c;
        int[] iArr4 = new int[iArr3.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr3.length + i2; i7++) {
            if (i5 >= i2 || i6 != iArr[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr3[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr2[i5];
                i5++;
            }
        }
        return new cvi(iArr4, new Random(((Random) this.a).nextLong()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0190, code lost:
    
        if (r0 != r10) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c8  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(defpackage.gzu r27, java.lang.Object r28, defpackage.gzy r29, defpackage.gwj r30, defpackage.yih r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.w(gzu, java.lang.Object, gzy, gwj, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(defpackage.yih r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.gxn
            if (r0 == 0) goto L13
            r0 = r9
            gxn r0 = (defpackage.gxn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gxn r0 = new gxn
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L2c
            goto L93
        L2c:
            r9 = move-exception
            goto L9f
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r9)
            r9 = r2
            goto L78
        L3e:
            defpackage.ybn.f(r9)
            java.lang.Object r9 = r8.c
            r0.a = r9
            r0.c = r4
            r2 = r9
            yyo r2 = (defpackage.yyo) r2
            int r2 = r2.e()
            if (r2 <= 0) goto L51
            goto L74
        L51:
            yih r2 = defpackage.wcq.S(r0)
            yof r2 = defpackage.yks.o(r2)
            r4 = r9
            yyo r4 = (defpackage.yyo) r4     // Catch: java.lang.Throwable -> La6
            boolean r4 = r4.i(r2)     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L68
            r4 = r9
            yyo r4 = (defpackage.yyo) r4     // Catch: java.lang.Throwable -> La6
            r4.f(r2)     // Catch: java.lang.Throwable -> La6
        L68:
            java.lang.Object r2 = r2.i()
            yio r4 = defpackage.yio.a
            if (r2 == r4) goto L72
            ygi r2 = defpackage.ygi.a
        L72:
            if (r2 == r4) goto L76
        L74:
            ygi r2 = defpackage.ygi.a
        L76:
            if (r2 == r1) goto La5
        L78:
            gxk r2 = new gxk     // Catch: java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.Throwable -> L9b
            r0.a = r9     // Catch: java.lang.Throwable -> L9b
            r0.c = r3     // Catch: java.lang.Throwable -> L9b
            yim r3 = defpackage.yim.a     // Catch: java.lang.Throwable -> L9b
            dlo r4 = new dlo     // Catch: java.lang.Throwable -> L9b
            r5 = 0
            r6 = 7
            r4.<init>(r2, r5, r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = defpackage.ykr.l(r3, r4, r0)     // Catch: java.lang.Throwable -> L9b
            if (r0 == r1) goto La5
            r7 = r0
            r0 = r9
            r9 = r7
        L93:
            gxo r9 = (defpackage.gxo) r9     // Catch: java.lang.Throwable -> L2c
            yyo r0 = (defpackage.yyo) r0
            r0.h()
            return r9
        L9b:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L9f:
            yyo r0 = (defpackage.yyo) r0
            r0.h()
            throw r9
        La5:
            return r1
        La6:
            r9 = move-exception
            r2.x()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.x(yih):java.lang.Object");
    }

    public final String y() {
        String string = ((UUID) this.c).toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22, types: [gza] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r17v1, types: [gwj] */
    /* JADX WARN: Type inference failed for: r1v16, types: [nue] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r3v10, types: [gzb] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [gzf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [gzb] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.qza r35, defpackage.yih r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.z(qza, yih):java.lang.Object");
    }

    public cvi(Uri uri, uhp uhpVar) {
        this.b = null;
        this.c = uri;
        this.a = uhpVar;
    }

    public cvi(ewb ewbVar, ewa ewaVar, ejs ejsVar) {
        this.b = ewbVar;
        this.a = ewaVar;
        this.c = ejsVar;
    }

    public cvi(gav gavVar, gbp gbpVar, yqe yqeVar) {
        this.a = gavVar;
        this.c = gbpVar;
        this.b = yqeVar;
    }

    public cvi(gxu gxuVar, gzy gzyVar, yyo yyoVar) {
        this.b = gxuVar;
        this.a = gzyVar;
        this.c = yyoVar;
    }

    public cvi(ClassLoader classLoader, gna gnaVar) {
        this.a = classLoader;
        this.b = gnaVar;
        this.c = new cb(classLoader, (byte[]) null);
    }

    public cvi(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public cvi(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public cvi(Signature signature) {
        this.a = signature;
        this.c = null;
        this.b = null;
    }

    private cvi(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public cvi(Cipher cipher) {
        this.c = cipher;
        this.a = null;
        this.b = null;
    }

    public cvi(Mac mac) {
        this.b = mac;
        this.c = null;
        this.a = null;
    }

    public cvi(kvw kvwVar) {
        this.b = kvwVar.b;
        this.a = kvwVar.a;
        this.c = kvwVar.c;
    }

    public cvi(ysx ysxVar, gcc gccVar, cb cbVar) {
        this.b = ysxVar;
        this.c = gccVar;
        this.a = cbVar;
    }

    public cvi(byte[] bArr, uhp uhpVar) {
        this.b = bArr;
        this.c = null;
        this.a = uhpVar;
    }

    public cvi(bib bibVar, yjk yjkVar) {
        this.b = bibVar;
        this.c = yjkVar;
        long[] jArr = kj.a;
        this.a = new ki((byte[]) null);
    }

    public cvi(fus fusVar) {
        this.c = fusVar;
        this.b = new yyk();
        this.a = new gaw(fusVar);
    }

    public cvi(gpo gpoVar) {
        this(gpoVar.b, gpoVar.c, gpoVar.d);
    }

    public cvi(hlg hlgVar, hlu hluVar) {
        List list = Collections.EMPTY_LIST;
        hju.p(hlgVar);
        this.c = hlgVar;
        hju.p(list);
        this.b = list;
        hju.p(hluVar);
        this.a = hluVar;
    }

    public cvi(Runnable runnable) {
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.a = runnable;
    }

    public cvi(riv rivVar, fse fseVar) {
        fseVar.getClass();
        this.b = rivVar;
        this.c = fseVar;
        this.a = new hfw(rivVar, (byte[]) null);
    }

    public cvi(yjk yjkVar) {
        this.a = yjkVar;
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
    }

    public cvi(byte[] bArr) {
        this(new Random());
    }

    public cvi(char[] cArr) {
        this.a = new gch();
        yvc yvcVarA = yvd.a(null);
        this.b = yvcVarA;
        this.c = new yul(yvcVarA);
    }

    public cvi(ebu... ebuVarArr) {
        emr emrVar = new emr();
        ebx ebxVar = new ebx();
        ebu[] ebuVarArr2 = new ebu[2];
        this.b = ebuVarArr2;
        System.arraycopy(ebuVarArr, 0, ebuVarArr2, 0, 0);
        this.a = emrVar;
        this.c = ebxVar;
        ebu[] ebuVarArr3 = ebuVarArr2;
        ebuVarArr3[0] = emrVar;
        ebuVarArr3[1] = ebxVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public cvi(List list) {
        this.a = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.b.add(((heo) ((obk) list.get(i)).c).a());
            this.c.add(((hek) ((obk) list.get(i)).d).a());
        }
    }

    public cvi(Random random) {
        this(new int[0], random);
    }

    public cvi(UUID uuid, guw guwVar, Set set) {
        uuid.getClass();
        guwVar.getClass();
        this.c = uuid;
        this.b = guwVar;
        this.a = set;
    }

    public cvi(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.a = har.a;
        this.c = new hjs();
    }

    public cvi(mr mrVar, my myVar) {
        this.a = mrVar;
        this.b = myVar;
        new bci(null, bcz.c);
        aoe aoeVar = new aoe(this, 16);
        ivx ivxVar = bdt.a;
        this.c = new bbh(aoeVar, null);
    }

    public cvi(byte[] bArr, byte[] bArr2) {
        this.c = new yyk();
        this.b = new cvw();
        this.a = new ysq(new cbw((yih) null, 2, (char[]) null));
    }

    public cvi(bdy bdyVar, cvi cviVar) {
        this.a = bdyVar;
        this.b = cviVar;
        this.c = bdyVar.a();
    }

    public cvi(int[] iArr, Random random) {
        this.c = iArr;
        this.a = random;
        this.b = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            ((int[]) this.b)[iArr[i]] = i;
        }
    }

    public cvi() {
        this.a = new WeakHashMap();
        this.c = new WeakHashMap();
        this.b = new WeakHashMap();
    }

    public cvi(egc egcVar, String str, fdg fdgVar) {
        this.a = fdgVar;
        this.b = new TreeSet();
        this.c = new ezn(0L, 0L);
        synchronized (this) {
            Iterator itDescendingIterator = egcVar.l(str, this).descendingIterator();
            while (itDescendingIterator.hasNext()) {
                T((egl) itDescendingIterator.next());
            }
        }
    }

    public cvi(cpe cpeVar) {
        this.c = new ArrayList();
        this.a = new cpm();
        this.b = cpeVar;
    }

    private static final fzv S(fzv fzvVar, fzv fzvVar2, fzv fzvVar3, fzv fzvVar4) {
        return fzvVar3;
    }
}
