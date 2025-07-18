package j$.time.format;

/* loaded from: classes3.dex */
public final class k implements InterfaceC0062e {
    public final InterfaceC0062e a;
    public final int b;
    public final char c;

    public k(InterfaceC0062e interfaceC0062e, int i, char c) {
        this.a = interfaceC0062e;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC0062e
    public final boolean i(y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.i(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new j$.time.b("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    @Override // j$.time.format.InterfaceC0062e
    public final int l(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.b + i;
        if (length > charSequence.length()) {
            if (z) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && vVar.a(charSequence.charAt(i2), this.c)) {
            i2++;
        }
        int iL = this.a.l(vVar, charSequence.subSequence(0, length), i2);
        return (iL == length || !z) ? iL : ~(i + i2);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.a);
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + strValueOf + "," + this.b + str;
    }
}
