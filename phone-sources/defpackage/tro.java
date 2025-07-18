package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tro extends tru {
    public static final tsa a = new tro();

    public tro() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return c <= 127;
    }
}
