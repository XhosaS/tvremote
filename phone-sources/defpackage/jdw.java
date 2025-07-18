package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdw implements Comparable {
    public final long a;
    public final Object b;
    private final /* synthetic */ int c;

    public jdw(long j, eey eeyVar, int i) {
        this.c = i;
        this.a = j;
        this.b = eeyVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.c != 0) {
            return Long.compare(this.a, ((jdw) obj).a);
        }
        jdw jdwVar = (jdw) obj;
        long j = jdwVar != null ? jdwVar.a : -1L;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        return j2 != j ? 1 : 0;
    }

    public jdw(long j, byte[] bArr, int i) {
        this.c = i;
        this.a = j;
        this.b = bArr;
    }
}
