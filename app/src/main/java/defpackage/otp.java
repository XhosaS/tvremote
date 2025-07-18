package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otp {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (a.compareAndSet(false, true)) {
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            ExtensionRegistryLite extensionRegistryLite = agea.a;
            generatedRegistry.getClass();
            agea.a = generatedRegistry;
        }
    }
}
