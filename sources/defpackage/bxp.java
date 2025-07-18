package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxp implements byb {
    final /* synthetic */ bxk a;
    final /* synthetic */ byb b;

    public bxp(bxk bxkVar, byb bybVar) {
        this.a = bxkVar;
        this.b = bybVar;
    }

    @Override // defpackage.byb
    public final Object a(Object obj) {
        bxk bxkVarC = bwv.c(bwv.a(), this.a);
        try {
            return this.b.a(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
