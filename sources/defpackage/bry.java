package defpackage;

import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bry extends bsb {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/bleremote/protocol/Spec04");
    public final bsd b;
    public final byte c;
    public final byte d;
    public final byte e;
    public final int f;
    public final int g;
    private final int i;

    public bry(bsd bsdVar) {
        this.b = bsdVar;
        this.c = (byte) 2;
        this.d = (byte) 1;
        this.e = (byte) 1;
        this.f = 8000;
        this.g = 134;
        this.i = 20;
    }

    @Override // defpackage.bsb
    public final byte a() {
        return (byte) 0;
    }

    @Override // defpackage.bsb
    public final byte b(ByteBuffer byteBuffer) {
        return (byte) 0;
    }

    @Override // defpackage.bsb
    public final brw c(ByteBuffer byteBuffer) {
        return new brw(brv.MIC_OPEN, this.e, (byte) 0);
    }

    @Override // defpackage.bsb
    public final /* synthetic */ bsc d(bqr bqrVar) {
        return new brx(this, bqrVar);
    }

    @Override // defpackage.bsb
    public final /* bridge */ /* synthetic */ bsc e(brw brwVar) {
        return null;
    }

    @Override // defpackage.bsb
    public final Optional f() {
        int i = this.i;
        return i == 20 ? Optional.empty() : Optional.of(Integer.valueOf(i + 3));
    }

    @Override // defpackage.bsb
    public final String g() {
        return String.format(Locale.ENGLISH, "v0.%d, codec: %s/%s, frame size: %d/%d", Byte.valueOf(this.c), Integer.toBinaryString(this.e), Integer.toBinaryString(this.d), Integer.valueOf(this.i), Integer.valueOf(this.g));
    }

    @Override // defpackage.bsb
    public final byte[] h(brs brsVar) {
        ((cbs) a.c().j("com/google/android/tv/remote/service/bleremote/protocol/Spec04", "getCapabilitiesRequest", 88, "Spec04.java")).p("Requesting remote capabilities (spec 0.4e)");
        return ByteBuffer.allocate(5).order(ByteOrder.BIG_ENDIAN).put((byte) 10).put((byte) 0).put((byte) 4).putShort((short) 3).array();
    }

    @Override // defpackage.bsb
    public final void i(clo cloVar) {
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        byte b = this.c;
        bss bssVar = (bss) cloVar.b;
        bss bssVar2 = bss.a;
        bssVar.b |= 8;
        bssVar.f = b;
        byte b2 = this.d;
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        clt cltVar = cloVar.b;
        bss bssVar3 = (bss) cltVar;
        bssVar3.b |= 16;
        bssVar3.g = b2;
        int i = this.g;
        if (!cltVar.A()) {
            cloVar.l();
        }
        clt cltVar2 = cloVar.b;
        bss bssVar4 = (bss) cltVar2;
        bssVar4.b |= 32;
        bssVar4.h = i;
        int i2 = this.i;
        if (!cltVar2.A()) {
            cloVar.l();
        }
        bss bssVar5 = (bss) cloVar.b;
        bssVar5.b |= 64;
        bssVar5.i = i2;
    }

    public bry(bsd bsdVar, ByteBuffer byteBuffer) {
        this.b = bsdVar;
        this.c = byteBuffer.get();
        byte b = (byte) byteBuffer.getShort();
        this.d = b;
        byte b2 = (b & 2) != 0 ? (byte) 2 : (byte) 1;
        this.e = b2;
        this.f = b2 == 2 ? 16000 : 8000;
        this.g = byteBuffer.getShort();
        this.i = byteBuffer.getShort();
    }
}
