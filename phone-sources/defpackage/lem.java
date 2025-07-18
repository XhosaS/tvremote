package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lem implements Comparable {
    public final int f;

    public lem(int i) {
        this.f = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f - ((lem) obj).f;
    }
}
