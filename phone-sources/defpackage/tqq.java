package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqq {
    int a;
    final int b;
    tqq c;
    final Map d = new HashMap(0);

    public tqq(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        return "Node" + System.identityHashCode(this);
    }
}
