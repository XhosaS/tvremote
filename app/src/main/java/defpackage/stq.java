package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stq {
    public final String a = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof stq) && agvy.c(this.a, ((stq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotOwned(actualOwnerApp=" + this.a + ")";
    }
}
