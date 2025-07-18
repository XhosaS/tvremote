package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zd extends zc {
    public int m;

    public zd(zn znVar) {
        super(znVar);
        this.l = true != (znVar instanceof zi) ? 3 : 2;
    }

    @Override // defpackage.zc
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((za) it.next()).f();
        }
    }
}
