package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class see extends sef {
    private final int a;

    public see(int i) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof see) && this.a == ((see) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AudioRequestInjectionClient(clientInfo=" + ((Object) sgn.a(this.a)) + ")";
    }
}
