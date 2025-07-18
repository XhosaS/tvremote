package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mgx {
    private final int a;

    public mgx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mgx) && this.a == ((mgx) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        return "java_hash=" + this.a;
    }

    public void a() {
    }
}
