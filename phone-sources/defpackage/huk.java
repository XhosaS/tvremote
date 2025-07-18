package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class huk implements hwj {
    final /* synthetic */ Context a;

    public huk(Context context) {
        this.a = context;
    }

    @Override // defpackage.hwj
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
