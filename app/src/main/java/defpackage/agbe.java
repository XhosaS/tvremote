package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agbe implements ahxo {
    public final agbf c;
    public ahxo f;
    public Socket g;
    public int h;
    public int i;
    private final afyq j;
    private boolean l;
    public final Object a = new Object();
    public final ahwx b = new ahwx();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public agbe(afyq afyqVar, agbf agbfVar) {
        afyqVar.getClass();
        this.j = afyqVar;
        this.c = agbfVar;
    }

    @Override // defpackage.ahxo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new agbb(this));
    }

    @Override // defpackage.ahxo
    public final void fF(ahwx ahwxVar, long j) throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = agfd.a;
        synchronized (this.a) {
            ahwx ahwxVar2 = this.b;
            ahwxVar2.fF(ahwxVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && ahwxVar2.f() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (!z) {
                this.j.execute(new agaz(this));
                return;
            }
            try {
                this.g.close();
            } catch (IOException e) {
                this.c.e(e);
            }
        }
    }

    @Override // defpackage.ahxo, java.io.Flushable
    public final void flush() throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = agfd.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new agba(this));
        }
    }
}
