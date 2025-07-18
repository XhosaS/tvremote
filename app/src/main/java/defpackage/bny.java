package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bny extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ bls[] h;
    final /* synthetic */ boa i;
    final /* synthetic */ bng j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bny(bls[] blsVarArr, boa boaVar, bng bngVar, agsw agswVar) {
        super(2, agswVar);
        this.h = blsVarArr;
        this.i = boaVar;
        this.j = bngVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bny) c((bog) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((defpackage.boa) r6).d(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (((defpackage.boa) r6).c(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0087 -> B:25:0x0088). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            agtg r0 = defpackage.agtg.a
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
            defpackage.agpl.b(r11)
            r11 = r5
            r5 = r4
            goto L88
        L28:
            defpackage.agpl.b(r11)
            bls[] r11 = r10.h
            boa r1 = r10.i
            bng r3 = r10.j
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
            bls[] r4 = (defpackage.bls[]) r4
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
            bnl r4 = defpackage.boa.a
            r4 = r6
            boa r4 = (defpackage.boa) r4
            java.lang.Object r4 = r4.d(r11, r5, r10)
            if (r4 == r0) goto L86
            goto L87
        L66:
            agpg r11 = new agpg
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
            bnl r4 = defpackage.boa.a
            r4 = r6
            boa r4 = (defpackage.boa) r4
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
            agpu r11 = defpackage.agpu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bny.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bny(this.h, this.i, this.j, agswVar);
    }
}
