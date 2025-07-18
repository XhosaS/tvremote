package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjv extends ContextWrapper {
    static final hkh a = new hjq();
    public final List b;
    public final Map c;
    public final int d;
    public final hok e;
    public final hfx f;
    public final hju g;
    public final moz h;
    private final hwj i;
    private hvc j;

    public hjv(Context context, hok hokVar, hwj hwjVar, hju hjuVar, Map map, List list, moz mozVar, hfx hfxVar, int i) {
        super(context.getApplicationContext());
        this.e = hokVar;
        this.g = hjuVar;
        this.b = list;
        this.c = map;
        this.h = mozVar;
        this.f = hfxVar;
        this.d = i;
        this.i = new hwi(hwjVar);
    }

    public final synchronized hvc a() {
        if (this.j == null) {
            hvc hvcVar = new hvc();
            hvcVar.I();
            this.j = hvcVar;
        }
        return this.j;
    }

    public final mta b() {
        return (mta) this.i.a();
    }
}
