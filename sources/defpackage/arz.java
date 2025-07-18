package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arz {
    public final cyb a;
    public final bzs b;

    public arz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arz) {
            arz arzVar = (arz) obj;
            if (this.a.equals(arzVar.a) && biu.h(this.b, arzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        cyb cybVar = this.a;
        if (cybVar.A()) {
            iJ = cybVar.j();
        } else {
            int iJ2 = cybVar.s;
            if (iJ2 == 0) {
                iJ2 = cybVar.j();
                cybVar.s = iJ2;
            }
            iJ = iJ2;
        }
        return ((iJ ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        bzs bzsVar = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + bzsVar.toString() + "}";
    }

    public arz(cyb cybVar, bzs bzsVar) {
        if (cybVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = cybVar;
        if (bzsVar == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = bzsVar;
    }
}
