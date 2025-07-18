package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfn implements ysy {
    final /* synthetic */ ylf a;
    final /* synthetic */ ysy b;
    final /* synthetic */ String[] c;
    final /* synthetic */ int[] d;

    public gfn(ylf ylfVar, ysy ysyVar, String[] strArr, int[] iArr) {
        this.a = ylfVar;
        this.b = ysyVar;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r13.emit(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r13.emit(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ysy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(int[] r12, defpackage.yih r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.gfm
            if (r0 == 0) goto L13
            r0 = r13
            gfm r0 = (defpackage.gfm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gfm r0 = new gfm
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            int[] r12 = r0.d
            defpackage.ybn.f(r13)
            goto L97
        L35:
            defpackage.ybn.f(r13)
            ylf r13 = r11.a
            java.lang.Object r2 = r13.a
            if (r2 != 0) goto L51
            ysy r13 = r11.b
            java.lang.String[] r2 = r11.c
            java.util.Set r2 = defpackage.yfm.aZ(r2)
            r0.d = r12
            r0.c = r4
            java.lang.Object r13 = r13.emit(r2, r0)
            if (r13 != r1) goto L97
            goto L96
        L51:
            java.lang.String[] r2 = r11.c
            int[] r4 = r11.d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = r6
        L5c:
            int r8 = r2.length
            if (r6 >= r8) goto L80
            r8 = r2[r6]
            int r9 = r7 + 1
            java.lang.Object r10 = r13.a
            if (r10 == 0) goto L78
            int[] r10 = (int[]) r10
            r7 = r4[r7]
            r10 = r10[r7]
            r7 = r12[r7]
            if (r10 == r7) goto L74
            r5.add(r8)
        L74:
            int r6 = r6 + 1
            r7 = r9
            goto L5c
        L78:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Required value was null."
            r12.<init>(r13)
            throw r12
        L80:
            boolean r13 = r5.isEmpty()
            if (r13 != 0) goto L97
            ysy r13 = r11.b
            java.util.Set r2 = defpackage.yfm.aq(r5)
            r0.d = r12
            r0.c = r3
            java.lang.Object r13 = r13.emit(r2, r0)
            if (r13 != r1) goto L97
        L96:
            return r1
        L97:
            ylf r13 = r11.a
            r13.a = r12
            ygi r12 = defpackage.ygi.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfn.emit(int[], yih):java.lang.Object");
    }
}
