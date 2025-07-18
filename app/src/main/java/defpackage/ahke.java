package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahke extends agtq implements ahgs, agtr {
    public final ahgs a;
    public final agte b;
    public final int c;
    private agte d;
    private agsw e;

    public ahke(ahgs ahgsVar, agte agteVar) {
        super(ahka.a, agtf.a);
        this.a = ahgsVar;
        this.b = agteVar;
        this.c = ((Number) agteVar.fold(0, new agvb() { // from class: ahkd
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            }
        })).intValue();
    }

    @Override // defpackage.ahgs
    public final Object a(Object obj, agsw agswVar) {
        try {
            agte agteVarFr = agswVar.fr();
            ahdp.e(agteVarFr);
            agte agteVar = this.d;
            if (agteVar != agteVarFr) {
                if (agteVar instanceof ahjv) {
                    throw new IllegalStateException(agyv.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ahjv) agteVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) agteVarFr.fold(0, new agvb() { // from class: ahkh
                    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                    @Override // defpackage.agvb
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            r4 = this;
                            java.lang.Integer r5 = (java.lang.Integer) r5
                            int r5 = r5.intValue()
                            agtc r6 = (defpackage.agtc) r6
                            agtd r0 = r6.getKey()
                            ahke r1 = r4.a
                            agte r1 = r1.b
                            agtc r1 = r1.get(r0)
                            ahdk r2 = defpackage.ahdl.c
                            if (r0 == r2) goto L20
                            if (r6 == r1) goto L1d
                            r5 = -2147483648(0xffffffff80000000, float:-0.0)
                            goto L45
                        L1d:
                            int r5 = r5 + 1
                            goto L45
                        L20:
                            ahdl r1 = (defpackage.ahdl) r1
                            r6.getClass()
                            ahdl r6 = (defpackage.ahdl) r6
                        L27:
                            r0 = 0
                            if (r6 != 0) goto L2c
                            r6 = r0
                            goto L41
                        L2c:
                            if (r6 == r1) goto L41
                            boolean r2 = r6 instanceof defpackage.ahmc
                            if (r2 == 0) goto L41
                            ahmc r6 = (defpackage.ahmc) r6
                            ahaw r6 = r6.E()
                            if (r6 == 0) goto L3f
                            ahdl r6 = r6.d()
                            goto L27
                        L3f:
                            r6 = r0
                            goto L27
                        L41:
                            if (r6 != r1) goto L4a
                            if (r1 != 0) goto L1d
                        L45:
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                            return r5
                        L4a:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                            java.lang.String r2 = ", expected child of "
                            java.lang.String r3 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                            java.lang.String r6 = defpackage.a.f(r1, r6, r0, r2, r3)
                            r5.<init>(r6)
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkh.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                })).intValue() != this.c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + agteVarFr + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.d = agteVarFr;
            }
            this.e = agswVar;
            agvc agvcVar = ahkg.a;
            ahgs ahgsVar = this.a;
            ahgsVar.getClass();
            Object objA = agvcVar.a(ahgsVar, obj, this);
            agtg agtgVar = agtg.a;
            if (!agvy.c(objA, agtgVar)) {
                this.e = null;
            }
            if (objA == agtgVar) {
                agswVar.getClass();
            }
            return objA == agtgVar ? objA : agpu.a;
        } catch (Throwable th) {
            this.d = new ahjv(th, agswVar.fr());
            throw th;
        }
    }

    @Override // defpackage.agto
    protected final Object b(Object obj) {
        Throwable thA = agpk.a(obj);
        if (thA != null) {
            this.d = new ahjv(thA, fr());
        }
        agsw agswVar = this.e;
        if (agswVar != null) {
            agswVar.e(obj);
        }
        return agtg.a;
    }

    @Override // defpackage.agtq, defpackage.agsw
    public final agte fr() {
        agte agteVar = this.d;
        return agteVar == null ? agtf.a : agteVar;
    }

    @Override // defpackage.agto, defpackage.agtr
    public final agtr ft() {
        agsw agswVar = this.e;
        if (agswVar instanceof agtr) {
            return (agtr) agswVar;
        }
        return null;
    }

    @Override // defpackage.agtq, defpackage.agto
    public final void g() {
        super.g();
    }

    @Override // defpackage.agto, defpackage.agtr
    public final void fu() {
    }
}
