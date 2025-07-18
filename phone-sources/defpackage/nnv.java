package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnv {
    public static long a;
    public final nod b;
    public String c;
    public String d;
    public String g;
    public int h;
    public boolean p;
    public int q;
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public int o = 0;
    public long e = a;
    public int f = 1;

    static {
        new nsf("ApplicationAnalyticsSession");
        a = System.currentTimeMillis();
    }

    public nnv(nod nodVar) {
        this.b = nodVar;
    }

    public static nnv a(nod nodVar) {
        nnv nnvVar = new nnv(nodVar);
        a++;
        return nnvVar;
    }
}
