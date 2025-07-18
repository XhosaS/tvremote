package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksb extends ksg {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ kqw d;
    final /* synthetic */ ksp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksb(ksp kspVar, String str, String str2, boolean z, kqw kqwVar) {
        super(kspVar, true);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = kqwVar;
        this.e = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.e.f;
        kkk.k(kqzVar);
        kqzVar.getUserProperties(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ksg
    protected final void b() {
        this.d.f(null);
    }
}
