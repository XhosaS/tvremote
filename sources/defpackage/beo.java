package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class beo extends bfj {
    private final Context a;
    private String d;
    private final Object c = new Object();
    private final bfi b = new ber(null);

    public beo(asv asvVar) {
        this.a = (Context) asvVar.a;
    }

    private final boolean h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    private static final void i() throws bet {
        throw new bet("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.bfj
    protected final Uri a(Uri uri) throws beu {
        if (h(uri)) {
            throw new beu("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        int i = bzs.d;
        bzo bzoVar = new bzo();
        builderPath.path(fileC.getAbsolutePath());
        return builderPath.encodedFragment(bfb.a(bzoVar.f())).build();
    }

    @Override // defpackage.bfj
    protected final bfi b() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    @Override // defpackage.bfj, defpackage.bfi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File c(android.net.Uri r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.beo.c(android.net.Uri):java.io.File");
    }

    @Override // defpackage.bfj, defpackage.bfi
    public final InputStream d(Uri uri) throws bet {
        if (!h(uri)) {
            return this.b.d(a(uri));
        }
        i();
        throw null;
    }

    @Override // defpackage.bfi
    public final String e() {
        return "android";
    }

    @Override // defpackage.bfj, defpackage.bfi
    public final boolean f(Uri uri) throws bet {
        if (!h(uri)) {
            return this.b.f(a(uri));
        }
        i();
        throw null;
    }
}
