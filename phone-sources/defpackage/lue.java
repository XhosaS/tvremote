package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lue {
    public final ksn a;
    public final ImmutableList b;
    private final String c;

    public lue() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lue) {
            lue lueVar = (lue) obj;
            if (this.a.equals(lueVar.a) && this.b.equals(lueVar.b) && this.c.equals(lueVar.c)) {
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
        return "GetUserSentimentsRequest{account=" + this.a.toString() + ", assetIds=" + immutableList.toString() + ", updateToken=" + this.c + "}";
    }

    public lue(ksn ksnVar, ImmutableList immutableList, String str) {
        this.a = ksnVar;
        if (immutableList == null) {
            throw new NullPointerException("Null assetIds");
        }
        this.b = immutableList;
        if (str == null) {
            throw new NullPointerException("Null updateToken");
        }
        this.c = str;
    }
}
