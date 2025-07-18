package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0097e extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C0097e("Unsupported " + str + " :" + serializable);
    }
}
