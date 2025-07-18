package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oex {
    public static final ByteBuffer a;
    public static final oex b;
    public final ByteBuffer c;
    private volatile ByteBuffer e = null;
    private final boolean d = false;

    static {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[0]);
        a = byteBufferWrap;
        b = new oex(byteBufferWrap);
    }

    private oex(ByteBuffer byteBuffer) {
        this.c = byteBuffer.duplicate();
    }

    public static oex a(byte[] bArr) {
        return new oex(ByteBuffer.wrap(bArr));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oex)) {
            return false;
        }
        oex oexVar = (oex) obj;
        boolean z = oexVar.d;
        return this.c.equals(oexVar.c);
    }

    public final int hashCode() {
        return Objects.hash(false, this.c);
    }
}
