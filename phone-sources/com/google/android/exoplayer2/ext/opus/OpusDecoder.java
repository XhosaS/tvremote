package com.google.android.exoplayer2.ext.opus;

import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import defpackage.a;
import defpackage.edt;
import defpackage.ehf;
import defpackage.ehg;
import defpackage.ehi;
import defpackage.ehk;
import defpackage.ehm;
import defpackage.eho;
import defpackage.nef;
import defpackage.neg;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpusDecoder extends eho<ehk, SimpleDecoderOutputBuffer, neg> {
    public final boolean a;
    public final int b;
    private final CryptoConfig c;
    private final int d;
    private final int e;
    private final long f;
    private int g;

    public OpusDecoder(int i, List list, CryptoConfig cryptoConfig, boolean z) throws neg {
        int i2;
        int i3;
        super(new ehk[16], new SimpleDecoderOutputBuffer[16]);
        if (!OpusLibrary.a()) {
            throw new neg("Failed to load decoder native libraries");
        }
        this.c = cryptoConfig;
        if (cryptoConfig != null && !OpusLibrary.opusIsSecureDecodeSupported()) {
            throw new neg("Opus decoder does not support secure decode");
        }
        int size = list.size();
        int i4 = 1;
        if (size != 1) {
            if (size != 3) {
                throw new neg("Invalid initialization data size");
            }
            if (((byte[]) list.get(1)).length != 8 || ((byte[]) list.get(2)).length != 8) {
                throw new neg("Invalid pre-skip or seek pre-roll");
            }
        }
        if (list.size() == 3) {
            i2 = (int) ((ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000);
        } else {
            byte[] bArr = (byte[]) list.get(0);
            i2 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
        }
        this.d = i2;
        this.e = list.size() == 3 ? (int) ((ByteBuffer.wrap((byte[]) list.get(2)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000) : 3840;
        byte[] bArr2 = (byte[]) list.get(0);
        int length = bArr2.length;
        if (length < 19) {
            throw new neg("Invalid header length");
        }
        int i5 = bArr2[9] & 255;
        this.b = i5;
        if (i5 > 8) {
            throw new neg(a.cf(i5, "Invalid channel count: "));
        }
        int i6 = bArr2[16] & 255;
        int i7 = bArr2[17] & 255;
        byte[] bArr3 = new byte[8];
        if (bArr2[18] == 0) {
            if (i5 > 2) {
                throw new neg("Invalid header, missing stream map");
            }
            int i8 = i5 == 2 ? 1 : 0;
            bArr3[0] = 0;
            bArr3[1] = 1;
            i3 = i8;
        } else {
            if (length < i5 + 21) {
                throw new neg("Invalid header length");
            }
            i4 = bArr2[19] & 255;
            int i9 = bArr2[20] & 255;
            System.arraycopy(bArr2, 21, bArr3, 0, i5);
            i3 = i9;
        }
        long jOpusInit = opusInit(48000, i5, i4, i3, (short) ((i7 << 8) | i6), bArr3);
        this.f = jOpusInit;
        if (jOpusInit == 0) {
            throw new neg("Failed to initialize decoder");
        }
        p(i);
        this.a = z;
        if (z) {
            opusSetFloatOutput();
        }
    }

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    private native int opusSecureDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i2, CryptoConfig cryptoConfig, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput();

    @Override // defpackage.ehh
    public final String c() {
        return "libopus".concat(String.valueOf(OpusLibrary.a() ? OpusLibrary.opusGetVersion() : null));
    }

    @Override // defpackage.eho, defpackage.ehh
    public final void f() throws InterruptedException {
        super.f();
        opusClose(this.f);
    }

    @Override // defpackage.eho
    protected final /* synthetic */ ehi h(Throwable th) {
        return new neg("Unexpected decode error", th);
    }

    @Override // defpackage.eho
    protected final /* bridge */ /* synthetic */ ehi i(ehk ehkVar, ehm ehmVar, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer;
        OpusDecoder opusDecoder;
        int iOpusDecode;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) ehmVar;
        if (z) {
            opusReset(this.f);
            this.g = ehkVar.e == 0 ? this.d : this.e;
        }
        ByteBuffer byteBuffer = ehkVar.c;
        String str = edt.a;
        ehg ehgVar = ehkVar.b;
        if (ehkVar.c()) {
            long j = this.f;
            long j2 = ehkVar.e;
            simpleDecoderOutputBuffer = simpleDecoderOutputBuffer2;
            int iLimit = byteBuffer.limit();
            CryptoConfig cryptoConfig = this.c;
            int i = ehgVar.c;
            byte[] bArr = ehgVar.b;
            bArr.getClass();
            byte[] bArr2 = ehgVar.a;
            bArr2.getClass();
            iOpusDecode = opusSecureDecode(j, j2, byteBuffer, iLimit, simpleDecoderOutputBuffer, 48000, cryptoConfig, i, bArr, bArr2, ehgVar.f, ehgVar.d, ehgVar.e);
            opusDecoder = this;
        } else {
            simpleDecoderOutputBuffer = simpleDecoderOutputBuffer2;
            opusDecoder = this;
            iOpusDecode = opusDecoder.opusDecode(this.f, ehkVar.e, byteBuffer, byteBuffer.limit(), simpleDecoderOutputBuffer2);
        }
        if (iOpusDecode < 0) {
            if (iOpusDecode != -2) {
                return new neg("Decode error: ".concat(String.valueOf(opusDecoder.opusGetErrorMessage(iOpusDecode))));
            }
            long j3 = opusDecoder.f;
            String strValueOf = String.valueOf(opusDecoder.opusGetErrorMessage(j3));
            opusDecoder.opusGetErrorCode(j3);
            String strConcat = "Drm error: ".concat(strValueOf);
            return new neg(strConcat, new ehf(strConcat));
        }
        ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer.data;
        byteBuffer2.position(0);
        byteBuffer2.limit(iOpusDecode);
        int i2 = opusDecoder.g;
        if (i2 > 0) {
            int i3 = opusDecoder.b;
            int i4 = i3 + i3;
            int i5 = i2 * i4;
            if (iOpusDecode <= i5) {
                opusDecoder.g = i2 - (iOpusDecode / i4);
                simpleDecoderOutputBuffer.shouldBeSkipped = true;
                byteBuffer2.position(iOpusDecode);
                return null;
            }
            opusDecoder.g = 0;
            byteBuffer2.position(i5);
        }
        return null;
    }

    @Override // defpackage.eho
    protected final ehk j() {
        return new ehk(2);
    }

    @Override // defpackage.eho
    protected final /* bridge */ /* synthetic */ ehm l() {
        return new SimpleDecoderOutputBuffer(new nef(this, 0));
    }
}
