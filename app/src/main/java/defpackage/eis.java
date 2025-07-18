package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eis {
    public egy b;
    public dru d;
    public boolean e;
    public boolean f;
    public dvn m;
    public tll p;
    public float a = 4.0f;
    public ebc c = ebc.m;
    public final ehr q = eiz.J;
    public boolean g = true;
    public boolean h = ebc.d;
    public int i = -1;
    public boolean j = ebc.c;
    public boolean k = true;
    public boolean l = false;
    public boolean n = false;
    public boolean o = false;

    public final eiz a(dru druVar) {
        ComponentTree componentTree;
        ComponentTree componentTree2;
        this.d = dru.c(druVar);
        if (this.m == null) {
            String str = ComponentTree.a;
            ComponentTree componentTree3 = druVar.h;
            this.m = componentTree3 == null ? null : componentTree3.c;
        }
        boolean z = false;
        this.g = this.g && ((componentTree2 = druVar.h) == null || componentTree2.o);
        boolean z2 = ebc.a;
        if (this.k && ((componentTree = druVar.h) == null || componentTree.p)) {
            z = true;
        }
        this.k = z;
        if (this.b == null) {
            this.b = new ehb(1);
        }
        return new eiz(this);
    }
}
