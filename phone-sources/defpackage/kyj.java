package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyj {
    public final int a;
    private final ImmutableList b;

    public kyj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kyj)) {
            return false;
        }
        kyj kyjVar = (kyj) obj;
        int i = this.a;
        int i2 = kyjVar.a;
        if (i != 0) {
            return i == i2 && this.b.equals(kyjVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.bl(i);
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        return "OpenLibraryPageAction{tab=" + (i != 1 ? i != 2 ? "null" : "TV" : "MOVIES") + ", selectedFilters=" + String.valueOf(this.b) + "}";
    }

    public kyj(int i, ImmutableList immutableList) {
        this.a = i;
        this.b = immutableList;
    }
}
