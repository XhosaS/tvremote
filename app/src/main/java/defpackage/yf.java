package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class yf {
    yh a;
    final /* synthetic */ yg b;

    public yf(yg ygVar) {
        this.b = ygVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + this.a;
    }
}
