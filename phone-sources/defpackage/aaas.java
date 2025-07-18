package defpackage;

import android.net.TrafficStats;
import android.os.Trace;
import android.support.v7.appcompat.R;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaas extends ExperimentalUrlRequest {
    public static final String a = "aaas";
    public final aaaq b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public aabd j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public aaba o;
    public String p;
    public HttpURLConnection q;
    public final aaae r;
    public final int s;
    public final zzy t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public aaai y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    public aaas(aaae aaaeVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        aabd aabdVar;
        new zyg("Cronet JavaUrlRequest#JavaUrlRequest", 0);
        try {
            this.h = z;
            this.b = new aaaq(this, callback, executor2);
            final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
            this.c = new aaar(new Executor() { // from class: aaaj
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    String str4 = aaas.a;
                    final int i3 = threadStatsTag;
                    final boolean z4 = z3;
                    final int i4 = i2;
                    executor.execute(new Runnable() { // from class: aaak
                        @Override // java.lang.Runnable
                        public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                            String str5 = aaas.a;
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
            this.r = aaaeVar;
            this.s = aaaeVar.a;
            this.t = aaaeVar.b;
            this.m = str;
            this.d = str2;
            this.u = j;
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
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                        case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
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
                aabdVar = null;
            } else {
                if (!this.e.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                aabdVar = new aabd(uploadDataProvider);
            }
            this.j = aabdVar;
            this.k = (executor3 == null || this.h) ? executor3 : new ia(executor3, 5);
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
        d(new aaal(this, 1), "closeResponseChannel");
    }

    public final void b(CronetException cronetException) {
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
        aaaq aaaqVar = this.b;
        aaba aabaVar = this.o;
        aaaqVar.d.a();
        int i2 = 0;
        aaao aaaoVar = new aaao(aaaqVar, aabaVar, cronetException, i2);
        try {
            aaaqVar.b(aaaoVar, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = aaaqVar.c;
            if (executor != null) {
                new zyg("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed", 0);
                try {
                    executor.execute(new aaan(aaaoVar, i2));
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
        b(new zzn("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        int i = 3;
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            aaaq aaaqVar = this.b;
            aaba aabaVar = this.o;
            aaaqVar.d.a();
            aaaqVar.b(new aaan(aaaqVar, aabaVar, i), "onCanceled");
        }
    }

    public final void d(Runnable runnable, String str) {
        new zyg("Cronet JavaUrlRequest#executeOnExecutor ".concat(str), 0);
        try {
            this.c.execute(new xxl(str, runnable, 19, (short[]) null));
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
            aabd aabdVar = this.j;
            aabdVar.getClass();
            executor.execute(new xxl(this, new aaag(aabdVar, 2), 17, (char[]) null));
        } catch (RejectedExecutionException e) {
            Log.e(a, "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new xyp(this, 19, null), "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new aaal(this, 2, null));
    }

    public final void g() {
        this.l = 13;
        d(new xxl(this, new aaag(this, 4), 16, (char[]) null), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
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
                throw new IllegalStateException(a.cf(i, "Switch is exhaustive: "));
        }
        this.b.b(new utl(new aabf(statusListener), i2, 7), "sendStatus");
    }

    public final void h() {
        d(new xxl(this, new aaag(this, 3), 16, (char[]) null), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        Log.e(a, a.cg(str, "Exception in ", " method"), exc);
        this.x = true;
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
            throw new IllegalStateException("Invalid state transition - expected " + vxr.aI(i) + " but was " + vxr.aI(i3));
        }
        new zyg("Cronet JavaUrlRequest#transitionStates " + vxr.aI(i) + " -> " + vxr.aI(i2), 0);
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
        vxr.aH(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        j(4, 5, new xxl(this, new aaat() { // from class: aaam
            @Override // defpackage.aaat
            public final void a() throws IOException {
                int i;
                aaas aaasVar = this.a;
                ReadableByteChannel readableByteChannel = aaasVar.n;
                ByteBuffer byteBuffer2 = byteBuffer;
                int i2 = 1;
                if (readableByteChannel != null) {
                    aaasVar.v++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    aaaq aaaqVar = aaasVar.b;
                    aaaqVar.a(new aaap(aaaqVar, aaasVar.o, byteBuffer2, i2), "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = aaasVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (aaasVar.g.compareAndSet(5, 7)) {
                    aaasVar.f();
                    aaaq aaaqVar2 = aaasVar.b;
                    aaaqVar2.b(new aaan(aaaqVar2, aaasVar.o, 1), "onSucceeded");
                }
            }
        }, 20, (char[]) null));
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        j(0, 1, new xyp(this, 20, null));
    }
}
