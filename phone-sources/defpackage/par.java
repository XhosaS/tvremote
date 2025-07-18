package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class par extends yiz implements yjz {
    int a;
    final /* synthetic */ pas b;
    final /* synthetic */ oyd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public par(pas pasVar, oyd oydVar, yih yihVar) {
        super(2, yihVar);
        this.b = pasVar;
        this.c = oydVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((par) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new par(this.b, this.c, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        uyv uyvVarAh;
        boolean z;
        int i;
        yio yioVar = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
                z = true;
            } else {
                ybn.f(obj);
                pas pasVar = this.b;
                pim pimVarB = ((pir) pasVar.d).b();
                if (pimVarB == null) {
                    oyi oyiVar = pasVar.e;
                    oyd oydVar = this.c;
                    oyiVar.a(oydVar, "GrowthKitCallbacks not found.", new Object[0]);
                    pasVar.f.e(oydVar, vol.PROMO_NOT_SHOWN_CLIENT_CALLBACK_NOT_REGISTERED);
                    return false;
                }
                if (!xfi.b() && oyb.b(pasVar.c)) {
                    oyi oyiVar2 = pasVar.e;
                    oyd oydVar2 = this.c;
                    oyiVar2.a(oydVar2, "Accessibility is enabled, not displaying.", new Object[0]);
                    pasVar.f.e(oydVar2, vol.PROMO_NOT_SHOWN_ACCESSIBILITY_ENABLED);
                    return false;
                }
                by byVarDR = pimVarB.dR();
                if (byVarDR == null) {
                    oyi oyiVar3 = pasVar.e;
                    oyd oydVar3 = this.c;
                    oyiVar3.b(oydVar3, "No Activity was supplied.", new Object[0]);
                    pasVar.f.e(oydVar3, vol.PROMO_NOT_SHOWN_CLIENT_RETURNED_NULL_ACTIVITY);
                    return false;
                }
                pfp pfpVar = pasVar.h;
                if (pfpVar.e()) {
                    oyi oyiVar4 = pasVar.e;
                    oyd oydVar4 = this.c;
                    oyiVar4.a(oydVar4, "Not showing as a promotion is already presented or being shown.", new Object[0]);
                    pasVar.f.e(oydVar4, vol.PROMO_NOT_SHOWN_ALREADY_PRESENTING);
                    ((tvk) pas.a.e()).s("Not showing promotion, as a promotion is already presented or being shown.");
                    return false;
                }
                for (String str : pas.b) {
                    if (byVarDR.getSupportFragmentManager().f(str) != null) {
                        oyi oyiVar5 = pasVar.e;
                        oyd oydVar5 = this.c;
                        oyiVar5.a(oydVar5, "Not showing as a promotion is already presented.", new Object[0]);
                        pasVar.f.e(oydVar5, vol.PROMO_NOT_SHOWN_ALREADY_PRESENTING);
                        ((tvk) pas.a.e()).v("Not showing promotion, as %s promotion is already presented.", str);
                        return false;
                    }
                }
                oyd oydVar6 = this.c;
                uwi uwiVar = oydVar6.c;
                uyr uyrVar = uwiVar.f;
                if (uyrVar == null) {
                    uyrVar = uyr.a;
                }
                uyrVar.getClass();
                int iZ = osk.z(uyrVar);
                uyr uyrVar2 = uwiVar.f;
                if (uyrVar2 == null) {
                    uyrVar2 = uyr.a;
                }
                uyrVar2.getClass();
                String str2 = "";
                if ((uyrVar2.c == 3 ? (uyy) uyrVar2.d : uyy.a).c == 1) {
                    uyy uyyVar = uyrVar2.c == 3 ? (uyy) uyrVar2.d : uyy.a;
                    if (uyyVar.c == 1) {
                        str2 = (String) uyyVar.d;
                    }
                } else {
                    int i2 = uyrVar2.c;
                    if (i2 == 3) {
                        uyy uyyVar2 = (uyy) uyrVar2.d;
                        if (uyyVar2.c == 10) {
                            str2 = (String) uyyVar2.d;
                        }
                    } else if ((i2 == 5 ? (uzb) uyrVar2.d : uzb.a).c == 1) {
                        uzb uzbVar = uyrVar2.c == 5 ? (uzb) uyrVar2.d : uzb.a;
                        if (uzbVar.c == 1) {
                            str2 = (String) uzbVar.d;
                        }
                    } else if (uyrVar2.c == 5) {
                        uzb uzbVar2 = (uzb) uyrVar2.d;
                        if (uzbVar2.c == 8) {
                            str2 = (String) uzbVar2.d;
                        }
                    } else {
                        str2 = null;
                    }
                }
                tac tacVar = new tac((byte[]) null);
                tacVar.a = iZ;
                tacVar.c = str2;
                if (tacVar.d == null) {
                    tacVar.d = ImmutableMap.builder();
                }
                Object obj2 = tacVar.d;
                ImmutableMap immutableMap = oydVar6.e;
                immutableMap.getClass();
                Iterator it = immutableMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    key.getClass();
                    Object value = entry.getValue();
                    value.getClass();
                    ((ImmutableMap.Builder) obj2).put(osk.y((uxv) key), (Intent) value);
                }
                rzg rzgVarDU = pimVarB.dU(tacVar.e());
                if (rzgVarDU == null) {
                    pasVar.e.b(oydVar6, "Got null response from GrowthKitCallbacks.", new Object[0]);
                    pasVar.f.e(oydVar6, vol.PROMO_NOT_SHOWN_CLIENT_RETURNED_NULL_PROMO_RESPONSE);
                    return false;
                }
                if (!rzgVarDU.a) {
                    pasVar.e.c(oydVar6, "Rejected by GrowthKitCallbacks [%s].", pimVarB.getClass().getSimpleName());
                    pasVar.f.o(oydVar6, rzgVarDU.c);
                    return false;
                }
                Context context = pasVar.c;
                int i3 = rzgVarDU.b;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    uyvVarAh = rdd.ah(context);
                } else if (i4 == 1) {
                    uyvVarAh = uyv.LIGHT;
                } else {
                    if (i4 != 2) {
                        throw new RuntimeException(null, null);
                    }
                    uyvVarAh = uyv.DARK;
                }
                uyvVarAh.getClass();
                pfpVar.c(oydVar6, uyvVarAh, byVarDR);
                if (iZ == 6) {
                    uyr uyrVar3 = uwiVar.f;
                    if (uyrVar3 == null) {
                        uyrVar3 = uyr.a;
                    }
                    int iBm = a.bm((uyrVar3.c == 5 ? (uzb) uyrVar3.d : uzb.a).m);
                    if (iBm == 0) {
                        iBm = 1;
                    }
                    if (iBm - 1 == 2) {
                        pft pftVar = pasVar.i;
                        if (i4 != 0) {
                            z = true;
                            z = true;
                            i = i4 != 1 ? 2 : 1;
                        } else {
                            z = true;
                            i = 3;
                        }
                        this.a = z ? 1 : 0;
                        if (pftVar.a(oydVar6, i, this) == yioVar) {
                            return yioVar;
                        }
                    }
                }
                pfm pfmVar = pasVar.g;
                uyr uyrVar4 = uwiVar.f;
                if (uyrVar4 == null) {
                    uyrVar4 = uyr.a;
                }
                pfmVar.b(byVarDR, pfmVar.a(byVarDR, uyrVar4), oydVar6, uyvVarAh);
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            pas pasVar2 = this.b;
            oyd oydVar7 = this.c;
            pasVar2.e.e(oydVar7, e, new Object[0]);
            pasVar2.f.e(oydVar7, vol.PROMO_NOT_SHOWN_INTERNAL_ERROR);
            pasVar2.h.d(oydVar7);
            return false;
        }
    }
}
