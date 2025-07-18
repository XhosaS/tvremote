package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isd implements isp {
    private final irr a;
    private final Set b;

    public isd(irr irrVar) {
        this.a = irrVar;
        Set setSingleton = Collections.singleton("action.devices.commands.SetInput");
        setSingleton.getClass();
        this.b = setSingleton;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        if (!agvy.c("action.devices.commands.SetInput", str)) {
            throw new IllegalArgumentException("Unsupported command: ".concat(str));
        }
        if (abauVar.g("newInput") == null) {
            return false;
        }
        ewl ewlVar = ewl.a;
        String strC = abauVar.j("newInput").c();
        strC.getClass();
        String strC2 = ewlVar.c(strC);
        irr irrVar = this.a;
        irrVar.b();
        return irrVar.a(strC2, true);
    }
}
