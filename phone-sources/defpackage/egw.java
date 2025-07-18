package defpackage;

import android.os.ConditionVariable;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egw implements egc {
    private static final HashSet f = new HashSet();
    public final File a;
    public final egr b;
    public final egi c;
    public long d;
    public egb e;
    private final HashMap g;
    private final Random h;
    private long i;

    public egw(File file, kdh kdhVar, boolean z) {
        egr egrVar = new egr(kdhVar, file, z);
        egi egiVar = null;
        if (kdhVar != null && !z) {
            egiVar = new egi(kdhVar);
        }
        if (!t(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(String.valueOf(file))));
        }
        this.a = file;
        this.b = egrVar;
        this.c = egiVar;
        this.g = new HashMap();
        this.h = new Random();
        this.d = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new egv(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void o(File file) throws egb {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strConcat = "Failed to create cache directory: ".concat(String.valueOf(String.valueOf(file)));
        edb.c("SimpleCache", strConcat);
        throw new egb(strConcat);
    }

    private final void q(egx egxVar) {
        egr egrVar = this.b;
        String str = egxVar.a;
        egrVar.b(str).c.add(egxVar);
        this.i += egxVar.c;
        ArrayList arrayList = (ArrayList) this.g.get(str);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((cvi) arrayList.get(size)).P(egxVar);
            }
        }
    }

    private final void r(egl eglVar) {
        egn egnVarA = this.b.a(eglVar.a);
        if (egnVarA == null || !egnVarA.c.remove(eglVar)) {
            return;
        }
        File file = eglVar.e;
        if (file != null) {
            file.delete();
        }
        this.i -= eglVar.c;
        egi egiVar = this.c;
        if (egiVar != null) {
            file.getClass();
            String name = file.getName();
            try {
                egiVar.c(name);
            } catch (IOException unused) {
                edb.e("SimpleCache", "Failed to remove file index entry for: ".concat(String.valueOf(name)));
            }
        }
        this.b.d(egnVarA.b);
        ArrayList arrayList = (ArrayList) this.g.get(eglVar.a);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((cvi) arrayList.get(size)).Q(eglVar);
            }
        }
    }

    private final void s() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableCollection(this.b.a.values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((egn) it.next()).c.iterator();
            while (it2.hasNext()) {
                egl eglVar = (egl) it2.next();
                File file = eglVar.e;
                file.getClass();
                if (file.length() != eglVar.c) {
                    arrayList.add(eglVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            r((egl) arrayList.get(i));
        }
    }

    private static synchronized boolean t(File file) {
        return f.add(file.getAbsoluteFile());
    }

    @Override // defpackage.egc
    public final synchronized long a() {
        a.ab(true);
        return this.i;
    }

    @Override // defpackage.egc
    public final synchronized long b(String str, long j, long j2) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long jC = c(str, j6, j5 - j6);
            if (jC > 0) {
                j3 += jC;
            } else {
                jC = -jC;
            }
            j6 += jC;
        }
        return j3;
    }

    @Override // defpackage.egc
    public final synchronized long c(String str, long j, long j2) {
        long jMin;
        boolean z = true;
        a.ab(true);
        egn egnVarA = this.b.a(str);
        long j3 = Long.MAX_VALUE;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        if (egnVarA != null) {
            a.H(j >= 0);
            if (j2 < 0) {
                z = false;
            }
            a.H(z);
            egx egxVarA = egnVarA.a(j, j2);
            if (egxVarA.a()) {
                if (!egxVarA.b()) {
                    j3 = egxVarA.c;
                }
                jMin = -Math.min(j3, j2);
            } else {
                long j4 = j + j2;
                if (j4 >= 0) {
                    j3 = j4;
                }
                long jMax = egxVarA.b + egxVarA.c;
                if (jMax < j3) {
                    for (egx egxVar : egnVarA.c.tailSet(egxVarA, false)) {
                        long j5 = egxVar.b;
                        if (j5 > jMax) {
                            break;
                        }
                        jMax = Math.max(jMax, j5 + egxVar.c);
                        if (jMax >= j3) {
                            break;
                        }
                    }
                }
                jMin = Math.min(jMax - j, j2);
            }
        } else {
            jMin = -j2;
        }
        return jMin;
    }

    @Override // defpackage.egc
    public final synchronized egl d(String str, long j, long j2) throws Throwable {
        try {
            try {
                a.ab(true);
                n();
                while (true) {
                    egl eglVarE = e(str, j, j2);
                    long j3 = j2;
                    long j4 = j;
                    String str2 = str;
                    if (eglVarE != null) {
                        return eglVarE;
                    }
                    wait();
                    str = str2;
                    j = j4;
                    j2 = j3;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.egc
    public final synchronized egl e(String str, long j, long j2) {
        egx egxVar;
        egx egxVarA;
        a.ab(true);
        n();
        egr egrVar = this.b;
        egn egnVarA = egrVar.a(str);
        if (egnVarA != null) {
            while (true) {
                egxVarA = egnVarA.a(j, j2);
                if (!egxVarA.d) {
                    break;
                }
                File file = egxVarA.e;
                file.getClass();
                if (file.length() == egxVarA.c) {
                    break;
                }
                s();
            }
            egxVar = egxVarA;
        } else {
            egxVar = new egx(str, j, j2, -9223372036854775807L, null);
        }
        if (egxVar.d) {
            return egxVar;
        }
        egn egnVarB = egrVar.b(str);
        long j3 = egxVar.c;
        int i = 0;
        while (true) {
            ArrayList arrayList = egnVarB.d;
            if (i >= arrayList.size()) {
                arrayList.add(new fhk(j, j3, null));
                return egxVar;
            }
            fhk fhkVar = (fhk) arrayList.get(i);
            long j4 = fhkVar.b;
            if (j4 <= j) {
                long j5 = fhkVar.a;
                if (j5 == -1 || j4 + j5 > j) {
                    break;
                }
                i++;
            } else {
                if (j3 == -1 || j + j3 > j4) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    @Override // defpackage.egc
    public final synchronized egs f(String str) {
        egn egnVarA;
        a.ab(true);
        egnVarA = this.b.a(str);
        return egnVarA != null ? egnVarA.e : egt.a;
    }

    @Override // defpackage.egc
    public final synchronized File g(String str, long j, long j2) {
        egn egnVarA;
        File file;
        a.ab(true);
        n();
        egnVarA = this.b.a(str);
        egnVarA.getClass();
        a.ab(egnVarA.c(j, j2));
        File file2 = this.a;
        if (!file2.exists()) {
            o(file2);
            s();
        }
        file = new File(file2, Integer.toString(this.h.nextInt(10)));
        if (!file.exists()) {
            o(file);
        }
        return egx.d(file, egnVarA.a, j, System.currentTimeMillis());
    }

    @Override // defpackage.egc
    public final synchronized void h(File file, long j) {
        boolean z = true;
        a.ab(true);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            egr egrVar = this.b;
            egx egxVarC = egx.c(file, j, -9223372036854775807L, egrVar);
            egxVarC.getClass();
            egn egnVarA = egrVar.a(egxVarC.a);
            egnVarA.getClass();
            long j2 = egxVarC.c;
            long j3 = egxVarC.b;
            a.ab(egnVarA.c(j3, j2));
            long jO = clw.O(egnVarA.e);
            if (jO != -1) {
                if (j3 + j2 > jO) {
                    z = false;
                }
                a.ab(z);
            }
            egi egiVar = this.c;
            if (egiVar == null) {
                q(egxVarC);
                this.b.e();
                notifyAll();
                return;
            }
            try {
                egiVar.e(file.getName(), j2, egxVarC.f);
                q(egxVarC);
                try {
                    this.b.e();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new egb(e);
                }
            } catch (IOException e2) {
                throw new egb(e2);
            }
        }
    }

    @Override // defpackage.egc
    public final synchronized void i(egl eglVar) {
        a.ab(true);
        egr egrVar = this.b;
        egn egnVarA = egrVar.a(eglVar.a);
        egnVarA.getClass();
        long j = eglVar.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = egnVarA.d;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((fhk) arrayList.get(i)).b == j) {
                arrayList.remove(i);
                egrVar.d(egnVarA.b);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.egc
    public final synchronized void j(String str) {
        a.ab(true);
        Iterator it = m(str).iterator();
        while (it.hasNext()) {
            r((egl) it.next());
        }
    }

    @Override // defpackage.egc
    public final synchronized void k(String str, dwi dwiVar) {
        a.ab(true);
        n();
        egr egrVar = this.b;
        egn egnVarB = egrVar.b(str);
        egt egtVar = egnVarB.e;
        egnVarB.e = egtVar.a(dwiVar);
        if (!egnVarB.e.equals(egtVar)) {
            egrVar.c.e(egnVarB);
        }
        try {
            egrVar.e();
        } catch (IOException e) {
            throw new egb(e);
        }
    }

    @Override // defpackage.egc
    public final synchronized NavigableSet l(String str, cvi cviVar) {
        a.ab(true);
        str.getClass();
        HashMap map = this.g;
        ArrayList arrayList = (ArrayList) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(cviVar);
        return m(str);
    }

    public final synchronized NavigableSet m(String str) {
        egn egnVarA;
        a.ab(true);
        egnVarA = this.b.a(str);
        return (egnVarA == null || egnVarA.b()) ? new TreeSet() : new TreeSet((Collection) egnVarA.c);
    }

    public final synchronized void n() {
        egb egbVar = this.e;
        if (egbVar != null) {
            throw egbVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(java.io.File r9, boolean r10, java.io.File[] r11, java.util.Map r12) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            if (r11 == 0) goto L5f
            int r0 = r11.length
            if (r0 != 0) goto L6
            goto L5f
        L6:
            r9 = 0
            r1 = r9
        L8:
            if (r1 >= r0) goto L64
            r2 = r11[r1]
            java.lang.String r3 = r2.getName()
            if (r10 == 0) goto L33
            r4 = 46
            int r4 = r3.indexOf(r4)
            r5 = -1
            if (r4 != r5) goto L23
            java.io.File[] r3 = r2.listFiles()
            r8.p(r2, r9, r3, r12)
            goto L5c
        L23:
            java.lang.String r4 = "cached_content_index.exi"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L5c
            java.lang.String r4 = ".uid"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L5c
        L33:
            if (r12 == 0) goto L3c
            java.lang.Object r3 = r12.remove(r3)
            fhk r3 = (defpackage.fhk) r3
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L44
            long r4 = r3.b
            long r6 = r3.a
            goto L4b
        L44:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -1
        L4b:
            r3 = r4
            r5 = r6
            egr r7 = r8.b
            egx r3 = defpackage.egx.c(r2, r3, r5, r7)
            if (r3 == 0) goto L59
            r8.q(r3)
            goto L5c
        L59:
            r2.delete()
        L5c:
            int r1 = r1 + 1
            goto L8
        L5f:
            if (r10 != 0) goto L64
            r9.delete()
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egw.p(java.io.File, boolean, java.io.File[], java.util.Map):void");
    }
}
