package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynb implements ymw {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public ynb(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // defpackage.ymw
    public final Iterator a() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? new yne(this) : new ync(this) : new ymv(this) : new yna(this, 0);
    }

    public ynb(ymw ymwVar, yjv yjvVar, int i) {
        this.c = i;
        this.a = ymwVar;
        this.b = yjvVar;
    }
}
