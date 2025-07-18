package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isj implements isp {
    private final irr a;
    private final Set b;

    public isj(irr irrVar) {
        this.a = irrVar;
        Set setSingleton = Collections.singleton("action.devices.commands.SetToggles");
        setSingleton.getClass();
        this.b = setSingleton;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        if (!agvy.c("action.devices.commands.SetToggles", str)) {
            throw new IllegalArgumentException("Unsupported command: ".concat(str));
        }
        boolean z = false;
        if (abauVar.g("updateToggleSettings") == null) {
            return false;
        }
        abbk abbkVar = new abbk((abbl) abauVar.g("updateToggleSettings").f().a.entrySet());
        while (abbkVar.hasNext()) {
            abbp abbpVarA = abbkVar.a();
            abbpVarA.getClass();
            String str2 = (String) abbpVarA.f;
            boolean zE = ((abar) abbpVarA.h).e();
            ewl ewlVar = ewl.a;
            str2.getClass();
            if (this.a.a(ewlVar.c(str2), zE)) {
                z = true;
            }
        }
        return z;
    }
}
