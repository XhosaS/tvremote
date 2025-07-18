package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rei {
    public final String a;
    public final tst b;

    public rei() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rei) {
            rei reiVar = (rei) obj;
            if (this.a.equals(reiVar.a) && this.b.equals(reiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TextViewData{title=" + this.a + ", titleContentDescription=" + this.b.toString() + "}";
    }

    public rei(String str, tst tstVar) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
        if (tstVar == null) {
            throw new NullPointerException("Null titleContentDescription");
        }
        this.b = tstVar;
    }
}
