package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rof {
    public final zaq a;
    public final ImmutableList b;

    public rof() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rof) {
            rof rofVar = (rof) obj;
            if (this.a.equals(rofVar.a) && this.b.equals(rofVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        zaq zaqVar = this.a;
        if (zaqVar.A()) {
            iJ = zaqVar.j();
        } else {
            int iJ2 = zaqVar.M;
            if (iJ2 == 0) {
                iJ2 = zaqVar.j();
                zaqVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((iJ ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + immutableList.toString() + "}";
    }

    public rof(zaq zaqVar, ImmutableList immutableList) {
        if (zaqVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = zaqVar;
        if (immutableList == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = immutableList;
    }
}
