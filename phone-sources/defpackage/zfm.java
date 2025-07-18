package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfm extends zfo {
    public static final /* synthetic */ int a = 0;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Class f;
    private final Class g;

    public zfm(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // defpackage.zfo
    public final String a(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            invocationHandler.getClass();
            zfl zflVar = (zfl) invocationHandler;
            if (!zflVar.a) {
                String str = zflVar.b;
                if (str != null) {
                    return str;
                }
                zfo.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // defpackage.zfo
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(zfo.class.getClassLoader(), new Class[]{this.f, this.g}, new zfl(wcq.aL(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.zfo
    public final void i(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }
}
