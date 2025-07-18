package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0069d extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C0069d("Unsupported " + str + " :" + serializable);
    }
}
