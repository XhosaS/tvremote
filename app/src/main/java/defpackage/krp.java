package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krp extends ksg {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ kqw c;
    final /* synthetic */ ksp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krp(ksp kspVar, String str, String str2, kqw kqwVar) {
        super(kspVar, true);
        this.a = str;
        this.b = str2;
        this.c = kqwVar;
        this.d = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.d.f;
        kkk.k(kqzVar);
        kqzVar.getConditionalUserProperties(this.a, this.b, this.c);
    }

    @Override // defpackage.ksg
    protected final void b() {
        this.c.f(null);
    }
}
