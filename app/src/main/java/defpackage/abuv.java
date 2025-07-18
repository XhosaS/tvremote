package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abuv implements abyy {
    public static final ExtensionRegistryLite a;

    static {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
        abza abzaVar = abza.a;
        a = ExtensionRegistryLite.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final MessageLite a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        abvt abvtVarK = abvt.K(inputStream, 4096);
        ?? H = h(abvtVarK, extensionRegistryLite);
        abvtVarK.z(0);
        return H;
    }

    @Override // defpackage.abyy
    public final /* synthetic */ Object b(byte[] bArr) {
        MessageLite messageLiteG = g(bArr, bArr.length, a);
        f(messageLiteG);
        return messageLiteG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.abyy
    public final /* bridge */ /* synthetic */ Object c(abvt abvtVar, ExtensionRegistryLite extensionRegistryLite) {
        ?? H = h(abvtVar, extensionRegistryLite);
        f(H);
        return H;
    }

    @Override // defpackage.abyy
    public final /* synthetic */ Object d(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        MessageLite messageLiteA = a(inputStream, extensionRegistryLite);
        f(messageLiteA);
        return messageLiteA;
    }

    @Override // defpackage.abyy
    public final /* synthetic */ Object e(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        MessageLite messageLiteG = g(bArr, bArr.length, extensionRegistryLite);
        f(messageLiteG);
        return messageLiteG;
    }

    public final void f(MessageLite messageLite) {
        if (messageLite != null && !messageLite.z()) {
            throw new abzz().a();
        }
    }

    public MessageLite g(byte[] bArr, int i, ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }
}
