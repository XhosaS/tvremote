package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyc extends kyd {
    private final kyo a;

    public kyc(kyo kyoVar) {
        this.a = kyoVar;
    }

    @Override // defpackage.kyp
    public final int b() {
        return 2;
    }

    @Override // defpackage.kyd, defpackage.kyp
    public final kyo d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kyp) {
            kyp kypVar = (kyp) obj;
            if (kypVar.b() == 2 && this.a.equals(kypVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlaybackAction{trailer=" + this.a.toString() + "}";
    }
}
