package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egz extends UrlRequest.StatusListener {
    final /* synthetic */ int[] a;
    final /* synthetic */ shx b;

    public egz(int[] iArr, shx shxVar) {
        this.a = iArr;
        this.b = shxVar;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a[0] = i;
        this.b.g();
    }
}
