package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Process;
import android.os.StrictMode;
import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ukm implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ukm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, unj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, unj] */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        byte[] bArrAN;
        switch (this.c) {
            case 0:
                Object obj = this.a;
                unj unjVar = ((ukz) obj).b;
                ?? r2 = this.b;
                if (unjVar != ukz.a) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (obj) {
                    ((ukz) obj).b = r2;
                }
                return;
            case 1:
                ((tus) this.b).a.remove(this.a);
                return;
            case 2:
                ((ukw) this.a).c(this.b);
                return;
            case 3:
                ule uleVar = (ule) this.a;
                Process.setThreadPriority(uleVar.a);
                StrictMode.ThreadPolicy threadPolicy = uleVar.b;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                this.b.run();
                return;
            case 4:
                int i = ulh.c;
                Object obj2 = this.a;
                try {
                    ((zft) obj2).c(this.b.call());
                    return;
                } catch (Exception e) {
                    ((zft) obj2).d(e);
                    return;
                }
            case 5:
                int i2 = ulh.c;
                try {
                    this.b.run();
                    return;
                } catch (Exception e2) {
                    ((zft) this.a).d(e2);
                    return;
                }
            case 6:
                int i3 = ulh.c;
                try {
                    this.b.run();
                    return;
                } catch (Exception e3) {
                    ((zft) this.a).d(e3);
                    throw e3;
                }
            case 7:
                int i4 = ulh.c;
                Object obj3 = this.a;
                try {
                    this.b.run();
                    ((zft) obj3).c(null);
                    return;
                } catch (Exception e4) {
                    ((zft) obj3).d(e4);
                    return;
                }
            case 8:
                ((uom) this.b).a((Intent) this.a);
                return;
            case 9:
                Object obj4 = this.a;
                try {
                    URL url = ((uor) this.b).a;
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
                        throw new IOException("Content-Length exceeds max size of 1048576");
                    }
                    InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                    try {
                        uog uogVar = new uog(inputStream);
                        ArrayDeque arrayDeque = new ArrayDeque(20);
                        int iHighestOneBit = Integer.highestOneBit(0);
                        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
                        int i5 = 0;
                        while (true) {
                            if (i5 < 2147483639) {
                                int iMin2 = Math.min(iMin, 2147483639 - i5);
                                byte[] bArr = new byte[iMin2];
                                arrayDeque.add(bArr);
                                int i6 = 0;
                                while (i6 < iMin2) {
                                    int i7 = uogVar.read(bArr, i6, iMin2 - i6);
                                    if (i7 == -1) {
                                        bArrAN = qtl.aN(arrayDeque, i5);
                                    } else {
                                        i6 += i7;
                                        i5 += i7;
                                    }
                                }
                                long j = iMin * (iMin < 4096 ? 4 : 2);
                                iMin = j > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
                            } else {
                                if (uogVar.read() != -1) {
                                    throw new OutOfMemoryError("input is too large to fit in a byte array");
                                }
                                bArrAN = qtl.aN(arrayDeque, 2147483639);
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        int length = bArrAN.length;
                        if (length > 1048576) {
                            throw new IOException("Image exceeds max size of 1048576");
                        }
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrAN, 0, length);
                        if (bitmapDecodeByteArray == null) {
                            throw new IOException("Failed to decode image: ".concat(url.toString()));
                        }
                        ((kwy) obj4).u(bitmapDecodeByteArray);
                        return;
                    } finally {
                    }
                } catch (Exception e5) {
                    ((kwy) obj4).t(e5);
                    return;
                }
            case 10:
                Map map = ((urh) this.b).b;
                Object obj5 = this.a;
                synchronized (map) {
                    map.remove(obj5);
                }
                return;
            case 11:
                Object obj6 = this.a;
                Object obj7 = this.b;
                try {
                    for (String str : ((urj) obj6).f.e()) {
                        if (!((urj) obj6).l.contains(str)) {
                            if (str.endsWith("-bin")) {
                                xsm xsmVar = ((urj) obj6).f;
                                xsg xsgVar = xsm.b;
                                int i8 = xsj.c;
                                xsmVar.l(new xsf(str, xsgVar));
                            } else {
                                xsm xsmVar2 = ((urj) obj6).f;
                                xse xseVar = xsm.c;
                                int i9 = xsj.c;
                                xsmVar2.l(new xsd(str, xseVar));
                            }
                        }
                    }
                    ((urj) obj6).e.c(((urj) obj6).h, ((urj) obj6).f, (vvj) ((upo) obj7).a, ((urj) obj6).g, ((urj) obj6).k, TimeUnit.MILLISECONDS);
                    return;
                } catch (Throwable th) {
                    ((tvk) ((tvk) ((tvk) urj.a.f()).i(th)).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseMessageProcessing", (char) 339, "CachingClientInterceptor.java")).s("Could not write to cache");
                    return;
                }
            case 12:
                Object obj8 = this.b;
                usj usjVar = (usj) this.a;
                usjVar.b.b((usp) obj8);
                usjVar.c();
                return;
            case 13:
                Iterator it = this.b.iterator();
                while (true) {
                    Object obj9 = this.a;
                    if (!it.hasNext()) {
                        ((usj) obj9).c();
                        return;
                    }
                    ((usj) obj9).b.b((usp) it.next());
                }
            case 14:
                ((usy) this.a).b().f(this.b);
                return;
            case 15:
                utf utfVar = (utf) this.a;
                if (utfVar.c) {
                    return;
                }
                ?? r0 = this.b;
                if (utfVar.b == null) {
                    utfVar.a.add(r0);
                    return;
                }
                try {
                    r0.run();
                    return;
                } catch (Throwable th2) {
                    utfVar.d.a(xtk.c(th2), new xsm());
                    return;
                }
            case 16:
                ((utf) this.a).b.f(this.b);
                return;
            case 17:
                ((utr) this.b).b.remove(this.a);
                return;
            case 18:
                ((utr) this.a).h((xsm) this.b);
                return;
            case 19:
                Object obj10 = this.b;
                utr utrVar = (utr) this.a;
                utrVar.c.add(new uto(utrVar, obj10));
                utrVar.g();
                return;
            default:
                ((utr) this.b).j((vvd) this.a);
                return;
        }
    }

    public /* synthetic */ ukm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public ukm(tus tusVar, tur turVar, int i) {
        this.c = i;
        this.a = turVar;
        this.b = tusVar;
    }
}
