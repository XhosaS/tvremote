package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class au {
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList p;
    ArrayList q;
    ArrayList s;
    final ArrayList d = new ArrayList();
    boolean r = false;

    public void f(int i, q qVar, String str) {
        throw null;
    }

    final void h(at atVar) {
        this.d.add(atVar);
        atVar.d = this.e;
        atVar.e = this.f;
        atVar.f = this.g;
        atVar.g = this.h;
    }

    public final void i() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
    }
}
