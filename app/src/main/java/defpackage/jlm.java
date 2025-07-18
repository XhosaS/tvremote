package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jlm extends agtu implements agux {
    final /* synthetic */ jlp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlm(jlp jlpVar, agsw agswVar) {
        super(1, agswVar);
        this.a = jlpVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jlm(this.a, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.f.b();
        return agpu.a;
    }
}
