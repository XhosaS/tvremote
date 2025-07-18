package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahdi extends ahdq {
    private final agux a;
    private final agzv b = new agzv(false, agzz.a);

    public ahdi(agux aguxVar) {
        this.a = aguxVar;
    }

    @Override // defpackage.ahdq
    public final void b(Throwable th) {
        if (this.b.c()) {
            this.a.a(th);
        }
    }

    @Override // defpackage.ahdq
    public final boolean c() {
        return true;
    }
}
