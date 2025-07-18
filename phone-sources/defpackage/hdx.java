package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdx extends hdg {
    private final Object e;

    public hdx(hhu hhuVar) {
        this(hhuVar, null);
    }

    @Override // defpackage.hdg
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.hdg
    public final Object e() {
        hhu hhuVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return hhuVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.hdg
    public final Object f(hhs hhsVar, float f) {
        return e();
    }

    @Override // defpackage.hdg
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.hdg
    public final void j(float f) {
        this.c = f;
    }

    public hdx(hhu hhuVar, Object obj) {
        super(Collections.EMPTY_LIST);
        this.d = hhuVar;
        this.e = obj;
    }
}
