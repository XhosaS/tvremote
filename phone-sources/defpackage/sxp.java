package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sxp {
    protected sxq j;
    protected final List k = new ArrayList();

    protected sxp(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new sxn());
        }
    }

    protected static final float g(int i, int i2, int i3) {
        return cmq.k((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void b(gku gkuVar);

    public abstract void c();

    public abstract void e();

    public abstract void f();
}
