package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zgo implements zho {
    private final zgp a;
    private long b;
    private boolean c;

    public zgo(zgp zgpVar, long j) {
        this.a = zgpVar;
        this.b = j;
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) {
        long j2;
        long j3;
        long j4;
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        zgp zgpVar = this.a;
        long j5 = this.b;
        long j6 = j5 + 8192;
        long j7 = j5;
        while (true) {
            if (j7 >= j6) {
                j2 = j7;
                j3 = -1;
                break;
            }
            zhj zhjVarW = zgkVar.w(1);
            j3 = -1;
            zgp zgpVar2 = zgpVar;
            j2 = j7;
            int iC = zgpVar2.c(j2, zhjVarW.a, zhjVarW.c, (int) Math.min(j6 - j7, 8192 - r7));
            if (iC == -1) {
                if (zhjVarW.b == zhjVarW.c) {
                    zgkVar.a = zhjVarW.a();
                    zhk.b(zhjVarW);
                }
                if (j5 == j2) {
                    j4 = -1;
                }
            } else {
                zhjVarW.c += iC;
                long j8 = iC;
                j7 = j2 + j8;
                zgkVar.b += j8;
                zgpVar = zgpVar2;
            }
        }
        j4 = j2 - j5;
        if (j4 != j3) {
            this.b += j4;
        }
        return j4;
    }

    @Override // defpackage.zho
    public final zhq b() {
        return zhq.j;
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        zgp zgpVar = this.a;
        ReentrantLock reentrantLock = zgpVar.c;
        reentrantLock.lock();
        try {
            int i = zgpVar.b - 1;
            zgpVar.b = i;
            if (i == 0) {
                if (zgpVar.a) {
                    reentrantLock.unlock();
                    this.a.e();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
