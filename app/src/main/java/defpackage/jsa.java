package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsa extends jsd {
    public final Object a;
    private final jse b;

    public jsa(Object obj, jse jseVar) {
        this.a = obj;
        this.b = jseVar;
    }

    @Override // defpackage.jsd
    public final jse a() {
        return this.b;
    }

    @Override // defpackage.jsd
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsd) {
            jsd jsdVar = (jsd) obj;
            jsdVar.c();
            if (this.a.equals(jsdVar.b())) {
                jsdVar.e();
                if (this.b.equals(jsdVar.a())) {
                    jsdVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ 1) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a.toString() + ", priority=DEFAULT, productData=" + this.b.toString() + ", eventContext=null}";
    }

    @Override // defpackage.jsd
    public final void c() {
    }

    @Override // defpackage.jsd
    public final void d() {
    }

    @Override // defpackage.jsd
    public final void e() {
    }
}
