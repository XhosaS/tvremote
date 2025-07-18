package defpackage;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class jue {
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+|\\*)");
    public static final SimpleDateFormat b;
    public static final Object c;
    public final jtm d;
    public final Executor e;
    public final zye f = new zye(new Callable() { // from class: jtz
        @Override // java.util.concurrent.Callable
        public final Object call() {
            Pattern pattern = jue.a;
            return null;
        }
    });
    public final zkq g = new zkq();
    public final AtomicInteger h = new AtomicInteger(0);
    public final jva i;
    private final jvc j;

    static {
        Object obj = new Object();
        c = obj;
        synchronized (obj) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            b = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }
    }

    public jue(jva jvaVar, jtm jtmVar, jvc jvcVar, Executor executor) {
        this.i = jvaVar;
        this.d = jtmVar;
        this.j = jvcVar;
        this.e = executor;
    }

    public static void b(boolean z, String str, Object... objArr) throws jtj {
        if (!z) {
            throw new jtj(String.format(str, objArr));
        }
    }

    public static long c(jta jtaVar) throws jtj {
        Date date;
        List list = (List) jtaVar.b.getAllHeaders().get("Last-Modified");
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        String str = (String) list.get(0);
        try {
            synchronized (c) {
                date = b.parse(str);
            }
            if (date != null) {
                return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
            }
            throw new jtj(a.j(str, "Invalid Last-Modified header: "));
        } catch (ParseException e) {
            throw new jtj("Invalid Last-Modified header: ".concat(String.valueOf(str)), e);
        }
    }

    public final zwx a(final URI uri) {
        final jtd jtdVarB = this.j.b(uri.toString());
        jss jssVar = (jss) this.d;
        yze yzeVar = jssVar.b;
        Collection collectionF = yzeVar.c;
        if (collectionF == null) {
            collectionF = yzeVar.f();
            yzeVar.c = collectionF;
        }
        zdl it = ((yxy) collectionF).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jtdVarB.a.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        int i = jssVar.e;
        if (i != 0) {
            ((ExperimentalUrlRequest.Builder) jtdVarB.a).setTrafficStatsTag(i);
        }
        zyd zydVarB = jssVar.d.b();
        zvi zviVar = new zvi() { // from class: jts
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final Long l = (Long) obj;
                if (l.longValue() <= 0) {
                    return zxy.a;
                }
                final jtd jtdVar = jtdVarB;
                URI uri2 = uri;
                final jue jueVar = this.a;
                jueVar.i.a("Existing bytes found. numExistingBytes=%d, uri=%s", l, uri2.toString());
                return zuz.h(((jss) jueVar.d).d.d(), new zvi() { // from class: jua
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        jtk jtkVar = (jtk) obj2;
                        try {
                            String strB = jtkVar.b();
                            long jA = jtkVar.a();
                            if (strB.isEmpty()) {
                                if (jA <= 0) {
                                    throw new IllegalArgumentException();
                                }
                                synchronized (jue.c) {
                                    strB = jue.b.format(new Date(TimeUnit.SECONDS.toMillis(jA)));
                                }
                            }
                            Long l2 = l;
                            UrlRequest.Builder builder = jtdVar.a;
                            builder.addHeader("Range", "bytes=" + l2 + "-");
                            builder.addHeader("If-Range", strB);
                            return zxy.a;
                        } catch (IllegalArgumentException unused) {
                            jue jueVar2 = jueVar;
                            jueVar2.i.a("Missing destination metadata; clearing destination to avoid corruption", new Object[0]);
                            return ((jss) jueVar2.d).d.a();
                        }
                    }
                }, jueVar.e);
            }
        };
        Executor executor = this.e;
        zwx zwxVarU = zwx.u(zuz.h(zydVarB, zviVar, executor));
        zvi zviVar2 = new zvi() { // from class: jto
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zxy.a;
            }
        };
        zwk zwkVar = zwk.a;
        zyd zydVarH = zuz.h(zud.h(zuz.g(zuz.h(zuz.h(zwxVarU, zviVar2, zwkVar), new zvi() { // from class: jtp
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zxy.a;
            }
        }, executor), new yqi() { // from class: jtq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String str = (String) obj;
                Pattern pattern = jue.a;
                jtd jtdVar = jtdVarB;
                if (str != null) {
                    jtdVar.a.addHeader("Authorization", "Bearer ".concat(str));
                }
                return new jtc(jtdVar);
            }
        }, zwkVar), IOException.class, new zvi() { // from class: jtr
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                Pattern pattern = jue.a;
                return zxn.g(new jtj((IOException) obj));
            }
        }, zwkVar), new zvi() { // from class: jub
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                jtc jtcVar = (jtc) obj;
                this.a.i.a("Sending URL request: uri=%s", uri);
                jtcVar.getClass();
                jtcVar.a.start();
                return jtcVar.b;
            }
        }, executor);
        zyd zydVarH2 = zuz.h(zydVarH, new zvi() { // from class: juc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zxy.a;
            }
        }, executor);
        final zwx zwxVar = (zwx) zydVarH;
        return (zwx) zuz.h(zydVarH2, new zvi() { // from class: jud
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.d((jta) zxn.o(zwxVar), uri.toString());
            }
        }, executor);
    }

    public final zyd d(jta jtaVar, String str) {
        int httpStatusCode = jtaVar.b.getHttpStatusCode();
        if (httpStatusCode < 300 || httpStatusCode >= 400) {
            return zxn.h(jtaVar);
        }
        AtomicInteger atomicInteger = this.h;
        jva jvaVar = this.i;
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        jvaVar.a("Redirect detected by response code (%d), handling redirect (%d/%d) uri=%s", Integer.valueOf(httpStatusCode), Integer.valueOf(iIncrementAndGet), 20, str);
        try {
            jtaVar.a.cancel();
            if (iIncrementAndGet > 20) {
                return zxn.g(new jtj("Too many redirects"));
            }
            String str2 = jtaVar.e;
            if (str2.isEmpty()) {
                return zxn.g(new jtj("Redirect response with no redirect url given"));
            }
            try {
                return a(new URI(str2));
            } catch (URISyntaxException e) {
                return zxn.g(new jtj("Unable to parse redirect url", e));
            }
        } catch (IOException e2) {
            return zxn.g(new jtj("Unable to close response for redirect", e2));
        }
    }
}
