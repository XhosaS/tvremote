package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awk {
    public final bol a;
    public final bol b;
    public final bol c;

    public awk(bol bolVar, bol bolVar2, bol bolVar3) {
        this.a = bolVar;
        this.b = bolVar2;
        this.c = bolVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof awk)) {
            return false;
        }
        awk awkVar = (awk) obj;
        return yks.e(this.a, awkVar.a) && yks.e(this.b, awkVar.b) && yks.e(this.c, awkVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        bol bolVar = this.c;
        return bolVar != null ? (iHashCode * 31) + bolVar.hashCode() : iHashCode;
    }
}
