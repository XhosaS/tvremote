package defpackage;

import android.accounts.Account;
import com.google.apps.tiktok.account.AccountId;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjo {
    public static final zdy a = zdy.h("com/google/apps/tiktok/account/data/google/GcoreAccountName");
    public final boolean b;
    private final yqt c;
    private final yqt d;

    public vjo(yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        this.c = yqtVar;
        this.d = yqtVar2;
        this.b = !((Boolean) yqtVar3.e(false)).booleanValue();
    }

    public static String d(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return g(lowerCase) ? String.valueOf(lowerCase.substring(0, lowerCase.lastIndexOf("@")).replace(".", "").replace('i', 'l').replace('1', 'l').replace('0', 'o').replace('2', 'z').replace('5', 's')).concat("@gmail.com") : lowerCase;
    }

    public static boolean g(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.endsWith("@googlemail.com") || lowerCase.endsWith("@gmail.com");
    }

    public final zyd a(AccountId accountId) {
        return zuz.g(b(accountId), wyo.a(new yqi() { // from class: vjm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String str = (String) obj;
                yqw.B(str != null, "AccountId was not a Google account");
                return new Account(str, "com.google");
            }
        }), zwk.a);
    }

    public final zyd b(AccountId accountId) {
        if (accountId == null) {
            return zxn.g(new vio());
        }
        zyd zydVarC = ((vhq) ((yqz) this.c).a).c(accountId);
        yqi yqiVarA = wyo.a(new yqi() { // from class: vjk
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return this.a.e(((vha) obj).b());
            }
        });
        zwk zwkVar = zwk.a;
        return zud.g(zuz.g(zydVarC, yqiVarA, zwkVar), IllegalArgumentException.class, wyo.a(new yqi() { // from class: vjl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                throw new vio((IllegalArgumentException) obj);
            }
        }), zwkVar);
    }

    public final zyd c(final String str) {
        return str != null ? zuz.g(((vhq) ((yqz) this.c).a).e(), wyo.a(new yqi() { // from class: vjj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                List<vha> list = (List) obj;
                Iterator it = list.iterator();
                while (true) {
                    String str2 = str;
                    vjo vjoVar = this.a;
                    if (!it.hasNext()) {
                        String strD = vjo.d(str2);
                        for (vha vhaVar : list) {
                            if (vjoVar.h(vhaVar.b()) && vjoVar.f(vhaVar.b())) {
                                if (strD.equals(vjo.d(vhaVar.b().g))) {
                                    return vhaVar.a();
                                }
                                if (vjoVar.b) {
                                    vhg vhgVarB = vhaVar.b();
                                    abxc abxcVar = vkn.a;
                                    if (abxcVar.a != vhg.a) {
                                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                    }
                                    Object objK = vhgVarB.n.k(abxcVar.d);
                                    for (String str3 : ((vkj) (objK == null ? abxcVar.b : abxcVar.b(objK))).d) {
                                        if (vjo.g(str3)) {
                                            ((zdv) ((zdv) vjo.a.c()).q("com/google/apps/tiktok/account/data/google/GcoreAccountName", "toAccountId", 180, "GcoreAccountName.java")).u("Found google email address as the old primary email address. This shouldn't happen because the primary email address cannot change once set to a google domain one.");
                                            if (strD.equals(vjo.d(str3))) {
                                                return vhaVar.a();
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        throw new vio();
                    }
                    vha vhaVar2 = (vha) it.next();
                    if (vjoVar.h(vhaVar2.b()) && vjoVar.f(vhaVar2.b())) {
                        if (str2.equals(vhaVar2.b().g)) {
                            return vhaVar2.a();
                        }
                        if (vjoVar.b) {
                            vhg vhgVarB2 = vhaVar2.b();
                            abxc abxcVar2 = vkn.a;
                            if (abxcVar2.a != vhg.a) {
                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                            Object objK2 = vhgVarB2.n.k(abxcVar2.d);
                            Iterator it2 = ((vkj) (objK2 == null ? abxcVar2.b : abxcVar2.b(objK2))).d.iterator();
                            while (it2.hasNext()) {
                                if (str2.equals((String) it2.next())) {
                                    return vhaVar2.a();
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }), zwk.a) : zxn.g(new vio());
    }

    public final String e(vhg vhgVar) {
        if (((String) ((yqz) this.d).a).equals(vhgVar.j)) {
            return vhgVar.g;
        }
        return null;
    }

    public final boolean f(vhg vhgVar) {
        return ((String) ((yqz) this.d).a).equals(vhgVar.j);
    }

    public final boolean h(vhg vhgVar) {
        return !vhgVar.i;
    }
}
