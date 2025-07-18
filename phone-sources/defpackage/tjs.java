package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjs extends Thread {
    final /* synthetic */ tjt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjs(tjt tjtVar) {
        super("PairingClient.Network.tearDown");
        this.a = tjtVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        tin tinVar = this.a.c;
        if (tinVar != null) {
            tinVar.d();
        }
    }
}
