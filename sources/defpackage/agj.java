package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agj extends UnsupportedOperationException {
    private final aes a;

    public agj(aes aesVar) {
        this.a = aesVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
