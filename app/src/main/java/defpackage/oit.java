package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oit extends oiu {
    private final byte[] a;

    public oit(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null keyMaterial");
        }
        this.a = bArr;
    }

    @Override // defpackage.oiu
    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oiu) {
            oiu oiuVar = (oiu) obj;
            oiuVar.c();
            if (Arrays.equals(this.a, oiuVar instanceof oit ? ((oit) oiuVar).a : oiuVar.a())) {
                oiuVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 720379956) * 1000003) ^ 1;
    }

    public final String toString() {
        return "EncryptionKey{keyVersion=-1, keyMaterial=" + Arrays.toString(this.a) + ", encryptionAlgorithm=AES_GCM_256}";
    }

    @Override // defpackage.oiu
    public final void b() {
    }

    @Override // defpackage.oiu
    public final void c() {
    }
}
