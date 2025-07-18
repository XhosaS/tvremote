package androidx.compose.foundation.layout;

import defpackage.bko;
import defpackage.bzi;
import defpackage.yks;
import defpackage.yy;
import defpackage.zc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingValuesElement extends bzi<zc> {
    private final yy a;

    public PaddingValuesElement(yy yyVar) {
        this.a = yyVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new zc(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((zc) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return yks.e(this.a, paddingValuesElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
