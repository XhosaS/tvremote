package j$.time.format;

/* loaded from: classes2.dex */
public final class e implements g {
    public final char a;

    public e(char c) {
        this.a = c;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
