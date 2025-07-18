package defpackage;

import android.util.Log;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahzh extends aicn {
    private static final String b = "aicn";
    private static boolean c;

    private ahzh(String str, Collection collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(str, collection, metrics, i, urlResponseInfo, cronetException);
    }

    static void a(ahzd ahzdVar, String str, Collection collection, aics aicsVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        ahzdVar.a(new ahzh(str, collection, new aiaj(), i, urlResponseInfo, cronetException), aicsVar);
    }

    @Override // defpackage.aicn, org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!c) {
            Log.i(b, "RequestFinishedInfo.getMetrics() is unsupported when HttpEngineNativeProvider is used. The Metrics object will return null values.");
            c = true;
        }
        return this.a;
    }
}
