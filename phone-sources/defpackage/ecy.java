package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecy {
    public final Object a;
    public boolean b;
    public boolean c;
    public rin d = new rin(null, null);

    public ecy(Object obj) {
        this.a = obj;
    }

    public final void a(ecx ecxVar) {
        this.c = true;
        if (this.b) {
            this.b = false;
            ecxVar.a(this.a, this.d.i());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ecy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
