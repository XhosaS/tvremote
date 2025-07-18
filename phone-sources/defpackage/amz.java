package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amz extends yiy implements yjz {
    int a;
    final /* synthetic */ amf b;
    final /* synthetic */ agb c;
    final /* synthetic */ ybo d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amz(amf amfVar, ybo yboVar, agb agbVar, yih yihVar, int i) {
        super(yihVar);
        this.f = i;
        this.b = amfVar;
        this.d = yboVar;
        this.c = agbVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((amz) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((amz) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f != 0) {
            amz amzVar = new amz(this.b, this.d, this.c, yihVar, 1);
            amzVar.e = obj;
            return amzVar;
        }
        amz amzVar2 = new amz(this.d, this.b, this.c, yihVar, 0);
        amzVar2.e = obj;
        return amzVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (defpackage.hw.E(r5, r1, r2, r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (defpackage.hw.p(r5, r1, r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        if (defpackage.hw.F(r6, r1, r7, r11, r10) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        if (defpackage.hw.q(r6, r1, r11, r10) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        if (defpackage.hw.r(r6, r1, r11, r10) == r0) goto L61;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amz(ybo yboVar, amf amfVar, agb agbVar, yih yihVar, int i) {
        super(yihVar);
        this.f = i;
        this.d = yboVar;
        this.b = amfVar;
        this.c = agbVar;
    }
}
