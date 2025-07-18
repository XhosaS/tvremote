package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qxb extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    int h;
    final /* synthetic */ qxk i;
    final /* synthetic */ qxc j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxb(qxk qxkVar, qxc qxcVar, yih yihVar) {
        super(2, yihVar);
        this.i = qxkVar;
        this.j = qxcVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qxb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        qxb qxbVar = new qxb(this.i, this.j, yihVar);
        qxbVar.k = obj;
        return qxbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008b -> B:11:0x0090). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            yio r0 = defpackage.yio.a
            int r1 = r10.h
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r10.g
            java.lang.Object r2 = r10.f
            java.lang.Object r3 = r10.e
            java.lang.Object r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
            java.lang.Object r8 = r10.k
            yow r8 = (defpackage.yow) r8
            defpackage.ybn.f(r11)
            goto L90
        L1d:
            defpackage.ybn.f(r11)
            java.lang.Object r11 = r10.k
            yow r11 = (defpackage.yow) r11
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            qxk r2 = r10.i
            java.util.List r3 = r2.b
            qxj r2 = r2.a
            java.util.List r2 = defpackage.yfm.ag(r3, r2)
            java.util.List r2 = defpackage.yfm.ac(r2)
            qxc r3 = r10.j
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.yfm.z(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
            r6 = r2
            r2 = r1
            r1 = r4
            r4 = r6
            r8 = r11
            r6 = r3
        L4e:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L9d
            java.lang.Object r11 = r4.next()
            qxj r11 = (defpackage.qxj) r11
            qxa r3 = new qxa
            r5 = r6
            qxc r5 = (defpackage.qxc) r5
            r7 = 0
            r9 = 0
            r3.<init>(r5, r11, r9, r7)
            r5 = 3
            ypc r3 = defpackage.ykr.o(r8, r9, r3, r5)
            vou r11 = r11.a
            vrn r11 = r11.a
            java.lang.String r11 = r11.c
            r11.getClass()
            r10.k = r8
            r10.a = r2
            r10.b = r6
            r10.c = r1
            r10.d = r4
            r10.e = r11
            r10.f = r2
            r10.g = r1
            r5 = 1
            r10.h = r5
            java.lang.Object r3 = r3.n(r10)
            if (r3 == r0) goto L9c
            r5 = r3
            r3 = r11
            r11 = r5
            r5 = r1
            r7 = r2
        L90:
            java.lang.Object r11 = r2.put(r3, r11)
            vrk r11 = (defpackage.vrk) r11
            r1.add(r11)
            r1 = r5
            r2 = r7
            goto L4e
        L9c:
            return r0
        L9d:
            vrm r11 = defpackage.vrm.a
            vtw r11 = r11.m()
            r11.getClass()
            defpackage.vxr.ai(r11)
            r2.getClass()
            vuc r0 = r11.b
            boolean r0 = r0.A()
            if (r0 != 0) goto Lb7
            r11.u()
        Lb7:
            vuc r0 = r11.b
            vrm r0 = (defpackage.vrm) r0
            vve r0 = r0.b()
            r0.putAll(r2)
            vrm r11 = defpackage.vxr.ah(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
