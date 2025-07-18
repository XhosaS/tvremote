package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwu implements ahxo {
    final /* synthetic */ ahww a;
    final /* synthetic */ ahxo b;

    public ahwu(ahww ahwwVar, ahxo ahxoVar) {
        this.a = ahwwVar;
        this.b = ahxoVar;
    }

    @Override // defpackage.ahxo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ahxo ahxoVar = this.b;
        ahww ahwwVar = this.a;
        try {
            ((ahxg) ahxoVar).a.close();
        } catch (IOException e) {
            throw e;
        } finally {
            ahwwVar.a();
        }
    }

    @Override // defpackage.ahxo
    public final void fF(ahwx ahwxVar, long j) {
        ahwt.a(ahwxVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            ahxl ahxlVar = ahwxVar.a;
            ahxlVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += ahxlVar.c - ahxlVar.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    ahxlVar = ahxlVar.f;
                    ahxlVar.getClass();
                }
            }
            ahww ahwwVar = this.a;
            try {
                try {
                    this.b.fF(ahwxVar, j2);
                    ahwwVar.a();
                    j -= j2;
                } catch (IOException e) {
                    ahwwVar.a();
                    throw e;
                }
            } catch (Throwable th) {
                ahwwVar.a();
                throw th;
            }
        }
    }

    @Override // defpackage.ahxo, java.io.Flushable
    public final void flush() {
        ahxo ahxoVar = this.b;
        ahww ahwwVar = this.a;
        try {
            ((ahxg) ahxoVar).a.flush();
        } catch (IOException e) {
            throw e;
        } finally {
            ahwwVar.a();
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
