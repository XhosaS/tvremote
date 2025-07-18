package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgw implements zho {
    private byte a;
    private final zhi b;
    private final Inflater c;
    private final zgx d;
    private final CRC32 e;

    public zgw(zho zhoVar) {
        zhi zhiVar = new zhi(zhoVar);
        this.b = zhiVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new zgx(zhiVar, inflater);
        this.e = new CRC32();
    }

    private final void c(zgk zgkVar, long j, long j2) {
        zhj zhjVar = zgkVar.a;
        zhjVar.getClass();
        while (true) {
            long j3 = zhjVar.c - zhjVar.b;
            if (j < j3) {
                break;
            }
            zhjVar = zhjVar.f;
            zhjVar.getClass();
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (zhjVar.b + j);
            int iMin = (int) Math.min(zhjVar.c - i, j2);
            this.e.update(zhjVar.a, i, iMin);
            zhjVar = zhjVar.f;
            zhjVar.getClass();
            j2 -= iMin;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + ylh.W(wcq.aF(i2), 8) + " != expected 0x" + ylh.W(wcq.aF(i), 8));
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) throws DataFormatException, IOException {
        byte b = this.a;
        if (b == 0) {
            zhi zhiVar = this.b;
            zhiVar.A(10L);
            zgk zgkVar2 = zhiVar.b;
            byte bC = zgkVar2.c(3L);
            int i = (bC >> 1) & 1;
            if (i != 0) {
                c(zgkVar2, 0L, 10L);
            }
            d("ID1ID2", 8075, zhiVar.x());
            zhiVar.B(8L);
            if (((bC >> 2) & 1) == 1) {
                zhiVar.A(2L);
                if (i != 0) {
                    c(zgkVar2, 0L, 2L);
                }
                long jY = (char) zgkVar2.y();
                zhiVar.A(jY);
                if (i != 0) {
                    c(zgkVar2, 0L, jY);
                }
                zhiVar.B(jY);
            }
            if (((bC >> 3) & 1) == 1) {
                long jC = zhiVar.c();
                if (jC == -1) {
                    throw new EOFException();
                }
                long j2 = jC + 1;
                if (i != 0) {
                    c(zgkVar2, 0L, j2);
                }
                zhiVar.B(j2);
            }
            if (((bC >> 4) & 1) == 1) {
                long jC2 = zhiVar.c();
                if (jC2 == -1) {
                    throw new EOFException();
                }
                long j3 = jC2 + 1;
                if (i != 0) {
                    c(zgkVar2, 0L, j3);
                }
                zhiVar.B(j3);
            }
            if (i != 0) {
                CRC32 crc32 = this.e;
                d("FHCRC", zhiVar.y(), (short) crc32.getValue());
                crc32.reset();
            }
            this.a = (byte) 1;
            b = 1;
        }
        if (b != 1) {
            if (b == 2) {
            }
            return -1L;
        }
        long j4 = zgkVar.b;
        long jA = this.d.a(zgkVar, 8192L);
        if (jA != -1) {
            c(zgkVar, j4, jA);
            return jA;
        }
        this.a = (byte) 2;
        zhi zhiVar2 = this.b;
        d("CRC", zhiVar2.g(), (int) this.e.getValue());
        d("ISIZE", zhiVar2.g(), (int) this.c.getBytesWritten());
        this.a = (byte) 3;
        if (!zhiVar2.C()) {
            throw new IOException("gzip finished without exhausting source");
        }
        return -1L;
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.b.b();
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
