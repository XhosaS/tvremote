package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amo {
    public final amn a;
    public final amn b;
    public final boolean c;

    public amo(amn amnVar, amn amnVar2, boolean z) {
        this.a = amnVar;
        this.b = amnVar2;
        this.c = z;
    }

    public static /* synthetic */ amo a(amo amoVar, amn amnVar, amn amnVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            amnVar = amoVar.a;
        }
        if ((i & 2) != 0) {
            amnVar2 = amoVar.b;
        }
        return new amo(amnVar, amnVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amo)) {
            return false;
        }
        amo amoVar = (amo) obj;
        return yks.e(this.a, amoVar.a) && yks.e(this.b, amoVar.b) && this.c == amoVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
