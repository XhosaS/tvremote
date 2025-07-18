package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufo extends RuntimeException {
    public ufo() {
    }

    public ufo(byte[] bArr) {
        super("The caller is trying to acquire a lease on too much data.");
    }

    public ufo(Throwable th) {
        super(th);
    }
}
