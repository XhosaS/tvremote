package androidx.compose.ui.input.key;

import defpackage.bko;
import defpackage.brz;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KeyInputElement extends bzi<brz> {
    private final yjv a;
    private final yjv b;

    public KeyInputElement(yjv yjvVar, yjv yjvVar2) {
        this.a = yjvVar;
        this.b = yjvVar2;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new brz(this.a, this.b);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        brz brzVar = (brz) bkoVar;
        brzVar.a = this.a;
        brzVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.a == keyInputElement.a && this.b == keyInputElement.b;
    }

    public final int hashCode() {
        yjv yjvVar = this.a;
        int iHashCode = yjvVar != null ? yjvVar.hashCode() : 0;
        yjv yjvVar2 = this.b;
        return (iHashCode * 31) + (yjvVar2 != null ? yjvVar2.hashCode() : 0);
    }
}
