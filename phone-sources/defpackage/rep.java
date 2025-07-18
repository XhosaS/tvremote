package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rep {
    public final tst a;
    public final tst b;
    public final boolean c;

    public rep() {
        throw null;
    }

    public static reo a() {
        reo reoVar = new reo(null);
        reoVar.b(false);
        return reoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rep) {
            rep repVar = (rep) obj;
            if (this.a.equals(repVar.a) && this.b.equals(repVar.b) && this.c == repVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        tst tstVar = this.b;
        return "TextualCardTrailingTitle{textViewData=" + String.valueOf(this.a) + ", icon=" + String.valueOf(tstVar) + ", hasCaptionStyle=" + this.c + "}";
    }

    public rep(tst tstVar, tst tstVar2, boolean z) {
        this.a = tstVar;
        this.b = tstVar2;
        this.c = z;
    }
}
