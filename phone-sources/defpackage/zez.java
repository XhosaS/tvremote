package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zez implements zho {
    public final long a;
    public boolean b;
    public final zgk c = new zgk();
    public final zgk d = new zgk();
    public boolean e;
    final /* synthetic */ zfb f;

    public zez(zfb zfbVar, long j, boolean z) {
        this.f = zfbVar;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) throws Throwable {
        Throwable th;
        Throwable zfhVar;
        boolean z;
        long jA;
        do {
            zfb zfbVar = this.f;
            synchronized (zfbVar) {
                zfa zfaVar = zfbVar.j;
                zfaVar.e();
                try {
                    th = null;
                    if (zfbVar.i() == 0 || this.b) {
                        zfhVar = null;
                    } else {
                        zfhVar = zfbVar.l;
                        if (zfhVar == null) {
                            int i = zfbVar.i();
                            if (i == 0) {
                                throw null;
                            }
                            zfhVar = new zfh(i);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    zgk zgkVar2 = this.d;
                    long j2 = zgkVar2.b;
                    z = false;
                    if (j2 > 0) {
                        jA = zgkVar2.a(zgkVar, Math.min(8192L, j2));
                        long j3 = zfbVar.c + jA;
                        zfbVar.c = j3;
                        long j4 = j3 - zfbVar.d;
                        if (zfhVar == null) {
                            zeu zeuVar = zfbVar.b;
                            if (j4 >= zeuVar.u.e() / 2) {
                                zeuVar.h(zfbVar.a, j4);
                                zfbVar.d = zfbVar.c;
                            }
                        } else {
                            th = zfhVar;
                        }
                    } else {
                        if (this.b || zfhVar != null) {
                            th = zfhVar;
                        } else {
                            zfbVar.f();
                            z = true;
                        }
                        jA = -1;
                    }
                    zfaVar.b();
                } catch (Throwable th2) {
                    zfbVar.j.b();
                    throw th2;
                }
            }
        } while (z);
        if (jA != -1) {
            return jA;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.f.j;
    }

    public final void c(long j) {
        byte[] bArr = zcr.a;
        this.f.b.e(j);
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        zfb zfbVar = this.f;
        synchronized (zfbVar) {
            this.e = true;
            zgk zgkVar = this.d;
            j = zgkVar.b;
            zgkVar.z();
            zfbVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.c();
    }
}
