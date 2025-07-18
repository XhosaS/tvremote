package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaab {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new aaaa();

    public static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        int i3 = aacj.a;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        if (numValueOf != null) {
            numValueOf.intValue();
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    public static Cipher b() {
        return (Cipher) b.get();
    }
}
