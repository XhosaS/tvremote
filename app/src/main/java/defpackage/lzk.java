package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.katniss.data.PermissionsText;
import com.google.android.katniss.data.UserAssistantSettings;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class lzk extends lzp {
    public abvo a;
    final /* synthetic */ lzl b;

    public lzk(lzl lzlVar) {
        this.b = lzlVar;
    }

    private final void p(lzr lzrVar, int i) {
        lzl lzlVar = this.b;
        if (!lzlVar.b()) {
            ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "fetchUserAssistantSettings", 387, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
            return;
        }
        gtu gtuVar = lzlVar.h;
        if (gtuVar.c() == null) {
            List listN = gtuVar.n();
            if (listN.size() <= 0) {
                ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "fetchUserAssistantSettings", 396, "AssistantSettingsServicePeer.java")).u("There is no accounts, we shouldn't make the call without accounts.");
                try {
                    n(lzrVar, i);
                    return;
                } catch (RemoteException e) {
                    ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "fetchUserAssistantSettings", (char) 401, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
                    return;
                }
            }
            lzl lzlVar2 = this.b;
            lzlVar2.i.a(((Account) listN.get(0)).name, fwx.PROFILE_LOCK_UNSPECIFIED);
            if (((Boolean) lzlVar2.n.a()).booleanValue()) {
                lzlVar2.j.a(((Account) listN.get(0)).name, fws.NETWORK_STATE_UNSPECIFIED);
            }
        }
        lzl lzlVar3 = this.b;
        gtu gtuVar2 = lzlVar3.h;
        Account accountC = gtuVar2.c();
        if (accountC != null && gtuVar2.r(accountC)) {
            accountC = gtuVar2.b(accountC);
        }
        if (accountC == null) {
            o(gvw.c, lzrVar, i);
        } else {
            lzlVar3.p.a(accountC, new lzg(this, lzrVar, i), "AssistantSettings", lzl.b);
        }
    }

    @Override // defpackage.lzq
    public final int c() {
        lzl lzlVar = this.b;
        if (lzlVar.b()) {
            return lzlVar.d.a(lzlVar.h.c());
        }
        ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "getAssistantEnabledStatus", 254, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
        return 3;
    }

    @Override // defpackage.lzq
    public final int d() {
        lzl lzlVar = this.b;
        if (lzlVar.b()) {
            return lzlVar.l.W(lzlVar.h.c()) ? 1 : 0;
        }
        ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "getPersonalResultsEnabledStatus", 321, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
        return 3;
    }

    @Override // defpackage.lzq
    public final void e() {
        lzl lzlVar = this.b;
        if (!lzlVar.b()) {
            ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "enablePermissions", 621, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
            return;
        }
        abvo abvoVar = this.a;
        if (abvoVar == null || abvoVar.A()) {
            ((zdv) ((zdv) lzl.a.d()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "enablePermissions", 618, "AssistantSettingsServicePeer.java")).u("no consent token found to enable UDC permissions.");
            return;
        }
        lzh lzhVar = new lzh();
        iax iaxVar = lzlVar.d;
        iaxVar.o(lzlVar.h.c(), iaxVar.e(this.a), lzhVar, "AssistantSettings");
        lzlVar.a();
    }

    @Override // defpackage.lzq
    public final void f(boolean z) {
        lzl lzlVar = this.b;
        if (!lzlVar.b()) {
            ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "optInToEmail", 367, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
            return;
        }
        ymg ymgVar = ymg.a;
        ymf ymfVar = new ymf();
        yhu yhuVar = yhu.a;
        yht yhtVar = new yht();
        if ((yhtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yhtVar.y();
        }
        yhu yhuVar2 = (yhu) yhtVar.b;
        yhuVar2.b |= 64;
        yhuVar2.c = z;
        if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymfVar.y();
        }
        ymg ymgVar2 = (ymg) ymfVar.b;
        yhu yhuVar3 = (yhu) yhtVar.v();
        yhuVar3.getClass();
        ymgVar2.f = yhuVar3;
        ymgVar2.b |= 8;
        lzlVar.d.o(lzlVar.h.c(), (ymg) ymfVar.v(), new lze(), "AssistantSettings");
    }

    @Override // defpackage.lzq
    public final void g(boolean z) {
        lzl lzlVar = this.b;
        if (!lzlVar.b()) {
            ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "setEnableAssistant", 243, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
            return;
        }
        iba ibaVar = lzlVar.e;
        zyd zydVarC = ahkr.c(ibaVar.b, 0, new iaz(ibaVar, lzlVar.h.c(), z, null), 3);
        lzc lzcVar = new lzc(this);
        zxn.p(zydVarC, wyo.f(lzcVar), zwk.a);
    }

    @Override // defpackage.lzq
    public final void h(boolean z) {
        lzl lzlVar = this.b;
        if (!lzlVar.b()) {
            ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "setEnablePersonalResults", 308, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
            return;
        }
        lzd lzdVar = new lzd(this, z);
        lzlVar.d.o(lzlVar.h.c(), ird.b(z, (lzlVar.g == gph.a && ((Boolean) lzlVar.m.get()).booleanValue()) ? Optional.of(Boolean.valueOf(z)) : Optional.empty(), false, null, 2), lzdVar, "AssistantSettings");
    }

    @Override // defpackage.lzq
    @Deprecated
    public final boolean i() {
        lzl lzlVar = this.b;
        if (lzlVar.b()) {
            return ((Boolean) lzlVar.f.get()).booleanValue();
        }
        ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "isAssistantAvailable", 194, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
        return false;
    }

    @Override // defpackage.lzq
    public final void j(lzr lzrVar) {
        p(lzrVar, 1);
    }

    @Override // defpackage.lzq
    public final void k(lzr lzrVar) {
        p(lzrVar, 2);
    }

    @Override // defpackage.lzq
    public final void l(lzn lznVar) {
        lzl lzlVar = this.b;
        if (!lzlVar.b()) {
            ((zdv) ((zdv) lzl.a.c()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "queryIsAssistantAvailable", 206, "AssistantSettingsServicePeer.java")).x("Unknown caller: %s", lzlVar.k.getNameForUid(Binder.getCallingUid()));
            return;
        }
        try {
            boolean zBooleanValue = ((Boolean) lzlVar.f.get()).booleanValue();
            Parcel parcelA = lznVar.a();
            ClassLoader classLoader = erv.a;
            parcelA.writeInt(zBooleanValue ? 1 : 0);
            lznVar.K(1, parcelA);
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "sendAssistantAvailableResult", (char) 216, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
        }
    }

    @Override // defpackage.lzq
    public final void m(String str, lzo lzoVar) {
        Account account;
        Iterator it = this.b.h.n().iterator();
        while (true) {
            if (!it.hasNext()) {
                account = null;
                break;
            } else {
                account = (Account) it.next();
                if (account.name.equals(str)) {
                    break;
                }
            }
        }
        if (account == null) {
            try {
                lzoVar.e("", 1);
                return;
            } catch (RemoteException e) {
                ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "registerAndGetDeviceIdForAccount", (char) 634, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
                return;
            }
        }
        ymg ymgVar = ymg.a;
        ymf ymfVar = new ymf();
        yiu yiuVar = yiu.a;
        yit yitVar = new yit();
        if ((yitVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yitVar.y();
        }
        yiu yiuVar2 = (yiu) yitVar.b;
        yiuVar2.d = 7;
        yiuVar2.b |= 2;
        yip yipVar = yip.a;
        yio yioVar = new yio();
        if ((yioVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yioVar.y();
        }
        yip yipVar2 = (yip) yioVar.b;
        yiu yiuVar3 = (yiu) yitVar.v();
        yiuVar3.getClass();
        abxs abxsVar = yipVar2.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            yipVar2.b = abxsVar.d(size + size);
        }
        yipVar2.b.add(yiuVar3);
        if ((ymfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymfVar.y();
        }
        ymg ymgVar2 = (ymg) ymfVar.b;
        yip yipVar3 = (yip) yioVar.v();
        yipVar3.getClass();
        ymgVar2.h = yipVar3;
        ymgVar2.b |= 32;
        this.b.d.o(account, (ymg) ymfVar.v(), new lzi(this, account, lzoVar), "AssistantSettings");
    }

    public final void n(lzr lzrVar, int i) {
        if (i - 1 == 0) {
            lzrVar.e(new PermissionsText(3, null, null, null, null, null, null, new ArrayList()));
            return;
        }
        lxp lxpVar = lxp.a;
        lxl lxlVar = new lxl();
        if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            lxlVar.y();
        }
        lxp lxpVar2 = (lxp) lxlVar.b;
        lxpVar2.c = 3;
        lxpVar2.b |= 1;
        lzrVar.f(new UserAssistantSettings((lxp) lxlVar.v()));
    }

    public final void o(gvw gvwVar, lzr lzrVar, int i) {
        ((zdv) ((zdv) lzl.a.d()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "onFailInternal", 577, "AssistantSettingsServicePeer.java")).x("Check auth failed and won't launch the intent. Token status code: %s", new qsk(gvwVar));
        try {
            if (i - 1 == 0) {
                lzrVar.e(new PermissionsText(0, null, null, null, null, null, null, new ArrayList()));
                return;
            }
            lxp lxpVar = lxp.a;
            lxl lxlVar = new lxl();
            if ((lxlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                lxlVar.y();
            }
            lxp lxpVar2 = (lxp) lxlVar.b;
            lxpVar2.c = 0;
            lxpVar2.b |= 1;
            lzrVar.f(new UserAssistantSettings((lxp) lxlVar.v()));
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1", "onFailInternal", 583, "AssistantSettingsServicePeer.java")).x("Callback Failed. Token status code: %s", new qsk(gvwVar));
        }
    }
}
