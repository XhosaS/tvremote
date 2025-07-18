package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dmn implements dmo {
    @Override // defpackage.dmo
    public final ddp a(ddp ddpVar, dan danVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferB = ((dlz) ddpVar.c()).b();
        int i = dpw.a;
        dpv dpvVar = null;
        if (!byteBufferB.isReadOnly() && byteBufferB.hasArray()) {
            dpvVar = new dpv(byteBufferB.array(), byteBufferB.arrayOffset(), byteBufferB.limit());
        }
        if (dpvVar != null && dpvVar.a == 0 && dpvVar.b == dpvVar.c.length) {
            bArrArray = byteBufferB.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferB.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
            dpw.b(byteBufferAsReadOnlyBuffer);
            byteBufferAsReadOnlyBuffer.get(bArr);
            bArrArray = bArr;
        }
        return new dlj(bArrArray);
    }
}
