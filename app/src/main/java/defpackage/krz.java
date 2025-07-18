package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krz extends ksg {
    final /* synthetic */ kqw a;
    final /* synthetic */ ksp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krz(ksp kspVar, kqw kqwVar) {
        super(kspVar, true);
        this.a = kqwVar;
        this.b = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.b.f;
        kkk.k(kqzVar);
        kqzVar.getCurrentScreenName(this.a);
    }

    @Override // defpackage.ksg
    protected final void b() {
        this.a.f(null);
    }
}
