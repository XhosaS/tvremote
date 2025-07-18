package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tra implements tsl {
    final /* synthetic */ tqt a;
    final /* synthetic */ tsl b;

    public tra(tqt tqtVar, tsl tslVar) {
        this.a = tqtVar;
        this.b = tslVar;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        tqt tqtVarE = tqg.e(tqg.d(), this.a);
        try {
            return this.b.apply(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
