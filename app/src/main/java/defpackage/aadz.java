package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadz {
    public static final aaeb a(Integer num, Integer num2, aaea aaeaVar, Integer num3) throws GeneralSecurityException {
        if (num2.intValue() != 16 && num2.intValue() != 32) {
            Objects.toString(num2);
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not ".concat(num2.toString()));
        }
        if (num.intValue() < num2.intValue()) {
            Objects.toString(num2);
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., ".concat(num2.toString()));
        }
        if (num3.intValue() > num2.intValue() + 24) {
            return new aaeb(num, num2, aaeaVar, num3);
        }
        throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (num2.intValue() + 25));
    }
}
