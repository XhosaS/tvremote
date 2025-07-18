package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ems extends ebv {
    private static final int e = Float.floatToIntBits(Float.NaN);

    private static void n(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (iFloatToIntBits == e) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.ebu
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.d;
        if (i2 == 21) {
            byteBufferJ = j((i / 3) * 4);
            while (iPosition < iLimit) {
                n(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferJ = j(i);
            while (iPosition < iLimit) {
                int i3 = byteBuffer.get(iPosition) & 255;
                int i4 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                n(i3 | i4 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferJ = j((i / 3) * 4);
            while (iPosition < iLimit) {
                n(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i);
            while (iPosition < iLimit) {
                int i5 = byteBuffer.get(iPosition + 3) & 255;
                int i6 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                n(i5 | i6 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // defpackage.ebv
    public final ebs i(ebs ebsVar) throws ebt {
        int i = ebsVar.d;
        String str = edt.a;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736) {
            return new ebs(ebsVar.b, ebsVar.c, 4);
        }
        if (i == 4) {
            return ebs.a;
        }
        throw new ebt(ebsVar);
    }
}
