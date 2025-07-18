package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ish implements isp {
    private final irr a;
    private final Set b;

    public ish(irr irrVar) {
        this.a = irrVar;
        Set setSingleton = Collections.singleton("action.devices.commands.OnOff");
        setSingleton.getClass();
        this.b = setSingleton;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        if (abauVar.g("on").e()) {
            this.a.b();
        } else {
            ((iru) this.a).d(true);
        }
        return true;
    }
}
