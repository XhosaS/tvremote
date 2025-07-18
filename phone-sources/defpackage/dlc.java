package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlc {
    public final djh a;
    public final djh b;

    public dlc() {
        this((djh) null, 3);
    }

    public static /* synthetic */ dlc a(dlc dlcVar, djh djhVar, djh djhVar2, int i) {
        if ((i & 1) != 0) {
            djhVar = dlcVar.a;
        }
        if ((i & 2) != 0) {
            djhVar2 = dlcVar.b;
        }
        return new dlc(djhVar, djhVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlc)) {
            return false;
        }
        dlc dlcVar = (dlc) obj;
        return yks.e(this.a, dlcVar.a) && yks.e(this.b, dlcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.a + ", nonSizeOrCornerModifiers=" + this.b + ')';
    }

    public dlc(djh djhVar, djh djhVar2) {
        this.a = djhVar;
        this.b = djhVar2;
    }

    public /* synthetic */ dlc(djh djhVar, int i) {
        this((i & 1) != 0 ? djh.b : null, (i & 2) != 0 ? djh.b : djhVar);
    }
}
