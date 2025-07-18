package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecf {
    public final List a = new ArrayList();
    public ecq b;
    public ece c;
    public int d;

    private ecf() {
    }

    static ecf c(int i, ecq ecqVar, boolean z) {
        ecf ecfVar = new ecf();
        ecfVar.d = i;
        ecfVar.b = ecqVar;
        ecfVar.c = z ? new ece() : null;
        return ecfVar;
    }

    static ecf d(ecf ecfVar, ecf ecfVar2) {
        ecf ecfVarC = c(0, null, false);
        int i = ecfVar != null ? ecfVar.d : 0;
        int i2 = ecfVar2 != null ? ecfVar2.d : 0;
        List list = ecfVarC.a;
        ece eceVarA = ecfVar != null ? ecfVar.c : null;
        ece eceVar = ecfVar2 != null ? ecfVar2.c : null;
        if (ecfVar != null) {
            Iterator it = ecfVar.a.iterator();
            while (it.hasNext()) {
                list.add((ecd) it.next());
            }
        }
        if (ecfVar2 != null) {
            for (ecd ecdVar : ecfVar2.a) {
                List list2 = ecd.a;
                int i3 = ecdVar.d;
                list.add(new ecd(ecdVar.b, ecdVar.c + i, i3 >= 0 ? i3 + i : -1, ecdVar.e, ecdVar.f, ecdVar.g, ecdVar.h, ecdVar.i));
            }
        }
        ecfVarC.d = i + i2;
        if (eceVarA == null) {
            eceVarA = eceVar;
        } else if (eceVar != null) {
            eceVarA = eceVarA.a(eceVar);
        }
        ecfVarC.c = eceVarA;
        return ecfVarC;
    }

    public static List e(List list, dzh dzhVar) {
        if (dzhVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new elb((ejm) list.get(i), dzhVar));
        }
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final ecd b(int i) {
        return (ecd) this.a.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.ecd r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.List r2 = r0.a
            r2.add(r1)
            int r2 = r1.b
            r3 = -1
            r4 = 1
            r5 = 0
            r6 = -3
            if (r2 == r6) goto L21
            if (r2 == r3) goto L1e
            if (r2 == r4) goto L1c
            r7 = 3
            if (r2 == r7) goto L1a
            r9 = r5
            goto L25
        L1a:
            r9 = r3
            goto L25
        L1c:
            r9 = r4
            goto L25
        L1e:
            int r7 = r1.e
            goto L24
        L21:
            int r7 = r1.e
            int r7 = -r7
        L24:
            r9 = r7
        L25:
            int r7 = r0.d
            int r7 = r7 + r9
            r0.d = r7
            ece r7 = r0.c
            if (r7 == 0) goto L7f
            if (r2 == r6) goto L6a
            r6 = -2
            if (r2 == r6) goto L5f
            if (r2 == r3) goto L57
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L48
            r1 = 2
            if (r2 == r1) goto L41
            r12 = r4
            r10 = r5
            r11 = r10
            r13 = r11
            goto L5d
        L41:
            r14 = r4
            r10 = r5
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            goto L72
        L48:
            r10 = r4
            r11 = r5
            r12 = r11
            goto L5c
        L4c:
            int r1 = r1.e
            r16 = r1
            r10 = r5
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            goto L74
        L57:
            int r1 = r1.e
            r11 = r1
            r10 = r5
            r12 = r10
        L5c:
            r13 = r12
        L5d:
            r14 = r13
            goto L71
        L5f:
            int r1 = r1.e
            r15 = r1
            r10 = r5
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r16 = r14
            goto L74
        L6a:
            int r1 = r1.e
            r13 = r1
            r10 = r5
            r11 = r10
            r12 = r11
            r14 = r12
        L71:
            r15 = r14
        L72:
            r16 = r15
        L74:
            ece r8 = new ece
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            ece r1 = r7.a(r8)
            r0.c = r1
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecf.f(ecd):void");
    }

    public final void g(int i, ejm ejmVar, dzh dzhVar, Object obj) {
        ecq ecqVar = this.b;
        if (ecqVar != null) {
            ejmVar.j(ecqVar.k);
        }
        f(ecd.b(1, i, new elb(ejmVar, dzhVar), null, obj));
    }

    public final void h(int i, ejm ejmVar, dzh dzhVar, Object obj, Object obj2) {
        f(ecd.b(2, i, new elb(ejmVar, dzhVar), obj, obj2));
    }
}
