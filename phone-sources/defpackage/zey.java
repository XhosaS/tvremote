package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zey implements zhm {
    public final boolean a;
    public boolean b;
    final /* synthetic */ zfb c;
    private final zgk d = new zgk();

    public zey(zfb zfbVar, boolean z) {
        this.c = zfbVar;
        this.a = z;
    }

    private final void c(boolean z) {
        zfa zfaVar;
        zgk zgkVar;
        long jMin;
        boolean z2;
        zfb zfbVar = this.c;
        synchronized (zfbVar) {
            zfaVar = zfbVar.k;
            zfaVar.e();
            while (zfbVar.e >= zfbVar.f && !this.a && !this.b && zfbVar.i() == 0) {
                try {
                    zfbVar.f();
                } catch (Throwable th) {
                    zfbVar.k.b();
                    throw th;
                }
            }
            zfaVar.b();
            zfbVar.d();
            long j = zfbVar.f - zfbVar.e;
            zgkVar = this.d;
            jMin = Math.min(j, zgkVar.b);
            zfbVar.e += jMin;
            boolean z3 = false;
            if (z && jMin == zgkVar.b) {
                z3 = true;
            }
            z2 = z3;
        }
        zfaVar.e();
        try {
            zfbVar.b.f(zfbVar.a, z2, zgkVar, jMin);
        } finally {
            this.c.k.b();
        }
    }

    @Override // defpackage.zhm
    public final zhq b() {
        return this.c.k;
    }

    @Override // defpackage.zhm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = zcr.a;
        zfb zfbVar = this.c;
        synchronized (zfbVar) {
            if (this.b) {
                return;
            }
            int i = zfbVar.i();
            zfb zfbVar2 = this.c;
            if (!zfbVar2.i.a) {
                zgk zgkVar = this.d;
                if (zgkVar.b > 0) {
                    while (zgkVar.b > 0) {
                        c(true);
                    }
                } else if (i == 0) {
                    zfbVar2.b.f(zfbVar2.a, true, null, 0L);
                }
            }
            synchronized (zfbVar2) {
                this.b = true;
            }
            zfb zfbVar3 = this.c;
            zfbVar3.b.d();
            zfbVar3.c();
        }
    }

    @Override // defpackage.zhm
    public final void eW(zgk zgkVar, long j) {
        byte[] bArr = zcr.a;
        zgk zgkVar2 = this.d;
        zgkVar2.eW(zgkVar, j);
        while (zgkVar2.b >= 16384) {
            c(false);
        }
    }

    @Override // defpackage.zhm, java.io.Flushable
    public final void flush() {
        byte[] bArr = zcr.a;
        zfb zfbVar = this.c;
        synchronized (zfbVar) {
            zfbVar.d();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.d();
        }
    }
}
