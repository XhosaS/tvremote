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
import defpackage.abzc;
import defpackage.abzj;
import defpackage.abzz;
import defpackage.acrk;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClientErrorOuterClass$JsStackTraceElement extends abxd implements abyr {
    public static final ClientErrorOuterClass$JsStackTraceElement a;
    private static volatile abyy b;

    static {
        ClientErrorOuterClass$JsStackTraceElement clientErrorOuterClass$JsStackTraceElement = new ClientErrorOuterClass$JsStackTraceElement();
        a = clientErrorOuterClass$JsStackTraceElement;
        clientErrorOuterClass$JsStackTraceElement.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ClientErrorOuterClass$JsStackTraceElement.class, clientErrorOuterClass$JsStackTraceElement);
    }

    private ClientErrorOuterClass$JsStackTraceElement() {
    }

    public static ClientErrorOuterClass$JsStackTraceElement getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$JsStackTraceElement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        abvt abvtVarQ = abvt.Q(byteBuffer);
        ClientErrorOuterClass$JsStackTraceElement clientErrorOuterClass$JsStackTraceElement = new ClientErrorOuterClass$JsStackTraceElement();
        try {
            abzj abzjVarA = abza.a.a(clientErrorOuterClass$JsStackTraceElement.getClass());
            abzjVarA.i(clientErrorOuterClass$JsStackTraceElement, abvu.p(abvtVarQ), extensionRegistryLite);
            abzjVarA.g(clientErrorOuterClass$JsStackTraceElement);
            Byte b2 = (byte) 1;
            b2.getClass();
            b2.getClass();
            return clientErrorOuterClass$JsStackTraceElement;
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
            return new ClientErrorOuterClass$JsStackTraceElement();
        }
        if (i2 == 4) {
            return new acrk();
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
        synchronized (ClientErrorOuterClass$JsStackTraceElement.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
