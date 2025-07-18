package defpackage;

import android.content.IntentFilter;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jux {
    public static final /* synthetic */ int j = 0;
    private static final yzq k = yzq.q("http", "https");
    public final Executor a;
    public final IdentityHashMap b = new IdentityHashMap();
    public final Queue c = new ArrayDeque();
    public final List d = new ArrayList();
    public final Map e = new HashMap();
    public final Object f = new Object();
    public final Set g = new HashSet();
    public int h = 0;
    public final jva i;
    private final yyr l;
    private final jsy m;
    private final int n;

    public jux(juu juuVar) {
        yyr yyrVarJ = yyr.j(juuVar.a);
        yqw.B(!yyrVarJ.isEmpty(), "Must have at least one UrlEngine");
        yqw.B(juuVar.b != null, "Must set a callback executor");
        yqw.B(juuVar.e != null, "Must set a logger");
        yqw.B(juuVar.c != null, "Must set a connectivity handler");
        this.l = yyrVarJ;
        this.a = juuVar.b;
        this.i = juuVar.e;
        this.m = juuVar.c;
        this.n = juuVar.d;
    }

    private final void f(final juv juvVar) {
        this.c.add(juvVar);
        zye zyeVarC = juvVar.c();
        zyeVarC.a.a(new Runnable() { // from class: jur
            @Override // java.lang.Runnable
            public final void run() {
                juv juvVar2 = juvVar;
                jux juxVar = this.a;
                synchronized (juxVar.f) {
                    if (juxVar.c.remove(juvVar2)) {
                        juxVar.e();
                    }
                }
            }
        }, zwk.a);
        e();
    }

    public final zwx a(final jtm jtmVar, final int i) {
        zyd zydVarH;
        synchronized (this.f) {
            zye zyeVar = new zye(new Callable() { // from class: jul
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = jux.j;
                    return null;
                }
            });
            zwx zwxVarU = zwx.u(zyeVar);
            zvi zviVar = new zvi() { // from class: jum
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    return this.a.b(jtmVar);
                }
            };
            Executor executor = this.a;
            zydVarH = zud.h(zuz.h(zuz.h(zwxVarU, zviVar, executor), new zvi() { // from class: jun
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    final jue jueVar = (jue) obj;
                    jueVar.h.set(0);
                    zwx zwxVarA = jueVar.a(((jss) jueVar.d).a);
                    zvi zviVar2 = new zvi() { // from class: jtn
                        @Override // defpackage.zvi
                        public final zyd a(Object obj2) {
                            final jta jtaVar = (jta) obj2;
                            jtaVar.getClass();
                            final jue jueVar2 = jueVar;
                            jueVar2.g.a(jtaVar);
                            jss jssVar = (jss) jueVar2.d;
                            jueVar2.i.a("Got URL response, starting to read response body. uri=%s", jssVar.a);
                            yze yzeVar = jssVar.b;
                            zyd zydVarA = zxy.a;
                            boolean zContainsKey = yzeVar.map.containsKey("Range");
                            final jti jtiVar = jssVar.d;
                            if (zContainsKey && jtaVar.b.getHttpStatusCode() != 206) {
                                zydVarA = jtiVar.a();
                            }
                            zwx zwxVarU2 = zwx.u(zydVarA);
                            zvi zviVar3 = new zvi() { // from class: jtt
                                @Override // defpackage.zvi
                                public final zyd a(Object obj3) throws jtj, NumberFormatException {
                                    long j2;
                                    Pattern pattern = jue.a;
                                    jta jtaVar2 = jtaVar;
                                    UrlResponseInfo urlResponseInfo = jtaVar2.b;
                                    if (urlResponseInfo.getHttpStatusCode() != 206) {
                                        j2 = 0;
                                    } else {
                                        List list = (List) urlResponseInfo.getAllHeaders().get("Content-Range");
                                        jue.b((list == null || list.isEmpty()) ? false : true, "Host returned 206/PARTIAL response code but didn't provide a 'Content-Range' response header", new Object[0]);
                                        list.getClass();
                                        String str = (String) list.get(0);
                                        Pattern pattern2 = jue.a;
                                        Matcher matcher = pattern2.matcher(str);
                                        jue.b(matcher.matches() && matcher.groupCount() > 0, "Content-Range response header didn't match expected pattern. Was '%s', expected '%s'", str, pattern2.pattern());
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        j2 = Long.parseLong(strGroup);
                                    }
                                    List list2 = (List) urlResponseInfo.getAllHeaders().get("ETag");
                                    return jtiVar.c(j2, new jsq((list2 == null || list2.isEmpty()) ? "" : (String) list2.get(0), jue.c(jtaVar2)));
                                }
                            };
                            Executor executor2 = jueVar2.e;
                            return zud.h(zuz.h(zuz.h(zwxVarU2, zviVar3, executor2), new zvi() { // from class: jtu
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.zvi
                                public final zyd a(Object obj3) {
                                    WritableByteChannel writableByteChannel = (WritableByteChannel) obj3;
                                    jueVar2.g.a(writableByteChannel);
                                    if (writableByteChannel instanceof SelectableChannel) {
                                        yqw.M(((SelectableChannel) writableByteChannel).isBlocking(), "Target channels used by UrlEngine must be in blocking mode to ensure writes happen correctly; call SelectableChannel#configureBlocking(true).");
                                    }
                                    jta jtaVar2 = jtaVar;
                                    yqw.L(writableByteChannel.isOpen());
                                    jtaVar2.d.a = writableByteChannel;
                                    jtaVar2.a.read(ByteBuffer.allocateDirect(131072));
                                    return jtaVar2.c;
                                }
                            }, executor2), IOException.class, new zvi() { // from class: jtv
                                @Override // defpackage.zvi
                                public final zyd a(Object obj3) {
                                    Pattern pattern = jue.a;
                                    return zxn.g(new jtj((IOException) obj3));
                                }
                            }, zwk.a);
                        }
                    };
                    Executor executor2 = jueVar.e;
                    zyd zydVarH2 = zuz.h(zud.h(zud.h(zuz.h(zwxVarA, zviVar2, executor2), jvb.class, new zvi() { // from class: jtw
                        @Override // defpackage.zvi
                        public final zyd a(Object obj2) throws jtj {
                            jvb jvbVar = (jvb) obj2;
                            Pattern pattern = jue.a;
                            jvbVar.getClass();
                            if (((jsx) jvbVar.a).b == 416) {
                                return zxn.h(0L);
                            }
                            throw new jtj(jvbVar);
                        }
                    }, executor2), Throwable.class, new zvi() { // from class: jtx
                        @Override // defpackage.zvi
                        public final zyd a(Object obj2) throws Throwable {
                            jueVar.g.close();
                            return zxn.g((Throwable) obj2);
                        }
                    }, executor2), new zvi() { // from class: jty
                        @Override // defpackage.zvi
                        public final zyd a(Object obj2) throws Throwable {
                            Long l = (Long) obj2;
                            l.getClass();
                            jue jueVar2 = jueVar;
                            URI uri = ((jss) jueVar2.d).a;
                            jva jvaVar = jueVar2.i;
                            jvaVar.a("Response body written. bytesWritten=%d, uri=%s", l, uri);
                            jvaVar.a("Request complete, closing. uri=%s", uri);
                            jueVar2.g.close();
                            return zxn.h(new jst(l.longValue()));
                        }
                    }, executor2);
                    ((zwx) zydVarH2).d(jueVar.f, executor2);
                    return zydVarH2;
                }
            }, executor), Exception.class, new zvi() { // from class: juo
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    zwx zwxVarA;
                    Exception exc = (Exception) obj;
                    int i2 = i;
                    Integer numValueOf = Integer.valueOf(i2);
                    jtm jtmVar2 = jtmVar;
                    ((zdv) ((zdv) ((zdv) jva.a.d()).p(exc)).q("com/google/android/downloader/FloggerDownloaderLogger", "logWarning", 36, "FloggerDownloaderLogger.java")).M("Error reading download result. attempt=%d/%d, uri=%s", new Object[]{numValueOf, 3, ((jss) jtmVar2).a});
                    jux juxVar = this.a;
                    synchronized (juxVar.f) {
                        jvb jvbVar = null;
                        if (exc != null) {
                            int i3 = yrv.a;
                            ArrayList arrayList = new ArrayList(4);
                            arrayList.add(exc);
                            Throwable cause = exc;
                            Throwable cause2 = cause;
                            boolean z = false;
                            while (true) {
                                cause = cause.getCause();
                                if (cause != null) {
                                    arrayList.add(cause);
                                    if (cause == cause2) {
                                        throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                                    }
                                    if (z) {
                                        cause2 = cause2.getCause();
                                    }
                                    z = !z;
                                } else {
                                    List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                                    yqy yqyVar = new yqy(jvb.class);
                                    Iterator it = listUnmodifiableList.iterator();
                                    it.getClass();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (yqyVar.a.isInstance(next)) {
                                            jvbVar = next;
                                            break;
                                        }
                                    }
                                    jvbVar = jvbVar;
                                }
                            }
                        }
                        if (jvbVar == null || !((jsx) jvbVar.a).c || i2 >= 3) {
                            if (exc instanceof jtj) {
                                throw ((jtj) exc);
                            }
                            throw new jtj(exc);
                        }
                        juxVar.g.remove(((jss) jtmVar2).d);
                        zwxVarA = juxVar.a(jtmVar2, i2 + 1);
                    }
                    juxVar.i.a("Running queued downloads after handling request exception", new Object[0]);
                    juxVar.c();
                    return zwxVarA;
                }
            }, executor);
            f(new jsu(jtmVar, zyeVar, (zwx) zydVarH));
        }
        return (zwx) zydVarH;
    }

    public final zyd b(final jtm jtmVar) {
        synchronized (this.f) {
            Map map = this.e;
            jti jtiVar = ((jss) jtmVar).d;
            jue jueVar = (jue) map.get(jtiVar);
            if (jueVar != null) {
                this.i.a("Existing request context found for destination, waiting for it to complete: %s", jtiVar);
                return zuz.h(jueVar.f, new zvi() { // from class: jup
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return this.a.b(jtmVar);
                    }
                }, this.a);
            }
            jvc jvcVar = (jvc) this.l.get(((jss) jtmVar).a.getScheme());
            jvcVar.getClass();
            final jue jueVar2 = new jue(this.i, jtmVar, jvcVar, this.a);
            map.put(jtiVar, jueVar2);
            jueVar2.f.a.a(new Runnable() { // from class: juq
                @Override // java.lang.Runnable
                public final void run() {
                    jux juxVar = this.a;
                    Object obj = juxVar.f;
                    jtm jtmVar2 = jtmVar;
                    synchronized (obj) {
                        yqw.L(juxVar.e.remove(((jss) jtmVar2).d) == jueVar2);
                    }
                }
            }, zwk.a);
            return zxn.h(jueVar2);
        }
    }

    public final void c() {
        final zyd zydVarN;
        while (true) {
            synchronized (this.f) {
                Set set = this.g;
                if (set.size() >= this.n) {
                    this.i.a("Exceeded max concurrent downloads, not running another queued request", new Object[0]);
                    return;
                }
                juv juvVar = (juv) this.c.poll();
                if (juvVar == null) {
                    return;
                }
                final jtm jtmVarA = juvVar.a();
                yzq yzqVar = k;
                URI uri = ((jss) jtmVarA).a;
                if (yzqVar.contains(uri.getScheme())) {
                    jsy jsyVar = this.m;
                    jth jthVar = ((jss) jtmVarA).c;
                    if (((jsn) jsyVar).a(jthVar)) {
                        zydVarN = zxy.a;
                    } else {
                        zye zyeVar = new zye(new Callable() { // from class: jsk
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        });
                        final jsm jsmVar = new jsm((jsn) jsyVar, jthVar, zyeVar);
                        ((jsn) jsyVar).b.registerReceiver(jsmVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        final jsn jsnVar = (jsn) jsyVar;
                        zyeVar.a.a(new Runnable() { // from class: jsl
                            @Override // java.lang.Runnable
                            public final void run() {
                                jsnVar.b.unregisterReceiver(jsmVar);
                            }
                        }, zwk.a);
                        zydVarN = zxn.n(zyeVar, ((jsn) jsyVar).d, TimeUnit.MILLISECONDS, ((jsn) jsyVar).c);
                    }
                } else {
                    zydVarN = zxy.a;
                }
                if (zydVarN.isDone()) {
                    set.add(((jss) jtmVarA).d);
                    juvVar.b().d(new Runnable() { // from class: jug
                        @Override // java.lang.Runnable
                        public final void run() {
                            jux juxVar = this.a;
                            Object obj = juxVar.f;
                            jtm jtmVar = jtmVarA;
                            synchronized (obj) {
                                if (juxVar.g.remove(((jss) jtmVar).d)) {
                                    juxVar.e();
                                }
                            }
                            juxVar.c();
                        }
                    }, this.a);
                    e();
                    juvVar.c().run();
                } else {
                    this.i.a("Waiting on connectivity for request: uri=%s", uri);
                    this.h++;
                    Runnable runnable = new Runnable() { // from class: jus
                        @Override // java.lang.Runnable
                        public final void run() {
                            jux juxVar = this.a;
                            synchronized (juxVar.f) {
                                juxVar.h--;
                                juxVar.e();
                            }
                        }
                    };
                    zwk zwkVar = zwk.a;
                    zydVarN.d(runnable, zwkVar);
                    e();
                    zxn.p(zydVarN, new jut(this, juvVar), this.a);
                    juvVar.c().a.a(new Runnable() { // from class: juh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zyd zydVar = zydVarN;
                            jux juxVar = this.a;
                            synchronized (juxVar.f) {
                                juxVar.i.a("Queued task completed, cancelling connectivity check", new Object[0]);
                                zydVar.cancel(false);
                            }
                        }
                    }, zwkVar);
                }
            }
        }
    }

    public final void d(juv juvVar) {
        synchronized (this.f) {
            f(juvVar);
        }
        this.i.a("Requeuing download after connectivity change: %s", ((jss) juvVar.a()).a);
        c();
    }

    public final void e() {
        final jsv jsvVar = new jsv(this.g.size(), this.c.size(), this.h);
        for (final Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: jui
                @Override // java.lang.Runnable
                public final void run() {
                    int i = jux.j;
                    yqt yqtVar = ((pmk) entry.getKey()).a;
                    jsv jsvVar2 = (jsv) jsvVar;
                    if (jsvVar2.b <= 0 || jsvVar2.a != 0) {
                        return;
                    }
                    ((qfc) ((yqz) yqtVar).a).e();
                }
            });
        }
    }
}
