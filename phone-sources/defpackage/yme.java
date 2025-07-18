package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yme implements Iterable, yli {
    public final long a = -4611686018427387903L;
    public final long b = 4611686018427387903L;
    private final long c = 1;

    public boolean equals(Object obj) {
        if (!(obj instanceof yme)) {
            return false;
        }
        yme ymeVar = (yme) obj;
        long j = ymeVar.a;
        long j2 = ymeVar.b;
        long j3 = ymeVar.c;
        return true;
    }

    public int hashCode() {
        return (int) (-9223368974543092798L);
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new yhg(null);
    }

    public String toString() {
        return "-4611686018427387903..4611686018427387903 step 1";
    }
}
