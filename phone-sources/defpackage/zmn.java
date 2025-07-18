package defpackage;

import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmn extends zix {
    final Hashtable a;
    final zjm b;

    public zmn(zmt zmtVar) {
        Hashtable hashtable = new Hashtable();
        this.a = hashtable;
        this.b = new zkq(zmtVar);
        hashtable.put(zmtVar, zmtVar);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.b;
    }
}
