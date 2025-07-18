package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.googletv.app.presentation.pages.entitymenu.EntityMenuFragment;
import com.google.android.apps.googletv.app.presentation.pages.genericcomponent.GenericComponentPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.genericstreamdialog.GenericStreamDialogFragment;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifv implements ixf {
    private final /* synthetic */ int a;

    public ifv(int i) {
        this.a = i;
    }

    @Override // defpackage.ixf
    public final void a(wkg wkgVar, Context context, String str, String str2) {
        switch (this.a) {
            case 0:
                vvd vvdVar = wqf.c;
                wkgVar.i(vvdVar);
                Object objK = wkgVar.l.k((vub) vvdVar.c);
                if (objK == null) {
                    objK = vvdVar.b;
                } else {
                    vvdVar.c(objK);
                }
                objK.getClass();
                wll wllVar = ((wqf) objK).b;
                if (wllVar == null) {
                    wllVar = wll.a;
                }
                wllVar.getClass();
                by byVarF = hju.F(context);
                if (byVarF != null) {
                    Bundle bundle = new Bundle();
                    hju.I(bundle, "entity_id", wllVar);
                    EntityMenuFragment entityMenuFragment = new EntityMenuFragment();
                    entityMenuFragment.setArguments(bundle);
                    entityMenuFragment.show(byVarF.getSupportFragmentManager(), "entity_menu");
                    break;
                }
                break;
            case 1:
                by byVarF2 = hju.F(context);
                if (byVarF2 != null) {
                    byVarF2.finish();
                }
                vvd vvdVar2 = wpt.d;
                wkgVar.i(vvdVar2);
                Object objK2 = wkgVar.l.k((vub) vvdVar2.c);
                if (objK2 == null) {
                    objK2 = vvdVar2.b;
                } else {
                    vvdVar2.c(objK2);
                }
                objK2.getClass();
                wpt wptVar = (wpt) objK2;
                Intent intent = new Intent();
                if ((wptVar.b & 1) != 0) {
                    String str3 = wptVar.c;
                    str3.getClass();
                    if (str3.length() > 0) {
                        intent.putExtra("destination_id", wptVar.c);
                    }
                }
                context.startActivity(jbr.T(context, intent));
                break;
            case 2:
                vvd vvdVar3 = wpw.g;
                wkgVar.i(vvdVar3);
                Object objK3 = wkgVar.l.k((vub) vvdVar3.c);
                if (objK3 == null) {
                    objK3 = vvdVar3.b;
                } else {
                    vvdVar3.c(objK3);
                }
                wpw wpwVar = (wpw) objK3;
                wkx wkxVar = wpwVar.d;
                if (wkxVar == null) {
                    wkxVar = wkx.a;
                }
                wkxVar.getClass();
                String str4 = wpwVar.b;
                str4.getClass();
                wmc wmcVar = wpwVar.e;
                if (wmcVar == null) {
                    wmcVar = wmc.a;
                }
                wmcVar.getClass();
                boolean z = wpwVar.c;
                woi woiVar = wpwVar.f;
                if (woiVar == null) {
                    woiVar = woi.a;
                }
                woiVar.getClass();
                Intent intent2 = new Intent().setClass(context, GenericComponentPageActivity.class);
                intent2.getClass();
                hju.B(intent2, context);
                hju.A(intent2, "component", wkxVar);
                intent2.putExtra("stream_page_title", str4);
                intent2.putExtra("referrer", str);
                intent2.putExtra("stream_page_show_title_only_when_scrolled", z);
                hju.A(intent2, "logging_info", wmcVar);
                hju.A(intent2, "sharing_info", woiVar);
                context.startActivity(intent2);
                break;
            case 3:
                vvd vvdVar4 = wpx.d;
                wkgVar.i(vvdVar4);
                Object objK4 = wkgVar.l.k((vub) vvdVar4.c);
                if (objK4 == null) {
                    objK4 = vvdVar4.b;
                } else {
                    vvdVar4.c(objK4);
                }
                wpx wpxVar = (wpx) objK4;
                wly wlyVar = wpxVar.b;
                if (wlyVar == null) {
                    wlyVar = wly.a;
                }
                wlyVar.getClass();
                wmc wmcVar2 = wpxVar.c;
                if (wmcVar2 == null) {
                    wmcVar2 = wmc.a;
                }
                wmcVar2.getClass();
                by byVarF3 = hju.F(context);
                if (byVarF3 != null) {
                    GenericStreamDialogFragment genericStreamDialogFragment = new GenericStreamDialogFragment();
                    Bundle bundle2 = new Bundle();
                    hju.I(bundle2, "included_stream", wlyVar);
                    hju.I(bundle2, "logging_info", wmcVar2);
                    genericStreamDialogFragment.setArguments(bundle2);
                    genericStreamDialogFragment.show(byVarF3.getSupportFragmentManager(), "generic_stream_dialog");
                    break;
                }
                break;
            case 4:
                vvd vvdVar5 = wpy.f;
                wkgVar.i(vvdVar5);
                Object objK5 = wkgVar.l.k((vub) vvdVar5.c);
                if (objK5 == null) {
                    objK5 = vvdVar5.b;
                } else {
                    vvdVar5.c(objK5);
                }
                wpy wpyVar = (wpy) objK5;
                String str5 = wpyVar.c;
                str5.getClass();
                String str6 = wpyVar.b;
                wmc wmcVar3 = wpyVar.d;
                if (wmcVar3 == null) {
                    wmcVar3 = wmc.a;
                }
                woi woiVar2 = wpyVar.e;
                if (woiVar2 == null) {
                    woiVar2 = woi.a;
                }
                Intent intent3 = new Intent().setClass(context, GenericComponentPageActivity.class);
                vty vtyVar = (vty) wkx.a.m();
                vtyVar.getClass();
                wae.l(wkw.GENERIC_STREAM_PAGE, vtyVar);
                vvd vvdVar6 = wso.i;
                vvdVar6.getClass();
                vtw vtwVarM = wso.a.m();
                vtwVarM.getClass();
                vtw vtwVarM2 = wly.a.m();
                vtwVarM2.getClass();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                wly wlyVar2 = (wly) vtwVarM2.b;
                int i = 2;
                wlyVar2.b = 2;
                wlyVar2.c = str5;
                vuc vucVarR = vtwVarM2.r();
                vucVarR.getClass();
                wly wlyVar3 = (wly) vucVarR;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wso wsoVar = (wso) vtwVarM.b;
                wsoVar.e = wlyVar3;
                wsoVar.b |= 1;
                wsj wsjVar = wsj.a;
                wsjVar.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                wso wsoVar2 = (wso) vucVar;
                wsoVar2.d = wsjVar;
                wsoVar2.c = 2;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                wso wsoVar3 = (wso) vtwVarM.b;
                wsoVar3.b |= 4;
                wsoVar3.g = true;
                if (str6 != null && str6.length() != 0) {
                    i = 4;
                }
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wso wsoVar4 = (wso) vtwVarM.b;
                wsoVar4.h = i - 1;
                wsoVar4.b |= 8;
                vuc vucVarR2 = vtwVarM.r();
                vucVarR2.getClass();
                vtyVar.bL(vvdVar6, (wso) vucVarR2);
                wkx wkxVarJ = wae.j(vtyVar);
                intent3.getClass();
                hju.A(intent3, "component", wkxVarJ);
                intent3.putExtra("stream_page_title", str6);
                hju.B(intent3, context);
                hju.A(intent3, "logging_info", wmcVar3);
                hju.A(intent3, "sharing_info", woiVar2);
                intent3.putExtra("referrer", str);
                context.startActivity(intent3);
                break;
            case 5:
                context.startActivity(mnu.a(context, true, lid.a()));
                break;
            case 6:
                vvd vvdVar7 = wpz.f;
                wkgVar.i(vvdVar7);
                Object objK6 = wkgVar.l.k((vub) vvdVar7.c);
                if (objK6 == null) {
                    objK6 = vvdVar7.b;
                } else {
                    vvdVar7.c(objK6);
                }
                wpz wpzVar = (wpz) objK6;
                if ((wpzVar.b & 4) == 0) {
                    wll wllVar2 = wpzVar.c;
                    if (wllVar2 == null) {
                        wllVar2 = wll.a;
                    }
                    wllVar2.getClass();
                    String str7 = wpzVar.d;
                    str7.getClass();
                    Intent intent4 = new Intent().setClass(context, MyEpisodesActivity.class);
                    intent4.getClass();
                    hju.B(intent4, context);
                    hju.A(intent4, "show_entity_id", wllVar2);
                    intent4.putExtra("referrer", "");
                    intent4.putExtra("refresh_token", str7);
                    context.startActivity(intent4);
                    break;
                } else {
                    wni wniVar = wpzVar.e;
                    if (wniVar == null) {
                        wniVar = wni.a;
                    }
                    wniVar.getClass();
                    jan.f(context, wniVar);
                    break;
                }
            case 7:
                vvd vvdVar8 = wqa.d;
                wkgVar.i(vvdVar8);
                Object objK7 = wkgVar.l.k((vub) vvdVar8.c);
                if (objK7 == null) {
                    objK7 = vvdVar8.b;
                } else {
                    vvdVar8.c(objK7);
                }
                wqa wqaVar = (wqa) objK7;
                String str8 = wqaVar.b;
                str8.getClass();
                String str9 = wqaVar.c;
                str9.getClass();
                try {
                    context.startActivity(jbr.Y(context, str8));
                    break;
                } catch (Exception e) {
                    krd.d("Failed to start app launch intent, packageName=".concat(str8), e);
                    if (!ylh.L(str9)) {
                        try {
                            Intent intentPutExtra = Intent.parseUri(str9, 0).addFlags(335544320).setPackage(str8).putExtra("source", "play-guide");
                            intentPutExtra.getClass();
                            context.startActivity(intentPutExtra);
                            return;
                        } catch (Exception e2) {
                            krd.d(a.cz(str8, str9, "Failed to start app launch intent with appUri=", ", packageName="), e2);
                            by byVarF4 = hju.F(context);
                            byVarF4.getClass();
                            Intent intentPutExtra2 = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/apps/launch?id=".concat(str8))).putExtra("source", "play-guide").putExtra("overlay", true).putExtra("callerId", context.getPackageName());
                            intentPutExtra2.getClass();
                            jbr.Q(intentPutExtra2, context);
                            byVarF4.startActivityForResult(intentPutExtra2, 1008);
                            return;
                        }
                    }
                    try {
                        by byVarF42 = hju.F(context);
                        byVarF42.getClass();
                        Intent intentPutExtra22 = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/apps/launch?id=".concat(str8))).putExtra("source", "play-guide").putExtra("overlay", true).putExtra("callerId", context.getPackageName());
                        intentPutExtra22.getClass();
                        jbr.Q(intentPutExtra22, context);
                        byVarF42.startActivityForResult(intentPutExtra22, 1008);
                        return;
                    } catch (Exception e3) {
                        krd.d("Failed to start app launch intent with play store deeplink, packageName=".concat(str8), e3);
                        try {
                            by byVarF5 = hju.F(context);
                            byVarF5.getClass();
                            byVarF5.startActivityForResult(jbr.X(context, str8), 1007);
                            return;
                        } catch (Exception e4) {
                            krd.d("Failed to start app install intent, packageName=".concat(str8), e4);
                            return;
                        }
                    }
                }
            case 8:
                context.startActivity(jbr.S(context));
                break;
            default:
                vvd vvdVar9 = wqd.d;
                wkgVar.i(vvdVar9);
                Object objK8 = wkgVar.l.k((vub) vvdVar9.c);
                if (objK8 == null) {
                    objK8 = vvdVar9.b;
                } else {
                    vvdVar9.c(objK8);
                }
                String str10 = ((wqd) objK8).c;
                str10.getClass();
                jan.j(context, str10, str);
                break;
        }
    }

    public ifv(jan janVar, int i) {
        this.a = i;
        janVar.getClass();
    }

    public ifv(jan janVar, int i, byte[] bArr) {
        this.a = i;
        janVar.getClass();
    }

    public ifv(jan janVar, int i, char[] cArr) {
        this.a = i;
        janVar.getClass();
    }

    public ifv(jan janVar, int i, short[] sArr) {
        this.a = i;
        janVar.getClass();
    }

    public ifv(jan janVar, int i, int[] iArr) {
        this.a = i;
        janVar.getClass();
    }

    public ifv(jan janVar, int i, boolean[] zArr) {
        this.a = i;
        janVar.getClass();
    }

    public ifv(jan janVar, int i, float[] fArr) {
        this.a = i;
        janVar.getClass();
    }

    public ifv(jan janVar, int i, byte[][] bArr) {
        this.a = i;
        janVar.getClass();
    }

    @Override // defpackage.ixf
    public final /* synthetic */ void b() {
    }
}
