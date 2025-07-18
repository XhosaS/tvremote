package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ffr implements ffp {
    @Override // defpackage.ffp
    public final ead a(ffq ffqVar) {
        ByteBuffer byteBuffer = ffqVar.c;
        byteBuffer.getClass();
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        a.H(z);
        return b(ffqVar, byteBuffer);
    }

    protected abstract ead b(ffq ffqVar, ByteBuffer byteBuffer);
}
