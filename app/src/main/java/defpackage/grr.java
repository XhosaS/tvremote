package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grr extends agtu implements agvb {
    int a;
    final /* synthetic */ gez b;
    final /* synthetic */ grt c;
    final /* synthetic */ xnr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grr(gez gezVar, grt grtVar, xnr xnrVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gezVar;
        this.c = grtVar;
        this.d = xnrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((grr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        rqw rqwVarC;
        rqw rqwVarC2;
        Intent uri;
        rqw rqwVarC3;
        rqw rqwVarC4;
        Object objF;
        rqw rqwVarC5;
        rqw rqwVarC6;
        rqw rqwVarC7;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            grp grpVar = grt.a;
            gez gezVar = this.b;
            if (gezVar != null) {
                grt grtVar = this.c;
                agow agowVar = grtVar.f;
                gey geyVar = gez.a;
                if (geyVar.b(gezVar, agowVar, grtVar.e)) {
                    geyVar.a(((gfn) grtVar.g.a()).a(rpm.bR()), gezVar).c();
                }
            }
            grt grtVar2 = this.c;
            grtVar2.h.b(rpm.bJ(), null, null);
            grtVar2.l.l(gmc.u);
            xnr xnrVar = this.d;
            xbg xbgVar = xnrVar.b;
            if (xbgVar == null) {
                xbgVar = xbg.a;
            }
            if (((xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).b & 1) == 0) {
                if (gezVar != null) {
                    agow agowVar2 = grtVar2.f;
                    agow agowVar3 = grtVar2.e;
                    gey geyVar2 = gez.a;
                    if (geyVar2.b(gezVar, agowVar2, agowVar3) && (rqwVarC = gfb.c(gezVar, agowVar2)) != null) {
                        geyVar2.d(((gfn) grtVar2.g.a()).c(rqwVarC), gezVar, 8, 7).c(abqb.NOT_FOUND);
                    }
                }
                return grtVar2.e("", xju.NOT_FOUND, "Unable to open provider: no app info found.");
            }
            if (((acfo) grtVar2.o.a()).b.contains(grtVar2.i.a)) {
                grtVar2.m.e();
            }
            xbg xbgVar2 = xnrVar.b;
            if (xbgVar2 == null) {
                xbgVar2 = xbg.a;
            }
            String str = (xbgVar2.b == 1 ? (xaq) xbgVar2.c : xaq.a).c;
            str.getClass();
            if (agvy.c(str, "com.google.android.apps.tv.launcherx")) {
                xbg xbgVar3 = xnrVar.b;
                xbg xbgVar4 = xbgVar3 == null ? xbg.a : xbgVar3;
                if (((xbgVar4.b == 1 ? (xaq) xbgVar4.c : xaq.a).b & 64) != 0) {
                    if (xbgVar3 == null) {
                        xbgVar3 = xbg.a;
                    }
                    String str2 = (xbgVar3.b == 1 ? (xaq) xbgVar3.c : xaq.a).g;
                    str2.getClass();
                    if (!agyv.o(str2, "https://tv.google.com/asset/") && grtVar2.r.m()) {
                        Bundle bundle = new Bundle();
                        xbg xbgVar5 = xnrVar.b;
                        if (xbgVar5 == null) {
                            xbgVar5 = xbg.a;
                        }
                        String str3 = (xbgVar5.b == 1 ? (xaq) xbgVar5.c : xaq.a).g;
                        str3.getClass();
                        Uri uri2 = Uri.parse(str3);
                        String queryParameter = uri2.getQueryParameter("assistant_proto_type_url");
                        String queryParameter2 = uri2.getQueryParameter("assistant_proto_value");
                        if (queryParameter != null && queryParameter2 != null) {
                            bundle.putString("assistant_proto_type_url", queryParameter);
                            bundle.putString("assistant_proto_value", queryParameter2);
                            grtVar2.r.g(bundle);
                            gez gezVar2 = this.b;
                            if (gezVar2 != null) {
                                grt grtVar3 = this.c;
                                agow agowVar4 = grtVar3.f;
                                gey geyVar3 = gez.a;
                                if (geyVar3.b(gezVar2, agowVar4, grtVar3.e) && !geyVar3.c(gezVar2, agowVar4) && (rqwVarC7 = gfb.c(gezVar2, agowVar4)) != null) {
                                    geyVar3.d(((gfn) grtVar3.g.a()).c(rqwVarC7), gezVar2, 0, 0).c(abqb.OK);
                                }
                            }
                            return gqk.a;
                        }
                    }
                }
            }
            xbg xbgVar6 = xnrVar.b;
            if (xbgVar6 == null) {
                xbgVar6 = xbg.a;
            }
            xaq xaqVar = xbgVar6.b == 1 ? (xaq) xbgVar6.c : xaq.a;
            String str4 = (xaqVar.b & 64) != 0 ? xaqVar.g : agvy.c(str, "com.google.android.youtube.tv") ? "https://www.youtube.com/" : null;
            gtu gtuVar = grtVar2.k;
            if (gtuVar.d() == fwx.PROFILE_LOCK_LOCKED) {
                zdy zdyVar = grt.b;
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/performers/OpenProviderPerformerImpl$performOpenProvider$1", "invokeSuspend", 275, "OpenProviderPerformerImpl.kt")).u("Unable to open app since profile is locked.");
                Intent intent = new Intent("android.apps.tv.launcherx.PROFILE_LOCK_REAUTH");
                intent.setPackage("com.google.android.apps.tv.launcherx");
                Account accountC = gtuVar.c();
                if (accountC != null) {
                    intent.putExtra("account_name_extra", accountC.name);
                }
                if (!grtVar2.i(intent)) {
                    if (gezVar != null) {
                        agow agowVar5 = grtVar2.f;
                        agow agowVar6 = grtVar2.e;
                        gey geyVar4 = gez.a;
                        if (geyVar4.b(gezVar, agowVar5, agowVar6) && (rqwVarC5 = gfb.c(gezVar, agowVar5)) != null) {
                            geyVar4.d(((gfn) grtVar2.g.a()).c(rqwVarC5), gezVar, 8, 9).c(abqb.INTERNAL);
                        }
                    }
                    return grtVar2.e("com.google.android.apps.tv.launcherx", xju.INTERNAL, "Unable to start LauncherX profile lock reauth.");
                }
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/performers/OpenProviderPerformerImpl$performOpenProvider$1", "invokeSuspend", 286, "OpenProviderPerformerImpl.kt")).u("Starting LauncherX profile lock reauth.");
                if (gezVar != null) {
                    agow agowVar7 = grtVar2.f;
                    agow agowVar8 = grtVar2.e;
                    gey geyVar5 = gez.a;
                    if (geyVar5.b(gezVar, agowVar7, agowVar8) && (rqwVarC6 = gfb.c(gezVar, agowVar7)) != null) {
                        geyVar5.d(((gfn) grtVar2.g.a()).c(rqwVarC6), gezVar, 8, 8).c(abqb.CANCELLED);
                    }
                }
                return grtVar2.e(str, xju.UNAUTHENTICATED, "LauncherX profile lock is locked.");
            }
            if (str4 != null) {
                try {
                    uri = Intent.parseUri(str4, 0);
                } catch (URISyntaxException unused) {
                    gez gezVar3 = this.b;
                    if (gezVar3 != null) {
                        grt grtVar4 = this.c;
                        agow agowVar9 = grtVar4.f;
                        gey geyVar6 = gez.a;
                        if (geyVar6.b(gezVar3, agowVar9, grtVar4.e) && (rqwVarC2 = gfb.c(gezVar3, agowVar9)) != null) {
                            geyVar6.d(((gfn) grtVar4.g.a()).c(rqwVarC2), gezVar3, 8, 10).c(abqb.INVALID_ARGUMENT);
                        }
                    }
                    return this.c.e(str, xju.INVALID_ARGUMENT, a.e(str4, "Unable to open provider: intent '", "' was malformed or could not be launched by ActivityManager."));
                }
            } else {
                PackageManager packageManager = this.c.n;
                Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(str);
                uri = leanbackLaunchIntentForPackage == null ? packageManager.getLaunchIntentForPackage(str) : leanbackLaunchIntentForPackage;
            }
            if (uri != null) {
                grt grtVar5 = this.c;
                xnr xnrVar2 = this.d;
                gez gezVar4 = this.b;
                String strG = grtVar5.g(uri.getData(), str);
                try {
                    grtVar5.j(uri, str, strG, xnrVar2);
                    exl exlVar = grtVar5.j;
                    fex fexVar = grtVar5.q;
                    if (exlVar.c(uri, fexVar.f() ? fexVar.e() ? exj.a : exj.b : exj.c, exk.a, true != agvy.c(str, "com.google.android.youtube.tv") ? 2 : 1)) {
                        grtVar5.h(strG, str, gezVar4);
                        Uri data = uri.getData();
                        if (agvy.c(str, "com.netflix.ninja") && ((acfo) grtVar5.p.a()).b.contains(str)) {
                            if (agvy.c(data != null ? data.getQueryParameter("source_type") : null, "13")) {
                                this.a = 1;
                                objF = grtVar5.f(str, this);
                                if (objF == agtgVar) {
                                    return agtgVar;
                                }
                            }
                        }
                        return gqk.a;
                    }
                } catch (IOException e) {
                    if (gezVar4 != null) {
                        agow agowVar10 = grtVar5.f;
                        agow agowVar11 = grtVar5.e;
                        gey geyVar7 = gez.a;
                        if (geyVar7.b(gezVar4, agowVar10, agowVar11) && (rqwVarC4 = gfb.c(gezVar4, agowVar10)) != null) {
                            geyVar7.d(((gfn) grtVar5.g.a()).c(rqwVarC4), gezVar4, 8, 10).c(abqb.INTERNAL);
                        }
                    }
                    return grtVar5.e(str, xju.INTERNAL, "Unable to open provider, parent_event_id is malformed: ".concat(String.valueOf(e.getMessage())));
                }
            }
            if (agvy.c(str, "com.google.android.youtube.tv") && str4 != null && agyv.o(str4, "https://www.youtube.com/")) {
                grt grtVar6 = this.c;
                PackageManager packageManager2 = grtVar6.n;
                Intent leanbackLaunchIntentForPackage2 = packageManager2.getLeanbackLaunchIntentForPackage(str);
                if (leanbackLaunchIntentForPackage2 == null) {
                    leanbackLaunchIntentForPackage2 = packageManager2.getLaunchIntentForPackage(str);
                }
                if (leanbackLaunchIntentForPackage2 != null) {
                    xnr xnrVar3 = this.d;
                    gez gezVar5 = this.b;
                    if (!agvy.c(str4, "https://www.youtube.com/")) {
                        leanbackLaunchIntentForPackage2.setData(Uri.parse(str4));
                    }
                    String strG2 = grtVar6.g(leanbackLaunchIntentForPackage2.getData(), str);
                    try {
                        grtVar6.j(leanbackLaunchIntentForPackage2, str, strG2, xnrVar3);
                        if (grtVar6.i(leanbackLaunchIntentForPackage2)) {
                            grtVar6.h(strG2, str, gezVar5);
                            return gqk.a;
                        }
                    } catch (IOException e2) {
                        if (gezVar5 != null) {
                            agow agowVar12 = grtVar6.f;
                            agow agowVar13 = grtVar6.e;
                            gey geyVar8 = gez.a;
                            if (geyVar8.b(gezVar5, agowVar12, agowVar13) && (rqwVarC3 = gfb.c(gezVar5, agowVar12)) != null) {
                                geyVar8.d(((gfn) grtVar6.g.a()).c(rqwVarC3), gezVar5, 8, 10).c(abqb.INTERNAL);
                            }
                        }
                        return grtVar6.e(str, xju.INTERNAL, "Unable to open provider, parent_event_id is malformed: ".concat(String.valueOf(e2.getMessage())));
                    }
                }
            }
            return this.c.e(str, xju.UNKNOWN, "Unable to open provider: startActivity failed for an unknown reason (returned false).");
        }
        objF = obj;
        return (xhe) objF;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new grr(this.b, this.c, this.d, agswVar);
    }
}
