package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ows extends xqe {
    public final Object a = new Object();
    public final rtg b;
    public boolean c;
    public int d;
    public int e;

    public ows(rtg rtgVar) {
        this.b = rtgVar;
    }

    @Override // defpackage.xqe
    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                rtg rtgVar = this.b;
                rtgVar.b = SystemClock.elapsedRealtime() - rtgVar.a;
            }
        }
    }

    @Override // defpackage.ykn
    public final void b(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.ykn
    public final void c(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.xqe
    public final void d(xpv xpvVar) {
        synchronized (this.a) {
            rtg rtgVar = this.b;
            SocketAddress socketAddress = (SocketAddress) xpvVar.a(xqx.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof xuh) {
                    rtgVar.v = 2;
                } else if (socketAddress instanceof xtt) {
                    rtgVar.v = 3;
                }
            }
        }
    }
}
