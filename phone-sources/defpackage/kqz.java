package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqz {
    public final String a;
    public final tst b;
    private final tst c;
    private final tst d;

    public kqz() {
        throw null;
    }

    public static nag a() {
        nag nagVar = new nag((byte[]) null, (byte[]) null, (char[]) null);
        nagVar.c = "";
        trk trkVar = trk.a;
        nagVar.d = trkVar;
        nagVar.a = trkVar;
        nagVar.b = trkVar;
        return nagVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqz) {
            kqz kqzVar = (kqz) obj;
            if (this.a.equals(kqzVar.a) && this.c.equals(kqzVar.c) && this.d.equals(kqzVar.d) && this.b.equals(kqzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        tst tstVar = this.b;
        tst tstVar2 = this.d;
        return "ActionContext{referrer=" + this.a + ", parentIntent=" + String.valueOf(this.c) + ", parentEventId=" + String.valueOf(tstVar2) + ", referringActivity=" + String.valueOf(tstVar) + "}";
    }

    public kqz(String str, tst tstVar, tst tstVar2, tst tstVar3) {
        this.a = str;
        this.c = tstVar;
        this.d = tstVar2;
        this.b = tstVar3;
    }
}
