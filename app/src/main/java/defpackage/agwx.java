package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwx extends agrh {
    public boolean a;
    private final int b;
    private int c;

    public agwx(int i, int i2) {
        this.b = i2;
        boolean z = i <= i2;
        this.a = z;
        this.c = true != z ? i2 : i;
    }

    @Override // defpackage.agrh
    public final int a() {
        int i = this.c;
        if (i != this.b) {
            this.c = i + 1;
            return i;
        }
        if (!this.a) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }
}
