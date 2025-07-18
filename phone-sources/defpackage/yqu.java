package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yqu extends yqh {
    private final yof a;

    public yqu(yof yofVar) {
        this.a = yofVar;
    }

    @Override // defpackage.yqh
    public final void a(Throwable th) {
        Object objEQ = e().eQ();
        boolean z = yoy.a;
        if (objEQ instanceof yon) {
            this.a.resumeWith(ybn.e(((yon) objEQ).b));
        } else {
            this.a.resumeWith(yqm.b(objEQ));
        }
    }

    @Override // defpackage.yqh
    public final boolean b() {
        return false;
    }
}
