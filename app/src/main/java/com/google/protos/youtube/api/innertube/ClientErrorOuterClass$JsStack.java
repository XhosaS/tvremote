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
import defpackage.acrj;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClientErrorOuterClass$JsStack extends abxd implements abyr {
    public static final ClientErrorOuterClass$JsStack a;
    private static volatile abyy b;

    static {
        ClientErrorOuterClass$JsStack clientErrorOuterClass$JsStack = new ClientErrorOuterClass$JsStack();
        a = clientErrorOuterClass$JsStack;
        clientErrorOuterClass$JsStack.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ClientErrorOuterClass$JsStack.class, clientErrorOuterClass$JsStack);
    }

    private ClientErrorOuterClass$JsStack() {
        Object[] objArr = abzb.a;
    }

    public static ClientErrorOuterClass$JsStack getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$JsStack parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        abvt abvtVarQ = abvt.Q(byteBuffer);
        ClientErrorOuterClass$JsStack clientErrorOuterClass$JsStack = new ClientErrorOuterClass$JsStack();
        try {
            abzj abzjVarA = abza.a.a(clientErrorOuterClass$JsStack.getClass());
            abzjVarA.i(clientErrorOuterClass$JsStack, abvu.p(abvtVarQ), extensionRegistryLite);
            abzjVarA.g(clientErrorOuterClass$JsStack);
            Byte b2 = (byte) 1;
            b2.getClass();
            b2.getClass();
            return clientErrorOuterClass$JsStack;
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
            return new ClientErrorOuterClass$JsStack();
        }
        if (i2 == 4) {
            return new acrj();
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
        synchronized (ClientErrorOuterClass$JsStack.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
