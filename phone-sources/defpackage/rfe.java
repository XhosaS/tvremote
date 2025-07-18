package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfe {
    public final boolean a;

    public rfe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof rfe) && this.a == ((rfe) obj).a;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "Configuration{showSwitchProfileAction=" + this.a + ", disableDecorationFeatures=false}";
    }

    public rfe(boolean z) {
        this.a = z;
    }
}
