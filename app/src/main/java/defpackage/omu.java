package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class omu extends omw {
    private final String a;
    private final yqt b;

    public omu(String str, yqt yqtVar) {
        this.a = str;
        this.b = yqtVar;
    }

    @Override // defpackage.omw
    public final yqt a() {
        return this.b;
    }

    @Override // defpackage.omw
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof omw) {
            omw omwVar = (omw) obj;
            if (this.a.equals(omwVar.b()) && this.b.equals(omwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ElementId{key=" + this.a + ", timestampMicros=" + String.valueOf(this.b) + "}";
    }
}
