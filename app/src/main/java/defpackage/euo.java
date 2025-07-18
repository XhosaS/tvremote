package defpackage;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.location.Geocoder;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.assistant.audio.LibAAudioManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.AndroidFuturesService;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import com.google.assistant.sdk.libassistant.AssistantManagerNative;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euo implements aejl {
    public final eup a;
    private final int b;

    public euo(eup eupVar, int i) {
        this.a = eupVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v349, types: [java.lang.Object, vln] */
    private final Object b() throws PackageManager.NameNotFoundException {
        mfd mfaVar;
        int i = this.b;
        uon uonVar = null;
        switch (i) {
            case 0:
                eup eupVar = this.a;
                return wxe.b(eupVar.iO.a(), eupVar.iQ, zcp.b);
            case 1:
                eup eupVar2 = this.a;
                Object objA = eupVar2.h.a();
                mcw mcwVar = (mcw) eupVar2.i.a();
                aejl aejlVar = eupVar2.m;
                aejl aejlVar2 = eupVar2.iP;
                wun wunVar = wun.a;
                wunVar.getClass();
                yyr yyrVar = zcl.a;
                return new wxv((wvh) objA, mcwVar, aejlVar, aejlVar2, wunVar, yyrVar, yyrVar);
            case 2:
                return new wvh((ExecutorService) this.a.g.a());
            case 3:
                eup eupVar3 = this.a;
                return new mdv(eupVar3.eM(), eupVar3.f);
            case 4:
                eup eupVar4 = this.a;
                ThreadFactory threadFactory = (ThreadFactory) eupVar4.b.a();
                zyh zyhVar = (zyh) eupVar4.c.a();
                eupVar4.hR();
                return mdj.c(threadFactory, zyhVar);
            case 5:
                return new mfj(11);
            case 6:
                mdh mdhVar = new mdh(mdj.a("Scheduler", new ThreadFactory() { // from class: mdc
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(runnable);
                    }
                }));
                mdhVar.setRemoveOnCancelPolicy(true);
                zyh zyhVarB = zyn.b(mdhVar);
                zyhVarB.getClass();
                return zyhVarB;
            case 7:
                yyr yyrVar2 = zcl.a;
                int i2 = ((zcl) yyrVar2).c;
                if (i2 == 0) {
                    mfaVar = new mfa();
                } else {
                    if (i2 != 1) {
                        throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
                    }
                    mfaVar = (mfd) zag.f(yyrVar2.keySet());
                }
                mfe.a(mfaVar);
                mfaVar.getClass();
                return mfaVar;
            case 8:
                return yqt.i(false);
            case 9:
                return new mcw();
            case 10:
                eup eupVar5 = this.a;
                return new mdv(eupVar5.eN(), eupVar5.f);
            case 11:
                eup eupVar6 = this.a;
                ThreadFactory threadFactory2 = (ThreadFactory) eupVar6.j.a();
                zyh zyhVar2 = (zyh) eupVar6.c.a();
                int iMax = Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
                mef mefVar = new mef();
                eupVar6.hR();
                mgt mgtVar = (mgt) eupVar6.k.a();
                eupVar6.hQ();
                return mdj.d(threadFactory2, zyhVar2, iMax, mefVar, mgtVar);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new mfj(0);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new mgt();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                yzo yzoVarI = yzq.i(2);
                eup eupVar7 = this.a;
                yzoVarI.i(eupVar7.gj());
                yzoVarI.c(eupVar7.fD());
                return yzoVarI.f();
            case 15:
                eup eupVar8 = this.a;
                quy quyVarCV = eupVar8.cV();
                aehf aehfVarB = aejf.b(eupVar8.iM);
                yqt.i(eupVar8.ei());
                return new qxo(quyVarCV, aehfVarB, (Executor) eupVar8.cE.a());
            case 16:
                return new quu(aejf.b(this.a.eH));
            case 17:
                eup eupVar9 = this.a;
                return yzq.q((rdn) eupVar9.iA.a(), (rdn) eupVar9.iB.a());
            case 18:
                eup eupVar10 = this.a;
                return new red((Context) eupVar10.n.a(), yqt.i((Boolean) eupVar10.o.a()), (rdv) eupVar10.fx(), new ClearcutMetricSnapshotTransmitter());
            case 19:
                return this.a.a.a;
            case 20:
                return Boolean.valueOf(aewv.a.eV().g((Context) this.a.n.a()));
            case 21:
                eup eupVar11 = this.a;
                return new gva(eupVar11.ak(), (agte) eupVar11.x.a(), eupVar11.hf, eupVar11.ar(), eupVar11.as(), eupVar11.cC(), (fxu) eupVar11.t.a(), eupVar11.az(), eupVar11.aC(), eupVar11.hf, eupVar11.bw(), eupVar11.ge);
            case 22:
                eup eupVar12 = this.a;
                return new fxq((Context) eupVar12.n.a(), (ahbt) eupVar12.q.a(), (hag) eupVar12.s.a());
            case 23:
                agte agteVar = (agte) this.a.p.a();
                agteVar.getClass();
                return new vwt(agteVar);
            case 24:
                eup eupVar13 = this.a;
                vwg vwgVarEj = eupVar13.ej();
                zyh zyhVar3 = (zyh) eupVar13.m.a();
                zyhVar3.getClass();
                agte agteVarA = vwgVarEj.a(zyhVar3);
                agteVarA.getClass();
                return agteVarA;
            case 25:
                return hah.b((String) this.a.r.a());
            case 26:
                ((Context) this.a.n.a()).getClass();
                String strB = rnu.b();
                return strB == null ? "" : strB;
            case 27:
                eup eupVar14 = this.a;
                return fpn.a.a(eupVar14.iy, eupVar14.iz, eupVar14.am);
            case 28:
                return new fpm(this.a.y());
            case 29:
                agte agteVar2 = (agte) this.a.x.a();
                agteVar2.getClass();
                return new vwt(agteVar2);
            case 30:
                eup eupVar15 = this.a;
                vwg vwgVarEj2 = eupVar15.ej();
                zyh zyhVar4 = (zyh) eupVar15.w.a();
                zyhVar4.getClass();
                agte agteVarA2 = vwgVarEj2.a(zyhVar4);
                agteVarA2.getClass();
                return agteVarA2;
            case 31:
                eup eupVar16 = this.a;
                return new mdv(eupVar16.eO(), eupVar16.f);
            case 32:
                eup eupVar17 = this.a;
                ThreadFactory threadFactory3 = (ThreadFactory) eupVar17.u.a();
                zyh zyhVar5 = (zyh) eupVar17.c.a();
                Integer num = 4;
                num.getClass();
                mgn mgnVar = mgn.a;
                eupVar17.hR();
                mgt mgtVar2 = (mgt) eupVar17.k.a();
                return mdj.b(threadFactory3, zyhVar5, mgnVar, mgtVar2);
            case 33:
                return new mfj(10);
            case 34:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45677792").d());
            case 35:
                wbm wbmVar = (wbm) this.a.ip.a();
                wbmVar.getClass();
                return new wcg(wbmVar);
            case 36:
                eup eupVar18 = this.a;
                wbn wbnVar = (wbn) eupVar18.aC.a();
                wby wbyVar = (wby) eupVar18.aF.a();
                final wmy wmyVar = (wmy) eupVar18.aG.a();
                zyg zygVar = (zyg) eupVar18.A.a();
                final wav wavVar = (wav) eupVar18.f6if.a();
                Map mapFM = eupVar18.fM();
                final wcm wcmVarEo = eupVar18.eo();
                wbnVar.getClass();
                wbyVar.getClass();
                wmyVar.getClass();
                zygVar.getClass();
                wavVar.getClass();
                return wbnVar.a(vzs.a, new agux() { // from class: wcd
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        wmx wmxVar = wcmVarEo.a(str) ? new wmx(1) : new wmx(2);
                        Uri uriC = wmyVar.c(wmxVar, File.separator + "phenotype" + File.separator + str);
                        uriC.getClass();
                        return uriC;
                    }
                }, zygVar, mapFM, wch.a, new wci(wbyVar), new zvi() { // from class: wce
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return wavVar.a((String) obj);
                    }
                }, new agum() { // from class: wcf
                    @Override // defpackage.agum
                    public final Object a() {
                        return "";
                    }
                });
            case 37:
                return new euc(this);
            case 38:
                return new eug(this);
            case 39:
                eup eupVar19 = this.a;
                try {
                    PackageInfo packageInfo = eupVar19.k().getPackageInfo(((Context) eupVar19.n.a()).getPackageName(), 0);
                    packageInfo.getClass();
                    return packageInfo;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Can't find our own package", e);
                }
            case 40:
                eup eupVar20 = this.a;
                return new mdv(eupVar20.eM(), eupVar20.f);
            case 41:
                eup eupVar21 = this.a;
                Map mapFN = eupVar21.fN();
                wbt wbtVar = (wbt) eupVar21.J.a();
                wbtVar.getClass();
                yzo yzoVarI2 = yzq.i(((zcl) mapFN).c);
                for (String str : ((yyr) mapFN).keySet()) {
                    yzoVarI2.c(str);
                    yzoVarI2.c(wbtVar.a(str));
                }
                yzq yzqVarF = yzoVarI2.f();
                yzqVarF.getClass();
                return yzqVarF;
            case 42:
                throw new RuntimeException();
            case 43:
                Map map = (Map) this.a.I.a();
                map.getClass();
                return new wbt(map);
            case 44:
                eup eupVar22 = this.a;
                Map mapGe = eupVar22.ge();
                Map mapGf = eupVar22.gf();
                yyn yynVar = new yyn(4);
                for (String str2 : ((yyr) mapGe).keySet()) {
                    String str3 = (String) mapGf.get(str2);
                    if (str3 != null) {
                        String strI = a.i(str3, str2, "#");
                        yynVar.c(str2, strI);
                        yynVar.c(strI, strI);
                    } else {
                        yynVar.c(str2, str2);
                    }
                }
                return yynVar.a(true);
            case 45:
                vzs vzsVar = vzs.a;
                vzsVar.getClass();
                return vzsVar;
            case 46:
                vzs vzsVar2 = vzs.a;
                vzsVar2.getClass();
                return vzsVar2;
            case 47:
                vzs vzsVar3 = vzs.a;
                vzsVar3.getClass();
                return vzsVar3;
            case 48:
                vzs vzsVar4 = vzs.a;
                vzsVar4.getClass();
                return vzsVar4;
            case 49:
                vzs vzsVar5 = vzs.a;
                vzsVar5.getClass();
                return vzsVar5;
            case 50:
                vzs vzsVar6 = vzs.a;
                vzsVar6.getClass();
                return vzsVar6;
            case 51:
                Context context = (Context) this.a.n.a();
                context.getClass();
                return new ueg(agqq.d(new uej(new uei(context)), new ufc()));
            case 52:
                Context context2 = (Context) this.a.n.a();
                context2.getClass();
                try {
                    return context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 53:
                eup eupVar23 = this.a;
                Context context3 = (Context) eupVar23.n.a();
                final aehf aehfVarB2 = aejf.b(eupVar23.A);
                final aejl aejlVar3 = eupVar23.O;
                final aejl aejlVar4 = eupVar23.at;
                final aejl aejlVar5 = eupVar23.au;
                Context context4 = rfr.a;
                final rfp rfpVar = new rfp();
                rfpVar.a = context3;
                aehfVarB2.getClass();
                rfpVar.b = new yrp() { // from class: rfu
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return (zyh) aehfVarB2.a();
                    }
                };
                aejlVar3.getClass();
                final yrp yrpVar = new yrp() { // from class: rfv
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return (yqt) aejlVar3.a();
                    }
                };
                rfpVar.c = new yrp() { // from class: rfo
                    @Override // defpackage.yrp
                    public final Object eV() {
                        rfp rfpVar2 = rfpVar;
                        return (rgy) ((yqt) yrpVar.eV()).d(rfr.d(rfpVar2.a));
                    }
                };
                aejlVar4.getClass();
                rfpVar.d = new yrp() { // from class: rfv
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return (yqt) aejlVar4.a();
                    }
                };
                aejlVar5.getClass();
                rfpVar.e = new yrp() { // from class: rfw
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return (ueg) aejlVar5.a();
                    }
                };
                return rfpVar.a();
            case 54:
                return yqt.i((rgy) this.a.N.a());
            case 55:
                return new rhc(this.a.cD());
            case 56:
                return yqt.i((gst) this.a.as.a());
            case 57:
                eup eupVar24 = this.a;
                return new gst(aejf.b(eupVar24.T), aejf.b(eupVar24.U), (ahbt) eupVar24.y.a(), eupVar24.hp(), (hag) eupVar24.s.a(), eupVar24.hq(), eupVar24.ab(), (ztw) eupVar24.ao.a(), aejf.b(eupVar24.ar));
            case 58:
                eup eupVar25 = this.a;
                return new eyw(eupVar25.Q, eupVar25.bj(), (gzu) eupVar25.R.a(), (gof) eupVar25.S.a());
            case 59:
                return Boolean.valueOf(((waa) new aemv(this.a.P).a.a()).a("com.google.android.katniss.device", "45373100").d());
            case 60:
                return new gzu();
            case 61:
                eup eupVar26 = this.a;
                return new goh(eupVar26.o(), eupVar26.p(), eupVar26.k());
            case 62:
                return new jls();
            case 63:
                ActivityManager activityManager = (ActivityManager) ((Context) this.a.n.a()).getSystemService("activity");
                activityManager.getClass();
                return activityManager;
            case 64:
                eup eupVar27 = this.a;
                return fhp.a.a(eupVar27.W, eupVar27.al, eupVar27.am);
            case 65:
                return new fho(this.a.w());
            case 66:
                eup eupVar28 = this.a;
                return new fhl((Context) eupVar28.n.a(), eupVar28.gC(), (ujq) eupVar28.ak.a(), (ScheduledExecutorService) eupVar28.w.a());
            case 67:
                eup eupVar29 = this.a;
                final Context context5 = (Context) eupVar29.n.a();
                Executor executor = (Executor) eupVar29.w.a();
                ueg uegVar = (ueg) eupVar29.af.a();
                Executor executor2 = (Executor) eupVar29.m.a();
                final aejl aejlVar6 = eupVar29.ag;
                final aejl aejlVar7 = eupVar29.ah;
                final aejl aejlVar8 = eupVar29.ai;
                final aejl aejlVar9 = eupVar29.aj;
                final yrp yrpVarA = yru.a(new yrp() { // from class: tfh
                    @Override // defpackage.yrp
                    public final Object eV() {
                        tfr.b(context5, "mappedcountercacheversionjni", false);
                        return null;
                    }
                });
                uig uodVar = uoe.a;
                HashMap map2 = new HashMap();
                unm unmVar = umr.a;
                ujr.a(unmVar, map2);
                ujr.a(umd.a, map2);
                int i3 = ula.b;
                yrpVarA.getClass();
                ujr.a(new ula(new ulb() { // from class: tfi
                    @Override // defpackage.ulb
                    public final void a() {
                        yrpVarA.eV();
                    }
                }), map2);
                ujr.a(new ukg(unmVar), map2);
                if (((Long) aejlVar6.a()).longValue() > 0 || ((Long) aejlVar7.a()).longValue() > 0) {
                    if (uoo.b == null) {
                        synchronized (uoo.a) {
                            if (uoo.b == null) {
                                uoo.b = new uoo(new uom(context5, new SecureRandom(), Executors.newSingleThreadExecutor()));
                            }
                        }
                    }
                    uonVar = uoo.b.c;
                    List list = jyw.m;
                    jyt jytVar = new jyt(context5, "ICING");
                    jytVar.f = new unx();
                    uoc uocVar = new uoc(jytVar.b(), context5.getPackageName());
                    uocVar.b = executor2;
                    uocVar.d = new yrp() { // from class: tfj
                        @Override // defpackage.yrp
                        public final Object eV() {
                            return Integer.valueOf(((Long) aejlVar6.a()).intValue());
                        }
                    };
                    uocVar.e = new yrp() { // from class: tfk
                        @Override // defpackage.yrp
                        public final Object eV() {
                            return Integer.valueOf(((Long) aejlVar7.a()).intValue());
                        }
                    };
                    uocVar.f = new yrp() { // from class: tfl
                        @Override // defpackage.yrp
                        public final Object eV() {
                            return Integer.valueOf(((Long) aejlVar8.a()).intValue());
                        }
                    };
                    aejlVar9.getClass();
                    uocVar.g = new yrp() { // from class: tfm
                        @Override // defpackage.yrp
                        public final Object eV() {
                            return (Boolean) aejlVar9.a();
                        }
                    };
                    if (((Long) aejlVar7.a()).longValue() > 0) {
                        uocVar.h = yqt.i(uonVar);
                    }
                    uodVar = new uod(uocVar);
                }
                return new ujq(executor, uegVar, uodVar, map2, uonVar);
            case 68:
                eup eupVar30 = this.a;
                return new ueg(yyk.j(eupVar30.gs()), yyk.j(eupVar30.gu()), yyk.j(eupVar30.gt()));
            case 69:
                eup eupVar31 = this.a;
                Context context6 = (Context) eupVar31.n.a();
                uey ueyVar = (uey) eupVar31.X.a();
                uei ueiVar = new uei(context6);
                ueiVar.b = new lml(context6);
                ueiVar.d = ueyVar;
                return new uej(ueiVar);
            case 70:
                eup eupVar32 = this.a;
                Context context7 = (Context) eupVar32.n.a();
                zyg zygVar2 = (zyg) eupVar32.A.a();
                int i4 = uem.b;
                uel uelVar = new uel(context7);
                uelVar.b("mobstore_accounts.pb");
                Uri uriA = uelVar.a();
                uoe uoeVar = uoe.a;
                HashMap map3 = new HashMap();
                ujr.a(umr.a, map3);
                ujq ujqVar = new ujq(zygVar2, new ueg(Arrays.asList(new uej(new uei(context7)))), uoeVar, map3, null);
                ujl ujlVarH = ujm.h();
                ujlVarH.d(acij.a);
                ujlVarH.e(uriA);
                return new uey(ujqVar.a(ujlVarH.a()));
            case 71:
                return new uep(new ueo((Context) this.a.n.a()));
            case 72:
                Object zddVar = (Build.VERSION.SDK_INT < 30 || Objects.equals(Build.FINGERPRINT, "robolectric")) ? zcp.b : new zdd(new ues((Context) this.a.n.a()));
                zddVar.getClass();
                return zddVar;
            case 73:
                return new uhw();
            case 74:
                return new uhy((Context) this.a.n.a(), uhy.b);
            case 75:
                return new qfg((Context) this.a.n.a());
            case 76:
                eup eupVar33 = this.a;
                return new qfc((zyg) eupVar33.A.a());
            case 77:
                return Long.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45622301").a());
            case 78:
                return Long.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45633094").a());
            case 79:
                return Long.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45642012").a());
            case 80:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45622302").d());
            case 81:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45689002").d());
            case 82:
                ztv ztvVar = ztv.a;
                ztvVar.getClass();
                return ztvVar;
            case 83:
                eup eupVar34 = this.a;
                return new ghq((Context) eupVar34.n.a(), (kak) eupVar34.aq.a(), (zyh) eupVar34.m.a());
            case 84:
                return new kak(this.a.ap);
            case 85:
                Context context8 = (Context) this.a.n.a();
                mhv.f();
                return new ueg(yyk.p(new uej(new uei(context8)), new ufc()));
            case 86:
                return new wdx();
            case 87:
                eup eupVar35 = this.a;
                Map mapGe2 = eupVar35.ge();
                int i5 = ((zcl) mapGe2).c;
                Map mapGf2 = eupVar35.gf();
                yyn yynVarH = yyr.h(i5);
                for (Map.Entry entry : ((yyr) mapGe2).entrySet()) {
                    String str4 = (String) entry.getKey();
                    vzs vzsVar7 = (vzs) entry.getValue();
                    String str5 = (String) mapGf2.get(str4);
                    if (str5 != null) {
                        yynVarH.c(a.i(str5, str4, "#"), vzsVar7);
                    } else {
                        yynVarH.c(str4, vzsVar7);
                    }
                }
                return yynVarH.a(true);
            case 88:
                return rfd.a((Context) this.a.n.a());
            case 89:
                eup eupVar36 = this.a;
                yyr yyrVar3 = zcl.a;
                Map mapGf3 = eupVar36.gf();
                Map map4 = (Map) eupVar36.az.a();
                map4.getClass();
                yyn yynVar2 = new yyn(4);
                for (Map.Entry entry2 : yyrVar3.entrySet()) {
                    wed wedVar = (wed) entry2.getKey();
                    final agow agowVar = (agow) entry2.getValue();
                    yynVar2.c(wbv.a(mapGf3, wedVar), new zvh() { // from class: wbp
                        @Override // defpackage.zvh
                        public final zyd a() {
                            return zxn.h(((MessageLite) agowVar.a()).toByteArray());
                        }
                    });
                }
                for (Map.Entry entry3 : yyrVar3.entrySet()) {
                    wed wedVar2 = (wed) entry3.getKey();
                    final agow agowVar2 = (agow) entry3.getValue();
                    yynVar2.c(wbv.a(mapGf3, wedVar2), new zvh() { // from class: wbq
                        @Override // defpackage.zvh
                        public final zyd a() {
                            zyd zydVarA = ((zvh) agowVar2.a()).a();
                            final wbu wbuVar = wbu.a;
                            yqi yqiVar = new yqi() { // from class: wbo
                                @Override // defpackage.yqi
                                public final Object apply(Object obj) {
                                    return wbuVar.a(obj);
                                }
                            };
                            return zuz.g(zydVarA, wyo.a(yqiVar), zwk.a);
                        }
                    });
                }
                yyr yyrVarA = yynVar2.a(true);
                if (map4.keySet().containsAll(yyrVarA.keySet())) {
                    return yyrVarA;
                }
                throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map4.keySet() + ", params provided: " + yyrVarA.keySet());
            case 90:
                return new euh(this);
            case 91:
                eup eupVar37 = this.a;
                return new wcu(eupVar37.N, eupVar37.aD, (zyg) eupVar37.w.a(), (rfr) eupVar37.av.a(), eupVar37.eo());
            case 92:
                eup eupVar38 = this.a;
                yyn yynVarH2 = yyr.h(6);
                yynVarH2.c("com.google.android.katniss.device", eupVar38.C);
                yynVarH2.c("com.google.android.libraries.search.audio.device", eupVar38.D);
                yynVarH2.c("tiktok.device", eupVar38.E);
                yynVarH2.c("tiktok.directboot", eupVar38.F);
                yynVarH2.c("com.google.android.libraries.search.device", eupVar38.G);
                yynVarH2.c("com.google.android.apps.search.transcription.device", eupVar38.H);
                return yynVarH2.a(true);
            case 93:
                return new wmy((Context) this.a.n.a());
            case 94:
                eup eupVar39 = this.a;
                return new wax(yqt.i(eupVar39.em()), (wbt) eupVar39.J.a(), eupVar39.iq, eupVar39.ge(), (Map) eupVar39.az.a());
            case 95:
                eup eupVar40 = this.a;
                return new viv(eupVar40.im, (viw) eupVar40.fE(), (vjb) eupVar40.in.a(), (zyg) eupVar40.m.a());
            case 96:
                eup eupVar41 = this.a;
                vhq vhqVar = (vhq) eupVar41.aY.a();
                vhn vhnVarDV = eupVar41.dV();
                eupVar41.el();
                aejl aejlVar10 = eupVar41.il;
                return new vhe(vhqVar, vhnVarDV, aejlVar10);
            case 97:
                eup eupVar42 = this.a;
                return new vmo((vll) eupVar42.fs(), eupVar42.ft());
            case 98:
                eup eupVar43 = this.a;
                return eupVar43.eA().a(eupVar43.ew(), (ueg) eupVar43.au.a());
            case 99:
                eup eupVar44 = this.a;
                final mfw mfwVar = (mfw) eupVar44.aI.a();
                final Executor executor3 = (Executor) eupVar44.aH.a();
                return new Executor() { // from class: vlm
                    @Override // java.util.concurrent.Executor
                    public final void execute(final Runnable runnable) {
                        Executor executor4 = executor3;
                        executor4.getClass();
                        runnable.getClass();
                        zvh zvhVar = new zvh() { // from class: mfk
                            @Override // defpackage.zvh
                            public final zyd a() {
                                runnable.run();
                                return zxy.a;
                            }
                        };
                        final mfw mfwVar2 = mfwVar;
                        final zyd zydVarL = zxn.l(zvhVar, new mfl(mfwVar2));
                        executor4.execute(new Runnable() { // from class: mfm
                            @Override // java.lang.Runnable
                            public final void run() throws SecurityException, IllegalArgumentException {
                                mfwVar2.c(zydVarL);
                            }
                        });
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        boolean z = true;
        Boolean bool = false;
        switch (i) {
            case 100:
                return new mfw((Executor) this.a.aH.a());
            case 101:
                aejl aejlVar = this.a.w;
                bool.getClass();
                Executor executor = (Executor) aejlVar.a();
                executor.getClass();
                return executor;
            case 102:
                eup eupVar = this.a;
                return eupVar.ez().a(eupVar.ey(), (ueg) eupVar.au.a());
            case 103:
                throw new AssertionError();
            case 104:
                eup eupVar2 = this.a;
                return new vmn((vle) eupVar2.fr(), (zyg) eupVar2.w.a(), (zyg) eupVar2.m.a(), eupVar2.aN, eupVar2.hZ, eupVar2.ic, eupVar2.ie, eupVar2.ig, eupVar2.hD);
            case 105:
                return new zdd(this.a.hx());
            case 106:
                yzo yzoVarI = yzq.i(2);
                eup eupVar3 = this.a;
                yzoVarI.i(eupVar3.gx());
                yzoVarI.c(eupVar3.dU());
                return yzoVarI.f();
            case 107:
                if (!this.a.da().a()) {
                    bool.getClass();
                    z = false;
                }
                return Boolean.valueOf(z);
            case 108:
                eup eupVar4 = this.a;
                return new wpy((Context) eupVar4.n.a(), (zyh) eupVar4.w.a(), (zyg) eupVar4.m.a(), eupVar4.da(), (vqi) eupVar4.aX.a(), yqt.i((vhq) eupVar4.aY.a()), yqt.i(Boolean.valueOf(eupVar4.hg())), (wor) eupVar4.aZ.a(), eupVar4.fL(), zcl.a, eupVar4.gd(), eupVar4.hN(), eupVar4.eC());
            case 109:
                eup eupVar5 = this.a;
                Context context = (Context) eupVar5.n.a();
                PowerManager powerManager = (PowerManager) eupVar5.aP.a();
                zyh zyhVar = (zyh) eupVar5.aR.a();
                Map mapFY = eupVar5.fY();
                Map mapFZ = eupVar5.fZ();
                eupVar5.ed();
                return new vqi(context, powerManager, zyhVar, mapFY, mapFZ, (zyh) eupVar5.w.a(), (zyh) eupVar5.A.a(), eupVar5.da());
            case 110:
                PowerManager powerManager2 = (PowerManager) ((Context) this.a.n.a()).getSystemService("power");
                powerManager2.getClass();
                return powerManager2;
            case 111:
                return new vqj();
            case 112:
                eup eupVar6 = this.a;
                return new mek(eupVar6.s());
            case 113:
                return AndroidFuturesService.class;
            case 114:
                return InternalForegroundService.class;
            case 115:
                return new vqr((eui) this.a.aV.a());
            case 116:
                return new eui(this);
            case 117:
                return new vql();
            case 118:
                eup eupVar7 = this.a;
                Context context2 = (Context) eupVar7.n.a();
                zyg zygVar = (zyg) eupVar7.w.a();
                yqt yqtVarI = yqt.i(Boolean.valueOf(eupVar7.hi()));
                rnw rnwVarDa = eupVar7.da();
                return new wor(context2, zygVar, yqtVarI, rnwVarDa);
            case 119:
                return tcr.b(this.a.dE(), tdb.a.a());
            case 120:
                eup eupVar8 = this.a;
                return new tcg(eupVar8.dD(), (vhb) eupVar8.bc.a(), (ExecutorService) eupVar8.m.a());
            case 121:
                eup eupVar9 = this.a;
                return new tbw((tbo) eupVar9.bh.a(), eupVar9.gc(), zcp.b, (olo) eupVar9.bi.a(), eupVar9.fR(), (zyg) eupVar9.m.a(), (zyg) eupVar9.w.a(), (zyg) eupVar9.A.a(), eupVar9.fX(), eupVar9.cI(), eupVar9.hM(), eupVar9.hh(), eupVar9.b(), afap.a(eupVar9.P));
            case 122:
                eup eupVar10 = this.a;
                return new tbo((Context) eupVar10.n.a(), (zyg) eupVar10.w.a(), (zyg) eupVar10.A.a(), eupVar10.hu(), eupVar10.cJ(), (vhb) eupVar10.bc.a(), eupVar10.el(), (zyg) eupVar10.m.a(), (vjo) eupVar10.bf.a(), zcp.b, eupVar10.eT(), aejf.b(eupVar10.bg));
            case 123:
                eup eupVar11 = this.a;
                return mah.b((Executor) eupVar11.w.a(), eupVar11.cG(), (maa) eupVar11.ba.a());
            case 124:
                return new maa();
            case 125:
                return new vyl();
            case 126:
                eup eupVar12 = this.a;
                return new vjo(yqt.i((vhq) eupVar12.aY.a()), yqt.i("google"), (yqt) ((aejh) eupVar12.be).b);
            case 127:
                eup eupVar13 = this.a;
                return tfo.b((Context) eupVar13.n.a(), (Executor) eupVar13.A.a(), Optional.empty(), (mcw) eupVar13.i.a(), new tfn());
            case 128:
                eup eupVar14 = this.a;
                return new tdj((Context) eupVar14.n.a(), (vjo) eupVar14.bf.a(), eupVar14.cJ(), ypv.a, (zyg) eupVar14.w.a());
            case 129:
                eup eupVar15 = this.a;
                zyg zygVar2 = (zyg) eupVar15.A.a();
                zyg zygVar3 = (zyg) eupVar15.m.a();
                jwr jwrVarCC = eupVar15.cC();
                wln wlnVar = (wln) eupVar15.bk.a();
                vjo vjoVar = (vjo) eupVar15.bf.a();
                return new wlu(zygVar2, zygVar3, jwrVarCC, wlnVar, vjoVar);
            case 130:
                wlv wlvVar = new wlv(this.a.fI());
                yqw.L(!yqv.c(wlvVar.a));
                return wlvVar;
            case 131:
                eup eupVar16 = this.a;
                boolean zHj = eupVar16.hj();
                Optional.empty().isPresent();
                return tcs.b(eupVar16.bo, zHj, eupVar16.eB());
            case 132:
                eup eupVar17 = this.a;
                return new tce((tbe) eupVar17.bh.a(), (vhb) eupVar17.bc.a(), eupVar17.el(), (ExecutorService) eupVar17.m.a());
            case 133:
                eup eupVar18 = this.a;
                return gtm.b(eupVar18.hx, eupVar18.eB());
            case 134:
                eup eupVar19 = this.a;
                return new gtl((Context) eupVar19.n.a(), (ahbt) eupVar19.q.a(), eupVar19.br(), eupVar19.eq());
            case 135:
                eup eupVar20 = this.a;
                return new gyv(eupVar20.bq, eupVar20.hp, (ahbt) eupVar20.q.a(), eupVar20.gA(), eupVar20.hq, eupVar20.hr, eupVar20.cp, eupVar20.hs, eupVar20.ht, (hag) eupVar20.s.a(), eupVar20.eL());
            case 136:
                return Boolean.valueOf(((waa) this.a.fb().a.a()).a("com.google.android.katniss.device", "45686623").d());
            case 137:
                eup eupVar21 = this.a;
                return yzq.u(eupVar21.bI(), eupVar21.bJ(), eupVar21.bK(), eupVar21.bC(), eupVar21.T(), eupVar21.am(), eupVar21.cy(), eupVar21.L(), eupVar21.bk(), eupVar21.O(), eupVar21.R(), eupVar21.aq(), eupVar21.M(), eupVar21.Q(), eupVar21.cd(), eupVar21.bG(), eupVar21.W(), eupVar21.cw(), eupVar21.bv(), eupVar21.cF(), eupVar21.av(), eupVar21.aS(), eupVar21.cA(), eupVar21.E(), eupVar21.bL(), eupVar21.aV(), eupVar21.aW(), eupVar21.ay(), eupVar21.H(), eupVar21.bM(), eupVar21.aB(), eupVar21.bN(), eupVar21.bF(), eupVar21.bl(), eupVar21.bz(), eupVar21.bm(), eupVar21.aj(), eupVar21.bO());
            case 138:
                eup eupVar22 = this.a;
                return new gko((gnz) eupVar22.bt.a(), eupVar22.eL(), (ghr) eupVar22.fg.a());
            case 139:
                eup eupVar23 = this.a;
                return new gnz(eupVar23.p(), (vrm) eupVar23.bs.a());
            case 140:
                return new vrm((Looper) this.a.br.a());
            case 141:
                return mdk.b(new mef(), (ThreadFactory) this.a.j.a());
            case 142:
                eup eupVar24 = this.a;
                return new gkh(eupVar24.gJ(), eupVar24.u(), (kak) eupVar24.aq.a(), (mcw) eupVar24.i.a(), (Context) eupVar24.n.a(), (ahbt) eupVar24.q.a(), eupVar24.gI(), eupVar24.bj(), (fjn) eupVar24.bD.a(), (gtu) eupVar24.bE.a(), eupVar24.cp, (gfr) eupVar24.cu.a(), eupVar24.bY(), eupVar24.X(), eupVar24.aw(), (fki) eupVar24.fL.a(), eupVar24.fM, eupVar24.Z(), (hag) eupVar24.s.a(), eupVar24.eL(), (ztw) eupVar24.ao.a(), (gns) eupVar24.fN.a());
            case 143:
                return Boolean.valueOf(((waa) this.a.fh().a.a()).a("com.google.android.katniss.device", "45663670").d());
            case 144:
                return gxx.b(this.a.h());
            case 145:
                BluetoothManager bluetoothManager = (BluetoothManager) ((Context) this.a.n.a()).getSystemService("bluetooth");
                bluetoothManager.getClass();
                return bluetoothManager;
            case 146:
                eup eupVar25 = this.a;
                return new gsz(eupVar25.by, (hag) eupVar25.s.a());
            case 147:
                eup eupVar26 = this.a;
                return new ffr(eupVar26.N(), (hkz) eupVar26.bx.a());
            case 148:
                return new hkz();
            case 149:
                return new gte();
            case 150:
                return Boolean.valueOf(((waa) this.a.fh().a.a()).a("com.google.android.katniss.device", "45376824").d());
            case ModuleDescriptor.MODULE_VERSION /* 151 */:
                aepi aepiVarFq = this.a.fq();
                Boolean bool2 = (Boolean) aepi.a.d(23, "45417926", false).eX(aepiVarFq.b, aepiVarFq.c);
                bool2.booleanValue();
                return bool2;
            case 152:
                return new fjn((fhi) this.a.an.a());
            case 153:
                eup eupVar27 = this.a;
                return ggc.b(eupVar27.fH, eupVar27.fK, (hag) eupVar27.s.a());
            case 154:
                eup eupVar28 = this.a;
                return new gfo((mcw) eupVar28.i.a(), (euj) eupVar28.fF.a(), (eum) eupVar28.fG.a());
            case 155:
                return new euj(this);
            case 156:
                eup eupVar29 = this.a;
                return ggb.b(eupVar29.fC, eupVar29.fD, (hag) eupVar29.s.a());
            case 157:
                eup eupVar30 = this.a;
                return new gev((ros) eupVar30.cq.a(), (gfu) eupVar30.fB.a(), (fex) eupVar30.cr.a());
            case 158:
                eup eupVar31 = this.a;
                return rpl.b(eupVar31.db(), aejf.b(eupVar31.fy), Optional.of(1357));
            case 159:
                return yqt.i((rqb) this.a.bF.a());
            case 160:
                eup eupVar32 = this.a;
                return tfv.b(eupVar32.hk(), (zyh) eupVar32.w.a(), (ExecutorService) eupVar32.A.a(), (ExecutorService) eupVar32.w.a());
            case 161:
                return yqt.i((rqh) this.a.bH.a());
            case 162:
                eup eupVar33 = this.a;
                boolean zHl = eupVar33.hl();
                boolean zHm = eupVar33.hm();
                return tfw.b(zHl, zHm);
            case 163:
                eup eupVar34 = this.a;
                return new rpi(eupVar34.bJ, eupVar34.bK, eupVar34.i, eupVar34.bL, eupVar34.bG);
            case 164:
                eup eupVar35 = this.a;
                return new rrl(eupVar35.i, eupVar35.bG);
            case 165:
                return new rrb();
            case 166:
                return yqt.i((rqj) this.a.bN.a());
            case 167:
                return new rqj();
            case 168:
                return yqt.i((tja) this.a.bP.a());
            case 169:
                return new tja();
            case 170:
                eup eupVar36 = this.a;
                return rsj.b(eupVar36.dd(), eupVar36.dc(), aejf.b(eupVar36.fx));
            case 171:
                eup eupVar37 = this.a;
                return new geq((mcw) eupVar37.i.a(), (ahbt) eupVar37.y.a());
            case 172:
                eup eupVar38 = this.a;
                return new hxz(eupVar38.bS, eupVar38.i(), (ahbt) eupVar38.y.a());
            case 173:
                return Boolean.valueOf(((waa) this.a.eY().a.a()).a("com.google.android.katniss.device", "45663213").d());
            case 174:
                eup eupVar39 = this.a;
                return fgm.b(eupVar39.bV, eupVar39.fu, (hag) eupVar39.s.a());
            case 175:
                return new fft();
            case 176:
                eup eupVar40 = this.a;
                return new fgl(eupVar40.r(), (agte) eupVar40.bW.a(), (ahbt) eupVar40.y.a(), (ahbt) eupVar40.q.a(), (ahbt) eupVar40.bX.a(), (tne) eupVar40.cd.a(), (euk) eupVar40.cj.a(), eupVar40.ck, eupVar40.bj(), (gzu) eupVar40.R.a(), eupVar40.cB(), (ffp) eupVar40.by.a(), (gtu) eupVar40.bE.a(), eupVar40.cp, (gfr) eupVar40.cu.a(), eupVar40.bc(), (gmd) eupVar40.eV.a(), eupVar40.bn(), (hab) eupVar40.fe.a(), (hvf) eupVar40.fs.a(), (ztw) eupVar40.ao.a(), (ghr) eupVar40.fg.a(), (jca) eupVar40.ft.a());
            case 177:
                eup eupVar41 = this.a;
                vwg vwgVarEj = eupVar41.ej();
                zyh zyhVar2 = (zyh) eupVar41.aR.a();
                zyhVar2.getClass();
                agte agteVarA = vwgVarEj.a(zyhVar2);
                agteVarA.getClass();
                return agteVarA;
            case 178:
                agte agteVar = (agte) this.a.bW.a();
                agteVar.getClass();
                return new vwt(agteVar);
            case 179:
                eup eupVar42 = this.a;
                return new tne((Context) eupVar42.n.a(), (tmi) eupVar42.ca.a(), (ahbt) eupVar42.cb.a(), eupVar42.ci, Optional.empty());
            case 180:
                eup eupVar43 = this.a;
                return tmi.a.a(eupVar43.bZ, tmr.a(ypv.a), (Context) eupVar43.n.a());
            case 181:
                eup eupVar44 = this.a;
                return tmv.b((jyw) eupVar44.bY.a(), (zyh) eupVar44.m.a());
            case 182:
                eup eupVar45 = this.a;
                return ((kak) eupVar45.aq.a()).a((Context) eupVar45.n.a(), "XUIKIT", null);
            case 183:
                eup eupVar46 = this.a;
                return tmo.b(yqt.i((ahbt) eupVar46.y.a()), eupVar46.w);
            case 184:
                eup eupVar47 = this.a;
                return new toc((ahbt) eupVar47.cb.a(), (tlq) eupVar47.cc.a(), eupVar47.dN(), new tnf(), new tnh(), (tne) eupVar47.cd.a(), (tnx) eupVar47.ce.a(), eupVar47.dK(), eupVar47.dM(), (tni) eupVar47.ch.a(), eupVar47.eL(), (tmi) eupVar47.ca.a(), (Context) eupVar47.n.a(), eupVar47.he());
            case 185:
                eup eupVar48 = this.a;
                return new tlq((Context) eupVar48.n.a(), (zyh) eupVar48.w.a());
            case 186:
                return new tnx();
            case 187:
                eup eupVar49 = this.a;
                tmi tmiVar = (tmi) eupVar49.ca.a();
                ypv ypvVar = ypv.a;
                yqt yqtVarA = tmx.a(ypvVar);
                tmr.a(ypvVar);
                return new tmm(tmiVar, ypvVar, yqtVarA, (Context) eupVar49.n.a());
            case 188:
                eup eupVar50 = this.a;
                yqt yqtVar = (yqt) eupVar50.cg.a();
                tnm tnmVarDL = eupVar50.dL();
                ujk ujkVar = (ujk) yqtVar.f();
                if (ujkVar == null) {
                    return new tnn();
                }
                zyg zygVar4 = (zyg) tnmVarDL.a.a();
                zygVar4.getClass();
                tmi tmiVar2 = (tmi) tnmVarDL.b.a();
                tmiVar2.getClass();
                return new tnl(zygVar4, tmiVar2, ujkVar);
            case 189:
                final toe toeVarDO = this.a.dO();
                Context context3 = toeVarDO.b;
                if (!afec.e(context3)) {
                    toeVarDO.f.isPresent();
                    ((zdv) ((zdv) toe.a.b()).q("com/google/android/libraries/search/rendering/xuikit/runtime/resourceloader/XUiKitSrsResourceRegistryCacheInitializer", "initialize", 60, "XUiKitSrsResourceRegistryCacheInitializer.java")).u("SRS disk cache is not enabled");
                    return ypv.a;
                }
                ujq ujqVar = (ujq) ((yqz) toeVarDO.c).a;
                int i2 = uem.b;
                uel uelVar = new uel(context3);
                uem.b("xuikit");
                uelVar.c = "xuikit";
                uelVar.b("SrsResourceCache.pb");
                final Uri uriA = uelVar.a();
                zxn.j(wyo.h(new Runnable() { // from class: tod
                    @Override // java.lang.Runnable
                    public final void run() {
                        toe toeVar = toeVarDO;
                        toeVar.d.h("Srs.DiskCache.ResourceRegistry.SizeInBytes", new File(String.valueOf(toeVar.b.getApplicationInfo().dataDir).concat(String.valueOf(uriA.getPath()))).length());
                    }
                }), toeVarDO.e);
                ujl ujlVarH = ujm.h();
                ujlVarH.e(uriA);
                ujlVarH.d(adfw.a);
                return yqt.i(ujqVar.a(ujlVarH.a()));
            case 190:
                return new euk(this);
            case 191:
                return Boolean.valueOf(((waa) this.a.fe().a.a()).a("com.google.android.katniss.device", "45682584").d());
            case 192:
                eup eupVar51 = this.a;
                return gya.b((Context) eupVar51.n.a(), eupVar51.co);
            case 193:
                eup eupVar52 = this.a;
                return gyb.b(eupVar52.cl, eupVar52.cn);
            case 194:
                DisplayManager displayManager = (DisplayManager) ((Context) this.a.n.a()).getSystemService("display");
                displayManager.getClass();
                return displayManager;
            case 195:
                return gyc.b((Context) this.a.cm.a());
            case 196:
                eup eupVar53 = this.a;
                return ggd.b(eupVar53.cs, eupVar53.ct, (hag) eupVar53.s.a());
            case 197:
                eup eupVar54 = this.a;
                return new gfs((ros) eupVar54.cq.a(), (mcw) eupVar54.i.a(), (fex) eupVar54.cr.a());
            case 198:
                return new gft(this.a.N());
            case 199:
                eup eupVar55 = this.a;
                return get.b(eupVar55.eT, eupVar55.eU, (hag) eupVar55.s.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() throws Throwable {
        int i = this.b;
        Boolean bool = false;
        switch (i) {
            case 200:
                eup eupVar = this.a;
                mcw mcwVar = (mcw) eupVar.i.a();
                geq geqVar = (geq) eupVar.bR.a();
                gph gphVarBj = eupVar.bj();
                gzu gzuVar = (gzu) eupVar.R.a();
                qpk qpkVar = (qpk) eupVar.eS.a();
                Random random = yrd.a;
                random.getClass();
                return new gej(mcwVar, geqVar, gphVarBj, gzuVar, qpkVar, random);
            case 201:
                qpk qpkVar2 = (qpk) this.a.eR.a();
                qpk.b(qpkVar2);
                qpkVar2.getClass();
                return qpkVar2;
            case 202:
                eup eupVar2 = this.a;
                aejl aejlVar = eupVar2.eQ;
                if (!uea.d(Thread.currentThread())) {
                    qpd qpdVar = (qpd) eupVar2.cy.a();
                    if (!qpd.b()) {
                        zdv zdvVar = (zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java");
                        String str = qpdVar.a;
                        zdvVar.x("Primes init triggered from background in package: %s", str);
                        if (!qpdVar.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", str));
                        }
                    }
                }
                return new qpk((qpl) aejlVar.a());
            case 203:
                eup eupVar3 = this.a;
                return new qpm((qpv) eupVar3.cx.a(), eupVar3.eG, eupVar3.dX, eupVar3.ez, eupVar3.eI, eupVar3.eJ, eupVar3.eL, eupVar3.cT());
            case 204:
                qpu qpuVar = (qpu) this.a.cv.a();
                zyh zyhVarC = qpuVar.c();
                if (zyhVarC == null) {
                    int iA = qpuVar.a();
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(iA, new qpr(qpuVar.b()), new qpp());
                    scheduledThreadPoolExecutor.setMaximumPoolSize(iA);
                    zyhVarC = zyn.b(scheduledThreadPoolExecutor);
                }
                zyhVarC.getClass();
                return zyhVarC;
            case 205:
                yqt yqtVarI = yqt.i(this.a.cR());
                qpu.e().c();
                return (qpu) ((yqz) yqtVarI).a;
            case 206:
                return new qpv();
            case 207:
                eup eupVar4 = this.a;
                yzo yzoVarI = yzq.i(12);
                Iterable zddVar = Build.VERSION.SDK_INT >= 30 ? new zdd((quz) eupVar4.dn.a()) : zcp.b;
                zddVar.getClass();
                yzoVarI.i(zddVar);
                zcp zcpVar = zcp.b;
                zcpVar.getClass();
                yzoVarI.i(zcpVar);
                zcpVar.getClass();
                yzoVarI.i(zcpVar);
                yzoVarI.i(eupVar4.gq());
                yzoVarI.i(eupVar4.gg());
                zcpVar.getClass();
                yzoVarI.i(zcpVar);
                zcpVar.getClass();
                yzoVarI.i(zcpVar);
                yzoVarI.i(new zdd((quz) eupVar4.eg.a()));
                yqt.i(eupVar4.eh);
                yzoVarI.i(new zdd((quz) eupVar4.eq.a()));
                zcpVar.getClass();
                yzoVarI.i(zcpVar);
                yzoVarI.c((quz) eupVar4.ez.a());
                yzoVarI.c(new raw((qst) eupVar4.dr.a(), eupVar4.eC, eupVar4.eD, eupVar4.eE, eupVar4.eF, aejf.b(eupVar4.eo)));
                return yzoVarI.f();
            case 208:
                eup eupVar5 = this.a;
                return new qxe(eupVar5.cV(), (Context) eupVar5.n.a(), (Executor) eupVar5.cE.a(), (qww) eupVar5.fv(), eupVar5.cU, aejf.b(eupVar5.cY), (qqq) eupVar5.dc.a(), (qqz) eupVar5.dj.a(), eupVar5.dk, eupVar5.dl, eupVar5.dm);
            case 209:
                eup eupVar6 = this.a;
                Executor executor = ((qpu) eupVar6.cv.a()).d() ? (Executor) eupVar6.cD.a() : (Executor) eupVar6.cw.a();
                executor.getClass();
                return executor;
            case 210:
                eup eupVar7 = this.a;
                return new qph((zyh) eupVar7.cw.a(), (qsx) eupVar7.cB.a(), eupVar7.cC);
            case 211:
                eup eupVar8 = this.a;
                return new qsx((Context) eupVar8.n.a(), (qsz) eupVar8.cA.a());
            case 212:
                return new qsz((qsy) this.a.cz.a());
            case 213:
                return new qsy((qpd) this.a.cy.a());
            case 214:
                return new qpd((Context) this.a.n.a());
            case 215:
                return Boolean.valueOf(aexb.a.eV().a((Context) this.a.n.a()));
            case 216:
                return ((qvd) this.a.cG.a()).a;
            case 217:
                Context context = (Context) this.a.n.a();
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    return new qvd(packageInfo.versionName, packageInfo.versionCode);
                } catch (PackageManager.NameNotFoundException e) {
                    ((zdv) ((zdv) ((zdv) qps.a.d()).p(e)).q("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionNameAndCode", 92, "PrimesCoreMetricDaggerModule.java")).x("Failed to get PackageInfo for: %s", packageName);
                    return new qvd(null, 0);
                }
            case 218:
                return Integer.valueOf(((qvd) this.a.cG.a()).b);
            case 219:
                Context context2 = (Context) this.a.n.a();
                int i2 = kcy.c;
                return Integer.valueOf(kdu.a(context2));
            case 220:
                return Boolean.valueOf(aewj.a.eV().h((Context) this.a.n.a()));
            case 221:
                return Boolean.valueOf(aewj.a.eV().g((Context) this.a.n.a()));
            case 222:
                return Long.valueOf(aewj.a.eV().c((Context) this.a.n.a()));
            case 223:
                return Long.valueOf(aewj.a.eV().d((Context) this.a.n.a()));
            case 224:
                return Boolean.valueOf(aewj.a.eV().j((Context) this.a.n.a()));
            case 225:
                return Boolean.valueOf(aewj.a.eV().i((Context) this.a.n.a()));
            case 226:
                return Long.valueOf(aewj.a.eV().a((Context) this.a.n.a()));
            case 227:
                return Long.valueOf(aewj.a.eV().b((Context) this.a.n.a()));
            case 228:
                return Long.valueOf(aeyn.a.eV().d((Context) this.a.n.a()));
            case 229:
                return Long.valueOf(aeyn.a.eV().b((Context) this.a.n.a()));
            case 230:
                final Context context3 = (Context) this.a.n.a();
                Object objEV = new yrp() { // from class: qop
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return context3.getSharedPreferences("primes", 0);
                    }
                }.eV();
                objEV.getClass();
                return objEV;
            case 231:
                qws qwsVar = (qws) qpc.a(yqt.i(this.a.cX), new agow() { // from class: qos
                    @Override // defpackage.agow
                    public final Object a() {
                        return qws.d().a();
                    }
                });
                qwsVar.getClass();
                return qwsVar;
            case 232:
                eup eupVar9 = this.a;
                qwr qwrVarD = qws.d();
                Object objA = eupVar9.cV.a();
                objA.getClass();
                int i3 = true == ((Boolean) objA).booleanValue() ? 3 : 2;
                qxf qxfVar = (qxf) qwrVarD;
                qxfVar.c = i3;
                qxfVar.b = eupVar9.cW;
                return qwrVarD.a();
            case 233:
                return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45688912").d());
            case 234:
                gph gphVarBj2 = this.a.bj();
                ahqu ahquVar = ahqu.a;
                ahqt ahqtVar = new ahqt();
                abxc abxcVar = ahrs.c;
                abxcVar.getClass();
                ahrq ahrqVar = new ahrq();
                ahta.e(ahrqVar);
                ahta.d(gphVarBj2.d, ahrqVar);
                ahqtVar.f(abxcVar, ahta.a(ahrqVar));
                return ahsg.a(ahqtVar);
            case 235:
                eup eupVar10 = this.a;
                Executor executor2 = (Executor) eupVar10.cE.a();
                aejl aejlVar2 = eupVar10.cZ;
                aejl aejlVar3 = eupVar10.da;
                qqs qqsVar = new qqs(aejlVar3);
                qqu qquVar = new qqu(aejf.b(eupVar10.cY));
                yzq yzqVarR = yzq.r(qqsVar, qquVar, new qqx(eupVar10.cH, eupVar10.cI, eupVar10.cJ, eupVar10.db));
                Object objFA = eupVar10.fA();
                return new qqp(executor2, yzqVarR, (qqk) objFA, aejlVar3);
            case 236:
                return (mcw) ((yqz) yqt.i((mcw) this.a.i.a())).a;
            case 237:
                return Boolean.valueOf(aexb.a.eV().d((Context) this.a.n.a()));
            case 238:
                return Boolean.valueOf(aexb.a.eV().c((Context) this.a.n.a()));
            case 239:
                eup eupVar11 = this.a;
                return new qqz((qrb) eupVar11.de.a(), (zyh) eupVar11.cw.a(), (Random) eupVar11.df.a(), eupVar11.dg, eupVar11.dh, eupVar11.di);
            case 240:
                eup eupVar12 = this.a;
                qqq qqqVar = (qqq) eupVar12.dc.a();
                return new qrb(qqqVar, eupVar12.dd);
            case 241:
                return Boolean.valueOf(aeyn.a.eV().i((Context) this.a.n.a()));
            case 242:
                return Long.valueOf(aeyn.a.eV().c((Context) this.a.n.a()));
            case 243:
                return Long.valueOf(aeyn.a.eV().a((Context) this.a.n.a()));
            case 244:
                return Boolean.valueOf(aeyn.a.eV().g((Context) this.a.n.a()));
            case 245:
                return new Random(SystemClock.elapsedRealtime());
            case 246:
                return Boolean.valueOf(aeyn.a.eV().h((Context) this.a.n.a()));
            case 247:
                return Long.valueOf(aeyn.a.eV().e((Context) this.a.n.a()));
            case 248:
                return Long.valueOf(aeyn.a.eV().f((Context) this.a.n.a()));
            case 249:
                return Boolean.valueOf(aewj.a.eV().f((Context) this.a.n.a()));
            case 250:
                return aewj.a.eV().e((Context) this.a.n.a());
            case 251:
                return Boolean.valueOf(aexb.a.eV().b((Context) this.a.n.a()));
            case 252:
                eup eupVar13 = this.a;
                return new qtt(eupVar13.cV(), (Context) eupVar13.n.a(), (qsx) eupVar13.cB.a(), (qst) eupVar13.dr.a(), (zyh) eupVar13.cw.a(), aejf.b(eupVar13.ds), new que(eupVar13.cW()), eupVar13.dt, eupVar13.du, (Executor) eupVar13.cE.a());
            case 253:
                eup eupVar14 = this.a;
                return new qst((qsx) eupVar14.cB.a(), (qtd) eupVar14.f5do.a(), eupVar14.dp, eupVar14.dq);
            case 254:
                return new qtd((Context) this.a.n.a());
            case 255:
                bool.getClass();
                return bool;
            case 256:
                bool.getClass();
                return bool;
            case 257:
                qtq qtqVar = (qtq) qpc.a(ypv.a, new agow() { // from class: qoy
                    /* JADX WARN: Type inference failed for: r0v0, types: [qtp] */
                    @Override // defpackage.agow
                    public final Object a() {
                        return new qtn(new Object() { // from class: qtp
                        });
                    }
                });
                qtqVar.getClass();
                return qtqVar;
            case 258:
                eup eupVar15 = this.a;
                String str2 = (String) eupVar15.cH.a();
                quf qufVar = new quf((Context) eupVar15.n.a());
                mcw mcwVar2 = (mcw) eupVar15.cZ.a();
                aejl aejlVar4 = eupVar15.ds;
                return new qto(str2, qufVar, mcwVar2, aejlVar4);
            case 259:
                return aewn.a.eV().a((Context) this.a.n.a());
            case 260:
                aejl aejlVar5 = this.a.dw;
                aejlVar5.getClass();
                qye qyeVarF = qyf.f();
                Object objA2 = aejlVar5.a();
                objA2.getClass();
                ((qxt) qyeVarF).c = true == ((Boolean) objA2).booleanValue() ? 3 : 2;
                return qyeVarF.a();
            case 261:
                return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45398508").d());
            case 262:
                eup eupVar16 = this.a;
                quy quyVarCV = eupVar16.cV();
                Context context4 = (Context) eupVar16.n.a();
                qsx qsxVar = (qsx) eupVar16.cB.a();
                aehf aehfVarB = aejf.b(eupVar16.dy);
                Object objA3 = eupVar16.dA.a();
                aejl aejlVar6 = eupVar16.cE;
                aejl aejlVar7 = eupVar16.dB;
                aejl aejlVar8 = eupVar16.dC;
                Executor executor3 = (Executor) aejlVar6.a();
                qyr qyrVar = new qyr(aejm.b(eupVar16.dD), eupVar16.cw);
                aejl aejlVar9 = eupVar16.dE;
                aejl aejlVar10 = eupVar16.dz;
                aejm.b(eupVar16.dD);
                aejlVar10.getClass();
                return new qyb(quyVarCV, context4, qsxVar, aehfVarB, (qxr) objA3, aejlVar7, aejlVar8, executor3, qyrVar, aejlVar9, (qyh) eupVar16.fC(), eupVar16.dI);
            case 263:
                qyf qyfVar = (qyf) qpc.a(yqt.i(this.a.dx), new agow() { // from class: qot
                    @Override // defpackage.agow
                    public final Object a() {
                        qye qyeVarF2 = qyf.f();
                        ((qxt) qyeVarF2).c = 2;
                        return qyeVarF2.a();
                    }
                });
                qyfVar.getClass();
                return qyfVar;
            case 264:
                eup eupVar17 = this.a;
                return new qxr(aejf.b(eupVar17.dz), (Executor) eupVar17.cE.a());
            case 265:
                return new qyc();
            case 266:
                return aexe.a.eV().c((Context) this.a.n.a());
            case 267:
                return new Handler((Looper) ((yqz) yqt.i((Looper) this.a.br.a())).a);
            case 268:
                return Boolean.valueOf(aexe.a.eV().d((Context) this.a.n.a()));
            case 269:
                return aexe.a.eV().b((Context) this.a.n.a());
            case 270:
                return new qvh((yrx) this.a.dG.a());
            case 271:
                return new qpn((mcw) this.a.cZ.a());
            case 272:
                return Long.valueOf(aexe.a.eV().a((Context) this.a.n.a()));
            case 273:
                eup eupVar18 = this.a;
                aejl aejlVar11 = eupVar18.dJ;
                aejlVar11.getClass();
                qvr qvrVarH = qvs.h();
                qvp qvpVar = (qvp) qvrVarH;
                qvpVar.d = 3;
                qvrVarH.b((int) ((Number) aejlVar11.a()).longValue());
                qvpVar.b = eupVar18.cW;
                return qvrVarH.c();
            case 274:
                return Long.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45640961").a());
            case 275:
                eup eupVar19 = this.a;
                return new qwi(eupVar19.cV(), (Executor) eupVar19.cE.a(), aejf.b(eupVar19.dL), yqt.i(eupVar19.dN), (qsx) eupVar19.cB.a(), (qst) eupVar19.dr.a(), eupVar19.cY(), eupVar19.dO, eupVar19.dP, eupVar19.dQ, (qvv) eupVar19.fy(), (qwc) eupVar19.fz(), yqt.i((qsa) eupVar19.dS.a()), eupVar19.dT, eupVar19.dU, new qxh(eupVar19.dV));
            case 276:
                qvs qvsVar = (qvs) qpc.a(yqt.i(this.a.dK), new agow() { // from class: qpa
                    @Override // defpackage.agow
                    public final Object a() {
                        qvr qvrVarH2 = qvs.h();
                        ((qvp) qvrVarH2).d = 2;
                        return qvrVarH2.c();
                    }
                });
                qvsVar.getClass();
                return qvsVar;
            case 277:
                return new NativeCrashHandlerImpl(this.a.dM);
            case 278:
                return Boolean.valueOf(aewv.a.eV().f((Context) this.a.n.a()));
            case 279:
                return aewv.a.eV().c((Context) this.a.n.a());
            case 280:
                return aewv.a.eV().d((Context) this.a.n.a());
            case 281:
                return aewv.a.eV().b((Context) this.a.n.a());
            case 282:
                eup eupVar20 = this.a;
                return new qtj(eupVar20.cS(), (Context) eupVar20.n.a());
            case 283:
                return new qsa(null);
            case 284:
                return Boolean.valueOf(aewv.a.eV().e((Context) this.a.n.a()));
            case 285:
                return Long.valueOf(aewv.a.eV().a((Context) this.a.n.a()));
            case 286:
                return Boolean.valueOf(aexq.a.eV().a((Context) this.a.n.a()));
            case 287:
                eup eupVar21 = this.a;
                return new rab(eupVar21.cV(), (Context) eupVar21.n.a(), (qst) eupVar21.dr.a(), (zyh) eupVar21.cw.a(), aejf.b(eupVar21.dX), aejf.b(eupVar21.dY), eupVar21.dZ, (Executor) eupVar21.cE.a(), (qtj) eupVar21.dR.a());
            case 288:
                qzu qzuVar = (qzu) qpc.a(ypv.a, new agow() { // from class: qow
                    @Override // defpackage.agow
                    public final Object a() {
                        return new qzt(ypv.a);
                    }
                });
                qzuVar.getClass();
                return qzuVar;
            case 289:
                return new qzw(this.a.dX);
            case 290:
                return aext.a.eV().a((Context) this.a.n.a());
            case 291:
                eup eupVar22 = this.a;
                quy quyVarCV2 = eupVar22.cV();
                Context context5 = (Context) eupVar22.n.a();
                zyh zyhVar = (zyh) eupVar22.cw.a();
                aehf aehfVarB2 = aejf.b(eupVar22.ea);
                aejl aejlVar12 = eupVar22.cZ;
                aejl aejlVar13 = eupVar22.eb;
                return new qvn(quyVarCV2, context5, zyhVar, aehfVarB2, aejlVar13, eupVar22.ec);
            case 292:
                qvj qvjVar = (qvj) qpc.a(ypv.a, new agow() { // from class: qoq
                    @Override // defpackage.agow
                    public final Object a() {
                        return new qvi();
                    }
                });
                qvjVar.getClass();
                return qvjVar;
            case 293:
                return aewr.a.eV().a((Context) this.a.n.a());
            case 294:
                eup eupVar23 = this.a;
                aejf.b(eupVar23.ea);
                return new qvo((Context) eupVar23.n.a());
            case 295:
                eup eupVar24 = this.a;
                return new rbf(eupVar24.cV(), (Context) eupVar24.n.a(), (qst) eupVar24.dr.a(), (Executor) eupVar24.cE.a(), aejf.b(eupVar24.ee), eupVar24.cX(), eupVar24.ef);
            case 296:
                rbc rbcVar = (rbc) qpc.a(yqt.i(this.a.ed), new agow() { // from class: qov
                    @Override // defpackage.agow
                    public final Object a() {
                        return rbc.g().a();
                    }
                });
                rbcVar.getClass();
                return rbcVar;
            case 297:
                rbb rbbVarG = rbc.g();
                ((raz) rbbVarG).c = 3;
                return rbbVarG.a();
            case 298:
                return aeyb.a.eV().a((Context) this.a.n.a());
            case 299:
                eup eupVar25 = this.a;
                hag hagVar = (hag) eupVar25.s.a();
                fmg fmgVarAb = eupVar25.ab();
                ztw ztwVar = (ztw) eupVar25.ao.a();
                hagVar.getClass();
                ztwVar.getClass();
                Object objA4 = ahak.a(agtf.a, new gml(hagVar, fmgVarAb, ztwVar, null));
                objA4.getClass();
                return (rbk) objA4;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        int i = this.b;
        switch (i) {
            case 400:
                eup eupVar = this.a;
                return new gpl((ett) eupVar.gn.a(), (fiu) eupVar.eY.a(), eupVar.k(), eupVar.go);
            case 401:
                return new ett(this);
            case 402:
                return (acfo) ((waa) new aejv(this.a.P).a.a()).a("com.google.android.katniss.device", "45382795").b();
            case 403:
                feu.a.a();
                return false;
            case 404:
                return Boolean.valueOf(((waa) new aekb(this.a.P).a.a()).a("com.google.android.katniss.device", "45388285").d());
            case 405:
                eup eupVar2 = this.a;
                return new fjx((fjr) eupVar2.fW.a(), (fxu) eupVar2.t.a());
            case 406:
                return (acfo) ((waa) new aelf(this.a.P).a.a()).a("com.google.android.katniss.device", "45376965").b();
            case 407:
                aepe aepeVarFo = this.a.fo();
                return (acfo) aepe.a.eX(aepeVarFo.b, aepeVarFo.c);
            case 408:
                eup eupVar3 = this.a;
                return new jdb(eupVar3.ee(), eupVar3.bj(), eupVar3.gv, eupVar3.k(), (PowerManager) eupVar3.aP.a(), eupVar3.gw);
            case 409:
                return Boolean.valueOf(((waa) new aene(this.a.P).a.a()).a("com.google.android.katniss.device", "45613549").d());
            case 410:
                return (acfo) ((waa) this.a.P.a()).a("com.google.android.katniss.device", "45430481").b();
            case 411:
                return Boolean.valueOf(((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45376864").d());
            case 412:
                return (abwf) ((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45385106").b();
            case 413:
                return Boolean.valueOf(((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45386122").d());
            case 414:
                return (abwf) ((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45386123").b();
            case 415:
                eup eupVar4 = this.a;
                return new jcv((Context) eupVar4.n.a(), eupVar4.o(), eupVar4.gy, eupVar4.gC, eupVar4.V(), (jcy) eupVar4.gx.a(), eupVar4.bY(), (Executor) eupVar4.m.a(), (fxu) eupVar4.t.a(), (gpb) eupVar4.gD.a(), eupVar4.hn(), (PowerManager) eupVar4.aP.a());
            case 416:
                return Boolean.valueOf(((waa) new aelf(this.a.P).a.a()).a("com.google.android.katniss.device", "45379408").d());
            case 417:
                return new gpb(this.a.i());
            case 418:
                eup eupVar5 = this.a;
                return new glp(aejf.b(eupVar5.eS), (ztw) eupVar5.ao.a(), (mcw) eupVar5.i.a(), (ahbt) eupVar5.q.a());
            case 419:
                eup eupVar6 = this.a;
                return new exz(eupVar6.gy, (Context) eupVar6.n.a(), (PowerManager) eupVar6.aP.a());
            case 420:
                eup eupVar7 = this.a;
                return new ftl((fth) eupVar7.gH.a(), (fxu) eupVar7.t.a());
            case 421:
                eup eupVar8 = this.a;
                return new fth((fxt) eupVar8.t.a(), (fpg) eupVar8.bU.a());
            case 422:
                return Boolean.valueOf(((waa) new aelf(this.a.P).a.a()).a("com.google.android.katniss.device", "45699720").d());
            case 423:
                eup eupVar9 = this.a;
                return Boolean.valueOf(gcy.a.b((Context) eupVar9.n.a(), eupVar9.hf(), eupVar9.m()));
            case 424:
                eup eupVar10 = this.a;
                return gcy.a.a((Context) eupVar10.n.a(), eupVar10.gN, eupVar10.gO);
            case 425:
                eup eupVar11 = this.a;
                return new gcc(eupVar11.gL, (ewc) eupVar11.gM.a(), ((Boolean) eupVar11.gK.a()).booleanValue(), (fjr) eupVar11.fW.a(), (jcy) eupVar11.gx.a(), eupVar11.aT(), (ahbt) eupVar11.q.a(), (PowerManager) eupVar11.aP.a());
            case 426:
                return Boolean.valueOf(((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45616798").d());
            case 427:
                return new ewc();
            case 428:
                eup eupVar12 = this.a;
                return new gcv((Context) eupVar12.n.a(), (Boolean) eupVar12.gK.a(), eupVar12.V(), (jcy) eupVar12.gx.a(), (Executor) eupVar12.m.a(), eupVar12.k());
            case 429:
                return Long.valueOf(((waa) new aelf(this.a.P).a.a()).a("com.google.android.katniss.device", "45693712").a());
            case 430:
                return (abwf) ((waa) new aelf(this.a.P).a.a()).a("com.google.android.katniss.device", "45696112").b();
            case 431:
                return new jma((gcd) this.a.gP.a());
            case 432:
                eup eupVar13 = this.a;
                return new eyp((Context) eupVar13.n.a(), (ffp) eupVar13.by.a());
            case 433:
                return new kpp((Context) this.a.n.a());
            case 434:
                eup eupVar14 = this.a;
                return new gzj((agte) eupVar14.x.a(), (Geocoder) eupVar14.gV.a());
            case 435:
                return gzq.a.a((Context) this.a.n.a());
            case 436:
                eup eupVar15 = this.a;
                return new gee(eupVar15.gJ(), (iax) eupVar15.gb.a(), (fda) eupVar15.fS.a(), (agte) eupVar15.fR.a(), (ahbt) eupVar15.q.a(), eupVar15.bj(), (gtu) eupVar15.bE.a(), (idl) eupVar15.ga.a(), eupVar15.gl);
            case 437:
                eup eupVar16 = this.a;
                return glj.a.a(eupVar16.ha, (hag) eupVar16.s.a(), eupVar16.hb);
            case 438:
                eup eupVar17 = this.a;
                return new glf((ActivityManager) eupVar17.V.a(), (eyw) eupVar17.T.a(), (Context) eupVar17.n.a(), (ahbt) eupVar17.q.a(), eupVar17.Y(), eupVar17.eS, (lzb) eupVar17.gZ.a(), (ztw) eupVar17.ao.a(), (ghr) eupVar17.fg.a());
            case 439:
                eup eupVar18 = this.a;
                eyw eywVar = (eyw) eupVar18.T.a();
                feh fehVarN = eupVar18.N();
                aejl aejlVar = eupVar18.gY;
                eywVar.getClass();
                aejlVar.getClass();
                return new lzb(eywVar, fehVarN, aejlVar);
            case 440:
                return Boolean.valueOf(((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45687136").d());
            case 441:
                eup eupVar19 = this.a;
                return new gli((ActivityManager) eupVar19.V.a(), (ahbt) eupVar19.q.a(), (ghr) eupVar19.fg.a());
            case 442:
                eup eupVar20 = this.a;
                return new fub((fxu) eupVar20.t.a(), eupVar20.ax());
            case 443:
                eup eupVar21 = this.a;
                return new fup((fxu) eupVar21.t.a(), eupVar21.aA());
            case 444:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45670295").d());
            case 445:
                eup eupVar22 = this.a;
                return new gwh((ahbt) eupVar22.q.a(), (gtu) eupVar22.bE.a(), eupVar22.by());
            case 446:
                eup eupVar23 = this.a;
                return new fcd(eupVar23.S(), eupVar23.i(), (ahbt) eupVar23.q.a(), eupVar23.hg, eupVar23.bj(), (gtu) eupVar23.bE.a(), (gfr) eupVar23.cu.a(), (gmd) eupVar23.eV.a(), eupVar23.ax(), (lzb) eupVar23.gZ.a(), (ztw) eupVar23.ao.a(), (ghr) eupVar23.fg.a(), eupVar23.ge);
            case 447:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45401716").d());
            case 448:
                return (acfo) ((waa) this.a.P.a()).a("com.google.android.katniss.device", "45373152").b();
            case 449:
                eup eupVar24 = this.a;
                return new exv(eupVar24.D(), (eyx) eupVar24.hj.a(), (exz) eupVar24.gG.a(), (lzb) eupVar24.gZ.a());
            case 450:
                return new eyx();
            case 451:
                eup eupVar25 = this.a;
                return new exw(eupVar25.D(), (exz) eupVar25.gG.a(), (eyy) eupVar25.hl.a());
            case 452:
                return new eyy();
            case 453:
                return gxz.a.a((Context) this.a.n.a());
            case 454:
                return Boolean.valueOf(((waa) new aelu(this.a.P).a.a()).a("com.google.android.katniss.device", "45699398").d());
            case 455:
                return Boolean.valueOf(((waa) new aelu(this.a.P).a.a()).a("com.google.android.katniss.device", "45655693").d());
            case 456:
                return new gyw();
            case 457:
                return Boolean.valueOf(((waa) new aelu(this.a.P).a.a()).a("com.google.android.katniss.device", "45681414").d());
            case 458:
                eup eupVar26 = this.a;
                aejl aejlVar2 = eupVar26.az;
                yyr yyrVar = zcl.a;
                return wbw.a.b(yyrVar, yyrVar, eupVar26.gf(), (Map) aejlVar2.a(), (Map) eupVar26.aB.a());
            case 459:
                eup eupVar27 = this.a;
                aejl aejlVar3 = eupVar27.az;
                return wbw.a.c(eupVar27.fV(), eupVar27.gf(), (Map) aejlVar3.a(), (Map) eupVar27.aB.a());
            case 460:
                eup eupVar28 = this.a;
                return new gsy(eupVar28.bq(), (ahbt) eupVar28.q.a());
            case 461:
                eup eupVar29 = this.a;
                return vpe.a(eupVar29.hG, eupVar29.eB());
            case 462:
                eup eupVar30 = this.a;
                return new vpb((vhq) eupVar30.aY.a(), (vib) eupVar30.hE.a(), eupVar30.dV(), (zyg) eupVar30.m.a(), (zyg) eupVar30.w.a(), eupVar30.dZ(), (zwv) eupVar30.hF.a());
            case 463:
                eup eupVar31 = this.a;
                aejl aejlVar4 = eupVar31.aY;
                aejl aejlVar5 = eupVar31.hB;
                vhq vhqVar = (vhq) aejlVar4.a();
                ujk ujkVar = (ujk) eupVar31.hC.a();
                return new vib(aejlVar5, vhqVar, ujkVar, eupVar31.hD, eupVar31.a(), (Executor) eupVar31.m.a());
            case 464:
                eup eupVar32 = this.a;
                return new vie(eupVar32.hA, (Executor) eupVar32.w.a());
            case 465:
                Set setA = vhu.a(this.a.fW());
                setA.getClass();
                return yzq.o(setA);
            case 466:
                throw new IllegalStateException("TikTokGoogleOwnersProviderMarker not meant to be injected");
            case 467:
                eup eupVar33 = this.a;
                return qme.a((Context) eupVar33.n.a(), yqt.i((Handler) eupVar33.bs.a()), yqt.i((ExecutorService) eupVar33.A.a()), yqt.i((ScheduledExecutorService) eupVar33.w.a()));
            case 468:
                eup eupVar34 = this.a;
                return eupVar34.eA().a(eupVar34.ex(), (ueg) eupVar34.au.a());
            case 469:
                return new zdd(new vir((viw) this.a.fE()));
            case 470:
                return new zwv();
            case 471:
                return new woa((Context) this.a.n.a());
            case 472:
                eup eupVar35 = this.a;
                return new wob((Context) eupVar35.n.a(), eupVar35.r());
            case 473:
                eup eupVar36 = this.a;
                return new woc((Context) eupVar36.n.a(), eupVar36.r());
            case 474:
                return yzq.o(this.a.gr());
            case 475:
                eup eupVar37 = this.a;
                return new wse((Context) eupVar37.n.a(), Boolean.valueOf(aeys.a(eupVar37.P)), eupVar37.hL, (zyg) eupVar37.m.a(), (wkr) eupVar37.hN.a());
            case 476:
                eup eupVar38 = this.a;
                Application applicationA = aehn.a(eupVar38.a.a);
                applicationA.getClass();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eupVar38.w.a();
                jyw jywVar = new jyw(applicationA, "STREAMZ_TIKTOK", null);
                jywVar.f(aece.UNMETERED_OR_DAILY);
                return new wky(scheduledExecutorService, new uqn(jywVar, "STREAMZ_TIKTOK"), applicationA);
            case 477:
                return new wkr((lwj) this.a.hM.a());
            case 478:
                return lwh.a((Context) this.a.n.a());
            case 479:
                eup eupVar39 = this.a;
                vtm vtmVar = (vtm) eupVar39.hU.a();
                wqg wqgVarED = eupVar39.eD();
                return new wrc(vtmVar, wqgVarED, (Executor) eupVar39.m.a(), (Boolean) eupVar39.aO.a());
            case 480:
                eup eupVar40 = this.a;
                return new vvf((Context) eupVar40.n.a(), (vtz) eupVar40.hT.a(), eupVar40.fQ(), (Executor) eupVar40.m.a(), yqt.i(zcl.a), eupVar40.eg());
            case 481:
                vtz vtzVar = (vtz) this.a.hS.a();
                vtzVar.getClass();
                return vtzVar;
            case 482:
                eup eupVar41 = this.a;
                return new vtw((cot) eupVar41.hR.a(), (ccs) eupVar41.hQ.a());
            case 483:
                eup eupVar42 = this.a;
                return vub.a((Context) eupVar42.n.a());
            case 484:
                Context context = (Context) this.a.n.a();
                try {
                    context.getClass();
                    return cfq.j(context);
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("WorkManager instantiation failed. If you are in a test, add a dependency on\n\"//java/com/google/apps/tiktok/contrib/work/testing\",", e);
                }
            case 485:
                return new vua((ccs) this.a.hQ.a());
            case 486:
                return new SecureRandom();
            case 487:
                eup eupVar43 = this.a;
                return new wrj((vtm) eupVar43.hU.a(), eupVar43.eD(), (Executor) eupVar43.m.a(), (Boolean) eupVar43.aO.a());
            case 488:
                yzo yzoVarI = yzq.i(3);
                eup eupVar44 = this.a;
                yzoVarI.c(eupVar44.dS());
                yzoVarI.i(eupVar44.gw());
                final viw viwVar = (viw) eupVar44.fE();
                yzoVarI.c(new vhk() { // from class: viq
                    @Override // defpackage.vhk
                    public final zyd a() {
                        viwVar.a();
                        return zxy.a;
                    }
                });
                return yzoVarI.f();
            case 489:
                eup eupVar45 = this.a;
                return new vgy((Context) eupVar45.n.a(), (vga) eupVar45.ia.a(), (vrm) eupVar45.bs.a());
            case 490:
                eup eupVar46 = this.a;
                aejl aejlVar6 = eupVar46.aR;
                return new vga((vfo) eupVar46.fu(), (zyh) aejlVar6.a());
            case 491:
                yzo yzoVarI2 = yzq.i(3);
                eup eupVar47 = this.a;
                yzoVarI2.i(eupVar47.gv());
                final vpi vpiVarEa = eupVar47.ea();
                yzoVarI2.c(new vhi() { // from class: vpc
                    @Override // defpackage.vhi
                    public final zyd a(vhj vhjVar) {
                        final AccountId accountId = ((vil) vhjVar).a;
                        final vpi vpiVar = vpiVarEa;
                        return zxn.l(new zvh() { // from class: vpf
                            @Override // defpackage.zvh
                            public final zyd a() {
                                String strB = vos.b(accountId);
                                ArrayList arrayList = new ArrayList();
                                vpi vpiVar2 = vpiVar;
                                zdl it = vpiVar2.b.a().iterator();
                                while (it.hasNext()) {
                                    arrayList.add(vpiVar2.a(new File((File) it.next(), strB)));
                                }
                                return zxn.c(arrayList).a(new zvk(), zwk.a);
                            }
                        }, vpiVar.a);
                    }
                });
                yzoVarI2.c(eupVar47.eb());
                return yzoVarI2.f();
            case 492:
                eup eupVar48 = this.a;
                return new vvs((vhq) eupVar48.aY.a(), (Executor) eupVar48.w.a(), (vvf) eupVar48.hU.a());
            case 493:
                return new zdd(this.a.dT());
            case 494:
                eup eupVar49 = this.a;
                return new vno(eupVar49.dY(), eupVar49.bc, eupVar49.ij, (Executor) eupVar49.m.a());
            case 495:
                eup eupVar50 = this.a;
                return new vhp((vhq) eupVar50.aY.a(), (vib) eupVar50.hE.a());
            case 496:
                eup eupVar51 = this.a;
                return new vjb((Context) eupVar51.n.a(), (vyj) eupVar51.bd.a(), (vrm) eupVar51.bs.a(), (wxc) eupVar51.ii.a());
            case 497:
                eup eupVar52 = this.a;
                return new wcj((yqt) eupVar52.at.a(), (ScheduledExecutorService) eupVar52.m.a(), (wbm) eupVar52.f11io.a(), (wbm) eupVar52.ip.a(), (Map) eupVar52.az.a(), (rgy) eupVar52.N.a(), eupVar52.er(), (rfr) eupVar52.av.a());
            case 498:
                eup eupVar53 = this.a;
                wby wbyVar = (wby) eupVar53.aF.a();
                wbn wbnVar = (wbn) eupVar53.aC.a();
                final wmy wmyVar = (wmy) eupVar53.aG.a();
                aejl aejlVar7 = eupVar53.aR;
                yyr yyrVar2 = zcl.a;
                Executor executor = (Executor) aejlVar7.a();
                final wav wavVar = (wav) eupVar53.f6if.a();
                final wcm wcmVarEo = eupVar53.eo();
                wbyVar.getClass();
                wbnVar.getClass();
                wmyVar.getClass();
                executor.getClass();
                wavVar.getClass();
                return wbnVar.a(vzs.c, new agux() { // from class: wfm
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        wmx wmxVar = wcmVarEo.a(str) ? new wmx(1) : new wmx(2);
                        Uri uriC = wmyVar.c(wmxVar, File.separator + "phenotype" + File.separator + str);
                        uriC.getClass();
                        return uriC;
                    }
                }, executor, yyrVar2, wfp.a, new wfq(wbyVar), new zvi() { // from class: wfn
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        return wavVar.a((String) obj);
                    }
                }, new agum() { // from class: wfo
                    @Override // defpackage.agum
                    public final Object a() {
                        return "";
                    }
                });
            case 499:
                return new wah(this.a.gk(), zcp.b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        zyh zyhVarB;
        int i = this.b;
        Boolean bool = false;
        switch (i) {
            case 500:
                return new wah(this.a.gl(), zcp.b);
            case 501:
                return new wah(this.a.gm(), zcp.b);
            case 502:
                return new wah(this.a.gn(), zcp.b);
            case 503:
                return new wah(this.a.go(), zcp.b);
            case 504:
                return new wah(this.a.gp(), zcp.b);
            case 505:
                eup eupVar = this.a;
                return new fpj((Context) eupVar.n.a(), (ujq) eupVar.ak.a(), (ScheduledExecutorService) eupVar.w.a(), yzq.t(eupVar.aE().a(), eupVar.aG().a(), eupVar.aI().a(), eupVar.aF(), eupVar.aH()));
            case 506:
                eup eupVar2 = this.a;
                return new gmq((Context) eupVar2.n.a(), eupVar2.i(), (agte) eupVar2.x.a(), (ahbt) eupVar2.q.a(), (hag) eupVar2.s.a(), eupVar2.ab(), (ztw) eupVar2.ao.a());
            case 507:
                eup eupVar3 = this.a;
                Context context = (Context) eupVar3.n.a();
                yqt yqtVar = (yqt) eupVar3.eo.a();
                String str = (String) eupVar3.cH.a();
                aejl aejlVar = eupVar3.ev;
                qun qunVarCU = eupVar3.cU();
                yqt.i((qsa) eupVar3.dS.a());
                ypv ypvVar = ypv.a;
                return new qvb(context, yqtVar, str, aejlVar, qunVarCU, ypvVar, ypvVar);
            case 508:
                return Boolean.valueOf(aexq.a.eV().d((Context) this.a.n.a()));
            case 509:
                return Boolean.valueOf(aexq.a.eV().c((Context) this.a.n.a()));
            case 510:
                return Boolean.valueOf(aexq.a.eV().b((Context) this.a.n.a()));
            case 511:
                return Boolean.valueOf(aexq.a.eV().e((Context) this.a.n.a()));
            case 512:
                eup eupVar4 = this.a;
                return new rdd(eupVar4.n, eupVar4.cE, eupVar4.iJ, eupVar4.iK, eupVar4.el, eupVar4.em);
            case 513:
                eup eupVar5 = this.a;
                Random random = (Random) eupVar5.df.a();
                rcq rcqVar = (rcq) eupVar5.iH.a();
                ztw ztwVar = (ztw) eupVar5.iI.a();
                random.getClass();
                return new rdg(random, rcqVar, ztwVar);
            case 514:
                Random random2 = (Random) this.a.df.a();
                random2.getClass();
                return new rcq(random2);
            case 515:
                return new ztw() { // from class: rcr
                    @Override // defpackage.ztw
                    public final Instant a() {
                        return Instant.ofEpochMilli(SystemClock.elapsedRealtime());
                    }
                };
            case 516:
                return true;
            case 517:
                qxj qxjVar = (qxj) qpc.a(ypv.a, new agow() { // from class: qor
                    @Override // defpackage.agow
                    public final Object a() {
                        return new qxi();
                    }
                });
                qxjVar.getClass();
                return qxjVar;
            case 518:
                return new qxp();
            case 519:
                zcp zcpVar = zcp.b;
                zcpVar.getClass();
                return yzq.o(zcpVar);
            case 520:
                return new rnz(this.a.fT());
            case 521:
                mep mepVar = mep.LOG_ERROR;
                mepVar.getClass();
                final yqt yqtVarI = yqt.i(mepVar);
                return new rog() { // from class: meo
                    @Override // defpackage.rog
                    public final void a() {
                        mep.d = (mep) ((yqz) yqtVarI).a;
                    }
                };
            case 522:
                wwr wwrVar = wwr.DISABLED;
                wwrVar.getClass();
                final yqt yqtVarI2 = yqt.i(wwrVar);
                final zcp zcpVar2 = zcp.b;
                return new rog() { // from class: wvj
                    @Override // defpackage.rog
                    public final void a() {
                        wws.a = (wwr) ((yqz) yqtVarI2).a;
                        wts.a = 3;
                        wwe.a = 1;
                        Set set = zcpVar2;
                        if (!set.isEmpty()) {
                            wum.r(yzq.o(set));
                        }
                        wtu.a = 3;
                    }
                };
            case 523:
                this.a.cT();
                return new rog() { // from class: qvc
                    @Override // defpackage.rog
                    public final void a() {
                        Boolean bool2 = false;
                        bool2.getClass();
                    }
                };
            case 524:
                eup eupVar6 = this.a;
                final Context context2 = (Context) eupVar6.n.a();
                final aejl aejlVar2 = eupVar6.iV;
                final zcp zcpVar3 = zcp.b;
                final yqt yqtVarI3 = yqt.i(eupVar6.eH());
                final rnw rnwVarDa = eupVar6.da();
                final ypv ypvVar2 = ypv.a;
                return new rog() { // from class: rob
                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yqi] */
                    @Override // defpackage.rog
                    public final void a() {
                        Set set = zcpVar3;
                        rnw rnwVar = rnwVarDa;
                        if (set.isEmpty() && !rnwVar.a()) {
                            Boolean bool2 = false;
                            bool2.getClass();
                            return;
                        }
                        agow agowVar = aejlVar2;
                        yqt yqtVar2 = yqtVarI3;
                        Application application = (Application) context2;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((yqz) yqtVar2).a.apply(new roc(application, yqtVar2, set, rnwVar, agowVar)));
                    }
                };
            case 525:
                eup eupVar7 = this.a;
                return yzq.r(eupVar7.d(), new wkt(), eupVar7.e());
            case 526:
                return new wfr();
            case 527:
                final Context context3 = (Context) this.a.n.a();
                return new rog() { // from class: wms
                    @Override // defpackage.rog
                    public final void a() {
                        udo udoVar = new udo(new udr());
                        udp udpVar = new udp(context3);
                        synchronized (udo.b) {
                            if (udp.a != null) {
                                return;
                            }
                            udp.a = udpVar;
                            if (udo.e == null) {
                                udo.e = new udt(null);
                            }
                            if (Security.insertProviderAt(udo.e, 1) != 1) {
                                throw new RuntimeException("Failed to install SslGuard with top priority.");
                            }
                            uds udsVar = udoVar.f;
                            uds udsVar2 = udv.a;
                            if (udsVar == null) {
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            udv.a = udsVar;
                            uds udsVar3 = udoVar.f;
                            uds udsVar4 = udu.a;
                            if (udsVar3 == null) {
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            udu.a = udsVar3;
                            Security.setProperty("ssl.SocketFactory.provider", udo.c);
                            Security.setProperty("ssl.ServerSocketFactory.provider", udo.d);
                            udoVar.a();
                            Log.i(udo.a, "SslGuard completed installation.");
                        }
                    }
                };
            case 528:
                wwr wwrVar2 = wwr.DISABLED;
                wwrVar2.getClass();
                final yqt yqtVarI4 = yqt.i(wwrVar2);
                final zcp zcpVar4 = zcp.b;
                return new rog() { // from class: wzh
                    @Override // defpackage.rog
                    public final void a() {
                        wws.a = (wwr) ((yqz) yqtVarI4).a;
                        Set set = zcpVar4;
                        if (!set.isEmpty()) {
                            wum.r(yzq.o(set));
                        }
                        wum.a = true;
                    }
                };
            case 529:
                Context context4 = (Context) this.a.n.a();
                context4.getClass();
                return new tmu(context4);
            case 530:
                return new tpw((Context) this.a.n.a());
            case 531:
                eup eupVar8 = this.a;
                return new tjg(eupVar8.jb, eupVar8.dJ());
            case 532:
                eup eupVar9 = this.a;
                return new tff(zcp.b, (ahbt) eupVar9.y.a(), (Context) eupVar9.n.a(), (vql) eupVar9.aU.a());
            case 533:
                eup eupVar10 = this.a;
                eupVar10.da();
                Optional optionalEmpty = Optional.empty();
                Optional.empty();
                return new whd(optionalEmpty, eupVar10.jS, eupVar10.jU, eupVar10.jV);
            case 534:
                eup eupVar11 = this.a;
                return new whc((Context) eupVar11.n.a(), eupVar11.da(), eupVar11.ga(), eupVar11.fK(), (zyg) eupVar11.w.a(), aejf.b(eupVar11.aX), eupVar11.ii, eupVar11.z);
            case 535:
                final vhn vhnVarDV = this.a.dV();
                return new wgx() { // from class: vht
                    @Override // defpackage.wgx
                    public final zyd a() {
                        vqi.d("com/google/apps/tiktok/account/data/AccountProviderModule", "getApplicationStartupListeners", 30, vhnVarDV.a(), "Failed account invalidation.", new Object[0]);
                        return zxy.a;
                    }
                };
            case 536:
                final Context context5 = (Context) this.a.n.a();
                return new wgx() { // from class: wmr
                    @Override // defpackage.wgx
                    public final zyd a() throws PackageManager.NameNotFoundException, IOException, ErrnoException {
                        Context context6 = context5;
                        try {
                            PackageInfo packageInfo = context6.getPackageManager().getPackageInfo(context6.getPackageName(), 0);
                            if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                                try {
                                    Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                                } catch (Exception e) {
                                    throw new IOException(e);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                        }
                        return zxy.a;
                    }
                };
            case 537:
                eup eupVar12 = this.a;
                final wav wavVar = (wav) eupVar12.f6if.a();
                final rnw rnwVarDa2 = eupVar12.da();
                wavVar.getClass();
                return new wgx() { // from class: wez
                    @Override // defpackage.wgx
                    public final zyd a() {
                        if (!wfc.a.a(rnwVarDa2)) {
                            return zxy.a;
                        }
                        zyd zydVarE = wavVar.e();
                        vqi.c(zydVarE, "Failed to obtain initial snapshot", new Object[0]);
                        return zydVarE;
                    }
                };
            case 538:
                eup eupVar13 = this.a;
                final rgy rgyVar = (rgy) eupVar13.N.a();
                final wev wevVarEs = eupVar13.es();
                final rnw rnwVarDa3 = eupVar13.da();
                rgyVar.getClass();
                return new wgx() { // from class: wfa
                    @Override // defpackage.wgx
                    public final zyd a() {
                        boolean zA = wfc.a.a(rnwVarDa3);
                        final wev wevVar = wevVarEs;
                        if (!zA) {
                            return zxy.a;
                        }
                        final wfb wfbVar = new wfb(rgyVar);
                        wvx wvxVarF = wzg.f("Registering packages with phenotype", wwb.a, true);
                        try {
                            yzq yzqVarKeySet = ((yyr) wevVar.f).keySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : yzqVarKeySet) {
                                Boolean bool2 = true;
                                bool2.getClass();
                                arrayList.add(obj);
                            }
                            ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                final String strA = wevVar.l.a((String) it.next());
                                final wex wexVar = wevVar.m;
                                zyd zydVarEN = wexVar.c.eN(wyo.i(new Callable() { // from class: wew
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        wex wexVar2 = wexVar;
                                        rnr rnrVarA = new rns(wexVar2.b).a(wexVar2.a.getPackageName());
                                        int i2 = yyk.e;
                                        yyf yyfVar = new yyf(4);
                                        zdl it2 = rnrVarA.b(rnrVarA.a).values().iterator();
                                        while (it2.hasNext()) {
                                            aagy aagyVarA = ((rnq) it2.next()).a();
                                            if (aagyVarA != null) {
                                                yyfVar.g(aagyVarA);
                                            }
                                        }
                                        yyk yykVarF = yyfVar.f();
                                        return (aagy) (yykVarF instanceof Collection ? zbk.f(yykVarF.listIterator(0), yyr.h(((zcg) yykVarF).d)) : zbk.f(yykVarF.listIterator(0), new yyn(4))).get(strA);
                                    }
                                }));
                                zydVarEN.getClass();
                                final agux aguxVar = new agux() { // from class: wem
                                    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
                                    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
                                    @Override // defpackage.agux
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object a(java.lang.Object r10) {
                                        /*
                                            r9 = this;
                                            wev r4 = r1
                                            r5 = r10
                                            aagy r5 = (defpackage.aagy) r5
                                            aehf r10 = r4.g
                                            java.lang.Object r10 = r10.a()
                                            java.util.Map r10 = (java.util.Map) r10
                                            java.lang.String r2 = r2
                                            java.lang.Object r10 = r10.get(r2)
                                            zvh r10 = (defpackage.zvh) r10
                                            aehf r0 = r4.h
                                            java.lang.Object r0 = r0.a()
                                            java.util.Map r0 = (java.util.Map) r0
                                            boolean r0 = r0.containsKey(r2)
                                            aehf r1 = r4.i
                                            java.lang.Object r1 = r1.a()
                                            java.util.Map r1 = (java.util.Map) r1
                                            boolean r1 = r1.containsKey(r2)
                                            r6 = 0
                                            r7 = 1
                                            if (r10 != 0) goto L38
                                            if (r0 != 0) goto L38
                                            if (r1 == 0) goto L36
                                            goto L38
                                        L36:
                                            r0 = r6
                                            goto L39
                                        L38:
                                            r0 = r7
                                        L39:
                                            if (r5 == 0) goto L68
                                            if (r0 != 0) goto L68
                                            agow r0 = r4.a     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4c
                                            java.lang.Object r0 = r0.a()     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4c
                                            rgy r0 = (defpackage.rgy) r0     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4c
                                            boolean r0 = r0.j()     // Catch: com.google.android.gms.common.GooglePlayServicesManifestException -> L4c
                                            if (r0 == 0) goto L68
                                            goto L54
                                        L4c:
                                            r0 = move-exception
                                            java.lang.String r1 = "MendelPackageState"
                                            java.lang.String r3 = "Failed to check if declarative registration is supported"
                                            android.util.Log.e(r1, r3, r0)
                                        L54:
                                            abxs r0 = r5.i
                                            r0.getClass()
                                            java.util.Set r1 = r4.e
                                            yzq r0 = defpackage.yye.b(r0)
                                            boolean r0 = r0.containsAll(r1)
                                            if (r0 == 0) goto L68
                                            zyd r10 = defpackage.zxy.a
                                            goto Ld5
                                        L68:
                                            r8 = 2
                                            if (r5 == 0) goto L7a
                                            int r0 = r5.c
                                            if (r0 != r8) goto L78
                                            java.lang.Object r0 = r5.d
                                            java.lang.Integer r0 = (java.lang.Integer) r0
                                            int r0 = r0.intValue()
                                            goto L7c
                                        L78:
                                            r3 = r6
                                            goto L7d
                                        L7a:
                                            int r0 = r4.d
                                        L7c:
                                            r3 = r0
                                        L7d:
                                            if (r10 == 0) goto L8a
                                            java.util.concurrent.Executor r0 = r4.b
                                            zvh r10 = defpackage.wyo.b(r10)
                                            zyd r10 = defpackage.zxn.l(r10, r0)
                                            goto L99
                                        L8a:
                                            r10 = 0
                                            if (r5 == 0) goto L95
                                            abvo r0 = r5.j
                                            if (r0 == 0) goto L95
                                            byte[] r10 = r0.B()
                                        L95:
                                            zyd r10 = defpackage.zxn.h(r10)
                                        L99:
                                            agvd r1 = r3
                                            wet r0 = new wet
                                            r0.<init>(r1, r2, r3, r4, r5)
                                            wel r1 = new wel
                                            r1.<init>()
                                            java.util.concurrent.Executor r0 = r4.b
                                            zvi r1 = defpackage.wyo.c(r1)
                                            zyd r10 = defpackage.zuz.h(r10, r1, r0)
                                            zyd[] r0 = new defpackage.zyd[r7]
                                            r0[r6] = r10
                                            xaa r0 = defpackage.xab.b(r0)
                                            wep r1 = new wep
                                            r1.<init>()
                                            zwk r2 = defpackage.zwk.a
                                            zyd r0 = r0.b(r1, r2)
                                            zyd[] r1 = new defpackage.zyd[r8]
                                            r1[r6] = r10
                                            r1[r7] = r0
                                            xaa r0 = defpackage.xab.d(r1)
                                            weq r1 = new weq
                                            r1.<init>()
                                            zyd r10 = r0.a(r1, r2)
                                        Ld5:
                                            return r10
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.wem.a(java.lang.Object):java.lang.Object");
                                    }
                                };
                                zyd zydVarH = zuz.h(zydVarEN, wyo.c(new zvi() { // from class: wen
                                    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                    @Override // defpackage.zvi
                                    public final zyd a(Object obj2) {
                                        return aguxVar.a(obj2);
                                    }
                                }), wevVar.b);
                                final agux aguxVar2 = new agux() { // from class: weo
                                    @Override // defpackage.agux
                                    public final Object a(Object obj2) {
                                        return ((wav) wevVar.c.a()).c(strA);
                                    }
                                };
                                zyd zydVarH2 = zuz.h(zydVarH, wyo.c(new zvi() { // from class: weu
                                    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
                                    @Override // defpackage.zvi
                                    public final /* synthetic */ zyd a(Object obj2) {
                                        return aguxVar2.a(obj2);
                                    }
                                }), zwk.a);
                                vqi.c(zydVarH2, "Failed to register for %s", strA);
                                arrayList2.add(zydVarH2);
                            }
                            zyd zydVarB = xab.a(arrayList2).b(new zvh() { // from class: wes
                                @Override // defpackage.zvh
                                public final zyd a() {
                                    zyd zydVarD = wevVar.k.f.d(false);
                                    yqi yqiVar = new yqi() { // from class: wer
                                        @Override // defpackage.yqi
                                        public final Object apply(Object obj2) {
                                            kfh kfhVar = (kfh) obj2;
                                            kfhVar.getClass();
                                            return Integer.valueOf(Log.w("RegisterInternal", "GMS Core version too old", kfhVar));
                                        }
                                    };
                                    zyd zydVarG = zud.g(zydVarD, kfh.class, wyo.a(yqiVar), zwk.a);
                                    vqi.c(zydVarG, "Failed to update StorageInfos after registration", new Object[0]);
                                    return zydVarG;
                                }
                            }, zwk.a);
                            wvxVarF.a(zydVarB);
                            aguc.a(wvxVarF, null);
                            return zydVarB;
                        } finally {
                        }
                    }
                };
            case 539:
                eup eupVar14 = this.a;
                return new tji(eupVar14.jh, eupVar14.dJ());
            case 540:
                eup eupVar15 = this.a;
                return new tdd((vhb) eupVar15.bc.a(), eupVar15.dD(), eupVar15.fO(), (ahbt) eupVar15.q.a());
            case 541:
                eup eupVar16 = this.a;
                return new tji(eupVar16.jN, eupVar16.dJ());
            case 542:
                eup eupVar17 = this.a;
                return new tew((pjn) eupVar17.jM.a(), (pgm) ((waa) eupVar17.P.a()).a("com.google.android.libraries.search.device", "45699793").b(), (pgm) ((waa) eupVar17.P.a()).a("com.google.android.libraries.search.device", "45699795").b(), (pgm) ((waa) eupVar17.P.a()).a("com.google.android.libraries.search.device", "45699794").b(), (pgm) ((waa) eupVar17.P.a()).a("com.google.android.libraries.search.device", "45699792").b());
            case 543:
                eup eupVar18 = this.a;
                Context context6 = (Context) eupVar18.n.a();
                zyg zygVar = (zyg) eupVar18.A.a();
                yyk yykVar = (yyk) eupVar18.jk.a();
                pks pksVar = (pks) eupVar18.jm.a();
                ueg uegVar = (ueg) eupVar18.af.a();
                qfg qfgVar = (qfg) eupVar18.ad.a();
                yqt yqtVarI5 = yqt.i((qfc) eupVar18.ae.a());
                yrp yrpVar = (yrp) eupVar18.jx.a();
                yqt yqtVarI6 = yqt.i((pkx) eupVar18.jy.a());
                pkv pkvVar = (pkv) eupVar18.jz.a();
                qfa qfaVar = (qfa) eupVar18.jA.a();
                pkn pknVar = (pkn) eupVar18.jB.a();
                ujq ujqVar = (ujq) eupVar18.ak.a();
                ypv ypvVar3 = ypv.a;
                return tex.a(context6, zygVar, yykVar, pksVar, uegVar, qfgVar, yqtVarI5, yrpVar, yqtVarI6, pkvVar, qfaVar, pknVar, ujqVar, ypvVar3, ypvVar3, (phg) eupVar18.jr.a(), ypvVar3, yqt.i(eupVar18.cQ()), eupVar18.jC, eupVar18.dF(), eupVar18.jL);
            case 544:
                yyk yykVarJ = yyk.j(new zdd((phe) this.a.jj.a()));
                yykVarJ.getClass();
                return yykVarJ;
            case 545:
                return new qfm();
            case 546:
                eup eupVar19 = this.a;
                return new qgi((ujk) eupVar19.jl.a(), (vtm) eupVar19.hU.a(), ypv.a);
            case 547:
                wnd wndVarK = wne.k();
                wnb wnbVar = (wnb) wndVarK;
                wnbVar.a = "TaskPeriods";
                wnbVar.b = yqt.i(new zvh() { // from class: qgj
                    @Override // defpackage.zvh
                    public final zyd a() {
                        return zxn.h("");
                    }
                });
                wndVarK.b(qfw.a);
                wne wneVarA = wndVarK.a();
                eup eupVar20 = this.a;
                return eupVar20.ez().a(wneVarA, (ueg) eupVar20.au.a());
            case 548:
                final Map mapGb = this.a.gb();
                yrp yrpVarA = yru.a(new yrp() { // from class: plm
                    @Override // defpackage.yrp
                    public final Object eV() {
                        plk plkVar = new plk();
                        for (Map.Entry entry : ((yyr) mapGb).entrySet()) {
                            String str2 = (String) entry.getKey();
                            plh plhVar = (plh) ((yrp) entry.getValue()).eV();
                            Map map = plkVar.a;
                            str2.getClass();
                            plhVar.getClass();
                            map.put(str2, plhVar);
                        }
                        return new pll(plkVar);
                    }
                });
                yrpVarA.getClass();
                return yrpVarA;
            case 549:
                eup eupVar21 = this.a;
                final ueg uegVar2 = (ueg) eupVar21.af.a();
                final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eupVar21.A.a();
                return new yrp() { // from class: plp
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return new plo(uegVar2, scheduledExecutorService);
                    }
                };
            case 550:
                eup eupVar22 = this.a;
                final Context context7 = (Context) eupVar22.n.a();
                final ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) eupVar22.A.a();
                final zyg zygVar2 = (zyg) eupVar22.A.a();
                final yrp yrpVarEJ = eupVar22.eJ();
                aejl aejlVar3 = eupVar22.js;
                aejlVar3.getClass();
                final tes tesVar = new tes(aejlVar3);
                final ueg uegVar3 = (ueg) eupVar22.af.a();
                final ujk ujkVar = (ujk) eupVar22.jt.a();
                final yqt yqtVarI7 = yqt.i((qfc) eupVar22.ae.a());
                final yqt yqtVarI8 = yqt.i(aejf.b(eupVar22.ju));
                final yqt yqtVarI9 = yqt.i(aejf.b(eupVar22.jv));
                final phg phgVar = (phg) eupVar22.jr.a();
                yrp yrpVarA2 = yru.a(new yrp() { // from class: pml
                    /* JADX WARN: Type inference failed for: r0v4, types: [aehf, java.lang.Object] */
                    @Override // defpackage.yrp
                    public final Object eV() {
                        ply plyVar = (ply) ((yqz) yqtVarI9.b(new yqi() { // from class: pmj
                            @Override // defpackage.yqi
                            public final Object apply(Object obj) {
                                return (ply) ((aehf) obj).a();
                            }
                        })).a;
                        jvc jvcVar = (jvc) ((yqz) yqtVarI8).a.a();
                        phg phgVar2 = phgVar;
                        long jP = phgVar2.p();
                        Context context8 = context7;
                        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService2;
                        jsn jsnVar = new jsn(context8, scheduledExecutorService3, jP);
                        jva jvaVar = new jva();
                        ujk ujkVar2 = ujkVar;
                        zyg zygVar3 = zygVar2;
                        ugw ugwVar = new ugw(ujkVar2, zygVar3);
                        juu juuVar = new juu();
                        juuVar.b = zygVar3;
                        juuVar.c = jsnVar;
                        int iG = phgVar2.g();
                        yqw.A(iG > 0);
                        juuVar.d = iG;
                        juuVar.e = jvaVar;
                        yqw.F(jvcVar.a().contains("https"), "Provided UrlEngine must support URL scheme: %s", "https");
                        Map map = juuVar.a;
                        yqw.F(true ^ map.containsKey("https"), "Requested scheme already has a UrlEngine registered: %s", "https");
                        map.put("https", jvcVar);
                        jux juxVar = new jux(juuVar);
                        pmk pmkVar = new pmk(yqtVarI7);
                        synchronized (juxVar.f) {
                            juxVar.b.put(pmkVar, new zyt(zygVar3));
                        }
                        return new plj((plh) yrpVarEJ.eV(), new pmc(juxVar, uegVar3, scheduledExecutorService3, ugwVar, plyVar), tesVar);
                    }
                });
                yrpVarA2.getClass();
                return yrpVarA2;
            case 551:
                eup eupVar23 = this.a;
                Object objA = eupVar23.jp.a();
                yzq yzqVarO = yzq.o(eupVar23.gy());
                ExperimentalCronetEngine experimentalCronetEngine = ((aatp) objA).a(false).a;
                Iterator it = yzqVarO.iterator();
                while (it.hasNext()) {
                    experimentalCronetEngine.addRequestFinishedListener((RequestFinishedInfo.Listener) it.next());
                }
                experimentalCronetEngine.getClass();
                return experimentalCronetEngine;
            case 552:
                eup eupVar24 = this.a;
                Context context8 = (Context) eupVar24.n.a();
                yzo yzoVarI = yzq.i(3);
                yzq yzqVarO2 = yzq.o(adlf.f.h);
                yzqVarO2.getClass();
                yzq yzqVarO3 = yzq.o(yzqVarO2);
                yqn yqnVar = aawo.a;
                yzo yzoVar = new yzo();
                Iterator it2 = yzqVarO3.iterator();
                while (it2.hasNext()) {
                    yzoVar.c(new aati((String) it2.next()));
                }
                yzq yzqVarF = yzoVar.f();
                yzqVarF.getClass();
                yzoVarI.i(yzqVarF);
                yzoVarI.i(agqj.p(new aatm[]{new aati("www.google.com"), new aati("history.google.com"), new aati("android.googleapis.com"), new aati("lens-pa.googleapis.com"), new aati("www.gstatic.com"), new aati("speechs3proto2-pa.googleapis.com")}));
                yzq yzqVar = aatn.a;
                yzqVar.getClass();
                yzoVarI.i(yzqVar);
                yzq yzqVarF2 = yzoVarI.f();
                zcp zcpVar5 = zcp.b;
                yqt yqtVarI10 = yqt.i(eupVar24.eR());
                aejl aejlVar4 = eupVar24.jo;
                aejg aejgVar = aejn.a;
                return new aatp(context8, yzqVarF2, zcpVar5, yqtVarI10, aejlVar4, aejgVar, aejgVar, yqt.i(Boolean.valueOf(((waa) eupVar24.P.a()).a("com.google.android.libraries.search.device", "45646052").d())));
            case 553:
                return new pkm();
            case 554:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45660356").d());
            case 555:
                eup eupVar25 = this.a;
                ujq ujqVar2 = (ujq) eupVar25.ak.a();
                Context context9 = (Context) eupVar25.n.a();
                int i2 = uem.b;
                uel uelVar = new uel(context9);
                uem.b("datadownloadmanifest");
                uelVar.c = "datadownloadmanifest";
                uelVar.b("datadownload");
                Uri uriBuild = uelVar.a().buildUpon().appendPath("download_metadata.pb").build();
                ujl ujlVarH = ujm.h();
                ujlVarH.e(uriBuild);
                ujlVarH.d(plu.a);
                ujk ujkVarA = ujqVar2.a(ujlVarH.a());
                ujkVarA.getClass();
                return ujkVarA;
            case 556:
                eup eupVar26 = this.a;
                return new jte((CronetEngine) aejf.b(eupVar26.jq).a(), (ScheduledExecutorService) eupVar26.A.a());
            case 557:
                return new ply(new plq());
            case 558:
                return new pkx((Context) this.a.n.a());
            case 559:
                return new pkv((Context) this.a.n.a());
            case 560:
                return new qfa((Context) this.a.n.a());
            case 561:
                eup eupVar27 = this.a;
                return new qfn();
            case 562:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45624378").d());
            case 563:
                eup eupVar28 = this.a;
                return new tgf("Pseudonymous", eupVar28.db(), new tgv(eupVar28.dI(), (tgm) eupVar28.jJ.a()), zcl.a);
            case 564:
                eup eupVar29 = this.a;
                Executor executor = (Executor) eupVar29.m.a();
                mcw mcwVar = (mcw) eupVar29.i.a();
                Context context10 = (Context) eupVar29.n.a();
                tjf.a.a(Optional.empty());
                return new ths(executor, mcwVar, context10, eupVar29.dG());
            case 565:
                return new tgu(this.a.fw);
            case 566:
                return new tht((AtomicReference) this.a.jF.a());
            case 567:
                return new AtomicReference(Optional.empty());
            case 568:
                return new thm(this.a.q);
            case 569:
                return new thh();
            case 570:
                return this.a.dH().a(new thi());
            case 571:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45626387").d());
            case 572:
                eup eupVar30 = this.a;
                return new wqh(eupVar30.jQ, ((Boolean) eupVar30.aO.a()).booleanValue());
            case 573:
                eup eupVar31 = this.a;
                boolean zBooleanValue = ((Boolean) eupVar31.aO.a()).booleanValue();
                aejl aejlVar5 = eupVar31.hY;
                aejl aejlVar6 = eupVar31.jP;
                if (true != zBooleanValue) {
                    aejlVar5 = aejlVar6;
                }
                woh wohVar = (woh) aejlVar5.a();
                wohVar.getClass();
                return wohVar;
            case 574:
                return new wog();
            case 575:
                eup eupVar32 = this.a;
                return new wig((Context) eupVar32.n.a(), eupVar32.da(), (ExecutorService) eupVar32.m.a(), (zyh) eupVar32.w.a(), eupVar32.a(), eupVar32.ga(), eupVar32.fK(), aejf.b(eupVar32.jT));
            case 576:
                eup eupVar33 = this.a;
                Context context11 = (Context) eupVar33.n.a();
                uov uovVarDQ = eupVar33.dQ();
                context11.getClass();
                uqe uqeVar = wig.a;
                String strB = rnu.b();
                strB.getClass();
                return uovVarDQ.a("StartupAfterPackageReplacedImplDatabase_".concat(new agyu("[^A-Za-z0-9\\-_:]").a(strB, "_")), wig.a);
            case 577:
                return new vsy((Executor) this.a.A.a());
            case 578:
                eup eupVar34 = this.a;
                return new mez((zyh) eupVar34.m.a(), (zyh) eupVar34.A.a(), Optional.empty());
            case 579:
                eup eupVar35 = this.a;
                return yzq.r((zgx) eupVar35.kd.a(), (zgx) eupVar35.ke.a(), (zgx) eupVar35.kg.a());
            case 580:
                eup eupVar36 = this.a;
                Context context12 = (Context) eupVar36.n.a();
                Object objA2 = eupVar36.kc.a();
                kak kakVar = (kak) eupVar36.aq.a();
                final aehf aehfVarB = aejf.b(eupVar36.jZ);
                final aehf aehfVarB2 = aejf.b(eupVar36.fw);
                aehfVarB.getClass();
                agow agowVar = new agow() { // from class: wjq
                    @Override // defpackage.agow
                    public final Object a() {
                        return (ges) aehfVarB.a();
                    }
                };
                aehfVarB2.getClass();
                final aaxf aaxfVar = new aaxf(context12, (wjv) objA2, kakVar, agowVar, new agow() { // from class: wjr
                    @Override // defpackage.agow
                    public final Object a() {
                        return (String) aehfVarB2.a();
                    }
                });
                return new zgx() { // from class: wjs
                    @Override // defpackage.zgx
                    public final zft a(String str2) {
                        return aaxfVar;
                    }
                };
            case 581:
                eup eupVar37 = this.a;
                return new wjv((aaxi) eupVar37.ka.a(), aejf.b(eupVar37.bf), (wju) eupVar37.kb.a());
            case 582:
                eup eupVar38 = this.a;
                Context context13 = (Context) eupVar38.n.a();
                final aehf aehfVarB3 = aejf.b(eupVar38.jZ);
                aehfVarB3.getClass();
                agow agowVar2 = new agow() { // from class: wjq
                    @Override // defpackage.agow
                    public final Object a() {
                        return (ges) aehfVarB3.a();
                    }
                };
                bool.getClass();
                return new aaxi(context13, agowVar2);
            case 583:
                return new Object() { // from class: ges
                };
            case 584:
                return new wju();
            case 585:
                ((Context) this.a.n.a()).getClass();
                zhi zhiVar = zhk.c;
                String strB2 = rnu.b();
                if (strB2 == null) {
                    strB2 = "";
                }
                int iU = agyv.u(strB2, ".");
                if (iU != -1) {
                    strB2 = strB2.substring(iU + 1, strB2.length());
                    strB2.getClass();
                }
                zhi zhiVar2 = new zhi(agyv.g(strB2, ":", "_").concat("_"), zhiVar.b, zhiVar.c, zhiVar.d, zhiVar.e, zhiVar.f, zhiVar.g);
                zhi zhiVar3 = new zhi(zhiVar2.a, false, zhiVar2.c, zhiVar2.d, zhiVar2.e, zhiVar2.f, zhiVar2.g);
                zhi zhiVar4 = new zhi(zhiVar3.a, zhiVar3.b, zfs.NO_OP, zhiVar3.d, zhiVar3.e, zhiVar3.f, zhiVar3.g);
                return new zhi(zhiVar4.a, zhiVar4.b, zhiVar4.c, zhiVar4.d, true, zhiVar4.f, zhiVar4.g);
            case 586:
                return new qrt((qru) this.a.kf.a());
            case 587:
                return new qru((qsa) this.a.dS.a());
            case 588:
                return new zdd(this.a.fD());
            case 589:
                return Boolean.valueOf(((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45401347").d());
            case 590:
                return new ezn(this.a.r());
            case 591:
                aepi aepiVarFq = this.a.fq();
                Boolean bool2 = (Boolean) aepi.a.d(5, "45545480", false).eX(aepiVarFq.b, aepiVarFq.c);
                bool2.booleanValue();
                return bool2;
            case 592:
                return Long.valueOf(((waa) new aekh(this.a.P).a.a()).a("com.google.android.katniss.device", "45648257").a());
            case 593:
                eup eupVar39 = this.a;
                return new gae((fda) eupVar39.fS.a(), (Context) eupVar39.n.a(), (ahbt) eupVar39.q.a(), (fjn) eupVar39.bD.a(), eupVar39.aJ(), eupVar39.at(), eupVar39.aP(), (gtu) eupVar39.bE.a(), eupVar39.gl);
            case 594:
                eup eupVar40 = this.a;
                return new oye(eupVar40.cM(), (Optional) ((aejh) eupVar40.kG).b, ouz.a.a(Optional.empty()));
            case 595:
                eup eupVar41 = this.a;
                Context context14 = (Context) eupVar41.n.a();
                oun ounVar = (oun) eupVar41.kt.a();
                ouk oukVar = (ouk) eupVar41.kz.a();
                aejl aejlVar7 = eupVar41.jq;
                List list = (List) eupVar41.kA.a();
                zcp zcpVar6 = zcp.b;
                return new owe(context14, ounVar, oukVar, aejlVar7, list, zcpVar6, ouz.a.a(Optional.empty()));
            case 596:
                return new oun(this.a.cL());
            case 597:
                eup eupVar42 = this.a;
                return new ovj((Context) eupVar42.n.a(), (Executor) eupVar42.kp.a());
            case 598:
                eup eupVar43 = this.a;
                boolean zBooleanValue2 = ((Boolean) eupVar43.ko.a()).booleanValue();
                aejl aejlVar8 = eupVar43.m;
                aejlVar8.getClass();
                if (zBooleanValue2) {
                    Object objA3 = aejlVar8.a();
                    objA3.getClass();
                    zyhVarB = (zyh) objA3;
                } else {
                    zyw zywVar = new zyw();
                    zywVar.b("GhaLightweightThread-%d");
                    zyhVarB = zyn.b(Executors.newScheduledThreadPool(2, zyw.a(zywVar)));
                    zyhVarB.getClass();
                }
                zyhVarB.getClass();
                return zyhVarB;
            case 599:
                Boolean bool3 = (Boolean) agwl.a(Optional.empty(), bool);
                bool3.booleanValue();
                return bool3;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        Object jhhVar;
        int i = this.b;
        switch (i) {
            case 600:
                eup eupVar = this.a;
                return new oum(eupVar.aN(), (oun) eupVar.kt.a(), (oty) eupVar.kx.a(), new ouh(), (oug) eupVar.ky.a(), out.b());
            case 601:
                eup eupVar2 = this.a;
                Context context = (Context) eupVar2.n.a();
                SharedPreferences sharedPreferences = (SharedPreferences) eupVar2.ku.a();
                SharedPreferences sharedPreferences2 = (SharedPreferences) eupVar2.kv.a();
                return new oub(context, sharedPreferences, sharedPreferences2);
            case 602:
                return gaj.b((Context) this.a.n.a());
            case 603:
                return gak.b((Context) this.a.n.a());
            case 604:
                return new oug((Context) this.a.n.a());
            case 605:
                return owh.b(Optional.empty());
            case 606:
                eup eupVar3 = this.a;
                return ouu.b(((Boolean) eupVar3.ko.a()).booleanValue(), eupVar3.cK(), eupVar3.aR);
            case 607:
                return ouv.b();
            case 608:
                return new owg((mcw) this.a.i.a());
            case 609:
                eup eupVar4 = this.a;
                return new oym(eupVar4.kJ, aejn.b(), eupVar4.kK);
            case 610:
                return new oxn((SharedPreferences) this.a.kv.a());
            case 611:
                return yzq.o(ozs.b());
            case 612:
                return new ozx((SharedPreferences) this.a.kv.a());
            case 613:
                return new ozr((SharedPreferences) this.a.kv.a());
            case 614:
                return new ozt((Context) this.a.n.a());
            case 615:
                return ozq.b();
            case 616:
                eup eupVar5 = this.a;
                return ous.b(((Boolean) eupVar5.ko.a()).booleanValue(), eupVar5.aR);
            case 617:
                eup eupVar6 = this.a;
                return our.b(((Boolean) eupVar6.ko.a()).booleanValue(), eupVar6.w);
            case 618:
                return new isb(this.a.gB());
            case 619:
                eup eupVar7 = this.a;
                return fck.b((Context) eupVar7.n.a(), eupVar7.bb(), (gfr) eupVar7.cu.a(), (gmd) eupVar7.eV.a(), (fcu) eupVar7.fb.a(), (ghp) eupVar7.ar.a(), (ghr) eupVar7.fg.a(), eupVar7.A());
            case 620:
                return Boolean.valueOf(aeoj.b(this.a.fk()));
            case 621:
                return aeok.b(this.a.fk());
            case 622:
                eup eupVar8 = this.a;
                return new gor((Context) eupVar8.n.a(), eupVar8.ee());
            case 623:
                return aeol.b(this.a.fk());
            case 624:
                eup eupVar9 = this.a;
                AccessibilityManager accessibilityManagerU = eupVar9.u();
                ActivityManager activityManager = (ActivityManager) eupVar9.V.a();
                fbj fbjVar = (fbj) eupVar9.kZ.a();
                jmi jmiVar = (jmi) eupVar9.la.a();
                jlr jlrVar = (jlr) eupVar9.U.a();
                aejl aejlVar = eupVar9.lb;
                Supplier supplierGJ = eupVar9.gJ();
                zyg zygVar = (zyg) eupVar9.lc.a();
                hxu hxuVar = (hxu) eupVar9.le.a();
                AudioManager audioManagerO = eupVar9.o();
                aejl aejlVar2 = eupVar9.lf;
                jmu jmuVar = (jmu) eupVar9.gm.a();
                Context context2 = (Context) eupVar9.n.a();
                agte agteVar = (agte) eupVar9.x.a();
                ahbt ahbtVar = (ahbt) eupVar9.q.a();
                aejl aejlVar3 = eupVar9.lg;
                jhr jhrVar = (jhr) eupVar9.lR.a();
                gpb gpbVar = (gpb) eupVar9.gD.a();
                jcv jcvVar = (jcv) eupVar9.gE.a();
                boolean zHd = eupVar9.hd();
                aejl aejlVar4 = eupVar9.lS;
                aejl aejlVar5 = eupVar9.lT;
                aejl aejlVar6 = eupVar9.lU;
                aejl aejlVar7 = eupVar9.lV;
                aejl aejlVar8 = eupVar9.lW;
                aejl aejlVar9 = eupVar9.lX;
                aejl aejlVar10 = eupVar9.lY;
                aejl aejlVar11 = eupVar9.lZ;
                aejl aejlVar12 = eupVar9.ma;
                gph gphVarBj = eupVar9.bj();
                aejl aejlVar13 = eupVar9.kk;
                jhv jhvVar = (jhv) eupVar9.gk.a();
                aejl aejlVar14 = eupVar9.mb;
                gyh gyhVarBH = eupVar9.bH();
                boolean zHf = eupVar9.hf();
                fjx fjxVar = (fjx) eupVar9.gs.a();
                Supplier supplierGK = eupVar9.gK();
                jcy jcyVar = (jcy) eupVar9.gx.a();
                jru jruVarCB = eupVar9.cB();
                gyy gyyVar = (gyy) eupVar9.fX.a();
                glk glkVar = (glk) eupVar9.gF.a();
                gtu gtuVar = (gtu) eupVar9.bE.a();
                gfr gfrVar = (gfr) eupVar9.cu.a();
                exz exzVar = (exz) eupVar9.gG.a();
                aehf aehfVarB = aejf.b(eupVar9.mu);
                ick ickVar = (ick) eupVar9.mj.a();
                icj icjVarBY = eupVar9.bY();
                gmd gmdVar = (gmd) eupVar9.eV.a();
                aejl aejlVar15 = eupVar9.mM;
                Object objA = eupVar9.mN.a();
                jhhVar = new jhh(accessibilityManagerU, activityManager, fbjVar, jmiVar, jlrVar, aejlVar, supplierGJ, zygVar, hxuVar, audioManagerO, aejlVar2, jmuVar, context2, agteVar, ahbtVar, aejlVar3, jhrVar, gpbVar, jcvVar, zHd, aejlVar4, aejlVar5, aejlVar6, aejlVar7, aejlVar8, aejlVar9, aejlVar10, aejlVar11, aejlVar12, gphVarBj, aejlVar13, eupVar9.bD, jhvVar, aejlVar14, gyhVarBH, zHf, fjxVar, supplierGK, jcyVar, jruVarCB, gyyVar, glkVar, gtuVar, eupVar9.cp, gfrVar, exzVar, aehfVarB, ickVar, icjVarBY, gmdVar, aejlVar15, (LibAAudioManager) objA, eupVar9.mQ, (jma) eupVar9.gS.a(), eupVar9.mS, (fxu) eupVar9.t.a(), eupVar9.mT, eupVar9.mU, (fki) eupVar9.fL.a(), eupVar9.mV, eupVar9.hn(), eupVar9.fM, eupVar9.mW, eupVar9.bt(), eupVar9.mn, (fex) eupVar9.cr.a(), eupVar9.lv, eupVar9.cz(), (lzb) eupVar9.gZ.a(), eupVar9.mX, eupVar9.mL, eupVar9.mY, eupVar9.mZ, (iyj) eupVar9.mA.a(), eupVar9.ab(), (jml) eupVar9.na.a(), (ztw) eupVar9.ao.a(), (gvy) eupVar9.hn.a(), (ghr) eupVar9.fg.a(), eupVar9.gO(), eupVar9.nb, eupVar9.bE(), eupVar9.nc, (WindowManager) eupVar9.cn.a(), (fbn) eupVar9.nd.a());
                break;
            case 625:
                eup eupVar10 = this.a;
                return new fbj((Context) eupVar10.n.a(), (lzb) eupVar10.gZ.a(), (ghr) eupVar10.fg.a(), (jca) eupVar10.ft.a());
            case 626:
                eup eupVar11 = this.a;
                return new jmi((ahbt) eupVar11.q.a(), eupVar11.I(), (fxu) eupVar11.t.a(), (gtu) eupVar11.bE.a(), (hab) eupVar11.fe.a());
            case 627:
                return new AssistantManagerNative();
            case 628:
                return jie.b();
            case 629:
                eup eupVar12 = this.a;
                return new hxu(eupVar12.ld, eupVar12.eL(), (ghr) eupVar12.fg.a());
            case 630:
                return aems.b(this.a.fe());
            case 631:
                return jic.b((Context) this.a.n.a());
            case 632:
                return Boolean.valueOf(aemf.b(this.a.fd()));
            case 633:
                eup eupVar13 = this.a;
                jlr jlrVar2 = (jlr) eupVar13.U.a();
                Set setGz = eupVar13.gz();
                Context context3 = (Context) eupVar13.n.a();
                agte agteVar2 = (agte) eupVar13.p.a();
                aejl aejlVar16 = eupVar13.lm;
                jhs jhsVar = (jhs) eupVar13.ln.a();
                gph gphVarBj2 = eupVar13.bj();
                boolean zBooleanValue = ((Boolean) eupVar13.gq.a()).booleanValue();
                gtu gtuVar2 = (gtu) eupVar13.bE.a();
                icj icjVarBY2 = eupVar13.bY();
                NotificationManager notificationManagerF = eupVar13.f();
                jhz jhzVar = (jhz) eupVar13.lu.a();
                fex fexVar = (fex) eupVar13.cr.a();
                lzb lzbVar = (lzb) eupVar13.gZ.a();
                wxc wxcVar = (wxc) eupVar13.ii.a();
                ghp ghpVar = (ghp) eupVar13.ar.a();
                ghr ghrVar = (ghr) eupVar13.fg.a();
                return new jhr(jlrVar2, setGz, context3, agteVar2, eupVar13.ck, aejlVar16, jhsVar, gphVarBj2, zBooleanValue, gtuVar2, eupVar13.cp, icjVarBY2, notificationManagerF, jhzVar, fexVar, lzbVar, wxcVar, ghpVar, ghrVar);
            case 634:
                eup eupVar14 = this.a;
                return new gyd(eupVar14.cE(), (ztw) eupVar14.ao.a());
            case 635:
                return Boolean.valueOf(aemz.b(this.a.fg()));
            case 636:
                return Boolean.valueOf(aekc.b(this.a.eV()));
            case 637:
                return new fad();
            case 638:
                return Boolean.valueOf(aejx.b(this.a.eU()));
            case 639:
                return Boolean.valueOf(aemq.b(this.a.fe()));
            case 640:
                eup eupVar15 = this.a;
                return new jht(eupVar15.bj(), (gzu) eupVar15.R.a(), (gtu) eupVar15.bE.a(), eupVar15.bg(), eupVar15.p(), (hab) eupVar15.fe.a(), eupVar15.k(), (fex) eupVar15.cr.a());
            case 641:
                eup eupVar16 = this.a;
                aejl aejlVar17 = eupVar16.lo;
                fby fbyVar = (fby) eupVar16.hh.a();
                fiu fiuVar = (fiu) eupVar16.eY.a();
                ahbt ahbtVar2 = (ahbt) eupVar16.q.a();
                aejl aejlVar18 = eupVar16.cu;
                aejl aejlVar19 = eupVar16.lm;
                gfr gfrVar2 = (gfr) aejlVar18.a();
                gph gphVarBj3 = eupVar16.bj();
                gzu gzuVar = (gzu) eupVar16.R.a();
                exl exlVarC = eupVar16.C();
                eyx eyxVar = (eyx) eupVar16.hj.a();
                gtu gtuVar3 = (gtu) eupVar16.bE.a();
                glq glqVarBc = eupVar16.bc();
                gmd gmdVar2 = (gmd) eupVar16.eV.a();
                aejl aejlVar20 = eupVar16.fM;
                gof gofVar = (gof) eupVar16.S.a();
                aejl aejlVar21 = eupVar16.cr;
                PackageManager packageManagerK = eupVar16.k();
                aejl aejlVar22 = eupVar16.lp;
                aejl aejlVar23 = eupVar16.go;
                fex fexVar2 = (fex) aejlVar21.a();
                jnr jnrVar = (jnr) eupVar16.ls.a();
                ztw ztwVar = (ztw) eupVar16.ao.a();
                ghr ghrVar2 = (ghr) eupVar16.fg.a();
                return new grt(aejlVar17, fbyVar, fiuVar, ahbtVar2, eupVar16.ck, aejlVar19, eupVar16.cp, gfrVar2, gphVarBj3, gzuVar, exlVarC, eyxVar, gtuVar3, glqVarBc, gmdVar2, aejlVar20, gofVar, packageManagerK, aejlVar22, aejlVar23, fexVar2, jnrVar, ztwVar, ghrVar2);
            case 642:
                return Boolean.valueOf(aejw.b(this.a.eU()));
            case 643:
                return aemw.b(this.a.ff());
            case 644:
                eup eupVar17 = this.a;
                return new jnw(eupVar17.lq, (gzu) eupVar17.R.a(), (gfr) eupVar17.cu.a(), eupVar17.cp, eupVar17.fM, (jny) eupVar17.lr.a());
            case 645:
                return Boolean.valueOf(aeot.b(this.a.fl()));
            case 646:
                return jnz.b((Context) this.a.n.a());
            case 647:
                eup eupVar18 = this.a;
                return new jhz(eupVar18.cp, (gfr) eupVar18.cu.a(), eupVar18.bc(), (gmd) eupVar18.eV.a(), eupVar18.fM, (gmu) eupVar18.gd.a(), (ghr) eupVar18.fg.a());
            case 648:
                return Boolean.valueOf(aeki.b(this.a.eW()));
            case 649:
                return vwf.b((agte) this.a.fR.a());
            case 650:
                return Boolean.valueOf(aekx.b(this.a.eX()));
            case 651:
                eup eupVar19 = this.a;
                return new jjc((agte) eupVar19.fR.a(), eupVar19.hg, eupVar19.bj(), (lzb) eupVar19.gZ.a());
            case 652:
                eup eupVar20 = this.a;
                eyw eywVar = (eyw) eupVar20.T.a();
                fby fbyVar2 = (fby) eupVar20.hh.a();
                aejl aejlVar24 = eupVar20.Q;
                Context context4 = (Context) eupVar20.n.a();
                jna jnaVar = (jna) eupVar20.lz.a();
                agte agteVar3 = (agte) eupVar20.p.a();
                ahbt ahbtVar3 = (ahbt) eupVar20.y.a();
                aejl aejlVar25 = eupVar20.hg;
                jhs jhsVar2 = (jhs) eupVar20.ln.a();
                gph gphVarBj4 = eupVar20.bj();
                faz fazVarJ = eupVar20.J();
                grh grhVarBo = eupVar20.bo();
                gkm gkmVar = (gkm) eupVar20.fO.a();
                gkp gkpVar = (gkp) eupVar20.fQ.a();
                gof gofVar2 = (gof) eupVar20.S.a();
                aejl aejlVar26 = eupVar20.lD;
                jhz jhzVar2 = (jhz) eupVar20.lu.a();
                iru iruVarCi = eupVar20.ci();
                lzb lzbVar2 = (lzb) eupVar20.gZ.a();
                return new jkx(eywVar, fbyVar2, aejlVar24, context4, jnaVar, agteVar3, ahbtVar3, eupVar20.ck, aejlVar25, jhsVar2, gphVarBj4, eupVar20.cp, fazVarJ, grhVarBo, gkmVar, gkpVar, gofVar2, aejlVar26, jhzVar2, iruVarCi, lzbVar2);
            case 653:
                return new jna();
            case 654:
                eup eupVar21 = this.a;
                return fhf.b(eupVar21.lA, eupVar21.lB, eupVar21.am);
            case 655:
                return new fhe(this.a.x());
            case 656:
                eup eupVar22 = this.a;
                return new fhb((Context) eupVar22.n.a(), (ujq) eupVar22.ak.a());
            case 657:
                eup eupVar23 = this.a;
                ahbt ahbtVar4 = (ahbt) eupVar23.q.a();
                aejl aejlVar27 = eupVar23.bE;
                exl exlVarC2 = eupVar23.C();
                gtu gtuVar4 = (gtu) aejlVar27.a();
                gfr gfrVar3 = (gfr) eupVar23.cu.a();
                gmd gmdVar3 = (gmd) eupVar23.eV.a();
                irq irqVarCh = eupVar23.ch();
                fgx fgxVar = (fgx) eupVar23.lC.a();
                ghr ghrVar3 = (ghr) eupVar23.fg.a();
                jca jcaVar = (jca) eupVar23.ft.a();
                return new grz(ahbtVar4, eupVar23.ck, exlVarC2, gtuVar4, eupVar23.cp, gfrVar3, gmdVar3, irqVarCh, fgxVar, ghrVar3, jcaVar);
            case 658:
                return aenj.b(this.a.fi());
            case 659:
                eup eupVar24 = this.a;
                ActivityManager activityManager2 = (ActivityManager) eupVar24.V.a();
                aejl aejlVar28 = eupVar24.hh;
                fiu fiuVar2 = (fiu) eupVar24.eY.a();
                jlr jlrVar3 = (jlr) eupVar24.U.a();
                Supplier supplierGJ2 = eupVar24.gJ();
                fba fbaVar = (fba) eupVar24.lG.a();
                Context context5 = (Context) eupVar24.n.a();
                agte agteVar4 = (agte) eupVar24.x.a();
                agte agteVar5 = (agte) eupVar24.fR.a();
                euk eukVar = (euk) eupVar24.cj.a();
                joc jocVar = (joc) eupVar24.lH.a();
                fry fryVarAp = eupVar24.ap();
                Supplier supplierGI = eupVar24.gI();
                jhs jhsVar3 = (jhs) eupVar24.ln.a();
                gph gphVarBj5 = eupVar24.bj();
                gzu gzuVar2 = (gzu) eupVar24.R.a();
                hxv hxvVar = (hxv) eupVar24.bT.a();
                aejl aejlVar29 = eupVar24.bE;
                exl exlVarC3 = eupVar24.C();
                gtu gtuVar5 = (gtu) aejlVar29.a();
                jmc jmcVar = (jmc) eupVar24.lI.a();
                aejl aejlVar30 = eupVar24.cr;
                jbc jbcVarCt = eupVar24.ct();
                aejl aejlVar31 = eupVar24.go;
                fex fexVar3 = (fex) aejlVar30.a();
                iru iruVarCi2 = eupVar24.ci();
                lzb lzbVar3 = (lzb) eupVar24.gZ.a();
                gsl gslVarBp = eupVar24.bp();
                fbf fbfVar = (fbf) eupVar24.lO.a();
                aejl aejlVar32 = eupVar24.lP;
                jhhVar = new jlp(activityManager2, aejlVar28, fiuVar2, jlrVar3, supplierGJ2, fbaVar, context5, agteVar4, agteVar5, eukVar, jocVar, fryVarAp, supplierGI, eupVar24.ck, jhsVar3, gphVarBj5, gzuVar2, hxvVar, exlVarC3, gtuVar5, eupVar24.cp, jmcVar, jbcVarCt, aejlVar31, fexVar3, iruVarCi2, lzbVar3, gslVarBp, fbfVar, aejlVar32);
                break;
            case 660:
                return new fba(this.a.K());
            case 661:
                return new joc();
            case 662:
                return new jmc();
            case 663:
                return aelr.b(this.a.fa());
            case 664:
                return Long.valueOf(aels.b(this.a.fa()));
            case 665:
                eup eupVar25 = this.a;
                return new fbf((ixj) eupVar25.lM.a(), (iyh) eupVar25.lN.a());
            case 666:
                eup eupVar26 = this.a;
                return new ixp((Context) eupVar26.n.a(), (agte) eupVar26.x.a(), (ahbt) eupVar26.q.a(), eupVar26.ck(), (ghp) eupVar26.ar.a());
            case 667:
                eup eupVar27 = this.a;
                return iyi.b((Context) eupVar27.n.a(), (Executor) eupVar27.w.a());
            case 668:
                return new iyh((ztw) this.a.ao.a());
            case 669:
                return Boolean.valueOf(aemm.b(this.a.fd()));
            case 670:
                return Boolean.valueOf(aemg.b(this.a.fd()));
            case 671:
                return Boolean.valueOf(aemh.b(this.a.fd()));
            case 672:
                return Boolean.valueOf(aemi.b(this.a.fd()));
            case 673:
                return Boolean.valueOf(aela.b(this.a.eY()));
            case 674:
                return Boolean.valueOf(aemr.b(this.a.fe()));
            case 675:
                return Boolean.valueOf(aelg.b(this.a.eZ()));
            case 676:
                return Boolean.valueOf(aemj.b(this.a.fd()));
            case 677:
                return Boolean.valueOf(aemk.b(this.a.fd()));
            case 678:
                return Boolean.valueOf(aelh.b(this.a.eZ()));
            case 679:
                return Long.valueOf(aeme.b(this.a.fd()));
            case 680:
                eup eupVar28 = this.a;
                ActivityManager activityManager3 = (ActivityManager) eupVar28.V.a();
                eyw eywVar2 = (eyw) eupVar28.T.a();
                jdt jdtVar = (jdt) eupVar28.mc.a();
                hxu hxuVar2 = (hxu) eupVar28.le.a();
                Context context6 = (Context) eupVar28.n.a();
                jna jnaVar2 = (jna) eupVar28.lz.a();
                aejl aejlVar33 = eupVar28.lg;
                aejl aejlVar34 = eupVar28.fA;
                aejl aejlVar35 = eupVar28.md;
                jcv jcvVar2 = (jcv) eupVar28.gE.a();
                gxn gxnVar = (gxn) eupVar28.me.a();
                jhs jhsVar4 = (jhs) eupVar28.ln.a();
                gph gphVarBj6 = eupVar28.bj();
                jbu jbuVar = (jbu) eupVar28.mf.a();
                gzu gzuVar3 = (gzu) eupVar28.R.a();
                hxv hxvVar2 = (hxv) eupVar28.bT.a();
                aejl aejlVar36 = eupVar28.cu;
                aejl aejlVar37 = eupVar28.mg;
                boolean zHf2 = eupVar28.hf();
                Supplier supplierGK2 = eupVar28.gK();
                gfr gfrVar4 = (gfr) aejlVar36.a();
                glq glqVarBc2 = eupVar28.bc();
                aejl aejlVar38 = eupVar28.mH;
                gmd gmdVar4 = (gmd) eupVar28.eV.a();
                aejl aejlVar39 = eupVar28.gP;
                aejl aejlVar40 = eupVar28.fM;
                jmc jmcVar2 = (jmc) eupVar28.lI.a();
                grl grlVar = (grl) eupVar28.lt.a();
                aejl aejlVar41 = eupVar28.aP;
                aejl aejlVar42 = eupVar28.mx;
                aejl aejlVar43 = eupVar28.mI;
                PowerManager powerManager = (PowerManager) aejlVar41.a();
                jhz jhzVar3 = (jhz) eupVar28.lu.a();
                iru iruVarCi3 = eupVar28.ci();
                evt evtVar = (evt) eupVar28.mK.a();
                lzb lzbVar4 = (lzb) eupVar28.gZ.a();
                gmu gmuVar = (gmu) eupVar28.gd.a();
                aejl aejlVar44 = eupVar28.mL;
                aejl aejlVar45 = eupVar28.gY;
                jnr jnrVar2 = (jnr) eupVar28.ls.a();
                ghr ghrVar4 = (ghr) eupVar28.fg.a();
                aejl aejlVar46 = eupVar28.fv;
                jhhVar = new jnk(activityManager3, eywVar2, jdtVar, hxuVar2, context6, jnaVar2, aejlVar33, aejlVar34, aejlVar35, jcvVar2, gxnVar, jhsVar4, gphVarBj6, jbuVar, gzuVar3, hxvVar2, aejlVar37, zHf2, supplierGK2, eupVar28.cp, gfrVar4, glqVarBc2, aejlVar38, gmdVar4, aejlVar39, aejlVar40, jmcVar2, grlVar, aejlVar42, aejlVar43, powerManager, jhzVar3, eupVar28.cr, iruVarCi3, evtVar, lzbVar4, gmuVar, aejlVar44, aejlVar45, jnrVar2, ghrVar4, aejlVar46);
                break;
            case 681:
                return aens.b(this.a.fj());
            case 682:
                eup eupVar29 = this.a;
                return new gxn(eupVar29.gL(), eupVar29.gM());
            case 683:
                eup eupVar30 = this.a;
                return new jbw((Context) eupVar30.n.a(), (ghr) eupVar30.fg.a());
            case 684:
                return Boolean.valueOf(aeli.b(this.a.eZ()));
            case 685:
                eup eupVar31 = this.a;
                ActivityManager activityManager4 = (ActivityManager) eupVar31.V.a();
                eyw eywVar3 = (eyw) eupVar31.T.a();
                fby fbyVar3 = (fby) eupVar31.hh.a();
                AppOpsManager appOpsManagerC = eupVar31.c();
                aejl aejlVar47 = eupVar31.mh;
                gkz gkzVar = (gkz) eupVar31.mk.a();
                aejl aejlVar48 = eupVar31.lj;
                Supplier supplierGJ3 = eupVar31.gJ();
                jdt jdtVar2 = (jdt) eupVar31.mc.a();
                hxu hxuVar3 = (hxu) eupVar31.le.a();
                aejl aejlVar49 = eupVar31.Q;
                frr frrVarAo = eupVar31.ao();
                ConnectivityManager connectivityManagerR = eupVar31.r();
                Context context7 = (Context) eupVar31.n.a();
                ahbt ahbtVar5 = (ahbt) eupVar31.q.a();
                Display display = (Display) eupVar31.co.a();
                Supplier supplierGI2 = eupVar31.gI();
                gxn gxnVar2 = (gxn) eupVar31.me.a();
                aejl aejlVar50 = eupVar31.hg;
                aejl aejlVar51 = eupVar31.fA;
                aejl aejlVar52 = eupVar31.lq;
                jhs jhsVar5 = (jhs) eupVar31.ln.a();
                Executor executor = (Executor) eupVar31.aR.a();
                gph gphVarBj7 = eupVar31.bj();
                jbu jbuVar2 = (jbu) eupVar31.mf.a();
                gzu gzuVar4 = (gzu) eupVar31.R.a();
                hxv hxvVar3 = (hxv) eupVar31.bT.a();
                ftc ftcVarAu = eupVar31.au();
                boolean zHf3 = eupVar31.hf();
                Supplier supplierGK3 = eupVar31.gK();
                jcy jcyVar2 = (jcy) eupVar31.gx.a();
                aejl aejlVar53 = eupVar31.bE;
                return new jot(activityManager4, eywVar3, fbyVar3, appOpsManagerC, aejlVar47, gkzVar, aejlVar48, supplierGJ3, jdtVar2, hxuVar3, aejlVar49, frrVarAo, connectivityManagerR, context7, ahbtVar5, display, supplierGI2, gxnVar2, aejlVar50, aejlVar51, aejlVar52, jhsVar5, executor, gphVarBj7, jbuVar2, gzuVar4, hxvVar3, ftcVarAu, zHf3, supplierGK3, jcyVar2, eupVar31.C(), (gtu) aejlVar53.a(), eupVar31.cp, (gfr) eupVar31.cu.a(), (exz) eupVar31.gG.a(), eupVar31.bc(), eupVar31.bY(), (gmd) eupVar31.eV.a(), eupVar31.ml, (fxu) eupVar31.t.a(), eupVar31.fM, (icl) eupVar31.mj.a(), eupVar31.f(), eupVar31.mm, (gof) eupVar31.S.a(), eupVar31.fU, (fcu) eupVar31.fb.a(), (iyh) eupVar31.lN.a(), eupVar31.mn, (lzb) eupVar31.gZ.a(), (gmu) eupVar31.gd.a(), (igs) eupVar31.gf.a(), eupVar31.gY, eupVar31.mo, (jnr) eupVar31.ls.a(), eupVar31.ab(), (ztw) eupVar31.ao.a(), (ghp) eupVar31.ar.a(), (ghr) eupVar31.fg.a(), (fad) eupVar31.lk.a(), (hxs) eupVar31.mG.a(), (gnv) eupVar31.mE.a());
            case 686:
                return Boolean.valueOf(aeor.b(this.a.fl()));
            case 687:
                eup eupVar32 = this.a;
                fby fbyVar4 = (fby) eupVar32.hh.a();
                jdt jdtVar3 = (jdt) eupVar32.mc.a();
                ahbt ahbtVar6 = (ahbt) eupVar32.q.a();
                aejl aejlVar54 = eupVar32.fA;
                gzu gzuVar5 = (gzu) eupVar32.R.a();
                glk glkVar2 = (glk) eupVar32.gF.a();
                gfr gfrVar5 = (gfr) eupVar32.cu.a();
                fke fkeVarX = eupVar32.X();
                aejl aejlVar55 = eupVar32.fM;
                icl iclVar = (icl) eupVar32.mj.a();
                ztw ztwVar2 = (ztw) eupVar32.ao.a();
                ghp ghpVar2 = (ghp) eupVar32.ar.a();
                ghr ghrVar5 = (ghr) eupVar32.fg.a();
                return new glb(fbyVar4, jdtVar3, ahbtVar6, aejlVar54, gzuVar5, glkVar2, eupVar32.cp, gfrVar5, fkeVarX, aejlVar55, iclVar, eupVar32.cr, ztwVar2, ghpVar2, ghrVar5);
            case 688:
                eup eupVar33 = this.a;
                return new iar((ahbt) eupVar33.q.a(), (icp) eupVar33.mi.a(), eupVar33.j());
            case 689:
                eup eupVar34 = this.a;
                return new icp((Context) eupVar34.n.a(), (glk) eupVar34.gF.a(), eupVar34.bX());
            case 690:
                return Boolean.valueOf(aelq.b(this.a.fa()));
            case 691:
                return Boolean.valueOf(aeou.b(this.a.fl()));
            case 692:
                return Boolean.valueOf(aeml.b(this.a.fd()));
            case 693:
                return Boolean.valueOf(aeov.b(this.a.fl()));
            case 694:
                eup eupVar35 = this.a;
                return new hxs((Context) eupVar35.cm.a(), (WindowManager) eupVar35.cn.a(), eupVar35.mF);
            case 695:
                eup eupVar36 = this.a;
                AccessibilityManager accessibilityManagerU2 = eupVar36.u();
                ActivityManager activityManager5 = (ActivityManager) eupVar36.V.a();
                eyw eywVar4 = (eyw) eupVar36.T.a();
                fby fbyVar5 = (fby) eupVar36.hh.a();
                gkz gkzVar2 = (gkz) eupVar36.mk.a();
                Supplier supplierGJ4 = eupVar36.gJ();
                jdt jdtVar4 = (jdt) eupVar36.mc.a();
                hxu hxuVar4 = (hxu) eupVar36.le.a();
                aejl aejlVar56 = eupVar36.Q;
                aejl aejlVar57 = eupVar36.gy;
                ixj ixjVar = (ixj) eupVar36.lM.a();
                ahbt ahbtVar7 = (ahbt) eupVar36.q.a();
                aejl aejlVar58 = eupVar36.mp;
                aejl aejlVar59 = eupVar36.fT;
                fal falVarI = eupVar36.I();
                fam famVar = (fam) eupVar36.mq.a();
                Display display2 = (Display) eupVar36.co.a();
                ewc ewcVar = (ewc) eupVar36.gM.a();
                aejl aejlVar60 = eupVar36.mr;
                aejl aejlVar61 = eupVar36.fA;
                aejl aejlVar62 = eupVar36.ms;
                aejl aejlVar63 = eupVar36.lq;
                jhs jhsVar6 = (jhs) eupVar36.ln.a();
                Executor executor2 = (Executor) eupVar36.m.a();
                gph gphVarBj8 = eupVar36.bj();
                abwf abwfVarES = eupVar36.eS();
                gzu gzuVar6 = (gzu) eupVar36.R.a();
                hxv hxvVar4 = (hxv) eupVar36.bT.a();
                fyr fyrVarAM = eupVar36.aM();
                aejl aejlVar64 = eupVar36.mg;
                ewo ewoVar = new ewo();
                aejl aejlVar65 = eupVar36.mt;
                InputMethodManager inputMethodManagerV = eupVar36.v();
                eyx eyxVar2 = (eyx) eupVar36.hj.a();
                aejl aejlVar66 = eupVar36.bE;
                return new hxr(accessibilityManagerU2, activityManager5, eywVar4, fbyVar5, gkzVar2, supplierGJ4, jdtVar4, hxuVar4, aejlVar56, aejlVar57, ixjVar, ahbtVar7, aejlVar58, aejlVar59, falVarI, famVar, display2, ewcVar, aejlVar60, aejlVar61, aejlVar62, aejlVar63, jhsVar6, executor2, gphVarBj8, abwfVarES, gzuVar6, hxvVar4, fyrVarAM, aejlVar64, ewoVar, aejlVar65, inputMethodManagerV, eyxVar2, eupVar36.hp(), (gtu) aejlVar66.a(), eupVar36.cp, (gfr) eupVar36.cu.a(), (exz) eupVar36.gG.a(), (jnb) eupVar36.mu.a(), eupVar36.mv, (gmd) eupVar36.eV.a(), (zyh) eupVar36.A.a(), (glg) eupVar36.hc.a(), eupVar36.fM, eupVar36.mm, (gof) eupVar36.S.a(), eupVar36.mw, eupVar36.mx, eupVar36.my, (lzb) eupVar36.gZ.a(), eupVar36.mo, eupVar36.ls, (iyj) eupVar36.mA.a(), eupVar36.cn(), eupVar36.eL(), (ghr) eupVar36.fg.a(), eupVar36.cp(), eupVar36.bU(), eupVar36.bf(), (gnv) eupVar36.mE.a());
            case 696:
                return new fdy((ahbt) this.a.q.a());
            case 697:
                eup eupVar37 = this.a;
                fda fdaVar = (fda) eupVar37.fS.a();
                Context context8 = (Context) eupVar37.n.a();
                ahbt ahbtVar8 = (ahbt) eupVar37.y.a();
                aejl aejlVar67 = eupVar37.bE;
                return new fap(fdaVar, context8, ahbtVar8, eupVar37.bj(), (gtu) aejlVar67.a(), (fub) eupVar37.hd.a(), (ztw) eupVar37.ao.a(), eupVar37.q(), eupVar37.ge, (WindowManager) eupVar37.cn.a());
            case 698:
                return Boolean.valueOf(aeos.b(this.a.fl()));
            case 699:
                return Boolean.valueOf(aelx.b(this.a.fc()));
            default:
                throw new AssertionError(i);
        }
        return jhhVar;
    }

    private final Object h() {
        Object hecVar;
        int i = this.b;
        switch (i) {
            case 700:
                return Boolean.valueOf(((waa) new aeoq(this.a.P).a.a()).a("com.google.android.katniss.device", "45372655").d());
            case 701:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45374830").d());
            case 702:
                return (abwf) ((waa) this.a.P.a()).a("com.google.android.katniss.device", "45369607").b();
            case 703:
                return Boolean.valueOf(((waa) new aemv(this.a.P).a.a()).a("com.google.android.katniss.device", "45402450").d());
            case 704:
                return Long.valueOf(((waa) new aeoq(this.a.P).a.a()).a("com.google.android.katniss.device", "45374201").a());
            case 705:
                eup eupVar = this.a;
                return new iyq((ixj) eupVar.lM.a(), (ahbt) eupVar.y.a(), eupVar.I(), (gtu) eupVar.bE.a(), eupVar.bg(), (iye) eupVar.mz.a(), eupVar.J(), eupVar.p(), (iyh) eupVar.lN.a());
            case 706:
                eup eupVar2 = this.a;
                return new iye((Context) eupVar2.n.a(), eupVar2.i());
            case 707:
                eup eupVar3 = this.a;
                return new izo((Context) eupVar3.n.a(), (agte) eupVar3.fR.a(), eupVar3.aM(), (gtu) eupVar3.bE.a(), eupVar3.fT, eupVar3.bY(), eupVar3.bt(), (hvf) eupVar3.fs.a());
            case 708:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45375020").d());
            case 709:
                return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45701425").d());
            case 710:
                return new gnv((mcw) this.a.i.a());
            case 711:
                return Boolean.valueOf(((waa) new aemv(this.a.P).a.a()).a("com.google.android.katniss.device", "45402451").d());
            case 712:
                eup eupVar4 = this.a;
                ActivityManager activityManager = (ActivityManager) eupVar4.V.a();
                AudioManager audioManagerO = eupVar4.o();
                ahbt ahbtVar = (ahbt) eupVar4.q.a();
                aejl aejlVar = eupVar4.cl;
                return new evx(activityManager, audioManagerO, ahbtVar, eupVar4.hc(), eupVar4.mJ, (DisplayManager) aejlVar.a(), (gtu) eupVar4.bE.a(), eupVar4.bg(), eupVar4.p(), (vrm) eupVar4.bs.a(), eupVar4.bE());
            case 713:
                return Boolean.valueOf(new aekh(this.a.P).a());
            case 714:
                return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45696047").d());
            case 715:
                return Boolean.valueOf(new aemd(this.a.P).b());
            case 716:
                eup eupVar5 = this.a;
                return new gxo(eupVar5.o(), eupVar5.bE());
            case 717:
                eup eupVar6 = this.a;
                aejl aejlVar2 = eupVar6.mO;
                aejl aejlVar3 = eupVar6.mP;
                mcw mcwVar = (mcw) eupVar6.i.a();
                aejl aejlVar4 = eupVar6.cu;
                return new jhw(aejlVar2, aejlVar3, mcwVar, eupVar6.fA, eupVar6.cp, (gfr) aejlVar4.a(), eupVar6.fM);
            case 718:
                return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45674797").d());
            case 719:
                return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45692368").d());
            case 720:
                return new got((agte) this.a.x.a());
            case 721:
                return Boolean.valueOf(new aemd(this.a.P).c());
            case 722:
                return Boolean.valueOf(new aemd(this.a.P).d());
            case 723:
                return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45654879").d());
            case 724:
                return Boolean.valueOf(new aemd(this.a.P).e());
            case 725:
                return Boolean.valueOf(new aekh(this.a.P).b());
            case 726:
                return Long.valueOf(new aemd(this.a.P).a());
            case 727:
                return Boolean.valueOf(new aemd(this.a.P).f());
            case 728:
                eup eupVar7 = this.a;
                return new jml((ahbt) eupVar7.q.a(), eupVar7.I(), (gtu) eupVar7.bE.a(), (ick) eupVar7.mj.a());
            case 729:
                return Boolean.valueOf(((waa) new aemd(this.a.P).a.a()).a("com.google.android.katniss.device", "45694289").d());
            case 730:
                return Boolean.valueOf(new aelf(this.a.P).a());
            case 731:
                eup eupVar8 = this.a;
                return new fbn((ahbt) eupVar8.q.a(), eupVar8.aw());
            case 732:
                return aekf.a(this.a.P);
            case 733:
                aepb aepbVarFm = this.a.fm();
                return (acfo) aepb.a.eX(aepbVarFm.b, aepbVarFm.c);
            case 734:
                return Boolean.valueOf(((waa) new aeoq(this.a.P).a.a()).a("com.google.android.katniss.device", "45426793").d());
            case 735:
                eup eupVar9 = this.a;
                return new ias(eupVar9.ga, (idu) eupVar9.fZ.a());
            case 736:
                eup eupVar10 = this.a;
                return new hcv((iax) eupVar10.gb.a(), eupVar10.i(), (ahbt) eupVar10.q.a(), eupVar10.at(), (gtu) eupVar10.bE.a());
            case 737:
                eup eupVar11 = this.a;
                return new hdh(eupVar11.gJ(), eupVar11.i(), (fiu) eupVar11.eY.a(), eupVar11.gI(), (gtu) eupVar11.bE.a(), (fth) eupVar11.gH.a(), (fcu) eupVar11.fb.a(), eupVar11.ct(), eupVar11.k(), (jbd) eupVar11.gp.a(), (jbd) eupVar11.fj.a(), (idl) eupVar11.ga.a(), (igs) eupVar11.gf.a(), eupVar11.al());
            case 738:
                eup eupVar12 = this.a;
                hecVar = new hec((iax) eupVar12.gb.a(), eupVar12.gJ(), (fda) eupVar12.fS.a(), eupVar12.i(), (agte) eupVar12.x.a(), (ahbt) eupVar12.q.a(), eupVar12.bj(), (fjr) eupVar12.fW.a(), (jcy) eupVar12.gx.a(), (gtu) eupVar12.bE.a(), eupVar12.fV, eupVar12.bZ(), (idl) eupVar12.ga.a(), (igs) eupVar12.gf.a(), (ghr) eupVar12.fg.a());
                break;
            case 739:
                eup eupVar13 = this.a;
                return new hcw((hcq) eupVar13.ni.a(), (Context) eupVar13.n.a());
            case 740:
                eup eupVar14 = this.a;
                return new hdd((hda) eupVar14.nj.a(), (hdr) eupVar14.nk.a(), (Context) eupVar14.n.a(), (ahbt) eupVar14.q.a(), eupVar14.k());
            case 741:
                eup eupVar15 = this.a;
                return new hee((hdr) eupVar15.nk.a(), (Context) eupVar15.n.a(), (ahbt) eupVar15.q.a(), eupVar15.hf(), eupVar15.hg, (fjx) eupVar15.gs.a(), (gyy) eupVar15.fX.a(), eupVar15.gK(), (gtu) eupVar15.bE.a(), eupVar15.k(), eupVar15.fV, eupVar15.nn);
            case 742:
                return Boolean.valueOf(new aekb(this.a.P).e());
            case 743:
                return new jbq((jnb) this.a.mu.a());
            case 744:
                eup eupVar16 = this.a;
                return new glt((ahbt) eupVar16.q.a(), eupVar16.eS, eupVar16.ab(), (ztw) eupVar16.ao.a());
            case 745:
                eup eupVar17 = this.a;
                iax iaxVar = (iax) eupVar17.gb.a();
                Supplier supplierGJ = eupVar17.gJ();
                fda fdaVar = (fda) eupVar17.fS.a();
                Context context = (Context) eupVar17.n.a();
                ahbt ahbtVar2 = (ahbt) eupVar17.q.a();
                aejl aejlVar5 = eupVar17.bD;
                hecVar = new iht(iaxVar, supplierGJ, fdaVar, context, ahbtVar2, eupVar17.gH(), eupVar17.nr, eupVar17.gr, (fjn) aejlVar5.a(), eupVar17.aK(), eupVar17.ca(), eupVar17.at(), (gtu) eupVar17.bE.a(), (idl) eupVar17.ga.a(), eupVar17.gl);
                break;
            case 746:
                return Boolean.valueOf(((waa) new aemy(this.a.P).a.a()).a("com.google.android.katniss.device", "45699062").d());
            case 747:
                return Boolean.valueOf(new aekb(this.a.P).c());
            case 748:
                return Boolean.valueOf(new aekb(this.a.P).d());
            case 749:
                return new aekb(this.a.P).b();
            case 750:
                return new aekb(this.a.P).a();
            case 751:
                eup eupVar18 = this.a;
                Context context2 = (Context) eupVar18.n.a();
                pjn pjnVar = (pjn) eupVar18.jM.a();
                aejl aejlVar6 = eupVar18.nx;
                aejlVar6.getClass();
                return new qgd(context2, pjnVar, yqt.i(new tes(aejlVar6)), (zyg) eupVar18.A.a(), zcp.b, eupVar18.fJ(), (vtm) eupVar18.hU.a());
            case 752:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.device", "45413260").d());
            case 753:
                return new cak((cai) this.a.nL.a());
            case 754:
                eup eupVar19 = this.a;
                return vvg.a((Context) eupVar19.n.a(), eupVar19.eh(), (zyh) eupVar19.w.a(), (agte) eupVar19.x.a(), (vrm) eupVar19.bs.a(), (ccz) eupVar19.nK.a());
            case 755:
                return mhr.a(new zdd(this.a.fH()));
            case 756:
                eup eupVar20 = this.a;
                return ihv.a(eupVar20.nw, eupVar20.eg());
            case 757:
                eup eupVar21 = this.a;
                return tds.a((Context) eupVar21.n.a(), (vft) eupVar21.ib.a(), zcl.a, (Executor) eupVar21.w.a(), (Executor) eupVar21.m.a());
            case 758:
                eup eupVar22 = this.a;
                return gag.a(eupVar22.kY, eupVar22.eg());
            case 759:
                eup eupVar23 = this.a;
                return tcq.a(eupVar23.nB, eupVar23.eg());
            case 760:
                eup eupVar24 = this.a;
                return new tco((vtm) eupVar24.hU.a(), (Executor) eupVar24.m.a());
            case 761:
                eup eupVar25 = this.a;
                return wqp.a(eupVar25.nD, eupVar25.eg());
            case 762:
                eup eupVar26 = this.a;
                return new wqn((woh) eupVar26.jQ.a(), (vtm) eupVar26.hU.a(), eupVar26.eC(), (zyg) eupVar26.m.a(), ((Boolean) eupVar26.aO.a()).booleanValue());
            case 763:
                eup eupVar27 = this.a;
                final aejl aejlVar7 = eupVar27.nF;
                vtv vtvVarEg = eupVar27.eg();
                aejlVar7.getClass();
                return new vux(new agow() { // from class: wqy
                    @Override // defpackage.agow
                    public final Object a() {
                        return (vtg) aejlVar7.a();
                    }
                }, vtvVarEg);
            case 764:
                eup eupVar28 = this.a;
                return new wqx((woh) eupVar28.jQ.a(), (vtm) eupVar28.hU.a(), eupVar28.eC(), (zyg) eupVar28.m.a(), eupVar28.da(), ((Boolean) eupVar28.aO.a()).booleanValue());
            case 765:
                eup eupVar29 = this.a;
                return qgf.a(eupVar29.nH, eupVar29.eg());
            case 766:
                eup eupVar30 = this.a;
                return vvu.a(eupVar30.id, eupVar30.eg());
            case 767:
                eup eupVar31 = this.a;
                return new vjg((Context) eupVar31.n.a(), new zdd(eupVar31.hy()), (zyg) eupVar31.m.a(), (vqi) eupVar31.aX.a());
            case 768:
                return new wij(this.a.nO);
            case 769:
                return new eto(this.a);
            case 770:
                return new vkw((Context) this.a.n.a());
            case 771:
                return new uxt(Optional.empty());
            case 772:
                return new ltg((Context) this.a.n.a());
            case 773:
                eup eupVar32 = this.a;
                Context context3 = (Context) eupVar32.n.a();
                aehf aehfVarB = aejf.b(eupVar32.aE);
                rfr rfrVar = (rfr) eupVar32.av.a();
                vhb vhbVar = (vhb) eupVar32.bc.a();
                eupVar32.ep();
                return new wge(context3, aehfVarB, rfrVar, vhbVar, eupVar32.fP());
            case 774:
                return Boolean.valueOf(aekr.a(this.a.P));
            case 775:
                eup eupVar33 = this.a;
                return new hcb((Context) eupVar33.n.a(), (agte) eupVar33.x.a(), (ahbt) eupVar33.q.a());
            case 776:
                return new fgt();
            case 777:
                eup eupVar34 = this.a;
                return new iwt((ahbt) eupVar34.y.a(), (euk) eupVar34.cj.a(), (gzu) eupVar34.R.a(), (ffp) eupVar34.by.a(), (gfr) eupVar34.cu.a(), (gmd) eupVar34.eV.a(), eupVar34.cj(), (iwu) eupVar34.nX.a(), eupVar34.aa(), eupVar34.nZ, (ztw) eupVar34.ao.a(), (ghr) eupVar34.fg.a());
            case 778:
                eup eupVar35 = this.a;
                return new ixb((ahbt) eupVar35.q.a(), eupVar35.I(), (fam) eupVar35.mq.a(), (gfr) eupVar35.cu.a(), (gmd) eupVar35.eV.a(), (zyh) eupVar35.A.a(), eupVar35.cj(), (ghp) eupVar35.ar.a(), (ghr) eupVar35.fg.a(), eupVar35.cq());
            case 779:
                eup eupVar36 = this.a;
                return new ixd((Context) eupVar36.cm.a(), new ewo(), eupVar36.nY, (WindowManager) eupVar36.cn.a());
            case 780:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45642213").d());
            case 781:
                eup eupVar37 = this.a;
                return new hud((Context) eupVar37.n.a(), eupVar37.C(), new htw(eupVar37.bT()), eupVar37.k(), (ghr) eupVar37.fg.a());
            case 782:
                eup eupVar38 = this.a;
                eut eutVar = new eut(eupVar38);
                mwq mwqVar = (mwq) eupVar38.oc.a();
                Set setGE = eupVar38.gE();
                uwm uwmVarDR = eupVar38.dR();
                hjk hjkVar = hjk.a;
                return hjkVar.b(eutVar, mwqVar, setGE, new zdd(hjkVar.c(uwmVarDR)), eupVar38.gF());
            case 783:
                return new mwq();
            case 784:
                return new etu(this);
            case 785:
                return new etv(this);
            case 786:
                return (acfo) ((waa) new aene(this.a.P).a.a()).a("com.google.android.katniss.device", "45460361").b();
            case 787:
                aepi aepiVarFq = this.a.fq();
                return (acfo) aepi.a.e(0, "45460362", new riz() { // from class: aepg
                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
                    
                        if (r2 != false) goto L17;
                     */
                    @Override // defpackage.riz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r5) throws defpackage.abxv {
                        /*
                            r4 = this;
                            acfo r0 = defpackage.acfo.a
                            byte[] r5 = (byte[]) r5
                            int r1 = r5.length
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            abza r2 = defpackage.abza.a
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            r3 = 0
                            abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                            if (r5 == 0) goto L46
                            r0 = 1
                            r1 = 0
                            java.lang.Object r2 = r5.cM(r0, r1)
                            java.lang.Byte r2 = (java.lang.Byte) r2
                            byte r2 = r2.byteValue()
                            if (r2 != r0) goto L21
                            goto L46
                        L21:
                            if (r2 == 0) goto L3c
                            abza r2 = defpackage.abza.a
                            java.lang.Class r3 = r5.getClass()
                            abzj r2 = r2.a(r3)
                            boolean r2 = r2.l(r5)
                            if (r0 == r2) goto L34
                            goto L35
                        L34:
                            r1 = r5
                        L35:
                            r0 = 2
                            r5.cM(r0, r1)
                            if (r2 == 0) goto L3c
                            goto L46
                        L3c:
                            abzz r5 = new abzz
                            r5.<init>()
                            abxv r5 = r5.a()
                            throw r5
                        L46:
                            acfo r5 = (defpackage.acfo) r5
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepg.a(java.lang.Object):java.lang.Object");
                    }
                }, "CgJhdAoCYXgKAmJlCgJiZwoCYmwKAmN5CgJjegoCZGUKAmRrCgJlYQoCZWUKAmVzCgJlegoCZmkKAmZyCgJnYgoCdWsKAmdmCgJnZwoCZ2kKAmdwCgJncgoCaHIKAmh1CgJpYwoCaWUKAmlzCgJpdAoCamUKAmxpCgJsdAoCbHUKAmx2CgJtZgoCbXEKAm10CgJuYwoCbmwKAm5vCgJwZgoCcGwKAnBtCgJwdAoCcmUKAnJvCgJzZQoCc2kKAnNqCgJzawoCdGYKAnZhCgJ3ZgoCeXQKAmNo").eX(aepiVarFq.b, aepiVarFq.c);
            case 788:
                aepi aepiVarFq2 = this.a.fq();
                return (acfo) aepi.a.e(3, "45417927", new riz() { // from class: aepg
                    @Override // defpackage.riz
                    public final Object a(Object v) throws abxv {
                        /*
                            this = this;
                            acfo r0 = defpackage.acfo.a
                            byte[] r5 = (byte[]) r5
                            int r1 = r5.length
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            abza r2 = defpackage.abza.a
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            r3 = 0
                            abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                            if (r5 == 0) goto L46
                            r0 = 1
                            r1 = 0
                            java.lang.Object r2 = r5.cM(r0, r1)
                            java.lang.Byte r2 = (java.lang.Byte) r2
                            byte r2 = r2.byteValue()
                            if (r2 != r0) goto L21
                            goto L46
                        L21:
                            if (r2 == 0) goto L3c
                            abza r2 = defpackage.abza.a
                            java.lang.Class r3 = r5.getClass()
                            abzj r2 = r2.a(r3)
                            boolean r2 = r2.l(r5)
                            if (r0 == r2) goto L34
                            goto L35
                        L34:
                            r1 = r5
                        L35:
                            r0 = 2
                            r5.cM(r0, r1)
                            if (r2 == 0) goto L3c
                            goto L46
                        L3c:
                            abzz r5 = new abzz
                            r5.<init>()
                            abxv r5 = r5.a()
                            throw r5
                        L46:
                            acfo r5 = (defpackage.acfo) r5
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepg.a(java.lang.Object):java.lang.Object");
                    }
                }, "ChFjb20ubmV0ZmxpeC5uaW5qYQohY29tLmFtYXpvbi5hbWF6b252aWRlby5saXZpbmdyb29tCgpjb20udHViaXR2ChVjb20uZXNwbi5zY29yZV9jZW50ZXIKFWNvbS5jcmFja2xlLmFuZHJvaWR0dgoXY29tLmh1bHUubGl2aW5ncm9vbXBsdXMKG2NvbS5jdy5mdWxsZXBpc29kZXMuYW5kcm9pZAoQdHYucGx1dG8uYW5kcm9pZAoYY29tLm5pY2suYW5kcm9pZC5uaWNrLnR2Ch5jb20uZGlzbmV5LmRpc25leXBsdXMuaW50ZXJuYWwKFWNvbS50dXJuZXIuY252aWRlb2FwcAoLY29tLmNicy5vdHQKJWNvbS5ieWRlbHV4ZS5kMy5hbmRyb2lkLnByb2dyYW0uc3RhcnoKLmNvbS5kaXNuZXkuZGF0Zy52aWRlb3BsYXRmb3Jtcy5hbmRyb2lkLndhdGNoZGMKGGNvbS5oYW5kbWFyay5zcG9ydGNhc3RlcgoOY29tLm5iY3VuaS5uYmMKJmFpci5jb20ubmJjdW5pLmNvbS5uYmNzcG9ydHMubGl2ZWV4dHJhCiFhaXIuY29tLnZ1ZHUuYWlyLkRvd25sb2FkZXJUYWJsZXQKC2NvbS5mb3gubm93Cg5jb20ud2JkLnN0cmVhbQoVY29tLnNsaW5nLmFpcnR2cGxheWVyChltb2JpLmFiY21vdXNlLmFjYWRlbXlfZ29vCipjb20uZGlzbmV5LmRhdGcudmlkZW9wbGF0Zm9ybXMuYW5kcm9pZC5hYmMKIGNvbS5hZXRuLmhpc3Rvcnkud2F0Y2guYW5kcm9pZHR2ChVjb20uZm94c3BvcnRzLmFuZHJvaWQKEW9yZy5wYnNraWRzLnZpZGVvCh1jb20uYWV0bi5hZXR2LndhdGNoLmFuZHJvaWR0dgoPY29tLmNuYmMuY2xpZW50CiFjb20udHVybmVyLnRudC5hbmRyb2lkLm5ldHdvcmthcHA").eX(aepiVarFq2.b, aepiVarFq2.c);
            case 789:
                aepi aepiVarFq3 = this.a.fq();
                return (String) aepi.a.c(6, "45417919", "").eX(aepiVarFq3.b, aepiVarFq3.c);
            case 790:
                aepi aepiVarFq4 = this.a.fq();
                return (String) aepi.a.c(7, "45417920", "").eX(aepiVarFq4.b, aepiVarFq4.c);
            case 791:
                aepi aepiVarFq5 = this.a.fq();
                return (String) aepi.a.c(8, "45417916", "").eX(aepiVarFq5.b, aepiVarFq5.c);
            case 792:
                aepi aepiVarFq6 = this.a.fq();
                return (String) aepi.a.c(10, "45417918", "").eX(aepiVarFq6.b, aepiVarFq6.c);
            case 793:
                aepi aepiVarFq7 = this.a.fq();
                return (String) aepi.a.c(9, "45417917", "").eX(aepiVarFq7.b, aepiVarFq7.c);
            case 794:
                aepi aepiVarFq8 = this.a.fq();
                return (String) aepi.a.c(11, "45417922", "").eX(aepiVarFq8.b, aepiVarFq8.c);
            case 795:
                aepi aepiVarFq9 = this.a.fq();
                return (String) aepi.a.c(12, "45417923", "").eX(aepiVarFq9.b, aepiVarFq9.c);
            case 796:
                aepi aepiVarFq10 = this.a.fq();
                return (String) aepi.a.c(13, "45417921", "").eX(aepiVarFq10.b, aepiVarFq10.c);
            case 797:
                aepi aepiVarFq11 = this.a.fq();
                return (String) aepi.a.c(14, "45417915", "").eX(aepiVarFq11.b, aepiVarFq11.c);
            case 798:
                aepi aepiVarFq12 = this.a.fq();
                return (acfo) aepi.a.e(4, "45417928", new riz() { // from class: aepg
                    @Override // defpackage.riz
                    public final Object a(Object v) throws abxv {
                        /*
                            this = this;
                            acfo r0 = defpackage.acfo.a
                            byte[] r5 = (byte[]) r5
                            int r1 = r5.length
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            abza r2 = defpackage.abza.a
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            r3 = 0
                            abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                            if (r5 == 0) goto L46
                            r0 = 1
                            r1 = 0
                            java.lang.Object r2 = r5.cM(r0, r1)
                            java.lang.Byte r2 = (java.lang.Byte) r2
                            byte r2 = r2.byteValue()
                            if (r2 != r0) goto L21
                            goto L46
                        L21:
                            if (r2 == 0) goto L3c
                            abza r2 = defpackage.abza.a
                            java.lang.Class r3 = r5.getClass()
                            abzj r2 = r2.a(r3)
                            boolean r2 = r2.l(r5)
                            if (r0 == r2) goto L34
                            goto L35
                        L34:
                            r1 = r5
                        L35:
                            r0 = 2
                            r5.cM(r0, r1)
                            if (r2 == 0) goto L3c
                            goto L46
                        L3c:
                            abzz r5 = new abzz
                            r5.<init>()
                            abxv r5 = r5.a()
                            throw r5
                        L46:
                            acfo r5 = (defpackage.acfo) r5
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepg.a(java.lang.Object):java.lang.Object");
                    }
                }, "ClNodHRwczovL3d3dy5nc3RhdGljLmNvbS9wYXJ0bmVyZGFzaC9hcHBsaWNhdGlvbi9rYXRuaXNzL2RzY19jYXJkX2RlZmF1bHRfbG9nb18xLnBuZwpTaHR0cHM6Ly93d3cuZ3N0YXRpYy5jb20vcGFydG5lcmRhc2gvYXBwbGljYXRpb24va2F0bmlzcy9kc2NfY2FyZF9kZWZhdWx0X2xvZ29fMi5wbmcKU2h0dHBzOi8vd3d3LmdzdGF0aWMuY29tL3BhcnRuZXJkYXNoL2FwcGxpY2F0aW9uL2thdG5pc3MvZHNjX2NhcmRfZGVmYXVsdF9sb2dvXzMucG5n").eX(aepiVarFq12.b, aepiVarFq12.c);
            case 799:
                aepi aepiVarFq13 = this.a.fq();
                return (String) aepi.a.c(17, "45417934", "").eX(aepiVarFq13.b, aepiVarFq13.c);
            default:
                throw new AssertionError(i);
        }
        return hecVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i() {
        List listB;
        int i = this.b;
        Boolean bool = false;
        switch (i) {
            case 800:
                aepc aepcVarFn = this.a.fn();
                return (String) aepc.a.eX(aepcVarFn.b, aepcVarFn.c);
            case 801:
                aepi aepiVarFq = this.a.fq();
                return (String) aepi.a.c(16, "45417933", "").eX(aepiVarFq.b, aepiVarFq.c);
            case 802:
                aepf aepfVarFp = this.a.fp();
                Boolean bool2 = (Boolean) aepf.a.eX(aepfVarFp.b, aepfVarFp.c);
                bool2.booleanValue();
                return bool2;
            case 803:
                aepi aepiVarFq2 = this.a.fq();
                Boolean bool3 = (Boolean) aepi.a.d(18, "45477616", false).eX(aepiVarFq2.b, aepiVarFq2.c);
                bool3.booleanValue();
                return bool3;
            case 804:
                return Boolean.valueOf(((waa) new aene(this.a.P).a.a()).a("com.google.android.katniss.device", "45643834").d());
            case 805:
                aepi aepiVarFq3 = this.a.fq();
                Boolean bool4 = (Boolean) aepi.a.d(19, "45643434", false).eX(aepiVarFq3.b, aepiVarFq3.c);
                bool4.booleanValue();
                return bool4;
            case 806:
                aepi aepiVarFq4 = this.a.fq();
                Boolean bool5 = (Boolean) aepi.a.d(22, "45417929", false).eX(aepiVarFq4.b, aepiVarFq4.c);
                bool5.booleanValue();
                return bool5;
            case 807:
                return new ipf();
            case 808:
                return Boolean.valueOf(((waa) new aene(this.a.P).a.a()).a("com.google.android.katniss.device", "45654371").d());
            case 809:
                aepi aepiVarFq5 = this.a.fq();
                Boolean bool6 = (Boolean) aepi.a.d(25, "45657292", false).eX(aepiVarFq5.b, aepiVarFq5.c);
                bool6.booleanValue();
                return bool6;
            case 810:
                aepi aepiVarFq6 = this.a.fq();
                Boolean bool7 = (Boolean) aepi.a.d(1, "45417931", false).eX(aepiVarFq6.b, aepiVarFq6.c);
                bool7.booleanValue();
                return bool7;
            case 811:
                return new iph((qpk) this.a.eS.a());
            case 812:
                aepi aepiVarFq7 = this.a.fq();
                Boolean bool8 = (Boolean) aepi.a.d(15, "45623257", false).eX(aepiVarFq7.b, aepiVarFq7.c);
                bool8.booleanValue();
                return bool8;
            case 813:
                aepi aepiVarFq8 = this.a.fq();
                Long l = (Long) aepi.a.b(20, "45645613", 0L).eX(aepiVarFq8.b, aepiVarFq8.c);
                l.longValue();
                return l;
            case 814:
                aepi aepiVarFq9 = this.a.fq();
                return (abwf) aepi.a.e(21, "45644778", new riz() { // from class: aeph
                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
                    
                        if (r2 != false) goto L17;
                     */
                    @Override // defpackage.riz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r5) throws defpackage.abxv {
                        /*
                            r4 = this;
                            abwf r0 = defpackage.abwf.a
                            byte[] r5 = (byte[]) r5
                            int r1 = r5.length
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            abza r2 = defpackage.abza.a
                            com.google.protobuf.ExtensionRegistryLite r2 = com.google.protobuf.ExtensionRegistryLite.a
                            r3 = 0
                            abxd r5 = defpackage.abxd.h(r0, r5, r3, r1, r2)
                            if (r5 == 0) goto L46
                            r0 = 1
                            r1 = 0
                            java.lang.Object r2 = r5.cM(r0, r1)
                            java.lang.Byte r2 = (java.lang.Byte) r2
                            byte r2 = r2.byteValue()
                            if (r2 != r0) goto L21
                            goto L46
                        L21:
                            if (r2 == 0) goto L3c
                            abza r2 = defpackage.abza.a
                            java.lang.Class r3 = r5.getClass()
                            abzj r2 = r2.a(r3)
                            boolean r2 = r2.l(r5)
                            if (r0 == r2) goto L34
                            goto L35
                        L34:
                            r1 = r5
                        L35:
                            r0 = 2
                            r5.cM(r0, r1)
                            if (r2 == 0) goto L3c
                            goto L46
                        L3c:
                            abzz r5 = new abzz
                            r5.<init>()
                            abxv r5 = r5.a()
                            throw r5
                        L46:
                            abwf r5 = (defpackage.abwf) r5
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeph.a(java.lang.Object):java.lang.Object");
                    }
                }, "").eX(aepiVarFq9.b, aepiVarFq9.c);
            case 815:
                ((wge) this.a.nT.a()).getClass();
                return new wan();
            case 816:
                return new pce();
            case 817:
                eup eupVar = this.a;
                zcp zcpVar = zcp.b;
                pct pctVar = (pct) eupVar.pe.a();
                zfh zfhVar = pfi.a;
                yzo yzoVar = new yzo();
                yzoVar.i(zcpVar);
                yzoVar.c(pctVar.d);
                return new pcn(yzoVar.f());
            case 818:
                eup eupVar2 = this.a;
                pbb pbbVar = (pbb) eupVar2.pc.a();
                yqt yqtVarI = yqt.i(new vpt((wxc) eupVar2.ii.a()));
                eupVar2.cN();
                pct pctVar2 = new pct(pbbVar, (vpt) ((yqz) yqtVarI).a, (pas) eupVar2.pd.a());
                if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
                    Integer num = 500;
                    num.getClass();
                    pctVar2.e = 500;
                }
                return pctVar2;
            case 819:
                eup eupVar3 = this.a;
                paw pawVarCN = eupVar3.cN();
                zyg zygVar = (zyg) eupVar3.w.a();
                aejl aejlVar = eupVar3.pb;
                zfh zfhVar2 = pfi.a;
                zdd zddVar = new zdd(new Object() { // from class: pfh
                });
                return new pbb(zygVar, aejlVar, zddVar, pawVarCN);
            case 820:
                eup eupVar4 = this.a;
                return yzq.q(eupVar4.cO(), eupVar4.cP());
            case 821:
                eup eupVar5 = this.a;
                return new pfk(new tic((tgu) eupVar5.jE.a(), new tiu(zcp.b, (tht) eupVar5.jG.a()), (thq) eupVar5.jD.a(), (Context) eupVar5.n.a(), (Executor) eupVar5.m.a(), (Set) ((aejh) aejn.a).b, (thm) eupVar5.jH.a()), zcl.a);
            case 822:
                eup eupVar6 = this.a;
                return new pbp((Context) eupVar6.n.a(), eupVar6.oL, (zyg) eupVar6.w.a());
            case 823:
                return bool;
            case 824:
                Map mapFS = this.a.fS();
                zfh zfhVar3 = pfi.a;
                return new pdp(mapFS);
            case 825:
                return new pdo() { // from class: til
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final tiq tiqVar = (tiq) messageLite;
                        return zxn.h(new pdn() { // from class: tin
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                tiq tiqVar2 = tiqVar;
                                zoq zoqVar = (zoq) abyqVar;
                                if ((tiqVar2.b & 1) != 0) {
                                    String str = tiqVar2.c;
                                    if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        zoqVar.y();
                                    }
                                    zot zotVar = (zot) zoqVar.b;
                                    zot zotVar2 = zot.a;
                                    str.getClass();
                                    zotVar.b |= 4;
                                    zotVar.f = str;
                                }
                                if ((tiqVar2.b & 2) != 0) {
                                    int i2 = tiqVar2.d;
                                    if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        zoqVar.y();
                                    }
                                    zot zotVar3 = (zot) zoqVar.b;
                                    zot zotVar4 = zot.a;
                                    zotVar3.b |= 8;
                                    zotVar3.g = i2;
                                }
                                if (tiqVar2.e.size() > 0) {
                                    zoqVar.f(zop.b, tiqVar2.e);
                                }
                                if ((tiqVar2.b & 4) != 0) {
                                    acjc acjcVar = tiqVar2.f;
                                    if (acjcVar == null) {
                                        acjcVar = acjc.a;
                                    }
                                    if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        zoqVar.y();
                                    }
                                    zot zotVar5 = (zot) zoqVar.b;
                                    zot zotVar6 = zot.a;
                                    acjcVar.getClass();
                                    zotVar5.h = acjcVar;
                                    zotVar5.b |= 16;
                                }
                            }
                        });
                    }
                };
            case 826:
                return new pdo() { // from class: tig
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final aciy aciyVar = (aciy) messageLite;
                        return zxn.h(new pdn() { // from class: tim
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                ((zoq) abyqVar).f(aciy.b, aciyVar);
                            }
                        });
                    }
                };
            case 827:
                return new pdo() { // from class: tid
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final zmk zmkVar = (zmk) messageLite;
                        return zxn.h(new pdn() { // from class: tij
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                ((zoq) abyqVar).f(zml.a, zmkVar);
                            }
                        });
                    }
                };
            case 828:
                return new pdo() { // from class: tik
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final znz znzVar = (znz) messageLite;
                        return zxn.h(new pdn() { // from class: tih
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                ((zoq) abyqVar).f(zoa.a, znzVar);
                            }
                        });
                    }
                };
            case 829:
                return new pdo() { // from class: tio
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final zle zleVar = (zle) messageLite;
                        return zxn.h(new pdn() { // from class: tif
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                zle zleVar2 = zleVar;
                                zoq zoqVar = (zoq) abyqVar;
                                if ((zleVar2.c & 1) != 0) {
                                    zoqVar.f(zle.b, zleVar2);
                                }
                            }
                        });
                    }
                };
            case 830:
                return new pdo() { // from class: tii
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final zlp zlpVar = (zlp) messageLite;
                        return zxn.h(new pdn() { // from class: tie
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                zlp zlpVar2 = zlpVar;
                                zoq zoqVar = (zoq) abyqVar;
                                if (zlpVar2.c == 2) {
                                    zoqVar.f(zlp.b, zlpVar2);
                                }
                            }
                        });
                    }
                };
            case 831:
                return new pdo() { // from class: pen
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final pdd pddVar = (pdd) messageLite;
                        return zxn.h(new pdn() { // from class: pep
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                zoq zoqVar = (zoq) abyqVar;
                                int i2 = pddVar.c;
                                if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar.y();
                                }
                                zot zotVar = (zot) zoqVar.b;
                                zot zotVar2 = zot.a;
                                zotVar.b |= 2;
                                zotVar.d = i2;
                            }
                        });
                    }
                };
            case 832:
                return new pdo() { // from class: per
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final acjc acjcVar = (acjc) messageLite;
                        return zxn.h(new pdn() { // from class: pem
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                zoq zoqVar = (zoq) abyqVar;
                                if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar.y();
                                }
                                acjc acjcVar2 = acjcVar;
                                zot zotVar = (zot) zoqVar.b;
                                zot zotVar2 = zot.a;
                                acjcVar2.getClass();
                                zotVar.h = acjcVar2;
                                zotVar.b |= 16;
                            }
                        });
                    }
                };
            case 833:
                return new pdo() { // from class: peu
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final pdr pdrVar = (pdr) messageLite;
                        return zxn.h(new pdn() { // from class: pev
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                pdr pdrVar2 = pdrVar;
                                zoq zoqVar = (zoq) abyqVar;
                                if ((pdrVar2.b & 1) != 0) {
                                    zoqVar.f(zmi.a, Long.valueOf(pdrVar2.c));
                                }
                            }
                        });
                    }
                };
            case 834:
                return new pdo() { // from class: peo
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final zot zotVar = (zot) messageLite;
                        return zxn.h(new pdn() { // from class: pet
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                zoq zoqVar = (zoq) abyqVar;
                                zoq zoqVar2 = new zoq();
                                zoqVar2.B(zotVar);
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar2 = (zot) zoqVar2.b;
                                zot zotVar3 = zot.a;
                                zotVar2.b &= -2;
                                zotVar2.c = 0;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar4 = (zot) zoqVar2.b;
                                zotVar4.b &= -3;
                                zotVar4.d = -1;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                ((zot) zoqVar2.b).e = abxe.a;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar5 = (zot) zoqVar2.b;
                                zotVar5.b &= -5;
                                zotVar5.f = zot.a.f;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar6 = (zot) zoqVar2.b;
                                zotVar6.b &= -9;
                                zotVar6.g = 0;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar7 = (zot) zoqVar2.b;
                                zotVar7.h = null;
                                zotVar7.b &= -17;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar8 = (zot) zoqVar2.b;
                                zotVar8.b &= -33;
                                zotVar8.i = 0;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar9 = (zot) zoqVar2.b;
                                zotVar9.b &= -257;
                                zotVar9.j = -1;
                                if ((zoqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    zoqVar2.y();
                                }
                                zot zotVar10 = (zot) zoqVar2.b;
                                zotVar10.k = null;
                                zotVar10.b &= -513;
                                zoqVar.B((zot) zoqVar2.v());
                            }
                        });
                    }
                };
            case 835:
                return new pdo() { // from class: peq
                    @Override // defpackage.pdo
                    public final zyd a(MessageLite messageLite) {
                        final zlp zlpVar = (zlp) messageLite;
                        return zxn.h(new pdn() { // from class: pes
                            @Override // defpackage.pdn
                            public final void a(abyq abyqVar) {
                                zlp zlpVar2 = zlpVar;
                                zoq zoqVar = (zoq) abyqVar;
                                if (zlpVar2.c == 1) {
                                    zoqVar.f(zlp.b, zlpVar2);
                                }
                            }
                        });
                    }
                };
            case 836:
                yyr yyrVar = zcl.a;
                zfh zfhVar4 = pfi.a;
                return new pdp(yyrVar);
            case 837:
                yyr yyrVar2 = zcl.a;
                zfh zfhVar5 = pfi.a;
                return new pdp(yyrVar2);
            case 838:
                return new pas();
            case 839:
                eup eupVar7 = this.a;
                pbb pbbVar2 = (pbb) eupVar7.pc.a();
                eupVar7.cN();
                zcp zcpVar2 = zcp.b;
                zfh zfhVar6 = pfi.a;
                pfs pfsVar = new pfs(pbbVar2, zcpVar2, (pas) eupVar7.pd.a());
                zdd zddVar2 = new zdd(new pfo());
                pcw pcwVar = new pcw();
                yzo yzoVar2 = new yzo();
                yzoVar2.i(pfsVar.b);
                yzoVar2.i(zddVar2);
                yzoVar2.c(new pfr(pcwVar));
                return new pfq(new pcn(yzoVar2.f()), pcwVar, pfsVar.a, pfsVar.c);
            case 840:
                return new pfu();
            case 841:
                eup eupVar8 = this.a;
                pbb pbbVar3 = (pbb) eupVar8.pc.a();
                pas pasVar = (pas) eupVar8.pd.a();
                bool.getClass();
                return new pcy(pbbVar3, pasVar);
            case 842:
                return new xac((wxc) this.a.ii.a());
            case 843:
                return new wkg((Context) this.a.n.a());
            case 844:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45692341").d());
            case 845:
                return Boolean.valueOf(((waa) new aeoq(this.a.P).a.a()).a("com.google.android.katniss.device", "45373899").d());
            case 846:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45693303").d());
            case 847:
                return Boolean.valueOf(((waa) new aene(this.a.P).a.a()).a("com.google.android.katniss.device", "45671564").d());
            case 848:
                wvx wvxVarF = wzg.f("provideExtensionRegistry", wwb.a, true);
                try {
                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                    wvxVarF.close();
                    generatedRegistry.getClass();
                    return generatedRegistry;
                } finally {
                }
            case 849:
                aepi aepiVarFq10 = this.a.fq();
                return (String) aepi.a.c(26, "45417935", "support.google.com/assistant/?p=reset_id&hl=%s").eX(aepiVarFq10.b, aepiVarFq10.c);
            case 850:
                eup eupVar9 = this.a;
                return new txm(eupVar9.el(), new txk(eupVar9.bd, eupVar9.m, eupVar9.ps, eupVar9.rT, eupVar9.pG, eupVar9.n));
            case 851:
                ros rosVarA = ((tgf) this.a.jK.a()).a(tfu.TRANSCRIPTION);
                rosVarA.getClass();
                return rosVarA;
            case 852:
                eup eupVar10 = this.a;
                return new tuj(eupVar10.pt, eupVar10.i, eupVar10.m, eupVar10.pZ, eupVar10.rS);
            case 853:
                return new tqz((tqy) this.a.fw());
            case 854:
                eup eupVar11 = this.a;
                tvz tvzVar = (tvz) eupVar11.pX.a();
                ttn ttnVar = (ttn) eupVar11.pY.a();
                new tub(eupVar11.m, eupVar11.pI, eupVar11.pX, eupVar11.pY);
                return new txr(tvzVar, ttnVar);
            case 855:
                eup eupVar12 = this.a;
                return new tua(eupVar12.A, eupVar12.m, eupVar12.pF, eupVar12.n, eupVar12.pG);
            case 856:
                eup eupVar13 = this.a;
                aejl aejlVar2 = eupVar13.pw;
                wma wmaVar = (wma) eupVar13.px.a();
                wmk wmkVar = (wmk) eupVar13.py.a();
                return (adkp) adkq.a(wmg.a(aejlVar2, wmaVar, (aask) eupVar13.pD.a(), ypv.a)).g(wmkVar, eupVar13.ev());
            case 857:
                zcp zcpVar3 = zcp.b;
                we weVar = new we();
                zdm zdmVarListIterator = zcpVar3.f().listIterator(0);
                while (zdmVarListIterator.hasNext()) {
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (AbstractMap.SimpleImmutableEntry) zdmVarListIterator.next();
                    Set setNewSetFromMap = (Set) weVar.get(simpleImmutableEntry.getKey());
                    if (setNewSetFromMap == null) {
                        setNewSetFromMap = Collections.newSetFromMap(new we());
                        weVar.put((wmm) simpleImmutableEntry.getKey(), setNewSetFromMap);
                    }
                    setNewSetFromMap.add((agow) simpleImmutableEntry.getValue());
                }
                eup eupVar14 = this.a;
                wx wxVar = (wx) eupVar14.pu.a();
                Object objFB = eupVar14.fB();
                Set setKeySet = weVar.keySet();
                synchronized (wxVar) {
                    listB = (List) wxVar.get(setKeySet);
                    if (listB == null) {
                        listB = ((wmn) objFB).b(setKeySet);
                        wxVar.put(setKeySet, listB);
                    }
                }
                yyf yyfVar = new yyf(4);
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) weVar.get((wmm) it.next())).iterator();
                    while (it2.hasNext()) {
                        yyfVar.g((aauv) ((agow) it2.next()).a());
                    }
                }
                yyk yykVarF = yyfVar.f();
                yykVarF.getClass();
                return yykVarF;
            case 858:
                return new wx(0);
            case 859:
                return new Random();
            case 860:
                zte zteVarB = tek.b();
                wlw wlwVar = new wlw();
                wlwVar.a = zteVarB.a;
                wlwVar.b = Integer.valueOf(zteVarB.a());
                wlwVar.b(adlf.f);
                return wlwVar.c();
            case 861:
                return new wmk();
            case 862:
                return new aauc(this.a.eQ(), yyk.j(zcp.b));
            case 863:
                return new aats(this.a.pz);
            case 864:
                eup eupVar15 = this.a;
                Object objA = eupVar15.jp.a();
                yzq yzqVarO = yzq.o(eupVar15.gy());
                aato aatoVarA = ((aatp) objA).a(true);
                Iterator it3 = yzqVarO.iterator();
                while (it3.hasNext()) {
                    aatoVarA.a.addRequestFinishedListener((RequestFinishedInfo.Listener) it3.next());
                }
                aatoVarA.getClass();
                return aatoVarA;
            case 865:
                return yqt.i(bool);
            case 866:
                yqn yqnVar = aawo.a;
                throw new RuntimeException();
            case 867:
                yqn yqnVar2 = aawo.a;
                throw new RuntimeException();
            case 868:
                eup eupVar16 = this.a;
                Application applicationA = aehn.a(eupVar16.a.a);
                applicationA.getClass();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eupVar16.w.a();
                jyw jywVar = new jyw(applicationA, "STREAMZ_TIKTOK", null);
                jywVar.f(aece.UNMETERED_OR_DAILY);
                return new wkv(scheduledExecutorService, new uqn(jywVar, "STREAMZ_TIKTOK"), applicationA);
            case 869:
                eup eupVar17 = this.a;
                esn esnVar = (esn) ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "8").b();
                acfo acfoVar = (acfo) ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "2").b();
                abwf abwfVar = (abwf) ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45357884").b();
                boolean zD = ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45386178").d();
                long jA = ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45407723").a();
                ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45408541").d();
                long jA2 = ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45410230").a();
                ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45615079").d();
                boolean zD2 = ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45625547").d();
                boolean zD3 = ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45685592").d();
                boolean zD4 = ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45680771").d();
                Optional.empty().isPresent();
                return new tru(esnVar, acfoVar, abwfVar, zD, jA, jA2, zD2, zD3, zD4, ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45691086").d(), ((waa) eupVar17.P.a()).a("com.google.android.apps.search.transcription.device", "45702530").c());
            case 870:
                eup eupVar18 = this.a;
                aejl aejlVar3 = eupVar18.n;
                aejl aejlVar4 = eupVar18.pG;
                aejl aejlVar5 = eupVar18.pI;
                aejl aejlVar6 = eupVar18.w;
                aejl aejlVar7 = eupVar18.m;
                aejl aejlVar8 = eupVar18.pR;
                aejl aejlVar9 = eupVar18.pP;
                aejl aejlVar10 = eupVar18.pS;
                aejl aejlVar11 = eupVar18.ii;
                aejl aejlVar12 = aejj.a;
                return new tvz(aejlVar3, aejlVar4, aejlVar5, aejlVar6, aejlVar7, aejlVar8, aejlVar9, aejlVar10, aejlVar11, aejlVar12, aejlVar12, eupVar18.pT, eupVar18.pU, eupVar18.pV, eupVar18.pW);
            case 871:
                eup eupVar19 = this.a;
                return new txq((Context) eupVar19.n.a(), (zyh) eupVar19.w.a());
            case 872:
                eup eupVar20 = this.a;
                return new mbp(aejj.a, eupVar20.pL, eupVar20.pN, eupVar20.pQ, eupVar20.w, eupVar20.m);
            case 873:
                return yqt.i(this.a.cH());
            case 874:
                eup eupVar21 = this.a;
                aejl aejlVar13 = eupVar21.pw;
                wma wmaVar2 = (wma) eupVar21.pJ.a();
                wmk wmkVar2 = (wmk) eupVar21.py.a();
                return (adkp) adkq.a(wmg.a(aejlVar13, wmaVar2, (aask) eupVar21.pD.a(), ypv.a)).g(wmkVar2, eupVar21.ev());
            case 875:
                zte zteVarB2 = tek.b();
                wlw wlwVar2 = new wlw();
                wlwVar2.a = zteVarB2.a;
                wlwVar2.b = Integer.valueOf(zteVarB2.a());
                wlwVar2.b(adlf.f);
                return wlwVar2.c();
            case 876:
                return yqt.i((mbt) this.a.pM.a());
            case 877:
                eup eupVar22 = this.a;
                return new Soda((Context) eupVar22.n.a(), (zyg) eupVar22.w.a(), (zyh) eupVar22.m.a());
            case 878:
                eup eupVar23 = this.a;
                return new max((Context) eupVar23.n.a(), (zyg) eupVar23.A.a(), (zyg) eupVar23.w.a(), (zyh) eupVar23.m.a(), Optional.of((tru) eupVar23.pG.a()), Optional.empty(), Optional.of(eupVar23.cH()), Optional.of((mck) eupVar23.pP.a()));
            case 879:
                return ((etw) this.a.pO.a()).a(new tvc());
            case 880:
                return new etw(this);
            case 881:
                eup eupVar24 = this.a;
                return new ttn(eupVar24.pH, eupVar24.pX, eupVar24.m);
            case 882:
                eup eupVar25 = this.a;
                return new twr(eupVar25.qm, eupVar25.rP, eupVar25.rQ, eupVar25.rR, eupVar25.m, eupVar25.A, eupVar25.qQ);
            case 883:
                return new sdd((sdl) this.a.qc.a());
            case 884:
                eup eupVar26 = this.a;
                return new sdl((sdg) eupVar26.qa.a(), (sdm) eupVar26.qb.a(), eupVar26.dg(), eupVar26.dh(), (smw) eupVar26.qj.a(), (swu) eupVar26.ql.a());
            case 885:
                eup eupVar27 = this.a;
                return new sdg((Executor) eupVar27.A.a(), eupVar27.o());
            case 886:
                return new sdm();
            case 887:
                snk snkVar = (snk) this.a.qi.a();
                snkVar.getClass();
                return snkVar;
            case 888:
                eup eupVar28 = this.a;
                return new snk((sxr) eupVar28.qd.a(), eupVar28.m106do(), (smu) eupVar28.qg.a(), (mcw) eupVar28.i.a(), (szs) eupVar28.qh.a(), (ahbt) eupVar28.q.a());
            case 889:
                eup eupVar29 = this.a;
                return new sxx((Executor) eupVar29.m.a());
            case 890:
                eup eupVar30 = this.a;
                return new snr(aejf.b(eupVar30.qe), (Executor) eupVar30.m.a(), (Context) eupVar30.n.a(), eupVar30.eK());
            case 891:
                eup eupVar31 = this.a;
                Context context = (Context) eupVar31.n.a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) eupVar31.m.a();
                context.getClass();
                scheduledExecutorService2.getClass();
                return new sor(scheduledExecutorService2, new uqn(context, "STREAMZ_AUDIO_LIBRARY_ANDROID"), (Application) context);
            case 892:
                eup eupVar32 = this.a;
                return new snh(eupVar32.dp(), (ahbt) eupVar32.q.a());
            case 893:
                return new szs((mcw) this.a.i.a());
            case 894:
                eup eupVar33 = this.a;
                return new swu(eupVar33.fU(), eupVar33.dz());
            case 895:
                eup eupVar34 = this.a;
                ((waa) eupVar34.P.a()).a("com.google.android.libraries.search.audio.device", "45693676").d();
                Context context2 = (Context) eupVar34.n.a();
                eupVar34.o();
                eupVar34.o();
                ((waa) eupVar34.P.a()).a("com.google.android.libraries.search.audio.device", "45690654").d();
                return new sws(context2);
            case 896:
                return new sjf((sjw) this.a.qp.a());
            case 897:
                eup eupVar35 = this.a;
                return new skx((skf) eupVar35.qn.a(), (sjl) eupVar35.rK.a(), eupVar35.dB(), eupVar35.dv(), (smw) eupVar35.qj.a(), (swe) eupVar35.rO.a(), (sez) eupVar35.rM.a());
            case 898:
                return new skf();
            case 899:
                eup eupVar36 = this.a;
                slj sljVar = (slj) eupVar36.qo.a();
                sje sjeVar = new sje(eupVar36.qp, eupVar36.qq);
                eupVar36.dl();
                return new sjl(sljVar, sjeVar, (smw) eupVar36.qj.a(), eupVar36.dB(), eupVar36.dv());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.b;
        switch (i) {
            case 900:
                return new slj((mcw) this.a.i.a());
            case 901:
                return new sjc();
            case 902:
                eup eupVar = this.a;
                skf skfVar = (skf) eupVar.qn.a();
                smw smwVar = (smw) eupVar.qj.a();
                slj sljVar = (slj) eupVar.qo.a();
                swx swxVarDA = eupVar.dA();
                eupVar.hC();
                eupVar.hF();
                aejl aejlVar = eupVar.rg;
                srx srxVarDv = eupVar.dv();
                sss sssVarDw = eupVar.dw();
                sly slyVar = (sly) aejlVar.a();
                Executor executor = (Executor) eupVar.m.a();
                zwv zwvVar = (zwv) eupVar.rv.a();
                eupVar.hK();
                ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45623219").d();
                ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45681052").d();
                ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45681843").d();
                return new sxn(skfVar, smwVar, sljVar, swxVarDA, srxVarDv, sssVarDw, slyVar, executor, zwvVar);
            case 903:
                return new sau();
            case 904:
                return new skz((slj) this.a.qo.a());
            case 905:
                eup eupVar2 = this.a;
                return new sfp(eupVar2.m, eupVar2.q, eupVar2.n, eupVar2.qu, eupVar2.qj, eupVar2.qB, eupVar2.qC, eupVar2.qD);
            case 906:
                eup eupVar3 = this.a;
                return new sge((Context) eupVar3.n.a(), (Executor) eupVar3.m.a(), (ahbt) eupVar3.q.a(), eupVar3.hv(), eupVar3.o(), aejf.b(eupVar3.bv), (wxc) eupVar3.ii.a(), eupVar3.dC());
            case 907:
                TelephonyManager telephonyManager = (TelephonyManager) ((Context) this.a.n.a()).getSystemService("phone");
                telephonyManager.getClass();
                return telephonyManager;
            case 908:
                eup eupVar4 = this.a;
                Context context = (Context) eupVar4.n.a();
                sge sgeVar = (sge) eupVar4.qu.a();
                eupVar4.hD();
                return new sgj(context, sgeVar);
            case 909:
                eup eupVar5 = this.a;
                Context context2 = (Context) eupVar5.n.a();
                eupVar5.o();
                sge sgeVar2 = (sge) eupVar5.qu.a();
                eupVar5.hE();
                return new sgh(context2, sgeVar2);
            case 910:
                eup eupVar6 = this.a;
                aehf aehfVarB = aejf.b(eupVar6.qw);
                aehf aehfVarB2 = aejf.b(eupVar6.qx);
                aehfVarB.getClass();
                aehfVarB2.getClass();
                if (Build.VERSION.SDK_INT >= 31) {
                    Object objA = aehfVarB2.a();
                    objA.getClass();
                    return (sfm) objA;
                }
                Object objA2 = aehfVarB.a();
                objA2.getClass();
                return (sfm) objA2;
            case 911:
                eup eupVar7 = this.a;
                Context context3 = (Context) eupVar7.n.a();
                eupVar7.o();
                sge sgeVar3 = (sge) eupVar7.qu.a();
                eupVar7.hE();
                return new sgi(context3, sgeVar3);
            case 912:
                eup eupVar8 = this.a;
                Context context4 = (Context) eupVar8.n.a();
                eupVar8.o();
                return new sfo(context4, (sge) eupVar8.qu.a());
            case 913:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.audio.device", "45644942").d());
            case 914:
                return (abwf) ((waa) this.a.P.a()).a("com.google.android.libraries.search.audio.device", "45618546").b();
            case 915:
                return (abwf) ((waa) this.a.P.a()).a("com.google.android.libraries.search.audio.device", "45626725").b();
            case 916:
                return Long.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.audio.device", "45673521").a());
            case 917:
                eup eupVar9 = this.a;
                skf skfVar2 = (skf) eupVar9.qn.a();
                sms smsVar = (sms) eupVar9.qG.a();
                spf spfVar = (spf) eupVar9.qK.a();
                smw smwVar2 = (smw) eupVar9.qj.a();
                srv srvVarDu = eupVar9.du();
                slj sljVar2 = (slj) eupVar9.qo.a();
                sss sssVarDw2 = eupVar9.dw();
                ahbt ahbtVar = (ahbt) eupVar9.q.a();
                aeqt.a(eupVar9.P);
                sld sldVar = (sld) eupVar9.rE.a();
                eupVar9.dq();
                return new srk(skfVar2, smsVar, spfVar, smwVar2, srvVarDu, sljVar2, sssVarDw2, ahbtVar, sldVar, (euf) eupVar9.rF.a(), (spi) eupVar9.qL.a());
            case 918:
                return new sms(zcp.b, (Executor) this.a.m.a());
            case 919:
                eup eupVar10 = this.a;
                return new spf(eupVar10.dx(), (ahbt) eupVar10.q.a());
            case 920:
                eup eupVar11 = this.a;
                eupVar11.o();
                smx smxVar = (smx) eupVar11.qH.a();
                slj sljVar3 = (slj) eupVar11.qo.a();
                Context context5 = (Context) eupVar11.n.a();
                Executor executor2 = (Executor) eupVar11.m.a();
                ahbt ahbtVar2 = (ahbt) eupVar11.q.a();
                agte agteVar = (agte) eupVar11.bW.a();
                eupVar11.hw();
                return new stw(smxVar, sljVar3, context5, executor2, ahbtVar2, agteVar, eupVar11.dC());
            case 921:
                return new smx();
            case 922:
                return new stx((smx) this.a.qH.a());
            case 923:
                eup eupVar12 = this.a;
                return new spi((Context) eupVar12.n.a(), (Executor) eupVar12.m.a());
            case 924:
                eup eupVar13 = this.a;
                return new sue(eupVar13.o(), eupVar13.hw());
            case 925:
                eup eupVar14 = this.a;
                return new ssi((spi) eupVar14.qL.a(), eupVar14.dq(), eupVar14.ds(), (spf) eupVar14.qK.a(), eupVar14.de(), eupVar14.dr(), (Executor) eupVar14.m.a(), (ahbt) eupVar14.q.a(), (smw) eupVar14.qj.a(), (zwv) eupVar14.rv.a(), eupVar14.dt(), ((waa) eupVar14.P.a()).a("com.google.android.libraries.search.audio.device", "45617436").d(), ((waa) eupVar14.P.a()).a("com.google.android.libraries.search.audio.device", "45691731").d(), eupVar14.dm(), (eud) eupVar14.rB.a());
            case 926:
                eup eupVar15 = this.a;
                return new sey(eupVar15.qN, eupVar15.qO);
            case 927:
                return new slh(this.a.i);
            case 928:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.audio.device", "45531217").d());
            case 929:
                sea seaVar = (sea) this.a.qS.a();
                seaVar.getClass();
                return seaVar;
            case 930:
                return new sea((sek) this.a.qR.a());
            case 931:
                eup eupVar16 = this.a;
                return new sek((sah) eupVar16.qQ.a(), (Context) eupVar16.n.a());
            case 932:
                return new sah();
            case 933:
                eup eupVar17 = this.a;
                return new sae((Context) eupVar17.n.a(), eupVar17.o(), ((waa) eupVar17.P.a()).a("com.google.android.libraries.search.audio.device", "45623980").d());
            case 934:
                return new seq(this.a.o());
            case 935:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.audio.device", "45674715").d());
            case 936:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.libraries.search.audio.device", "45674716").d());
            case 937:
                return new sly();
            case 938:
                return new Object() { // from class: slx
                };
            case 939:
                eup eupVar18 = this.a;
                Executor executor3 = (Executor) eupVar18.g.a();
                Executor executor4 = (Executor) eupVar18.A.a();
                executor3.getClass();
                executor4.getClass();
                Boolean bool = false;
                bool.getClass();
                return executor4;
            case 940:
                return new sca(this.a.q);
            case 941:
                return new say(this.a.qj);
            case 942:
                return new scz(this.a.rl);
            case 943:
                return new etx(this);
            case 944:
                return new sqo(this.a.m);
            case 945:
                return new ety(this);
            case 946:
                eup eupVar19 = this.a;
                return new suh((mcw) eupVar19.i.a(), (etz) eupVar19.ro.a());
            case 947:
                return new etz(this);
            case 948:
                return new eua(this);
            case 949:
                return new eub(this);
            case 950:
                return new sot(aejf.b(this.a.rs));
            case 951:
                return new zwv();
            case 952:
                return new sbs(this.a.qj);
            case 953:
                return new eud(this);
            case 954:
                eup eupVar20 = this.a;
                return new syf((syl) eupVar20.rx.a(), (sze) eupVar20.rz.a());
            case 955:
                eup eupVar21 = this.a;
                return new syl((slj) eupVar21.qo.a(), (ahbt) eupVar21.q.a(), (zyh) eupVar21.m.a());
            case 956:
                eup eupVar22 = this.a;
                return new sze((eue) eupVar22.ry.a(), ((waa) eupVar22.P.a()).a("com.google.android.libraries.search.audio.device", "45638660").d());
            case 957:
                return new eue(this);
            case 958:
                eup eupVar23 = this.a;
                eupVar23.hI();
                eupVar23.ds();
                spf spfVar2 = (spf) eupVar23.qK.a();
                eupVar23.de();
                eupVar23.dr();
                Executor executor5 = (Executor) eupVar23.m.a();
                ahbt ahbtVar3 = (ahbt) eupVar23.q.a();
                smw smwVar3 = (smw) eupVar23.qj.a();
                zwv zwvVar2 = (zwv) eupVar23.rv.a();
                eupVar23.dt();
                eupVar23.dm();
                return new ssp(spfVar2, executor5, ahbtVar3, smwVar3, zwvVar2, (eud) eupVar23.rB.a());
            case 959:
                return new sld((ahbt) this.a.q.a());
            case 960:
                return new euf();
            case 961:
                eup eupVar24 = this.a;
                skf skfVar3 = (skf) eupVar24.qn.a();
                sms smsVar2 = (sms) eupVar24.qG.a();
                spf spfVar3 = (spf) eupVar24.qK.a();
                smw smwVar4 = (smw) eupVar24.qj.a();
                eupVar24.du();
                slj sljVar4 = (slj) eupVar24.qo.a();
                eupVar24.dw();
                ahbt ahbtVar4 = (ahbt) eupVar24.q.a();
                aeqt.a(eupVar24.P);
                return new sro(skfVar3, smsVar2, spfVar3, smwVar4, sljVar4, ahbtVar4, (sld) eupVar24.rE.a());
            case 962:
                eup eupVar25 = this.a;
                skf skfVar4 = (skf) eupVar25.qn.a();
                smw smwVar5 = (smw) eupVar25.qj.a();
                slj sljVar5 = (slj) eupVar25.qo.a();
                eupVar25.hP();
                eupVar25.hC();
                eupVar25.dv();
                Executor executor6 = (Executor) eupVar25.m.a();
                zwv zwvVar3 = (zwv) eupVar25.rv.a();
                eupVar25.hK();
                return new sxp(skfVar4, smwVar5, sljVar5, executor6, zwvVar3);
            case 963:
                eup eupVar26 = this.a;
                return new swe((swh) eupVar26.rN.a(), ((waa) eupVar26.P.a()).a("com.google.android.libraries.search.audio.device", "45686056").d());
            case 964:
                eup eupVar27 = this.a;
                aejl aejlVar2 = eupVar27.rL;
                yyr yyrVar = zcl.a;
                svu svuVar = (svu) aejlVar2.a();
                sez sezVar = (sez) eupVar27.rM.a();
                smw smwVar6 = (smw) eupVar27.qj.a();
                ((waa) eupVar27.P.a()).a("com.google.android.libraries.search.audio.device", "45640285").d();
                ((waa) eupVar27.P.a()).a("com.google.android.libraries.search.audio.device", "45640284").d();
                return new swj(yyrVar, svuVar, sezVar, smwVar6);
            case 965:
                return new svu();
            case 966:
                Optional.empty();
                Optional.empty();
                return new sez(this.a.dC());
            case 967:
                eup eupVar28 = this.a;
                return new sml(eupVar28.df(), eupVar28.dj(), eupVar28.dk(), (eub) eupVar28.rr.a(), eupVar28.di(), (ahbt) eupVar28.lw.a());
            case 968:
                return new uab((Context) this.a.n.a());
            case 969:
                eup eupVar29 = this.a;
                return new gqq((Context) eupVar29.n.a(), eupVar29.bj(), eupVar29.C(), (gfr) eupVar29.cu.a(), (gmd) eupVar29.eV.a(), (hab) eupVar29.fe.a(), eupVar29.rV, eupVar29.rW);
            case 970:
                return Boolean.valueOf(((waa) new aekw(this.a.P).a.a()).a("com.google.android.katniss.device", "45387896").d());
            case 971:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45662392").d());
            case 972:
                eup eupVar30 = this.a;
                Context context6 = (Context) eupVar30.n.a();
                iax iaxVar = (iax) eupVar30.gb.a();
                fda fdaVar = (fda) eupVar30.fS.a();
                ahbt ahbtVar5 = (ahbt) eupVar30.q.a();
                aejl aejlVar3 = eupVar30.bE;
                return new ipl(context6, iaxVar, fdaVar, ahbtVar5, eupVar30.bj(), (gtu) aejlVar3.a(), eupVar30.f(), new fus((fpg) eupVar30.bU.a()));
            case 973:
                eup eupVar31 = this.a;
                return new iry((gfr) eupVar31.cu.a(), (Map) eupVar31.rZ.a(), (ghr) eupVar31.fg.a());
            case 974:
                return irx.b(this.a.gD());
            case 975:
                eup eupVar32 = this.a;
                return new hut((Context) eupVar32.n.a(), (ahbt) eupVar32.y.a());
            case 976:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373975").b();
            case 977:
                return (acfo) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45381130").b();
            case 978:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373969").b();
            case 979:
                return (acfo) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45381641").b();
            case 980:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373970").b();
            case 981:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373971").b();
            case 982:
                eup eupVar33 = this.a;
                return new gpd((Executor) eupVar33.m.a(), (wxc) eupVar33.ii.a());
            case 983:
                return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45373296").d());
            case 984:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373310").b();
            case 985:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373974").b();
            case 986:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373976").b();
            case 987:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373967").b();
            case 988:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45373977").b();
            case 989:
                return (abwf) ((waa) new aeoi(this.a.P).a.a()).a("com.google.android.katniss.device", "45689607").b();
            case 990:
                return Boolean.valueOf(((waa) new aelp(this.a.P).a.a()).a("com.google.android.katniss.device", "45633075").d());
            case 991:
                tzh tzhVar = (tzh) this.a.st.a();
                zcp zcpVar = zcp.b;
                zcpVar.getClass();
                return new uaa(tzhVar, zcpVar);
            case 992:
                eup eupVar34 = this.a;
                tuj tujVar = (tuj) eupVar34.rT.a();
                aejl aejlVar4 = eupVar34.sr;
                tzi tziVarDP = eupVar34.dP();
                tyi tyiVar = (tyi) aejlVar4.a();
                tuy tuyVar = new tuy();
                aejl aejlVar5 = eupVar34.ss;
                return new tzh(tujVar, tziVarDP, tyiVar, tuyVar, Optional.of((tur) aejlVar5.a()), Optional.of((tus) aejlVar5.a()));
            case 993:
                eup eupVar35 = this.a;
                return new tyi((zyh) eupVar35.m.a());
            case 994:
                eup eupVar36 = this.a;
                return new tuq((ros) eupVar36.ps.a(), (String) eupVar36.fw.a(), (tru) eupVar36.pG.a());
            case 995:
                eup eupVar37 = this.a;
                return new gou((Context) eupVar37.n.a(), (Executor) eupVar37.m.a(), (wxc) eupVar37.ii.a());
            case 996:
                eup eupVar38 = this.a;
                return new gpc((Executor) eupVar38.m.a(), (jcy) eupVar38.gx.a(), eupVar38.gP, (PowerManager) eupVar38.aP.a(), (wxc) eupVar38.ii.a());
            case 997:
                eup eupVar39 = this.a;
                return new gxj((fby) eupVar39.hh.a(), (ahbt) eupVar39.q.a(), (Executor) eupVar39.m.a(), (wxc) eupVar39.ii.a());
            case 998:
                eup eupVar40 = this.a;
                return new gpe((fby) eupVar40.hh.a(), (Executor) eupVar40.m.a(), (wxc) eupVar40.ii.a());
            case 999:
                eup eupVar41 = this.a;
                return new gly((ahbt) eupVar41.y.a(), eupVar41.X(), (gmd) eupVar41.eV.a(), (ztw) eupVar41.ao.a());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.agow
    public final Object a() {
        Object gwxVar;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                switch (i) {
                    case 300:
                        eup eupVar = this.a;
                        return new rcn(eupVar.cV(), (zyh) eupVar.cw.a(), aejf.b(eupVar.ei), aejf.b(eupVar.ej), eupVar.ek, eupVar.cY(), (rcy) eupVar.em.a());
                    case 301:
                        rcb rcbVar = (rcb) qpc.a(ypv.a, new agow() { // from class: qpb
                            @Override // defpackage.agow
                            public final Object a() {
                                return new rbu(new rca());
                            }
                        });
                        rcbVar.getClass();
                        return rcbVar;
                    case 302:
                        rce rceVar = (rce) qpc.a(ypv.a, new agow() { // from class: qoz
                            @Override // defpackage.agow
                            public final Object a() {
                                rcd rcdVarF = rce.f();
                                ((rbv) rcdVarF).c = 2;
                                return rcdVarF.b();
                            }
                        });
                        rceVar.getClass();
                        return rceVar;
                    case 303:
                        return aeyj.a.eV().a((Context) this.a.n.a());
                    case 304:
                        eup eupVar2 = this.a;
                        return new rcy((mcw) eupVar2.cZ.a(), (yqt) ((aejh) eupVar2.el).b);
                    case 305:
                        eup eupVar3 = this.a;
                        return new rbr(eupVar3.cV(), (Executor) eupVar3.cE.a(), aejf.b(eupVar3.en), aejf.b(eupVar3.eo), eupVar3.ep, eupVar3.cY());
                    case 306:
                        rbk rbkVar = (rbk) qpc.a(yqt.i(this.a.eh), new agow() { // from class: qox
                            @Override // defpackage.agow
                            public final Object a() {
                                rbj rbjVarG = rbk.g();
                                ((rbg) rbjVarG).d = 2;
                                return rbjVarG.c();
                            }
                        });
                        rbkVar.getClass();
                        return rbkVar;
                    case 307:
                        return ypv.a;
                    case 308:
                        return aeyf.a.eV().a((Context) this.a.n.a());
                    case 309:
                        return new rbt((rbr) this.a.eq.a(), ypv.a);
                    case 310:
                        eup eupVar4 = this.a;
                        aejl aejlVar = eupVar4.cZ;
                        quy quyVarCV = eupVar4.cV();
                        Object objA = eupVar4.eu.a();
                        zyh zyhVar = (zyh) eupVar4.cw.a();
                        aehf aehfVarB = aejf.b(eupVar4.es);
                        Object objA2 = eupVar4.ex.a();
                        return new qzl(quyVarCV, (qzf) objA, zyhVar, aehfVarB, (qzr) objA2, (qpv) eupVar4.cx.a(), eupVar4.ey, (Executor) eupVar4.cE.a());
                    case 311:
                        eup eupVar5 = this.a;
                        qst qstVar = (qst) eupVar5.dr.a();
                        zyh zyhVar2 = (zyh) eupVar5.cw.a();
                        Executor executor = (Executor) eupVar5.cE.a();
                        aehf aehfVarB2 = aejf.b(eupVar5.es);
                        aejf.b(eupVar5.et);
                        return new qzf(qstVar, zyhVar2, executor, aehfVarB2);
                    case 312:
                        qyx qyxVar = (qyx) ((agow) ((yqz) yqt.i(this.a.er)).a).a();
                        qyxVar.getClass();
                        return qyxVar;
                    case 313:
                        return new qyt(ypv.a);
                    case 314:
                        return Long.valueOf(aexj.a.eV().a((Context) this.a.n.a()));
                    case 315:
                        eup eupVar6 = this.a;
                        return new qzr(eupVar6.es, (Context) eupVar6.n.a(), eupVar6.ev, eupVar6.ew, (qtj) eupVar6.dR.a());
                    case 316:
                        return Boolean.valueOf(aexj.a.eV().d((Context) this.a.n.a()));
                    case 317:
                        return Boolean.valueOf(aexj.a.eV().c((Context) this.a.n.a()));
                    case 318:
                        return aexj.a.eV().b((Context) this.a.n.a());
                    case 319:
                        eup eupVar7 = this.a;
                        return new rat(eupVar7.cV(), (zyh) eupVar7.cw.a(), (Executor) eupVar7.cE.a(), aejf.b(eupVar7.eA), eupVar7.eB);
                    case 320:
                        ypv ypvVar = ypv.a;
                        return new rad(ypvVar, ypvVar);
                    case 321:
                        return aexx.a.eV().c((Context) this.a.n.a());
                    case 322:
                        return Boolean.valueOf(aexx.a.eV().d((Context) this.a.n.a()));
                    case 323:
                        return Long.valueOf(aexx.a.eV().b((Context) this.a.n.a()));
                    case 324:
                        return Long.valueOf(aexx.a.eV().a((Context) this.a.n.a()));
                    case 325:
                        return new quc();
                    case 326:
                        eup eupVar8 = this.a;
                        yqt.i(eupVar8.dx);
                        qyg qygVar = (qyg) eupVar8.dz.a();
                        qygVar.getClass();
                        return qygVar;
                    case 327:
                        eup eupVar9 = this.a;
                        return new qyw();
                    case 328:
                        qyu qyuVar = (qyu) qpc.a(ypv.a, new agow() { // from class: qou
                            @Override // defpackage.agow
                            public final Object a() {
                                return new qys(2, TimeUnit.MINUTES.toMillis(5L) + TimeUnit.SECONDS.toMillis(20L), zcp.b);
                            }
                        });
                        qyuVar.getClass();
                        return qyuVar;
                    case 329:
                        return new rac();
                    case 330:
                        rbd rbdVar = (rbd) this.a.eg.a();
                        rbdVar.getClass();
                        return rbdVar;
                    case 331:
                        eup eupVar10 = this.a;
                        yqt.i(eupVar10.eh);
                        rbn rbnVar = (rbn) eupVar10.eq.a();
                        rbnVar.getClass();
                        return rbnVar;
                    case 332:
                        return new rbx();
                    case 333:
                        eup eupVar11 = this.a;
                        yqt.i(eupVar11.eh);
                        rbi rbiVar = (rbi) eupVar11.eq.a();
                        rbiVar.getClass();
                        return rbiVar;
                    case 334:
                        eup eupVar12 = this.a;
                        return new raw((qst) eupVar12.dr.a(), eupVar12.eC, eupVar12.eD, eupVar12.eE, eupVar12.eF, aejf.b(eupVar12.eo));
                    case 335:
                        eup eupVar13 = this.a;
                        return new xad(eupVar13.eM, eupVar13.eK, eupVar13.eL, eupVar13.eN, eupVar13.eO, eupVar13.eP);
                    case 336:
                        return new wyu();
                    case 337:
                        return Boolean.valueOf(aeyj.a.eV().c((Context) this.a.n.a()));
                    case 338:
                        return Boolean.valueOf(aeyj.a.eV().b((Context) this.a.n.a()));
                    case 339:
                        return Boolean.valueOf(aeyj.a.eV().d((Context) this.a.n.a()));
                    case 340:
                        eup eupVar14 = this.a;
                        return new gmf(eupVar14.N(), (ztw) eupVar14.ao.a());
                    case 341:
                        eup eupVar15 = this.a;
                        return new gri(eupVar15.bH(), (jam) eupVar15.eW.a(), eupVar15.k());
                    case 342:
                        return new jam();
                    case 343:
                        fea feaVar = new fea();
                        eup eupVar16 = this.a;
                        return new fiu(feaVar, (fhi) eupVar16.an.a(), (fxt) eupVar16.t.a());
                    case 344:
                        eup eupVar17 = this.a;
                        return new gpx((fiu) eupVar17.eY.a(), (Context) eupVar17.n.a(), (ahbt) eupVar17.q.a(), eupVar17.eZ, eupVar17.k(), eupVar17.fa, (eul) eupVar17.fh.a(), eupVar17.fi);
                    case 345:
                        return Boolean.valueOf(((waa) new aemv(this.a.P).a.a()).a("com.google.android.katniss.device", "45388213").d());
                    case 346:
                        Context context = (Context) this.a.n.a();
                        context.getClass();
                        List<SearchableInfo> searchablesInGlobalSearch = ((SearchManager) context.getSystemService(SearchManager.class)).getSearchablesInGlobalSearch();
                        return searchablesInGlobalSearch == null ? agrd.a : searchablesInGlobalSearch;
                    case 347:
                        return new eul(this);
                    case 348:
                        return new fcu(this.a.k());
                    case 349:
                        eup eupVar18 = this.a;
                        return new fja((fiu) eupVar18.eY.a(), (fxu) eupVar18.t.a());
                    case 350:
                        eup eupVar19 = this.a;
                        return new fsg(eupVar19.ap(), (fxu) eupVar19.t.a());
                    case 351:
                        eup eupVar20 = this.a;
                        return new hab((fiu) eupVar20.eY.a(), (Context) eupVar20.n.a(), (agte) eupVar20.x.a(), (ahbt) eupVar20.q.a(), eupVar20.bj(), eupVar20.k());
                    case 352:
                        eup eupVar21 = this.a;
                        return new fqm(eupVar21.al(), (fxu) eupVar21.t.a());
                    case 353:
                        return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45674614").d());
                    case 354:
                        eup eupVar22 = this.a;
                        return new jal((Context) eupVar22.n.a(), (agte) eupVar22.x.a(), (wke) eupVar22.fk.a(), eupVar22.fp, eupVar22.eL());
                    case 355:
                        final Context context2 = (Context) this.a.n.a();
                        return new wke(new agow() { // from class: wkh
                            @Override // defpackage.agow
                            public final Object a() {
                                Context context3 = context2;
                                return (wjy) cyg.c(context3).b(context3);
                            }
                        }, new wkf() { // from class: wki
                            @Override // defpackage.wkf
                            public final void a(wke wkeVar) {
                            }
                        }, false);
                    case 356:
                        return new htg((gnj) this.a.fo.a());
                    case 357:
                        eup eupVar23 = this.a;
                        return new gnr(new gnd((gne) eupVar23.fl.a(), (gng) eupVar23.fm.a(), (agte) eupVar23.x.a(), (ahbt) eupVar23.y.a(), (ahbt) eupVar23.q.a()), (Context) eupVar23.n.a(), (ahbt) eupVar23.y.a(), (ahbt) eupVar23.q.a(), (gni) eupVar23.fn.a(), (ztw) eupVar23.ao.a());
                    case 358:
                        return new gne();
                    case 359:
                        return new gng((Context) this.a.n.a());
                    case 360:
                        return new gni((Context) this.a.n.a());
                    case 361:
                        return new hvf(this.a.dQ());
                    case 362:
                        return new upu();
                    case 363:
                        return new jca((Context) this.a.n.a());
                    case 364:
                        return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45657511").d());
                    case 365:
                        String str = ((PackageInfo) this.a.z.a()).versionName;
                        str.getClass();
                        return str;
                    case 366:
                        eup eupVar24 = this.a;
                        Context context3 = (Context) eupVar24.n.a();
                        String str2 = ((rry) eupVar24.dc()).a;
                        List list = jyw.m;
                        return new jyt(context3, str2).b();
                    case 367:
                        return new gfu(this.a.fA);
                    case 368:
                        return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45676203").d());
                    case 369:
                        eup eupVar25 = this.a;
                        return new gex((ahbt) eupVar25.q.a(), eupVar25.N());
                    case 370:
                        return new eum(this);
                    case 371:
                        eup eupVar26 = this.a;
                        return new gfp((mcw) eupVar26.i.a(), (eun) eupVar26.fI.a(), (ets) eupVar26.fJ.a());
                    case 372:
                        return new eun(this);
                    case 373:
                        return new ets(this);
                    case 374:
                        eup eupVar27 = this.a;
                        return new fki((fhi) eupVar27.an.a(), (fxt) eupVar27.t.a());
                    case 375:
                        return Boolean.valueOf(((waa) new aemp(this.a.P).a.a()).a("com.google.android.katniss.device", "45666482").d());
                    case 376:
                        return new gns();
                    case 377:
                        eup eupVar28 = this.a;
                        return new gks((ahbt) eupVar28.q.a(), eupVar28.fP, (gfr) eupVar28.cu.a(), (gnz) eupVar28.bt.a());
                    case 378:
                        return Boolean.valueOf(((waa) new aemv(this.a.P).a.a()).a("com.google.android.katniss.device", "45409625").d());
                    case 379:
                        eup eupVar29 = this.a;
                        fqa fqaVarAk = eupVar29.ak();
                        AccountManager accountManager = (AccountManager) ((Context) eupVar29.n.a()).getSystemService("account");
                        accountManager.getClass();
                        gwxVar = new gwx(fqaVarAk, accountManager, eupVar29.bB(), (ahbt) eupVar29.q.a(), eupVar29.cg(), eupVar29.bD(), (fda) eupVar29.fS.a(), eupVar29.bj(), (gtu) eupVar29.bE.a(), (ffp) eupVar29.by.a(), eupVar29.aA(), eupVar29.fU, (fcu) eupVar29.fb.a(), eupVar29.gg, eupVar29.bw(), (idl) eupVar29.ga.a());
                        break;
                    case 380:
                        eup eupVar30 = this.a;
                        gwxVar = new icd(eupVar30.an(), (fda) eupVar30.fS.a(), (Context) eupVar30.n.a(), (agte) eupVar30.fR.a(), (ahbt) eupVar30.q.a(), eupVar30.fT, eupVar30.bj(), eupVar30.aM(), (gtu) eupVar30.bE.a(), eupVar30.fU, (fcu) eupVar30.fb.a(), eupVar30.k(), eupVar30.fV, (idl) eupVar30.ga.a(), (idu) eupVar30.fZ.a(), eupVar30.eL(), (ztw) eupVar30.ao.a(), (ghp) eupVar30.ar.a(), (ghr) eupVar30.fg.a(), eupVar30.aD(), eupVar30.gO());
                        break;
                    case 381:
                        eup eupVar31 = this.a;
                        return new fdn((Context) eupVar31.n.a(), (ahbt) eupVar31.q.a(), (agte) eupVar31.x.a(), new fdw(eupVar31.ee(), (agte) eupVar31.fR.a(), eupVar31.bj()), (hag) eupVar31.s.a(), (ghp) eupVar31.ar.a());
                    case 382:
                        eup eupVar32 = this.a;
                        vwg vwgVarEj = eupVar32.ej();
                        zyh zyhVar3 = (zyh) eupVar32.A.a();
                        zyhVar3.getClass();
                        agte agteVarA = vwgVarEj.a(zyhVar3);
                        agteVarA.getClass();
                        return agteVarA;
                    case 383:
                        return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45659667").d());
                    case 384:
                        return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45376995").d());
                    case 385:
                        return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45377070").d());
                    case 386:
                        eup eupVar33 = this.a;
                        gwxVar = new idt(eupVar33.ak(), eupVar33.i(), (ahbt) eupVar33.y.a(), (ahbt) eupVar33.q.a(), eupVar33.ap(), eupVar33.bj(), eupVar33.hf(), (fjr) eupVar33.fW.a(), (gyy) eupVar33.fX.a(), (gtu) eupVar33.bE.a(), (icr) eupVar33.by.a(), (hag) eupVar33.s.a(), eupVar33.bZ(), (idu) eupVar33.fZ.a(), eupVar33.aD());
                        break;
                    case 387:
                        eup eupVar34 = this.a;
                        return new fjr((fhi) eupVar34.an.a(), (fxt) eupVar34.t.a());
                    case 388:
                        eup eupVar35 = this.a;
                        return new jdn(eupVar35.ee(), (ahbt) eupVar35.y.a());
                    case 389:
                        eup eupVar36 = this.a;
                        return new idv((Context) eupVar36.n.a(), (icr) eupVar36.by.a(), (ztw) eupVar36.ao.a());
                    case 390:
                        eup eupVar37 = this.a;
                        return new igs((Context) eupVar37.n.a(), (gmu) eupVar37.gd.a(), eupVar37.ge);
                    case 391:
                        eup eupVar38 = this.a;
                        aejl aejlVar2 = eupVar38.eU;
                        hag hagVar = (hag) eupVar38.s.a();
                        aejl aejlVar3 = eupVar38.gc;
                        aejlVar2.getClass();
                        hagVar.getClass();
                        aejlVar3.getClass();
                        if (hagVar == hag.d) {
                            aejlVar2 = aejlVar3;
                        }
                        Object objA3 = aejlVar2.a();
                        objA3.getClass();
                        return (gmu) objA3;
                    case 392:
                        eup eupVar39 = this.a;
                        return new gmv(eupVar39.cu, eupVar39.eS, eupVar39.eL(), (ztw) eupVar39.ao.a());
                    case 393:
                        return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45658093").d());
                    case 394:
                        return Boolean.valueOf(((waa) new aene(this.a.P).a.a()).a("com.google.android.katniss.device", "45414597").d());
                    case 395:
                        return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45642482").d());
                    case 396:
                        eup eupVar40 = this.a;
                        return new jhv(eupVar40.gj, (Context) eupVar40.n.a(), (ahbt) eupVar40.y.a());
                    case 397:
                        return Boolean.valueOf(((waa) new aemd(this.a.P).a.a()).a("com.google.android.katniss.device", "45687356").d());
                    case 398:
                        eup eupVar41 = this.a;
                        return new jmz(new jmr((fda) eupVar41.fS.a(), eupVar41.gl), (agte) eupVar41.fR.a(), (ahbt) eupVar41.q.a());
                    case 399:
                        return Boolean.valueOf(((waa) this.a.P.a()).a("com.google.android.katniss.device", "45651722").d());
                    default:
                        throw new AssertionError(i);
                }
                return gwxVar;
            case 4:
                return e();
            case 5:
                return f();
            case 6:
                return g();
            case 7:
                return h();
            case 8:
                return i();
            case 9:
                return j();
            default:
                switch (i) {
                    case 1000:
                        return new tol();
                    case 1001:
                        eup eupVar42 = this.a;
                        return new tjo((tnz) eupVar42.ci.a(), (Context) eupVar42.n.a(), (zyg) eupVar42.A.a(), eupVar42.eL(), (tmi) eupVar42.ca.a(), Optional.empty());
                    case 1002:
                        eup eupVar43 = this.a;
                        yqt yqtVarI = yqt.i((ahbt) eupVar43.q.a());
                        aejl aejlVar4 = eupVar43.m;
                        aejlVar4.getClass();
                        Object objA4 = aejlVar4.a();
                        objA4.getClass();
                        ahbu.b(new ahdc((ExecutorService) objA4).plus(new ahej()));
                        return (ahbt) ((yqz) yqtVarI).a;
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
