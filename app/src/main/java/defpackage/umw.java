package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umw {
    public static ujk a(String str, zyd zydVar, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, Executor executor, yqt yqtVar, ueg uegVar) {
        return new ujk(new umt(str, zydVar, new uof(messageLite, extensionRegistryLite), executor, uegVar, yqtVar, new wuv()), uoe.a, zxn.h(""), true, "singleproc");
    }
}
