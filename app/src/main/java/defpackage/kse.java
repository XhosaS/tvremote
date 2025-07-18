package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kse extends ksg {
    final /* synthetic */ String a;
    final /* synthetic */ kqw b;
    final /* synthetic */ ksp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kse(ksp kspVar, String str, kqw kqwVar) {
        super(kspVar, true);
        this.a = str;
        this.b = kqwVar;
        this.c = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.c.f;
        kkk.k(kqzVar);
        kqzVar.getMaxUserProperties(this.a, this.b);
    }

    @Override // defpackage.ksg
    protected final void b() {
        this.b.f(null);
    }
}
