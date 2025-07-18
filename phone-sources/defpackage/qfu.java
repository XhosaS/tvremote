package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfu extends yiz implements yjz {
    int a;
    final /* synthetic */ qfx b;
    final /* synthetic */ qfi c;
    final /* synthetic */ qdo d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfu(qfx qfxVar, qfi qfiVar, qdo qdoVar, long j, long j2, yih yihVar) {
        super(2, yihVar);
        this.b = qfxVar;
        this.c = qfiVar;
        this.d = qdoVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qfu) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new qfu(this.b, this.c, this.d, this.e, this.f, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            qfx qfxVar = this.b;
            qfi qfiVar = this.c;
            qdo qdoVar = this.d;
            long j = this.e;
            long j2 = this.f;
            this.a = 1;
            if (qfxVar.i(qfiVar, qdoVar, j, j2, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
