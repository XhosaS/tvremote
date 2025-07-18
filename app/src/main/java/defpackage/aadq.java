package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadq {
    public static final aads a(Integer num, Integer num2, aadr aadrVar, aadr aadrVar2, Integer num3, Integer num4) throws GeneralSecurityException {
        if (num2.intValue() != 16 && num2.intValue() != 32) {
            Objects.toString(num2);
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not ".concat(num2.toString()));
        }
        if (num.intValue() < num2.intValue()) {
            Objects.toString(num2);
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., ".concat(num2.toString()));
        }
        if (num4.intValue() <= num2.intValue() + num3.intValue() + 8) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (num2.intValue() + num3.intValue() + 9));
        }
        int i = aadrVar2 != aadr.b ? aadrVar2 == aadr.a ? 20 : 0 : 32;
        if (aadrVar2 == aadr.c) {
            i = 64;
        }
        if (num3.intValue() >= 10 && num3.intValue() <= i) {
            return new aads(num, num2, aadrVar, aadrVar2, num3, num4);
        }
        throw new GeneralSecurityException("hmacTagSize must be in range [10, " + i + "], but is " + num3);
    }
}
