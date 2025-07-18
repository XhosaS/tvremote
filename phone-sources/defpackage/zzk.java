package defpackage;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zzk extends ExperimentalUrlRequest {
    private final UrlRequest a;
    private final zyz b;
    private final String c;
    private final Collection d;
    private final aabc e;

    public zzk(UrlRequest urlRequest, zyz zyzVar, String str, Collection collection, RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = zyzVar;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new aabc(listener);
    }

    final void a(int i, zzl zzlVar, CronetException cronetException) {
        zzd.a(this.b, this.c, this.d, this.e, i, zzlVar, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new zzj(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
