package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krm extends ksg {
    final /* synthetic */ String a = "fcm";
    final /* synthetic */ String b = "_ln";
    final /* synthetic */ Object c;
    final /* synthetic */ ksp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krm(ksp kspVar, Object obj) {
        super(kspVar, true);
        this.c = obj;
        this.d = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.d.f;
        kkk.k(kqzVar);
        kqzVar.setUserProperty(this.a, this.b, new kmf(this.c), true, this.f);
    }
}
