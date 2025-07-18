package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htt implements hts {
    public static final htt a = new htt(0);
    private final /* synthetic */ int b;

    public htt(int i) {
        this.b = i;
    }

    @Override // defpackage.hts
    public final hnv a(hnv hnvVar, hll hllVar) {
        byte[] bArrArray;
        if (this.b == 0) {
            return hnvVar;
        }
        ByteBuffer byteBufferB = ((hti) hnvVar.c()).b();
        int i = hwc.a;
        gb gbVar = null;
        if (!byteBufferB.isReadOnly() && byteBufferB.hasArray()) {
            gbVar = new gb(byteBufferB.array(), byteBufferB.arrayOffset(), byteBufferB.limit());
        }
        if (gbVar != null && gbVar.a == 0 && gbVar.b == ((byte[]) gbVar.c).length) {
            bArrArray = byteBufferB.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferB.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
            hwc.b(byteBufferAsReadOnlyBuffer);
            byteBufferAsReadOnlyBuffer.get(bArr);
            bArrArray = bArr;
        }
        return new hsz(bArrArray, 0);
    }
}
