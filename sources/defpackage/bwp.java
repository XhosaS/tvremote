package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bwp extends bwl {
    private final bxe a;

    public bwp(String str, bxk bxkVar, bxe bxeVar, bxj bxjVar) {
        super(str, bxkVar, bxjVar);
        bdq.e(bxeVar.d);
        this.a = bxeVar;
    }

    @Override // defpackage.bxk
    public final bxe h() {
        return bxe.a(this.a, i());
    }

    public bwp(String str, UUID uuid, String str2, bxe bxeVar, bxj bxjVar) {
        super(str, uuid, str2, bxjVar);
        bdq.e(bxeVar.d);
        this.a = bxeVar;
    }
}
