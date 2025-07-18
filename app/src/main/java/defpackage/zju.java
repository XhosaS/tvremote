package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zju extends zjh implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public zju(String str, int i, String str2) {
        this.d = str2;
        MessageDigest messageDigestD = d(str);
        this.a = messageDigestD;
        int digestLength = messageDigestD.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        yqw.G(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = e(messageDigestD);
    }

    private static MessageDigest d(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean e(MessageDigest messageDigest) throws CloneNotSupportedException {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.zjn
    public final zjo c() {
        if (this.c) {
            try {
                return new zjs((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zjs(d(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new zjt(this.a.getAlgorithm(), this.b, this.d);
    }

    public zju(String str, String str2) {
        MessageDigest messageDigestD = d(str);
        this.a = messageDigestD;
        this.b = messageDigestD.getDigestLength();
        this.d = str2;
        this.c = e(messageDigestD);
    }
}
