package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mbe extends jwq {
    final /* synthetic */ mbf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbe(mbf mbfVar) {
        super(null, null);
        this.a = mbfVar;
    }

    @Override // defpackage.jwq
    public final void Z() {
        this.a.b.c(7);
    }

    @Override // defpackage.jwq
    public final void aa() {
        mbf mbfVar = this.a;
        mbfVar.f = true;
        if (mbfVar.g) {
            mbfVar.b.c(4);
        }
    }

    @Override // defpackage.jwq
    public final void ab() {
        this.a.b.c(7);
    }

    @Override // defpackage.jwq
    public final void ac() {
        mbf mbfVar = this.a;
        mbfVar.g = true;
        if (mbfVar.f) {
            mbfVar.b.c(4);
        }
    }
}
