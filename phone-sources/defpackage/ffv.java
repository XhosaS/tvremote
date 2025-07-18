package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffv extends ffr {
    public static final ffu c(edi ediVar) {
        String strW = ediVar.w();
        strW.getClass();
        String strW2 = ediVar.w();
        strW2.getClass();
        return new ffu(strW, strW2, ediVar.q(), ediVar.q(), Arrays.copyOfRange(ediVar.a, ediVar.b, ediVar.c));
    }

    @Override // defpackage.ffr
    protected final ead b(ffq ffqVar, ByteBuffer byteBuffer) {
        return new ead(c(new edi(byteBuffer.array(), byteBuffer.limit())));
    }
}
