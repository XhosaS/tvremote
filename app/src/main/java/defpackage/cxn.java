package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxn {
    final String a = "androidx.slice.LIST";
    final int b = 1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof cxn)) {
            return false;
        }
        cxn cxnVar = (cxn) obj;
        if (!this.a.equals(cxnVar.a)) {
            return false;
        }
        int i = cxnVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return String.format("SliceSpec{%s,%d}", this.a, 1);
    }
}
