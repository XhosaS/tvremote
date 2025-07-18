package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyj implements jps {
    @Override // defpackage.jps
    public final void b(long j, float[] fArr) {
        double d = j;
        Arrays.fill(fArr, 0, 4, (float) (((4.0d - Math.cos(6.283185307179586E-4d * d)) - Math.cos(d * 0.006283185307179586d)) * 0.15d));
    }

    @Override // defpackage.jps
    public final void a() {
    }
}
