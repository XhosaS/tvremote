package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfu implements zfw {
    public static final zft a = new zft();
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;

    public zfu(Class cls) throws NoSuchMethodException, SecurityException {
        this.b = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", String.class);
        this.e = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.zfw
    public final String a(SSLSocket sSLSocket) {
        if (!d(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.e.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, ynd.a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && yks.e(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.zfw
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (d(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, true);
                this.d.invoke(sSLSocket, str);
                Method method = this.f;
                zfo zfoVar = zfo.b;
                zgk zgkVar = new zgk();
                for (String str2 : wcq.aL(list)) {
                    zgkVar.M(str2.length());
                    zgkVar.V(str2);
                }
                method.invoke(sSLSocket, zgkVar.E());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.zfw
    public final boolean c() {
        return zfk.a;
    }

    @Override // defpackage.zfw
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.isInstance(sSLSocket);
    }

    public zfu(Class cls, byte[] bArr) {
        this(cls);
    }
}
