package defpackage;

import android.net.http.HeaderBlock;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zyx extends UrlResponseInfo.HeaderBlock {
    private final HeaderBlock a;

    public zyx(HeaderBlock headerBlock) {
        this.a = headerBlock;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final List<Map.Entry<String, String>> getAsList() {
        return this.a.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final Map<String, List<String>> getAsMap() {
        return this.a.getAsMap();
    }
}
