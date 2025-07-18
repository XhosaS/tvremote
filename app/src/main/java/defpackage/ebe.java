package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ebe extends eay {
    final /* synthetic */ ebf b;

    public ebe(ebf ebfVar) {
        this.b = ebfVar;
    }

    @Override // defpackage.eay
    public final void c(long j) {
        ebf ebfVar = this.b;
        ebfVar.e = false;
        if (ebfVar.d) {
            if (ebfVar.f != j) {
                ebfVar.c.a(j);
                ebfVar.f = j;
            }
            if (ebfVar.d) {
                ebfVar.a();
            }
        }
    }
}
