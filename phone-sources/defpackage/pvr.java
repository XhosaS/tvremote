package defpackage;

import android.content.Intent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvr {
    public String a;
    public qen b;
    public pvq c;
    public Intent d;
    public vks e;
    public pvu f;
    private int g;
    private List h;
    private vmo i;
    private qrd j;
    private boolean k;
    private byte l;
    private int m;

    public final pvs a() {
        pvq pvqVar;
        List list;
        vmo vmoVar;
        qrd qrdVar;
        pvu pvuVar;
        if (this.l == 3 && this.m != 0 && (pvqVar = this.c) != null && (list = this.h) != null && (vmoVar = this.i) != null && (qrdVar = this.j) != null && (pvuVar = this.f) != null) {
            return new pvs(this.g, this.a, this.b, pvqVar, list, vmoVar, this.d, qrdVar, this.e, this.k, pvuVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.m == 0) {
            sb.append(" source");
        }
        if ((this.l & 1) == 0) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" eventThreadType");
        }
        if (this.h == null) {
            sb.append(" threads");
        }
        if (this.i == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.j == null) {
            sb.append(" localThreadState");
        }
        if ((this.l & 2) == 0) {
            sb.append(" activityLaunched");
        }
        if (this.f == null) {
            sb.append(" removalInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 2);
    }

    public final void c(qrd qrdVar) {
        if (qrdVar == null) {
            throw new NullPointerException("Null localThreadState");
        }
        this.j = qrdVar;
    }

    public final void d(vmo vmoVar) {
        if (vmoVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.i = vmoVar;
    }

    public final void e(int i) {
        this.g = i;
        this.l = (byte) (this.l | 1);
    }

    public final void f() {
        this.m = 1;
    }

    public final void g(List list) {
        if (list == null) {
            throw new NullPointerException("Null threads");
        }
        this.h = list;
        pvq pvqVar = pvq.a;
        if (pvqVar == null) {
            throw new NullPointerException("Null eventThreadType");
        }
        this.c = pvqVar;
    }
}
