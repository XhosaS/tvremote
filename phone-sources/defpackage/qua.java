package defpackage;

import com.google.common.collect.Ordering;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qua implements Comparable {
    public final tst a;
    public final tst b;

    public qua() {
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qua quaVar) {
        return Ordering.natural().nullsFirst().compare((Comparable) this.a.f(), (Comparable) quaVar.a.f());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qua) {
            qua quaVar = (qua) obj;
            if (this.a.equals(quaVar.a) && this.b.equals(quaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        tst tstVar = this.b;
        return "DecorationContent{badgeContent=" + String.valueOf(this.a) + ", ringContent=" + String.valueOf(tstVar) + "}";
    }

    public qua(tst tstVar, tst tstVar2) {
        this.a = tstVar;
        this.b = tstVar2;
    }
}
