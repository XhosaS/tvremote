package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gos {
    private boolean a;
    private gvm b = new gvm((byte[]) null);
    private int d = 1;
    private final Set c = new LinkedHashSet();

    public final gou a() {
        return new gou(this.b, this.d, this.a, false, false, false, -1L, -1L, yfm.aq(this.c));
    }

    public final void b() {
        this.a = true;
    }

    public final void c(int i) {
        this.d = i;
        this.b = new gvm((byte[]) null);
    }
}
