package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yjz;
import defpackage.yks;
import defpackage.zx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WrapContentElement extends bzi<zx> {
    private final yjz a;
    private final Object b;
    private final int c;

    public WrapContentElement(int i, yjz yjzVar, Object obj) {
        this.c = i;
        this.a = yjzVar;
        this.b = obj;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new zx(this.c, this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        zx zxVar = (zx) bkoVar;
        zxVar.b = this.c;
        zxVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.c == wrapContentElement.c && yks.e(this.b, wrapContentElement.b);
    }

    public final int hashCode() {
        int i = this.c;
        a.bw(i);
        return (((i * 31) + 1237) * 31) + this.b.hashCode();
    }
}
