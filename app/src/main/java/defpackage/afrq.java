package defpackage;

import io.grpc.Status;
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
/* loaded from: classes2.dex */
public final class afrq {
    public static final afid a;
    public static final afid b;
    public static final afid c;
    public static final afid d;
    public static final afid e;
    static final afid f;
    public static final afid g;
    public static final afid h;
    public static final afid i;
    public static final long j;
    public static final afjg k;
    public static final afel l;
    public static final afzt m;
    public static final afzt n;
    public static final yrp o;
    private static final Logger p = Logger.getLogger(afrq.class.getName());
    private static final Set q = DesugarCollections.unmodifiableSet(EnumSet.of(Status.Code.OK, Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS));
    private static final afev r;

    static {
        Charset.forName("US-ASCII");
        afrp afrpVar = new afrp();
        int i2 = afid.c;
        a = new afia("grpc-timeout", afrpVar);
        b = new afia("grpc-encoding", afih.b);
        c = afgt.a("grpc-accept-encoding", new afrn());
        d = new afia("content-encoding", afih.b);
        e = afgt.a("accept-encoding", new afrn());
        f = new afia("content-length", afih.b);
        g = new afia("content-type", afih.b);
        h = new afia("te", afih.b);
        i = new afia("user-agent", afih.b);
        yrl.b(new ypz(',')).d(yqc.b);
        j = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        k = new afwm();
        l = new afel("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        r = new afrj();
        m = new afrk();
        n = new afrl();
        o = new afrm();
    }

    private afrq() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.grpc.Status a(int r2) {
        /*
            r0 = 100
            if (r2 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 >= r0) goto Lb
            io.grpc.Status$Code r0 = io.grpc.Status.Code.INTERNAL
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
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNKNOWN
            goto L37
        L29:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNAVAILABLE
            goto L37
        L2c:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNIMPLEMENTED
            goto L37
        L2f:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.PERMISSION_DENIED
            goto L37
        L32:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNAUTHENTICATED
            goto L37
        L35:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.INTERNAL
        L37:
            io.grpc.Status r0 = r0.a()
            java.lang.String r1 = "HTTP status code "
            java.lang.String r2 = defpackage.a.b(r2, r1)
            io.grpc.Status r2 = r0.withDescription(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afrq.a(int):io.grpc.Status");
    }

    public static Status b(Status status) {
        yqw.A(status != null);
        if (!q.contains(status.getCode())) {
            return status;
        }
        return Status.k.withDescription("Inappropriate status code from control plane: " + status.getCode().toString() + " " + status.getDescription()).c(status.o);
    }

    static afoh c(afhg afhgVar, boolean z) {
        afoh afohVarA;
        afhj afhjVar = afhgVar.b;
        if (afhjVar != null) {
            aful afulVar = (aful) afhjVar;
            yqw.M(afulVar.g, "Subchannel is not started");
            afohVarA = afulVar.f.a();
        } else {
            afohVarA = null;
        }
        if (afohVarA != null) {
            return afohVarA;
        }
        Status status = afhgVar.c;
        if (!status.e()) {
            if (afhgVar.d) {
                return new afra(b(status), afof.DROPPED);
            }
            if (!z) {
                return new afra(b(status), afof.PROCESSED);
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
            throw new IllegalArgumentException("Invalid host or port: " + str2 + " " + i3, e);
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

    static void g(afzy afzyVar) throws IOException {
        while (true) {
            InputStream inputStreamE = afzyVar.e();
            if (inputStreamE == null) {
                return;
            } else {
                h(inputStreamE);
            }
        }
    }

    public static void h(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            p.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean i(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z ? yqv.c(strTrim) || Boolean.parseBoolean(strTrim) : !yqv.c(strTrim) && Boolean.parseBoolean(strTrim);
    }

    public static ThreadFactory j(String str) {
        zyw zywVar = new zyw();
        zywVar.a = true;
        zywVar.b(str);
        return zyw.a(zywVar);
    }

    public static afev[] k(afem afemVar) {
        List list = afemVar.g;
        int size = list.size();
        afev[] afevVarArr = new afev[size + 1];
        afemVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            afevVarArr[i2] = ((afeu) list.get(i2)).a();
        }
        afevVarArr[size] = r;
        return afevVarArr;
    }
}
