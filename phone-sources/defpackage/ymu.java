package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymu implements ymw {
    public final ymw a;
    public final boolean b;
    public final yjv c;

    public ymu(ymw ymwVar, boolean z, yjv yjvVar) {
        this.a = ymwVar;
        this.b = z;
        this.c = yjvVar;
    }

    @Override // defpackage.ymw
    public final Iterator a() {
        return new yna(this, 1);
    }
}
