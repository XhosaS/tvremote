package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.abvt;
import defpackage.abvu;
import defpackage.abwx;
import defpackage.abxd;
import defpackage.abxv;
import defpackage.abyr;
import defpackage.abyy;
import defpackage.abza;
import defpackage.abzb;
import defpackage.abzc;
import defpackage.abzj;
import defpackage.abzz;
import defpackage.acrn;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClientErrorOuterClass$MultiLanguageStackInfo extends abxd implements abyr {
    public static final ClientErrorOuterClass$MultiLanguageStackInfo a;
    private static volatile abyy b;

    static {
        ClientErrorOuterClass$MultiLanguageStackInfo clientErrorOuterClass$MultiLanguageStackInfo = new ClientErrorOuterClass$MultiLanguageStackInfo();
        a = clientErrorOuterClass$MultiLanguageStackInfo;
        clientErrorOuterClass$MultiLanguageStackInfo.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ClientErrorOuterClass$MultiLanguageStackInfo.class, clientErrorOuterClass$MultiLanguageStackInfo);
    }

    private ClientErrorOuterClass$MultiLanguageStackInfo() {
        Object[] objArr = abzb.a;
    }

    public static ClientErrorOuterClass$MultiLanguageStackInfo getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$MultiLanguageStackInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        abvt abvtVarQ = abvt.Q(byteBuffer);
        ClientErrorOuterClass$MultiLanguageStackInfo clientErrorOuterClass$MultiLanguageStackInfo = new ClientErrorOuterClass$MultiLanguageStackInfo();
        try {
            abzj abzjVarA = abza.a.a(clientErrorOuterClass$MultiLanguageStackInfo.getClass());
            abzjVarA.i(clientErrorOuterClass$MultiLanguageStackInfo, abvu.p(abvtVarQ), extensionRegistryLite);
            abzjVarA.g(clientErrorOuterClass$MultiLanguageStackInfo);
            Byte b2 = (byte) 1;
            b2.getClass();
            b2.getClass();
            return clientErrorOuterClass$MultiLanguageStackInfo;
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

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new ClientErrorOuterClass$MultiLanguageStackInfo();
        }
        if (i2 == 4) {
            return new acrn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ClientErrorOuterClass$MultiLanguageStackInfo.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
