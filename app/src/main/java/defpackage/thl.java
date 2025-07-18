package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thl {
    public final ahbt a;
    public final List b;

    public thl(Set set, ahbt ahbtVar) {
        this.a = ahbtVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((thn) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:19:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.thj
            if (r0 == 0) goto L13
            r0 = r6
            thj r0 = (defpackage.thj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            thj r0 = new thj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.agpl.b(r6)
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.agpl.b(r6)
            java.util.List r6 = r5.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
            r4 = r2
            r2 = r6
        L43:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L64
            java.lang.Object r6 = r2.next()
            thn r6 = (defpackage.thn) r6
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r6.a()
            if (r6 == r1) goto L63
        L5b:
            zox r6 = (defpackage.zox) r6
            if (r6 == 0) goto L43
            r4.add(r6)
            goto L43
        L63:
            return r1
        L64:
            java.util.Iterator r6 = r4.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L70
            r6 = 0
            return r6
        L70:
            java.lang.Object r0 = r6.next()
        L74:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r6.next()
            zox r1 = (defpackage.zox) r1
            zox r0 = (defpackage.zox) r0
            zow r2 = new zow
            r2.<init>()
            r2.B(r0)
            r2.B(r1)
            abxd r0 = r2.v()
            r0.getClass()
            zox r0 = (defpackage.zox) r0
            goto L74
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.thl.a(agsw):java.lang.Object");
    }
}
