package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raq {
    public static final raq a = new raq();
    public volatile qvf b;
    public volatile qvf c;
    public volatile qvf d;
    public volatile qvf e;
    public volatile qvf f;
    public volatile qvf g;
    public volatile qvf h;
    public volatile qvf i;
    public volatile qvf j;
    public volatile qvf k;
    public volatile qvf l;
    public volatile qpi m;
    private volatile int p = Integer.MAX_VALUE;
    public final rah n = new rah();
    public final rah o = new rah();

    public final void a(final int i) {
        if (this.n.b != null) {
            this.p = i;
        } else if (i < 4) {
            uea.a().post(new Runnable() { // from class: raf
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(i + 1);
                }
            });
        }
    }

    final boolean b(long j) {
        return ((long) this.p) < j;
    }
}
