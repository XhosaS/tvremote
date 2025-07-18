package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isb implements iso {
    private final Set a;
    private final Set b;

    public isb(Set set) {
        set.getClass();
        this.a = set;
        Set setSingleton = Collections.singleton("Android TV");
        setSingleton.getClass();
        this.b = setSingleton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.irz
            if (r0 == 0) goto L13
            r0 = r7
            irz r0 = (defpackage.irz) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            irz r0 = new irz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            agtg r1 = defpackage.agtg.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.agpl.b(r7)
            goto L66
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.agpl.b(r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r2 = r6.a
            java.util.Iterator r2 = r2.iterator()
            r4 = r2
            r2 = r7
        L45:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r4.next()
            ism r7 = (defpackage.ism) r7
            boolean r5 = r7.c()
            if (r5 == 0) goto L45
            r0.a = r2
            r0.b = r4
            r0.c = r2
            r0.f = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 == r1) goto L6d
            r5 = r2
        L66:
            java.util.Map r7 = (java.util.Map) r7
            r2.putAll(r7)
            r2 = r5
            goto L45
        L6d:
            return r1
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isb.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.abau r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.isa
            if (r0 == 0) goto L13
            r0 = r6
            isa r0 = (defpackage.isa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            isa r0 = new isa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            abau r5 = r0.d
            defpackage.agpl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.agpl.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r4.a(r0)
            if (r6 == r1) goto L67
        L3e:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L48:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            abar r0 = (defpackage.abar) r0
            r5.k(r1, r0)
            goto L48
        L64:
            agpu r5 = defpackage.agpu.a
            return r5
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isb.b(abau, agsw):java.lang.Object");
    }

    @Override // defpackage.iso
    public final Set c() {
        return this.b;
    }

    @Override // defpackage.iso
    public final Set d(Collection collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((ism) obj).c()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ism) it.next()).b());
        }
        Set setA = agqq.A(arrayList2);
        Set setA2 = collection != null ? agqq.A(collection) : null;
        if (setA2 == null) {
            setA2 = agrf.a;
        }
        return agqq.B(setA, setA2);
    }
}
