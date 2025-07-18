package defpackage;

import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqj extends tqa implements tpz {
    private final Exception a;
    private final boolean b;

    public tqj(String str, tpz tpzVar, tqo tqoVar, boolean z, yau yauVar) {
        super("<missing root>:".concat(str), tpzVar, tqo.a(tqoVar, tqn.b), yauVar);
        this.a = tpzVar.b();
        this.b = z;
    }

    @Override // defpackage.tpz
    public final Exception b() {
        return this.a;
    }

    @Override // defpackage.tpz
    public final tqt g(String str, tqo tqoVar, boolean z, yau yauVar) {
        if (z && !this.b) {
            WeakHashMap weakHashMap = tqg.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new tqj(str, this, tqoVar, z2, yauVar);
    }

    @Override // defpackage.tqt
    public final tqo i() {
        return tqn.a;
    }

    @Override // defpackage.tqt
    public final tqt k(String str, tqo tqoVar, yau yauVar) {
        WeakHashMap weakHashMap = tqg.a;
        return g(str, tqoVar, true, yauVar);
    }

    public tqj(UUID uuid, String str, String str2, tqo tqoVar, Exception exc, boolean z, yau yauVar) {
        super("<missing root>:".concat(str2), uuid, str, tqo.a(tqoVar, tqn.b), yauVar);
        this.a = exc;
        this.b = z;
    }

    @Override // defpackage.tqt
    public final void j() {
    }
}
