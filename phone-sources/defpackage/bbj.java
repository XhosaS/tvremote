package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbj implements bda {
    private final yjv a;
    private bbk b;

    public bbj(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bda
    public final void cb() {
        this.b = (bbk) this.a.a(bbn.a);
    }

    @Override // defpackage.bda
    public final void dJ() {
        bbk bbkVar = this.b;
        if (bbkVar != null) {
            bbkVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.bda
    public final void dI() {
    }
}
