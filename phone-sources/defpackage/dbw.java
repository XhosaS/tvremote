package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbw extends yiz implements yjv {
    Object a;
    int b;
    final /* synthetic */ dbz c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbw(dbz dbzVar, yil yilVar, yjz yjzVar, yih yihVar, int i) {
        super(1, yihVar);
        this.f = i;
        this.c = dbzVar;
        this.d = yilVar;
        this.e = yjzVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        if (this.f != 0) {
            yih yihVar = (yih) obj;
            return new dbw((ylf) this.e, this.c, (yld) this.d, yihVar, 1).invokeSuspend(ygi.a);
        }
        return new dbw(this.c, (yil) this.d, (yjz) this.e, (yih) obj, 0).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(yih yihVar) {
        if (this.f == 0) {
            return new dbw(this.c, (yil) this.d, (yjz) this.e, yihVar, 0);
        }
        return new dbw((ylf) this.e, this.c, (yld) this.d, yihVar, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbw(ylf ylfVar, dbz dbzVar, yld yldVar, yih yihVar, int i) {
        super(1, yihVar);
        this.f = i;
        this.e = ylfVar;
        this.c = dbzVar;
        this.d = yldVar;
    }
}
