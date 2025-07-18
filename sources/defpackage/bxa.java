package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxa extends bwp {
    public static final bxa a = new bxa(UUID.randomUUID());

    private bxa(UUID uuid) {
        super("<skip trace>", uuid, bwl.aR(uuid), bxd.a, bwv.a());
    }

    @Override // defpackage.bxk
    public final bxe i() {
        return bxd.a;
    }

    @Override // defpackage.bxk
    public final bxk k(String str, bxe bxeVar, bxj bxjVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.bxk
    public final void j() {
    }
}
