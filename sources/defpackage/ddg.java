package defpackage;

import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddg extends czr {
    final Hashtable a;
    final dag b;

    public ddg(ddm ddmVar) {
        Hashtable hashtable = new Hashtable();
        this.a = hashtable;
        this.b = new dbk(ddmVar);
        hashtable.put(ddmVar, ddmVar);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.b;
    }
}
