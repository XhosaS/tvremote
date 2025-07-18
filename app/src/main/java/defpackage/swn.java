package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swn implements Serializable, swr {
    private static final long serialVersionUID = -8847617723802555911L;
    private final int a;

    public swn(int i) {
        this.a = i;
    }

    @Override // defpackage.swr
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return swr.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof swr) && this.a == ((swr) obj).a();
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a ^ (-1129414950);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.search.audio.policies.output.OutputPolicyUse(clientOrdinal=" + this.a + ')';
    }
}
