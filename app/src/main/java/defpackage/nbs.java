package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbs extends mix implements njw {
    private yqt a;
    private yqt b;
    private final aegd c;

    public nbs(aegd aegdVar) {
        this.c = aegdVar;
    }

    private final void p() {
        if (this.a == null) {
            aegd aegdVar = this.c;
            aeet aeetVar = new aeet();
            int iA = aegdVar.a(8);
            if (iA != 0) {
                int i = iA + aegdVar.a;
                aeetVar.e(i + aegdVar.b.getInt(i), aegdVar.b);
            } else {
                aeetVar = null;
            }
            this.a = aeetVar == null ? ypv.a : yqt.i(new nbo(aeetVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aegd aegdVar = this.c;
        aegd aegdVar2 = ((nbs) obj).c;
        if (aegdVar == aegdVar2) {
            return true;
        }
        ByteBuffer byteBuffer = aegdVar.b;
        ByteBuffer byteBuffer2 = aegdVar2.b;
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

    @Override // defpackage.njw
    public final int g() {
        return (int) (this.c.a(12) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    @Override // defpackage.njw
    public final int h() {
        return (int) (this.c.a(10) != 0 ? r0.b.getInt(r1 + r0.a) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, njo] */
    @Override // defpackage.njw
    public final /* bridge */ /* synthetic */ njo i() {
        p();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, njr] */
    @Override // defpackage.njw
    public final /* bridge */ /* synthetic */ njr j() {
        if (this.b == null) {
            aegd aegdVar = this.c;
            aefs aefsVar = new aefs();
            int iA = aegdVar.a(14);
            if (iA != 0) {
                int i = iA + aegdVar.a;
                aefsVar.e(i + aegdVar.b.getInt(i), aegdVar.b);
            } else {
                aefsVar = null;
            }
            this.b = aefsVar == null ? ypv.a : yqt.i(new nbp(aefsVar));
        }
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.njw
    public final String k() {
        return this.c.g();
    }

    @Override // defpackage.njw
    public final ByteBuffer l() {
        return this.c.f(6);
    }

    @Override // defpackage.njw
    public final boolean m() {
        p();
        return this.a.g();
    }

    @Override // defpackage.njw
    public final boolean n() {
        return this.c.f(6) != null;
    }

    @Override // defpackage.njw
    public final boolean o() {
        return this.c.g() != null;
    }
}
