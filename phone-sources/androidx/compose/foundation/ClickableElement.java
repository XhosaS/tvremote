package androidx.compose.foundation;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.cez;
import defpackage.kw;
import defpackage.qv;
import defpackage.rs;
import defpackage.yjk;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClickableElement extends bzi<qv> {
    private final rs a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final cez e;
    private final yjk f;
    private final kw h;

    public ClickableElement(kw kwVar, rs rsVar, boolean z, boolean z2, String str, cez cezVar, yjk yjkVar) {
        this.h = kwVar;
        this.a = rsVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = cezVar;
        this.f = yjkVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new qv(this.h, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((qv) bkoVar).C(this.h, this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return yks.e(this.h, clickableElement.h) && yks.e(this.a, clickableElement.a) && this.b == clickableElement.b && this.c == clickableElement.c && yks.e(this.d, clickableElement.d) && yks.e(this.e, clickableElement.e) && this.f == clickableElement.f;
    }

    public final int hashCode() {
        kw kwVar = this.h;
        int iHashCode = kwVar != null ? kwVar.hashCode() : 0;
        rs rsVar = this.a;
        int iHashCode2 = rsVar != null ? rsVar.hashCode() : 0;
        int i = iHashCode * 31;
        boolean z = this.b;
        boolean z2 = this.c;
        String str = this.d;
        int iQ = (((((((i + iHashCode2) * 31) + a.q(z)) * 31) + a.q(z2)) * 31) + (str != null ? str.hashCode() : 0)) * 31;
        cez cezVar = this.e;
        return ((iQ + (cezVar != null ? cezVar.a : 0)) * 31) + this.f.hashCode();
    }
}
