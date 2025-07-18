package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emt extends ebv {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j = edt.b;
    private int k;

    @Override // defpackage.ebv, defpackage.ebu
    public final ByteBuffer b() {
        int i;
        if (super.h() && (i = this.k) > 0) {
            j(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.b();
    }

    @Override // defpackage.ebu
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.i);
        this.g += iMin / this.b.e;
        this.i -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.i <= 0) {
            int i2 = i - iMin;
            int length = (this.k + i2) - this.j.length;
            ByteBuffer byteBufferJ = j(length);
            int iD = edt.d(length, 0, this.k);
            byteBufferJ.put(this.j, 0, iD);
            int iD2 = edt.d(length - iD, 0, i2);
            byteBuffer.limit(byteBuffer.position() + iD2);
            byteBufferJ.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iD2;
            int i4 = this.k - iD;
            this.k = i4;
            byte[] bArr = this.j;
            System.arraycopy(bArr, iD, bArr, 0, i4);
            byteBuffer.get(this.j, this.k, i3);
            this.k += i3;
            byteBufferJ.flip();
        }
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final boolean h() {
        return super.h() && this.k == 0;
    }

    @Override // defpackage.ebv
    public final ebs i(ebs ebsVar) throws ebt {
        if (!edt.ak(ebsVar.d)) {
            throw new ebt(ebsVar);
        }
        this.h = true;
        return (this.e == 0 && this.f == 0) ? ebs.a : ebsVar;
    }

    @Override // defpackage.ebv
    protected final void k() {
        if (this.h) {
            this.h = false;
            int i = this.f;
            int i2 = this.b.e;
            this.j = new byte[i * i2];
            this.i = this.e * i2;
        }
        this.k = 0;
    }

    @Override // defpackage.ebv
    protected final void l() {
        if (this.h) {
            if (this.k > 0) {
                this.g += r0 / this.b.e;
            }
            this.k = 0;
        }
    }

    @Override // defpackage.ebv
    protected final void m() {
        this.j = edt.b;
    }
}
