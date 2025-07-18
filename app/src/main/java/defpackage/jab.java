package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jab implements izr {
    public final ahbt a;
    public final jbd b;
    public final agow c;
    public ahdl d;
    public final ahni e;
    public final gyh f;
    private final fiu g;

    public jab(fiu fiuVar, ahbt ahbtVar, gyh gyhVar, jbd jbdVar, agow agowVar) {
        fiuVar.getClass();
        ahbtVar.getClass();
        jbdVar.getClass();
        agowVar.getClass();
        this.g = fiuVar;
        this.a = ahbtVar;
        this.f = gyhVar;
        this.b = jbdVar;
        this.c = agowVar;
        this.e = new ahnm(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (r2 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r14 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013f, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00bc -> B:23:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.jab r12, int r13, defpackage.agsw r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jab.d(jab, int, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.izr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r8, defpackage.jad r9, defpackage.agsw r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.izu
            if (r0 == 0) goto L13
            r0 = r10
            izu r0 = (defpackage.izu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            izu r0 = new izu
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r10)
            goto L74
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            int r8 = r0.a
            java.lang.String r9 = r0.e
            ffb r2 = r0.f
            defpackage.agpl.b(r10)
            goto L56
        L3c:
            defpackage.agpl.b(r10)
            r10 = r9
            ffb r10 = (defpackage.ffb) r10
            r0.f = r10
            java.lang.String r10 = "prime provider"
            r0.e = r10
            r0.a = r8
            r0.d = r4
            java.lang.Object r2 = d(r7, r8, r0)
            if (r2 == r1) goto L79
            r6 = r2
            r2 = r9
            r9 = r10
            r10 = r6
        L56:
            java.util.Set r10 = (java.util.Set) r10
            int r4 = r7.hashCode()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r8)
            r8 = 0
            r0.f = r8
            r0.e = r8
            r0.d = r3
            java.lang.Object r10 = r7.c(r9, r10, r2, r0)
            if (r10 != r1) goto L74
            goto L79
        L74:
            jae r10 = (defpackage.jae) r10
            agpu r8 = defpackage.agpu.a
            return r8
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jab.a(int, jad, agsw):java.lang.Object");
    }

    @Override // defpackage.izr
    public final void b() {
        hashCode();
        ahdl ahdlVar = this.d;
        if (ahdlVar != null) {
            Iterator itA = ahdlVar.p().a();
            int i = 0;
            while (itA.hasNext()) {
                itA.next();
                i++;
                if (i < 0) {
                    agqq.g();
                }
            }
        }
        ahdl ahdlVar2 = this.d;
        if (ahdlVar2 != null) {
            ahdlVar2.s(null);
        }
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:24:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.izr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r14, java.util.Set r15, defpackage.jad r16, defpackage.agsw r17) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jab.c(java.lang.String, java.util.Set, jad, agsw):java.lang.Object");
    }

    public final List e(List list, Set set, Set set2, boolean z) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            jba jbaVar = (jba) obj;
            if (set.isEmpty() || agqq.D(set, jbaVar.i())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            jba jbaVar2 = (jba) obj2;
            if (set2.isEmpty() || !agqq.D(set2, jbaVar2.i())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            jba jbaVar3 = (jba) obj3;
            if (z || linkedHashSet.add(jbaVar3.i())) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }
}
