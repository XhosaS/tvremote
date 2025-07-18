package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpa extends bta {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/PingFeature");
    public final Looper b;
    public final bsi c;

    public bpa(bsi bsiVar, Looper looper) {
        this.c = bsiVar;
        this.b = looper;
    }

    @Override // defpackage.bta
    protected final btc b(bug bugVar) {
        return new boz(this, bugVar);
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
    }
}
