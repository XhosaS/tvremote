package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ue {
    public boolean c;
    public final List b = new ArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    public ue(boolean z) {
        this.c = z;
    }

    public abstract void b();

    public final void e(boolean z) {
        this.c = z;
        for (bha bhaVar : this.b) {
            bhaVar.a = z;
            bhc bhcVar = bhaVar.b;
            if (bhcVar != null) {
                bhcVar.d();
            }
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(ta taVar) {
    }
}
