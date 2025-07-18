package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ph implements pg {
    final ClipData a;
    final int b;
    int c;
    Uri d;
    Bundle e;

    public ph(ClipData clipData, int i) {
        this.a = clipData;
        this.b = i;
    }

    @Override // defpackage.pg
    public final pl a() {
        return new pl(new pk(this));
    }

    @Override // defpackage.pg
    public final void b(Bundle bundle) {
        this.e = bundle;
    }

    @Override // defpackage.pg
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.pg
    public final void d(Uri uri) {
        this.d = uri;
    }
}
