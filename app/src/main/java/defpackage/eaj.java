package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class eaj implements eah {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private Object b;

    @Override // defpackage.eah
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.eah
    public final void b(eai eaiVar) {
        this.a.add(eaiVar);
    }

    @Override // defpackage.eah
    public final void d(eai eaiVar) {
        this.a.remove(eaiVar);
    }

    @Override // defpackage.eah
    public final void e(Object obj) {
        this.b = obj;
    }

    final void i() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((eai) copyOnWriteArrayList.get(size)).a(this);
            }
        }
    }

    public final void j() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((eai) copyOnWriteArrayList.get(size)).b(this);
            }
        }
    }

    final void k() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((eai) copyOnWriteArrayList.get(size)).c(this);
            }
        }
    }

    final boolean l() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        int size = copyOnWriteArrayList.size();
        do {
            size--;
            if (size < 0) {
                return true;
            }
        } while (((eai) copyOnWriteArrayList.get(size)).d(this));
        return false;
    }
}
