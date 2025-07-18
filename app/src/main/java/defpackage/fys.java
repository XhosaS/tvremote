package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fys extends afga {
    final /* synthetic */ fyt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fys(fyt fytVar, afeq afeqVar) {
        super(afeqVar);
        this.a = fytVar;
    }

    @Override // defpackage.afgb, defpackage.afeq
    public final void a(afep afepVar, afih afihVar) {
        afepVar.getClass();
        afihVar.getClass();
        fyt fytVar = this.a;
        afihVar.d(fytVar.b);
        String str = fytVar.c;
        if (str != null && str.length() != 0) {
            afihVar.e(fyt.a, "Bearer ".concat(str));
        }
        this.c.a(afepVar, afihVar);
    }
}
