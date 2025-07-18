package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gst extends fki {
    public final int a;

    public gst(int i) {
        super((short[]) null);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gst) && this.a == ((gst) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
