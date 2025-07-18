package defpackage;

import android.util.Base64;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oey {
    private static final SecureRandom a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
