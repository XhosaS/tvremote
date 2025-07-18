package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtb extends yiz implements yjz {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dsn c;
    final /* synthetic */ bcy d;
    final /* synthetic */ yle e;
    final /* synthetic */ Context f;
    final /* synthetic */ djd g;
    final /* synthetic */ dtg h;
    final /* synthetic */ yow i;
    final /* synthetic */ yvc j;
    final /* synthetic */ dti k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtb(dsn dsnVar, bcy bcyVar, yle yleVar, yvc yvcVar, Context context, djd djdVar, dti dtiVar, dtg dtgVar, yow yowVar, yih yihVar) {
        super(2, yihVar);
        this.c = dsnVar;
        this.d = bcyVar;
        this.e = yleVar;
        this.j = yvcVar;
        this.f = context;
        this.g = djdVar;
        this.k = dtiVar;
        this.h = dtgVar;
        this.i = yowVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtb) create((bcu) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dtb dtbVar = new dtb(this.c, this.d, this.e, this.j, this.f, this.g, this.k, this.h, this.i, yihVar);
        dtbVar.b = obj;
        return dtbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r1.emit(true, r7) == r0) goto L25;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            yio r0 = defpackage.yio.a
            int r1 = r7.a
            r2 = 1
            defpackage.ybn.f(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L49
            goto L6d
        Ld:
            java.lang.Object r8 = r7.b
            bcu r8 = (defpackage.bcu) r8
            int r8 = r8.ordinal()
            if (r8 == 0) goto L80
            r1 = 4
            if (r8 == r1) goto L1b
            goto L85
        L1b:
            bcy r8 = r7.d
            yle r1 = r7.e
            long r3 = r8.a
            long r5 = r1.a
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L35
            yvc r8 = r7.j
            java.lang.Object r8 = r8.d()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L76
        L35:
            dsn r8 = r7.c
            android.content.Context r1 = r7.f
            djd r3 = r7.g
            diz r3 = r3.a()
            r7.a = r2
            djd r3 = (defpackage.djd) r3
            java.lang.Object r8 = r8.d(r1, r3, r7)
            if (r8 == r0) goto L7f
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            yvc r1 = r7.j
            java.lang.Object r3 = r1.d()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L76
            if (r8 == 0) goto L76
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r2 = 2
            r7.a = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L6d
            goto L7f
        L6d:
            dti r8 = r7.k
            dtg r0 = r7.h
            long r0 = r0.a
            r8.b(r0)
        L76:
            yle r8 = r7.e
            bcy r0 = r7.d
            long r0 = r0.a
            r8.a = r0
            goto L85
        L7f:
            return r0
        L80:
            yow r8 = r7.i
            defpackage.yoz.q(r8)
        L85:
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
