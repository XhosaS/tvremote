package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tu extends yiz implements yjz {
    int a;
    final /* synthetic */ bte b;
    final /* synthetic */ ty c;
    final /* synthetic */ yka d;
    final /* synthetic */ yjv e;
    final /* synthetic */ yjk f;
    final /* synthetic */ yjk g;
    final /* synthetic */ yjz h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(bte bteVar, ty tyVar, yka ykaVar, yjv yjvVar, yjk yjkVar, yjk yjkVar2, yjz yjzVar, yih yihVar) {
        super(2, yihVar);
        this.b = bteVar;
        this.c = tyVar;
        this.d = ykaVar;
        this.e = yjvVar;
        this.f = yjkVar;
        this.g = yjkVar2;
        this.h = yjzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        tu tuVar = new tu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, yihVar);
        tuVar.i = obj;
        return tuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            yio r0 = defpackage.yio.a
            int r1 = r10.a
            if (r1 == 0) goto L14
            java.lang.Object r0 = r10.i
            r1 = r0
            yow r1 = (defpackage.yow) r1
            defpackage.ybn.f(r11)     // Catch: java.util.concurrent.CancellationException -> L10
            r9 = r10
            goto L4f
        L10:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto L3e
        L14:
            defpackage.ybn.f(r11)
            java.lang.Object r11 = r10.i
            r1 = r11
            yow r1 = (defpackage.yow) r1
            bte r2 = r10.b     // Catch: java.util.concurrent.CancellationException -> L3b
            ty r11 = r10.c     // Catch: java.util.concurrent.CancellationException -> L3b
            uv r3 = r11.a     // Catch: java.util.concurrent.CancellationException -> L3b
            yka r4 = r10.d     // Catch: java.util.concurrent.CancellationException -> L3b
            yjv r5 = r10.e     // Catch: java.util.concurrent.CancellationException -> L3b
            yjk r6 = r10.f     // Catch: java.util.concurrent.CancellationException -> L3b
            yjk r7 = r10.g     // Catch: java.util.concurrent.CancellationException -> L3b
            yjz r8 = r10.h     // Catch: java.util.concurrent.CancellationException -> L3b
            r10.i = r1     // Catch: java.util.concurrent.CancellationException -> L3b
            r11 = 1
            r10.a = r11     // Catch: java.util.concurrent.CancellationException -> L3b
            r9 = r10
            java.lang.Object r11 = defpackage.kv.p(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L39
            if (r11 != r0) goto L4f
            return r0
        L39:
            r0 = move-exception
            goto L3d
        L3b:
            r0 = move-exception
            r9 = r10
        L3d:
            r11 = r0
        L3e:
            ty r0 = r9.c
            yrz r0 = r0.d
            if (r0 == 0) goto L49
            tk r2 = defpackage.tk.a
            r0.b(r2)
        L49:
            boolean r0 = defpackage.yoz.p(r1)
            if (r0 == 0) goto L52
        L4f:
            ygi r11 = defpackage.ygi.a
            return r11
        L52:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
