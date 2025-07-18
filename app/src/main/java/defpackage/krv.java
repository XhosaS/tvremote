package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krv extends ksg {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ksp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krv(ksp kspVar, Runnable runnable) {
        super(kspVar, true);
        this.a = runnable;
        this.b = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.b.f;
        kkk.k(kqzVar);
        kqzVar.retrieveAndUploadBatches(new kru(this.a));
    }
}
