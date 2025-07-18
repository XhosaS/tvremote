package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzd extends tys {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public tzd(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void f() {
        sij.x(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.tys
    protected final void b(byte[] bArr, int i) {
        f();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.tza
    public final tyy m() {
        f();
        this.c = true;
        int i = this.b;
        MessageDigest messageDigest = this.a;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = tyy.b;
            return new tyw(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = tyy.b;
        return new tyw(bArrCopyOf);
    }
}
