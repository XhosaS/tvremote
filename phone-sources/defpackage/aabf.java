package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aabf extends UrlRequest.StatusListener {
    private final UrlRequest.StatusListener a;

    public aabf(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
