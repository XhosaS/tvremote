package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjv implements bjx {
    private final bjx a;
    private final float b;

    public bjv(float f, bjx bjxVar) {
        while (bjxVar instanceof bjv) {
            bjxVar = ((bjv) bjxVar).a;
            f += ((bjv) bjxVar).b;
        }
        this.a = bjxVar;
        this.b = f;
    }

    @Override // defpackage.bjx
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjv)) {
            return false;
        }
        bjv bjvVar = (bjv) obj;
        return this.a.equals(bjvVar.a) && this.b == bjvVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
