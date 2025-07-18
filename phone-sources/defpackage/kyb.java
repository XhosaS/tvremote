package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyb extends kyd {
    private final kyn a;

    public kyb(kyn kynVar) {
        this.a = kynVar;
    }

    @Override // defpackage.kyp
    public final int b() {
        return 1;
    }

    @Override // defpackage.kyd, defpackage.kyp
    public final kyn c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kyp) {
            kyp kypVar = (kyp) obj;
            if (kypVar.b() == 1 && this.a.equals(kypVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlaybackAction{movie=" + this.a.toString() + "}";
    }
}
