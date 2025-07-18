package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class trx extends tru {
    public static final tsa a = new trx();

    private trx() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return false;
    }

    @Override // defpackage.tsa
    public final boolean e(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.tsa
    public final boolean f(CharSequence charSequence) {
        return true;
    }

    @Override // defpackage.tsa
    public final int g(CharSequence charSequence) {
        return -1;
    }

    @Override // defpackage.tsa
    public final int h(CharSequence charSequence, int i) {
        sij.C(0, charSequence.length());
        return -1;
    }

    @Override // defpackage.tsa
    public final tsa d(tsa tsaVar) {
        return tsaVar;
    }
}
