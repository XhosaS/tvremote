package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ych implements zhm {
    public final yci c;
    public zhm f;
    public Socket g;
    public int h;
    public int i;
    private final ybk j;
    private boolean l;
    public final Object a = new Object();
    public final zgk b = new zgk();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public ych(ybk ybkVar, yci yciVar) {
        ybkVar.getClass();
        this.j = ybkVar;
        this.c = yciVar;
    }

    @Override // defpackage.zhm
    public final zhq b() {
        return zhq.j;
    }

    @Override // defpackage.zhm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new xyp(this, 13));
    }

    @Override // defpackage.zhm
    public final void eW(zgk zgkVar, long j) throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = yfl.a;
        synchronized (this.a) {
            zgk zgkVar2 = this.b;
            zgkVar2.eW(zgkVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && zgkVar2.h() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (!z) {
                this.j.execute(new yce(this));
                return;
            }
            try {
                this.g.close();
            } catch (IOException e) {
                this.c.d(e);
            }
        }
    }

    @Override // defpackage.zhm, java.io.Flushable
    public final void flush() throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = yfl.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new ycf(this));
        }
    }
}
