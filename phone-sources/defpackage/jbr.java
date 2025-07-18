package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerView;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import j$.util.Objects;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbr {
    public static float a;
    public static float b;

    /* JADX WARN: Multi-variable type inference failed */
    public static final jad D(int i, ixh ixhVar, scf scfVar) {
        long jHash = Objects.hash(ixhVar.d());
        scl sclVar = scfVar instanceof scl ? (scl) scfVar : null;
        int iB = sclVar != null ? sclVar.b() : -1;
        if (ixhVar.b().c > 0) {
            i = ixhVar.b().c;
        }
        int i2 = i;
        ubt ubtVar = ixhVar.b().d;
        if (ubtVar == null) {
            ubtVar = ubt.a;
        }
        return new jad(i2, jHash, iB, null, ubtVar, vsz.s(ixhVar.b().b));
    }

    public static final jad E(int i, scf scfVar) {
        if (true != (scfVar instanceof scl)) {
            scfVar = null;
        }
        return new jad(i, -1L, scfVar != null ? ((ivh) scfVar).C : -1, null, null, null, 56);
    }

    public static final jad F(int i, String str, wll wllVar, wni wniVar) {
        vtw vtwVarM = uby.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = wji.a.m();
        vtw vtwVarM3 = wik.a.m();
        wij wijVar = wij.DISTRIBUTOR;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar = vtwVarM3.b;
        wik wikVar = (wik) vucVar;
        wikVar.c = wijVar.q;
        wikVar.b |= 1;
        if (!vucVar.A()) {
            vtwVarM3.u();
        }
        wik wikVar2 = (wik) vtwVarM3.b;
        wikVar2.b |= 4;
        wikVar2.e = str;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wji wjiVar = (wji) vtwVarM2.b;
        wik wikVar3 = (wik) vtwVarM3.r();
        wikVar3.getClass();
        wjiVar.c = wikVar3;
        wjiVar.b |= 1;
        vuc vucVarO = vtwVarM2.r();
        vucVarO.getClass();
        tyq.k((wji) vucVarO, vtwVarM);
        tyq.l(ao(str, wllVar, wniVar), vtwVarM);
        return new jad(i, 0L, 0, tyq.j(vtwVarM), null, null, 54);
    }

    public static final jad G(int i, ubt ubtVar, vsz vszVar, String str) {
        uby ubyVar;
        str.getClass();
        if (str.length() == 0) {
            ubyVar = null;
        } else {
            vtw vtwVarM = uby.a.m();
            vtw vtwVarM2 = ubk.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ubk ubkVar = (ubk) vtwVarM2.b;
            ubkVar.b |= 2;
            ubkVar.e = str;
            ubk ubkVar2 = (ubk) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uby ubyVar2 = (uby) vtwVarM.b;
            ubkVar2.getClass();
            ubyVar2.d = ubkVar2;
            ubyVar2.b |= 2;
            ubyVar = (uby) vtwVarM.r();
        }
        return new jad(i, 0L, 0, ubyVar, ubtVar, vszVar, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.jad H(defpackage.wpm r19, java.lang.String r20, defpackage.wll r21, defpackage.wni r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbr.H(wpm, java.lang.String, wll, wni, java.lang.Integer):jad");
    }

    public static /* synthetic */ jad K(int i, String str, wll wllVar, wni wniVar, int i2) {
        if ((i2 & 4) != 0) {
            wllVar = null;
        }
        if ((i2 & 8) != 0) {
            wniVar = null;
        }
        return F(i, str, wllVar, wniVar);
    }

    public static /* synthetic */ jad L(int i, String str, int i2) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        return G(i, null, null, str);
    }

    public static /* synthetic */ jad M(wpm wpmVar, String str, wll wllVar, wni wniVar, Integer num, int i) {
        if ((i & 4) != 0) {
            wllVar = null;
        }
        if ((i & 8) != 0) {
            wniVar = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        return H(wpmVar, str, wllVar, wniVar, num);
    }

    public static final rok N(int i) {
        return new roj(i);
    }

    public static final izp O(wni wniVar) {
        String str = wniVar.b;
        str.getClass();
        int iAU = a.aU(wniVar.c);
        if (iAU == 0) {
            iAU = 1;
        }
        return new izp(str, wcq.O(iAU));
    }

    public static final void Q(Intent intent, Context context) {
        if (context instanceof Activity) {
            return;
        }
        intent.addFlags(268435456);
    }

    public static final void R(Intent intent, vvj vvjVar) {
        if (vvjVar != null) {
            vxr.l(intent, "action", vvjVar);
        }
    }

    public static final Intent S(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.apps.googletv.app.presentation.pages.contentrestrictions.ContentRestrictionsActivity");
        className.getClass();
        return className;
    }

    public static final Intent T(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Intent className = new Intent(intent).setClassName(context, "com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity");
        className.getClass();
        Q(className, context);
        return className;
    }

    public static final Intent U(Context context, Intent intent) {
        context.getClass();
        Intent className = new Intent(intent).setClassName(context, "com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity");
        className.getClass();
        Q(className, context);
        className.setAction(DeviceNotificationActivity.ACTION_VR);
        return className;
    }

    public static final Intent V(Context context) {
        context.getClass();
        Intent className = new Intent().addFlags(268468224).setClassName(context, "com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity");
        className.getClass();
        return className;
    }

    public static final Intent W(Context context, wkg wkgVar, String str) {
        Intent intent = new Intent("com.google.android.apps.googletv.ACTION_BROADCAST");
        intent.setPackage(context.getPackageName());
        R(intent, wkgVar);
        intent.putExtra("referrer", "notification");
        intent.putExtra("account", str);
        intent.addFlags(268435456);
        return intent;
    }

    public static final Intent X(Context context, String str) {
        Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(a.cg(str, "market://details?id=", "&referrer=utm_source%3Dplay-guide%26utm_medium%3Dorganic"))).putExtra("overlay", true).putExtra("callerId", context.getPackageName());
        intentPutExtra.getClass();
        Q(intentPutExtra, context);
        return intentPutExtra;
    }

    public static final Intent Y(Context context, String str) {
        Intent intentPutExtra;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null || (intentPutExtra = launchIntentForPackage.putExtra("source", "play-guide")) == null) {
            return null;
        }
        Q(intentPutExtra, context);
        return intentPutExtra;
    }

    public static final Intent Z(Context context, kvf kvfVar, String str, Intent intent) {
        Intent intentPutExtra = new Intent().putExtra("movie", kvfVar).putExtra("parent_intent", intent).putExtra("referrer", str);
        intentPutExtra.getClass();
        Q(intentPutExtra, context);
        Intent className = intentPutExtra.setClassName(context, "com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity");
        className.getClass();
        return className;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [iec, ied] */
    public static final iea a(Executor executor, ldv ldvVar, ksy ksyVar, lsc lscVar) {
        ?? C = ieb.c(Collections.EMPTY_LIST);
        ieb iebVar = (ieb) C;
        iebVar.k(new ids[0]);
        iebVar.q();
        iebVar.i(executor);
        nag nagVar = new nag(null, null, null, null);
        nagVar.n(ldvVar.a());
        nagVar.o(ksyVar);
        nagVar.a = tst.i(Locale.getDefault());
        nagVar.p(lgm.a());
        iebVar.h(new icy(nagVar.m()));
        iebVar.f(lscVar);
        iebVar.l();
        iebVar.n(new kro(1));
        return C.a();
    }

    public static final Intent aa(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity");
        className.getClass();
        Q(className, context);
        return className;
    }

    public static final Intent ab(Context context, kwn kwnVar, String str, Intent intent) {
        Intent intentPutExtra = new Intent().putExtra("show", kwnVar).putExtra("parent_intent", intent).putExtra("referrer", str);
        intentPutExtra.getClass();
        Q(intentPutExtra, context);
        Intent className = intentPutExtra.setClassName(context, "com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity");
        className.getClass();
        return className;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object ac(defpackage.iyz r10, defpackage.wlx r11, defpackage.yih r12) {
        /*
            boolean r0 = r12 instanceof defpackage.izb
            if (r0 == 0) goto L13
            r0 = r12
            izb r0 = (defpackage.izb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            izb r0 = new izb
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            java.lang.String r5 = "getUriForImage"
            java.lang.String r6 = "com/google/android/apps/googletv/app/image/PosterSharingContentProviderKt"
            java.lang.String r7 = "PosterSharingContentProvider.kt"
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.String r10 = r0.d
            wlx r11 = r0.c
            iyz r0 = r0.e
            defpackage.ybn.f(r12)
            goto L6e
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            defpackage.ybn.f(r12)
            java.lang.String r12 = r10.d(r11)
            java.io.File r2 = r10.a(r11)
            if (r2 != 0) goto L8d
            tui r2 = com.google.android.apps.googletv.app.image.PosterSharingContentProvider.a
            tuv r2 = r2.b()
            r8 = 157(0x9d, float:2.2E-43)
            tuv r2 = r2.j(r6, r5, r8, r7)
            tug r2 = (defpackage.tug) r2
            java.lang.String r8 = "No existing file found. Attempting to download. url=%s"
            r2.v(r8, r12)
            r0.e = r10
            r0.c = r11
            r0.d = r12
            r0.b = r4
            java.lang.Object r0 = r10.c(r12, r0)
            if (r0 == r1) goto L8c
            r9 = r0
            r0 = r10
            r10 = r12
            r12 = r9
        L6e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L78
            r10 = r0
            goto L8d
        L78:
            tui r11 = com.google.android.apps.googletv.app.image.PosterSharingContentProvider.a
            tuv r11 = r11.e()
            r12 = 162(0xa2, float:2.27E-43)
            tuv r11 = r11.j(r6, r5, r12, r7)
            tug r11 = (defpackage.tug) r11
            java.lang.String r12 = "Failed to download poster. PosterUrl=%s"
            r11.v(r12, r10)
            return r3
        L8c:
            return r1
        L8d:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder
            r12.<init>()
            java.lang.String r0 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r0)
            java.lang.String r0 = "com.google.android.videos.postersharingcontentprovider"
            android.net.Uri$Builder r12 = r12.authority(r0)
            java.io.File r10 = r10.a(r11)
            if (r10 == 0) goto Lbc
            java.lang.String r3 = r10.getName()
            r3.getClass()
            java.lang.String r10 = "."
            int r10 = defpackage.ylh.af(r3, r10)
            r11 = -1
            if (r10 == r11) goto Lbc
            r11 = 0
            java.lang.String r3 = r3.substring(r11, r10)
            r3.getClass()
        Lbc:
            android.net.Uri$Builder r10 = r12.encodedPath(r3)
            android.net.Uri r10 = r10.build()
            tui r11 = com.google.android.apps.googletv.app.image.PosterSharingContentProvider.a
            tuv r11 = r11.b()
            r12 = 174(0xae, float:2.44E-43)
            tuv r11 = r11.j(r6, r5, r12, r7)
            tug r11 = (defpackage.tug) r11
            java.lang.String r12 = "Poster ImageUri=%s"
            r11.v(r12, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbr.ac(iyz, wlx, yih):java.lang.Object");
    }

    public static final iye ad(iyd iydVar) {
        iydVar.getClass();
        return new iye(iydVar);
    }

    public static final void ae(wkx wkxVar, bkp bkpVar, ixo ixoVar, ixn ixnVar, bao baoVar, int i, int i2) {
        int i3;
        bao baoVar2;
        bkp bkpVar2;
        ixo ixoVar2;
        int i4 = i2 & 1;
        bao baoVarD = baoVar.d(2125670646);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != baoVarD.H(wkxVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? baoVarD.F(ixoVar) : baoVarD.H(ixoVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? baoVarD.F(ixnVar) : baoVarD.H(ixnVar)) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            ixoVar2 = ixoVar;
            baoVar2 = baoVarD;
            bkpVar2 = bkpVar;
        } else {
            baoVar2 = baoVarD;
            bkpVar2 = i5 != 0 ? bkp.g : bkpVar;
            ixoVar2 = i6 != 0 ? null : ixoVar;
            ixnVar.b(wkxVar, bkpVar2, ixoVar2, baoVar2, i3 & 8190);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khg(wkxVar, bkpVar2, ixoVar2, ixnVar, i, i2, 1);
        }
    }

    public static void af(ixn ixnVar, wkx wkxVar, bkp bkpVar, ixo ixoVar, bao baoVar, int i) {
        bkpVar.getClass();
        baoVar.x(469175381);
        int i2 = i >> 3;
        ixnVar.a().a(bkpVar, ixoVar, wkxVar, baoVar, Integer.valueOf(((i << 6) & 896) | (i2 & R.styleable.AppCompatTheme_windowNoTitle)));
        ((bas) baoVar).aa();
    }

    @yfp
    public static /* synthetic */ void ag(ixn ixnVar, wkx wkxVar, bkp bkpVar, ixo ixoVar, bao baoVar, int i, int i2) {
        wkxVar.getClass();
        ae(wkxVar, bkpVar, ixoVar, ixnVar, baoVar, i, i2);
    }

    public static final void ai(View view) {
        fsq fsqVar = new fsq(view, 9);
        mwb mwbVarJ = mjo.j(view, view.getContext().getString(com.google.android.videos.R.string.virtual_remote_mic_access));
        mwbVarJ.d("New_Gtv_Dark");
        mwbVarJ.c(com.google.android.videos.R.string.tab_playback_settings, fsqVar, null);
        mwbVarJ.a().h();
    }

    public static final tbb aj(View view, String str, int i, String str2, yjk yjkVar) throws Resources.NotFoundException {
        tbb tbbVarN = tbb.n(view, str, i);
        if (yjkVar != null && str2 != null) {
            tbbVarN.p(str2, new fsq(yjkVar, 8));
        }
        tbbVarN.q(view.getContext().getResources().getColor(com.google.android.videos.R.color.snackbar_background_color, null));
        tbbVarN.m().setTextColor(view.getContext().getResources().getColor(com.google.android.videos.R.color.snackbar_text_color, null));
        return tbbVarN;
    }

    public static final vvj an(dwi dwiVar, String str, vvj vvjVar) {
        try {
            Bundle bundle = (Bundle) dwiVar.b(str);
            if (bundle != null) {
                Set<String> setKeySet = bundle.keySet();
                setKeySet.getClass();
                vvj vvjVarI = vxr.i(bundle, (String) yfm.R(setKeySet), vvjVar, vtp.a());
                vvjVarI.getClass();
                return vvjVarI;
            }
        } catch (Exception e) {
            e.toString();
            krd.c("Failed to parse proto in SavedStateHandle. Error: ".concat(e.toString()));
        }
        return vvjVar;
    }

    private static final ubk ao(String str, wll wllVar, wni wniVar) {
        int i;
        vtw vtwVarM = ubk.a.m();
        vtw vtwVarM2 = ubj.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ubj ubjVar = (ubj) vtwVarM2.b;
        str.getClass();
        ubjVar.b |= 1;
        ubjVar.c = str;
        if (wllVar != null || wniVar != null) {
            vtw vtwVarM3 = ubl.a.m();
            if (wllVar != null) {
                vtw vtwVarM4 = ubm.a.m();
                String str2 = wllVar.b == 1 ? (String) wllVar.c : "";
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                ubm ubmVar = (ubm) vtwVarM4.b;
                str2.getClass();
                ubmVar.b |= 1;
                ubmVar.c = str2;
                vuc vucVarO = vtwVarM4.r();
                vucVarO.getClass();
                ubm ubmVar2 = (ubm) vucVarO;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                ubl ublVar = (ubl) vtwVarM3.b;
                ublVar.d = ubmVar2;
                ublVar.c = 2;
            }
            if (wniVar != null) {
                vtw vtwVarM5 = ubn.a.m();
                String str3 = wniVar.b;
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                vuc vucVar = vtwVarM5.b;
                ubn ubnVar = (ubn) vucVar;
                str3.getClass();
                ubnVar.b |= 1;
                ubnVar.c = str3;
                int iAU = a.aU(wniVar.c);
                if (iAU == 0) {
                    iAU = 1;
                }
                int i2 = iAU - 2;
                if (i2 != 1) {
                    i = 3;
                    if (i2 != 2) {
                        i = i2 != 3 ? i2 != 4 ? 1 : 5 : 4;
                    }
                } else {
                    i = 2;
                }
                if (!vucVar.A()) {
                    vtwVarM5.u();
                }
                ubn ubnVar2 = (ubn) vtwVarM5.b;
                ubnVar2.d = i - 1;
                ubnVar2.b |= 2;
                vuc vucVarO2 = vtwVarM5.r();
                vucVarO2.getClass();
                ubn ubnVar3 = (ubn) vucVarO2;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                ubl ublVar2 = (ubl) vtwVarM3.b;
                ublVar2.d = ubnVar3;
                ublVar2.c = 1;
            }
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ubj ubjVar2 = (ubj) vtwVarM2.b;
            ubl ublVar3 = (ubl) vtwVarM3.r();
            ublVar3.getClass();
            ubjVar2.d = ublVar3;
            ubjVar2.b |= 2;
        }
        ubj ubjVar3 = (ubj) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ubk ubkVar = (ubk) vtwVarM.b;
        ubjVar3.getClass();
        ubkVar.d = ubjVar3;
        ubkVar.c = 4;
        vuc vucVarO3 = vtwVarM.r();
        vucVarO3.getClass();
        return (ubk) vucVarO3;
    }

    public static final String b(oty otyVar, Context context) {
        otyVar.getClass();
        int iOrdinal = otyVar.b.ordinal();
        if (iOrdinal == 0) {
            String string = context.getString(com.google.android.videos.R.string.error_purchase_not_found);
            string.getClass();
            return string;
        }
        if (iOrdinal == 1) {
            String string2 = context.getString(com.google.android.videos.R.string.video_not_found);
            string2.getClass();
            return string2;
        }
        if (iOrdinal == 2) {
            String string3 = context.getString(com.google.android.videos.R.string.error_playback_on_unsupported_device);
            string3.getClass();
            return string3;
        }
        if (iOrdinal == 3) {
            String string4 = context.getString(com.google.android.videos.R.string.rental_period_expired);
            string4.getClass();
            return string4;
        }
        if (iOrdinal == 4) {
            String string5 = context.getString(com.google.android.videos.R.string.error_purchase_not_found);
            string5.getClass();
            return string5;
        }
        if (iOrdinal == 5) {
            String string6 = context.getString(com.google.android.videos.R.string.error_generic);
            string6.getClass();
            return string6;
        }
        switch (iOrdinal) {
            case 20:
                String string7 = context.getString(com.google.android.videos.R.string.streaming_devices_quota_exceeded);
                string7.getClass();
                return string7;
            case 21:
                String string8 = context.getString(com.google.android.videos.R.string.error_purchase_pinned_elsewhere);
                string8.getClass();
                return string8;
            case 22:
                String string9 = context.getString(com.google.android.videos.R.string.error_simultaneous_playback_detected);
                string9.getClass();
                return string9;
            case 23:
                String string10 = context.getString(com.google.android.videos.R.string.error_concurrent_playbacks_by_account);
                string10.getClass();
                return string10;
            case 24:
                String string11 = context.getString(com.google.android.videos.R.string.error_simultaneous_playback_by_family_detected);
                string11.getClass();
                return string11;
            case 25:
                String string12 = context.getString(com.google.android.videos.R.string.error_concurrent_playbacks_by_family);
                string12.getClass();
                return string12;
            case 26:
                String string13 = context.getString(com.google.android.videos.R.string.error_generic);
                string13.getClass();
                return string13;
            default:
                switch (iOrdinal) {
                    case 28:
                        String string14 = context.getString(com.google.android.videos.R.string.pinning_error_purchase_pinned_elsewhere);
                        string14.getClass();
                        return string14;
                    case 29:
                        String string15 = context.getString(com.google.android.videos.R.string.pinning_error_too_many_active_devices_for_account);
                        string15.getClass();
                        return string15;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        String string16 = context.getString(com.google.android.videos.R.string.error_active_family_devices);
                        string16.getClass();
                        return string16;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        String string17 = context.getString(com.google.android.videos.R.string.pinning_error_too_many_accounts_on_device);
                        string17.getClass();
                        return string17;
                    case 32:
                        String string18 = context.getString(com.google.android.videos.R.string.error_pinned_different_source);
                        string18.getClass();
                        return string18;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        String string19 = context.getString(com.google.android.videos.R.string.error_generic);
                        string19.getClass();
                        return string19;
                    default:
                        String string20 = context.getString(com.google.android.videos.R.string.error_generic);
                        string20.getClass();
                        return string20;
                }
        }
    }

    public static final otv c(Throwable th) {
        yna ynaVar = new yna(new ymu(ykr.h(th.getCause(), new iwg(14)), true, abo.j), 1);
        return (otv) (!ynaVar.hasNext() ? null : ynaVar.next());
    }

    public static final int d(boolean z) {
        return z ? 0 : 4;
    }

    public static final void e(boolean z, View view) {
        ProgressBar progressBar;
        ImageButton imageButton;
        if (view != null && (imageButton = (ImageButton) view.findViewById(com.google.android.videos.R.id.exo_play_pause)) != null) {
            imageButton.setVisibility(d(!z));
        }
        if (view == null || (progressBar = (ProgressBar) view.findViewById(com.google.android.videos.R.id.loading_progress_bar)) == null) {
            return;
        }
        progressBar.setVisibility(d(z));
    }

    public static final jei f(View view) {
        LayoutInflater.Factory factoryN = ihz.N(view);
        if (factoryN instanceof jei) {
            return (jei) factoryN;
        }
        return null;
    }

    public static final kiw g(View view) {
        dxd dxdVarM = ihz.M(view);
        kiw kiwVar = dxdVarM instanceof kiw ? (kiw) dxdVarM : null;
        if (kiwVar != null) {
            return kiwVar;
        }
        LayoutInflater.Factory factoryN = ihz.N(view);
        if (factoryN instanceof kiw) {
            return (kiw) factoryN;
        }
        return null;
    }

    public static final MyEpisodesActivity h(View view) {
        by byVarN = ihz.N(view);
        if (byVarN instanceof MyEpisodesActivity) {
            return (MyEpisodesActivity) byVarN;
        }
        return null;
    }

    public static final lat i(Cursor cursor) {
        int i = jee.e.l;
        byte[] blob = cursor.isNull(i) ? null : cursor.getBlob(i);
        if (blob == null) {
            return null;
        }
        vuc vucVarP = vuc.p(lat.a, blob, 0, blob.length, vtp.a());
        vuc.B(vucVarP);
        return (lat) vucVarP;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.File j(android.content.Context r7, int r8) throws defpackage.lka {
        /*
            java.lang.String r0 = "Invalid storage option: "
            java.lang.String r0 = defpackage.a.cf(r8, r0)
            r1 = 1
            r2 = 0
            r3 = 2
            if (r8 >= r3) goto Ld
            r4 = r1
            goto Le
        Ld:
            r4 = r2
        Le:
            defpackage.a.aD(r4, r0)
            java.lang.String r0 = android.os.Environment.DIRECTORY_MOVIES
            java.io.File[] r7 = r7.getExternalFilesDirs(r0)
            r7.getClass()
            int r0 = r7.length
            if (r0 > r3) goto L22
            java.util.List r7 = defpackage.yfm.aX(r7)
            goto L37
        L22:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = r2
        L28:
            if (r2 >= r0) goto L36
            r6 = r7[r2]
            r4.add(r6)
            int r5 = r5 + r1
            if (r5 != r3) goto L33
            goto L36
        L33:
            int r2 = r2 + 1
            goto L28
        L36:
            r7 = r4
        L37:
            int r0 = r7.size()
            if (r8 < r0) goto L3f
            r7 = 0
            goto L45
        L3f:
            java.lang.Object r7 = r7.get(r8)
            java.io.File r7 = (java.io.File) r7
        L45:
            if (r7 != 0) goto Lb2
            r7 = 60
            r0 = 18
            if (r8 != 0) goto Lac
            java.lang.String r8 = android.os.Environment.getExternalStorageState()
            r1 = 20
            r2 = 8
            if (r8 == 0) goto La4
            int r3 = r8.hashCode()
            switch(r3) {
                case -1340233281: goto L9c;
                case -903566235: goto L8e;
                case 3386958: goto L80;
                case 525888122: goto L72;
                case 1091836000: goto L5f;
                default: goto L5e;
            }
        L5e:
            goto La4
        L5f:
            java.lang.String r7 = "removed"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto La4
            boolean r7 = android.os.Environment.isExternalStorageRemovable()
            if (r7 == 0) goto La4
            r7 = 9
            r0 = 15
            goto La6
        L72:
            java.lang.String r7 = "unmountable"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L7b
            goto La4
        L7b:
            r7 = 62
            r0 = 16
            goto La6
        L80:
            java.lang.String r7 = "nofs"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L89
            goto La4
        L89:
            r7 = 61
            r0 = 17
            goto La6
        L8e:
            java.lang.String r7 = "shared"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L97
            goto La4
        L97:
            r7 = 10
            r0 = 19
            goto La6
        L9c:
            java.lang.String r3 = "unmounted"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto La6
        La4:
            r0 = r1
            r7 = r2
        La6:
            lka r8 = new lka
            r8.<init>(r0, r7)
            goto Lb1
        Lac:
            lka r8 = new lka
            r8.<init>(r0, r7)
        Lb1:
            throw r8
        Lb2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbr.j(android.content.Context, int):java.io.File");
    }

    public static final void k(by byVar, PlayerView playerView, DefaultTimeBar defaultTimeBar, yjv yjvVar) {
        if (byVar == null || !(byVar instanceof PlayerActivity)) {
            return;
        }
        PlayerActivity playerActivity = (PlayerActivity) byVar;
        Window window = playerActivity.getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT <= 30) {
                window.addFlags(512);
            }
            TextView textView = (TextView) window.findViewById(com.google.android.videos.R.id.feedback_text_rewind);
            czn cznVar = new czn(playerActivity, 2);
            int[] iArr = cww.a;
            cwm.l(textView, cznVar);
            cwm.l((TextView) window.findViewById(com.google.android.videos.R.id.feedback_text_forward), new czn(playerActivity, 3));
            if (defaultTimeBar != null) {
                cwm.l(defaultTimeBar, new czn(playerActivity, 4));
            }
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
            } else {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
            }
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        l(playerActivity, false);
        playerView.h = new jde(yjvVar, playerView, playerActivity, playerActivity);
        eci.e(playerView.d);
    }

    public static final void l(xcf xcfVar, boolean z) {
        cxe cxeVar = new cxe(xcfVar.getWindow(), xcfVar.getWindow().getDecorView());
        if (Build.VERSION.SDK_INT <= 30) {
            ((cwp) cxeVar.a).f();
        }
        ((cwp) cxeVar.a).g();
        if (z) {
            ActionBar supportActionBar = xcfVar.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.show();
                return;
            }
            return;
        }
        ActionBar supportActionBar2 = xcfVar.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.hide();
        }
    }

    public static final int m(lck lckVar, int i) {
        int i2;
        int i3 = lckVar.f;
        if (i3 <= 0 || (i2 = lckVar.e) <= 0) {
            return i / lckVar.g;
        }
        if (i > i3) {
            i = i3;
        }
        return (int) ((i * (i2 - 1)) / i3);
    }

    public static /* synthetic */ void n(View view, View view2, View view3) {
        double height = view3.getHeight();
        double width = view3.getWidth();
        int i = (int) (height * (-0.5d));
        int i2 = (int) (height * 1.5d);
        view.layout((int) ((-0.5d) * width), i, (int) (0.35d * width), i2);
        view2.layout((int) (width * 0.65d), i, (int) (1.5d * width), i2);
    }

    public static final String o(kzo kzoVar) {
        int iJ;
        kzoVar.getClass();
        if (kzoVar.A()) {
            iJ = kzoVar.j();
        } else {
            int iJ2 = kzoVar.M;
            if (iJ2 == 0) {
                iJ2 = kzoVar.j();
                kzoVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return String.valueOf(iJ);
    }

    public static final String p(kwx kwxVar) {
        kwxVar.getClass();
        return String.valueOf(kwxVar.hashCode());
    }

    public static final boolean q(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final wkc r(wnu wnuVar) {
        wnuVar.getClass();
        vtw vtwVarM = wkc.a.m();
        vtwVarM.getClass();
        String str = wnuVar.b;
        str.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wkc wkcVar = (wkc) vucVar;
        wkcVar.b |= 1;
        wkcVar.c = str;
        String str2 = wnuVar.c;
        str2.getClass();
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wkc wkcVar2 = (wkc) vucVar2;
        wkcVar2.b |= 2;
        wkcVar2.d = str2;
        int i = wnuVar.d;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        wkc wkcVar3 = (wkc) vucVar3;
        wkcVar3.b |= 4;
        wkcVar3.e = i;
        int i2 = wnuVar.e;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        vuc vucVar4 = vtwVarM.b;
        wkc wkcVar4 = (wkc) vucVar4;
        wkcVar4.b |= 8;
        wkcVar4.f = i2;
        String str3 = wnuVar.f;
        str3.getClass();
        if (!vucVar4.A()) {
            vtwVarM.u();
        }
        wkc wkcVar5 = (wkc) vtwVarM.b;
        wkcVar5.b |= 16;
        wkcVar5.g = str3;
        vuc vucVarO = vtwVarM.r();
        vucVarO.getClass();
        return (wkc) vucVarO;
    }

    public static final Object s(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            krd.b("GNP registered result " + entry.getValue() + " for account " + ((qpv) entry.getKey()).a());
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            krd.b("GNP unregistered result " + entry2.getValue() + " for account " + ((qpv) entry2.getKey()).a());
        }
        return ygi.a;
    }

    public static final yow t() {
        return yoz.l(ypk.a);
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "DEEPLINK_3P_SUCCESSFUL";
            case 2:
                return "DEEPLINK_3P_FAILED";
            case 3:
                return "CANCELLED_PRE_ORDER";
            case 4:
                return "TVOD_PLAYBACK_SUCCESSFUL";
            case 5:
                return "TVOD_PLAYBACK_FAILED";
            case 6:
                return "PURCHASE_FLOW";
            case 7:
                return "PURCHASE_PAGE";
            default:
                return "UNKNOWN";
        }
    }

    public static /* synthetic */ void v(Context context, wni wniVar, wpd wpdVar, woi woiVar, String str, int i) {
        if ((i & 4) != 0) {
            wpdVar = wpd.a;
        }
        if ((i & 8) != 0) {
            woiVar = woi.a;
        }
        if ((i & 16) != 0) {
            str = "";
        }
        context.getClass();
        wniVar.getClass();
        wpdVar.getClass();
        woiVar.getClass();
        str.getClass();
        ksy ksyVarR = hju.r(wniVar);
        if (ksyVarR == null) {
            return;
        }
        Intent intent = new Intent().setClass(context, EntityPageActivity.class);
        intent.putExtra("asset_id", ksyVarR);
        intent.getClass();
        hju.B(intent, context);
        hju.A(intent, "entity_page_parameters", wpdVar);
        hju.A(intent, "sharing_info", woiVar);
        intent.putExtra("referrer", str);
        context.startActivity(intent);
    }
}
