package defpackage;

import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwx extends bwl implements bwo {
    public static final bwm a = new bwn();
    private final Exception b;

    public bwx(UUID uuid, String str, Exception exc, bxj bxjVar) {
        super("<missing root>", uuid, str, bxjVar);
        this.b = exc;
    }

    @Override // defpackage.bwo
    public final Exception b() {
        return this.b;
    }

    @Override // defpackage.bwo
    public final bxk g(String str, bxe bxeVar, boolean z, bxj bxjVar) {
        if (z) {
            WeakHashMap weakHashMap = bwv.a;
        }
        return new bwz(str, this, bxeVar, z, bxjVar);
    }

    @Override // defpackage.bxk
    public final bxe h() {
        return bxd.a;
    }

    @Override // defpackage.bxk
    public final bxe i() {
        throw null;
    }

    @Override // defpackage.bxk
    public final bxk k(String str, bxe bxeVar, bxj bxjVar) {
        WeakHashMap weakHashMap = bwv.a;
        return g(str, bxeVar, true, bxjVar);
    }

    @Override // defpackage.bxk
    public final void j() {
    }
}
