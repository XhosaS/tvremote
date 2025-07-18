package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lug {
    public final ksn a;
    public final ImmutableList b;
    private final String c;

    public lug() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lug) {
            lug lugVar = (lug) obj;
            if (this.a.equals(lugVar.a) && this.b.equals(lugVar.b) && this.c.equals(lugVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.b;
        return "UpdateUserSentimentsRequest{account=" + this.a.toString() + ", userSentiments=" + immutableList.toString() + ", updateToken=" + this.c + "}";
    }

    public lug(ksn ksnVar, ImmutableList immutableList, String str) {
        this.a = ksnVar;
        if (immutableList == null) {
            throw new NullPointerException("Null userSentiments");
        }
        this.b = immutableList;
        if (str == null) {
            throw new NullPointerException("Null updateToken");
        }
        this.c = str;
    }
}
