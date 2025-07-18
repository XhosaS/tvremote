package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.abvo;
import defpackage.abvt;
import defpackage.abvu;
import defpackage.abwx;
import defpackage.abxd;
import defpackage.abxv;
import defpackage.abyr;
import defpackage.abyy;
import defpackage.abza;
import defpackage.abzc;
import defpackage.abzj;
import defpackage.abzz;
import defpackage.acrb;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClientErrorOuterClass$AndroidStackInfo extends abxd implements abyr {
    public static final ClientErrorOuterClass$AndroidStackInfo a;
    private static volatile abyy b;

    static {
        ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo = new ClientErrorOuterClass$AndroidStackInfo();
        a = clientErrorOuterClass$AndroidStackInfo;
        clientErrorOuterClass$AndroidStackInfo.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ClientErrorOuterClass$AndroidStackInfo.class, clientErrorOuterClass$AndroidStackInfo);
    }

    private ClientErrorOuterClass$AndroidStackInfo() {
        abvo abvoVar = abvo.b;
    }

    public static ClientErrorOuterClass$AndroidStackInfo getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$AndroidStackInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        abvt abvtVarQ = abvt.Q(byteBuffer);
        ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo = new ClientErrorOuterClass$AndroidStackInfo();
        try {
            abzj abzjVarA = abza.a.a(clientErrorOuterClass$AndroidStackInfo.getClass());
            abzjVarA.i(clientErrorOuterClass$AndroidStackInfo, abvu.p(abvtVarQ), extensionRegistryLite);
            abzjVarA.g(clientErrorOuterClass$AndroidStackInfo);
            Byte b2 = (byte) 1;
            b2.getClass();
            b2.getClass();
            return clientErrorOuterClass$AndroidStackInfo;
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
            return new ClientErrorOuterClass$AndroidStackInfo();
        }
        if (i2 == 4) {
            return new acrb();
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
        synchronized (ClientErrorOuterClass$AndroidStackInfo.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
