package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjr extends sku {
    private final Context a;
    private final skt b;
    private final skt c;
    private final Object d = new Object();
    private String e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, skt] */
    public sjr(upc upcVar) {
        this.b = new sju((ska) upcVar.b);
        this.a = (Context) upcVar.a;
        this.c = upcVar.c;
    }

    private final void k() throws sjx {
        if (this.c == null) {
            throw new sjx("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean l(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    @Override // defpackage.sku, defpackage.skt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File b(android.net.Uri r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjr.b(android.net.Uri):java.io.File");
    }

    @Override // defpackage.sku, defpackage.skt
    public final InputStream c(Uri uri) throws sjx {
        if (!l(uri)) {
            return this.b.c(i(uri));
        }
        k();
        return this.c.c(uri);
    }

    @Override // defpackage.skt
    public final String e() {
        return "android";
    }

    @Override // defpackage.sku, defpackage.skt
    public final boolean h(Uri uri) throws sjx {
        if (!l(uri)) {
            return this.b.h(i(uri));
        }
        k();
        return this.c.h(uri);
    }

    @Override // defpackage.sku
    protected final Uri i(Uri uri) throws skb {
        if (l(uri)) {
            throw new skb("Operation across authorities is not allowed.");
        }
        File fileB = b(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        ImmutableList.Builder builder = ImmutableList.builder();
        builderPath.path(fileB.getAbsolutePath());
        return builderPath.encodedFragment(skk.a(builder.build())).build();
    }

    @Override // defpackage.sku
    protected final skt j() {
        return this.b;
    }
}
