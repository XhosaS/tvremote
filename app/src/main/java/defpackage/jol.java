package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jol extends agtu implements agvb {
    final /* synthetic */ jot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jol(jot jotVar, agsw agswVar) {
        super(2, agswVar);
        this.a = jotVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jol) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        jot jotVar = this.a;
        jotVar.f.getPackageName().getClass();
        jotVar.l.p(!fbg.a(jotVar.c, r0));
        jotVar.o(jotVar.h.a);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jol(this.a, agswVar);
    }
}
