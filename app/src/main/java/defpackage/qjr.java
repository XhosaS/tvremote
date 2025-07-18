package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qjr {
    public static final String a = "qjr";
    private static final Consumer d = new qjh();
    private static final Consumer e = new qji();
    private static final Consumer f = new qjj();
    public final qjm b;
    protected final List c;
    private final Context g;
    private final Executor h;
    private final ConnectivityManager i;
    private final Map j;
    private final Map k;
    private final Queue l;
    private boolean m;
    private final BroadcastReceiver n;
    private final qiz o;

    public qjr(qiz qizVar, Context context, Executor executor) {
        qjm qjmVar = new qjm();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ConcurrentLinkedQueue();
        this.c = new ArrayList();
        this.m = false;
        this.n = new qjk(this);
        this.g = context;
        this.o = qizVar;
        this.h = executor;
        this.b = qjmVar;
        this.i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String a(File file, String str) {
        return file.getAbsolutePath() + "/" + str;
    }

    public static void i(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    private final void n(List list, Consumer consumer) {
        zdm zdmVarListIterator = ((yyk) list).listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            consumer.accept((qjo) zdmVarListIterator.next());
        }
    }

    private static boolean o(Context context, String str) {
        return abs.a(context, str) == 0;
    }

    public final synchronized HttpURLConnection b(String str, String str2) {
        HttpURLConnection httpURLConnection;
        if (!o(this.g, "android.permission.INTERNET")) {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        yqw.L(!((qjg) this.j.get(str)).e());
        URLConnection uRLConnectionOpenConnection = this.o.a.a.openConnection(new URL(str2));
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Cronet connection is not an HttpURLConnection");
        }
        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        String str3 = this.b.b;
        this.k.put(str, httpURLConnection);
        return httpURLConnection;
    }

    protected final synchronized List c() {
        yyf yyfVar;
        int i = yyk.e;
        yyfVar = new yyf(4);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            qjo qjoVar = (qjo) ((WeakReference) it.next()).get();
            if (qjoVar == null) {
                it.remove();
            } else {
                yyfVar.g(qjoVar);
            }
        }
        return yyfVar.f();
    }

    public final synchronized void d(File file, String str) {
        Map map = this.j;
        String strA = a(file, str);
        qjg qjgVar = (qjg) map.get(strA);
        if (qjgVar != null) {
            qjgVar.d();
        } else {
            Log.v(a, "Attempted to setCanceled unknown request: ".concat(strA));
        }
        i((HttpURLConnection) this.k.get(strA));
        if (qjgVar != null) {
            f();
        }
    }

    public final void e(qjg qjgVar) {
        List listC;
        qjgVar.c();
        synchronized (this) {
            Queue queue = this.l;
            boolean zIsEmpty = queue.isEmpty();
            queue.add(qjgVar);
            if (zIsEmpty) {
                this.g.registerReceiver(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.m = true;
                f();
            }
            listC = queue.containsAll(this.j.values()) ? c() : null;
        }
        if (listC != null) {
            n(listC, d);
        }
    }

    public final synchronized void f() {
        Queue queue = this.l;
        Log.d(a, "Running " + queue.size() + " requests pending connectivity");
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            qjg qjgVar = (qjg) it.next();
            if (qjgVar.e() || j(qjgVar.a())) {
                it.remove();
                qjgVar.b();
                h(qjgVar);
            }
        }
        if (queue.isEmpty() && this.m) {
            this.g.unregisterReceiver(this.n);
            this.m = false;
        }
    }

    public final synchronized void g(qjo qjoVar) {
        this.c.add(new WeakReference(qjoVar));
    }

    public final void h(qjg qjgVar) {
        n(c(), e);
        this.h.execute(new qjl(this, qjgVar));
    }

    public final synchronized boolean j(qjf qjfVar) {
        if (qjfVar == qjf.NONE) {
            return true;
        }
        if (!o(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
            throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        }
        ConnectivityManager connectivityManager = this.i;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            if (!activeNetworkInfo.isConnected()) {
                Log.d(a, "Network disconnected, connectivity cannot be satisfied.");
                return false;
            }
            int iOrdinal = qjfVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    Log.e(a, "Unknown connectivity type checked: ".concat(String.valueOf(qjfVar.name())));
                } else if (activeNetworkInfo.getType() != 0 && activeNetworkInfo.getType() != 4 && activeNetworkInfo.getType() != 6 && activeNetworkInfo.getType() != 7 && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 16 && activeNetworkInfo.getType() != 17) {
                    return false;
                }
            } else if (connectivityManager.isActiveNetworkMetered() && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 17) {
                return false;
            }
            return true;
        }
        Log.d(a, "No current network, connectivity cannot be satisfied.");
        return false;
    }

    public final synchronized boolean k(qjg qjgVar) {
        File file = qjgVar.b;
        String str = qjgVar.c;
        Map map = this.j;
        String strA = a(file, str);
        if (map.containsKey(strA)) {
            Log.i(a, "Request is already being executed for key: ".concat(strA));
            return false;
        }
        map.put(strA, qjgVar);
        h(qjgVar);
        return true;
    }

    public final void l(File file, String str, plr plrVar, qjd qjdVar, File file2) {
        List listC;
        List listC2;
        phb phbVar;
        String str2;
        String strA = a(file, str);
        synchronized (this) {
            Map map = this.j;
            map.remove(strA);
            this.k.remove(strA);
            if (map.isEmpty()) {
                listC = c();
                listC2 = null;
            } else if (this.l.containsAll(map.values())) {
                listC2 = c();
                listC = null;
            } else {
                listC = null;
                listC2 = null;
            }
        }
        if (qjdVar == null) {
            file2.getName();
            int i = qce.a;
            plrVar.a.b(null);
        } else {
            file2.getName();
            int i2 = qce.a;
            int i3 = qjdVar.d;
            pha phaVarA = phc.a();
            if (i3 == 0) {
                throw null;
            }
            switch (i3 - 1) {
                case 0:
                    phbVar = phb.ANDROID_DOWNLOADER_UNKNOWN;
                    break;
                case 1:
                    phbVar = phb.ANDROID_DOWNLOADER_CANCELED;
                    break;
                case 2:
                    phbVar = phb.ANDROID_DOWNLOADER_INVALID_REQUEST;
                    break;
                case 3:
                    phbVar = phb.ANDROID_DOWNLOADER_HTTP_ERROR;
                    break;
                case 4:
                    phbVar = phb.ANDROID_DOWNLOADER_REQUEST_ERROR;
                    break;
                case 5:
                    phbVar = phb.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                    break;
                case 6:
                    phbVar = phb.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                    break;
                case 7:
                    phbVar = phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    break;
                case 8:
                    phbVar = phb.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                    break;
                case 9:
                    phbVar = phb.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                    break;
                case 10:
                    phbVar = phb.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                    break;
                default:
                    throw new RuntimeException(null, null);
            }
            phaVarA.a = phbVar;
            switch (i3) {
                case 1:
                    str2 = "UNKNOWN";
                    break;
                case 2:
                    str2 = "CANCELED";
                    break;
                case 3:
                    str2 = "INVALID_REQUEST";
                    break;
                case 4:
                    str2 = "HTTP_ERROR";
                    break;
                case 5:
                    str2 = "REQUEST_ERROR";
                    break;
                case 6:
                    str2 = "RESPONSE_OPEN_ERROR";
                    break;
                case 7:
                    str2 = "RESPONSE_CLOSE_ERROR";
                    break;
                case 8:
                    str2 = "NETWORK_IO_ERROR";
                    break;
                case 9:
                    str2 = "DISK_IO_ERROR";
                    break;
                case 10:
                    str2 = "FILE_SYSTEM_ERROR";
                    break;
                default:
                    str2 = "UNKNOWN_IO_ERROR";
                    break;
            }
            int i4 = qjdVar.a;
            String strE = a.e(str2, "ANDROID_DOWNLOADER_", "; ");
            if (i4 >= 0) {
                strE = strE + "HttpCode: " + i4 + "; ";
            }
            String str3 = qjdVar.b;
            if (str3 != null) {
                strE = strE + "Message: " + str3 + "; ";
            }
            Throwable th = qjdVar.c;
            phaVarA.b = strE;
            if (th != null) {
                phaVarA.c = th;
            }
            plrVar.a.d(phaVarA.a());
        }
        if (listC != null) {
            n(listC, f);
        } else if (listC2 != null) {
            n(listC2, d);
        }
    }

    public final synchronized void m(HttpURLConnection httpURLConnection, int i) {
        if (i != -1) {
            if (httpURLConnection instanceof aidc) {
                throw null;
            }
            TrafficStats.setThreadStatsTag(i);
        }
    }
}
