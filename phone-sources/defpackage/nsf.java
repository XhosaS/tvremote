package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsf {
    public final Object a;
    public final Object b;

    public nsf(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static final void e() {
        Build.TYPE.equals("user");
    }

    public static nsf g(View view) {
        return new nsf(new mmm(view, 17), new mmg(8));
    }

    public static nsf h(final iea ieaVar, final idw idwVar, final int i, Executor executor, ids idsVar, lio lioVar, final idb idbVar, pkg pkgVar, pjx pjxVar, boolean z) {
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{ieaVar, idsVar};
        krzVar.b = executor;
        krzVar.d(new ieh() { // from class: myo
            @Override // defpackage.ieh
            public final Object a() {
                myq myqVarA = myr.a();
                int i2 = i;
                myqVarA.b(i2);
                ieg iegVarF = ieg.f(myqVarA.a());
                iea ieaVar2 = ieaVar;
                if (!((ieg) ieaVar2.a()).m()) {
                    return iegVarF;
                }
                idw idwVar2 = idwVar;
                kxc kxcVar = (kxc) ((ieg) ieaVar2.a()).g();
                if (!idwVar2.b(kxcVar) || kxcVar.G().isEmpty()) {
                    return iegVarF;
                }
                idb idbVar2 = idbVar;
                myq myqVarA2 = myr.a();
                myqVarA2.b(i2);
                myqVarA2.a = tst.i((ksy) kxcVar.G().get(0));
                myqVarA2.b = ((kwz) kxcVar).E();
                myqVarA2.c = idbVar2;
                return ieg.f(myqVarA2.a());
            }
        });
        return new nsf(krzVar.a(), lioVar, pkgVar, pjxVar, z);
    }

    public static nsf t(pka pkaVar) {
        ucy ucyVar = pkaVar.d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        return u(pkaVar, ucyVar.d);
    }

    public static nsf u(pka pkaVar, int i) {
        int i2;
        switch (i) {
            case 104280:
                i2 = 303;
                break;
            case 107363:
                i2 = 337;
                break;
            case 107509:
                i2 = 322;
                break;
            case 107515:
            case 110089:
            case 110090:
                i2 = 404;
                break;
            case 107517:
            case 124804:
            case 134403:
            case 144848:
                i2 = 500;
                break;
            case 107518:
                i2 = 513;
                break;
            case 107976:
                i2 = 338;
                break;
            case 108029:
                i2 = 419;
                break;
            case 108104:
                i2 = 216;
                break;
            case 108217:
                i2 = 620;
                break;
            case 108235:
                i2 = 408;
                break;
            case 108262:
                i2 = 519;
                break;
            case 108469:
                i2 = 400;
                break;
            case 108586:
                i2 = 309;
                break;
            case 109024:
                i2 = 420;
                break;
            case 109284:
                i2 = 680;
                break;
            case 109285:
                i2 = 627;
                break;
            case 109286:
                i2 = 684;
                break;
            case 109287:
                i2 = 650;
                break;
            case 109288:
                i2 = 421;
                break;
            case 109289:
                i2 = 422;
                break;
            case 109517:
                i2 = 423;
                break;
            case 109768:
            case 179116:
                i2 = 306;
                break;
            case 109826:
                i2 = 670;
                break;
            case 109902:
            case 110034:
            case 171506:
            case 171507:
                i2 = 600;
                break;
            case 109920:
                i2 = 38;
                break;
            case 109927:
            case 156069:
                i2 = 401;
                break;
            case 109932:
            case 139332:
                i2 = 619;
                break;
            case 109933:
                i2 = 647;
                break;
            case 109934:
                i2 = 646;
                break;
            case 109935:
            case 141582:
                i2 = 649;
                break;
            case 109936:
            case 141583:
                i2 = 648;
                break;
            case 109942:
                i2 = 403;
                break;
            case 109943:
            case 110070:
                i2 = 612;
                break;
            case 109944:
                i2 = 402;
                break;
            case 109945:
                i2 = 609;
                break;
            case 109946:
                i2 = 608;
                break;
            case 110071:
                i2 = 673;
                break;
            case 110134:
                i2 = 336;
                break;
            case 110186:
                i2 = 501;
                break;
            case 112835:
            case 130666:
                i2 = 511;
                break;
            case 113887:
                i2 = 604;
                break;
            case 113888:
                i2 = 633;
                break;
            case 113889:
                i2 = 605;
                break;
            case 114336:
                i2 = 611;
                break;
            case 114337:
                i2 = 610;
                break;
            case 114338:
                i2 = 523;
                break;
            case 115367:
                i2 = 50;
                break;
            case 116438:
                i2 = 666;
                break;
            case 116439:
                i2 = 667;
                break;
            case 116440:
                i2 = 665;
                break;
            case 123898:
                i2 = 312;
                break;
            case 123899:
                i2 = 314;
                break;
            case 128483:
                i2 = 525;
                break;
            case 128513:
                i2 = 607;
                break;
            case 129676:
                i2 = 339;
                break;
            case 129991:
                i2 = 517;
                break;
            case 129992:
                i2 = 516;
                break;
            case 130099:
                i2 = 526;
                break;
            case 130100:
                i2 = 641;
                break;
            case 130386:
                i2 = 340;
                break;
            case 133928:
                i2 = 342;
                break;
            case 135040:
                i2 = 219;
                break;
            case 135041:
                i2 = 218;
                break;
            case 135042:
            case 166454:
                i2 = 225;
                break;
            case 135043:
                i2 = 230;
                break;
            case 135044:
                i2 = 231;
                break;
            case 135045:
                i2 = 217;
                break;
            case 135046:
                i2 = 223;
                break;
            case 135047:
                i2 = 227;
                break;
            case 135048:
                i2 = 222;
                break;
            case 135049:
                i2 = 228;
                break;
            case 135050:
                i2 = 226;
                break;
            case 135051:
                i2 = 224;
                break;
            case 135052:
                i2 = 229;
                break;
            case 135053:
                i2 = 221;
                break;
            case 135054:
                i2 = 220;
                break;
            case 135388:
            case 166395:
                i2 = 232;
                break;
            case 135607:
                i2 = 233;
                break;
            case 135608:
                i2 = 237;
                break;
            case 135609:
                i2 = 234;
                break;
            case 135610:
                i2 = 235;
                break;
            case 135611:
                i2 = 236;
                break;
            case 135612:
                i2 = 238;
                break;
            case 135613:
                i2 = 242;
                break;
            case 135614:
                i2 = 239;
                break;
            case 135615:
                i2 = 240;
                break;
            case 135616:
                i2 = 241;
                break;
            case 135741:
                i2 = 243;
                break;
            case 135742:
                i2 = 245;
                break;
            case 138673:
                i2 = 341;
                break;
            case 139718:
                i2 = 343;
                break;
            case 139953:
                i2 = 344;
                break;
            case 141584:
                i2 = 691;
                break;
            case 141948:
                i2 = 614;
                break;
            case 141949:
                i2 = 689;
                break;
            case 141950:
                i2 = 531;
                break;
            case 151868:
                i2 = 527;
                break;
            case 152912:
                i2 = 528;
                break;
            case 152913:
                i2 = 529;
                break;
            case 152914:
                i2 = 530;
                break;
            case 154722:
                i2 = 346;
                break;
            case 155979:
                i2 = 603;
                break;
            case 159131:
                i2 = 248;
                break;
            case 159137:
                i2 = 249;
                break;
            case 159138:
                i2 = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                break;
            case 159215:
                i2 = 251;
                break;
            case 159220:
                i2 = 345;
                break;
            case 159512:
                i2 = 253;
                break;
            case 159513:
                i2 = 254;
                break;
            case 159514:
                i2 = 255;
                break;
            case 159515:
                i2 = 256;
                break;
            case 159516:
                i2 = 257;
                break;
            case 160181:
                i2 = 259;
                break;
            case 160182:
                i2 = 260;
                break;
            case 160183:
                i2 = 261;
                break;
            case 160184:
                i2 = 263;
                break;
            case 160185:
                i2 = 262;
                break;
            case 160862:
                i2 = 32;
                break;
            case 161859:
                i2 = 266;
                break;
            case 162278:
                i2 = 690;
                break;
            case 168183:
                i2 = 480;
                break;
            case 168962:
                i2 = 264;
                break;
            case 168967:
                i2 = 265;
                break;
            case 178574:
                i2 = 267;
                break;
            case 178580:
                i2 = 268;
                break;
            case 190113:
                i2 = 269;
                break;
            case 190114:
                i2 = 270;
                break;
            case 193646:
                i2 = 275;
                break;
            case 193647:
                i2 = 274;
                break;
            case 195597:
                i2 = 271;
                break;
            case 195598:
                i2 = 272;
                break;
            case 1595117:
                i2 = 258;
                break;
            default:
                i2 = 0;
                break;
        }
        vvd vvdVar = nbu.b;
        pkaVar.i(vvdVar);
        Object objK = pkaVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        nbs nbsVar = (nbs) objK;
        ubz ubzVar = nbsVar.c;
        if (ubzVar == null) {
            ubzVar = ubz.a;
        }
        uby ubyVar = ubzVar.d;
        if (ubyVar == null) {
            ubyVar = uby.a;
        }
        vtw vtwVarM = wjf.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wjf wjfVar = (wjf) vucVar;
        wjfVar.b |= 1;
        wjfVar.c = i2;
        if ((nbsVar.b & 2) != 0) {
            vsz vszVar = nbsVar.d;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wjf wjfVar2 = (wjf) vtwVarM.b;
            vszVar.getClass();
            wjfVar2.b |= 4;
            wjfVar2.f = vszVar;
        }
        if ((ubyVar.b & 1) != 0) {
            wji wjiVar = ubyVar.c;
            if (wjiVar == null) {
                wjiVar = wji.a;
            }
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wjf wjfVar3 = (wjf) vtwVarM.b;
            wjiVar.getClass();
            wjfVar3.e = wjiVar;
            wjfVar3.b |= 2;
        }
        return new nsf(vtwVarM);
    }

    private static final rzy w() {
        rzy rzyVar = new rzy((short[]) null);
        rzyVar.D("reference");
        rzyVar.E("& ? > 0", 1L);
        return rzyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final String a(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        ?? r4 = this.b;
        String str2 = TextUtils.isEmpty(r4) ? "" : String.format("[%s] ", r4);
        return !TextUtils.isEmpty(str2) ? String.valueOf(str2).concat(String.valueOf(str)) : str;
    }

    public final void b(String str, Object... objArr) {
        Log.e((String) this.a, a(str, objArr));
    }

    public final void c(Throwable th, String str, Object... objArr) {
        Log.e((String) this.a, a(str, objArr), th);
    }

    public final void d(String str, Object... objArr) {
        Log.w((String) this.a, a(str, objArr));
    }

    public final void f(Throwable th, Object... objArr) {
        Log.w((String) this.a, a("receiverSessionId %s is not valid for hash", objArr), th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [iea, java.lang.Object] */
    public final void i(ntp ntpVar) {
        ntpVar.c(this.a, (ifc) this.b);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yow] */
    public final uhp j(vlo vloVar) {
        vloVar.getClass();
        return wae.W(this.b, new pfd(this, vloVar, (yih) null, 1));
    }

    public final ImmutableList k(qen qenVar) {
        return ((qas) this.b).a(qenVar, ImmutableList.of(w().C()));
    }

    public final ImmutableList l(qen qenVar, String str) {
        rzy rzyVarW = w();
        rzyVarW.D(" AND ");
        rzyVarW.D("group_id");
        rzyVarW.E("=?", str);
        return ((qas) this.b).a(qenVar, ImmutableList.of(rzyVarW.C()));
    }

    public final ImmutableList m(qen qenVar, String... strArr) {
        return ((qas) this.b).a(qenVar, qau.b(w().C(), "thread_id", strArr));
    }

    public final void n(qen qenVar, String... strArr) {
        ((qas) this.b).b(qenVar, qau.b(null, "thread_id", strArr));
    }

    public final smc o(qen qenVar) {
        qenVar.getClass();
        Pattern pattern = sjt.a;
        sjs sjsVar = new sjs((Context) this.b);
        sjsVar.d("notifications_counts_data_store");
        sjsVar.e(qenVar.a + "_StoredNotificationsCounts.pb");
        Uri uriA = sjsVar.a();
        sln slnVarA = slo.a();
        slnVarA.d(uriA);
        slnVarA.c(pwg.a);
        slnVarA.d = slg.a;
        smc smcVarC = ((unc) this.a).c(slnVarA.a());
        smcVarC.getClass();
        return smcVarC;
    }

    public final uhp p() {
        nvg[] nvgVarArr;
        nvg[] nvgVarArr2;
        ogm ogmVar = new ogm();
        nwq nwqVar = (nwq) this.a;
        uep uepVar = ((ogl) nwqVar.y).b;
        ogr ogrVar = new ogr(1, new byte[0], ogmVar, Instant.now().toEpochMilli());
        oaf oafVar = new oaf();
        oafVar.a = new nkx(ogrVar, this.b, 7, null);
        int i = ogrVar.d - 1;
        if (i == 1 || i == 2 || i == 3) {
            nvgVarArr = new nvg[]{ogj.b};
        } else {
            if (i != 4) {
                nvgVarArr2 = new nvg[0];
                oafVar.b = nvgVarArr2;
                oafVar.c = 15902;
                return szg.m(qtl.aH(nwqVar.r(oafVar.a())), new pri(6), ugk.a);
            }
            nvgVarArr = new nvg[]{ogj.a};
        }
        nvgVarArr2 = nvgVarArr;
        oafVar.b = nvgVarArr2;
        oafVar.c = 15902;
        return szg.m(qtl.aH(nwqVar.r(oafVar.a())), new pri(6), ugk.a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final uhp q(prs prsVar, int i) {
        return sfy.G(new lhx(this, i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Uri.parse(prsVar.g) : Uri.parse(prsVar.f) : Uri.parse(prsVar.e) : Uri.parse(prsVar.d) : Uri.parse(prsVar.c) : Uri.parse(prsVar.b), 10), this.b);
    }

    public final wjf r() {
        return (wjf) ((vtw) this.a).r();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final wjf s() {
        for (nsf nsfVar : this.b) {
            ((vtw) this.a).aH(nsfVar.s());
        }
        return (wjf) ((vtw) this.a).r();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void v(nsf nsfVar) {
        this.b.add(nsfVar);
    }

    public nsf(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public nsf(Executor executor, aafi aafiVar) {
        this.b = executor;
        this.a = aafiVar;
    }

    public nsf(pex pexVar, yow yowVar) {
        this.a = pexVar;
        this.b = yowVar;
    }

    public nsf(Context context, ogk ogkVar, String str, Account account, ttm ttmVar, ttm ttmVar2) {
        this.a = ogkVar;
        this.b = new ogi("profile-".concat(str), 1L);
        prw prwVar = new prw(ttmVar2, account);
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(prwVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        } else {
            context.registerReceiver(prwVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        }
        prx prxVar = new prx(ttmVar, account);
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(prxVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        } else {
            context.registerReceiver(prxVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        }
    }

    private nsf(iea ieaVar, lio lioVar, pkg pkgVar, pjx pjxVar, boolean z) {
        this.a = ieaVar;
        iff iffVar = new iff();
        int i = 1;
        iffVar.f(true != z ? R.layout.details_header_section : R.layout.gtv_details_header_section);
        iffVar.c = new nax(lioVar, pkgVar, pjxVar, i);
        iffVar.g(ksd.a());
        iffVar.d();
        this.b = iffVar.c();
    }

    private nsf(vtw vtwVar) {
        this.b = new ArrayList();
        this.a = vtwVar;
    }

    public nsf(fur furVar) {
        this.b = furVar;
        this.a = new LinkedHashSet();
    }

    public nsf(String str) {
        this(str, (String) null);
    }

    public nsf(unc uncVar, Context context) {
        uncVar.getClass();
        this.a = uncVar;
        this.b = context;
    }

    protected nsf(String str, String str2) {
        ocv.aE(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.b = str2;
    }

    public nsf(qei qeiVar, qmt qmtVar) {
        qeiVar.getClass();
        this.b = qeiVar;
        this.a = qmtVar;
    }

    public nsf(yfo yfoVar, yfo yfoVar2) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }
}
