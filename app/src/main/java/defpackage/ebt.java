package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebt {
    private static int i;
    public ebu a;
    public double e;
    public final ebs b = new ebs();
    public final ebs c = new ebs();
    public final ebs d = new ebs();
    public boolean f = true;
    public double g = 0.0d;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public ebt() {
        i++;
        this.a = ebu.a;
    }

    public final boolean a() {
        ebs ebsVar = this.b;
        if (Math.abs(ebsVar.b) <= 0.005d) {
            if (Math.abs(this.e - ebsVar.a) <= 0.005d) {
                return true;
            }
            double d = this.a.c;
        }
        return false;
    }

    public final void b(double d) {
        if (this.e == d && a()) {
            return;
        }
        this.e = d;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ebv) it.next()).c();
        }
    }
}
