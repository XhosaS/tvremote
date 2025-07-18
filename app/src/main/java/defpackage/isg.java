package defpackage;

import android.accounts.Account;
import android.content.Intent;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isg implements isp {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/smarthome/executors/MediaInitiationExecutor");
    public final exl a;
    private final gtu c;
    private final irr d;
    private final Set e;
    private final irq f;

    public isg(exl exlVar, gtu gtuVar, irq irqVar, irr irrVar) {
        gtuVar.getClass();
        this.a = exlVar;
        this.c = gtuVar;
        this.f = irqVar;
        this.d = irrVar;
        Set setSingleton = Collections.singleton("action.devices.commands.InitiateMedia");
        setSingleton.getClass();
        this.e = setSingleton;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        abax abaxVarJ;
        if (!agvy.c("action.devices.commands.InitiateMedia", str)) {
            throw new IllegalArgumentException("Unsupported command: ".concat(str));
        }
        if (abauVar.g("mediaDeeplink") == null) {
            return false;
        }
        gtu gtuVar = this.c;
        if (gtuVar.d() == fwx.PROFILE_LOCK_LOCKED) {
            zdy zdyVar = b;
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/smarthome/executors/MediaInitiationExecutor", "execute", 42, "MediaInitiationExecutor.kt")).u("Unable to open app since profile is locked.");
            this.d.b();
            exl exlVar = this.a;
            Intent intent = new Intent("android.apps.tv.launcherx.PROFILE_LOCK_REAUTH");
            intent.setPackage("com.google.android.apps.tv.launcherx");
            Account accountC = gtuVar.c();
            if (accountC != null) {
                intent.putExtra("account_name_extra", accountC.name);
            }
            if (exlVar.c(intent, exj.b, exk.a, 2)) {
                return false;
            }
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/smarthome/executors/MediaInitiationExecutor", "execute", 59, "MediaInitiationExecutor.kt")).u("Unable to start LauncherX profile lock reauth.");
            return false;
        }
        String strC = abauVar.j("mediaDeeplink").c();
        abau abauVarI = abauVar.i("mediaDeeplinkPlayer");
        String strC2 = null;
        if (abauVarI != null && (abaxVarJ = abauVarI.j("id")) != null) {
            strC2 = abaxVarJ.c();
        }
        this.d.b();
        irq irqVar = this.f;
        strC.getClass();
        agux aguxVar = new agux() { // from class: isf
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                intent2.setFlags(268435456);
                this.a.a.b(intent2, exj.b, exk.a, 1, null);
                return true;
            }
        };
        if (strC2 == null) {
            strC2 = "";
        }
        return irqVar.b(strC2, strC, null, null, aguxVar);
    }
}
