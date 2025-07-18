package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyy extends obi {
    public final boolean a;

    public nyy(boolean z) {
        this.a = z;
    }

    @Override // defpackage.obi
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof obi) {
            obi obiVar = (obi) obj;
            obiVar.b();
            if (this.a == obiVar.a()) {
                obiVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) ^ 375623332) * 1000003;
    }

    public final String toString() {
        return "AccessibilityParameters{checkable=true, checked=" + this.a + ", stateDescription=null}";
    }

    @Override // defpackage.obi
    public final void b() {
    }

    @Override // defpackage.obi
    public final void c() {
    }
}
