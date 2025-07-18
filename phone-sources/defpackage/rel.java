package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rel {
    public final int a;
    public final int b;
    public final int c;

    public rel() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rel) {
            rel relVar = (rel) obj;
            if (this.a == relVar.a && this.b == relVar.b && this.c == relVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "CardVisualElementsInfo{cardCellId=" + this.a + ", cardMainActionId=" + this.b + ", cardSecondaryActionId=" + this.c + "}";
    }

    public rel(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
