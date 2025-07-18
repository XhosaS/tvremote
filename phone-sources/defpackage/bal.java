package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bal extends IllegalStateException {
    private final String a;

    public bal(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
