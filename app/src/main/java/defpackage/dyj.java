package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyj extends dyt {
    dyk b;
    public dyl c;
    public elq e;
    public eak f;
    public eak g;
    public final ArrayList a = new ArrayList();
    public dyp d = dyt.j;

    public final void a() {
        if (this.c == null) {
            return;
        }
        this.a.add(new dyr(new dyi(this.b, this.c), this.d, this.f, this.g, this.e));
        this.c = null;
        this.d = dyt.j;
        this.f = null;
        this.g = null;
        this.e = null;
    }
}
