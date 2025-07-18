package com.google.android.katniss.search.serviceapi;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.abh;
import defpackage.abm;
import defpackage.aejl;
import defpackage.agow;
import defpackage.agte;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.etn;
import defpackage.eup;
import defpackage.evt;
import defpackage.ewc;
import defpackage.eyw;
import defpackage.fby;
import defpackage.fcu;
import defpackage.fex;
import defpackage.gkz;
import defpackage.glk;
import defpackage.gly;
import defpackage.gou;
import defpackage.gpb;
import defpackage.gpc;
import defpackage.gpd;
import defpackage.gpe;
import defpackage.gph;
import defpackage.gtu;
import defpackage.gxj;
import defpackage.gxn;
import defpackage.gyy;
import defpackage.gzu;
import defpackage.icl;
import defpackage.jbu;
import defpackage.jbx;
import defpackage.jcc;
import defpackage.jcv;
import defpackage.jcy;
import defpackage.jdt;
import defpackage.jhs;
import defpackage.jnb;
import defpackage.jod;
import defpackage.lxt;
import defpackage.lya;
import defpackage.lyd;
import defpackage.lyi;
import defpackage.lyj;
import defpackage.lyo;
import defpackage.lyp;
import defpackage.lyu;
import defpackage.lzb;
import defpackage.uea;
import defpackage.vrz;
import defpackage.vxe;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wmw;
import defpackage.wum;
import defpackage.wvm;
import defpackage.wvp;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwc;
import defpackage.wwq;
import defpackage.wwt;
import defpackage.wzg;
import defpackage.yqw;
import defpackage.zdv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KatnissVoiceInteractionService extends lxt implements wgt {
    public wmw a;
    private lyp b;
    private boolean c;
    private final wvp d = new wvp(this);

    @Deprecated
    public KatnissVoiceInteractionService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lyp L() {
        lyp lypVar = this.b;
        if (lypVar != null) {
            return lypVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.service.voice.VoiceInteractionService, android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinderOnBind;
        wwt wwtVarC = this.d.c(intent);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            wmwVar.b();
            lyp lypVarL = L();
            intent.getClass();
            ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "onBind", 351, "KatnissVoiceInteractionServicePeer.kt")).x("onBind(%s)", intent);
            String action = intent.getAction();
            if (action != null && action.hashCode() == -91252236 && action.equals("KATNISS_VIS_INTERFACE")) {
                lyd lydVar = lypVarL.A;
                lydVar.asBinder();
                iBinderOnBind = lydVar;
            } else {
                iBinderOnBind = super.onBind(intent);
            }
            wwtVarC.close();
            return iBinderOnBind;
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        wvp wvpVar = this.d;
        wwc wwcVarA = wvpVar.a();
        wwq wwqVar = wum.c().c;
        wvm wvmVar = new wvm(wzg.f(wvpVar.g("onConfigurationChanged"), wwcVarA, true), wvpVar.b("ChangeConfig"), wwqVar);
        try {
            lyp lypVarL = L();
            configuration.getClass();
            String languageTag = configuration.getLocales().get(0).toLanguageTag();
            languageTag.getClass();
            if (!agvy.c(languageTag, lypVarL.z)) {
                lypVarL.z = languageTag;
                lypVarL.f.C(languageTag);
                if (lypVarL.p) {
                    ahal.e(lypVarL.k, null, 0, new lyi(lypVarL, null), 3);
                }
            }
            wvmVar.close();
        } catch (Throwable th) {
            try {
                wvmVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.lxt, android.app.Service
    public final void onCreate() throws Throwable {
        wwt wwtVar;
        Throwable th;
        Object objDN;
        eup eupVar;
        AccessibilityManager accessibilityManagerU;
        ActivityManager activityManager;
        eyw eywVar;
        fby fbyVar;
        gkz gkzVar;
        jdt jdtVar;
        vxe vxeVarEk;
        aejl aejlVar;
        Context context;
        vrz vrzVarEe;
        wwt wwtVarD = this.d.d();
        try {
            this.c = true;
            yqw.L(getApplication() instanceof wip);
        } catch (Throwable th2) {
            th = th2;
            wwtVar = wwtVarD;
        }
        try {
            if (this.b != null) {
                wwtVar = wwtVarD;
            } else {
                if (!this.c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
                wvx wvxVarF = wzg.f("CreateComponent", wwb.a, true);
                try {
                    cO().dN();
                    wvxVarF.close();
                    wvx wvxVarF2 = wzg.f("CreatePeer", wwb.a, true);
                    try {
                        try {
                            try {
                                objDN = cO().dN();
                                eupVar = ((etn) objDN).b;
                                accessibilityManagerU = eupVar.u();
                                activityManager = (ActivityManager) eupVar.V.a();
                                eywVar = (eyw) eupVar.T.a();
                                fbyVar = (fby) eupVar.hh.a();
                                gkzVar = (gkz) eupVar.mk.a();
                                jdtVar = (jdt) eupVar.mc.a();
                                vxeVarEk = eupVar.ek();
                                aejlVar = eupVar.gy;
                                context = (Context) eupVar.n.a();
                                vrzVarEe = eupVar.ee();
                                wwtVar = wwtVarD;
                            } catch (Throwable th3) {
                                th = th3;
                                wwtVar = wwtVarD;
                            }
                            try {
                                agte agteVar = (agte) eupVar.fR.a();
                                ahbt ahbtVar = (ahbt) eupVar.y.a();
                                ahbt ahbtVar2 = (ahbt) eupVar.q.a();
                                gou gouVar = (gou) eupVar.sv.a();
                                gpb gpbVar = (gpb) eupVar.gD.a();
                                ewc ewcVar = (ewc) eupVar.gM.a();
                                jcv jcvVar = (jcv) eupVar.gE.a();
                                jcc jccVar = new jcc((jdt) eupVar.mc.a(), (Context) eupVar.n.a(), eupVar.k());
                                gxn gxnVar = (gxn) eupVar.me.a();
                                aejl aejlVar2 = eupVar.eZ;
                                jhs jhsVar = (jhs) eupVar.ln.a();
                                gph gphVarBj = eupVar.bj();
                                jbu jbuVar = (jbu) eupVar.mf.a();
                                aejl aejlVar3 = eupVar.gC;
                                gzu gzuVar = (gzu) eupVar.R.a();
                                gpc gpcVar = (gpc) eupVar.sw.a();
                                boolean zHf = eupVar.hf();
                                jcy jcyVar = (jcy) eupVar.gx.a();
                                gyy gyyVar = (gyy) eupVar.fX.a();
                                glk glkVar = (glk) eupVar.gF.a();
                                gtu gtuVar = (gtu) eupVar.bE.a();
                                Service service = ((etn) objDN).a;
                                if (!(service instanceof KatnissVoiceInteractionService)) {
                                    throw new IllegalStateException(a.B(service, lyp.class, "Attempt to inject a Service wrapper of type "));
                                }
                                KatnissVoiceInteractionService katnissVoiceInteractionService = (KatnissVoiceInteractionService) service;
                                katnissVoiceInteractionService.getClass();
                                aejl aejlVar4 = eupVar.mH;
                                lyu lyuVar = new lyu((eyw) eupVar.T.a(), eupVar.bj(), (fex) eupVar.cr.a(), (lzb) eupVar.gZ.a(), eupVar.cn(), eupVar.fv);
                                gpd gpdVar = (gpd) eupVar.si.a();
                                gxj gxjVar = (gxj) eupVar.sx.a();
                                gpe gpeVar = (gpe) eupVar.sy.a();
                                aejl aejlVar5 = eupVar.sj;
                                boolean zHn = eupVar.hn();
                                icl iclVar = (icl) eupVar.mj.a();
                                Context context2 = (Context) eupVar.n.a();
                                context2.getClass();
                                this.b = new lyp(accessibilityManagerU, activityManager, eywVar, fbyVar, gkzVar, jdtVar, vxeVarEk, aejlVar, context, vrzVarEe, agteVar, ahbtVar, ahbtVar2, gouVar, gpbVar, ewcVar, jcvVar, jccVar, gxnVar, aejlVar2, jhsVar, gphVarBj, jbuVar, aejlVar3, gzuVar, gpcVar, zHf, jcyVar, gyyVar, glkVar, gtuVar, katnissVoiceInteractionService, aejlVar4, lyuVar, gpdVar, gxjVar, gpeVar, aejlVar5, zHn, iclVar, new abm(context2), eupVar.fU, eupVar.Z(), (fcu) eupVar.fb.a(), new jbx(eupVar.c(), (jdt) eupVar.mc.a(), (Context) eupVar.n.a(), (jnb) eupVar.mu.a()), (lzb) eupVar.gZ.a(), (evt) eupVar.mK.a(), (gly) eupVar.sz.a(), eupVar.kT, eupVar.fi, (WindowManager) eupVar.cn.a());
                                wvxVarF2.close();
                                this.b.B = this;
                            } catch (Throwable th4) {
                                th = th4;
                                th = th;
                                try {
                                    wvxVarF2.close();
                                    throw th;
                                } catch (Throwable th5) {
                                    th.addSuppressed(th5);
                                    throw th;
                                }
                            }
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        wvxVarF2.close();
                        throw th;
                    }
                } catch (Throwable th7) {
                    wwtVar = wwtVarD;
                    try {
                        wvxVarF.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            super.onCreate();
            lyp lypVarL = L();
            lypVarL.q.c();
            ahal.e(lypVarL.k, null, 0, new lyo(lypVarL, null), 3).w(new lya("#doSetup in #startSetup"));
            if (Build.VERSION.SDK_INT <= 29 || (Build.VERSION.SDK_INT == 30 && ((Boolean) lypVarL.h.a()).booleanValue())) {
                abm abmVar = lypVarL.w;
                Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
                Context context3 = lypVarL.i;
                NotificationChannel notificationChannel = new NotificationChannel("KatnissVoiceInteractionServicePeer", context3.getResources().getString(R.string.app_name), 0);
                notificationChannel.setDescription(null);
                notificationChannel.setGroup(null);
                notificationChannel.setShowBadge(true);
                notificationChannel.setSound(uri, audioAttributes);
                notificationChannel.enableLights(false);
                notificationChannel.setLightColor(0);
                notificationChannel.setVibrationPattern(null);
                notificationChannel.enableVibration(false);
                abmVar.a.createNotificationChannel(notificationChannel);
                abh abhVar = new abh(context3, "KatnissVoiceInteractionServicePeer");
                abhVar.s.icon = R.drawable.search_app_icon;
                abhVar.d(2, true);
                Notification notificationA = abhVar.a();
                notificationA.getClass();
                if (Build.VERSION.SDK_INT <= 29) {
                    lypVarL.r.startForeground(lypVarL.getClass().hashCode(), notificationA);
                } else {
                    lypVarL.r.startForeground(lypVarL.getClass().hashCode(), notificationA, 128);
                }
            }
            this.c = false;
            wwtVar.close();
        } catch (Throwable th9) {
            th = th9;
            Throwable th10 = th;
            try {
                wwtVar.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        wwt wwtVarF = this.d.f();
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            wmwVar.a();
            super.onDestroy();
            lyp lypVarL = L();
            ((zdv) lyp.a.c().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "onDestroy", 335, "KatnissVoiceInteractionServicePeer.kt")).u("Unexpected onDestroy. KVIS should never be stopped.");
            ahal.e(lypVarL.k, null, 0, new lyj(lypVarL, null), 3);
            if (Build.VERSION.SDK_INT <= 29 || (Build.VERSION.SDK_INT == 30 && ((Boolean) lypVarL.h.a()).booleanValue())) {
                NotificationManager notificationManager = lypVarL.w.a;
                notificationManager.deleteNotificationChannel("KatnissVoiceInteractionServicePeer");
                notificationManager.cancelAll();
            }
            wwtVarF.close();
        } catch (Throwable th) {
            try {
                wwtVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.service.voice.VoiceInteractionService
    public final void onReady() {
        wwt wwtVarE = this.d.e("onReady");
        try {
            super.onReady();
            lyp lypVarL = L();
            ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "onReady", 505, "KatnissVoiceInteractionServicePeer.kt")).u("onReady");
            jcc jccVar = lypVarL.m;
            KatnissVoiceInteractionService katnissVoiceInteractionService = lypVarL.r;
            jccVar.b = katnissVoiceInteractionService;
            katnissVoiceInteractionService.setDisabledShowContext(2);
            wwtVarE.close();
        } catch (Throwable th) {
            try {
                wwtVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        wwt wwtVarH = this.d.h(intent, i);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onStartCommand called before onCreate.");
            }
            wmwVar.c();
            lyp lypVarL = L();
            ((zdv) lyp.a.b().q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "onStartCommand", 324, "KatnissVoiceInteractionServicePeer.kt")).u("#onStartCommand");
            agow agowVar = lypVarL.s;
            ((jod) agowVar.a()).b(intent);
            int iA = ((jod) agowVar.a()).m() == 2 ? lypVarL.a(super.onStartCommand(intent, i, i2)) : lypVarL.a(2);
            wwtVarH.close();
            return iA;
        } catch (Throwable th) {
            try {
                wwtVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
