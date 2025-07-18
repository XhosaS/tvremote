package defpackage;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojg extends oml {
    public final yzq a;
    public final yzq b;
    public final yyk c;
    public final yyr d;

    public ojg(yzq yzqVar, yzq yzqVar2, yyk yykVar, yyr yyrVar) {
        this.a = yzqVar;
        this.b = yzqVar2;
        this.c = yykVar;
        this.d = yyrVar;
    }

    @Override // defpackage.oml
    public final omk a() {
        return new ojf(this);
    }

    @Override // defpackage.oml
    public final yyk b() {
        return this.c;
    }

    @Override // defpackage.oml
    public final yyr c() {
        return this.d;
    }

    @Override // defpackage.oml
    public final yzq d() {
        return this.a;
    }

    @Override // defpackage.oml
    public final yzq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oml) {
            oml omlVar = (oml) obj;
            if (this.a.equals(omlVar.d()) && this.b.equals(omlVar.e()) && Lists.d(this.c, omlVar.b()) && zbk.e(this.d, omlVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Sets.a(this.d.entrySet());
    }

    public final String toString() {
        yyr yyrVar = this.d;
        yyk yykVar = this.c;
        yzq yzqVar = this.b;
        return "SyncResult{changedElementKeys=" + String.valueOf(this.a) + ", uploadedElementKeys=" + String.valueOf(yzqVar) + ", failures=" + String.valueOf(yykVar) + ", idToErrorMap=" + String.valueOf(yyrVar) + "}";
    }
}
