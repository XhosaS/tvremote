package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqo implements hqg, hqp {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public hqo(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.hqp
    public final hlu a(Uri uri) {
        int i = this.b;
        return i != 0 ? i != 1 ? new hmk(this.a, uri) : new hlq(this.a, uri) : new hmc(this.a, uri);
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new hqq(this) : new hqq(this) : new hqq(this);
    }
}
