package defpackage;

import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqi extends tpw implements tpz {
    public static final tpx a = new tpy();
    private final Exception b;

    public tqi(UUID uuid, String str, Exception exc, yau yauVar) {
        super("<missing root>", uuid, str, yauVar);
        this.b = exc;
    }

    @Override // defpackage.tpz
    public final Exception b() {
        return this.b;
    }

    @Override // defpackage.tpz
    public final tqt g(String str, tqo tqoVar, boolean z, yau yauVar) {
        if (z) {
            WeakHashMap weakHashMap = tqg.a;
        }
        return new tqj(str, this, tqoVar, z, yauVar);
    }

    @Override // defpackage.tqt
    public final tqo h() {
        return tqn.a;
    }

    @Override // defpackage.tqt
    public final tqo i() {
        throw null;
    }

    @Override // defpackage.tqt
    public final tqt k(String str, tqo tqoVar, yau yauVar) {
        WeakHashMap weakHashMap = tqg.a;
        return g(str, tqoVar, true, yauVar);
    }

    @Override // defpackage.tqt
    public final void j() {
    }
}
