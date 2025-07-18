package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbn extends mix implements njn {
    private final aegb b;

    public nbn(aegb aegbVar) {
        this.b = aegbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegb aegbVar = this.b;
        aegb aegbVar2 = ((nbn) obj).b;
        if (aegbVar == aegbVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegbVar.b;
        ByteBuffer byteBuffer2 = aegbVar2.b;
        if (byteBuffer == null) {
            return byteBuffer2 == null;
        }
        if (byteBuffer2 == null) {
            return false;
        }
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.array() == byteBuffer2.array() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining()) {
            return true;
        }
        return byteBuffer.equals(byteBuffer2);
    }

    @Override // defpackage.njn
    public final String g() {
        return this.b.g();
    }

    @Override // defpackage.njn
    public final boolean h() {
        return this.b.g() != null;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
