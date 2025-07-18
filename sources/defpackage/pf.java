package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pf implements pg {
    private final ContentInfo.Builder a;

    public pf(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.pg
    public final pl a() {
        return new pl(new pi(this.a.build()));
    }

    @Override // defpackage.pg
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.pg
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.pg
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
