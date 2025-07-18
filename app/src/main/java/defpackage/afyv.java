package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afyv extends afow {
    final /* synthetic */ afzy a;
    final /* synthetic */ afyx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyv(afyx afyxVar, afzy afzyVar) {
        super(afyxVar.a);
        this.a = afzyVar;
        this.b = afyxVar;
    }

    @Override // defpackage.afow
    public final void a() {
        try {
            int i = agfd.a;
            this.b.a().d(this.a);
        } catch (Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
