package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqw implements vqv {
    public final vqs a;

    public vqw(vqs vqsVar) {
        vqsVar.getClass();
        this.a = vqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqw) && yks.e(this.a, ((vqw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CardStackItemCard(card=" + this.a + ")";
    }
}
