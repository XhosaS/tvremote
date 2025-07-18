package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eam extends eaj {
    private final List a;
    private final eai b;
    private final HashSet c = new HashSet();
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private dzb g;

    public eam(List list) {
        this.a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty binding parallel");
        }
        this.b = new eal(this);
    }

    @Override // defpackage.eah
    public final void c(ArrayList arrayList) {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((eah) list.get(i)).c(arrayList);
        }
    }

    @Override // defpackage.eah
    public final void f() {
        if (this.f) {
            this.f = false;
            this.g = null;
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                eah eahVar = (eah) list.get(i);
                if (eahVar.g()) {
                    eahVar.f();
                }
            }
        }
    }

    @Override // defpackage.eah
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.eah
    public final void h(dzb dzbVar) {
        if (this.e) {
            throw new RuntimeException("Starting binding multiple times");
        }
        this.e = true;
        this.g = dzbVar;
        if (!l()) {
            i();
            return;
        }
        k();
        this.f = true;
        List list = this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((eah) it.next()).b(this.b);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((eah) list.get(i)).h(this.g);
        }
        list.size();
    }

    public final void m(eah eahVar) {
        HashSet hashSet = this.c;
        if (hashSet.contains(eahVar)) {
            throw new RuntimeException("Binding unexpectedly completed twice");
        }
        hashSet.add(eahVar);
        this.d++;
        eahVar.d(this.b);
        if (this.d >= this.a.size()) {
            this.f = false;
            j();
        }
    }
}
