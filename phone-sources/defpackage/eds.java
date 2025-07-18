package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eds implements ThreadFactory {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ eds(int i) {
        this.b = i;
        this.a = "ExoPlayer:AudioTrackReleaseThread";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.b != 0) {
            String str = edt.a;
            return new Thread(runnable, this.a);
        }
        String str2 = edt.a;
        return new Thread(runnable, this.a);
    }

    public /* synthetic */ eds(String str, int i) {
        this.b = i;
        this.a = str;
    }
}
