package defpackage;

import android.accounts.Account;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icd implements iax {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl");
    public static final afid b;
    public static final afid c;
    public static final afid d;
    public static final Duration e;
    private final ghp A;
    private final ghr B;
    private final fvb C;
    private final Supplier D;
    private String E;
    private String F;
    private final fcu G;
    public final frl f;
    public final fda g;
    public final Context h;
    public final ahbt i;
    public final agow j;
    public final gph k;
    public final fyq l;
    public final gtu m;
    public final agow n;
    public final idl o;
    public final ahni p;
    public afhq q;
    public String r;
    public final CopyOnWriteArrayList s;
    public boolean t;
    private final agte u;
    private final agow v;
    private final PackageManager w;
    private final idu x;
    private final yrx y;
    private final ztw z;

    static {
        afib afibVar = afih.b;
        int i = afid.c;
        b = new afia("X-Goog-Api-Key", afibVar);
        c = new afia("X-Android-Package", afih.b);
        d = new afia("X-Android-Cert", afih.b);
        Duration durationOfSeconds = Duration.ofSeconds(20L);
        durationOfSeconds.getClass();
        e = durationOfSeconds;
    }

    public icd(frl frlVar, fda fdaVar, Context context, agte agteVar, ahbt ahbtVar, agow agowVar, gph gphVar, fyq fyqVar, gtu gtuVar, agow agowVar2, fcu fcuVar, PackageManager packageManager, agow agowVar3, idl idlVar, idu iduVar, yrx yrxVar, ztw ztwVar, ghp ghpVar, ghr ghrVar, fvb fvbVar, Supplier supplier) {
        fdaVar.getClass();
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        gtuVar.getClass();
        agowVar2.getClass();
        fcuVar.getClass();
        agowVar3.getClass();
        idlVar.getClass();
        iduVar.getClass();
        ztwVar.getClass();
        ghpVar.getClass();
        ghrVar.getClass();
        this.f = frlVar;
        this.g = fdaVar;
        this.h = context;
        this.u = agteVar;
        this.i = ahbtVar;
        this.j = agowVar;
        this.k = gphVar;
        this.l = fyqVar;
        this.m = gtuVar;
        this.v = agowVar2;
        this.G = fcuVar;
        this.w = packageManager;
        this.n = agowVar3;
        this.o = idlVar;
        this.x = iduVar;
        this.y = yrxVar;
        this.z = ztwVar;
        this.A = ghpVar;
        this.B = ghrVar;
        this.C = fvbVar;
        this.D = supplier;
        this.E = "";
        this.F = "";
        this.p = new ahnm(false);
        this.s = new CopyOnWriteArrayList();
        otp.a();
    }

    private final adkb A(adjp adjpVar, String str) {
        adkb adkbVar = adkb.a;
        adka adkaVar = new adka();
        if ((adkaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adkaVar.y();
        }
        adkb adkbVar2 = (adkb) adkaVar.b;
        adkbVar2.b |= 1;
        adkbVar2.c = str;
        if (ActivityManager.isUserAMonkey() || ActivityManager.isRunningInTestHarness()) {
            if ((adkaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adkaVar.y();
            }
            adkb adkbVar3 = (adkb) adkaVar.b;
            adkbVar3.b |= 2;
            adkbVar3.d = false;
            abxc abxcVar = adjv.b;
            abxcVar.getClass();
            adju adjuVar = new adju();
            abxc abxcVar2 = adku.b;
            abxcVar2.getClass();
            adks adksVar = new adks();
            if ((adksVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adksVar.y();
            }
            adku adkuVar = (adku) adksVar.b;
            adkuVar.d = 1;
            adkuVar.c |= 1;
            abxd abxdVarV = adksVar.v();
            abxdVarV.getClass();
            adjuVar.f(abxcVar2, (adku) abxdVarV);
            abxd abxdVarV2 = adjuVar.v();
            abxdVarV2.getClass();
            adkaVar.f(abxcVar, (adjv) abxdVarV2);
        } else {
            if ((adkaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adkaVar.y();
            }
            adkb adkbVar4 = (adkb) adkaVar.b;
            adkbVar4.b |= 2;
            adkbVar4.d = true;
        }
        abxc abxcVar3 = adkh.b;
        abxcVar3.getClass();
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        adkg adkgVar = new adkg();
        adjr adjrVar = adjr.a;
        adjq adjqVar = new adjq();
        if ((adjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjqVar.y();
        }
        adjr adjrVar2 = (adjr) adjqVar.b;
        adjrVar2.b |= 1;
        adjrVar2.c = languageTag;
        adjg.b(adjqVar);
        adjr adjrVarA = adjg.a(adjqVar);
        if ((adkgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adkgVar.y();
        }
        adkh adkhVar = (adkh) adkgVar.b;
        adkhVar.h = adjrVarA;
        adkhVar.c |= 2;
        DesugarCollections.unmodifiableList(adkhVar.d).getClass();
        Duration duration = gvi.a;
        String str2 = (String) gvi.b.get(0);
        adjm adjmVar = adjm.a;
        adjl adjlVar = new adjl();
        str2.getClass();
        if ((adjlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjlVar.y();
        }
        adjm adjmVar2 = (adjm) adjlVar.b;
        adjmVar2.b |= 4;
        adjmVar2.d = str2;
        String str3 = this.r;
        if (str3 == null) {
            str3 = "";
        }
        if ((adjlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjlVar.y();
        }
        adjm adjmVar3 = (adjm) adjlVar.b;
        adjmVar3.b |= 8;
        adjmVar3.e = str3;
        if ((adjlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjlVar.y();
        }
        adjm adjmVar4 = (adjm) adjlVar.b;
        adjmVar4.b |= 2;
        adjmVar4.c = true;
        abxc abxcVar4 = adjb.b;
        abxcVar4.getClass();
        adiz adizVar = new adiz();
        if ((adizVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adizVar.y();
        }
        adjb adjbVar = (adjb) adizVar.b;
        adjbVar.d = 1;
        adjbVar.c |= 1;
        abxd abxdVarV3 = adizVar.v();
        abxdVarV3.getClass();
        adjlVar.f(abxcVar4, (adjb) abxdVarV3);
        abxd abxdVarV4 = adjlVar.v();
        abxdVarV4.getClass();
        adkgVar.a((adjm) abxdVarV4);
        if (adjpVar != null) {
            DesugarCollections.unmodifiableList(((adkh) adkgVar.b).e).getClass();
            if ((adkgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adkgVar.y();
            }
            adkh adkhVar2 = (adkh) adkgVar.b;
            abxs abxsVar = adkhVar2.e;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                adkhVar2.e = abxsVar.d(size + size);
            }
            adkhVar2.e.add(adjpVar);
        }
        adjq adjqVar2 = new adjq();
        if ((adjqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjqVar2.y();
        }
        adjr adjrVar3 = (adjr) adjqVar2.b;
        adjrVar3.b |= 1;
        adjrVar3.c = languageTag;
        adjg.b(adjqVar2);
        adjr adjrVarA2 = adjg.a(adjqVar2);
        if ((adkgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adkgVar.y();
        }
        adkh adkhVar3 = (adkh) adkgVar.b;
        adkhVar3.f = adjrVarA2;
        adkhVar3.c |= 1;
        abxd abxdVarV5 = adkgVar.v();
        abxdVarV5.getClass();
        adkaVar.f(abxcVar3, (adkh) abxdVarV5);
        abxc abxcVar5 = adjt.b;
        abxcVar5.getClass();
        adjs adjsVar = new adjs();
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        adjt adjtVar = (adjt) adjsVar.b;
        adjtVar.c |= 16;
        adjtVar.h = "assistant-settings";
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        adjt adjtVar2 = (adjt) adjsVar.b;
        adjtVar2.c |= 4;
        adjtVar2.f = "Android";
        String str4 = Build.DISPLAY;
        str4.getClass();
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        adjt adjtVar3 = (adjt) adjsVar.b;
        adjtVar3.c |= 8;
        adjtVar3.g = str4;
        String str5 = adjtVar3.j;
        str5.getClass();
        String strValueOf = String.valueOf(Build.MODEL);
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        String strConcat = str5.concat(strValueOf);
        adjt adjtVar4 = (adjt) adjsVar.b;
        adjtVar4.c |= 64;
        adjtVar4.j = strConcat;
        Object obj = this.D.get();
        obj.getClass();
        String str6 = (String) obj;
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        adjt adjtVar5 = (adjt) adjsVar.b;
        adjtVar5.c |= 2;
        adjtVar5.d = str6;
        DesugarCollections.unmodifiableList(adjtVar5.e).getClass();
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        adjt adjtVar6 = (adjt) adjsVar.b;
        abxs abxsVar2 = adjtVar6.e;
        if (!abxsVar2.c()) {
            int size2 = abxsVar2.size();
            adjtVar6.e = abxsVar2.d(size2 + size2);
        }
        adjtVar6.e.add("20344396");
        String strValueOf2 = String.valueOf(had.a(this.w, "com.google.android.katniss").getLongVersionCode());
        strValueOf2.getClass();
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        adjt adjtVar7 = (adjt) adjsVar.b;
        adjtVar7.c |= 32;
        adjtVar7.i = strValueOf2;
        if ((adjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjsVar.y();
        }
        adjt adjtVar8 = (adjt) adjsVar.b;
        adjtVar8.c |= 2048;
        adjtVar8.k = "com.google.android.katniss";
        abxd abxdVarV6 = adjsVar.v();
        abxdVarV6.getClass();
        adkaVar.f(abxcVar5, (adjt) abxdVarV6);
        abxc abxcVar6 = adjk.b;
        abxcVar6.getClass();
        adjj adjjVar = new adjj();
        if ((adjjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjjVar.y();
        }
        adjk adjkVar = (adjk) adjjVar.b;
        adjkVar.c |= 16;
        adjkVar.d = 1;
        abxd abxdVarV7 = adjjVar.v();
        abxdVarV7.getClass();
        adkaVar.f(abxcVar6, (adjk) abxdVarV7);
        return adko.a(adkaVar);
    }

    private final yie x(ymc ymcVar, String str) {
        if ((ymcVar.b & 32) == 0) {
            return null;
        }
        yin yinVar = ymcVar.g;
        if (yinVar == null) {
            yinVar = yin.a;
        }
        for (yie yieVar : yinVar.b) {
            gph gphVar = this.k;
            if ((gphVar == gph.b || gphVar == gph.c) && yieVar.d) {
                ((zdv) a.b().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl", "findCurrentAssistantDeviceBy", 403, "AssistantSettingsGrpcClientImpl.kt")).u("Looking for Device Setting for Watson experience.");
                return yieVar;
            }
            if (gphVar == gph.a && str != null && (yieVar.b & 1) != 0) {
                String str2 = yieVar.c;
                str2.getClass();
                if (str2.startsWith(str)) {
                    ((zdv) a.b().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl", "findCurrentAssistantDeviceBy", 411, "AssistantSettingsGrpcClientImpl.kt")).u("Looking for Device Setting for Amati experience.");
                    return yieVar;
                }
            }
        }
        return null;
    }

    private final adjp y() {
        adjp adjpVar = adjp.a;
        adjn adjnVar = new adjn();
        String strM = this.m.m();
        if ((adjnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjnVar.y();
        }
        adjp adjpVar2 = (adjp) adjnVar.b;
        adjpVar2.b |= 4;
        adjpVar2.e = strM;
        if ((adjnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjnVar.y();
        }
        adjp adjpVar3 = (adjp) adjnVar.b;
        adjpVar3.c = 1;
        adjpVar3.b |= 1;
        if ((adjnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adjnVar.y();
        }
        adjp adjpVar4 = (adjp) adjnVar.b;
        adjpVar4.b |= 2;
        adjpVar4.d = true;
        abxd abxdVarV = adjnVar.v();
        abxdVarV.getClass();
        return (adjp) abxdVarV;
    }

    private final adkb z() {
        adkb adkbVar = adkb.a;
        adka adkaVar = new adka();
        if ((adkaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adkaVar.y();
        }
        adkb adkbVar2 = (adkb) adkaVar.b;
        adkbVar2.b |= 8;
        adkbVar2.e = true;
        return adko.a(adkaVar);
    }

    @Override // defpackage.iax
    public final int a(Account account) {
        int iOrdinal = this.o.e(account).ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 2 : 0;
        }
        return 1;
    }

    @Override // defpackage.iax
    public final int b(Account account) {
        if ((this.k == gph.a || ((Boolean) this.n.a()).booleanValue()) && c(account) == 1) {
            return 1;
        }
        idl idlVar = this.o;
        if (idlVar.X()) {
            return !idlVar.W(account) ? 0 : 1;
        }
        return 2;
    }

    @Override // defpackage.iax
    public final int c(Account account) {
        idl idlVar = this.o;
        if (idlVar.aa()) {
            return !idlVar.Z(account) ? 0 : 1;
        }
        return 2;
    }

    @Override // defpackage.iax
    public final yme d(int i) {
        yme ymeVar = yme.a;
        ymd ymdVar = new ymd();
        ynl ynlVar = ynl.a;
        ynj ynjVar = new ynj();
        if ((ynjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ynjVar.y();
        }
        ynl ynlVar2 = (ynl) ynjVar.b;
        ynlVar2.c = 1;
        ynlVar2.b |= 1;
        ymw ymwVar = ymw.a;
        ymu ymuVar = new ymu();
        if ((ymuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymuVar.y();
        }
        ymw ymwVar2 = (ymw) ymuVar.b;
        ymwVar2.e = 1;
        ymwVar2.b |= 1;
        ymt ymtVar = ymt.a;
        yms ymsVar = new yms();
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        strValueOf.getClass();
        if ((ymsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymsVar.y();
        }
        ymt ymtVar2 = (ymt) ymsVar.b;
        ymtVar2.b |= 1;
        ymtVar2.c = strValueOf;
        if ((ymsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymsVar.y();
        }
        ymt ymtVar3 = (ymt) ymsVar.b;
        ymtVar3.b |= 4;
        ymtVar3.e = "com.google.android.katniss";
        PackageManager packageManager = this.w;
        String strValueOf2 = String.valueOf(packageManager.getPackageInfo("com.google.android.katniss", 0).getLongVersionCode());
        strValueOf2.getClass();
        if ((ymsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymsVar.y();
        }
        ymt ymtVar4 = (ymt) ymsVar.b;
        ymtVar4.b |= 2;
        ymtVar4.d = strValueOf2;
        String strValueOf3 = String.valueOf(packageManager.getPackageInfo("com.google.android.gms", 0).getLongVersionCode());
        strValueOf3.getClass();
        if ((ymsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymsVar.y();
        }
        ymt ymtVar5 = (ymt) ymsVar.b;
        ymtVar5.b |= 8;
        ymtVar5.f = strValueOf3;
        String strValueOf4 = String.valueOf(i);
        strValueOf4.getClass();
        if ((ymsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymsVar.y();
        }
        ymt ymtVar6 = (ymt) ymsVar.b;
        ymtVar6.b |= 16;
        ymtVar6.g = strValueOf4;
        String str = Build.MANUFACTURER + " " + Build.MODEL;
        if ((ymsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymsVar.y();
        }
        ymt ymtVar7 = (ymt) ymsVar.b;
        ymtVar7.b |= 32;
        ymtVar7.h = str;
        abxd abxdVarV = ymsVar.v();
        abxdVarV.getClass();
        ymt ymtVar8 = (ymt) abxdVarV;
        if ((ymuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymuVar.y();
        }
        ymw ymwVar3 = (ymw) ymuVar.b;
        ymwVar3.d = ymtVar8;
        ymwVar3.c = 2;
        abxd abxdVarV2 = ymuVar.v();
        abxdVarV2.getClass();
        ymw ymwVar4 = (ymw) abxdVarV2;
        if ((ynjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ynjVar.y();
        }
        ynl ynlVar3 = (ynl) ynjVar.b;
        ynlVar3.d = ymwVar4;
        ynlVar3.b |= 2;
        yne yneVar = yne.a;
        ymx ymxVar = new ymx();
        yna ynaVar = yna.a;
        ymy ymyVar = new ymy();
        if ((ymyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymyVar.y();
        }
        yna ynaVar2 = (yna) ymyVar.b;
        ynaVar2.c = 3;
        ynaVar2.b |= 1;
        abxd abxdVarV3 = ymyVar.v();
        abxdVarV3.getClass();
        yna ynaVar3 = (yna) abxdVarV3;
        if ((ymxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymxVar.y();
        }
        yne yneVar2 = (yne) ymxVar.b;
        yneVar2.c = ynaVar3;
        yneVar2.b |= 1;
        ynd yndVar = ynd.a;
        ynb ynbVar = new ynb();
        if ((ynbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ynbVar.y();
        }
        ynd yndVar2 = (ynd) ynbVar.b;
        yndVar2.c = 3;
        yndVar2.b |= 1;
        abxd abxdVarV4 = ynbVar.v();
        abxdVarV4.getClass();
        ynd yndVar3 = (ynd) abxdVarV4;
        if ((ymxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymxVar.y();
        }
        yne yneVar3 = (yne) ymxVar.b;
        yneVar3.d = yndVar3;
        yneVar3.b |= 2;
        abxd abxdVarV5 = ymxVar.v();
        abxdVarV5.getClass();
        yne yneVar4 = (yne) abxdVarV5;
        if ((ynjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ynjVar.y();
        }
        ynl ynlVar4 = (ynl) ynjVar.b;
        ynlVar4.e = yneVar4;
        ynlVar4.b |= 4;
        abxd abxdVarV6 = ynjVar.v();
        abxdVarV6.getClass();
        ynl ynlVar5 = (ynl) abxdVarV6;
        if ((ymdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymdVar.y();
        }
        yme ymeVar2 = (yme) ymdVar.b;
        ymeVar2.j = ynlVar5;
        ymeVar2.b |= 8388608;
        ylz ylzVar = ylz.a;
        yly ylyVar = new yly();
        if ((ylyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ylyVar.y();
        }
        ylz ylzVar2 = (ylz) ylyVar.b;
        ylzVar2.c = 24;
        ylzVar2.b |= 1;
        abxd abxdVarV7 = ylyVar.v();
        abxdVarV7.getClass();
        ylz ylzVar3 = (ylz) abxdVarV7;
        if ((ymdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymdVar.y();
        }
        yme ymeVar3 = (yme) ymdVar.b;
        ymeVar3.l = ylzVar3;
        ymeVar3.c |= 32;
        return ymj.a(ymdVar);
    }

    @Override // defpackage.iax
    public final ymg e(abvo abvoVar) {
        abvoVar.getClass();
        ymg ymgVar = ymg.a;
        ymk ymkVar = new ymk(new ymf());
        ynn ynnVar = ynn.a;
        ynm ynmVar = new ynm();
        if ((ynmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ynmVar.y();
        }
        ynn ynnVar2 = (ynn) ynmVar.b;
        ynnVar2.b |= 1;
        ynnVar2.c = abvoVar;
        ynn ynnVarA = ynq.a(ynmVar);
        ymf ymfVar = ymkVar.a;
        if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymfVar.y();
        }
        ymg ymgVar2 = (ymg) ymfVar.b;
        ymgVar2.i = ynnVarA;
        ymgVar2.b |= 4096;
        return ymkVar.a();
    }

    @Override // defpackage.iax
    public final zyd f(Account account, String str) {
        account.getClass();
        str.getClass();
        return ahkr.c(this.i, 0, new ibp(this, account, str, null), 3);
    }

    @Override // defpackage.iax
    public final Optional g(ymc ymcVar, String str) {
        ymcVar.getClass();
        yie yieVarX = x(ymcVar, str);
        if (yieVarX == null) {
            return Optional.empty();
        }
        yil yilVar = yieVarX.f;
        if (yilVar == null) {
            yilVar = yil.a;
        }
        return Optional.of(yilVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r10 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(android.accounts.Account r10, defpackage.yme r11, java.lang.String r12, defpackage.agsw r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.ibi
            if (r0 == 0) goto L13
            r0 = r13
            ibi r0 = (defpackage.ibi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ibi r0 = new ibi
            r0.<init>(r9, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.a
            agtg r0 = defpackage.agtg.a
            int r1 = r6.c
            r7 = 2
            r8 = 1
            r2 = 0
            if (r1 == 0) goto L42
            if (r1 == r8) goto L39
            if (r1 != r7) goto L31
            defpackage.agpl.b(r13)
            agpk r13 = (defpackage.agpk) r13
            java.lang.Object r10 = r13.a
            r1 = r9
            goto L79
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.String r10 = r6.e
            yme r11 = r6.d
            defpackage.agpl.b(r13)
            r12 = r10
            goto L5d
        L42:
            defpackage.agpl.b(r13)
            if (r10 == 0) goto L68
            gtu r13 = r9.m
            boolean r1 = r13.r(r10)
            if (r1 == 0) goto L68
            r6.d = r11
            r6.e = r12
            r6.c = r8
            java.lang.Object r13 = r13.i(r6)
            if (r13 != r0) goto L5d
            r1 = r9
            goto Lac
        L5d:
            r10 = r13
            android.accounts.Account r10 = (android.accounts.Account) r10
            adjp r13 = r9.y()
            r4 = r11
            r5 = r12
            r3 = r13
            goto L6b
        L68:
            r4 = r11
            r5 = r12
            r3 = r2
        L6b:
            r6.d = r2
            r6.e = r2
            r6.c = r7
            r1 = r9
            r2 = r10
            java.lang.Object r10 = r1.u(r2, r3, r4, r5, r6)
            if (r10 == r0) goto Lac
        L79:
            boolean r11 = defpackage.agpk.b(r10)
            if (r11 == 0) goto L9d
            r11 = r10
            ykj r11 = (defpackage.ykj) r11
            yks r11 = r11.c
            if (r11 != 0) goto L88
            yks r11 = defpackage.yks.a
        L88:
            r11.getClass()
            int r11 = r11.b
            int r11 = defpackage.ykq.a(r11)
            r12 = 0
            if (r11 != 0) goto L96
        L94:
            r8 = r12
            goto L98
        L96:
            if (r11 != r7) goto L94
        L98:
            idu r11 = r1.x
            r11.z(r8)
        L9d:
            boolean r11 = defpackage.agpk.b(r10)
            if (r11 == 0) goto Lab
            ykj r10 = (defpackage.ykj) r10
            ymc r10 = r10.b
            if (r10 != 0) goto Lab
            ymc r10 = defpackage.ymc.a
        Lab:
            return r10
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.h(android.accounts.Account, yme, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r8.b(r5 != null ? r5 : "", 3, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r8.b(r5 != null ? r5 : "", 4, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(android.accounts.Account r7, boolean r8, android.content.Intent r9, defpackage.agsw r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.iby
            if (r0 == 0) goto L13
            r0 = r10
            iby r0 = (defpackage.iby) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            iby r0 = new iby
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.agpl.b(r10)
            goto L97
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r9 = r0.a
            defpackage.agpl.b(r10)
            goto L72
        L39:
            defpackage.agpl.b(r10)
            fcu r10 = r6.G
            agow r2 = r6.v
            java.lang.Object r2 = r2.a()
            r2.getClass()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r10 = r10.c(r2)
            java.lang.String r2 = ""
            r5 = 0
            if (r8 == 0) goto L7c
            idl r8 = r6.o
            idj r3 = defpackage.idj.b
            r8.J(r7, r3, r10)
            fvb r8 = r6.C
            if (r7 == 0) goto L63
            java.lang.String r5 = r7.name
        L63:
            r0.a = r9
            r0.d = r4
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r2 = r5
        L6b:
            r7 = 3
            java.lang.Object r7 = r8.b(r2, r7, r0)
            if (r7 == r1) goto L96
        L72:
            if (r9 == 0) goto L97
            android.content.Context r7 = r6.h
            android.content.Intent r9 = (android.content.Intent) r9
            r7.sendBroadcast(r9)
            goto L97
        L7c:
            idl r8 = r6.o
            idj r9 = defpackage.idj.c
            r8.J(r7, r9, r10)
            fvb r8 = r6.C
            if (r7 == 0) goto L89
            java.lang.String r5 = r7.name
        L89:
            r0.d = r3
            if (r5 != 0) goto L8e
            goto L8f
        L8e:
            r2 = r5
        L8f:
            r7 = 4
            java.lang.Object r7 = r8.b(r2, r7, r0)
            if (r7 != r1) goto L97
        L96:
            return r1
        L97:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.i(android.accounts.Account, boolean, android.content.Intent, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(android.accounts.Account r8, defpackage.ymg r9, java.lang.String r10, defpackage.agsw r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.ica
            if (r0 == 0) goto L13
            r0 = r11
            ica r0 = (defpackage.ica) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ica r0 = new ica
            r0.<init>(r7, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            agtg r0 = defpackage.agtg.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L41
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            defpackage.agpl.b(r11)
            agpk r11 = (defpackage.agpk) r11
            java.lang.Object r8 = r11.a
            return r8
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.String r8 = r6.e
            ymg r9 = r6.d
            defpackage.agpl.b(r11)
            r10 = r8
            goto L5b
        L41:
            defpackage.agpl.b(r11)
            if (r8 == 0) goto L65
            gtu r11 = r7.m
            boolean r1 = r11.r(r8)
            if (r1 == 0) goto L65
            r6.d = r9
            r6.e = r10
            r6.c = r3
            java.lang.Object r11 = r11.i(r6)
            if (r11 != r0) goto L5b
            goto L76
        L5b:
            r8 = r11
            android.accounts.Account r8 = (android.accounts.Account) r8
            adjp r11 = r7.y()
            r5 = r10
            r3 = r11
            goto L67
        L65:
            r5 = r10
            r3 = r4
        L67:
            r6.d = r4
            r6.e = r4
            r6.c = r2
            r1 = r7
            r2 = r8
            r4 = r9
            java.lang.Object r8 = r1.v(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L77
        L76:
            return r0
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.j(android.accounts.Account, ymg, java.lang.String, agsw):java.lang.Object");
    }

    @Override // defpackage.iax
    public final void k(iaw iawVar) {
        this.s.add(iawVar);
    }

    @Override // defpackage.iax
    public final void l(Account account, iaw iawVar, int i) {
        account.getClass();
        iawVar.getClass();
        k(iawVar);
        if (this.t) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl", "fetchSettingsForAssistantSetupWithAccount", 314, "AssistantSettingsGrpcClientImpl.kt")).u("Already fetching settings for Assistant Setup. Skipping sending a new request.");
            return;
        }
        this.t = true;
        this.o.r(account);
        ibg ibgVar = new ibg(this, account);
        yme ymeVarD = d(i);
        ymd ymdVar = new ymd();
        ymdVar.B(ymeVarD);
        if ((ymdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymdVar.y();
        }
        yme ymeVar = (yme) ymdVar.b;
        ymeVar.b |= 2;
        ymeVar.e = true;
        ymj.b(ymdVar);
        ymj.c(ymdVar);
        m(account, ymj.a(ymdVar), ibgVar, "AssistantSettingsGrpcClientImpl");
    }

    @Override // defpackage.iax
    public final void m(Account account, yme ymeVar, zxe zxeVar, String str) {
        ymeVar.getClass();
        zxeVar.getClass();
        ahal.e(this.i, null, 0, new ibh(this, account, ymeVar, str, zxeVar, null), 3);
    }

    @Override // defpackage.iax
    public final void n(iaw iawVar) {
        this.s.remove(iawVar);
    }

    @Override // defpackage.iax
    public final void o(Account account, ymg ymgVar, zxe zxeVar, String str) {
        ymgVar.getClass();
        ahal.e(this.i, null, 0, new ibz(this, account, ymgVar, str, zxeVar, null), 3);
    }

    @Override // defpackage.iax
    public final void p(Account account, String str, yme ymeVar, String str2, zxe zxeVar) {
        account.getClass();
        str.getClass();
        ymeVar.getClass();
        ahal.e(this.i, null, 0, new icb(this, account, ymeVar, new icc(this, str2, account, zxeVar), str, null), 3);
    }

    @Override // defpackage.iax
    public final boolean q() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0195, code lost:
    
        if (r7 != r2) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[PHI: r3 r7 r8 r9
  0x00ec: PHI (r3v18 ymc) = (r3v16 ymc), (r3v19 ymc) binds: [B:36:0x00ea, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r7v7 frl) = (r7v5 frl), (r7v8 frl) binds: [B:36:0x00ea, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r8v6 java.lang.String) = (r8v4 java.lang.String), (r8v7 java.lang.String) binds: [B:36:0x00ea, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r9v6 java.lang.String) = (r9v4 java.lang.String), (r9v7 java.lang.String) binds: [B:36:0x00ea, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111 A[PHI: r3 r7 r8 r9
  0x0111: PHI (r3v20 ymc) = (r3v18 ymc), (r3v21 ymc) binds: [B:43:0x010f, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r7v9 frl) = (r7v7 frl), (r7v10 frl) binds: [B:43:0x010f, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r8v8 java.lang.String) = (r8v6 java.lang.String), (r8v9 java.lang.String) binds: [B:43:0x010f, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r9v8 java.lang.String) = (r9v6 java.lang.String), (r9v9 java.lang.String) binds: [B:43:0x010f, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136 A[PHI: r3 r7 r8 r9
  0x0136: PHI (r3v22 ymc) = (r3v20 ymc), (r3v31 ymc) binds: [B:50:0x0134, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r7v11 frl) = (r7v9 frl), (r7v16 frl) binds: [B:50:0x0134, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r8v10 java.lang.String) = (r8v8 java.lang.String), (r8v13 java.lang.String) binds: [B:50:0x0134, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0136: PHI (r9v10 java.lang.String) = (r9v8 java.lang.String), (r9v11 java.lang.String) binds: [B:50:0x0134, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.ymc r7, final java.lang.String r8, java.lang.String r9, defpackage.agsw r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.r(ymc, java.lang.String, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(android.accounts.Account r6, defpackage.agsw r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ibj
            if (r0 == 0) goto L13
            r0 = r7
            ibj r0 = (defpackage.ibj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ibj r0 = new ibj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.agpl.b(r7)
            agte r7 = r5.u
            ibk r2 = new ibk
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.c = r3
            java.lang.Object r7 = defpackage.ahal.a(r7, r2, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.s(android.accounts.Account, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        if (r0 == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(android.accounts.Account r21, java.lang.String r22, defpackage.agsw r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.t(android.accounts.Account, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[Catch: Exception -> 0x0195, TryCatch #4 {Exception -> 0x0195, blocks: (B:30:0x009e, B:32:0x00cf, B:33:0x00d4, B:35:0x00e3, B:36:0x00e6, B:38:0x00fd, B:39:0x0100), top: B:72:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3 A[Catch: Exception -> 0x0195, TryCatch #4 {Exception -> 0x0195, blocks: (B:30:0x009e, B:32:0x00cf, B:33:0x00d4, B:35:0x00e3, B:36:0x00e6, B:38:0x00fd, B:39:0x0100), top: B:72:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[Catch: Exception -> 0x0195, TryCatch #4 {Exception -> 0x0195, blocks: (B:30:0x009e, B:32:0x00cf, B:33:0x00d4, B:35:0x00e3, B:36:0x00e6, B:38:0x00fd, B:39:0x0100), top: B:72:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179 A[Catch: Exception -> 0x0193, TryCatch #5 {Exception -> 0x0193, blocks: (B:42:0x0146, B:44:0x0179, B:46:0x0183, B:48:0x0186, B:50:0x018b, B:51:0x0192), top: B:74:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b A[Catch: Exception -> 0x0193, TryCatch #5 {Exception -> 0x0193, blocks: (B:42:0x0146, B:44:0x0179, B:46:0x0183, B:48:0x0186, B:50:0x018b, B:51:0x0192), top: B:74:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(android.accounts.Account r20, defpackage.adjp r21, defpackage.yme r22, java.lang.String r23, defpackage.agsw r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.u(android.accounts.Account, adjp, yme, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea A[Catch: Exception -> 0x01c8, TryCatch #3 {Exception -> 0x01c8, blocks: (B:30:0x00b9, B:32:0x00ea, B:33:0x00ef, B:35:0x00fe, B:36:0x0101, B:38:0x0118, B:39:0x011b), top: B:75:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe A[Catch: Exception -> 0x01c8, TryCatch #3 {Exception -> 0x01c8, blocks: (B:30:0x00b9, B:32:0x00ea, B:33:0x00ef, B:35:0x00fe, B:36:0x0101, B:38:0x0118, B:39:0x011b), top: B:75:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: Exception -> 0x01c8, TryCatch #3 {Exception -> 0x01c8, blocks: (B:30:0x00b9, B:32:0x00ea, B:33:0x00ef, B:35:0x00fe, B:36:0x0101, B:38:0x0118, B:39:0x011b), top: B:75:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b A[Catch: Exception -> 0x01c6, TryCatch #4 {Exception -> 0x01c6, blocks: (B:42:0x0161, B:44:0x016b, B:46:0x0175, B:48:0x017c, B:50:0x0187, B:51:0x018e, B:53:0x01bb, B:47:0x0178, B:55:0x01be, B:56:0x01c5), top: B:77:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be A[Catch: Exception -> 0x01c6, TryCatch #4 {Exception -> 0x01c6, blocks: (B:42:0x0161, B:44:0x016b, B:46:0x0175, B:48:0x017c, B:50:0x0187, B:51:0x018e, B:53:0x01bb, B:47:0x0178, B:55:0x01be, B:56:0x01c5), top: B:77:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(android.accounts.Account r20, defpackage.adjp r21, defpackage.ymg r22, java.lang.String r23, defpackage.agsw r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.v(android.accounts.Account, adjp, ymg, java.lang.String, agsw):java.lang.Object");
    }

    public final String w(Context context) {
        Signature[] signingCertificateHistory;
        Signature signature;
        if (this.E.length() > 0) {
            return this.E;
        }
        try {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo("com.google.android.katniss", 134217728).signingInfo;
            byte[] byteArray = null;
            if (signingInfo != null && (signingCertificateHistory = signingInfo.getSigningCertificateHistory()) != null && (signature = signingCertificateHistory[0]) != null) {
                byteArray = signature.toByteArray();
            }
            byte[] bArrB = irw.b(byteArray);
            if (bArrB.length != 0) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArrB);
                bArrDigest.getClass();
                this.E = zkl.f.k(bArrDigest, bArrDigest.length);
            }
            return this.E;
        } catch (PackageManager.NameNotFoundException e2) {
            ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl", "getAndroidCertFingerprint", 897, "AssistantSettingsGrpcClientImpl.kt")).u("Failed to get certificate fingerprint");
            return "";
        } catch (NoSuchAlgorithmException e3) {
            ((zdv) ((zdv) a.d()).p(e3).q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl", "getAndroidCertFingerprint", 899, "AssistantSettingsGrpcClientImpl.kt")).u("Failed to get certificate fingerprint");
            return "";
        }
    }
}
