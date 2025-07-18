package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afon implements afop {
    @Override // defpackage.afoq
    public final /* bridge */ /* synthetic */ int a(afwn afwnVar, int i, Object obj, int i2) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        afwnVar.j(byteBuffer);
        byteBuffer.limit(iLimit);
        return 0;
    }
}
