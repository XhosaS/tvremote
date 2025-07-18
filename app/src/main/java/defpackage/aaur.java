package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaur extends afen {
    private final String a;
    private final aasi b;
    private final Object c = new Object();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public aaur(String str, aasi aasiVar) {
        this.a = str;
        this.b = aasiVar;
    }

    private final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            return uri.getPort() != -1 ? uri : new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.afen
    public final afeq a(afil afilVar, afem afemVar) {
        String str = (String) afemVar.h(aasq.a);
        if (str == null) {
            str = this.a;
        }
        aasi aasiVar = this.b;
        URI uriC = c(str);
        yqw.M(!TextUtils.isEmpty(uriC.getAuthority()), "Could not parse channel authority");
        Integer num = (Integer) afemVar.h(aawm.a);
        Integer num2 = (Integer) afemVar.h(aawm.b);
        Integer num3 = (Integer) afemVar.h(aasn.a);
        aasd aasdVar = (aasd) aasiVar;
        long jLongValue = ((Long) ((yrt) aasdVar.i).a).longValue();
        long j = aasdVar.k;
        long j2 = aasdVar.l;
        aatu aatuVar = new aatu(uriC, jLongValue, j, j2, num, num2, num3);
        ConcurrentHashMap concurrentHashMap = this.d;
        aaup aaupVar = (aaup) concurrentHashMap.get(aatuVar);
        if (aaupVar == null) {
            synchronized (this.c) {
                if (!concurrentHashMap.containsKey(aatuVar)) {
                    long j3 = aasu.l;
                    yrp yrpVar = new yrp() { // from class: aass
                        @Override // defpackage.yrp
                        public final Object eV() {
                            long j4 = aasu.l;
                            return false;
                        }
                    };
                    aase aaseVar = new aase();
                    aaseVar.h = yrpVar;
                    aaseVar.c(4194304);
                    aaseVar.a(Long.MAX_VALUE);
                    aaseVar.b(aasu.l);
                    aaseVar.a = ((aasd) aasiVar).a;
                    aaseVar.b = aatuVar.a;
                    aaseVar.i = aatuVar.c;
                    aaseVar.j = aatuVar.d;
                    aaseVar.k = aatuVar.b;
                    aaseVar.o = (byte) (aaseVar.o | 1);
                    aaseVar.c = ((aasd) aasiVar).d;
                    aaseVar.d = ((aasd) aasiVar).e;
                    aaseVar.e = ((aasd) aasiVar).c;
                    aaseVar.f = ((aasd) aasiVar).f;
                    aaseVar.g = ((aasd) aasiVar).g;
                    aaseVar.h = ((aasd) aasiVar).h;
                    aaseVar.a(j);
                    aaseVar.b(j2);
                    Integer num4 = aatuVar.e;
                    if (num4 != null) {
                        aaseVar.c(num4.intValue());
                    } else {
                        aaseVar.c(((aasd) aasiVar).j);
                    }
                    aasv aasvVar = ((aasd) aasiVar).b;
                    if (aaseVar.o == 15 && aaseVar.a != null && aaseVar.b != null && aaseVar.c != null && aaseVar.d != null && aaseVar.e != null && aaseVar.h != null) {
                        concurrentHashMap.put(aatuVar, new aaup(aasvVar, new aasf(aaseVar.a, aaseVar.b, aaseVar.c, aaseVar.d, aaseVar.e, aaseVar.f, aaseVar.g, aaseVar.h, aaseVar.i, aaseVar.j, aaseVar.k, aaseVar.l, aaseVar.m, aaseVar.n)));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (aaseVar.a == null) {
                        sb.append(" applicationContext");
                    }
                    if (aaseVar.b == null) {
                        sb.append(" uri");
                    }
                    if (aaseVar.c == null) {
                        sb.append(" backgroundExecutor");
                    }
                    if (aaseVar.d == null) {
                        sb.append(" blockingExecutor");
                    }
                    if (aaseVar.e == null) {
                        sb.append(" lightweightExecutor");
                    }
                    if (aaseVar.h == null) {
                        sb.append(" recordNetworkMetricsToPrimes");
                    }
                    if ((aaseVar.o & 1) == 0) {
                        sb.append(" grpcIdleTimeoutMillis");
                    }
                    if ((aaseVar.o & 2) == 0) {
                        sb.append(" maxMessageSize");
                    }
                    if ((aaseVar.o & 4) == 0) {
                        sb.append(" grpcKeepAliveTimeMillis");
                    }
                    if ((aaseVar.o & 8) == 0) {
                        sb.append(" grpcKeepAliveTimeoutMillis");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                aaupVar = (aaup) concurrentHashMap.get(aatuVar);
            }
        }
        return aaupVar.a(afilVar, afemVar);
    }

    @Override // defpackage.afen
    public final String b() {
        return this.a;
    }
}
