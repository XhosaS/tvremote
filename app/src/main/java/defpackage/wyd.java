package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyd implements zvh {
    final /* synthetic */ wwq a;
    final /* synthetic */ zvh b;

    public wyd(wwq wwqVar, zvh zvhVar) {
        this.a = wwqVar;
        this.b = zvhVar;
    }

    @Override // defpackage.zvh
    public final zyd a() {
        wwl wwlVarC = wum.c();
        wwq wwqVarG = wum.g(wwlVarC, this.a);
        try {
            zyd zydVarA = this.b.a();
            wum.g(wwlVarC, wwqVarG);
            zydVarA.getClass();
            return zydVarA;
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
