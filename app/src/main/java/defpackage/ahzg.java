package defpackage;

import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahzg extends QuicException {
    private final ahzf a;

    public ahzg(android.net.http.QuicException quicException) {
        super(quicException.getMessage(), quicException);
        this.a = new ahzf(quicException, true);
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
        return this.a.a.getErrorCode();
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
