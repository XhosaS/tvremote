package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgx implements zho {
    private final zgm a;
    private final Inflater b;
    private int c;
    private boolean d;

    public zgx(zgm zgmVar, Inflater inflater) {
        this.a = zgmVar;
        this.b = inflater;
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) throws DataFormatException, IOException {
        do {
            long jC = c(zgkVar);
            if (jC > 0) {
                return jC;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.C());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.a.b();
    }

    public final long c(zgk zgkVar) throws DataFormatException, IOException {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        try {
            zhj zhjVarW = zgkVar.w(1);
            int iMin = (int) Math.min(8192L, 8192 - zhjVarW.c);
            Inflater inflater = this.b;
            if (inflater.needsInput()) {
                zgm zgmVar = this.a;
                if (!zgmVar.C()) {
                    zhj zhjVar = ((zhi) zgmVar).b.a;
                    zhjVar.getClass();
                    int i = zhjVar.c;
                    int i2 = zhjVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(zhjVar.a, i2, i3);
                }
            }
            int iInflate = inflater.inflate(zhjVarW.a, zhjVarW.c, iMin);
            int i4 = this.c;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.c -= remaining;
                this.a.B(remaining);
            }
            if (iInflate > 0) {
                zhjVarW.c += iInflate;
                long j = iInflate;
                zgkVar.b += j;
                return j;
            }
            if (zhjVarW.b != zhjVarW.c) {
                return 0L;
            }
            zgkVar.a = zhjVarW.a();
            zhk.b(zhjVarW);
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
