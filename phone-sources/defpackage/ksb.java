package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksb implements ids {
    public final Set a = new LinkedHashSet();
    public yjk b = new jzm(18);
    public yjk c = new jzm(19);

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        iejVar.getClass();
        Set set = this.a;
        if (set.isEmpty()) {
            this.b.a();
        }
        set.add(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        iejVar.getClass();
        Set set = this.a;
        if (set.remove(iejVar) && set.isEmpty()) {
            this.c.a();
        }
    }
}
