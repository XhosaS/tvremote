package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tme extends Exception {
    public tme() {
    }

    public tme(Exception exc) {
        super(exc);
    }

    public tme(byte[] bArr) {
        super("Connection is not ready");
    }

    public tme(Exception exc, byte[] bArr) {
        super("Virtual Remote connection failed", exc);
    }
}
