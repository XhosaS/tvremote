package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uog implements ukj {
    public abstract ExtensionRegistryLite a();

    public abstract MessageLite b();

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final MessageLite c(InputStream inputStream) {
        return b().i().d(inputStream, a());
    }
}
