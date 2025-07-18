package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bjl implements bjk {
    private final bhn a = new bhn();

    @Override // defpackage.bjk
    public /* synthetic */ bjm d(bjm bjmVar, bjm bjmVar2, bjm bjmVar3) {
        return null;
    }

    public final void i(int i) {
        bhn bhnVar;
        int i2;
        do {
            bhnVar = this.a;
            i2 = bhnVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!bhnVar.compareAndSet(i2, i2 | i));
    }

    public final boolean j(int i) {
        return (i & this.a.get()) != 0;
    }
}
