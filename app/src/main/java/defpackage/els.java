package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class els {
    public final elu a;
    public final List b;
    public emm c;

    public els(elu eluVar) {
        new wr(10);
        this.b = new ArrayList();
        new HashSet();
        this.a = eluVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final emm a(emn emnVar) {
        emm emmVar = new emm(emnVar, this, emnVar.b());
        if (emnVar instanceof eml) {
            this.a.u((eml) emnVar);
            this.c = emmVar;
        }
        this.b.add(emmVar);
        return emmVar;
    }

    public final Object b(long j) {
        return this.a.l(j);
    }
}
