package j$.time.format;

/* loaded from: classes3.dex */
public final class l extends m {
    @Override // j$.time.format.m
    public final boolean b(char c, char c2) {
        return v.b(c, c2);
    }

    @Override // j$.time.format.m
    public final m d(String str, String str2, m mVar) {
        return new l(str, str2, mVar);
    }

    @Override // j$.time.format.m
    public final boolean e(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!v.b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
