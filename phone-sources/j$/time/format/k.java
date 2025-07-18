package j$.time.format;

/* loaded from: classes4.dex */
public final class k implements e {
    public final String a;

    public k(String str) {
        this.a = str;
    }

    @Override // j$.time.format.e
    public final boolean i(o oVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }
}
