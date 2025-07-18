package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lp extends lr implements Iterator {
    final /* synthetic */ ls a;
    private lo b;
    private boolean c = true;

    public lp(ls lsVar) {
        this.a = lsVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        lo loVar;
        if (this.c) {
            this.c = false;
            loVar = this.a.b;
        } else {
            lo loVar2 = this.b;
            loVar = loVar2 != null ? loVar2.c : null;
        }
        this.b = loVar;
        return this.b;
    }

    @Override // defpackage.lr
    public final void aG(lo loVar) {
        lo loVar2 = this.b;
        if (loVar == loVar2) {
            lo loVar3 = loVar2.d;
            this.b = loVar3;
            this.c = loVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        lo loVar = this.b;
        return (loVar == null || loVar.c == null) ? false : true;
    }
}
