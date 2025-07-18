package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afr implements afq {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public afr(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.afq
    public final afv a() {
        return new afv(new afu(this));
    }

    @Override // defpackage.afq
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.afq
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.afq
    public final void d(Uri uri) {
        this.d = uri;
    }
}
