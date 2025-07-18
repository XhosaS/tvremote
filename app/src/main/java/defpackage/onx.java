package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onx {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/portable/GellerUtil");

    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite a(byte[] bArr, MessageLite messageLite) {
        if (bArr == null) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/GellerUtil", "processNativeResult", 67, "GellerUtil.java")).u("Native result is null.");
            return messageLite;
        }
        try {
            return messageLite.i().e(bArr, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (abxv e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/GellerUtil", "processNativeResult", '@', "GellerUtil.java")).u("Invalid native result.");
            return messageLite;
        }
    }

    public static void b(yqt yqtVar, rqs rqsVar) {
        if (yqtVar.g()) {
            ((ros) yqtVar.c()).a(rqsVar);
        }
    }

    public static void c(yqt yqtVar, rqw rqwVar, abqb abqbVar) {
        if (yqtVar.g()) {
            ((ros) yqtVar.c()).a(rqwVar.b(abqbVar));
        }
    }
}
