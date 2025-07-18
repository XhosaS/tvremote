package j$.time.format;

/* loaded from: classes2.dex */
public final class m implements g {
    public final String a;

    public m(String str) {
        this.a = str;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }
}
