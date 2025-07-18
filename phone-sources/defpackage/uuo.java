package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uuo extends Exception {
    public uuo(Throwable th) {
        super(th);
        setStackTrace(tym.b(tun.class, -1, 2));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
