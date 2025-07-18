package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mtq extends jwq {
    final /* synthetic */ mtr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtq(mtr mtrVar) {
        super(null, null);
        this.a = mtrVar;
    }

    @Override // defpackage.jwq
    public final void Z() {
        this.a.b.c(7);
    }

    @Override // defpackage.jwq
    public final void aa() {
        mtr mtrVar = this.a;
        mtrVar.e = true;
        if (mtrVar.f) {
            mtrVar.b.c(4);
        }
    }

    @Override // defpackage.jwq
    public final void ab() {
        this.a.b.c(7);
    }

    @Override // defpackage.jwq
    public final void ac() {
        mtr mtrVar = this.a;
        mtrVar.f = true;
        if (mtrVar.e) {
            mtrVar.b.c(4);
        }
    }
}
