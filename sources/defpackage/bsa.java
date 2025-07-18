package defpackage;

import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsa extends bsb {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/bleremote/protocol/Spec10");
    public final bsd b;
    public final short c;
    private final byte d;
    private final byte e;
    private final brs f;
    private final byte g;

    public bsa(bsd bsdVar) {
        this.b = bsdVar;
        this.d = (byte) 0;
        this.e = (byte) 3;
        this.f = brs.LEGACY;
        this.c = (short) 0;
        this.g = (byte) 0;
    }

    @Override // defpackage.bsb
    public final byte a() {
        return (byte) 1;
    }

    @Override // defpackage.bsb
    public final byte b(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() > 0) {
            return byteBuffer.get();
        }
        ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/protocol/Spec10", "handleAudioStop", 125, "Spec10.java")).r("Audio stop message is too short: %d", byteBuffer.remaining());
        return (byte) -1;
    }

    @Override // defpackage.bsb
    public final brw c(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 3) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/protocol/Spec10", "handleAudioStart", 116, "Spec10.java")).r("Audio start message is too short: %d", byteBuffer.remaining());
            return null;
        }
        byte b = byteBuffer.get();
        return new brw(b == 0 ? brv.MIC_OPEN : b == 3 ? brv.HTT : brv.PTT, byteBuffer.get(), byteBuffer.get());
    }

    @Override // defpackage.bsb
    public final /* synthetic */ bsc d(bqr bqrVar) {
        return new brz(this, bqrVar);
    }

    @Override // defpackage.bsb
    public final /* bridge */ /* synthetic */ bsc e(brw brwVar) {
        if (brwVar.c == 0) {
            return null;
        }
        return new brz(this, brwVar);
    }

    @Override // defpackage.bsb
    public final Optional f() {
        return (this.g & 1) == 0 ? Optional.empty() : Optional.of(Integer.valueOf(this.c + 3));
    }

    @Override // defpackage.bsb
    public final String g() {
        return String.format(Locale.ENGLISH, "v%d.%d, codecs: %s, frame size: %d, %s%s", (byte) 1, Byte.valueOf(this.d), Integer.toBinaryString(this.e), Short.valueOf(this.c), this.f, 1 != (this.g & 1) ? "" : " (DLE)");
    }

    @Override // defpackage.bsb
    public final byte[] h(brs brsVar) {
        ((cbs) a.c().j("com/google/android/tv/remote/service/bleremote/protocol/Spec10", "getCapabilitiesRequest", 79, "Spec10.java")).t("Requesting remote capabilities (spec 1.0 %s mode)", brsVar);
        return ByteBuffer.allocate(6).order(ByteOrder.BIG_ENDIAN).put((byte) 10).put((byte) 1).put((byte) 0).putShort((short) 3).put(brsVar.d).array();
    }

    @Override // defpackage.bsb
    public final void i(clo cloVar) {
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        byte b = this.d;
        bss bssVar = (bss) cloVar.b;
        bss bssVar2 = bss.a;
        bssVar.b |= 8;
        bssVar.f = b + 256;
        byte b2 = this.e;
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        clt cltVar = cloVar.b;
        bss bssVar3 = (bss) cltVar;
        bssVar3.b |= 16;
        bssVar3.g = b2;
        short s = this.c;
        if (!cltVar.A()) {
            cloVar.l();
        }
        bss bssVar4 = (bss) cloVar.b;
        bssVar4.b |= 32;
        bssVar4.h = s;
    }

    public bsa(bsd bsdVar, ByteBuffer byteBuffer) {
        this.b = bsdVar;
        this.d = byteBuffer.get();
        this.e = byteBuffer.get();
        byte b = byteBuffer.get();
        this.f = b == 0 ? brs.LEGACY : b == 3 ? brs.HTT : brs.PTT;
        this.c = byteBuffer.getShort();
        this.g = byteBuffer.get();
    }
}
