package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cyk extends ContextWrapper {
    static final czc a = new cyf();
    public final ddx b;
    public final List c;
    public final Map d;
    public final dcy e;
    public final cym f;
    public final int g;
    private final dqe h;
    private dor i;

    public cyk(Context context, ddx ddxVar, dqe dqeVar, Map map, List list, dcy dcyVar, cym cymVar) {
        super(context.getApplicationContext());
        this.b = ddxVar;
        this.c = list;
        this.d = map;
        this.e = dcyVar;
        this.f = cymVar;
        this.g = 4;
        this.h = new dqd(dqeVar);
    }

    public final cyt a() {
        return (cyt) this.h.a();
    }

    public final synchronized dor b() {
        if (this.i == null) {
            dor dorVar = new dor();
            dorVar.r = true;
            this.i = dorVar;
        }
        return this.i;
    }
}
