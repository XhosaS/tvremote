package defpackage;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zzj implements UrlRequest$StatusListener {
    private final UrlRequest.StatusListener a;

    public zzj(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
