package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gdw extends gdq {
    final gdk a;
    private final gdp b;
    private final List c;
    private final int i;
    private boolean f = false;
    private boolean e = false;
    private boolean g = false;
    private int h = 1;
    private final List d = new ArrayList();

    public gdw(gdp gdpVar, int i, gdk gdkVar, List list) {
        this.b = gdpVar;
        this.c = list;
        this.i = i;
        this.a = gdkVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.d.add(new gdl(gdkVar));
        }
    }

    @Override // defpackage.gdq
    public final gdp a() {
        return this.b;
    }

    @Override // defpackage.gdq
    public final gdq b() {
        gdk gdkVar = this.a;
        gdk gdkVar2 = new gdk(new ArrayList(gdkVar.a), new ArrayList(gdkVar.b));
        Object objClone = this.b.clone();
        return new gdw((gdp) objClone, this.i, gdkVar2, new ArrayList(this.c));
    }

    @Override // defpackage.gdq
    public final List c() {
        g();
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                break;
            }
            Color color = (Color) ((gdl) list.get(i)).a();
            if (color != null) {
                arrayList.add(color);
                z = false;
            } else {
                arrayList.add(Color.valueOf(-16777216));
            }
            i++;
        }
        if (!z || !this.f) {
            return arrayList;
        }
        this.f = false;
        return null;
    }

    @Override // defpackage.gdq
    public final void d() {
        this.f = true;
        this.e = true;
        g();
    }

    @Override // defpackage.gdq
    public final void e() {
        this.f = true;
        this.g = true;
        this.e = true;
        g();
    }

    @Override // defpackage.gdq
    public final boolean f() {
        int i = 0;
        if (this.g) {
            return false;
        }
        this.e = false;
        this.f = false;
        int i2 = this.h;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                return true;
            }
            ((gdl) list.get(i)).b = ((int[]) this.c.get(i2))[i];
            i++;
        }
    }

    public final void g() {
        if (this.e) {
            List list = this.d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((gdl) it.next()).a) {
                    return;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((gdl) it2.next()).b = 0;
            }
            this.e = false;
        }
    }
}
