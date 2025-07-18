package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgu {
    public static String A(Intent intent) {
        return ksh.d(intent.getStringExtra("referrer"));
    }

    public static String B(Bundle bundle) {
        return ksh.d(bundle.getString("referrer"));
    }

    public static String C(String str, String str2) {
        return a.cq(str2, str, ":");
    }

    public static String D(Intent intent) {
        String strA = A(intent);
        String strZ = z(intent, "ref");
        return TextUtils.isEmpty(strA) ? strZ : TextUtils.isEmpty(strZ) ? strA : C(strA, strZ);
    }

    public static final void b(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(1594204886);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(zi.d(bkpVar, 80.0f), 1.0f, wv.K(baoVarD).J, rdd.D(baoVarD)), rdd.D(baoVarD)), false, rdd.D(baoVarD), rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), null, bga.k(1371226038, new azg((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), 19), baoVarD), baoVarD, (i3 & 14) | 1572864, 36);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 3);
        }
    }

    public static final void c(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-1702182954);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(zi.e(bkpVar, rdd.I()), 1.0f, wv.K(baoVarD).J, rdd.D(baoVarD)), rdd.D(baoVarD)), false, rdd.D(baoVarD), rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), null, bga.k(-1925161802, new kgx((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), 2), baoVarD), baoVarD, (i3 & 14) | 1572864, 36);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 7);
        }
    }

    public static final void d(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bol bolVarD;
        yjk yjkVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(1732118614);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 6;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            if (((Boolean) a.bH(kwVar, baoVarD, 6).a()).booleanValue()) {
                baoVarD.x(-1881311194);
                bolVarD = rdd.E(baoVarD);
            } else {
                baoVarD.x(-1881309883);
                bolVarD = rdd.D(baoVarD);
            }
            basVar.aa();
            bol bolVar = bolVarD;
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(zi.d(bkpVar, 80.0f), 1.0f, wv.K(baoVarD).J, bolVar), bolVar), false, bolVar, rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), kwVar, bga.k(2098156854, new kgx(context, 0), baoVarD), baoVarD, (i3 & 14) | 1769472, 4);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, i4);
        }
    }

    public static final void e(cqn cqnVar, Rect rect) {
        int i = rect.bottom - rect.top;
        cqnVar.b(R.id.fold).d.e = ykn.j(i, 1);
        cqnVar.g(R.id.fold, 3, 0, 3);
    }

    public static final boolean f(gnm gnmVar) {
        gnmVar.getClass();
        return yks.e(gnmVar.d(), gnl.b) && yks.e(gnmVar.c(), gnk.b);
    }

    public static final void g(cqn cqnVar) {
        cqnVar.d(R.id.fold, 3);
    }

    public static final void h(cqn cqnVar) {
        cqnVar.g(R.id.player_toolbar, 3, R.id.fold, 4);
        cqnVar.n(0);
    }

    public static final void i(cqn cqnVar) {
        cqnVar.g(R.id.player_toolbar, 3, 0, 3);
        cqnVar.n(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rld j(kky kkyVar, String str, int i, Map map) {
        ImmutableList immutableList = kkyVar.h;
        ArrayList arrayList = new ArrayList(immutableList.size());
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(j((kky) it.next(), str, i + 1, map));
        }
        rld rldVar = new rld(kkyVar, arrayList, i);
        if (((rld) map.put(rldVar.e(), rldVar)) == null) {
            return rldVar;
        }
        throw new IllegalArgumentException("duplicate tag id ".concat(String.valueOf(rldVar.e())));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    public static tst k(lqd lqdVar, ksy ksyVar, int i) {
        tst tstVar = lqdVar.e;
        if (tstVar.g() && !tstVar.c().isEmpty()) {
            ?? C = tstVar.c();
            int i2 = 0;
            while (true) {
                if (i2 >= C.size()) {
                    break;
                }
                int i3 = i2 + i;
                if (!((lqf) C.get(i2)).a.equals(ksyVar)) {
                    i2++;
                } else if (i3 >= 0 && i3 < C.size()) {
                    return tst.i((lqf) C.get(i3));
                }
            }
        }
        return trk.a;
    }

    public static ImmutableList l(List list, idw idwVar) {
        int i = lqi.b;
        return FluentIterable.from(list).transform(new ldl(idwVar, 9)).filter(new efc(11)).transform(new lpn(4)).toList();
    }

    public static ksy m(val valVar) {
        vak vakVarB = vak.b(valVar.b);
        if (vakVarB == null) {
            vakVarB = vak.UNRECOGNIZED;
        }
        switch (vakVarB.ordinal()) {
            case 0:
            case 11:
            case 12:
            case 13:
            case 18:
                vak vakVarB2 = vak.b(valVar.b);
                if (vakVarB2 == null) {
                    vakVarB2 = vak.UNRECOGNIZED;
                }
                throw new UnsupportedOperationException("Unsupported AssetId type: " + vakVarB2.a());
            case 1:
                return ksy.i(valVar.c);
            case 2:
                return ksy.j(valVar.c);
            case 3:
                return ksy.l(valVar.c);
            case 4:
                return ksy.k(valVar.c);
            case 5:
                return ksy.h(valVar.c);
            case 6:
                String str = valVar.c;
                ksr ksrVar = ksr.a;
                return ksy.a(new ktg(str));
            case 7:
                return ksy.c(2, valVar.c);
            case 8:
                return ksy.c(4, valVar.c);
            case 9:
                return ksy.c(29, valVar.c);
            case 10:
                return ksy.c(61, valVar.c);
            case 14:
                return ksy.m(valVar.c);
            case 15:
                return ksy.c(70, valVar.c);
            case 16:
                return ksy.c(android.support.v7.appcompat.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, valVar.c);
            case 17:
                return ksy.c(108, valVar.c);
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static tst n(ksy ksyVar) {
        try {
            return tst.i(o(ksyVar));
        } catch (UnsupportedOperationException unused) {
            return trk.a;
        }
    }

    public static val o(ksy ksyVar) {
        vak vakVar;
        switch (ksyVar.n().ordinal()) {
            case 0:
                vakVar = vak.ANDROID_APP;
                break;
            case 1:
                vakVar = vak.ALBUM;
                break;
            case 2:
            case 6:
            case 7:
            case 12:
            default:
                throw new UnsupportedOperationException("Unsupported asset id type: " + ksyVar.n().s);
            case 3:
                vakVar = vak.SONG;
                break;
            case 4:
                vakVar = vak.BOOK;
                break;
            case 5:
                vakVar = vak.MOVIE;
                break;
            case 8:
                vakVar = vak.SHOW;
                break;
            case 9:
                vakVar = vak.SEASON;
                break;
            case 10:
                vakVar = vak.EPISODE;
                break;
            case 11:
                vakVar = vak.VOUCHER;
                break;
            case 13:
                vakVar = vak.DISTRIBUTOR;
                break;
            case 14:
                vakVar = vak.PERSON;
                break;
            case 15:
                vakVar = vak.BANNER;
                break;
            case 16:
                vakVar = vak.ATV_BANNER;
                break;
            case 17:
                vakVar = vak.BUNDLE;
                break;
        }
        vtw vtwVarM = val.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((val) vtwVarM.b).b = vakVar.a();
        String str = ksyVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((val) vtwVarM.b).c = str;
        return (val) vtwVarM.r();
    }

    public static boolean p(val valVar) {
        if (valVar.c.isEmpty()) {
            return false;
        }
        vak vakVarB = vak.b(valVar.b);
        if (vakVarB == null) {
            vakVarB = vak.UNRECOGNIZED;
        }
        switch (vakVarB.ordinal()) {
        }
        return false;
    }

    public static boolean q(val valVar, vak vakVar) {
        if (valVar.c.isEmpty()) {
            return false;
        }
        vak vakVarB = vak.b(valVar.b);
        if (vakVarB == null) {
            vakVarB = vak.UNRECOGNIZED;
        }
        return vakVar.equals(vakVarB);
    }

    public static int r(vdq vdqVar) {
        int iAQ = a.aQ(vdqVar.c);
        int i = 1;
        if (iAQ == 0) {
            iAQ = 1;
        }
        int i2 = iAQ - 2;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                return 3;
            }
        }
        return i;
    }

    public static lpw s(lfn lfnVar) {
        return new lqk(lfnVar.aP(), lfnVar.aO(), lfnVar.g(), lfnVar.h(), lfnVar.aN());
    }

    public static vas t(Context context, lxc lxcVar, lfn lfnVar) {
        vtw vtwVarM = vas.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((vas) vtwVarM.b).g = "3";
        String packageName = context.getPackageName();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vas vasVar = (vas) vtwVarM.b;
        packageName.getClass();
        vasVar.b = packageName;
        int i = true != lfnVar.cW() ? 3 : 8;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((vas) vtwVarM.b).f = a.aI(i);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((vas) vtwVarM.b).e = a.aJ(3);
        int i2 = true == lfnVar.cH() ? 4 : 3;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((vas) vtwVarM.b).h = a.aF(i2);
        String str = lxcVar.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((vas) vucVar).c = str;
        long j = lxcVar.b;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((vas) vtwVarM.b).d = j;
        return (vas) vtwVarM.r();
    }

    public static vbo u(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        vtw vtwVarM = vbo.a.m();
        String str = (String) ksk.d(string, "");
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar = (vbo) vtwVarM.b;
        str.getClass();
        vboVar.g = str;
        String str2 = Build.BRAND;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar2 = (vbo) vtwVarM.b;
        str2.getClass();
        vboVar2.e = str2;
        String str3 = Build.DEVICE;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar3 = (vbo) vtwVarM.b;
        str3.getClass();
        vboVar3.f = str3;
        String str4 = Build.MANUFACTURER;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar4 = (vbo) vtwVarM.b;
        str4.getClass();
        vboVar4.b = str4;
        String str5 = Build.MODEL;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar5 = (vbo) vtwVarM.b;
        str5.getClass();
        vboVar5.c = str5;
        String str6 = Build.PRODUCT;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        str6.getClass();
        ((vbo) vucVar).d = str6;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((vbo) vtwVarM.b).h = "";
        String str7 = Build.ID;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar6 = (vbo) vtwVarM.b;
        str7.getClass();
        vboVar6.i = str7;
        String string2 = Integer.toString(Build.VERSION.SDK_INT);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar7 = (vbo) vtwVarM.b;
        string2.getClass();
        vboVar7.j = string2;
        String str8 = Build.VERSION.RELEASE;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar8 = (vbo) vtwVarM.b;
        str8.getClass();
        vboVar8.k = str8;
        String str9 = Build.FINGERPRINT;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vbo vboVar9 = (vbo) vtwVarM.b;
        str9.getClass();
        vboVar9.l = str9;
        return (vbo) vtwVarM.r();
    }

    public static /* synthetic */ void v(ghi ghiVar, lox loxVar) {
        ghiVar.i(1, loxVar.a);
        ghiVar.i(2, loxVar.b);
        ghiVar.g(3, loxVar.c);
        ghiVar.g(4, loxVar.f);
        ghiVar.g(5, loxVar.d);
        ghiVar.g(6, loxVar.e ? 1L : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[LOOP:0: B:8:0x0015->B:28:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String x(java.lang.String r6, android.content.pm.PackageManager r7) {
        /*
            java.lang.String r0 = ""
            if (r6 != 0) goto L6
            goto L80
        L6:
            r1 = 64
            android.content.pm.PackageInfo r6 = r7.getPackageInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r1 = r6.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L72
            r3 = r6[r2]
            java.lang.String r3 = defpackage.krh.c(r3)
            int r4 = r3.hashCode()
            r5 = -1035251647(0xffffffffc24b5041, float:-50.828373)
            if (r4 == r5) goto L4f
            r5 = 27774796(0x1a7cf4c, float:6.164357E-38)
            if (r4 == r5) goto L40
            r5 = 240523690(0xe5619aa, float:2.6389893E-30)
            if (r4 == r5) goto L31
            goto L5e
        L31:
            java.lang.String r4 = "0C3286A20E4D9B0710C6462144AC86F716186846"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5e
            java.lang.String r3 = "DMA_2"
            ieg r3 = defpackage.ieg.f(r3)
            goto L60
        L40:
            java.lang.String r4 = "DCAC409415171B29B824EF57F94DDA9868D50940"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5e
            java.lang.String r3 = "DMA simulator"
            ieg r3 = defpackage.ieg.f(r3)
            goto L60
        L4f:
            java.lang.String r4 = "AE2242B99824ABEC6D7C774F21D4F41B2D019631"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5e
            java.lang.String r3 = "DMA"
            ieg r3 = defpackage.ieg.f(r3)
            goto L60
        L5e:
            ieg r3 = defpackage.ieg.a
        L60:
            boolean r4 = r3.k()
            if (r4 != 0) goto L80
            java.lang.Object r3 = r3.g()
            java.lang.String r3 = (java.lang.String) r3
            r7.add(r3)
            int r2 = r2 + 1
            goto L15
        L72:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L79
            return r0
        L79:
            java.lang.String r6 = ":"
            java.lang.String r6 = android.text.TextUtils.join(r6, r7)
            return r6
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgu.x(java.lang.String, android.content.pm.PackageManager):java.lang.String");
    }

    public static Intent y(Intent intent, String str) {
        return intent.putExtra("referrer", str);
    }

    public static String z(Intent intent, String str) {
        Uri data = intent.getData();
        return data == null ? "" : ksh.d(data.getQueryParameter(str));
    }
}
