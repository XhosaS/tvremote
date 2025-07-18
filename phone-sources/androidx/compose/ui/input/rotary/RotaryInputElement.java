package androidx.compose.ui.input.rotary;

import defpackage.bko;
import defpackage.btw;
import defpackage.bzi;
import defpackage.yjv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RotaryInputElement extends bzi<btw> {
    private final yjv a;
    private final yjv b = null;

    public RotaryInputElement(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new btw(this.a);
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
        ((btw) bkoVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (this.a != rotaryInputElement.a) {
            return false;
        }
        yjv yjvVar = rotaryInputElement.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
