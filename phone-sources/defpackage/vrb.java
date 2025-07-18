package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrb implements vqz {
    public final vql a;

    public vrb(vql vqlVar) {
        this.a = vqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrb) && yks.e(this.a, ((vrb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Paragraph(text=" + this.a + ")";
    }
}
