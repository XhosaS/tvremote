package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aku extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aku(alg algVar, long j, kw kwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = algVar;
        this.c = j;
        this.e = kwVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((aku) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((aku) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f != 0) {
            return new aku((qg) this.e, this.c, (kw) this.d, yihVar, 1);
        }
        return new aku((alg) this.d, this.c, (kw) this.e, yihVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Type inference failed for: r8v7, types: [bxv, java.lang.Object] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aku.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aku(qg qgVar, long j, kw kwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = qgVar;
        this.c = j;
        this.d = kwVar;
    }
}
