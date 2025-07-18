package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boc extends boe {
    public final bmy a;

    public boc(bmy bmyVar) {
        this.a = bmyVar;
    }

    @Override // defpackage.boe
    public final bmy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boc) && yks.e(this.a, ((boc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
