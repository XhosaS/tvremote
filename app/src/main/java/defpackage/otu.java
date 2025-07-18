package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes.dex */
class otu extends afev {
    public final Object a = new Object();
    public final qzv b;
    public boolean c;
    public int d;
    public int e;

    public otu(qzv qzvVar) {
        this.b = qzvVar;
    }

    @Override // defpackage.afev
    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                qzv qzvVar = this.b;
                qzvVar.b = SystemClock.elapsedRealtime() - qzvVar.a;
            }
        }
    }

    @Override // defpackage.afjy
    public final void b(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.afjy
    public final void c(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.afev
    public final void d(afeh afehVar) {
        synchronized (this.a) {
            qzv qzvVar = this.b;
            SocketAddress socketAddress = (SocketAddress) afehVar.b.get(afgf.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof afms) {
                    qzvVar.u = 2;
                } else if (socketAddress instanceof afkj) {
                    qzvVar.u = 3;
                }
            }
        }
    }
}
