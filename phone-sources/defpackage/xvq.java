package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvq implements xvs {
    private final /* synthetic */ int a;

    public xvq(int i) {
        this.a = i;
    }

    @Override // defpackage.xvt
    public final /* synthetic */ int a(yaf yafVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            yafVar.l(i);
            return 0;
        }
        if (i3 == 1) {
            return yafVar.e();
        }
        if (i3 == 2) {
            yafVar.k((byte[]) obj, i2, i);
            return i2 + i;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        yafVar.i(byteBuffer);
        byteBuffer.limit(iLimit);
        return 0;
    }
}
