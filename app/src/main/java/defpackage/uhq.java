package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uhq implements uhp {
    @Override // defpackage.uhp
    public final long a(Uri uri) {
        return q().a(p(uri));
    }

    @Override // defpackage.uhp
    public final uft b() {
        return ((ufc) q()).a;
    }

    @Override // defpackage.uhp
    public /* synthetic */ File c(Uri uri) {
        throw null;
    }

    @Override // defpackage.uhp
    public InputStream d(Uri uri) {
        throw null;
    }

    @Override // defpackage.uhp
    public final OutputStream e(Uri uri) {
        return q().e(p(uri));
    }

    @Override // defpackage.uhp
    public final OutputStream f(Uri uri) {
        return q().f(p(uri));
    }

    @Override // defpackage.uhp
    public final Iterable g(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Iterator it = q().g(p(uri)).iterator();
        while (it.hasNext()) {
            arrayList.add(o((Uri) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.uhp
    public final void i(Uri uri) {
        q().i(p(uri));
    }

    @Override // defpackage.uhp
    public final void j(Uri uri) {
        q().j(p(uri));
    }

    @Override // defpackage.uhp
    public final void k(Uri uri) {
        q().k(p(uri));
    }

    @Override // defpackage.uhp
    public final void l(Uri uri, Uri uri2) {
        q().l(p(uri), p(uri2));
    }

    @Override // defpackage.uhp
    public boolean m(Uri uri) {
        throw null;
    }

    @Override // defpackage.uhp
    public final boolean n(Uri uri) {
        return q().n(p(uri));
    }

    protected Uri o(Uri uri) {
        throw null;
    }

    protected Uri p(Uri uri) {
        throw null;
    }

    protected abstract uhp q();
}
