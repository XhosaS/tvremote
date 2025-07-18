package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afyw extends afow {
    final /* synthetic */ afyx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyw(afyx afyxVar) {
        super(afyxVar.a);
        this.a = afyxVar;
    }

    @Override // defpackage.afow
    public final void a() {
        try {
            int i = agfd.a;
            this.a.a();
        } catch (Throwable th) {
            this.a.f(th);
            throw th;
        }
    }
}
