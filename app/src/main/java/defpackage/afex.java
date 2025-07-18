package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afex implements afez {
    @Override // defpackage.affu
    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    @Override // defpackage.affa
    public final OutputStream b(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    @Override // defpackage.affa, defpackage.affu
    public final String c() {
        return "gzip";
    }
}
