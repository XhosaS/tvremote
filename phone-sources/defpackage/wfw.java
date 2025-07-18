package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfw implements Comparable {
    public int a = -1;
    public double b = -1.0d;
    private final /* synthetic */ int c;

    public wfw(int i) {
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.c != 0 ? Double.valueOf(this.b).compareTo(Double.valueOf(((wfw) obj).b)) : Double.valueOf(this.b).compareTo(Double.valueOf(((wfw) obj).b));
    }
}
