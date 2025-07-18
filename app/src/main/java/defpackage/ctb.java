package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctb implements ctj {
    public final List a;

    public ctb(List list) {
        this.a = list;
    }

    @Override // defpackage.ctj
    public final crt a() {
        List list = this.a;
        return ((cwz) list.get(0)).e() ? new cse(list) : new csd(list);
    }

    @Override // defpackage.ctj
    public final List b() {
        return this.a;
    }

    @Override // defpackage.ctj
    public final boolean c() {
        List list = this.a;
        return list.size() == 1 && ((cwz) list.get(0)).e();
    }
}
