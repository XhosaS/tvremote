package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ig {
    public final int a;
    public final CharSequence b;

    public ig(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ig) {
            ig igVar = (ig) obj;
            if (this.a == igVar.a) {
                CharSequence charSequence = igVar.b;
                String strA = a(this.b);
                String strA2 = a(charSequence);
                if (strA == null && strA2 == null) {
                    return true;
                }
                if (strA != null && strA.equals(strA2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a(this.b)});
    }
}
