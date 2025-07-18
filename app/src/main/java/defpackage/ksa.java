package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksa extends ksg {
    final /* synthetic */ kqw a;
    final /* synthetic */ ksp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksa(ksp kspVar, kqw kqwVar) {
        super(kspVar, true);
        this.a = kqwVar;
        this.b = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.b.f;
        kkk.k(kqzVar);
        kqzVar.getCurrentScreenClass(this.a);
    }

    @Override // defpackage.ksg
    protected final void b() {
        this.a.f(null);
    }
}
