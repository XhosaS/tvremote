package defpackage;

import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwz extends bwp implements bwo {
    private final Exception a;
    private final boolean b;

    public bwz(String str, bwo bwoVar, bxe bxeVar, boolean z, bxj bxjVar) {
        super("<missing root>:".concat(String.valueOf(str)), bwoVar, bxe.a(bxeVar, bxd.b), bxjVar);
        this.a = bwoVar.b();
        this.b = z;
    }

    @Override // defpackage.bwo
    public final Exception b() {
        return this.a;
    }

    @Override // defpackage.bwo
    public final bxk g(String str, bxe bxeVar, boolean z, bxj bxjVar) {
        if (z && !this.b) {
            WeakHashMap weakHashMap = bwv.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new bwz(str, this, bxeVar, z2, bxjVar);
    }

    @Override // defpackage.bxk
    public final bxe i() {
        return bxd.a;
    }

    @Override // defpackage.bxk
    public final bxk k(String str, bxe bxeVar, bxj bxjVar) {
        WeakHashMap weakHashMap = bwv.a;
        return g(str, bxeVar, true, bxjVar);
    }

    public bwz(UUID uuid, String str, String str2, bxe bxeVar, Exception exc, boolean z, bxj bxjVar) {
        super("<missing root>:".concat(String.valueOf(str2)), uuid, str, bxe.a(bxeVar, bxd.b), bxjVar);
        this.a = exc;
        this.b = z;
    }

    @Override // defpackage.bxk
    public final void j() {
    }
}
