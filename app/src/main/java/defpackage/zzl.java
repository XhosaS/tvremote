package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzl {
    public static zzu a(zzk zzkVar) {
        try {
            InputStream inputStream = zzkVar.a;
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
            aade aadeVar = aade.a;
            abvt abvtVarK = abvt.K(inputStream, 4096);
            aade aadeVar2 = new aade();
            try {
                try {
                    try {
                        try {
                            abzj abzjVarA = abza.a.a(aadeVar2.getClass());
                            abzjVarA.i(aadeVar2, abvu.p(abvtVarK), extensionRegistryLite2);
                            abzjVarA.g(aadeVar2);
                            Byte b = (byte) 1;
                            b.getClass();
                            zzkVar.a.close();
                            return zzu.b(aadeVar2);
                        } catch (RuntimeException e) {
                            if (e.getCause() instanceof abxv) {
                                throw ((abxv) e.getCause());
                            }
                            throw e;
                        }
                    } catch (IOException e2) {
                        if (e2.getCause() instanceof abxv) {
                            throw ((abxv) e2.getCause());
                        }
                        throw new abxv(e2);
                    }
                } catch (abxv e3) {
                    if (e3.a) {
                        throw new abxv(e3);
                    }
                    throw e3;
                }
            } catch (abzz e4) {
                throw e4.a();
            }
        } catch (Throwable th) {
            zzkVar.a.close();
            throw th;
        }
    }
}
