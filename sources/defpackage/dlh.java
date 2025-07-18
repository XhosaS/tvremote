package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlh implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public dmc a;
    public final int b;
    public int c;
    public int d;
    public boolean e = false;
    public boolean f = false;

    public dlh(int i) {
        this.b = i;
    }

    final int a() {
        if (!this.e || this.f) {
            return Integer.MAX_VALUE;
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dlh clone() {
        dlh dlhVar = new dlh(this.b);
        dlhVar.a = this.a;
        dlhVar.c = this.c;
        dlhVar.d = this.d;
        dlhVar.e = this.e;
        dlhVar.f = this.f;
        return dlhVar;
    }
}
