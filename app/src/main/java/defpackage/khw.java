package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
class khw implements Runnable {
    final /* synthetic */ khy a;

    public khw(khy khyVar) {
        this.a = khyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.b(new ConnectionResult(1, 4, null, null));
    }
}
