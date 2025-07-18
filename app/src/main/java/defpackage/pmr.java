package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pmr {
    public static boolean a(adwd adwdVar) throws IOException {
        try {
            uhz.a(adwdVar);
            return true;
        } catch (IllegalArgumentException e) {
            qce.f(e, "Invalid transform specification");
            return false;
        }
    }
}
