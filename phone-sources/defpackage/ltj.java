package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltj extends ltk {
    public final String a;

    public ltj(String str) {
        this.a = str;
    }

    @Override // defpackage.ltk, defpackage.ltl
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ltl) {
            ltl ltlVar = (ltl) obj;
            ltlVar.b();
            if (this.a.equals(ltlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FetchToken{paginationToken=" + this.a + "}";
    }

    @Override // defpackage.ltl
    public final void b() {
    }
}
