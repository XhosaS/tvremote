package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuu implements cut {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public cuu(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.cut
    public final cuy a() {
        return new cuy(new cux(this));
    }

    @Override // defpackage.cut
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.cut
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.cut
    public final void d(Uri uri) {
        this.d = uri;
    }
}
