package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iym extends sbt {
    public final iye a;
    public final Map b;
    public final int c;

    public /* synthetic */ iym(iye iyeVar, int i, int i2) {
        i = (i2 & 2) != 0 ? 2 : i;
        if (i == 0) {
            throw null;
        }
        this.a = iyeVar;
        this.c = i;
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.sbt
    protected void e() {
        y(ixv.class, new ale(this, (yih) null, 8));
    }

    public final void f(rrx rrxVar, Object obj) {
        obj.getClass();
        this.b.put(rrxVar, obj);
    }
}
