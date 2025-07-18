package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaby implements aacc {
    public final String a;
    public final aage b;
    public final abvo c;
    public final aacy d;
    public final aadj e;
    public final Integer f;

    private aaby(String str, aage aageVar, abvo abvoVar, aacy aacyVar, aadj aadjVar, Integer num) {
        this.a = str;
        this.b = aageVar;
        this.c = abvoVar;
        this.d = aacyVar;
        this.e = aadjVar;
        this.f = num;
    }

    public static aaby a(String str, abvo abvoVar, aacy aacyVar, aadj aadjVar, Integer num) {
        if (aadjVar == aadj.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        int i = aacj.a;
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i2] = (byte) cCharAt;
        }
        return new aaby(str, aage.a(bArr), abvoVar, aacyVar, aadjVar, num);
    }
}
