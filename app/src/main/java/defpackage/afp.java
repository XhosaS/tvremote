package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afp implements afq {
    private final ContentInfo.Builder a;

    public afp(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.afq
    public final afv a() {
        return new afv(new afs(this.a.build()));
    }

    @Override // defpackage.afq
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.afq
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.afq
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
