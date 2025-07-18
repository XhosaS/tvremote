package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyk implements yqi {
    final /* synthetic */ wwq a;
    final /* synthetic */ yqi b;

    public wyk(wwq wwqVar, yqi yqiVar) {
        this.a = wwqVar;
        this.b = yqiVar;
    }

    @Override // defpackage.yqi
    public final Object apply(Object obj) {
        wwq wwqVarG = wum.g(wum.c(), this.a);
        try {
            return this.b.apply(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
