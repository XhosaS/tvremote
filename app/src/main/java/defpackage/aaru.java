package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaru {
    public int a;
    public ByteBuffer b;

    public final void a(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer == null) {
            i = 0;
        }
        this.a = i;
    }
}
