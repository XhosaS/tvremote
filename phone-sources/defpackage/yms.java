package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yms implements ymw {
    public final ymw a;
    public final int b;

    public yms(ymw ymwVar, int i) {
        this.a = ymwVar;
        this.b = i;
    }

    @Override // defpackage.ymw
    public final Iterator a() {
        return new ymr(this, 0);
    }
}
