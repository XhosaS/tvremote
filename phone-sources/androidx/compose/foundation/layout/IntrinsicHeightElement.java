package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.bko;
import defpackage.bzi;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicHeightElement extends bzi<yq> {
    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new yq();
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        yq yqVar = (yq) bkoVar;
        yqVar.b = 2;
        yqVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null) != null;
    }

    public final int hashCode() {
        a.bw(2);
        return 1293;
    }
}
