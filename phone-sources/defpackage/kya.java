package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kya extends kyd {
    private final kym a;

    public kya(kym kymVar) {
        this.a = kymVar;
    }

    @Override // defpackage.kyd, defpackage.kyp
    public final kym a() {
        return this.a;
    }

    @Override // defpackage.kyp
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kyp) {
            kyp kypVar = (kyp) obj;
            if (kypVar.b() == 3 && this.a.equals(kypVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlaybackAction{episode=" + this.a.toString() + "}";
    }
}
