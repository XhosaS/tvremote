package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.protobuf.MessageLite;
import j$.time.Instant;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcg implements waa {
    final /* synthetic */ wbm a;

    public wcg(wbm wbmVar) {
        this.a = wbmVar;
    }

    @Override // defpackage.waa
    public final wag a(String str, String str2) {
        wcp wcpVar;
        wbm wbmVar = this.a;
        wbt wbtVar = wbmVar.c;
        Map map = wbmVar.b;
        String strA = wbtVar.a(str);
        Object obj = map.get(strA);
        obj.getClass();
        final wea weaVar = (wea) obj;
        try {
            vrf vrfVar = weaVar.v;
            Boolean bool = null;
            if (vrfVar.d.isDone()) {
                wcpVar = (wcp) zxn.o(vrfVar.b());
            } else {
                wvx wvxVarE = wzg.e("Blocking for: " + weaVar.w);
                try {
                    wcp wcpVar2 = (wcp) weaVar.m.b(new zvh() { // from class: wdn
                        @Override // defpackage.zvh
                        public final zyd a() {
                            return weaVar.v.b();
                        }
                    });
                    aguc.a(wvxVarE, null);
                    wcpVar = wcpVar2;
                } finally {
                }
            }
            wcpVar.getClass();
            wag wagVarA = wcpVar.a(str2, new agux() { // from class: wcw
                /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, wap] */
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    zyd zydVarA;
                    wdw wdwVar = (wdw) obj2;
                    wdwVar.getClass();
                    wea weaVar2 = weaVar;
                    wdt wdtVar = wea.a;
                    String str3 = null;
                    try {
                        str3 = (String) weaVar2.u.a();
                    } catch (mge e) {
                        Log.e("MendelPackageState", "Getting account name to commit for " + weaVar2.l + " would block", e);
                    } catch (Throwable th) {
                        Log.e("MendelPackageState", "Failed to get account name to commit for ".concat(weaVar2.l), th);
                    }
                    if (str3 != null) {
                        zydVarA = weaVar2.s.a().a(str3, wdwVar.c, wdwVar.e);
                    } else {
                        zydVarA = zxy.a;
                    }
                    wdtVar.a(zydVarA, "Failed to commit to config");
                    weaVar2.k.a.add(weaVar2.l);
                    if (Math.abs(Instant.now().toEpochMilli() - wdwVar.d) > TimeUnit.DAYS.toMillis(1L)) {
                        wea.a.a(zxn.l(wyo.b(weaVar2.t), weaVar2.c), "Failed to fetch after encountering old config");
                    }
                    weaVar2.w.getClass();
                    return agpu.a;
                }
            });
            yqt yqtVar = wbmVar.a;
            if (!yqtVar.g()) {
                return wagVarA;
            }
            Object obj2 = wbmVar.b.get(strA);
            obj2.getClass();
            wea weaVar2 = (wea) obj2;
            rew rewVar = (rew) yqtVar.c();
            String str3 = weaVar2.w;
            agow agowVar = weaVar2.o;
            Uri uriA = rff.a(str3);
            final wag wagVarA2 = ((wah) agowVar.a()).a(str2);
            if (wagVarA2 == null) {
                throw new IllegalArgumentException("No known flag " + str2 + ", known flags: " + ((wah) agowVar.a()).b.keySet());
            }
            final String strA2 = rewVar.a(uriA, null, null, str2);
            if (strA2 != null) {
                int i = wagVarA2.d - 1;
                if (i == 0) {
                    return wag.a.c(Long.parseLong(strA2));
                }
                if (i == 1) {
                    waf wafVar = wag.a;
                    if (lwz.c.matcher(strA2).matches()) {
                        bool = true;
                    } else if (lwz.d.matcher(strA2).matches()) {
                        bool = false;
                    }
                    return wafVar.a(bool != null ? bool.booleanValue() : wagVarA2.d(), false);
                }
                if (i == 2) {
                    return wag.a.b(Double.parseDouble(strA2));
                }
                if (i == 3) {
                    return wag.a.e(strA2);
                }
                if (i == 4) {
                    return new wag(new agum() { // from class: wbf
                        @Override // defpackage.agum
                        public final Object a() {
                            byte[] bArrDecode = Base64.decode(strA2, 3);
                            abvo abvoVar = abvo.b;
                            return abvo.u(bArrDecode, 0, bArrDecode.length);
                        }
                    }, 5, false, 4);
                }
                try {
                    waf wafVar2 = wag.a;
                    agum agumVar = new agum() { // from class: wbg
                        @Override // defpackage.agum
                        public final Object a() {
                            Object objB = wagVarA2.b().i().b(Base64.decode(strA2, 3));
                            objB.getClass();
                            return objB;
                        }
                    };
                    MessageLite messageLite = wagVarA2.b;
                    messageLite.getClass();
                    return wafVar2.d(agumVar, messageLite);
                } catch (abxv unused) {
                }
            }
            return wagVarA2;
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
