package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvd extends wty {
    public static final UUID a;
    public static final String b;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        a = uuidRandomUUID;
        b = wsn.fc(uuidRandomUUID);
    }

    private wvd(wvd wvdVar, String str, wwc wwcVar, wwl wwlVar) {
        super(str, wvdVar, wwcVar, wwlVar);
    }

    @Override // defpackage.wwq
    public final long l() {
        return -1L;
    }

    @Override // defpackage.wwq
    public final wwc n() {
        return wwb.a;
    }

    @Override // defpackage.wwq
    public final wwq q(String str, wwc wwcVar, wwl wwlVar) {
        return new wvd(this, str, wwcVar, wwlVar);
    }

    public wvd(String str, UUID uuid, String str2, wwc wwcVar, wwl wwlVar) {
        super(str, uuid, str2, wwcVar, wwlVar);
    }

    @Override // defpackage.wwq
    public final void r() {
    }

    @Override // defpackage.wwq
    public final void t() {
    }

    @Override // defpackage.wwq
    public final void p(boolean z) {
    }

    @Override // defpackage.wwq
    public final void o(wvz wvzVar, Object obj) {
    }
}
