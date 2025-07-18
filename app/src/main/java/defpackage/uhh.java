package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhh implements uef {
    private final abyy a;
    private final ExtensionRegistryLite b;

    private uhh(abyy abyyVar) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
        abza abzaVar = abza.a;
        this.b = ExtensionRegistryLite.a;
        this.a = abyyVar;
    }

    public static uhh b(MessageLite messageLite) {
        return new uhh(messageLite.i());
    }

    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws IOException {
        InputStream inputStreamA = new uhi().a(ueeVar);
        try {
            Object objD = this.a.d(inputStreamA, this.b);
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            return objD;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
