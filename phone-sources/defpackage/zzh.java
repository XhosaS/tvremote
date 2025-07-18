package defpackage;

import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzh implements zzs {
    public final /* synthetic */ zzi a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ zzh(zzi zziVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = zziVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.zzs
    public final Object a() {
        if (this.d != 0) {
            UrlResponseInfo urlResponseInfo = this.b;
            zzi zziVar = this.a;
            Object obj = this.c;
            zzl zzlVarB = zzl.b(urlResponseInfo);
            zziVar.a.onReadCompleted(zziVar.b, zzlVarB, (ByteBuffer) obj);
            return null;
        }
        UrlResponseInfo urlResponseInfo2 = this.b;
        zzi zziVar2 = this.a;
        Object obj2 = this.c;
        zzl zzlVarB2 = zzl.b(urlResponseInfo2);
        zziVar2.a.onRedirectReceived(zziVar2.b, zzlVarB2, (String) obj2);
        return null;
    }
}
