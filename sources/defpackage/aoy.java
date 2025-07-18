package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aoy {
    private final int a;

    public aoy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aoy) && this.a == ((aoy) obj).a;
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
