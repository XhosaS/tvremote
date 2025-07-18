package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cus implements cut {
    private final ContentInfo.Builder a;

    public cus(ClipData clipData, int i) {
        this.a = new ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.cut
    public final cuy a() {
        return new cuy(new cuv(this.a.build()));
    }

    @Override // defpackage.cut
    public final void b(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // defpackage.cut
    public final void c(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.cut
    public final void d(Uri uri) {
        this.a.setLinkUri(uri);
    }
}
