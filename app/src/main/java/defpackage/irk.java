package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irk {
    public static final irk a = new irk();
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/setup/share/UpdateAssistantSettingsUtils");

    private irk() {
    }

    public final Intent a() {
        Intent intent = new Intent("com.google.android.apps.tvsearch.setup.share.ASSISTANT_ENABLED").setPackage("com.google.android.katniss");
        intent.getClass();
        return intent;
    }

    public final String b(yjc yjcVar) {
        abxs abxsVar;
        String str = null;
        if (yjcVar != null && (abxsVar = yjcVar.b) != null) {
            str = (String) agqq.o(abxsVar);
        }
        if (str != null) {
            return str;
        }
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    public final void c(Account account, iax iaxVar, ahbt ahbtVar, String str, idl idlVar, ymi ymiVar) {
        iaxVar.getClass();
        ahbtVar.getClass();
        str.getClass();
        idlVar.getClass();
        ymiVar.getClass();
        if ((ymiVar.b & 64) != 0) {
            ynp ynpVar = ymiVar.d;
            if (ynpVar == null) {
                ynpVar = ynp.a;
            }
            if ((ynpVar.b & 2) != 0) {
                zdv zdvVar = (zdv) b.d().q("com/google/android/apps/tvsearch/setup/share/UpdateAssistantSettingsUtils", "onEnableAssistantSettingsSuccessResponse", 142, "UpdateAssistantSettingsUtils.kt");
                ynp ynpVar2 = ymiVar.d;
                if (ynpVar2 == null) {
                    ynpVar2 = ynp.a;
                }
                ynh ynhVarB = ynh.b(ynpVar2.c);
                if (ynhVarB == null) {
                    ynhVarB = ynh.UNSPECIFIED;
                }
                zdvVar.v("UDC settings update failed with status: %s.", ynhVarB.h);
            } else {
                ahal.e(ahbtVar, null, 0, new irj(iaxVar, account, null), 3);
            }
        }
        if ((ymiVar.b & 65536) != 0) {
            idlVar.s(str);
        }
        d(ymiVar);
    }

    public final boolean d(ymi ymiVar) {
        ymiVar.getClass();
        boolean z = true;
        if ((ymiVar.b & 1) != 0) {
            yke ykeVar = ymiVar.c;
            if (ykeVar == null) {
                ykeVar = yke.a;
            }
            ykeVar.getClass();
            if (ykeVar.b.size() != 1) {
                ((zdv) b.d().q("com/google/android/apps/tvsearch/setup/share/UpdateAssistantSettingsUtils", "checkCastRegistrationResult", 179, "UpdateAssistantSettingsUtils.kt")).v("Katniss should only send out one cast device link request per update, actual count: %d", ykeVar.b.size());
            }
            for (yjw yjwVar : ykeVar.b) {
                if ((yjwVar.b & 2) != 0 && !yjwVar.d) {
                    ((zdv) b.d().q("com/google/android/apps/tvsearch/setup/share/UpdateAssistantSettingsUtils", "checkCastRegistrationResult", 189, "UpdateAssistantSettingsUtils.kt")).F("One cast device link request failed on server-side. cast_device_id: %s, returned error message: %s", yjwVar.c, yjwVar.e);
                    z = false;
                }
            }
        }
        return z;
    }

    public final ymg e(abvo abvoVar, String str, String str2, String str3, Optional optional, String str4, Optional optional2, int i, gph gphVar, boolean z) {
        abvoVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        optional.getClass();
        str4.getClass();
        optional2.getClass();
        gphVar.getClass();
        ymg ymgVar = ymg.a;
        ymk ymkVar = new ymk(new ymf());
        if (!abvoVar.A()) {
            ynn ynnVar = ynn.a;
            ynm ynmVar = new ynm();
            if ((ynmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ynmVar.y();
            }
            ynn ynnVar2 = (ynn) ynmVar.b;
            ynnVar2.b |= 1;
            ynnVar2.c = abvoVar;
            ynn ynnVarA = ynq.a(ynmVar);
            ymf ymfVar = ymkVar.a;
            if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ymfVar.y();
            }
            ymg ymgVar2 = (ymg) ymfVar.b;
            ymgVar2.i = ynnVarA;
            ymgVar2.b |= 4096;
        }
        if (!z) {
            ykc ykcVar = ykc.a;
            ykf ykfVar = new ykf(new ykb());
            acaw acawVarB = ykfVar.b();
            yju yjuVar = yju.a;
            yjs yjsVar = new yjs(new yjt());
            yjsVar.c(str);
            yjsVar.b(str2);
            yjsVar.d();
            yjt yjtVar = yjsVar.a;
            if ((yjtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yjtVar.y();
            }
            yju yjuVar2 = (yju) yjtVar.b;
            yjuVar2.b |= 32;
            yjuVar2.f = str3;
            ykfVar.c(acawVarB, yjsVar.a());
            ykc ykcVarA = ykfVar.a();
            ymf ymfVar2 = ymkVar.a;
            if ((ymfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ymfVar2.y();
            }
            ymg ymgVar3 = (ymg) ymfVar2.b;
            ymgVar3.e = ykcVarA;
            ymgVar3.b |= 4;
        }
        yip yipVar = yip.a;
        yia yiaVar = new yia(new yio());
        yiaVar.b();
        yiu yiuVar = yiu.a;
        yiv yivVar = new yiv(new yit());
        yivVar.e();
        yil yilVar = yil.a;
        yhy yhyVar = new yhy(new yig());
        yig yigVar = yhyVar.a;
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar2 = (yil) yigVar.b;
        yilVar2.b |= 1;
        yilVar2.d = str3;
        gph gphVar2 = gph.a;
        boolean z2 = false;
        boolean z3 = gphVar == gphVar2;
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar3 = (yil) yigVar.b;
        yilVar3.c |= 2048;
        yilVar3.k = z3;
        String str5 = Build.MODEL;
        str5.getClass();
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar4 = (yil) yigVar.b;
        yilVar4.c |= 4;
        yilVar4.i = str5;
        yhyVar.b(str4);
        yhyVar.c(i);
        if (optional2.isPresent() && optional2.get() == ycp.VOICE_MATCH_ACCEPTED) {
            z2 = true;
        }
        if ((yigVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yigVar.y();
        }
        yil yilVar5 = (yil) yigVar.b;
        yilVar5.b |= 1024;
        yilVar5.h = z2;
        yil yilVarA = yhyVar.a();
        yit yitVar = yivVar.a;
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar2 = (yiu) yitVar.b;
        yiuVar2.f = yilVarA;
        yiuVar2.b |= 32;
        yivVar.b(str);
        if (gphVar == gphVar2) {
            yivVar.c(fcz.b(str));
        }
        yiaVar.a.a(yivVar.a());
        ymkVar.b(yiaVar.a());
        if (optional2.isPresent() && optional2.get() == ycp.VOICE_MATCH_ACCEPTED) {
            yje yjeVar = yje.a;
            yjd yjdVar = new yjd();
            if ((yjdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yjdVar.y();
            }
            yje yjeVar2 = (yje) yjdVar.b;
            yjeVar2.b |= 8;
            yjeVar2.e = true;
            yje yjeVarA = yjg.a(yjdVar);
            ymf ymfVar3 = ymkVar.a;
            if ((ymfVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ymfVar3.y();
            }
            ymg ymgVar4 = (ymg) ymfVar3.b;
            ymgVar4.j = yjeVarA;
            ymgVar4.b |= 65536;
        }
        if (optional.isPresent()) {
            yhu yhuVar = yhu.a;
            yht yhtVar = new yht();
            boolean zBooleanValue = ((Boolean) optional.get()).booleanValue();
            if ((yhtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yhtVar.y();
            }
            yhu yhuVar2 = (yhu) yhtVar.b;
            yhuVar2.b |= 64;
            yhuVar2.c = zBooleanValue;
            abxd abxdVarV = yhtVar.v();
            abxdVarV.getClass();
            ymf ymfVar4 = ymkVar.a;
            yhu yhuVar3 = (yhu) abxdVarV;
            if ((ymfVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ymfVar4.y();
            }
            ymg ymgVar5 = (ymg) ymfVar4.b;
            ymgVar5.f = yhuVar3;
            ymgVar5.b |= 8;
        }
        return ymkVar.a();
    }
}
