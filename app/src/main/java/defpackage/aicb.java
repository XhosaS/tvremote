package defpackage;

import android.os.Process;
import android.os.Trace;
import android.util.Log;
import j$.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicb {
    final aicu a;
    final Executor b;
    final Executor c;
    final /* synthetic */ aicf d;

    public aicb(aicf aicfVar, UrlRequest.Callback callback, Executor executor) {
        this.d = aicfVar;
        this.a = new aicu(callback);
        if (aicfVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new aici(executor);
            this.c = executor;
        }
    }

    final void a(final aicg aicgVar, String str) {
        try {
            final aicf aicfVar = this.d;
            b(new Runnable() { // from class: aibj
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        aicgVar.a();
                    } catch (Throwable th) {
                        final aicf aicfVar2 = aicfVar;
                        aicfVar2.d(new Runnable() { // from class: aibl
                            @Override // java.lang.Runnable
                            public final void run() {
                                aicfVar2.x++;
                            }
                        }, "enterUserErrorState");
                        aicfVar2.b(new ahzs("Exception received from UrlRequest.Callback", th));
                    }
                }
            }, str);
        } catch (RejectedExecutionException e) {
            this.d.b(new ahzy("Exception posting task to executor", e));
        }
    }

    final void b(final Runnable runnable, final String str) {
        new ahya("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
        try {
            this.b.execute(new Runnable() { // from class: aibx
                @Override // java.lang.Runnable
                public final void run() {
                    new ahya("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
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

    public final void c() {
        this.d.d(new Runnable() { // from class: aibz
            @Override // java.lang.Runnable
            public final void run() throws NumberFormatException {
                Map asMap;
                String str;
                int i;
                long j;
                long j2;
                long j3;
                int i2;
                aicb aicbVar = this.a;
                try {
                    aicf aicfVar = aicbVar.d;
                    aiag aiagVar = aicfVar.u;
                    long j4 = aicfVar.t;
                    aicq aicqVar = aicfVar.o;
                    if (aicqVar != null) {
                        asMap = aicqVar.c.getAsMap();
                        aicq aicqVar2 = aicfVar.o;
                        str = aicqVar2.b;
                        i = aicqVar2.a;
                    } else {
                        asMap = Collections.EMPTY_MAP;
                        str = "";
                        i = 0;
                    }
                    String str2 = str;
                    long j5 = 0;
                    long length = 0;
                    for (Map.Entry entry : aicfVar.e.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            length += r14.length();
                        }
                        if (((String) entry.getValue()) != null) {
                            length += r9.length();
                        }
                    }
                    if (asMap == null) {
                        j = 0;
                    } else {
                        long length2 = 0;
                        for (Map.Entry entry2 : asMap.entrySet()) {
                            if (((String) entry2.getKey()) != null) {
                                j2 = j5;
                                length2 += r17.length();
                            } else {
                                j2 = j5;
                            }
                            if (entry2.getValue() != null) {
                                Iterator it = ((List) entry2.getValue()).iterator();
                                while (it.hasNext()) {
                                    if (((String) it.next()) != null) {
                                        length2 += r12.length();
                                    }
                                }
                            }
                            j5 = j2;
                        }
                        j = j5;
                        j5 = length2;
                    }
                    if (asMap.containsKey("Content-Length")) {
                        try {
                            j3 = Long.parseLong((String) ((List) asMap.get("Content-Length")).get(0));
                        } catch (NumberFormatException unused) {
                            j3 = j;
                        }
                    } else {
                        j3 = -1;
                    }
                    Duration durationOfSeconds = Duration.ofSeconds(j);
                    Duration durationOfSeconds2 = Duration.ofSeconds(j);
                    aicf aicfVar2 = aicbVar.d;
                    int i3 = aicfVar2.g.get();
                    if (i3 == 6) {
                        i2 = 2;
                    } else if (i3 == 7) {
                        i2 = 1;
                    } else {
                        if (i3 != 8) {
                            throw new IllegalStateException(a.a(i3, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                        i2 = 3;
                    }
                    int i4 = i2;
                    int i5 = aicfVar2.x;
                    int i6 = aicfVar2.w;
                    aicc aiccVar = aicfVar2.r;
                    aiagVar.d(j4, new aiae(length, j5, j3, i, durationOfSeconds, durationOfSeconds2, str2, i4, i5, i6, aiccVar != null ? aiccVar.g : 0, aicfVar2.y, Process.myUid(), aiad.CRONET_SOURCE_FALLBACK));
                } catch (RuntimeException e) {
                    Log.i(aicf.a, "Error while trying to log CronetTrafficInfo: ", e);
                }
            }
        }, "maybeReportMetrics");
    }

    final void d() {
        a(new aicg() { // from class: aibv
            @Override // defpackage.aicg
            public final void a() {
                aicb aicbVar = this.a;
                aicf aicfVar = aicbVar.d;
                if (aicfVar.g.compareAndSet(1, 4)) {
                    aicu aicuVar = aicbVar.a;
                    aicuVar.a.onResponseStarted(aicfVar, aicfVar.o);
                }
            }
        }, "onResponseStarted");
    }
}
