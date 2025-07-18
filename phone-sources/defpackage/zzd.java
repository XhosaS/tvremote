package defpackage;

import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zzd extends aaax {
    private static boolean b;

    private zzd(String str, Collection collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(str, collection, metrics, i, urlResponseInfo, cronetException);
    }

    static void a(zyz zyzVar, String str, Collection collection, aabc aabcVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        zyzVar.a(new zzd(str, collection, new aaab(), i, urlResponseInfo, cronetException), aabcVar);
    }

    @Override // defpackage.aaax, org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!b) {
            b = true;
        }
        return this.a;
    }
}
