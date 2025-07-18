package defpackage;

import com.google.android.tv.remote.service.RemoteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bou extends bta {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/KeyboardFeature");
    public final RemoteService b;
    public final crv c;
    public Boolean d;
    public int e;
    public int f;

    public bou(RemoteService remoteService, crv crvVar) {
        this.b = remoteService;
        this.c = crvVar;
    }

    @Override // defpackage.bta
    protected final btc b(bug bugVar) {
        if (this.b.g()) {
            return new bot(this);
        }
        return null;
    }

    @Override // defpackage.bta
    public final void c(bxj bxjVar) {
        if (!this.b.g()) {
            bxjVar.d("Keyboard feature is not available");
            return;
        }
        bxjVar.d("Keyboard feature is available");
        if (Boolean.TRUE.equals(this.d)) {
            bxjVar.d("\tWith alternative input bridge");
        }
        bxjVar.c("\tTotal keys injected %d/%d%n", Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
