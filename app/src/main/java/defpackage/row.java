package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class row extends rpg {
    private final String a;
    private final String b;

    public row(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null value");
        }
        this.b = str2;
    }

    @Override // defpackage.rpg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.rpg
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rpg) {
            rpg rpgVar = (rpg) obj;
            if (this.a.equals(rpgVar.a()) && this.b.equals(rpgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Tag{tag=" + this.a + ", value=" + this.b + "}";
    }
}
