package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krj implements iej {
    private final iej a;
    private final idb b;
    private boolean c;

    public krj(iej iejVar, idb idbVar) {
        this.a = iejVar;
        this.b = idbVar;
        this.c = idbVar.a();
    }

    @Override // defpackage.iej
    public final void dM() {
        boolean zA = this.b.a();
        if (this.c != zA) {
            this.c = zA;
            this.a.dM();
        }
    }
}
