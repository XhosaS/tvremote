package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class wty extends wsn {
    private final wwc a;

    public wty(String str, wwq wwqVar, wwc wwcVar, wwl wwlVar) {
        super(str, wwqVar, wwlVar);
        yqw.A(wwcVar.e);
        this.a = wwcVar;
    }

    @Override // defpackage.wwq
    public wvy j(wvz wvzVar) {
        return wwc.i(wvzVar, k());
    }

    @Override // defpackage.wwq
    public wwc k() {
        return wwc.d(this.a, n());
    }

    public wty(String str, UUID uuid, String str2, wwc wwcVar, wwl wwlVar) {
        super(str, uuid, str2, wwlVar);
        yqw.A(wwcVar.e);
        this.a = wwcVar;
    }
}
