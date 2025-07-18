package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkg {
    public static final vkf a = new vkf();
    public static final zdy b = zdy.h("com/google/apps/tiktok/account/data/google/GmsAccounts");
    public final jwr c;
    public final zyg d;
    public final zyg e;
    public final qlz f;
    public final jxz g;
    public final agow h;

    public vkg(jwr jwrVar, zyg zygVar, zyg zygVar2, qlz qlzVar, jxz jxzVar, agow agowVar) {
        zygVar.getClass();
        zygVar2.getClass();
        qlzVar.getClass();
        this.c = jwrVar;
        this.d = zygVar;
        this.e = zygVar2;
        this.f = qlzVar;
        this.g = jxzVar;
        this.h = agowVar;
    }

    public final zyd a(final String str) {
        wvx wvxVarA = wzg.a("GmsAccounts.getAccountId");
        try {
            zvh zvhVarB = wyo.b(new zvh() { // from class: vjp
                @Override // defpackage.zvh
                public final zyd a() {
                    vkg vkgVar = this.a;
                    String str2 = str;
                    wvx wvxVarA2 = wzg.a("Fast GoogleAuthUtilWrapper.getAccountId");
                    try {
                        zyd zydVarA = otn.a(vkgVar.c.b(str2));
                        wvxVarA2.a(zydVarA);
                        aguc.a(wvxVarA2, null);
                        return zydVarA;
                    } finally {
                    }
                }
            });
            zyg zygVar = this.d;
            zyd zydVarH = zud.h(zxn.l(zvhVarB, zygVar), jwj.class, wyo.c(new zvi() { // from class: vjv
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    jwj jwjVar = (jwj) obj;
                    jwjVar.getClass();
                    ((zdv) ((zdv) vkg.b.b()).p(jwjVar).q("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$lambda$23$lambda$22", 374, "GmsAccounts.kt")).u("Fast Auth.getAccountId() Failed");
                    final vkg vkgVar = this.a;
                    final String str2 = str;
                    wvx wvxVarA2 = wzg.a("GoogleAuthUtilWrapper.getToken");
                    try {
                        zyd zydVarA = otn.a(vkgVar.c.c(new Account(str2, "com.google"), "oauth2:https://www.googleapis.com/auth/userinfo.email"));
                        wvxVarA2.a(zydVarA);
                        aguc.a(wvxVarA2, null);
                        return zuz.g(zuz.h(zwx.u(zydVarA), wyo.c(new zvi() { // from class: vjw
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) {
                                ((String) obj2).getClass();
                                vkg vkgVar2 = vkgVar;
                                String str3 = str2;
                                wvx wvxVarA3 = wzg.a("GoogleAuthUtilWrapper.getAccountId");
                                try {
                                    zyd zydVarA2 = otn.a(vkgVar2.c.b(str3));
                                    wvxVarA3.a(zydVarA2);
                                    aguc.a(wvxVarA3, null);
                                    return zydVarA2;
                                } finally {
                                }
                            }
                        }), vkgVar.d), wyo.a(new yqi() { // from class: vjx
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) {
                                String str3 = (String) obj2;
                                ((zdv) vkg.b.c().q("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$lambda$23$lambda$22$lambda$21", 403, "GmsAccounts.kt")).u("Found case where getToken fixed the getAccountId failure");
                                return str3;
                            }
                        }), zwk.a);
                    } finally {
                    }
                }
            }), zygVar);
            wvxVarA.a(zydVarH);
            aguc.a(wvxVarA, null);
            return zydVarH;
        } finally {
        }
    }
}
