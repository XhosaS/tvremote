package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhw implements uhv {
    @Override // defpackage.uhv
    public final InputStream a(Uri uri, InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }

    @Override // defpackage.uhv
    public final OutputStream b(Uri uri, OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }

    @Override // defpackage.uhv
    public final String c() {
        return "compress";
    }

    @Override // defpackage.uhv
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        return uhu.a(this, outputStream);
    }

    @Override // defpackage.uhv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.uhv
    public final /* synthetic */ void f() {
    }
}
