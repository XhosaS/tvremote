package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class job extends jov {
    public final int a;
    public final String b;

    public job(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.jov
    public final int a() {
        return this.a;
    }

    @Override // defpackage.jov
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jov) {
            jov jovVar = (jov) obj;
            if (this.a == jovVar.a()) {
                jovVar.c();
                jovVar.d();
                String str = this.b;
                if (str != null ? str.equals(jovVar.b()) : jovVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.a ^ 1000003) * 583896283);
    }

    public final String toString() {
        return "SharedSearchState{state=" + this.a + ", searchTerm=null, stableText=null, pendingText=" + this.b + "}";
    }

    @Override // defpackage.jov
    public final void c() {
    }

    @Override // defpackage.jov
    public final void d() {
    }
}
