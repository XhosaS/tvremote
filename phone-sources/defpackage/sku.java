package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sku implements skt {
    @Override // defpackage.skt
    public final ska a() {
        return ((sju) j()).a;
    }

    @Override // defpackage.skt
    public /* synthetic */ File b(Uri uri) {
        throw null;
    }

    @Override // defpackage.skt
    public InputStream c(Uri uri) {
        throw null;
    }

    @Override // defpackage.skt
    public final OutputStream d(Uri uri) {
        return j().d(i(uri));
    }

    @Override // defpackage.skt
    public final void f(Uri uri) {
        j().f(i(uri));
    }

    @Override // defpackage.skt
    public final void g(Uri uri, Uri uri2) {
        j().g(i(uri), i(uri2));
    }

    @Override // defpackage.skt
    public boolean h(Uri uri) {
        throw null;
    }

    protected Uri i(Uri uri) {
        throw null;
    }

    protected abstract skt j();
}
