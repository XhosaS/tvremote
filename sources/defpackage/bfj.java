package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bfj implements bfi {
    protected Uri a(Uri uri) {
        throw null;
    }

    protected abstract bfi b();

    @Override // defpackage.bfi
    public /* synthetic */ File c(Uri uri) {
        throw null;
    }

    @Override // defpackage.bfi
    public InputStream d(Uri uri) {
        throw null;
    }

    @Override // defpackage.bfi
    public boolean f(Uri uri) {
        throw null;
    }

    @Override // defpackage.bfi
    public final void g(Uri uri, Uri uri2) {
        b().g(a(uri), a(uri2));
    }

    @Override // defpackage.bfi
    public final OutputStream j(Uri uri) {
        return b().j(a(uri));
    }

    @Override // defpackage.bfi
    public final void k(Uri uri) {
        b().k(a(uri));
    }
}
