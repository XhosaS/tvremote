package defpackage;

import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zzc extends QuicException {
    private final zzb a;

    public zzc(android.net.http.QuicException quicException) {
        super(quicException.getMessage(), quicException);
        this.a = new zzb(quicException, true);
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.a.isImmediatelyRetryable();
    }
}
