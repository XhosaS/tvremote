package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjt extends fjc implements Comparable {
    public long h;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fjt fjtVar = (fjt) obj;
        if (isEndOfStream() != fjtVar.isEndOfStream()) {
            return !isEndOfStream() ? -1 : 1;
        }
        long j = this.e - fjtVar.e;
        if (j == 0) {
            j = this.h - fjtVar.h;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
