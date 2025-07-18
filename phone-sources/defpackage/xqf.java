package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqf implements xqg {
    public static final xqg a = new xqf(0);
    private final /* synthetic */ int b;

    public xqf(int i) {
        this.b = i;
    }

    @Override // defpackage.xqq
    public final InputStream a(InputStream inputStream) {
        return this.b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.xqh, defpackage.xqq
    public final String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}
