package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafg extends aafx {
    public final int a;
    private final int b;
    private final int c;
    private final String d;
    private final byte[] e;

    public aafg(aadt aadtVar) throws GeneralSecurityException {
        String str;
        this.e = aadtVar.b.a.b();
        if (aadtVar.a.c.equals(aaea.a)) {
            str = "HmacSha1";
        } else if (aadtVar.a.c.equals(aaea.b)) {
            str = "HmacSha256";
        } else {
            if (!aadtVar.a.c.equals(aaea.c)) {
                throw new GeneralSecurityException("Unknown HKDF algorithm ".concat(aadtVar.a.c.d));
            }
            str = "HmacSha512";
        }
        this.d = str;
        this.a = aadtVar.a.b.intValue();
        int iIntValue = aadtVar.a.d.intValue();
        this.b = iIntValue;
        this.c = iIntValue - 16;
    }

    public static Cipher i() {
        return (Cipher) aafm.a.a("AES/GCM/NoPadding");
    }

    public static GCMParameterSpec j(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        aagc.a(byteBufferAllocate, j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    @Override // defpackage.aafx
    public final int c() {
        return this.a + 8;
    }

    @Override // defpackage.aafx
    public final int d() {
        return this.b;
    }

    @Override // defpackage.aafx
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.aafx
    public final int f() {
        return this.c;
    }

    @Override // defpackage.aafx
    public final /* synthetic */ aafy g() {
        return new aafe(this);
    }

    @Override // defpackage.aafx
    public final /* synthetic */ aafz h(byte[] bArr) {
        return new aaff(this, bArr);
    }

    public final SecretKeySpec k(byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(aafw.a(this.d, this.e, bArr, bArr2, this.a), "AES");
    }
}
