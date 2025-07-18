package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfs extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ geq[] h;
    final /* synthetic */ gft i;
    final /* synthetic */ ggd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfs(geq[] geqVarArr, gft gftVar, ggd ggdVar, yih yihVar) {
        super(2, yihVar);
        this.h = geqVarArr;
        this.i = gftVar;
        this.j = ggdVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gfs) create((gfz) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new gfs(this.h, this.i, this.j, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((defpackage.gft) r6).d(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (((defpackage.gft) r6).c(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0087 -> B:25:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            yio r0 = defpackage.yio.a
            int r1 = r10.g
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 == r2) goto L16
            int r1 = r10.f
            int r3 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
            goto L22
        L16:
            int r1 = r10.f
            int r3 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
        L22:
            defpackage.ybn.f(r11)
            r11 = r5
            r5 = r4
            goto L88
        L28:
            defpackage.ybn.f(r11)
            geq[] r11 = r10.h
            gft r1 = r10.i
            ggd r3 = r10.j
            int r4 = r11.length
            r5 = 0
            r7 = r11
            r6 = r1
            r11 = r3
            r1 = r4
            r3 = r5
        L38:
            if (r3 >= r1) goto L8a
            r4 = r7
            geq[] r4 = (defpackage.geq[]) r4
            r4 = r4[r3]
            int r8 = r5 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L87
            if (r4 == r2) goto L6c
            r9 = 2
            if (r4 != r9) goto L66
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r3
            r10.f = r1
            r10.g = r9
            int r4 = defpackage.gft.f
            r4 = r6
            gft r4 = (defpackage.gft) r4
            java.lang.Object r4 = r4.d(r11, r5, r10)
            if (r4 == r0) goto L86
            goto L87
        L66:
            yfu r11 = new yfu
            r11.<init>()
            throw r11
        L6c:
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r3
            r10.f = r1
            r10.g = r2
            int r4 = defpackage.gft.f
            r4 = r6
            gft r4 = (defpackage.gft) r4
            java.lang.Object r4 = r4.c(r11, r5, r10)
            if (r4 == r0) goto L86
            goto L87
        L86:
            return r0
        L87:
            r5 = r8
        L88:
            int r3 = r3 + r2
            goto L38
        L8a:
            ygi r11 = defpackage.ygi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
