package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ecx extends dyc {
    final /* synthetic */ edf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecx(edf edfVar, dyc dycVar) {
        super(dycVar);
        this.a = edfVar;
    }

    @Override // defpackage.dyc
    public final void a(dyc dycVar) {
        try {
            this.a.n();
        } catch (IndexOutOfBoundsException e) {
            edf edfVar = this.a;
            throw edf.d(edfVar, edfVar.i, e);
        }
    }
}
