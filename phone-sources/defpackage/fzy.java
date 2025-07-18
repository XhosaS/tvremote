package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzy extends fus {
    public final fzx a;
    public final int b;
    public final int c;
    public final int d;

    public fzy(fzx fzxVar, int i, int i2, int i3) {
        super((byte[]) null);
        this.a = fzxVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if (fzxVar == fzx.a) {
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
        }
        if (R() <= 0) {
            throw new IllegalArgumentException("Drop count must be > 0, but was " + R());
        }
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException("Invalid placeholdersRemaining " + i3);
    }

    public final int R() {
        return (this.c - this.b) + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzy)) {
            return false;
        }
        fzy fzyVar = (fzy) obj;
        return this.a == fzyVar.a && this.b == fzyVar.b && this.c == fzyVar.c && this.d == fzyVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 1) {
            str = "front";
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            str = "end";
        }
        return ylh.t("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.b + "\n                    |   maxPageOffset: " + this.c + "\n                    |   placeholdersRemaining: " + this.d + "\n                    |)");
    }
}
