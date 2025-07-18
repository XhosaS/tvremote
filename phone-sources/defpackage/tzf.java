package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzf extends tyt implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public tzf(String str, int i) {
        this.d = "Hashing.sha512()";
        MessageDigest messageDigestF = f(str);
        this.a = messageDigestF;
        int digestLength = messageDigestF.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        sij.t(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = g(messageDigestF);
    }

    private static MessageDigest f(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean g(MessageDigest messageDigest) throws CloneNotSupportedException {
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

    @Override // defpackage.tyz
    public final tza e() {
        if (this.c) {
            try {
                return new tzd((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new tzd(f(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new tze(this.a.getAlgorithm(), this.b);
    }

    public tzf() {
        MessageDigest messageDigestF = f("SHA-512");
        this.a = messageDigestF;
        this.b = messageDigestF.getDigestLength();
        this.d = "Hashing.sha512()";
        this.c = g(messageDigestF);
    }
}
