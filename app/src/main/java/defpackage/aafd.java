package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafd extends aafx {
    public static final aaae a = aaae.ALGORITHM_NOT_FIPS;
    public final int b;
    public final int c;
    private final String d;
    private final int e;
    private final int f;
    private final String g;
    private final byte[] h;

    public aafd(aadm aadmVar) throws GeneralSecurityException {
        if (!a.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        this.h = aadmVar.b.a.b();
        aadr aadrVar = aadmVar.a.c;
        aadr aadrVar2 = aadr.a;
        String str = "HmacSha512";
        this.g = aadrVar.equals(aadrVar2) ? "HmacSha1" : aadmVar.a.c.equals(aadr.b) ? "HmacSha256" : aadmVar.a.c.equals(aadr.c) ? "HmacSha512" : "";
        this.b = aadmVar.a.b.intValue();
        if (aadmVar.a.d.equals(aadrVar2)) {
            str = "HmacSha1";
        } else if (aadmVar.a.d.equals(aadr.b)) {
            str = "HmacSha256";
        } else if (!aadmVar.a.d.equals(aadr.c)) {
            str = "";
        }
        this.d = str;
        int iIntValue = aadmVar.a.e.intValue();
        this.c = iIntValue;
        int iIntValue2 = aadmVar.a.f.intValue();
        this.e = iIntValue2;
        this.f = iIntValue2 - iIntValue;
    }

    public static Cipher i() {
        return (Cipher) aafm.a.a("AES/CTR/NoPadding");
    }

    @Override // defpackage.aafx
    public final int c() {
        return this.b + 8;
    }

    @Override // defpackage.aafx
    public final int d() {
        return this.e;
    }

    @Override // defpackage.aafx
    public final int e() {
        return this.b + 8;
    }

    @Override // defpackage.aafx
    public final int f() {
        return this.f;
    }

    @Override // defpackage.aafx
    public final /* synthetic */ aafy g() {
        return new aafb(this);
    }

    @Override // defpackage.aafx
    public final /* synthetic */ aafz h(byte[] bArr) {
        return new aafc(this, bArr);
    }

    public final Mac j() {
        return (Mac) aafm.b.a(this.d);
    }

    public final SecretKeySpec k(byte[] bArr) {
        return new SecretKeySpec(bArr, this.b, 32, this.d);
    }

    public final SecretKeySpec l(byte[] bArr) {
        return new SecretKeySpec(bArr, 0, this.b, "AES");
    }

    public final byte[] m(byte[] bArr, byte[] bArr2) {
        return aafw.a(this.g, this.h, bArr, bArr2, this.b + 32);
    }

    public final byte[] n(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        aagc.a(byteBufferAllocate, j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }
}
