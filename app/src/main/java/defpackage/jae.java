package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jae {
    public final int a;
    public final String b;
    public final agqi c;
    public int d;
    private final agqi e;

    public jae(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.e = new agqi();
        this.c = new agqi();
    }

    public final htg a() {
        htg htgVar = (htg) this.c.c();
        return htgVar == null ? (htg) this.e.c() : htgVar;
    }

    public final void b(htg htgVar) {
        if (htgVar != null) {
            if (htgVar.e) {
                this.c.addLast(htgVar);
            } else {
                this.e.addLast(htgVar);
            }
        }
        this.d++;
    }

    public final boolean c() {
        return this.d < this.a;
    }

    public final boolean d() {
        return this.c.isEmpty() && this.e.isEmpty();
    }
}
