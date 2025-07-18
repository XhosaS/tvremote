package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rdl implements dvw, yko {
    private final /* synthetic */ yjv a;
    private final /* synthetic */ int b;

    public rdl(yjv yjvVar, int i, byte[] bArr) {
        this.b = i;
        this.a = yjvVar;
    }

    @Override // defpackage.yko
    public final yfq b() {
        return this.b != 0 ? this.a : this.a;
    }

    @Override // defpackage.dvw
    public final /* synthetic */ void dV(Object obj) {
        if (this.b != 0) {
            this.a.a(obj);
        } else {
            this.a.a(obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this.b != 0) {
            if ((obj instanceof dvw) && (obj instanceof yko)) {
                return yks.e(this.a, ((yko) obj).b());
            }
            return false;
        }
        if ((obj instanceof dvw) && (obj instanceof yko)) {
            return yks.e(this.a, ((yko) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.b != 0 ? this.a.hashCode() : this.a.hashCode();
    }

    public rdl(yjv yjvVar, int i) {
        this.b = i;
        yjvVar.getClass();
        this.a = yjvVar;
    }
}
