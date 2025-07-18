package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahdr extends ahar {
    private final ahdv f;

    public ahdr(agsw agswVar, ahdv ahdvVar) {
        super(agswVar, 1);
        this.f = ahdvVar;
    }

    @Override // defpackage.ahar
    protected final String p() {
        return "AwaitContinuation";
    }

    @Override // defpackage.ahar
    public final Throwable q(ahdl ahdlVar) {
        Throwable thC;
        Object obj = this.f.d.a;
        return (!(obj instanceof ahdt) || (thC = ((ahdt) obj).c()) == null) ? obj instanceof ahbc ? ((ahbc) obj).b : ahdlVar.o() : thC;
    }
}
