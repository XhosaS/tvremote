package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfs extends yiz implements yjz {
    int a;
    final /* synthetic */ qfx b;
    final /* synthetic */ qen c;
    final /* synthetic */ qfi d;
    final /* synthetic */ vku e;
    final /* synthetic */ qfn f;
    final /* synthetic */ qdo g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfs(qfx qfxVar, qen qenVar, qfi qfiVar, vku vkuVar, qfn qfnVar, qdo qdoVar, long j, long j2, yih yihVar) {
        super(2, yihVar);
        this.b = qfxVar;
        this.c = qenVar;
        this.d = qfiVar;
        this.e = vkuVar;
        this.f = qfnVar;
        this.g = qdoVar;
        this.h = j;
        this.i = j2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qfs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new qfs(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = ((ttd) ((rmk) this.b.b).a()).a;
            qen qenVar = this.c;
            qfi qfiVar = this.d;
            vku vkuVar = this.e;
            qfn qfnVar = this.f;
            qdo qdoVar = this.g;
            long j = this.h;
            long j2 = this.i;
            qfz qfzVar = qfnVar.b;
            this.a = 1;
            if (((ptr) obj2).b(qenVar, qfiVar, vkuVar, qfzVar, qdoVar, j, j2, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
