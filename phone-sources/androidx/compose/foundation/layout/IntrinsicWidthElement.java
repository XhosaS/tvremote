package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.ys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicWidthElement extends bzi<ys> {
    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ys();
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ys ysVar = (ys) bkoVar;
        ysVar.b = 2;
        ysVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        a.bw(2);
        return 1293;
    }
}
