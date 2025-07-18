package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lml {
    public final ExoPlayer a;
    public String b;
    public fdg c;
    public volatile cvi d;
    private egc e;

    public lml(ExoPlayer exoPlayer) {
        this.a = exoPlayer;
    }

    public final synchronized void a(fdg fdgVar) {
        if (this.d == null) {
            this.c = fdgVar;
            this.d = new cvi(this.e, this.b, fdgVar);
        }
    }

    public final synchronized void b(egc egcVar, String str) {
        this.e = egcVar;
        this.b = str;
    }
}
