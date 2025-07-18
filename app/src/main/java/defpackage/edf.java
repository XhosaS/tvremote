package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edf {
    private static volatile Looper n;
    public volatile boolean a;
    public final emk b;
    public final ecr c;
    public final ecc d;
    public final ecl e;
    public final String f;
    public final boolean g;
    public final eda h;
    public ecq i;
    public ecq j;
    public ecq k;
    public ecb m;
    private final eda p;
    private boolean q;
    private int r;
    private final edd s;
    private final List t;
    private final AtomicBoolean u;
    private final eco w;
    private final Map o = new HashMap();
    public final dtw l = new dtw();
    private final dtz v = new dtz();

    public edf(ecz eczVar) {
        emj emjVar = new emj(Looper.getMainLooper());
        emv emvVar = emw.a;
        this.b = emjVar;
        this.w = new eco();
        this.a = false;
        this.f = eczVar.c;
        ecc eccVar = new ecc(eczVar.b);
        this.d = eccVar;
        this.g = ((eet) eccVar.a).b;
        this.e = new ecl(eccVar);
        ecr ecrVar = new ecr(eczVar.a);
        ecrVar.l = this;
        ecrVar.n = new edg(this);
        this.c = ecrVar;
        this.t = new ArrayList();
        this.s = new edd();
        emk emjVar2 = eczVar.d;
        emjVar2 = emjVar2 == null ? new emj(a()) : emjVar2;
        emv emvVar2 = emw.a;
        this.h = new eda(this, emjVar2);
        this.p = new eda(this, emjVar);
        this.u = new AtomicBoolean(false);
    }

    public static synchronized Looper a() {
        if (n == null) {
            HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
            handlerThread.start();
            n = handlerThread.getLooper();
        }
        return n;
    }

    public static ecq b(ecq ecqVar, boolean z) {
        if (ecqVar != null) {
            return ecqVar.c(z);
        }
        return null;
    }

    public static RuntimeException d(edf edfVar, ecq ecqVar, IndexOutOfBoundsException indexOutOfBoundsException) {
        String string;
        RuntimeException runtimeExceptionP = p(null, ecqVar, indexOutOfBoundsException);
        if (runtimeExceptionP != indexOutOfBoundsException) {
            return runtimeExceptionP;
        }
        synchronized (edfVar) {
            boolean z = edfVar.a;
            StringBuilder sb = new StringBuilder("tag: ");
            sb.append(edfVar.f);
            sb.append(", currentSection.size: ");
            ecq ecqVar2 = edfVar.i;
            sb.append(ecqVar2 != null ? Integer.valueOf(ecqVar2.i) : null);
            sb.append(", currentSection.name: ");
            ecq ecqVar3 = edfVar.i;
            sb.append(ecqVar3 != null ? ecqVar3.f : null);
            sb.append(", nextSection.size: ");
            ecq ecqVar4 = edfVar.j;
            sb.append(ecqVar4 != null ? Integer.valueOf(ecqVar4.i) : null);
            sb.append(", nextSection.name: ");
            ecq ecqVar5 = edfVar.j;
            sb.append(ecqVar5 != null ? ecqVar5.f : null);
            sb.append(", pendingChangeSets.size: ");
            sb.append(edfVar.t.size());
            sb.append(", pendingStateUpdates.size: ");
            edd eddVar = edfVar.s;
            sb.append(eddVar.a.size());
            sb.append(", pendingNonLazyStateUpdates.size: ");
            sb.append(eddVar.b.size());
            sb.append("\n");
            string = sb.toString();
        }
        return new RuntimeException("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: " + string + indexOutOfBoundsException.getMessage(), indexOutOfBoundsException);
    }

    private static RuntimeException p(ecq ecqVar, ecq ecqVar2, IndexOutOfBoundsException indexOutOfBoundsException) {
        if (ecqVar2 != null) {
            String strI = ecqVar2.i(ecqVar2.c);
            if (strI != null) {
                RuntimeException runtimeException = new RuntimeException(a.n(ecqVar != null ? ecqVar.f : ecqVar2.f, strI, "Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: ", " in the [", "]."), indexOutOfBoundsException);
                runtimeException.setStackTrace(new StackTraceElement[0]);
                return runtimeException;
            }
            List list = ecqVar2.j;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    RuntimeException runtimeExceptionP = p(ecqVar2, (ecq) it.next(), indexOutOfBoundsException);
                    if (runtimeExceptionP != indexOutOfBoundsException) {
                        return runtimeExceptionP;
                    }
                }
            }
        }
        return indexOutOfBoundsException;
    }

    private final void q(ecq ecqVar) {
        this.l.a(ecqVar.c, ecqVar, ecqVar.k);
        if (ecqVar.l()) {
            return;
        }
        List list = ecqVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q((ecq) list.get(i));
        }
    }

    private final synchronized void r(ecq ecqVar) {
        ecr ecrVar = ecqVar.c;
        List list = ecqVar.j;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                r((ecq) list.get(i));
            }
        }
    }

    private final void s() {
        this.q = false;
        this.r = 0;
    }

    private final void t(ecq ecqVar) {
        ecr ecrVar = ecqVar.c;
        if (ecqVar.l()) {
            return;
        }
        List list = ecqVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t((ecq) list.get(i));
        }
    }

    private final synchronized boolean u(edd eddVar) {
        return eddVar.b.equals(this.s.b);
    }

    private static void v(ecr ecrVar, ecq ecqVar, ecq ecqVar2, Map map, eco ecoVar, String str) {
        if (ecqVar2 == null) {
            throw new IllegalStateException("Can't generate a subtree with a null root");
        }
        boolean z = ebc.a;
        ecqVar2.c = ecr.q(ecrVar, ecqVar2);
        if (ecqVar != null) {
            ecqVar2.i = ecqVar.i;
        }
        boolean zL = ecqVar2.l();
        if (!zL) {
            dzh dzhVar = ecrVar.f;
        }
        boolean z2 = ecqVar != null && ecqVar.getClass().equals(ecqVar2.getClass());
        if (ecqVar == null || !z2) {
            ecqVar2.j(ecqVar2.c);
        } else {
            ecqVar2.k(ecqVar.g, ecqVar2.g);
        }
        Map map2 = map;
        List list = (List) map2.get(ecqVar2.k);
        if (list != null) {
            dxx dxxVar = ecqVar2.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dxxVar.b((dxw) list.get(i));
            }
            eeu.g.addAndGet(list.size());
            if (ecqVar2.m(ecqVar, ecqVar2)) {
                ecq.e(ecqVar2);
            }
        }
        if (zL) {
            return;
        }
        Map mapD = (ecqVar == null || ecqVar.l()) ? null : ecq.d(ecqVar);
        dzh dzhVar2 = ecrVar.f;
        ohv ohvVarO = ecrVar.o();
        dxc dxcVarA = edh.a(ecrVar, 14, null, ecqVar2);
        ecj ecjVarG = ecqVar2.g(ecqVar2.c);
        ecqVar2.j = ecjVarG == null ? new ArrayList() : ecjVarG.a;
        if (ohvVarO != null && dxcVarA != null) {
            ohvVarO.c(dxcVarA);
        }
        List list2 = ecqVar2.j;
        int size2 = list2.size();
        int i2 = 0;
        while (i2 < size2) {
            ecq ecqVar3 = (ecq) list2.get(i2);
            ecqVar3.a = ecqVar2;
            String str2 = ecqVar3.l;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalStateException(a.e(ecqVar3.f, "Your Section ", " has an empty key. Please specify a key."));
            }
            String str3 = ecqVar2.k + str2;
            ecr ecrVar2 = ecqVar2.c;
            ecq ecqVarP = ecrVar2.p();
            if (ecqVarP != null && ecqVarP.c.o.a.contains(str3)) {
                String str4 = ecqVar3.f;
                if (ecqVarP.e == null) {
                    ecqVarP.e = new HashMap();
                }
                int iIntValue = ecqVarP.e.containsKey(str4) ? ((Integer) ecqVarP.e.get(str4)).intValue() : 0;
                ecqVarP.e.put(str4, Integer.valueOf(iIntValue + 1));
                str3 = str3 + iIntValue;
            }
            ecqVar3.k = str3;
            ecrVar2.o.a.add(str3);
            ecqVar3.c = ecr.q(ecrVar, ecqVar3);
            afg afgVar = mapD == null ? null : (afg) mapD.get(ecqVar3.k);
            v(ecrVar, afgVar != null ? (ecq) afgVar.a : null, ecqVar3, map2, ecoVar, str);
            i2++;
            map2 = map;
        }
        if (ecrVar.f != dzhVar2) {
            ecrVar.f = dzhVar2;
        }
    }

    private final synchronized void w(String str, dxw dxwVar) {
        if (this.i == null && this.j == null) {
            throw new IllegalStateException("State set with no attached Section");
        }
        edd eddVar = this.s;
        edd.b(str, dxwVar, eddVar.a);
        edd.b(str, dxwVar, eddVar.b);
        if (this.q) {
            int i = this.r + 1;
            this.r = i;
            if (i == 50) {
                dsr.b(3, "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
        }
        ecq ecqVar = this.j;
        if (ecqVar == null) {
            this.j = b(this.i, false);
        } else {
            this.j = ecqVar.c(false);
        }
    }

    private final void x(ecq ecqVar, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z = ebc.a;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z2 = false;
        for (int i8 = 0; i8 < size; i8++) {
            ecf ecfVar = (ecf) list.get(i8);
            if (ecfVar.a() > 0) {
                int iA = ecfVar.a();
                int i9 = 0;
                while (i9 < iA) {
                    ecd ecdVarB = ecfVar.b(i9);
                    int i10 = ecdVarB.b;
                    if (i10 == -3) {
                        ecc eccVar = this.d;
                        int i11 = ecdVarB.c;
                        int i12 = ecdVarB.e;
                        eccVar.b();
                        eccVar.a.a(i11, i12);
                    } else if (i10 == -2) {
                        ecc eccVar2 = this.d;
                        int i13 = ecdVarB.c;
                        int i14 = ecdVarB.e;
                        List list2 = ecdVarB.g;
                        eccVar2.b();
                        eccVar2.a.e(i13, list2);
                    } else if (i10 == -1) {
                        ecc eccVar3 = this.d;
                        int i15 = ecdVarB.c;
                        int i16 = ecdVarB.e;
                        List list3 = ecdVarB.g;
                        eccVar3.b();
                        eccVar3.a.d(i15, list3);
                    } else if (i10 == 0) {
                        ecc eccVar4 = this.d;
                        int i17 = ecdVarB.c;
                        int i18 = ecdVarB.d;
                        eccVar4.b();
                        ede edeVar = eccVar4.a;
                        if (((eet) edeVar).b) {
                            eiz eizVar = ((eet) edeVar).a;
                            eizVar.z();
                            if (ejr.a) {
                                Log.d("SectionsDebug", "(" + eizVar.hashCode() + ") moveItemAsync " + i17 + " to " + i18);
                            }
                            eil eilVar = new eil(i17, i18);
                            synchronized (eizVar) {
                                eizVar.A = true;
                                List list4 = eizVar.b;
                                list4.add(i18, (efn) list4.remove(i17));
                                eizVar.w(eilVar);
                            }
                        } else {
                            ((eet) edeVar).a.H(i17, i18);
                        }
                    } else if (i10 == 1) {
                        ecc eccVar5 = this.d;
                        int i19 = ecdVarB.c;
                        ejm ejmVar = ecdVarB.f;
                        if (eccVar5.c != 1 || i19 < (i = eccVar5.d) || i19 > (i3 = i + (i2 = eccVar5.e)) || i19 < i3) {
                            eccVar5.b();
                            eccVar5.d = i19;
                            eccVar5.e = 1;
                            eccVar5.c = 1;
                            eccVar5.b.put(i19, ejmVar);
                        } else {
                            eccVar5.e = i2 + 1;
                            eccVar5.d = Math.min(i19, i);
                            eccVar5.b.put(i19, ejmVar);
                        }
                    } else if (i10 != 2) {
                        ecc eccVar6 = this.d;
                        int i20 = ecdVarB.c;
                        if (eccVar6.c != 3 || (i7 = eccVar6.d) < i20 || i7 > i20 + 1) {
                            eccVar6.b();
                            eccVar6.d = i20;
                            eccVar6.e = 1;
                            eccVar6.c = 3;
                        } else {
                            eccVar6.e++;
                            eccVar6.d = i20;
                        }
                    } else {
                        ecc eccVar7 = this.d;
                        int i21 = ecdVarB.c;
                        ejm ejmVar2 = ecdVarB.f;
                        if (eccVar7.c != 2 || i21 > (i5 = eccVar7.e + (i4 = eccVar7.d)) || (i6 = i21 + 1) < i4) {
                            eccVar7.b();
                            eccVar7.d = i21;
                            eccVar7.e = 1;
                            eccVar7.c = 2;
                            eccVar7.b.put(i21, ejmVar2);
                        } else {
                            eccVar7.d = Math.min(i21, i4);
                            eccVar7.e = Math.max(i5, i6) - eccVar7.d;
                            eccVar7.b.put(i21, ejmVar2);
                        }
                    }
                    i9++;
                    z2 = true;
                }
                this.d.b();
            }
            arrayList.addAll(ecfVar.a);
        }
        ech echVar = new ech(arrayList);
        ecc eccVar8 = this.d;
        ecu ecuVar = new ecu(this, echVar, z2, ecqVar);
        ede edeVar2 = eccVar8.a;
        if (((eet) edeVar2).b) {
            ((eet) edeVar2).a.I(z2, ecuVar);
            return;
        }
        eiz eizVar2 = ((eet) edeVar2).a;
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + eizVar2.hashCode() + ") notifyChangeSetComplete");
        }
        dyd.a();
        if (eizVar2.A) {
            throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
        }
        ecuVar.a();
        eizVar2.n.addLast(ecuVar);
        eizVar2.C();
        if (z2) {
            if (dvv.b(null)) {
                throw null;
            }
            eizVar2.F();
        }
    }

    private final void y(dyc dycVar) {
        if (!this.g) {
            if (dyd.b()) {
                try {
                    n();
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw d(this, this.i, e);
                }
            } else {
                emk emkVar = this.b;
                ecx ecxVar = new ecx(this, dycVar);
                if (this.u.compareAndSet(true, false)) {
                    ((emj) emkVar).postAtFrontOfQueue(ecxVar);
                    return;
                } else {
                    ((emj) emkVar).post(ecxVar);
                    return;
                }
            }
        }
        boolean z = ebc.a;
        synchronized (this) {
            ecq ecqVar = this.i;
            List list = this.t;
            x(ecqVar, list);
            list.clear();
        }
        if (dyd.b()) {
            h();
            return;
        }
        ((emj) this.b).post(new ecy(this, dycVar));
    }

    public final edc c(ecq ecqVar, String str, int i) {
        if (ecqVar == null) {
            return null;
        }
        if (str.equals(ecqVar.k)) {
            return new edc(ecqVar, i);
        }
        List list = ecqVar.j;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ecq ecqVar2 = (ecq) list.get(i3);
            edc edcVarC = c(ecqVar2, str, i + i2);
            if (edcVarC != null) {
                return edcVarC;
            }
            i2 += ecqVar2.i;
        }
        return null;
    }

    public final synchronized String e() {
        ecq ecqVar = this.i;
        if (ecqVar == null) {
            return null;
        }
        return ecqVar.k;
    }

    public final void f(ecq ecqVar) {
        ecr ecrVar = ecqVar.c;
        if (ecqVar.l()) {
            return;
        }
        List list = ecqVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f((ecq) list.get(i));
        }
    }

    public final void g(ecq ecqVar, boolean z, boolean z2, long j, ech echVar, int i) {
        if (ecqVar.l()) {
            return;
        }
        ecr ecrVar = ecqVar.c;
        List list = ecqVar.j;
        int size = list.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            ecq ecqVar2 = (ecq) list.get(i3);
            g(ecqVar2, z, z2, j, echVar, i2);
            i2 += ecqVar2.i;
        }
    }

    public final void h() {
        ecl eclVar = this.e;
        if (eclVar.b()) {
            eclVar.c = false;
            eclVar.a();
        }
    }

    public final void i(ecq ecqVar) {
        ecr ecrVar = ecqVar.c;
        ecqVar.r();
        if (ecqVar.l()) {
            return;
        }
        List list = ecqVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            i((ecq) list.get(i));
        }
    }

    final synchronized void j(String str, dxw dxwVar, String str2) {
        eda edaVar = this.p;
        edaVar.b();
        w(str, dxwVar);
        edaVar.c(2, str2);
        eeu.h.addAndGet(1L);
    }

    final synchronized void k(String str, dxw dxwVar, String str2) {
        eda edaVar = this.h;
        edaVar.b();
        w(str, dxwVar);
        edaVar.c(3, str2);
        eeu.i.addAndGet(1L);
    }

    public final void l(ecq ecqVar, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int iMax;
        int iMin;
        int iMin2;
        edf edfVar = this;
        Map map = edfVar.o;
        edb edbVar = (edb) map.get(ecqVar.k);
        int i7 = ecqVar.i;
        if (edbVar == null) {
            edbVar = new edb();
            map.put(ecqVar.k, edbVar);
            i6 = i5;
        } else if (edbVar.a != i || edbVar.b != i2 || edbVar.c != i3 || edbVar.d != i4 || edbVar.e != i7) {
            i6 = i5;
        } else if (i5 != 1) {
            return;
        } else {
            i6 = 1;
        }
        edbVar.b = i2;
        edbVar.a = i;
        edbVar.c = i3;
        edbVar.d = i4;
        edbVar.e = i7;
        ecr ecrVar = ecqVar.c;
        ecqVar.s(i2, i7);
        if (ecqVar.l()) {
            return;
        }
        List list = ecqVar.j;
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            ecq ecqVar2 = (ecq) list.get(i9);
            int i10 = i - i8;
            int i11 = i2 - i8;
            int i12 = i3 - i8;
            int i13 = i4 - i8;
            int iMax2 = -1;
            if (i10 >= ecqVar2.i || i11 < 0) {
                iMax = -1;
                iMin = -1;
            } else {
                iMax = Math.max(i10, 0);
                iMin = Math.min(i11, ecqVar2.i - 1);
            }
            if (i12 >= ecqVar2.i || i13 < 0) {
                iMin2 = -1;
            } else {
                iMax2 = Math.max(i12, 0);
                iMin2 = Math.min(i13, ecqVar2.i - 1);
            }
            int i14 = ecqVar2.i + i8;
            edfVar.l(ecqVar2, iMax, iMin, iMax2, iMin2, i6);
            i9++;
            edfVar = this;
            i8 = i14;
        }
    }

    public final void m(int i) {
        if (i == 1) {
            this.e.c = true;
        } else if (i == 2) {
            i = 2;
            this.e.c = true;
        }
        if (i == 4) {
            this.e.c = false;
        }
        ecl eclVar = this.e;
        eclVar.d = i;
        eclVar.a();
    }

    public final void n() {
        ArrayList arrayList;
        ecq ecqVar;
        dyd.a();
        if (this.g) {
            throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
        }
        boolean z = ebc.a;
        synchronized (this) {
            List list = this.t;
            arrayList = new ArrayList(list);
            list.clear();
            ecqVar = this.i;
        }
        x(ecqVar, arrayList);
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141 A[Catch: all -> 0x034b, Merged into TryCatch #6 {all -> 0x037f, blocks: (B:18:0x004e, B:21:0x006c, B:24:0x0078, B:29:0x0085, B:30:0x0096, B:32:0x009f, B:37:0x00c2, B:75:0x0270, B:117:0x02f1, B:119:0x02fb, B:120:0x030e, B:122:0x031b, B:131:0x0347, B:134:0x034a, B:136:0x034c, B:138:0x034e, B:139:0x034f, B:143:0x0360, B:147:0x036a, B:153:0x037b, B:142:0x0357, B:156:0x037e, B:123:0x031c, B:125:0x0334, B:127:0x0341, B:126:0x033e, B:76:0x0271, B:82:0x027c, B:88:0x0289, B:90:0x028d, B:96:0x029a, B:101:0x02a5, B:110:0x02df, B:112:0x02e6, B:113:0x02e9, B:115:0x02ee, B:104:0x02b8, B:105:0x02c0, B:107:0x02c6, B:109:0x02d4, B:38:0x00c5, B:43:0x00e3, B:45:0x00ed, B:55:0x0143, B:57:0x015a, B:58:0x0192, B:54:0x0141, B:61:0x0199, B:65:0x01a1, B:67:0x01ab, B:69:0x01e9, B:70:0x022c, B:72:0x0230, B:73:0x0261, B:74:0x026f, B:68:0x01b1, B:63:0x019d, B:48:0x0127, B:19:0x004f, B:20:0x006b, B:33:0x00b5), top: B:174:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a A[Catch: all -> 0x034b, Merged into TryCatch #6 {all -> 0x037f, blocks: (B:18:0x004e, B:21:0x006c, B:24:0x0078, B:29:0x0085, B:30:0x0096, B:32:0x009f, B:37:0x00c2, B:75:0x0270, B:117:0x02f1, B:119:0x02fb, B:120:0x030e, B:122:0x031b, B:131:0x0347, B:134:0x034a, B:136:0x034c, B:138:0x034e, B:139:0x034f, B:143:0x0360, B:147:0x036a, B:153:0x037b, B:142:0x0357, B:156:0x037e, B:123:0x031c, B:125:0x0334, B:127:0x0341, B:126:0x033e, B:76:0x0271, B:82:0x027c, B:88:0x0289, B:90:0x028d, B:96:0x029a, B:101:0x02a5, B:110:0x02df, B:112:0x02e6, B:113:0x02e9, B:115:0x02ee, B:104:0x02b8, B:105:0x02c0, B:107:0x02c6, B:109:0x02d4, B:38:0x00c5, B:43:0x00e3, B:45:0x00ed, B:55:0x0143, B:57:0x015a, B:58:0x0192, B:54:0x0141, B:61:0x0199, B:65:0x01a1, B:67:0x01ab, B:69:0x01e9, B:70:0x022c, B:72:0x0230, B:73:0x0261, B:74:0x026f, B:68:0x01b1, B:63:0x019d, B:48:0x0127, B:19:0x004f, B:20:0x006b, B:33:0x00b5), top: B:174:0x004e }] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dxc, nzm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r23, java.lang.String r24, defpackage.dyc r25) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edf.o(int, java.lang.String, dyc):void");
    }
}
