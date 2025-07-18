package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chk extends chl {
    public final int a;

    public chk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chk) && this.a == ((chk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
