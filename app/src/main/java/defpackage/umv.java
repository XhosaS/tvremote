package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umv {
    public static ujk a(String str, zyd zydVar, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, Executor executor, yqt yqtVar, ueg uegVar) {
        return new ujk(new uld(str, zydVar, new uof(messageLite, extensionRegistryLite), executor, uegVar, yqtVar, true, new ulb() { // from class: umu
            @Override // defpackage.ulb
            public final void a() {
                ula.a.eV();
            }
        }, new wuv()), uoe.a, zxn.h(""), true, "mmap");
    }
}
