package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kht {
    public khv a;
    public khv b;
    public khi c;
    public Feature[] d;
    public int f;
    private final Runnable g = new Runnable() { // from class: khq
        @Override // java.lang.Runnable
        public final void run() {
        }
    };
    public boolean e = true;

    public final khu a() {
        kkk.b(this.a != null, "Must set register function");
        kkk.b(this.b != null, "Must set unregister function");
        kkk.b(this.c != null, "Must set holder");
        khg khgVar = this.c.b;
        kkk.l(khgVar, "Key must not be null");
        return new khu(new khr(this, this.c, this.d, this.e, this.f), new khs(this, khgVar), this.g);
    }
}
