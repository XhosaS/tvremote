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

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtk extends rti implements roq, rqf {
    public final Context a;
    public final xbw b;
    public final xbw d;
    public final yfo e;
    public final rzy h;
    private final rqd i;
    private final uht j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public rtk(yyh yyhVar, Context context, rou rouVar, uht uhtVar, xbw xbwVar, xbw xbwVar2, yfo yfoVar, Executor executor, rzy rzyVar) {
        this.h = rzyVar;
        this.i = yyhVar.f(executor, xbwVar, yfoVar);
        this.a = context;
        this.j = uhtVar;
        this.b = xbwVar;
        this.d = xbwVar2;
        this.e = yfoVar;
        rouVar.a(this);
    }

    @Override // defpackage.rti
    public final void a(final rtg rtgVar) {
        String strGroup;
        String str;
        int i;
        if (rtgVar.b <= 0 && rtgVar.c <= 0 && rtgVar.d <= 0 && rtgVar.e <= 0 && rtgVar.q <= 0 && (i = rtgVar.w) != 3 && i != 4 && rtgVar.s <= 0) {
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).s("skip logging NetworkEvent due to empty bandwidth/latency data");
            uhp uhpVar = uhl.a;
            return;
        }
        rqd rqdVar = this.i;
        String str2 = rtgVar.g;
        if (str2 == null || !rtgVar.h) {
            strGroup = rtgVar.f;
        } else {
            strGroup = str2 + "/" + rtgVar.f;
        }
        String str3 = rtgVar.k;
        Pattern pattern = rth.a;
        if (sij.F(strGroup)) {
            strGroup = "";
        } else {
            Matcher matcher = rth.a.matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = rth.c.matcher(strGroup);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    Matcher matcher3 = rth.b.matcher(strGroup);
                    if (matcher3.find() && str3 != null && !str3.startsWith("application/")) {
                        strGroup = matcher3.group(1);
                    }
                }
            }
        }
        int i2 = rtgVar.u;
        if (i2 != 0) {
            switch (i2) {
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
                case 12:
                    str = "MOBILE_FOTA";
                    break;
                case 13:
                    str = "MOBILE_IMS";
                    break;
                case 14:
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
        tsp tspVar = new tsp(":");
        final long jA = rqdVar.a(new tsn(tspVar, tspVar).c(strGroup, rtgVar.k, str, rtgVar.i));
        if (jA == -1) {
            uhp uhpVar2 = uhl.a;
        } else {
            this.g.incrementAndGet();
            sfy.G(new ufv() { // from class: rtj
                @Override // defpackage.ufv
                public final uhp a() {
                    ArrayList arrayList;
                    NetworkInfo activeNetworkInfo;
                    long j = jA;
                    rtk rtkVar = this.a;
                    try {
                        int iAV = a.aV(((zah) rtkVar.e.b()).d);
                        rtg rtgVar2 = rtgVar;
                        if (iAV != 0 && iAV == 5) {
                            rtgVar2.t = tst.i(Long.valueOf(j));
                        }
                        Context context = rtkVar.a;
                        rtgVar2.l = rtkVar.h.g();
                        int type = -1;
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                                type = activeNetworkInfo.getType();
                            }
                        } catch (SecurityException e) {
                            ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).s("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                        }
                        int iE = wae.E(type);
                        if (iE == 0) {
                            iE = 1;
                        }
                        rtgVar2.u = iE;
                        int i3 = ((rtf) rtkVar.b.b()).a;
                        synchronized (rtkVar.c) {
                            rtkVar.f.ensureCapacity(i3);
                            rtkVar.f.add(rtgVar2);
                            if (rtkVar.f.size() >= i3) {
                                arrayList = rtkVar.f;
                                rtkVar.f = new ArrayList(0);
                            } else {
                                arrayList = null;
                            }
                        }
                        return arrayList == null ? uhl.a : rtkVar.b(((rth) rtkVar.d.b()).c(arrayList));
                    } finally {
                        rtkVar.g.decrementAndGet();
                    }
                }
            }, this.j);
        }
    }

    public final uhp b(zba zbaVar) {
        try {
            tst tstVar = ((rtf) this.b.b()).b;
        } catch (Exception e) {
            ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 191, "NetworkMetricServiceImpl.java")).s("Exception while getting network metric extension!");
        }
        rqd rqdVar = this.i;
        rpz rpzVarA = rqa.a();
        rpzVarA.f(zbaVar);
        rpzVarA.b = null;
        return rqdVar.b(rpzVarA.a());
    }

    public final uhp c() {
        if (this.g.get() > 0) {
            osv osvVar = new osv(this, 8);
            uht uhtVar = this.j;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            uik uikVar = new uik(osvVar);
            uikVar.c(new ufx(uhtVar.schedule(uikVar, 1L, timeUnit), 3), ugk.a);
            return uikVar;
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return uhl.a;
            }
            ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return sfy.G(new lhx(this, arrayList, 11, null), this.j);
        }
    }

    @Override // defpackage.roq
    public final void g(rmp rmpVar) {
        c();
    }

    @Override // defpackage.rqf
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.roq
    public final /* synthetic */ void j(rmp rmpVar) {
    }
}
