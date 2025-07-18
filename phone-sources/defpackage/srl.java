package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srl {
    private final short a;
    private final short b;
    private final int c;

    public srl(short s, short s2, int i) {
        this.a = s;
        this.b = s2;
        this.c = i;
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(srq.d(this.a));
        byteArrayOutputStream.write(srq.d(this.b));
        byteArrayOutputStream.write(srq.c(this.c));
    }
}
