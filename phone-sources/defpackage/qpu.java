package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpu {
    public final Set a;
    public final String b = null;

    public /* synthetic */ qpu(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpu)) {
            return false;
        }
        qpu qpuVar = (qpu) obj;
        if (!yks.e(this.a, qpuVar.a)) {
            return false;
        }
        String str = qpuVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "AccountRegistrationInfo(notificationChannels=" + this.a + ", delegateGaiaActualAccountName=null)";
    }
}
