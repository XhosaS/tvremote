package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abwx extends abuv {
    public final abxd b;

    public abwx(abxd abxdVar) {
        this.b = abxdVar;
    }

    @Override // defpackage.abuv
    public final /* synthetic */ MessageLite g(byte[] bArr, int i, ExtensionRegistryLite extensionRegistryLite) {
        return abxd.h(this.b, bArr, 0, i, extensionRegistryLite);
    }

    @Override // defpackage.abyy
    public final /* synthetic */ Object h(abvt abvtVar, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        Map map = abxd.defaultInstanceMap;
        abxd abxdVar = (abxd) this.b.cM(4, null);
        try {
            abzj abzjVarA = abza.a.a(abxdVar.getClass());
            abzjVarA.i(abxdVar, abvu.p(abvtVar), extensionRegistryLite);
            abzjVarA.g(abxdVar);
            return abxdVar;
        } catch (abxv e) {
            if (e.a) {
                throw new abxv(e);
            }
            throw e;
        } catch (abzz e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof abxv) {
                throw ((abxv) e3.getCause());
            }
            throw new abxv(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof abxv) {
                throw ((abxv) e4.getCause());
            }
            throw e4;
        }
    }
}
