package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yqi extends yof {
    private final yql f;

    public yqi(yih yihVar, yql yqlVar) {
        super(yihVar, 1);
        this.f = yqlVar;
    }

    @Override // defpackage.yof
    protected final String m() {
        return "AwaitContinuation";
    }

    @Override // defpackage.yof
    public final Throwable n(yqe yqeVar) {
        Throwable thD;
        Object objEQ = this.f.eQ();
        return (!(objEQ instanceof yqk) || (thD = ((yqk) objEQ).d()) == null) ? objEQ instanceof yon ? ((yon) objEQ).b : yqeVar.q() : thD;
    }
}
