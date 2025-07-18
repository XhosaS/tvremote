package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wd extends yiy implements yjz {
    int a;
    final /* synthetic */ bss b;
    final /* synthetic */ ylf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(bss bssVar, ylf ylfVar, yih yihVar) {
        super(yihVar);
        this.b = bssVar;
        this.c = ylfVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wd) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        wd wdVar = new wd(this.b, this.c, yihVar);
        wdVar.d = obj;
        return wdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (defpackage.og.n(r13) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r12.c.a = defpackage.um.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r13 = r4.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r5 >= r13) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r6 = (defpackage.bsz) r4.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r6.c() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (defpackage.bny.G(r6, r1.n(), r1.m()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r12.c.a = defpackage.uk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r13 = defpackage.bss.c;
        r12.d = r1;
        r12.a = 2;
        r13 = r1.q(r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r13 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        r12.c.a = defpackage.uk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return defpackage.ygi.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008d -> B:30:0x0090). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            yio r0 = defpackage.yio.a
            int r1 = r12.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L13
            java.lang.Object r1 = r12.d
            btq r1 = (defpackage.btq) r1
            defpackage.ybn.f(r13)
            goto L90
        L13:
            java.lang.Object r1 = r12.d
            btq r1 = (defpackage.btq) r1
            defpackage.ybn.f(r13)
            goto L31
        L1b:
            defpackage.ybn.f(r13)
            java.lang.Object r13 = r12.d
            btq r13 = (defpackage.btq) r13
        L22:
            r12.d = r13
            r12.a = r3
            bss r1 = r12.b
            java.lang.Object r1 = r13.q(r1, r12)
            if (r1 == r0) goto Lc9
            r11 = r1
            r1 = r13
            r13 = r11
        L31:
            bsr r13 = (defpackage.bsr) r13
            java.util.List r4 = r13.a
            int r5 = r4.size()
            r6 = r2
        L3a:
            if (r6 >= r5) goto Lb7
            java.lang.Object r7 = r4.get(r6)
            bsz r7 = (defpackage.bsz) r7
            boolean r7 = defpackage.bny.E(r7)
            if (r7 != 0) goto Lb4
            boolean r13 = defpackage.og.n(r13)
            if (r13 == 0) goto L56
            ylf r13 = r12.c
            um r0 = defpackage.um.a
            r13.a = r0
            goto Lc6
        L56:
            int r13 = r4.size()
            r5 = r2
        L5b:
            if (r5 >= r13) goto L82
            java.lang.Object r6 = r4.get(r5)
            bsz r6 = (defpackage.bsz) r6
            boolean r7 = r6.c()
            if (r7 != 0) goto L7b
            long r7 = r1.n()
            long r9 = r1.m()
            boolean r6 = defpackage.bny.G(r6, r7, r9)
            if (r6 == 0) goto L78
            goto L7b
        L78:
            int r5 = r5 + 1
            goto L5b
        L7b:
            ylf r13 = r12.c
            uk r0 = defpackage.uk.a
            r13.a = r0
            goto Lc6
        L82:
            bss r13 = defpackage.bss.c
            r12.d = r1
            r4 = 2
            r12.a = r4
            java.lang.Object r13 = r1.q(r13, r12)
            if (r13 != r0) goto L90
            goto Lc9
        L90:
            bsr r13 = (defpackage.bsr) r13
            java.util.List r13 = r13.a
            int r4 = r13.size()
            r5 = r2
        L99:
            if (r5 >= r4) goto Lb1
            java.lang.Object r6 = r13.get(r5)
            bsz r6 = (defpackage.bsz) r6
            boolean r6 = r6.c()
            if (r6 == 0) goto Lae
            ylf r13 = r12.c
            uk r0 = defpackage.uk.a
            r13.a = r0
            goto Lc6
        Lae:
            int r5 = r5 + 1
            goto L99
        Lb1:
            r13 = r1
            goto L22
        Lb4:
            int r6 = r6 + 1
            goto L3a
        Lb7:
            ylf r13 = r12.c
            ul r0 = new ul
            java.lang.Object r1 = r4.get(r2)
            bsz r1 = (defpackage.bsz) r1
            r0.<init>(r1)
            r13.a = r0
        Lc6:
            ygi r13 = defpackage.ygi.a
            return r13
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
