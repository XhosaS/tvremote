package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aly extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aly(List list, List list2, agsw agswVar) {
        super(2, agswVar);
        this.f = list;
        this.g = list2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aly) c(obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r8.d
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L13
            java.lang.Object r1 = r8.a
            java.lang.Object r3 = r8.e
            java.util.List r3 = (java.util.List) r3
            defpackage.agpl.b(r9)
            goto L31
        L13:
            java.lang.Object r1 = r8.c
            java.lang.Object r3 = r8.b
            java.lang.Object r4 = r8.a
            java.lang.Object r5 = r8.e
            java.util.List r5 = (java.util.List) r5
            defpackage.agpl.b(r9)
            r7 = r5
            r5 = r3
            r3 = r7
            goto L52
        L24:
            defpackage.agpl.b(r9)
            java.lang.Object r9 = r8.e
            java.util.List r1 = r8.f
            java.util.List r3 = r8.g
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r1.next()
            alu r4 = (defpackage.alu) r4
            r8.e = r3
            r8.a = r1
            r8.b = r4
            r8.c = r9
            r8.d = r2
            java.lang.Object r5 = r4.c(r9, r8)
            if (r5 == r0) goto L78
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r4
            r4 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L75
            alx r9 = new alx
            r6 = 0
            r9.<init>(r5, r6)
            r3.add(r9)
            r8.e = r3
            r8.a = r4
            r8.b = r6
            r8.c = r6
            r9 = 2
            r8.d = r9
            java.lang.Object r9 = r5.b(r1, r8)
            if (r9 == r0) goto L78
            goto L76
        L75:
            r9 = r1
        L76:
            r1 = r4
            goto L31
        L78:
            return r0
        L79:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aly.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        aly alyVar = new aly(this.f, this.g, agswVar);
        alyVar.e = obj;
        return alyVar;
    }
}
