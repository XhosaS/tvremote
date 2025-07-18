package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yqc extends yqh {
    private final yjv a;
    private final ynr b = new ynr(false, ynv.a);

    public yqc(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.yqh
    public final void a(Throwable th) {
        if (this.b.b()) {
            this.a.a(th);
        }
    }

    @Override // defpackage.yqh
    public final boolean b() {
        return true;
    }
}
