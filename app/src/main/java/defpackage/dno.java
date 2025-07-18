package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
class dno implements dqe {
    final /* synthetic */ Context a;

    public dno(Context context) {
        this.a = context;
    }

    @Override // defpackage.dqe
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
