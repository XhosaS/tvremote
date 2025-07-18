package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsb {
    public final ImmutableList a;
    private final ImmutableMap b = null;

    public qsb(ImmutableList immutableList) {
        this.a = immutableList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsb)) {
            return false;
        }
        qsb qsbVar = (qsb) obj;
        if (!yks.e(this.a, qsbVar.a)) {
            return false;
        }
        ImmutableMap immutableMap = qsbVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "GnpChimeSignedInRegistrationData(gaiaAccountNames=" + this.a + ", delegatedGaiaOidToActualAccountName=null)";
    }
}
