package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class L0 extends A0 {
    public final Comparator b;
    public boolean c;

    public L0(K0 k0, Comparator comparator) {
        super(k0);
        this.b = comparator;
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final boolean g() {
        this.c = true;
        return false;
    }
}
