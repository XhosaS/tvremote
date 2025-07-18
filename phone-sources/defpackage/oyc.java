package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyc {
    public String a;
    public vko b;
    public String c;
    private uwi d;
    private long e;
    private ImmutableMap f;
    private byte g;

    public final oyd a() {
        if (this.f == null) {
            this.f = ImmutableMap.of();
        }
        if (this.g == 1 && this.d != null) {
            return new oyd(this.a, this.d, this.e, this.f, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" promotion");
        }
        if (this.g == 0) {
            sb.append(" triggeringEventTimeMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Map map) {
        this.f = ImmutableMap.copyOf(map);
    }

    public final void c(uwi uwiVar) {
        if (uwiVar == null) {
            throw new NullPointerException("Null promotion");
        }
        this.d = uwiVar;
    }

    public final void d(long j) {
        this.e = j;
        this.g = (byte) 1;
    }
}
