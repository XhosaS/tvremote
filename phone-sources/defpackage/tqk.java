package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqk extends tqa {
    public static final tqk a = new tqk(UUID.randomUUID());

    private tqk(UUID uuid) {
        super("<skip trace>", uuid, tpw.ey(uuid), tqn.a, tqg.d());
    }

    @Override // defpackage.tqt
    public final tqo i() {
        return tqn.a;
    }

    @Override // defpackage.tqt
    public final tqt k(String str, tqo tqoVar, yau yauVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.tqt
    public final void j() {
    }
}
