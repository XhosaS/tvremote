package defpackage;

import android.support.v7.widget.RecyclerView;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public cmt() {
        throw null;
    }

    private final int t(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            fe feVar = (fe) arrayList.get(size);
            int i3 = feVar.a;
            int i4 = feVar.b;
            if (i4 <= i) {
                if (i3 == 1) {
                    i -= feVar.d;
                } else if (i3 == 2) {
                    i += feVar.d;
                }
            } else if (i2 == 1) {
                feVar.b = i4 + 1;
            } else if (i2 == 2) {
                feVar.b = i4 - 1;
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            fe feVar2 = (fe) arrayList.get(size2);
            int i5 = feVar2.a;
            if (feVar2.d <= 0) {
                arrayList.remove(size2);
                n(feVar2);
            }
        }
    }

    public final cog a() {
        return ((cls) this.d).b;
    }

    public final void b(Object obj) {
        if (((cls) this.d).a() != coh.ENUM) {
            return;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final List c(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ?? r1 = this.a;
        if (!r1.isEmpty()) {
            int i = bel.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                bfl bflVarB = ((bfm) it.next()).b();
                if (bflVarB != null) {
                    arrayList2.add(bflVarB);
                }
            }
            bel belVar = !arrayList2.isEmpty() ? new bel(outputStream, arrayList2) : null;
            if (belVar != null) {
                arrayList.add(belVar);
            }
        }
        for (bfn bfnVar : this.b) {
            arrayList.add(bfnVar.d());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [crv, java.lang.Object] */
    public final void d() {
        if (((AtomicBoolean) this.a).getAndSet(true)) {
            return;
        }
        if (!((byg) this.d).f()) {
            ((avd) ((byi) this.c).a.a()).k();
        }
        ((axi) ((byi) this.b).a.a()).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xz] */
    /* JADX WARN: Type inference failed for: r2v5, types: [xx] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final xx e(cuv cuvVar, String str) {
        boolean zIsInstance;
        ?? r2;
        synchronized (this.a) {
            ?? r1 = ((asv) this.d).a;
            Object obj = (xx) r1.get(str);
            Class cls = ((cui) cuvVar).c;
            Map map = cui.a;
            map.getClass();
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                int iIntValue = num.intValue();
                zIsInstance = false;
                if (obj instanceof crw) {
                    if ((obj instanceof cuk ? ((cuk) obj).f() : obj instanceof ctj ? 0 : obj instanceof ctu ? 1 : obj instanceof cty ? 2 : obj instanceof ctz ? 3 : obj instanceof cua ? 4 : obj instanceof cub ? 5 : obj instanceof cuc ? 6 : obj instanceof cud ? 7 : obj instanceof cue ? 8 : obj instanceof cuf ? 9 : obj instanceof ctk ? 10 : obj instanceof ctl ? 11 : obj instanceof ctm ? 12 : obj instanceof ctn ? 13 : obj instanceof cto ? 14 : obj instanceof ctp ? 15 : obj instanceof ctq ? 16 : obj instanceof ctr ? 17 : obj instanceof cts ? 18 : obj instanceof ctt ? 19 : obj instanceof ctv ? 20 : obj instanceof ctw ? 21 : obj instanceof ctx ? 22 : -1) == iIntValue) {
                        zIsInstance = true;
                    }
                }
            } else {
                boolean zIsPrimitive = cls.isPrimitive();
                Class clsAC = cls;
                if (zIsPrimitive) {
                    int i = cun.a;
                    clsAC = dnx.aC(new cui(cls));
                }
                zIsInstance = clsAC.isInstance(obj);
            }
            if (zIsInstance) {
                obj.getClass();
                r2 = obj;
            } else {
                new yf((yf) this.b).a(yb.a, str);
                xx xxVarF = qs.f(this.c, cuvVar);
                xx xxVar = (xx) r1.put(str, xxVarF);
                r2 = xxVarF;
                if (xxVar != null) {
                    xxVar.f();
                    r2 = xxVarF;
                }
            }
        }
        return r2;
    }

    public final void f(Object obj) {
        mi miVar = (mi) this.d;
        if (miVar.containsKey(obj)) {
            return;
        }
        miVar.put(obj, null);
    }

    public final void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((mi) this.d).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                g(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final int h(int i) {
        return i(i, 0);
    }

    final int i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.a;
        int size = arrayList.size();
        while (i2 < size) {
            fe feVar = (fe) arrayList.get(i2);
            int i3 = feVar.a;
            int i4 = feVar.b;
            if (i4 <= i) {
                if (i3 == 2) {
                    int i5 = feVar.d;
                    if (i < i4 + i5) {
                        return -1;
                    }
                    i -= i5;
                } else if (i3 == 1) {
                    i += feVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void j() {
        ?? r0 = this.a;
        ArrayList arrayList = (ArrayList) r0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((byj) this.d).s((fe) arrayList.get(i));
        }
        o(r0);
        ?? r02 = this.b;
        ArrayList arrayList2 = (ArrayList) r02;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fe feVar = (fe) arrayList2.get(i2);
            int i3 = feVar.a;
            if (i3 == 1) {
                byj byjVar = (byj) this.d;
                byjVar.s(feVar);
                byjVar.t(feVar.b, feVar.d);
            } else if (i3 == 2) {
                byj byjVar2 = (byj) this.d;
                byjVar2.s(feVar);
                byjVar2.u(feVar.b, feVar.d);
            } else if (i3 == 4) {
                byj byjVar3 = (byj) this.d;
                byjVar3.s(feVar);
                int i4 = feVar.b;
                int i5 = feVar.d;
                Object obj = feVar.c;
                byjVar3.v(i4, i5);
            }
        }
        o(r02);
    }

    public final void k(fe feVar) {
        int i;
        int i2 = feVar.a;
        if (i2 == 1) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iT = t(feVar.b, i2);
        int i3 = feVar.b;
        int i4 = feVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(feVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(feVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < feVar.d; i6++) {
            int iT2 = t(feVar.b + (i * i6), feVar.a);
            int i7 = feVar.a;
            if (i7 == 2 ? iT2 != iT : !(i7 == 4 && iT2 == iT + 1)) {
                Object obj = feVar.c;
                fe feVarS = s(i7, iT, i5);
                l(feVarS, i3);
                n(feVarS);
                if (feVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iT = iT2;
            } else {
                i5++;
            }
        }
        Object obj2 = feVar.c;
        n(feVar);
        if (i5 > 0) {
            fe feVarS2 = s(feVar.a, iT, i5);
            l(feVarS2, i3);
            n(feVarS2);
        }
    }

    final void l(fe feVar, int i) {
        byj byjVar = (byj) this.d;
        byjVar.s(feVar);
        int i2 = feVar.a;
        if (i2 == 2) {
            byjVar.u(i, feVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            byjVar.v(i, feVar.d);
        }
    }

    public final void m(fe feVar) {
        ((ArrayList) this.a).add(feVar);
        int i = feVar.a;
        if (i == 1) {
            ((byj) this.d).t(feVar.b, feVar.d);
            return;
        }
        if (i == 2) {
            Object obj = this.d;
            int i2 = feVar.b;
            int i3 = feVar.d;
            RecyclerView recyclerView = (RecyclerView) ((byj) obj).a;
            recyclerView.H(i2, i3, false);
            recyclerView.M = true;
            return;
        }
        if (i != 4) {
            Objects.toString(feVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(feVar)));
        }
        Object obj2 = this.d;
        int i4 = feVar.b;
        int i5 = feVar.d;
        Object obj3 = feVar.c;
        ((byj) obj2).v(i4, i5);
    }

    public final void n(fe feVar) {
        feVar.c = null;
        ((pa) this.c).b(feVar);
    }

    final void o(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n((fe) list.get(i));
        }
        list.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void p() {
        o(this.b);
        o(this.a);
    }

    public final boolean q(int i) {
        ArrayList arrayList = (ArrayList) this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            fe feVar = (fe) arrayList.get(i2);
            if (feVar.a == 1) {
                int i4 = feVar.b;
                int i5 = feVar.d + i4;
                while (i4 < i5) {
                    if (i(i4, i3) == i) {
                        return true;
                    }
                    i4++;
                }
            }
            i2 = i3;
        }
        return false;
    }

    public final boolean r() {
        return ((ArrayList) this.b).size() > 0;
    }

    public final fe s(int i, int i2, int i3) {
        fe feVar = (fe) ((pa) this.c).a();
        if (feVar == null) {
            return new fe(i, i2, i3);
        }
        feVar.a = i;
        feVar.b = i2;
        feVar.d = i3;
        feVar.c = null;
        return feVar;
    }

    public cmt(asv asvVar, crv crvVar, crv crvVar2, crv crvVar3) {
        this.c = asvVar;
        this.b = crvVar;
        this.a = crvVar2;
        this.d = crvVar3;
    }

    public cmt(asv asvVar, xz xzVar, yf yfVar) {
        this.d = asvVar;
        this.c = xzVar;
        this.b = yfVar;
        this.a = new qs();
    }

    public cmt(cog cogVar, Object obj, cog cogVar2, Object obj2) {
        this.c = cogVar;
        this.a = obj;
        this.d = cogVar2;
        this.b = obj2;
    }

    public cmt(doc docVar) {
        this.c = docVar.b;
        this.b = docVar.d;
        this.a = docVar.c;
        this.d = docVar.a;
    }

    public cmt(Certificate certificate, Certificate certificate2, InputStream inputStream, OutputStream outputStream) {
        this.a = certificate;
        this.b = certificate2;
        this.d = inputStream;
        this.c = outputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cmt(defpackage.bbq r32, defpackage.bdk r33) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmt.<init>(bbq, bdk):void");
    }

    public cmt(byg bygVar, byg bygVar2, byg bygVar3) {
        this.a = new AtomicBoolean(false);
        this.c = bygVar;
        this.d = bygVar2;
        this.b = bygVar3;
    }

    public cmt(byj byjVar) {
        this.c = new pa(30);
        this.b = new ArrayList();
        this.a = new ArrayList();
        this.d = byjVar;
    }

    public cmt(cmz cmzVar, Object obj, cmz cmzVar2, cls clsVar) {
        if (cmzVar != null) {
            if (clsVar.b == cog.MESSAGE && cmzVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.c = cmzVar;
            this.b = obj;
            this.a = cmzVar2;
            this.d = clsVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public cmt(byte[] bArr) {
        this.c = new pa(10);
        this.d = new mi();
        this.b = new ArrayList();
        this.a = new HashSet();
    }

    public cmt(bdm bdmVar, bdk bdkVar) {
        ckv ckvVar;
        String str;
        bdm.a.equals(bdmVar);
        this.b = bdmVar.c;
        this.a = bdmVar.d;
        String str2 = bdmVar.e;
        long j = bdmVar.f;
        cbd cbdVar = cbd.a;
        bzu bzuVarC = bzw.c(bdmVar.g.size() + 3);
        for (bdn bdnVar : bdmVar.g) {
            int i = bdnVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                bzuVarC.c(bdnVar.e, Long.valueOf(i == 2 ? ((Long) bdnVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                bzuVarC.c(bdnVar.e, Boolean.valueOf(i == 3 ? ((Boolean) bdnVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                bzuVarC.c(bdnVar.e, Double.valueOf(i == 4 ? ((Double) bdnVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = bdnVar.e;
                if (i == 5) {
                    str = (String) bdnVar.d;
                } else {
                    str = "";
                }
                bzuVarC.c(str3, str);
            } else if (i3 == 4) {
                String str4 = bdnVar.e;
                if (i == 6) {
                    ckvVar = (ckv) bdnVar.d;
                } else {
                    ckvVar = ckv.b;
                }
                bzuVarC.c(str4, ckvVar.t());
            }
        }
        bzuVarC.c("__phenotype_server_token", bdmVar.e);
        bzuVarC.c("__phenotype_snapshot_token", bdmVar.c);
        bzuVarC.c("__phenotype_configuration_version", Long.valueOf(bdmVar.f));
        this.c = bzuVarC.a();
        this.d = bdkVar;
    }
}
