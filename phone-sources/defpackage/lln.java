package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lln extends lls {
    private final boolean a;

    public lln(boolean z) {
        this.a = z;
    }

    @Override // defpackage.lls
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lls) && this.a == ((lls) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }
}
