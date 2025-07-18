package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luf {
    public final ImmutableList a;
    private final tst b;

    public luf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luf) {
            luf lufVar = (luf) obj;
            if (this.a.equals(lufVar.a) && this.b.equals(lufVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "GetUserSentimentsResponse{userSentiments=" + this.a.toString() + ", updateToken=Optional.absent()}";
    }

    public luf(ImmutableList immutableList, tst tstVar) {
        if (immutableList == null) {
            throw new NullPointerException("Null userSentiments");
        }
        this.a = immutableList;
        this.b = tstVar;
    }
}
