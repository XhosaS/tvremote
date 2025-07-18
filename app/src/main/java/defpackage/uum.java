package defpackage;

import com.google.common.collect.Lists;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uum extends uur {
    public final String a;
    public final yyk c;
    private final String d = "refinement_row";
    private final awp e;
    private final azn f;

    public uum(String str, yyk yykVar, awp awpVar, azn aznVar) {
        this.a = str;
        this.c = yykVar;
        this.e = awpVar;
        this.f = aznVar;
    }

    @Override // defpackage.uur
    public final awp a() {
        return this.e;
    }

    @Override // defpackage.uur
    public final azn b() {
        return this.f;
    }

    @Override // defpackage.uur
    public final yyk c() {
        return this.c;
    }

    @Override // defpackage.uur
    public final String d() {
        return this.d;
    }

    @Override // defpackage.uur
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uur) {
            uur uurVar = (uur) obj;
            if (this.d.equals(uurVar.d()) && this.a.equals(uurVar.e()) && Lists.d(this.c, uurVar.c()) && this.e.equals(uurVar.a()) && this.f.equals(uurVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        azn aznVar = this.f;
        awp awpVar = this.e;
        return "FilterRow{id=" + this.d + ", rowTitle=" + this.a + ", filters=" + this.c.toString() + ", filterDiffCallback=" + awpVar.toString() + ", filterPresenterSelector=" + aznVar.toString() + "}";
    }
}
