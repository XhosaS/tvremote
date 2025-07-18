package defpackage;

import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class trn extends tsa {
    private final char[] a;

    public trn(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.tsa
    public final void a(BitSet bitSet) {
        for (char c : this.a) {
            bitSet.set(c);
        }
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(tsa.l(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
