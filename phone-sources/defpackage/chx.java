package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chx implements chv {
    private final CharSequence a;
    private final chw b;

    public chx(CharSequence charSequence, chw chwVar) {
        this.a = charSequence;
        this.b = chwVar;
    }

    @Override // defpackage.chv
    public final int b(int i) {
        do {
            i = this.b.a(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.chv
    public final int c(int i) {
        CharSequence charSequence;
        do {
            i = this.b.a(i);
            if (i != -1) {
                charSequence = this.a;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.chv
    public final int e(int i) {
        do {
            i = this.b.b(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.chv
    public final int f(int i) {
        do {
            i = this.b.b(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.a.charAt(i)));
        return i;
    }
}
