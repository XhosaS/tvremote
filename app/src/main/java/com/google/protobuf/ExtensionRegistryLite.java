package com.google.protobuf;

import defpackage.abwl;
import defpackage.abwu;
import defpackage.abxc;
import defpackage.abza;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExtensionRegistryLite {
    public static final ExtensionRegistryLite a = new ExtensionRegistryLite(null);
    private static volatile boolean b = false;
    private static volatile ExtensionRegistryLite c;
    private final Map d;

    public ExtensionRegistryLite() {
        this.d = new HashMap();
    }

    public static ExtensionRegistryLite getGeneratedRegistry() {
        ExtensionRegistryLite extensionRegistryLite = c;
        if (extensionRegistryLite != null) {
            return extensionRegistryLite;
        }
        synchronized (ExtensionRegistryLite.class) {
            ExtensionRegistryLite extensionRegistryLite2 = c;
            if (extensionRegistryLite2 != null) {
                return extensionRegistryLite2;
            }
            abza abzaVar = abza.a;
            ExtensionRegistryLite extensionRegistryLiteB = abwu.b(ExtensionRegistryLite.class);
            c = extensionRegistryLiteB;
            return extensionRegistryLiteB;
        }
    }

    public abxc a(MessageLite messageLite, int i) {
        return (abxc) this.d.get(new abwl(messageLite, i));
    }

    public final void b(abxc abxcVar) {
        this.d.put(new abwl(abxcVar.a, abxcVar.d.b), abxcVar);
    }

    public ExtensionRegistryLite(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
