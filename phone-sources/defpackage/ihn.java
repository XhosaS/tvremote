package defpackage;

import android.os.FileObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihn extends FileObserver {
    final /* synthetic */ ihq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihn(ihq ihqVar, String str) {
        super(str, 1536);
        this.a = ihqVar;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        krd.f("Received event " + i + " for file " + str);
        krd.f("Cache was cleared. Terminating app");
        this.a.c.run();
    }
}
