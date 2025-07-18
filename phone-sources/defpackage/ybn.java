package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybn {
    public static Set a(Map map, String str) {
        xth xthVar;
        List listF = xxv.f(map, str);
        if (listF == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(xth.class);
        for (Object obj : listF) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                sij.j(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                xthVar = xtk.b(iIntValue).n;
                sij.j(xthVar.r == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new ttt("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    xth xthVar2 = xth.OK;
                    xthVar = (xth) Enum.valueOf(xth.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new ttt(a.cw(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(xthVar);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static final Object b(xpz xpzVar, xsq xsqVar, Object obj, xpy xpyVar, xsm xsmVar, yih yihVar) {
        if (xsqVar.a == xsp.UNARY) {
            return vyf.B(new ysq(new gey(new ysq(new ycc(xpyVar, xpzVar, xsqVar, xsmVar, new upo(obj, (byte[]) null), null)), xsqVar, null, 3)), yihVar);
        }
        Objects.toString(xsqVar);
        throw new IllegalArgumentException("Expected a unary RPC method, but got ".concat(xsqVar.toString()));
    }

    public static final PasswordAuthentication c(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            yae.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static final double d(long j) {
        return j + 0.0d;
    }

    public static final Object e(Throwable th) {
        th.getClass();
        return new yfx(th);
    }

    public static final void f(Object obj) {
        if (obj instanceof yfx) {
            throw ((yfx) obj).a;
        }
    }

    public static final yft g(int i, yjk yjkVar) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new ygj(yjkVar) : new yfz(yjkVar) : new yga(yjkVar);
    }

    public static final void h(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (yjf.ak()) {
                th.addSuppressed(th2);
                return;
            }
            Method method = yjd.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
