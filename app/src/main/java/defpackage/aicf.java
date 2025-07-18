package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.TrafficStats;
import android.os.Trace;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicf extends ExperimentalUrlRequest {
    public static final String a = "aicf";
    public final aicb b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public aict j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public aicq o;
    public String p;
    public HttpURLConnection q;
    public aicc r;
    public final aiao s;
    public final int t;
    public final aiag u;
    public final long v;
    public int w;
    public int x;
    public boolean y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    public aicf(aiao aiaoVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        aict aictVar;
        new ahya("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            this.h = z;
            this.b = new aicb(this, callback, executor2);
            final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
            this.c = new aice(new Executor() { // from class: aibd
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    String str4 = aicf.a;
                    final int i3 = threadStatsTag;
                    final boolean z4 = z3;
                    final int i4 = i2;
                    executor.execute(new Runnable() { // from class: aibf
                        @Override // java.lang.Runnable
                        public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                            String str5 = aicf.a;
                            int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                            TrafficStats.setThreadStatsTag(i3);
                            Runnable runnable2 = runnable;
                            boolean z5 = z4;
                            if (z5) {
                                ThreadStatsUid.set(i4);
                            }
                            try {
                                runnable2.run();
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                            } catch (Throwable th) {
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                                throw th;
                            }
                        }
                    });
                }
            });
            this.s = aiaoVar;
            this.t = aiaoVar.a;
            this.u = aiaoVar.b;
            this.m = str;
            this.d = str2;
            this.v = j;
            if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
                throw new IllegalArgumentException("Invalid http method ".concat(str3));
            }
            this.i = str3;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i3);
                String str4 = (String) entry.getKey();
                int i4 = 0;
                while (true) {
                    if (i4 < str4.length()) {
                        char cCharAt = str4.charAt(i4);
                        if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                            switch (cCharAt) {
                                case '\'':
                                case '(':
                                case ')':
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case ':':
                                        case ';':
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                    break;
                                                default:
                                                    if (Character.isISOControl(cCharAt) || Character.isWhitespace(cCharAt)) {
                                                        break;
                                                    } else {
                                                        i4++;
                                                    }
                                                    break;
                                            }
                                    }
                            }
                        }
                    } else if (!((String) entry.getValue()).contains("\r\n")) {
                        this.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
            }
            if (uploadDataProvider == null) {
                aictVar = null;
            } else {
                if (!this.e.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                aictVar = new aict(uploadDataProvider);
            }
            this.j = aictVar;
            this.k = (executor3 == null || this.h) ? executor3 : new aici(executor3);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void a() {
        d(new Runnable() { // from class: aibk
            @Override // java.lang.Runnable
            public final void run() {
                aicf aicfVar = this.a;
                ReadableByteChannel readableByteChannel = aicfVar.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    aicfVar.n = null;
                }
            }
        }, "closeResponseChannel");
    }

    public final void b(final CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.g;
            i = atomicInteger.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        f();
        e();
        final aicb aicbVar = this.b;
        final aicq aicqVar = this.o;
        aicbVar.d.a();
        final Runnable runnable = new Runnable() { // from class: aibt
            @Override // java.lang.Runnable
            public final void run() {
                UrlResponseInfo urlResponseInfo = aicqVar;
                aicb aicbVar2 = aicbVar;
                CronetException cronetException2 = cronetException;
                try {
                    aicu aicuVar = aicbVar2.a;
                    aicuVar.a.onFailed(aicbVar2.d, urlResponseInfo, cronetException2);
                } catch (Exception e) {
                    aicbVar2.d.i("onFailed", e);
                }
                aicbVar2.c();
                aicbVar2.d.s.c.decrementAndGet();
            }
        };
        try {
            aicbVar.b(runnable, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = aicbVar.c;
            if (executor != null) {
                new ahya("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    executor.execute(new Runnable() { // from class: aibs
                        public final /* synthetic */ String a = "onFailed";

                        @Override // java.lang.Runnable
                        public final void run() {
                            new ahya("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + this.a + " running callback");
                            try {
                                runnable.run();
                                Trace.endSection();
                            } catch (Throwable th) {
                                try {
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    });
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public final void c(Throwable th) {
        b(new ahzs("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            final aicb aicbVar = this.b;
            final aicq aicqVar = this.o;
            aicbVar.d.a();
            aicbVar.b(new Runnable() { // from class: aiby
                @Override // java.lang.Runnable
                public final void run() {
                    aicb aicbVar2 = aicbVar;
                    UrlResponseInfo urlResponseInfo = aicqVar;
                    try {
                        aicu aicuVar = aicbVar2.a;
                        aicuVar.a.onCanceled(aicbVar2.d, urlResponseInfo);
                    } catch (Exception e) {
                        aicbVar2.d.i("onCanceled", e);
                    }
                    aicbVar2.c();
                    aicbVar2.d.s.c.decrementAndGet();
                }
            }, "onCanceled");
        }
    }

    public final void d(final Runnable runnable, final String str) {
        new ahya("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        try {
            this.c.execute(new Runnable() { // from class: aibn
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = aicf.a;
                    new ahya("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
                    try {
                        runnable.run();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        if (this.j == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            Executor executor = this.k;
            final aict aictVar = this.j;
            aictVar.getClass();
            executor.execute(new aibg(this, new aicg() { // from class: aiba
                @Override // defpackage.aicg
                public final void a() {
                    aictVar.a.close();
                }
            }));
        } catch (RejectedExecutionException e) {
            Log.e(a, "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new Runnable() { // from class: aibb
            @Override // java.lang.Runnable
            public final void run() {
                aicf aicfVar = this.a;
                aicc aiccVar = aicfVar.r;
                if (aiccVar != null) {
                    try {
                        aiccVar.j();
                    } catch (IOException e) {
                        Log.e(aicf.a, "Exception when closing OutputChannel", e);
                    }
                }
                HttpURLConnection httpURLConnection = aicfVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    aicfVar.q = null;
                }
            }
        }, "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new aibq(this));
    }

    public final void g() {
        this.l = 13;
        d(new aibc(this, new aicg() { // from class: aibi
            @Override // defpackage.aicg
            public final void a() throws IOException {
                List list;
                final aicf aicfVar = this.a;
                if (aicfVar.q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String headerField = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = aicfVar.q.getHeaderFieldKey(i);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = aicfVar.q.getHeaderField(i);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, aicfVar.q.getHeaderField(i)));
                    }
                    i++;
                }
                int responseCode = aicfVar.q.getResponseCode();
                final aicq aicqVar = new aicq(new ArrayList(aicfVar.f), responseCode, aicfVar.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), headerField);
                if (responseCode >= 300 && responseCode < 400 && (list = (List) aicqVar.c.getAsMap().get("location")) != null) {
                    final String str = (String) list.get(0);
                    aicfVar.j(1, 2, new Runnable() { // from class: aibm
                        @Override // java.lang.Runnable
                        public final void run() {
                            final aicf aicfVar2 = aicfVar;
                            aicfVar2.p = URI.create(aicfVar2.m).resolve(str).toString();
                            aicfVar2.f.add(aicfVar2.p);
                            final UrlResponseInfo urlResponseInfo = aicqVar;
                            aicfVar2.j(2, 3, new Runnable() { // from class: aiaz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aicf aicfVar3 = aicfVar2;
                                    final String str2 = aicfVar3.p;
                                    final aicb aicbVar = aicfVar3.b;
                                    final UrlResponseInfo urlResponseInfo2 = urlResponseInfo;
                                    aicbVar.a(new aicg() { // from class: aica
                                        @Override // defpackage.aicg
                                        public final void a() {
                                            aicb aicbVar2 = aicbVar;
                                            aicbVar2.a.a.onRedirectReceived(aicbVar2.d, urlResponseInfo2, str2);
                                        }
                                    }, "onRedirectReceived");
                                }
                            });
                        }
                    });
                    return;
                }
                aicfVar.o = aicqVar;
                aicfVar.e();
                if (responseCode < 400) {
                    aicfVar.n = aiak.a(aicfVar.q.getInputStream());
                    aicfVar.b.d();
                } else {
                    InputStream errorStream = aicfVar.q.getErrorStream();
                    aicfVar.n = errorStream == null ? null : aiak.a(errorStream);
                    aicfVar.b.d();
                }
            }
        }), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        final int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.b(i, "Switch is exhaustive: "));
        }
        aicb aicbVar = this.b;
        final aicv aicvVar = new aicv(statusListener);
        aicbVar.b(new Runnable() { // from class: aibw
            @Override // java.lang.Runnable
            public final void run() {
                aicvVar.a.onStatus(i2);
            }
        }, "sendStatus");
    }

    public final void h() {
        d(new aibc(this, new aicg() { // from class: aibh
            @Override // defpackage.aicg
            public final void a() throws ProtocolException, aick {
                aicf aicfVar = this.a;
                if (aicfVar.g.get() == 8) {
                    return;
                }
                URL url = new URL(aicfVar.m);
                HttpURLConnection httpURLConnection = aicfVar.q;
                Network network = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    aicfVar.q = null;
                }
                long j = aicfVar.v;
                if (j == -1) {
                    aicfVar.q = (HttpURLConnection) url.openConnection();
                } else {
                    Network[] allNetworks = ((ConnectivityManager) aicfVar.s.d.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Network network2 = allNetworks[i];
                        if (network2.getNetworkHandle() == j) {
                            network = network2;
                            break;
                        }
                        i++;
                    }
                    if (network == null) {
                        throw new aick();
                    }
                    aicfVar.q = (HttpURLConnection) network.openConnection(url);
                }
                aicfVar.q.setInstanceFollowRedirects(false);
                Map map = aicfVar.e;
                if (!map.containsKey("User-Agent")) {
                    map.put("User-Agent", aicfVar.d);
                }
                for (Map.Entry entry : map.entrySet()) {
                    aicfVar.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                aicfVar.q.setRequestMethod(aicfVar.i);
                aict aictVar = aicfVar.j;
                if (aictVar == null) {
                    aicfVar.l = 10;
                    aicfVar.q.connect();
                    aicfVar.g();
                } else {
                    aicfVar.r = new aicc(aicfVar, aicfVar.k, aicfVar.c, aicfVar.q, aictVar);
                    final aicc aiccVar = aicfVar.r;
                    final boolean z = aicfVar.f.size() == 1;
                    aiccVar.d(new aicg() { // from class: aiar
                        @Override // defpackage.aicg
                        public final void a() {
                            aiay aiayVar = aiccVar;
                            UploadDataProvider uploadDataProvider = aiayVar.c.a;
                            long length2 = uploadDataProvider.getLength();
                            aiayVar.e = length2;
                            if (length2 == 0) {
                                aiayVar.e();
                                return;
                            }
                            if (length2 <= 0 || length2 >= 8192) {
                                aiayVar.d = ByteBuffer.allocateDirect(8192);
                            } else {
                                aiayVar.d = ByteBuffer.allocateDirect(((int) length2) + 1);
                            }
                            long j2 = aiayVar.e;
                            if (j2 > 0) {
                                ((aicc) aiayVar).h.setFixedLengthStreamingMode(j2);
                            } else {
                                ((aicc) aiayVar).h.setChunkedStreamingMode(8192);
                            }
                            if (z) {
                                aiayVar.i();
                            } else {
                                aiayVar.a.set(1);
                                uploadDataProvider.rewind(aiayVar);
                            }
                        }
                    }, "start");
                }
            }
        }), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        Log.e(a, a.e(str, "Exception in ", " method"), exc);
        this.y = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.g;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + aicj.a(i) + " but was " + aicj.a(i3));
        }
        new ahya("Cronet JavaUrlRequest#transitionStates " + aicj.a(i) + " -> " + aicj.a(i2));
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        aicm.a(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        final aicg aicgVar = new aicg() { // from class: aibo
            @Override // defpackage.aicg
            public final void a() throws IOException {
                int i;
                aicf aicfVar = this.a;
                ReadableByteChannel readableByteChannel = aicfVar.n;
                final ByteBuffer byteBuffer2 = byteBuffer;
                if (readableByteChannel != null) {
                    aicfVar.w++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    final aicb aicbVar = aicfVar.b;
                    final aicq aicqVar = aicfVar.o;
                    aicbVar.a(new aicg() { // from class: aibu
                        @Override // defpackage.aicg
                        public final void a() {
                            aicb aicbVar2 = aicbVar;
                            aicf aicfVar2 = aicbVar2.d;
                            if (aicfVar2.g.compareAndSet(5, 4)) {
                                ByteBuffer byteBuffer3 = byteBuffer2;
                                aicbVar2.a.a.onReadCompleted(aicfVar2, aicqVar, byteBuffer3);
                            }
                        }
                    }, "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = aicfVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (aicfVar.g.compareAndSet(5, 7)) {
                    aicfVar.f();
                    final aicb aicbVar2 = aicfVar.b;
                    final aicq aicqVar2 = aicfVar.o;
                    aicbVar2.b(new Runnable() { // from class: aibr
                        @Override // java.lang.Runnable
                        public final void run() {
                            aicb aicbVar3 = aicbVar2;
                            UrlResponseInfo urlResponseInfo = aicqVar2;
                            try {
                                aicu aicuVar = aicbVar3.a;
                                aicuVar.a.onSucceeded(aicbVar3.d, urlResponseInfo);
                            } catch (Exception e) {
                                aicbVar3.d.i("onSucceded", e);
                            }
                            aicbVar3.c();
                            aicbVar3.d.s.c.decrementAndGet();
                        }
                    }, "onSucceeded");
                }
            }
        };
        j(4, 5, new Runnable() { // from class: aibp
            @Override // java.lang.Runnable
            public final void run() {
                aicf aicfVar = this.a;
                aicfVar.d(new aibc(aicfVar, aicgVar), "read");
            }
        });
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.s.c.incrementAndGet();
        j(0, 1, new Runnable() { // from class: aibe
            @Override // java.lang.Runnable
            public final void run() {
                aicf aicfVar = this.a;
                aicfVar.f.add(aicfVar.m);
                aicfVar.h();
            }
        });
    }
}
