package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etq implements aejl {
    public final eup a;
    public final etr b;
    private final int c;

    public etq(eup eupVar, etr etrVar, int i) {
        this.a = eupVar;
        this.b = etrVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agow
    public final Object a() {
        Set setSingleton;
        switch (this.c) {
            case 0:
                eup eupVar = this.a;
                etr etrVar = this.b;
                return new tgf("Account scoped", eupVar.db(), new tgv(etrVar.b.dI(), (tgm) etrVar.h.a()), zcl.a);
            case 1:
                etr etrVar2 = this.b;
                eup eupVar2 = etrVar2.b;
                tgr tgrVar = new tgr(eupVar2.q, eupVar2.aq, eupVar2.n, eupVar2.jI, etrVar2.c);
                Optional optionalOf = Optional.of((roj) etrVar2.g.a());
                AccountId accountId = (AccountId) etrVar2.d.a();
                accountId.getClass();
                vhb vhbVar = (vhb) eupVar2.bc.a();
                vhbVar.getClass();
                vjo vjoVar = (vjo) eupVar2.bf.a();
                vjoVar.getClass();
                vkz vkzVar = (vkz) etrVar2.e.a();
                vkzVar.getClass();
                return tgrVar.a(new tgl(accountId, vhbVar, vjoVar, vkzVar, optionalOf));
            case 2:
                eup eupVar3 = this.a;
                Object objA = eupVar3.iO.a();
                AccountId accountId2 = this.b.a;
                aejl aejlVar = eupVar3.iQ;
                if (accountId2 == null) {
                    setSingleton = Collections.EMPTY_SET;
                } else {
                    wwa wwaVarB = wwb.a.b();
                    vfh.a(wwaVarB, accountId2);
                    setSingleton = Collections.singleton(((wwc) wwaVarB).e());
                }
                setSingleton.getClass();
                return wxe.b(objA, aejlVar, yzq.o(setSingleton));
            case 3:
                AccountId accountId3 = this.b.a;
                yqw.M(accountId3 != null, "Null propagated AccountId! Check that you have included one of the following modules:\n\t//java/com/google/apps/tiktok/account:module\n\t//java/com/google/apps/tiktok/account/testing:module");
                accountId3.getClass();
                return accountId3;
            case 4:
                return new vkz((vhb) this.a.bc.a(), (AccountId) this.b.d.a());
            case 5:
                etr etrVar3 = this.b;
                ujk ujkVar = (ujk) etrVar3.f.a();
                zcp zcpVar = zcp.b;
                eup eupVar4 = this.a;
                Optional.empty();
                ((waa) eupVar4.P.a()).a("com.google.android.libraries.search.device", "45667441").d();
                return new ron(ujkVar);
            case 6:
                etr etrVar4 = this.b;
                eup eupVar5 = etrVar4.b;
                final uxt uxtVar = (uxt) eupVar5.nR.a();
                wnd wndVarK = wne.k();
                wnb wnbVar = (wnb) wndVarK;
                wnbVar.a = "ZwiebackIdentity";
                wndVarK.b(roq.a);
                wnbVar.b = yqt.i(new zvh() { // from class: roo
                    @Override // defpackage.zvh
                    public final zyd a() {
                        return zxn.h((String) uxtVar.b.a());
                    }
                });
                wne wneVarA = wndVarK.a();
                eup eupVar6 = this.a;
                aejl aejlVar2 = eupVar5.w;
                vpo vpoVarH = etrVar4.h();
                ueg uegVar = (ueg) eupVar6.au.a();
                yqw.M(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
                yqw.M(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
                wnc wncVar = (wnc) wneVarA;
                Executor executor = wncVar.h;
                if (executor == null) {
                    executor = (Executor) aejlVar2.a();
                }
                Executor executor2 = executor;
                ujk ujkVarA = umw.a(wncVar.a, vpoVarH.a(wneVarA, executor2), wncVar.c, ExtensionRegistryLite.getGeneratedRegistry(), executor2, wncVar.f, uegVar);
                yyk yykVar = wncVar.e;
                if (!yykVar.isEmpty()) {
                    ujkVarA.b(new ujj(yykVar, executor2));
                }
                return ujkVarA;
            case 7:
                wnd wndVarK2 = wne.k();
                ((wnb) wndVarK2).a = "geller_top_contacts_protodatastore";
                wndVarK2.b(acgz.a);
                return this.b.i().a(wndVarK2.a(), (ueg) this.a.au.a());
            case 8:
                wnd wndVarK3 = wne.k();
                ((wnb) wndVarK3).a = "geller_assistant_uudp_profile_protodatastore";
                wndVarK3.b(acgz.a);
                return this.b.i().a(wndVarK3.a(), (ueg) this.a.au.a());
            case 9:
                eup eupVar7 = this.a;
                Context context = (Context) eupVar7.n.a();
                vtz vtzVar = (vtz) eupVar7.hT.a();
                vvf vvfVar = (vvf) eupVar7.hU.a();
                Executor executor3 = (Executor) eupVar7.w.a();
                zyg zygVar = (zyg) eupVar7.m.a();
                return new vuj(context, vtzVar, vvfVar, executor3, zygVar);
            case 10:
                return new tdk();
            case 11:
                eup eupVar8 = this.a;
                wbn wbnVar = (wbn) eupVar8.aC.a();
                zyg zygVar2 = (zyg) eupVar8.A.a();
                etr etrVar5 = this.b;
                aejl aejlVar3 = etrVar5.d;
                final AccountId accountId4 = (AccountId) aejlVar3.a();
                wgc wgcVar = (wgc) etrVar5.o.a();
                eup eupVar9 = etrVar5.b;
                wmy wmyVar = (wmy) eupVar9.aG.a();
                AccountId accountId5 = (AccountId) aejlVar3.a();
                final vos vosVar = new vos(wmyVar, accountId5);
                final wav wavVar = (wav) eupVar8.f6if.a();
                aejl aejlVar4 = eupVar8.bc;
                yyr yyrVar = zcl.a;
                final vhb vhbVar2 = (vhb) aejlVar4.a();
                final wec wecVarEp = eupVar8.ep();
                wbnVar.getClass();
                zygVar2.getClass();
                accountId4.getClass();
                wgcVar.getClass();
                wavVar.getClass();
                vhbVar2.getClass();
                return wbnVar.a(vzs.b, new agux() { // from class: wgj
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        Uri uriA = vosVar.a(vos.a, "phenotype/".concat(str)).a();
                        uriA.getClass();
                        return uriA;
                    }
                }, zygVar2, yyrVar, wgm.a, new wgn(wgcVar), new zvi() { // from class: wgk
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        return wavVar.b(str, accountId4);
                    }
                }, new agum() { // from class: wgl
                    @Override // defpackage.agum
                    public final Object a() {
                        return wecVarEp.a(((vik) vhbVar2.f(accountId4)).a);
                    }
                });
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new etp(this);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                etr etrVar6 = this.b;
                wgc wgcVar2 = (wgc) etrVar6.o.a();
                eup eupVar10 = this.a;
                wbn wbnVar2 = (wbn) eupVar10.aC.a();
                final AccountId accountId6 = (AccountId) etrVar6.d.a();
                yyr yyrVar2 = zcl.a;
                final vos vosVarG = etrVar6.g();
                final wav wavVar2 = (wav) eupVar10.f6if.a();
                Executor executor4 = (Executor) eupVar10.aR.a();
                final vhb vhbVar3 = (vhb) eupVar10.bc.a();
                final wec wecVarEp2 = eupVar10.ep();
                wgcVar2.getClass();
                wbnVar2.getClass();
                accountId6.getClass();
                wavVar2.getClass();
                executor4.getClass();
                vhbVar3.getClass();
                return wbnVar2.a(vzs.d, new agux() { // from class: wfs
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        Uri uriA = vosVarG.a(vos.a, "phenotype/".concat(str)).a();
                        uriA.getClass();
                        return uriA;
                    }
                }, executor4, yyrVar2, wfv.a, new wfw(wgcVar2), new zvi() { // from class: wft
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        return wavVar2.b(str, accountId6);
                    }
                }, new agum() { // from class: wfu
                    @Override // defpackage.agum
                    public final Object a() {
                        return wecVarEp2.a(((vik) vhbVar3.f(accountId6)).a);
                    }
                });
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                eup eupVar11 = this.a;
                vjo vjoVar2 = (vjo) eupVar11.bf.a();
                etr etrVar7 = this.b;
                AccountId accountId7 = (AccountId) etrVar7.d.a();
                zyg zygVar3 = (zyg) eupVar11.w.a();
                eup eupVar12 = etrVar7.b;
                return new tep(vjoVar2, accountId7, zygVar3, new ter((Context) eupVar12.n.a(), (zyg) eupVar12.w.a()));
            default:
                eup eupVar13 = this.b.b;
                Collection zddVar = aeys.a(eupVar13.P) ? new zdd((wsb) eupVar13.hO.a()) : zcp.b;
                zddVar.getClass();
                return yzq.o(zddVar);
        }
    }
}
