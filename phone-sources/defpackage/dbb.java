package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbb extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbb(List list, List list2, yih yihVar) {
        super(2, yihVar);
        this.f = list;
        this.g = list2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbb) create(obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dbb dbbVar = new dbb(this.f, this.g, yihVar);
        dbbVar.e = obj;
        return dbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yha] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            yio r0 = defpackage.yio.a
            int r1 = r8.d
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L13
            java.lang.Object r1 = r8.a
            java.lang.Object r3 = r8.e
            java.util.List r3 = (java.util.List) r3
            defpackage.ybn.f(r9)
            goto L2d
        L13:
            java.lang.Object r1 = r8.c
            java.lang.Object r3 = r8.b
            java.lang.Object r4 = r8.a
            java.lang.Object r5 = r8.e
            java.util.List r5 = (java.util.List) r5
            defpackage.ybn.f(r9)
            r7 = r5
            r5 = r3
            r3 = r7
            goto L4e
        L24:
            defpackage.ybn.f(r9)
            java.lang.Object r9 = r8.e
            java.util.List r3 = r8.g
            yha r1 = defpackage.yha.a
        L2d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r1.next()
            day r4 = (defpackage.day) r4
            r8.e = r3
            r8.a = r1
            r8.b = r4
            r8.c = r9
            r8.d = r2
            java.lang.Object r5 = r4.c()
            if (r5 == r0) goto L75
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r4
            r4 = r7
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L72
            afm r9 = new afm
            r1 = 7
            r6 = 0
            r9.<init>(r5, r6, r1)
            r3.add(r9)
            r8.e = r3
            r8.a = r4
            r8.b = r6
            r8.c = r6
            r9 = 2
            r8.d = r9
            java.lang.Object r9 = r5.b()
            if (r9 == r0) goto L75
            goto L73
        L72:
            r9 = r1
        L73:
            r1 = r4
            goto L2d
        L75:
            return r0
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
