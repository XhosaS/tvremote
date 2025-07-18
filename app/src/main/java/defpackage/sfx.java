package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfx extends agtu implements agvb {
    final /* synthetic */ sge a;
    final /* synthetic */ sfk b;
    final /* synthetic */ sfk c;
    final /* synthetic */ sfg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfx(sge sgeVar, sfk sfkVar, sfk sfkVar2, sfg sfgVar, agsw agswVar) {
        super(2, agswVar);
        this.a = sgeVar;
        this.b = sfkVar;
        this.c = sfkVar2;
        this.d = sfgVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sfx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        return this.a.j.a(new agux() { // from class: sfw
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                ((sfl) obj2).a();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sfx(this.a, this.b, this.c, this.d, agswVar);
    }
}
