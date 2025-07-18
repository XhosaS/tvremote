package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gdo {
    public boolean a;
    public int b;
    private gdn d;
    private final gdk e;
    private Iterator h;
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private gdm c = new gdm(new ArrayList(), 0);

    public gdo(gdk gdkVar) {
        this.e = gdkVar;
        gdkVar.a.add(this.c);
        for (gdm gdmVar : gdkVar.a) {
            this.f.put(Integer.valueOf(gdmVar.b), gdmVar);
        }
        for (gdn gdnVar : this.e.b) {
            this.g.put(new Pair(Integer.valueOf(gdnVar.b), Integer.valueOf(gdnVar.c)), gdnVar);
        }
    }

    public final Object a() {
        if (!this.a) {
            int i = this.b;
            int i2 = this.c.b;
            if (i != i2) {
                gdn gdnVar = (gdn) this.g.get(new Pair(Integer.valueOf(i2), Integer.valueOf(this.b)));
                this.d = gdnVar;
                this.c = null;
                this.a = true;
                this.h = gdnVar.a.iterator();
            } else if (i2 == 0) {
                return null;
            }
        }
        Object next = this.h.next();
        if (!this.h.hasNext()) {
            if (this.a) {
                gdm gdmVar = (gdm) this.f.get(Integer.valueOf(this.d.c));
                this.c = gdmVar;
                this.d = null;
                this.a = false;
                this.h = gdmVar.a.iterator();
                return next;
            }
            this.h = this.c.a.iterator();
        }
        return next;
    }
}
