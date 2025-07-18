package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aem implements bol {
    private final yka a;

    public aem(yka ykaVar) {
        this.a = ykaVar;
    }

    @Override // defpackage.bol
    public final boe a(long j, cmi cmiVar, clx clxVar) {
        bni bniVar = new bni((byte[]) null);
        this.a.a(bniVar, new bna(j), cmiVar);
        bniVar.c();
        return new bob(bniVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        aem aemVar = obj instanceof aem ? (aem) obj : null;
        return (aemVar != null ? aemVar.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
