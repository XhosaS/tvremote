package defpackage;

import java.net.URI;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aaao implements Runnable {
    public final /* synthetic */ UrlResponseInfo a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aaao(aaaq aaaqVar, UrlResponseInfo urlResponseInfo, CronetException cronetException, int i) {
        this.d = i;
        this.b = aaaqVar;
        this.a = urlResponseInfo;
        this.c = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            Object obj = this.b;
            aaas aaasVar = (aaas) obj;
            aaasVar.p = URI.create(aaasVar.m).resolve((String) this.c).toString();
            aaasVar.f.add(aaasVar.p);
            aaasVar.j(2, 3, new xxl(obj, this.a, 15, (short[]) null));
            return;
        }
        Object obj2 = this.c;
        UrlResponseInfo urlResponseInfo = this.a;
        Object obj3 = this.b;
        try {
            ((aaaq) obj3).a.onFailed(((aaaq) obj3).d, urlResponseInfo, (CronetException) obj2);
        } catch (Exception e) {
            ((aaaq) obj3).d.i("onFailed", e);
        }
        aaaq aaaqVar = (aaaq) obj3;
        aaaqVar.c();
        aaaqVar.d.r.a();
    }

    public /* synthetic */ aaao(aaas aaasVar, String str, UrlResponseInfo urlResponseInfo, int i) {
        this.d = i;
        this.b = aaasVar;
        this.c = str;
        this.a = urlResponseInfo;
    }
}
