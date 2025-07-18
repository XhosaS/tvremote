package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aaap implements aaat {
    public final /* synthetic */ aaaq a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aaap(aaaq aaaqVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = aaaqVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.aaat
    public final void a() {
        if (this.d == 0) {
            aaaq aaaqVar = this.a;
            Object obj = this.c;
            aaaqVar.a.onRedirectReceived(aaaqVar.d, this.b, (String) obj);
            return;
        }
        aaaq aaaqVar2 = this.a;
        aaas aaasVar = aaaqVar2.d;
        if (aaasVar.g.compareAndSet(5, 4)) {
            Object obj2 = this.c;
            aaaqVar2.a.onReadCompleted(aaasVar, this.b, (ByteBuffer) obj2);
        }
    }
}
