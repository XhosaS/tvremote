package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erc implements erq {
    private final List a;

    public erc(List list) {
        this.a = list;
    }

    @Override // defpackage.erq
    public final ezz a() {
        return new eun(new erp(), this.a);
    }

    @Override // defpackage.erq
    public final ezz b(erm ermVar, erl erlVar) {
        return new eun(new erp(ermVar, erlVar), this.a);
    }
}
