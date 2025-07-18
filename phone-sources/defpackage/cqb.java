package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqb {
    public final boolean a;
    final String b;
    public int c;
    public float d;
    public String e;
    boolean f;
    public int g;
    public final int h;

    public cqb(cqb cqbVar, Object obj) {
        this.a = false;
        this.b = cqbVar.b;
        this.h = cqbVar.h;
        a(obj);
    }

    public final void a(Object obj) {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                this.d = ((Float) obj).floatValue();
                return;
            }
            if (i2 == 2 || i2 == 3) {
                this.g = ((Integer) obj).intValue();
                return;
            }
            if (i2 == 4) {
                this.e = (String) obj;
                return;
            } else if (i2 == 5) {
                this.f = ((Boolean) obj).booleanValue();
                return;
            } else if (i2 != 7) {
                this.d = ((Float) obj).floatValue();
                return;
            }
        }
        this.c = ((Integer) obj).intValue();
    }

    public cqb(String str, int i, Object obj, boolean z) {
        this.b = str;
        this.h = i;
        this.a = z;
        a(obj);
    }
}
