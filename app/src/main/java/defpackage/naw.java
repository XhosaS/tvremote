package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class naw extends mix implements nhf {
    private final aegv b;

    public naw(aegv aegvVar) {
        this.b = aegvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegv aegvVar = this.b;
        aegv aegvVar2 = ((naw) obj).b;
        if (aegvVar == aegvVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegvVar.b;
        ByteBuffer byteBuffer2 = aegvVar2.b;
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

    @Override // defpackage.nhf
    public final int g(int i) {
        aegv aegvVar = this.b;
        int iA = aegvVar.a(22);
        if (iA != 0) {
            return aegvVar.b.getInt(aegvVar.b(iA) + (i * 4));
        }
        return 0;
    }

    @Override // defpackage.nhf
    public final int h() {
        aegv aegvVar = this.b;
        int iA = aegvVar.a(22);
        if (iA != 0) {
            return aegvVar.c(iA);
        }
        return 0;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nhf
    public final long i() {
        aegv aegvVar = this.b;
        int iA = aegvVar.a(14);
        if (iA != 0) {
            return aegvVar.b.getLong(iA + aegvVar.a);
        }
        return 0L;
    }

    @Override // defpackage.nhf
    public final ByteBuffer j() {
        return this.b.f(18);
    }

    @Override // defpackage.nhf
    public final ByteBuffer k() {
        return this.b.f(16);
    }

    @Override // defpackage.nhf
    public final boolean l() {
        aegv aegvVar = this.b;
        int iA = aegvVar.a(20);
        return (iA == 0 || aegvVar.b.get(iA + aegvVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nhf
    public final void m() {
        aegv aegvVar = this.b;
        int iA = aegvVar.a(26);
        if (iA != 0) {
            aegvVar.b.get(iA + aegvVar.a);
        }
    }
}
