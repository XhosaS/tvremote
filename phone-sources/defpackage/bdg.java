package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdg implements Iterable, bjs, yli {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public HashMap i;
    public jc j;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public final int a(bac bacVar) {
        if (this.f) {
            bau.i("Use active SlotWriter to determine anchor location instead");
        }
        if (!bacVar.a()) {
            bcm.a("Anchor refers to a group that was removed");
        }
        return bacVar.a;
    }

    public final bdf b() {
        if (this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new bdf(this);
    }

    public final bdj c() {
        if (this.f) {
            bau.i("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            bau.i("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new bdj(this);
    }

    public final void d() {
        this.j = new jc((byte[]) null);
    }

    public final void e() {
        this.i = new HashMap();
    }

    public final boolean f(bac bacVar) {
        int iD;
        return bacVar.a() && (iD = bdi.d(this.h, bacVar.a, this.b)) >= 0 && yks.e(this.h.get(iD), bacVar);
    }

    public final void g(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap map, jc jcVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = map;
        this.j = jcVar;
    }

    public final bcm h(int i) {
        int i2;
        HashMap map = this.i;
        if (map != null) {
            if (this.f) {
                bau.i("use active SlotWriter to crate an anchor for location instead");
            }
            bac bacVarF = (i < 0 || i >= (i2 = this.b)) ? null : bdi.f(this.h, i, i2);
            if (bacVarF != null) {
                return (bcm) map.get(bacVarF);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bbp(this, 0, this.b);
    }
}
