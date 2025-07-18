package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csl extends crt {
    private final Object e;

    public csl(cxb cxbVar, Object obj) {
        super(Collections.EMPTY_LIST);
        this.d = cxbVar;
        this.e = obj;
    }

    @Override // defpackage.crt
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.crt
    public final Object e() {
        cxb cxbVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return cxbVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.crt
    public final Object f(cwz cwzVar, float f) {
        return e();
    }

    @Override // defpackage.crt
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.crt
    public final void j(float f) {
        this.c = f;
    }
}
