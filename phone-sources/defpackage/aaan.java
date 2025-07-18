package defpackage;

import android.os.Trace;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aaan implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aaan(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            new zyg("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + ((String) this.a) + " running callback", 0);
            try {
                this.b.run();
                Trace.endSection();
                return;
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            Object obj = this.b;
            Object obj2 = this.a;
            try {
                ((aaaq) obj2).a.onSucceeded(((aaaq) obj2).d, (UrlResponseInfo) obj);
            } catch (Exception e) {
                ((aaaq) obj2).d.i("onSucceded", e);
            }
            aaaq aaaqVar = (aaaq) obj2;
            aaaqVar.c();
            aaaqVar.d.r.a();
            return;
        }
        if (i != 2) {
            Object obj3 = this.b;
            Object obj4 = this.a;
            try {
                ((aaaq) obj4).a.onCanceled(((aaaq) obj4).d, (UrlResponseInfo) obj3);
            } catch (Exception e2) {
                ((aaaq) obj4).d.i("onCanceled", e2);
            }
            aaaq aaaqVar2 = (aaaq) obj4;
            aaaqVar2.c();
            aaaqVar2.d.r.a();
            return;
        }
        new zyg("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + ((String) this.a) + " running callback", 0);
        try {
            this.b.run();
            Trace.endSection();
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public /* synthetic */ aaan(Runnable runnable, int i) {
        this.c = i;
        this.a = "onFailed";
        this.b = runnable;
    }
}
