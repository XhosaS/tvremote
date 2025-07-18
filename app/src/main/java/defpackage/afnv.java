package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afnv extends afow {
    final /* synthetic */ afep a;
    final /* synthetic */ afod b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnv(afod afodVar, afep afepVar) {
        super(afodVar.e);
        this.a = afepVar;
        this.b = afodVar;
    }

    @Override // defpackage.afow
    public final void a() {
        afod afodVar = this.b;
        afodVar.g(this.a, affq.a(afodVar.e), new afih());
    }
}
