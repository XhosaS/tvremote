package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfa extends zgi {
    final /* synthetic */ zfb a;

    public zfa(zfb zfbVar) {
        this.a = zfbVar;
    }

    @Override // defpackage.zgi
    protected final void a() {
        zfb zfbVar = this.a;
        zfbVar.k(9);
        zeu zeuVar = zfbVar.b;
        synchronized (zeuVar) {
            long j = zeuVar.m;
            long j2 = zeuVar.l;
            if (j >= j2) {
                zeuVar.l = j2 + 1;
                zeuVar.o = System.nanoTime() + 1000000000;
                zeuVar.h.e(new zer(String.valueOf(zeuVar.c).concat(" ping"), zeuVar));
            }
        }
    }

    public final void b() {
        if (f()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
