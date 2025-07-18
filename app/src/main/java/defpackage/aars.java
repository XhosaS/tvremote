package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aars extends aarr {
    public static final aars a = new aars();

    @Override // defpackage.aarr
    public final ByteBuffer a(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }
}
