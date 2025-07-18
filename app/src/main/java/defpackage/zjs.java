package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjs extends zjg {
    private final MessageDigest b;
    private final int c;
    private boolean d;

    public zjs(MessageDigest messageDigest, int i) {
        this.b = messageDigest;
        this.c = i;
    }

    private final void h() {
        yqw.M(!this.d, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.zjg
    protected final void c(byte[] bArr, int i) {
        h();
        this.b.update(bArr, 0, i);
    }

    @Override // defpackage.zjo
    public final zjm n() {
        h();
        this.d = true;
        int i = this.c;
        MessageDigest messageDigest = this.b;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = zjm.b;
            return new zjk(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = zjm.b;
        return new zjk(bArrCopyOf);
    }
}
