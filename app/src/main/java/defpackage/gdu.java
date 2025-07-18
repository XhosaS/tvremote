package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gdu {
    public final vrm a;
    public List b;
    public gdt c = null;
    public final Map d = new HashMap();
    public boolean e = false;
    public long f;
    public final gdg g;

    public gdu(gdg gdgVar, vrm vrmVar) {
        this.g = gdgVar;
        this.a = vrmVar;
    }

    public final void a(gdq gdqVar) {
        gdt gdtVar = new gdt(gdqVar);
        gdp gdpVar = gdtVar.b;
        Map map = this.d;
        int i = gdpVar.b;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, gdtVar);
        if (this.e) {
            gdt gdtVar2 = this.c;
            if (gdtVar2 == null) {
                if (d()) {
                    this.a.post(new gdr(this));
                    return;
                }
                return;
            }
            gdp gdpVar2 = gdtVar2.b;
            int i2 = gdpVar2.b;
            if (i2 == i && gdpVar2.a == gdpVar.a && gdtVar2.d == 1) {
                map.remove(numValueOf);
                return;
            }
            if (i2 == i) {
                gdtVar2.a.e();
                gdtVar2.d = 3;
            } else if (i2 > i && gdpVar.a != 0) {
                gdtVar2.a();
            } else if (i2 < i) {
                gdtVar.a();
            }
        }
    }

    public final void b() {
        this.a.post(new Runnable() { // from class: gds
            @Override // java.lang.Runnable
            public final void run() {
                gdu gduVar = this.a;
                gduVar.e = true;
                if (gduVar.c == null && gduVar.d()) {
                    gduVar.a.post(new gdr(gduVar));
                } else {
                    gduVar.g.a();
                }
            }
        });
    }

    public final boolean c() {
        gdt gdtVar = this.c;
        if (gdtVar == null) {
            return false;
        }
        List listC = gdtVar.a.c();
        if (listC == null) {
            if (gdtVar.d == 1) {
                gdtVar.d = 3;
            }
            listC = null;
        }
        this.b = listC;
        if (listC != null) {
            return true;
        }
        gdt gdtVar2 = this.c;
        int i = gdtVar2.b.b;
        if (gdtVar2.d == 2) {
            Map map = this.d;
            Integer numValueOf = Integer.valueOf(i);
            if (map.get(numValueOf) == null) {
                map.put(numValueOf, this.c);
            }
        }
        this.c = null;
        if (d()) {
            return c();
        }
        return false;
    }

    public final boolean d() {
        int i = 0;
        while (true) {
            if (i <= 10000) {
                gdt gdtVar = (gdt) this.d.get(Integer.valueOf(i));
                if (gdtVar != null && gdtVar.a.f()) {
                    gdtVar.d = 1;
                    this.c = gdtVar;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (this.c == null) {
            return false;
        }
        this.f = SystemClock.elapsedRealtime();
        return true;
    }
}
