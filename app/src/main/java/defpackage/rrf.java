package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rrf extends rrm {
    public final ListIterator a;
    public final yqt b;
    public final int c;

    public rrf(ListIterator listIterator, int i, yqt yqtVar) {
        if (listIterator == null) {
            throw new NullPointerException("Null iterator");
        }
        this.a = listIterator;
        this.c = i;
        this.b = yqtVar;
    }

    @Override // defpackage.rrm
    public final yqt a() {
        return this.b;
    }

    @Override // defpackage.rrm
    public final ListIterator b() {
        return this.a;
    }

    @Override // defpackage.rrm
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrm) {
            rrm rrmVar = (rrm) obj;
            if (this.a.equals(rrmVar.b()) && this.c == rrmVar.c() && this.b.equals(rrmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.c;
        return "StoreInsertionStatus{iterator=" + this.a.toString() + ", status=" + (i != 1 ? "INVALID_START" : "VALID") + ", endEvent=" + this.b.toString() + "}";
    }
}
