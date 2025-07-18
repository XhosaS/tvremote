package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.apps.tiktok.account.AccountId;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcz implements omj {
    public final Context a;
    public final zyg b;
    public final vjo c;
    public final tdu d;
    public final vhb e;
    public final tbe f;
    public final teg g;

    public tcz(Context context, zyg zygVar, vjo vjoVar, tdu tduVar, teg tegVar, vhb vhbVar, tbe tbeVar) {
        this.a = context;
        this.b = zygVar;
        this.c = vjoVar;
        this.d = tduVar;
        this.g = tegVar;
        this.e = vhbVar;
        this.f = tbeVar;
    }

    @Override // defpackage.omj
    public final zyd a(String str, final Iterable iterable, final achm achmVar) {
        return zuz.h(this.c.c(str), wyo.c(new zvi() { // from class: tcu
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final tcz tczVar = this.a;
                final AccountId accountId = (AccountId) obj;
                zyd zydVarE = tczVar.e.e(accountId);
                final Iterable iterable2 = iterable;
                final achm achmVar2 = achmVar;
                return zuz.h(zydVarE, wyo.c(new zvi() { // from class: tct
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) throws GellerException {
                        final zyd zydVarH;
                        if (!((Boolean) obj2).booleanValue()) {
                            throw new GellerException(abqb.UNKNOWN, "Cannot generate sync context for disabled account.");
                        }
                        final Iterable iterable3 = iterable2;
                        final AccountId accountId2 = accountId;
                        final tcz tczVar2 = tczVar;
                        zvh zvhVarB = wyo.b(new zvh() { // from class: tcv
                            @Override // defpackage.zvh
                            public final zyd a() {
                                ArrayList arrayList = new ArrayList();
                                AccountId accountId3 = accountId2;
                                tcz tczVar3 = tczVar2;
                                tam tamVarD = ((tcy) wgv.a(tczVar3.a, tcy.class, accountId3)).d();
                                for (final acgd acgdVar : iterable3) {
                                    final BiFunction biFunction = new BiFunction() { // from class: tal
                                        public final /* synthetic */ String b = "_version_info";

                                        public final /* synthetic */ BiFunction andThen(Function function) {
                                            return BiFunction$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.BiFunction
                                        public final Object apply(Object obj3, Object obj4) {
                                            return zxn.h(((Geller) obj3).c((String) obj4, acgdVar, this.b));
                                        }
                                    };
                                    zyg zygVar = tamVarD.d;
                                    final boolean z = TextUtils.indexOf(acgdVar.name(), "GDD") == 0 || acgdVar.equals(acgd.ASSISTANT_ON_DEVICE_DISCOVERY) || acgdVar.equals(acgd.ASSISTANT_AUTO_EMBEDDED_PAIRED_CONTACTS);
                                    final zyd zydVarB = tamVarD.a.a.b();
                                    final zyd zydVarB2 = tamVarD.c.b(tamVarD.b);
                                    arrayList.add(xab.d(zydVarB, zydVarB2).b(new zvh() { // from class: tak
                                        @Override // defpackage.zvh
                                        public final zyd a() {
                                            String str2 = (String) zxn.o(zydVarB2);
                                            return (!TextUtils.isEmpty(str2) || z) ? (zyd) biFunction.apply((Geller) zxn.o(zydVarB), yqv.b(str2)) : zxn.g(new GellerException(abqb.INVALID_ARGUMENT, "Account name is null."));
                                        }
                                    }, zygVar));
                                }
                                return zuz.g(zxn.m(arrayList), wyo.a(new yqi() { // from class: tcx
                                    @Override // defpackage.yqi
                                    public final Object apply(Object obj3) {
                                        yzo yzoVar = new yzo();
                                        for (yyk yykVar : (List) obj3) {
                                            if (yykVar != null) {
                                                yzoVar.i(yykVar);
                                            }
                                        }
                                        return yzoVar.f();
                                    }
                                }), tczVar3.b);
                            }
                        });
                        final zyg zygVar = tczVar2.b;
                        final zyd zydVarL = zxn.l(zvhVarB, zygVar);
                        final zyd zydVarB = tczVar2.f.a.b();
                        final zyd zydVarB2 = tczVar2.c.b(accountId2);
                        xaa xaaVarD = xab.d(zydVarB, zydVarB2);
                        final tdu tduVar = tczVar2.d;
                        final zyd zydVarB3 = xaaVarD.b(new zvh() { // from class: teb
                            @Override // defpackage.zvh
                            public final zyd a() {
                                final Geller geller = (Geller) zxn.o(zydVarB);
                                final String strB = yqv.b((String) zxn.o(zydVarB2));
                                Callable callable = new Callable() { // from class: omx
                                    public final /* synthetic */ String c = "database_id";

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        String[] strArrNativeReadDatabaseInfo;
                                        Geller geller2 = geller;
                                        String str2 = strB;
                                        try {
                                            strArrNativeReadDatabaseInfo = geller2.nativeReadDatabaseInfo(geller2.a(), geller2.e.a(str2), this.c);
                                        } catch (GellerException e) {
                                            ((zdv) ((zdv) ((zdv) Geller.a.d()).p(e)).q("com/google/android/libraries/geller/portable/Geller", "readDatabaseInfo", (char) 750, "Geller.java")).u("readDatabaseInfo called failed.");
                                            strArrNativeReadDatabaseInfo = null;
                                        }
                                        if (strArrNativeReadDatabaseInfo != null && strArrNativeReadDatabaseInfo.length != 0) {
                                            return yyk.n(strArrNativeReadDatabaseInfo);
                                        }
                                        int i = yyk.e;
                                        return zcg.b;
                                    }
                                };
                                zyd zydVarK = zxn.k(wyo.i(callable), geller.c);
                                final tdu tduVar2 = tduVar;
                                final AccountId accountId3 = accountId2;
                                return zuz.h(zydVarK, wyo.c(new zvi() { // from class: tea
                                    @Override // defpackage.zvi
                                    public final zyd a(Object obj3) {
                                        final yyk yykVar = (yyk) obj3;
                                        final tdu tduVar3 = tduVar2;
                                        tduVar3.a.isPresent();
                                        final zyd zydVarH2 = zxn.h(zcp.b);
                                        vjo vjoVar = tduVar3.c;
                                        final AccountId accountId4 = accountId3;
                                        final zyd zydVarB4 = vjoVar.b(accountId4);
                                        return xab.b(zydVarH2, zydVarB4).b(new zvh() { // from class: tdt
                                            @Override // defpackage.zvh
                                            public final zyd a() {
                                                yzq yzqVar = (yzq) zxn.o(zydVarH2);
                                                Optional optionalOf = Optional.of(yzqVar);
                                                achk achkVar = achk.a;
                                                final achj achjVar = new achj();
                                                final tdz tdzVar = tduVar3.b;
                                                acgk acgkVar = tdzVar.b;
                                                acgk acgkVar2 = acgk.a;
                                                if (acgkVar != acgkVar2 && (acgkVar2 == null || acgkVar.getClass() != acgkVar2.getClass() || !abza.a.a(acgkVar.getClass()).k(acgkVar, acgkVar2))) {
                                                    abxc abxcVar = acgm.b;
                                                    acgl acglVar = new acgl();
                                                    if ((acglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        acglVar.y();
                                                    }
                                                    acgm acgmVar = (acgm) acglVar.b;
                                                    acgmVar.d = acgkVar;
                                                    acgmVar.c |= 1;
                                                    achjVar.f(abxcVar, (acgm) acglVar.v());
                                                }
                                                final yyk yykVar2 = yykVar;
                                                tdy tdyVar = (tdy) wgv.a(tdzVar.c, tdy.class, accountId4);
                                                zyd zydVarA = tdyVar.l().a();
                                                yqi yqiVar = new yqi() { // from class: tdv
                                                    @Override // defpackage.yqi
                                                    public final Object apply(Object obj4) {
                                                        return ((Map) obj4).values();
                                                    }
                                                };
                                                zyg zygVar2 = tdzVar.d;
                                                final zyd zydVarG = zuz.g(zydVarA, wyo.a(yqiVar), zygVar2);
                                                wgq wgqVar = (wgq) tdyVar.m();
                                                wbm wbmVar = wgqVar.a;
                                                wbm wbmVar2 = wgqVar.b;
                                                final zyd zydVarA2 = wbmVar.a();
                                                final zyd zydVarA3 = wbmVar2.a();
                                                final zyd zydVarG2 = zuz.g(xab.d(zydVarA2, zydVarA3).a(new Callable() { // from class: wgp
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        Object objO = zxn.o(zydVarA2);
                                                        objO.getClass();
                                                        Object objO2 = zxn.o(zydVarA3);
                                                        objO2.getClass();
                                                        return agrj.e((Map) objO, (Map) objO2);
                                                    }
                                                }, zwk.a), wyo.a(new yqi() { // from class: tdv
                                                    @Override // defpackage.yqi
                                                    public final Object apply(Object obj4) {
                                                        return ((Map) obj4).values();
                                                    }
                                                }), zygVar2);
                                                final zyd zydVarH3 = zxn.h((yzq) optionalOf.orElse(zcp.b));
                                                Object objA = tdzVar.e.b.a();
                                                objA.getClass();
                                                final zyd zydVar = (zyd) objA;
                                                final zyd zydVarA4 = zxn.d(zydVarG, zydVarG2, zydVarH3, zydVar).a(wyo.i(new Callable() { // from class: tdw
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        Collection collection = (Collection) zxn.o(zydVarG);
                                                        Collection collection2 = (Collection) zxn.o(zydVarG2);
                                                        yzq yzqVar2 = (yzq) zxn.o(zydVarH3);
                                                        String str2 = (String) zxn.o(zydVar);
                                                        yzo yzoVar = new yzo();
                                                        if (!str2.isEmpty()) {
                                                            yzoVar.c(str2);
                                                        }
                                                        achj achjVar2 = achjVar;
                                                        yzoVar.i(collection);
                                                        yzoVar.i(collection2);
                                                        yzoVar.i(yzqVar2);
                                                        yzq yzqVarF = yzoVar.f();
                                                        if (yzqVarF.isEmpty()) {
                                                            oth othVar = (oth) tdzVar.a;
                                                            ((uqo) othVar.a.O.eV()).a(100L, othVar.b);
                                                            return achjVar2;
                                                        }
                                                        abxc abxcVar2 = acgb.b;
                                                        acga acgaVar = new acga();
                                                        if ((acgaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                            acgaVar.y();
                                                        }
                                                        acgb acgbVar = (acgb) acgaVar.b;
                                                        abxs abxsVar = acgbVar.c;
                                                        if (!abxsVar.c()) {
                                                            int size = abxsVar.size();
                                                            acgbVar.c = abxsVar.d(size + size);
                                                        }
                                                        abus.m(yzqVarF, acgbVar.c);
                                                        achjVar2.f(abxcVar2, (acgb) acgaVar.v());
                                                        return achjVar2;
                                                    }
                                                }), zygVar2);
                                                return xab.b(zydVarA4).a(wyo.i(new Callable() { // from class: tdx
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() {
                                                        achj achjVar2 = (achj) zxn.o(zydVarA4);
                                                        abxc abxcVar2 = ache.b;
                                                        achd achdVar = new achd();
                                                        yyk yykVar3 = yykVar2;
                                                        int i = yykVar3.isEmpty() ? -1 : Integer.parseInt((String) yykVar3.get(0));
                                                        if ((achdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                            achdVar.y();
                                                        }
                                                        achj achjVar3 = achjVar;
                                                        ache acheVar = (ache) achdVar.b;
                                                        acheVar.c |= 1;
                                                        acheVar.d = i;
                                                        achjVar2.f(abxcVar2, (ache) achdVar.v());
                                                        return (achk) achjVar3.v();
                                                    }
                                                }), zygVar2);
                                            }
                                        }, tduVar3.d);
                                    }
                                }), zygVar);
                            }
                        }, zygVar);
                        teg tegVar = tczVar2.g;
                        if ((tei.a() && (ypx.d("Tangor", Build.DEVICE) || ypx.d("Tangorpro", Build.DEVICE))) || tei.b("tangor_x86_64") || tei.b("tangorpro_x86_64") || (tei.a() && ypx.d("cf_x86_64_tablet", Build.PRODUCT))) {
                            Context context = ((teh) ((yqz) tegVar.c).a).a;
                            context.getClass();
                            zydVarH = zud.g(otn.a(new kno(context).a()), Exception.class, wyo.a(new yqi() { // from class: tec
                                @Override // defpackage.yqi
                                public final Object apply(Object obj3) {
                                    return "";
                                }
                            }), tegVar.b);
                        } else {
                            zydVarH = zxn.h("");
                        }
                        final achm achmVar3 = achmVar2;
                        wzx wzxVarG = wzx.g(((tef) wgv.a(tegVar.a, tef.class, accountId2)).s().b.b());
                        yqi yqiVar = new yqi() { // from class: ted
                            @Override // defpackage.yqi
                            public final Object apply(Object obj3) {
                                return (String) ((Optional) obj3).orElse("");
                            }
                        };
                        zyg zygVar2 = tegVar.b;
                        final wzx wzxVarH = wzxVarG.h(yqiVar, zygVar2);
                        final zyd zydVarA = zxn.b(zydVarH, wzxVarH).a(wyo.i(new Callable() { // from class: tee
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                xky xkyVar = xky.a;
                                xkx xkxVar = new xkx();
                                String str2 = (String) zxn.o(zydVarH);
                                if (!yqv.c(str2)) {
                                    if ((xkxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        xkxVar.y();
                                    }
                                    xky xkyVar2 = (xky) xkxVar.b;
                                    str2.getClass();
                                    xkyVar2.b |= 2;
                                    xkyVar2.c = str2;
                                }
                                String str3 = (String) zxn.o(wzxVarH);
                                if (!yqv.c(str3)) {
                                    if ((xkxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        xkxVar.y();
                                    }
                                    xky xkyVar3 = (xky) xkxVar.b;
                                    str3.getClass();
                                    xkyVar3.b |= 8;
                                    xkyVar3.e = str3;
                                }
                                return (xky) xkxVar.v();
                            }
                        }), zygVar2);
                        return xab.d(zydVarL, zydVarB3, zydVarA).a(new Callable() { // from class: tcw
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                achk achkVar = (achk) zxn.o(zydVarB3);
                                achj achjVar = new achj();
                                achjVar.B(achkVar);
                                if ((achjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    achjVar.y();
                                }
                                zyd zydVar = zydVarA;
                                achm achmVar4 = achmVar3;
                                achk achkVar2 = (achk) achjVar.b;
                                achk achkVar3 = achk.a;
                                achkVar2.c = achmVar4.h;
                                achkVar2.b |= 16;
                                abxc abxcVar = acgg.b;
                                acgf acgfVar = new acgf();
                                xky xkyVar = (xky) zxn.o(zydVar);
                                if ((Integer.MIN_VALUE & acgfVar.b.memoizedSerializedSize) == 0) {
                                    acgfVar.y();
                                }
                                zyd zydVar2 = zydVarL;
                                acgg acggVar = (acgg) acgfVar.b;
                                xkyVar.getClass();
                                acggVar.d = xkyVar;
                                acggVar.c |= 1;
                                achjVar.f(abxcVar, (acgg) acgfVar.v());
                                abxc abxcVar2 = achw.b;
                                achv achvVar = new achv();
                                achvVar.a((Iterable) zxn.o(zydVar2));
                                achjVar.f(abxcVar2, (achw) achvVar.v());
                                return (achk) achjVar.v();
                            }
                        }, zygVar);
                    }
                }), tczVar.b);
            }
        }), this.b);
    }
}
