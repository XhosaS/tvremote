package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hel implements hes {
    public final List a;

    public hel(List list) {
        this.a = list;
    }

    @Override // defpackage.hes
    public final hdg a() {
        List list = this.a;
        return ((hhs) list.get(0)).e() ? new hdq(list) : new hdp(list);
    }

    @Override // defpackage.hes
    public final List b() {
        return this.a;
    }

    @Override // defpackage.hes
    public final boolean c() {
        List list = this.a;
        return list.size() == 1 && ((hhs) list.get(0)).e();
    }
}
