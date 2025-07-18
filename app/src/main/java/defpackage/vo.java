package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vo extends vq implements Iterator {
    final /* synthetic */ vr a;
    private vn b;
    private boolean c = true;

    public vo(vr vrVar) {
        this.a = vrVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        vn vnVar;
        if (this.c) {
            this.c = false;
            vnVar = this.a.b;
        } else {
            vn vnVar2 = this.b;
            vnVar = vnVar2 != null ? vnVar2.c : null;
        }
        this.b = vnVar;
        return this.b;
    }

    @Override // defpackage.vq
    public final void co(vn vnVar) {
        vn vnVar2 = this.b;
        if (vnVar == vnVar2) {
            vn vnVar3 = vnVar2.d;
            this.b = vnVar3;
            this.c = vnVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        vn vnVar = this.b;
        return (vnVar == null || vnVar.c == null) ? false : true;
    }
}
