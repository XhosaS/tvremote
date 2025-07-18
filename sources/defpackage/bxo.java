package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxo implements cht {
    final /* synthetic */ bxk a;
    final /* synthetic */ cht b;

    public bxo(bxk bxkVar, cht chtVar) {
        this.a = bxkVar;
        this.b = chtVar;
    }

    @Override // defpackage.cht
    public final cja a(Object obj) {
        bxk bxkVarC = bwv.c(bwv.a(), this.a);
        try {
            cja cjaVarA = this.b.a(obj);
            if (cjaVarA != null) {
                return cjaVarA;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
