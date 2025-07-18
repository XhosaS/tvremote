package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thj implements Comparable {
    public Float a;
    public Float b;
    public TimeInterpolator c;

    public thj(float f, float f2, TimeInterpolator timeInterpolator) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Time value must be between [0,1]");
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Value percentage must be between [0,1]");
        }
        this.a = Float.valueOf(f);
        this.b = Float.valueOf(f2);
        this.c = timeInterpolator;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((thj) obj).a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof thj) && this.a.equals(((thj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
