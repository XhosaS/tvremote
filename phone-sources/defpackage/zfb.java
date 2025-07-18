package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfb {
    public final int a;
    public final zeu b;
    public long c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public final zez h;
    public final zey i;
    public final zfa j;
    public final zfa k;
    public IOException l;
    private final ArrayDeque m;
    private int n;

    public zfb(int i, zeu zeuVar, boolean z, boolean z2, zcc zccVar) {
        this.a = i;
        this.b = zeuVar;
        this.f = zeuVar.v.e();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.m = arrayDeque;
        this.h = new zez(this, zeuVar.u.e(), z2);
        this.i = new zey(this, z);
        this.j = new zfa(this);
        this.k = new zfa(this);
        if (zccVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(zccVar);
        }
    }

    private final boolean m(int i, IOException iOException) {
        byte[] bArr = zcr.a;
        synchronized (this) {
            if (this.n != 0) {
                return false;
            }
            this.n = i;
            this.l = iOException;
            notifyAll();
            if (this.h.b) {
                if (this.i.a) {
                    return false;
                }
            }
            this.b.b(this.a);
            return true;
        }
    }

    public final synchronized zcc a() {
        ArrayDeque arrayDeque;
        Object objRemoveFirst;
        zfa zfaVar = this.j;
        zfaVar.e();
        while (true) {
            try {
                arrayDeque = this.m;
                if (!arrayDeque.isEmpty() || this.n != 0) {
                    break;
                }
                f();
            } catch (Throwable th) {
                this.j.b();
                throw th;
            }
        }
        zfaVar.b();
        if (arrayDeque.isEmpty()) {
            IOException iOException = this.l;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.n;
            if (i == 0) {
                throw null;
            }
            throw new zfh(i);
        }
        objRemoveFirst = arrayDeque.removeFirst();
        objRemoveFirst.getClass();
        return (zcc) objRemoveFirst;
    }

    public final void b(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void c() {
        boolean z;
        boolean zH;
        byte[] bArr = zcr.a;
        synchronized (this) {
            zez zezVar = this.h;
            z = false;
            if (!zezVar.b && zezVar.e) {
                zey zeyVar = this.i;
                if (zeyVar.a || zeyVar.b) {
                    z = true;
                }
            }
            zH = h();
        }
        if (z) {
            j(9, null);
        } else {
            if (zH) {
                return;
            }
            this.b.b(this.a);
        }
    }

    public final void d() throws IOException {
        zey zeyVar = this.i;
        if (zeyVar.b) {
            throw new IOException("stream closed");
        }
        if (zeyVar.a) {
            throw new IOException("stream finished");
        }
        int i = this.n;
        if (i != 0) {
            IOException iOException = this.l;
            if (iOException == null) {
                throw new zfh(i);
            }
            throw iOException;
        }
    }

    public final void e(zcc zccVar, boolean z) {
        boolean zH;
        zccVar.getClass();
        byte[] bArr = zcr.a;
        synchronized (this) {
            if (this.g) {
                if (!z) {
                    z = false;
                    this.g = true;
                    this.m.add(zccVar);
                    if (z) {
                    }
                    zH = h();
                    notifyAll();
                }
                this.h.b = true;
                zH = h();
                notifyAll();
            } else {
                this.g = true;
                this.m.add(zccVar);
                if (z) {
                    this.h.b = true;
                }
                zH = h();
                notifyAll();
            }
        }
        if (zH) {
            return;
        }
        this.b.b(this.a);
    }

    public final void f() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean g() {
        return (this.a & 1) == 1;
    }

    public final synchronized boolean h() {
        if (this.n != 0) {
            return false;
        }
        zez zezVar = this.h;
        if (zezVar.b || zezVar.e) {
            zey zeyVar = this.i;
            if (zeyVar.a || zeyVar.b) {
                if (this.g) {
                    return false;
                }
            }
        }
        return true;
    }

    public final synchronized int i() {
        return this.n;
    }

    public final void j(int i, IOException iOException) {
        if (m(i, iOException)) {
            this.b.m(this.a, i);
        }
    }

    public final void k(int i) {
        if (m(i, null)) {
            this.b.n(this.a, i);
        }
    }

    public final synchronized void l(int i) {
        if (this.n == 0) {
            this.n = i;
            notifyAll();
        }
    }
}
