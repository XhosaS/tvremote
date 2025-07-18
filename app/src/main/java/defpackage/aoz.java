package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoz {
    public final MessageLite a;
    private final ExtensionRegistryLite b;

    public aoz(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        this.a = messageLite;
        this.b = extensionRegistryLite;
    }

    public final Object a(InputStream inputStream) throws als {
        try {
            Object objD = this.a.i().d(inputStream, this.b);
            objD.getClass();
            return objD;
        } catch (abxv e) {
            throw new als(e);
        }
    }
}
