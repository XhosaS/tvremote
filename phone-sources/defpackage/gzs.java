package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzs {
    public Object a;
    public hal b;
    public Boolean c;
    public int d;
    public int e;
    private final Context f;
    private gzo g;
    private final List h;
    private final Map i;
    private hak j;
    private dve k;
    private hak l;
    private int m;
    private final hfw n;
    private final upq o;

    public gzs(Context context) {
        context.getClass();
        this.f = context;
        this.g = har.a;
        this.a = null;
        this.b = null;
        this.d = 0;
        this.h = yhb.a;
        this.o = null;
        this.i = null;
        this.c = null;
        this.n = null;
        this.j = null;
        this.e = 0;
        this.k = null;
        this.l = null;
        this.m = 0;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Map] */
    public final gzu a() {
        boolean z;
        dve dveVar;
        hak hakVar;
        int i;
        haa haaVar;
        Object obj = this.a;
        if (obj == null) {
            obj = gzw.a;
        }
        Object obj2 = obj;
        hal halVar = this.b;
        gzo gzoVar = this.g;
        Bitmap.Config config = gzoVar.f;
        int i2 = this.d;
        if (i2 == 0) {
            int i3 = gzoVar.j;
            i2 = 3;
        }
        int i4 = i2;
        List list = this.h;
        han hanVar = gzoVar.e;
        upq upqVar = this.o;
        zcc zccVarT = upqVar != null ? upqVar.t() : null;
        Bitmap.Config config2 = hat.a;
        if (zccVarT == null) {
            zccVarT = hat.b;
        }
        zcc zccVar = zccVarT;
        Map map = this.i;
        had hadVar = map != null ? new had(hjs.A(map)) : null;
        if (hadVar == null) {
            hadVar = had.a;
        }
        had hadVar2 = hadVar;
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        Context context = this.f;
        gzo gzoVar2 = this.g;
        gzn gznVar = gzoVar2.g;
        gzn gznVar2 = gzoVar2.h;
        gzn gznVar3 = gzoVar2.i;
        yot yotVar = gzoVar2.a;
        yot yotVar2 = gzoVar2.b;
        yot yotVar3 = gzoVar2.c;
        yot yotVar4 = gzoVar2.d;
        dve lifecycle = this.k;
        if (lifecycle == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof dvk) {
                    lifecycle = ((dvk) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = gzr.b;
            }
        }
        hak hakVar2 = this.j;
        if (hakVar2 == null) {
            dveVar = lifecycle;
            hak hagVar = this.l;
            if (hagVar == null) {
                hagVar = new hag(context);
            }
            hakVar = hagVar;
        } else {
            dveVar = lifecycle;
            hakVar = hakVar2;
        }
        int i5 = this.e;
        if (i5 == 0 && (i5 = this.m) == 0) {
            if ((hakVar2 instanceof hai ? (hai) hakVar2 : null) != null) {
                throw null;
            }
            i5 = 2;
        }
        hfw hfwVar = this.n;
        if (hfwVar != null) {
            i = i5;
            haaVar = new haa(hjs.A(hfwVar.a));
        } else {
            i = i5;
            haaVar = null;
        }
        if (haaVar == null) {
            haaVar = haa.a;
        }
        return new gzu(context, obj2, halVar, config, i4, list, hanVar, zccVar, hadVar2, z2, gznVar, gznVar2, gznVar3, yotVar, yotVar2, yotVar3, yotVar4, dveVar, hakVar, i, haaVar, new gzp(this.j, this.e, this.d, this.c), this.g);
    }

    public final void b() {
        this.k = null;
        this.l = null;
        this.m = 0;
    }

    public final void c(gzo gzoVar) {
        this.g = gzoVar;
        this.m = 0;
    }

    public final void d(hak hakVar) {
        hakVar.getClass();
        this.j = hakVar;
        b();
    }

    public gzs(gzu gzuVar, Context context) {
        int i;
        this.f = context;
        this.g = gzuVar.x;
        this.a = gzuVar.b;
        this.b = gzuVar.c;
        this.d = gzuVar.w.d;
        this.h = gzuVar.e;
        this.o = gzuVar.g.f();
        this.i = yfm.m(gzuVar.h.b);
        this.c = gzuVar.w.b;
        this.n = new hfw(gzuVar.v);
        gzp gzpVar = gzuVar.w;
        this.j = gzpVar.a;
        this.e = gzpVar.c;
        if (gzuVar.a == context) {
            this.k = gzuVar.t;
            this.l = gzuVar.u;
            i = gzuVar.z;
        } else {
            this.k = null;
            this.l = null;
            i = 0;
        }
        this.m = i;
    }
}
