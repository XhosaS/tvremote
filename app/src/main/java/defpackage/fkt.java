package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkt {
    private final fhi a;

    public fkt(fhi fhiVar) {
        fhiVar.getClass();
        this.a = fhiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fkr
            if (r0 == 0) goto L13
            r0 = r5
            fkr r0 = (defpackage.fkr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fkr r0 = new fkr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fhi r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L4b
        L3c:
            fnp r5 = (defpackage.fnp) r5
            foo r5 = r5.k
            if (r5 != 0) goto L44
            foo r5 = defpackage.foo.a
        L44:
            boolean r5 = r5.c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkt.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fks
            if (r0 == 0) goto L13
            r0 = r5
            fks r0 = (defpackage.fks) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fks r0 = new fks
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fhi r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto L4a
        L3c:
            fnp r5 = (defpackage.fnp) r5
            foo r5 = r5.k
            if (r5 != 0) goto L44
            foo r5 = defpackage.foo.a
        L44:
            java.lang.String r5 = r5.b
            r5.getClass()
            return r5
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkt.b(agsw):java.lang.Object");
    }

    public final Object c(final String str, final boolean z, agsw agswVar) {
        Object objB = this.a.b(new agux() { // from class: fkq
            @Override // defpackage.agux
            public final Object a(Object obj) {
                fnp fnpVar = (fnp) obj;
                fnpVar.getClass();
                foo fooVar = fnpVar.k;
                if (fooVar == null) {
                    fooVar = foo.a;
                }
                boolean z2 = z;
                String str2 = str;
                if (agvy.c(fooVar.b, str2)) {
                    foo fooVar2 = fnpVar.k;
                    if (fooVar2 == null) {
                        fooVar2 = foo.a;
                    }
                    if (fooVar2.c == z2) {
                        return fnpVar;
                    }
                }
                fno fnoVar = new fno();
                fnoVar.B(fnpVar);
                foo fooVar3 = ((fnp) fnoVar.b).k;
                if (fooVar3 == null) {
                    fooVar3 = foo.a;
                }
                fooVar3.getClass();
                fon fonVar = new fon();
                fonVar.B(fooVar3);
                str2.getClass();
                if ((fonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    fonVar.y();
                }
                ((foo) fonVar.b).b = str2;
                if ((fonVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    fonVar.y();
                }
                ((foo) fonVar.b).c = z2;
                abxd abxdVarV = fonVar.v();
                abxdVarV.getClass();
                foo fooVar4 = (foo) abxdVarV;
                if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    fnoVar.y();
                }
                fnp fnpVar2 = (fnp) fnoVar.b;
                fnpVar2.k = fooVar4;
                fnpVar2.b |= 256;
                return fnq.c(fnoVar);
            }
        }, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }
}
