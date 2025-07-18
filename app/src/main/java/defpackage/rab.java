package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rab extends qzx implements qsn, quz {
    public final Context a;
    public final aehf b;
    public final aehf d;
    public final agow e;
    public final qtj h;
    private final qux i;
    private final zyh j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public rab(quy quyVar, Context context, qst qstVar, zyh zyhVar, aehf aehfVar, aehf aehfVar2, agow agowVar, Executor executor, qtj qtjVar) {
        this.h = qtjVar;
        this.i = quyVar.a(executor, aehfVar, agowVar);
        this.a = context;
        this.j = zyhVar;
        this.b = aehfVar;
        this.d = aehfVar2;
        this.e = agowVar;
        qstVar.c.a(this);
    }

    @Override // defpackage.qzx
    public final void a(final qzv qzvVar) {
        String strGroup;
        String str;
        if (qzvVar.b <= 0 && qzvVar.c <= 0 && qzvVar.d <= 0 && qzvVar.e <= 0 && qzvVar.r <= 0) {
            ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).u("skip logging NetworkEvent due to empty bandwidth/latency data");
            zyd zydVar = zxy.a;
            return;
        }
        qux quxVar = this.i;
        String str2 = qzvVar.g;
        if (str2 == null || !qzvVar.h) {
            strGroup = qzvVar.f;
        } else {
            strGroup = str2 + "/" + qzvVar.f;
        }
        String str3 = qzvVar.k;
        Pattern pattern = qzw.a;
        if (yqv.c(strGroup)) {
            strGroup = "";
        } else {
            Matcher matcher = qzw.a.matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = qzw.c.matcher(strGroup);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    Matcher matcher3 = qzw.b.matcher(strGroup);
                    if (matcher3.find() && str3 != null && !str3.startsWith("application/")) {
                        strGroup = matcher3.group(1);
                    }
                }
            }
        }
        int i = qzvVar.t;
        if (i != 0) {
            switch (i) {
                case 1:
                    str = "NONE";
                    break;
                case 2:
                    str = "MOBILE";
                    break;
                case 3:
                    str = "WIFI";
                    break;
                case 4:
                    str = "MOBILE_MMS";
                    break;
                case 5:
                    str = "MOBILE_SUPL";
                    break;
                case 6:
                    str = "MOBILE_DUN";
                    break;
                case 7:
                    str = "MOBILE_HIPRI";
                    break;
                case 8:
                    str = "WIMAX";
                    break;
                case 9:
                    str = "BLUETOOTH";
                    break;
                case 10:
                    str = "DUMMY";
                    break;
                case 11:
                    str = "ETHERNET";
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    str = "MOBILE_FOTA";
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    str = "MOBILE_IMS";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str = "MOBILE_CBS";
                    break;
                case 15:
                    str = "WIFI_P2P";
                    break;
                case 16:
                    str = "MOBILE_IA";
                    break;
                case 17:
                    str = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str = "PROXY";
                    break;
                default:
                    str = "VPN";
                    break;
            }
        } else {
            str = null;
        }
        yqn yqnVar = new yqn(":");
        final long jA = quxVar.a(new yql(yqnVar, yqnVar).c(new yqm(new Object[]{str, null}, strGroup, qzvVar.k)));
        if (jA == -1) {
            zyd zydVar2 = zxy.a;
        } else {
            this.g.incrementAndGet();
            zxn.l(new zvh() { // from class: qzy
                @Override // defpackage.zvh
                public final zyd a() {
                    ArrayList arrayList;
                    NetworkInfo activeNetworkInfo;
                    rab rabVar = this.a;
                    long j = jA;
                    try {
                        int iA = ahuf.a(((ahug) rabVar.e.a()).d);
                        qzv qzvVar2 = qzvVar;
                        if (iA != 0 && iA == 5) {
                            qzvVar2.s = yqt.i(Long.valueOf(j));
                        }
                        Context context = rabVar.a;
                        qzvVar2.l = rabVar.h.a();
                        int type = -1;
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                                type = activeNetworkInfo.getType();
                            }
                        } catch (SecurityException e) {
                            ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).u("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                        }
                        int iA2 = ahsj.a(type);
                        if (iA2 == 0) {
                            iA2 = 1;
                        }
                        qzvVar2.t = iA2;
                        ((qzu) rabVar.b.a()).g();
                        synchronized (rabVar.c) {
                            rabVar.f.ensureCapacity(50);
                            rabVar.f.add(qzvVar2);
                            if (rabVar.f.size() >= 50) {
                                arrayList = rabVar.f;
                                rabVar.f = new ArrayList(0);
                            } else {
                                arrayList = null;
                            }
                        }
                        return arrayList == null ? zxy.a : rabVar.b(((qzw) rabVar.d.a()).c(arrayList));
                    } finally {
                        rabVar.g.decrementAndGet();
                    }
                }
            }, this.j);
        }
    }

    public final zyd b(ahvw ahvwVar) {
        try {
            ((qzu) this.b.a()).d();
        } catch (Exception e) {
            ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 191, "NetworkMetricServiceImpl.java")).u("Exception while getting network metric extension!");
        }
        qux quxVar = this.i;
        qup qupVarN = quq.n();
        qupVarN.f(ahvwVar);
        ((quh) qupVarN).c = null;
        return quxVar.b(qupVarN.a());
    }

    public final zyd c() {
        if (this.g.get() > 0) {
            return zxn.s(new zvh() { // from class: qzz
                @Override // defpackage.zvh
                public final zyd a() {
                    return this.a.c();
                }
            }, TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return zxy.a;
            }
            final ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return zxn.l(new zvh() { // from class: raa
                @Override // defpackage.zvh
                public final zyd a() {
                    rab rabVar = this.a;
                    return rabVar.b(((qzw) rabVar.d.a()).c(arrayList));
                }
            }, this.j);
        }
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        c();
    }

    @Override // defpackage.quz
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.qsn
    public final /* synthetic */ void j(qpi qpiVar) {
    }
}
