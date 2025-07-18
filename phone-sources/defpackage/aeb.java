package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeb extends bko {
    private aea a;

    public aeb(aea aeaVar) {
        this.a = aeaVar;
    }

    private final void e() {
        aea aeaVar = this.a;
        if (aeaVar instanceof aea) {
            aeaVar.getClass();
            aeaVar.a.n(this);
        }
    }

    public final void b(aea aeaVar) {
        e();
        if (aeaVar instanceof aea) {
            aeaVar.a.o(this);
        }
        this.a = aeaVar;
    }

    @Override // defpackage.bko
    public final void cd() {
        b(this.a);
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.bko
    public final void ch() {
        e();
    }
}
