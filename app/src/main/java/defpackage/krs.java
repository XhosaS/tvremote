package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krs extends ksg {
    final /* synthetic */ String a;
    final /* synthetic */ ksp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krs(ksp kspVar, String str) {
        super(kspVar, true);
        this.a = str;
        this.b = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.b.f;
        kkk.k(kqzVar);
        kqzVar.beginAdUnitExposure(this.a, this.g);
    }
}
