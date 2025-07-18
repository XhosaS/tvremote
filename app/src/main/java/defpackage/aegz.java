package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aegz extends aarv {
    public static aegz g(ByteBuffer byteBuffer) {
        aegz aegzVar = new aegz();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        aegzVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return aegzVar;
    }

    public static int h(aart aartVar, int i, long j, int i2, int i3) {
        aartVar.o(6);
        aartVar.t(3, i3);
        aartVar.t(2, i2);
        aartVar.s(1, (int) j);
        aartVar.t(0, i);
        return aartVar.d();
    }
}
