package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ari extends yiz implements yjz {
    int a;
    final /* synthetic */ mr b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ wq e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ari(mr mrVar, float f, boolean z, ard ardVar, wq wqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.b = mrVar;
        this.c = f;
        this.d = z;
        this.f = ardVar;
        this.e = wqVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((ari) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ari) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.g != 0) {
            return new ari(this.b, this.c, this.d, (ard) this.f, this.e, yihVar, 1);
        }
        return new ari(this.b, this.c, this.d, (arj) this.f, this.e, yihVar, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r11.e(r1, r10) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (defpackage.ayr.a(r11, r7, r1, r3, r10) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r11.e(r1, r10) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
    
        if (defpackage.ayr.a(r11, r7, r1, r3, r10) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
    
        return r0;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ari.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ari(mr mrVar, float f, boolean z, arj arjVar, wq wqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.g = i;
        this.b = mrVar;
        this.c = f;
        this.d = z;
        this.f = arjVar;
        this.e = wqVar;
    }
}
