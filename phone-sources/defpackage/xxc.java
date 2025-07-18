package defpackage;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxc {
    public static final xsj a;
    public static final xsj b;
    public static final xsj c;
    public static final xsj d;
    public static final xsj e;
    static final xsj f;
    public static final xsj g;
    public static final xsj h;
    public static final xsj i;
    public static final long j;
    public static final xte k;
    public static final xpx l;
    public static final xqe m;
    public static final ybp n;
    public static final ybp o;
    public static final ttm p;
    private static final Logger q = Logger.getLogger(xxc.class.getName());
    private static final Set r = DesugarCollections.unmodifiableSet(EnumSet.of(xth.OK, xth.INVALID_ARGUMENT, xth.NOT_FOUND, xth.ALREADY_EXISTS, xth.FAILED_PRECONDITION, xth.ABORTED, xth.OUT_OF_RANGE, xth.DATA_LOSS));

    static {
        Charset.forName("US-ASCII");
        xxb xxbVar = new xxb(0);
        int i2 = xsj.c;
        a = new xsd("grpc-timeout", xxbVar);
        b = new xsd("grpc-encoding", xsm.c);
        c = xrg.a("grpc-accept-encoding", new xxe(1));
        d = new xsd("content-encoding", xsm.c);
        e = xrg.a("accept-encoding", new xxe(1));
        f = new xsd("content-length", xsm.c);
        g = new xsd("content-type", xsm.c);
        h = new xsd("te", xsm.c);
        i = new xsd("user-agent", xsm.c);
        uof.g(',').i();
        j = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        k = new yae();
        l = new xpx("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        m = new xqe();
        n = new xwz();
        o = new ycm(1);
        p = new yad(1);
    }

    private xxc() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.xtk a(int r2) {
        /*
            r0 = 100
            if (r2 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 >= r0) goto Lb
            xth r0 = defpackage.xth.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r2 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r2 == r0) goto L35
            switch(r2) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            xth r0 = defpackage.xth.UNKNOWN
            goto L37
        L29:
            xth r0 = defpackage.xth.UNAVAILABLE
            goto L37
        L2c:
            xth r0 = defpackage.xth.UNIMPLEMENTED
            goto L37
        L2f:
            xth r0 = defpackage.xth.PERMISSION_DENIED
            goto L37
        L32:
            xth r0 = defpackage.xth.UNAUTHENTICATED
            goto L37
        L35:
            xth r0 = defpackage.xth.INTERNAL
        L37:
            xtk r0 = r0.a()
            java.lang.String r1 = "HTTP status code "
            java.lang.String r2 = defpackage.a.cf(r2, r1)
            xtk r2 = r0.e(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxc.a(int):xtk");
    }

    public static xtk b(xtk xtkVar) {
        a.H(true);
        Set set = r;
        xth xthVar = xtkVar.n;
        if (!set.contains(xthVar)) {
            return xtkVar;
        }
        return xtk.j.e("Inappropriate status code from control plane: " + xthVar.toString() + " " + xtkVar.o).d(xtkVar.p);
    }

    static xvn c(xrr xrrVar, boolean z) {
        xvn xvnVarA;
        xru xruVar = xrrVar.b;
        if (xruVar != null) {
            xun xunVar = (xun) xruVar;
            sij.x(xunVar.g, "Subchannel is not started");
            xvnVarA = xunVar.f.a();
        } else {
            xvnVarA = null;
        }
        if (xvnVarA != null) {
            return xvnVarA;
        }
        xtk xtkVar = xrrVar.c;
        if (!xtkVar.g()) {
            if (xrrVar.d) {
                return new xws(b(xtkVar), xvl.DROPPED);
            }
            if (!z) {
                return new xws(b(xtkVar), xvl.PROCESSED);
            }
        }
        return null;
    }

    public static String d(String str, int i2) {
        String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
            i3 = i2;
        }
        try {
            return new URI(null, null, str2, i3, null, null, null).getAuthority();
        } catch (URISyntaxException e3) {
            e = e3;
            throw new IllegalArgumentException(a.cy(i3, str2, "Invalid host or port: ", " "), e);
        }
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.74.0-SNAPSHOT");
        return sb.toString();
    }

    public static URI f(String str) {
        String str2;
        str.getClass();
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    public static void g(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            q.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean h(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z ? sij.F(strTrim) || Boolean.parseBoolean(strTrim) : !sij.F(strTrim) && Boolean.parseBoolean(strTrim);
    }

    public static ThreadFactory i(String str) {
        uie uieVar = new uie();
        uieVar.c(true);
        uieVar.d(str);
        return uie.b(uieVar);
    }

    static void j(xzg xzgVar) throws IOException {
        while (true) {
            InputStream inputStreamA = xzgVar.a();
            if (inputStreamA == null) {
                return;
            } else {
                g(inputStreamA);
            }
        }
    }

    public static xqe[] k(xpy xpyVar, int i2, boolean z) {
        List list = xpyVar.e;
        int size = list.size();
        xqe[] xqeVarArr = new xqe[size + 1];
        xpyVar.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            xqeVarArr[i3] = ((wbb) list.get(i3)).b();
        }
        xqeVarArr[size] = m;
        return xqeVarArr;
    }
}
