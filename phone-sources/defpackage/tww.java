package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tww {
    public final tyj a;
    public final String b;

    public tww(tyj tyjVar, String str) {
        tyjVar.getClass();
        this.a = tyjVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tww) {
            tww twwVar = (tww) obj;
            if (this.a.equals(twwVar.a) && this.b.equals(twwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return str.hashCode() ^ this.a.hashCode();
    }
}
