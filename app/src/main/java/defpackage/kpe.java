package defpackage;

import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpe {
    public boolean a;
    public int b;
    public int c;
    public boolean d;
    public WorkSource e;
    private final int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private int k;
    private float l;
    private long m;
    private ClientIdentity n;

    public kpe(long j, byte[] bArr) {
        this(j);
        kpf.b(100);
        this.f = 100;
    }

    public final LocationRequest a() {
        int i = this.f;
        long j = this.g;
        return new LocationRequest(i, j, i == 105 ? this.h : Math.min(this.h, j), Math.max(this.i, this.g), Long.MAX_VALUE, this.j, this.k, this.l, this.a, this.m, this.b, this.c, this.d, new WorkSource(this.e), this.n);
    }

    public final void b(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        kkk.b(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.m = j;
    }

    public final void c(float f) {
        kkk.b(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
        this.l = f;
    }

    public kpe(long j) {
        this.f = 102;
        this.h = -1L;
        this.i = 0L;
        this.j = Long.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = 0.0f;
        this.a = true;
        this.m = -1L;
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = null;
        this.n = null;
        kkk.b(j >= 0, "intervalMillis must be greater than or equal to 0");
        this.g = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kpe(LocationRequest locationRequest) {
        this(locationRequest.a());
        int i = locationRequest.a;
        kpf.b(i);
        this.f = i;
        long jC = locationRequest.c();
        kkk.b(jC == -1 || jC >= 0, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.h = jC;
        long j = locationRequest.b;
        kkk.b(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
        this.i = j;
        long j2 = locationRequest.c;
        kkk.b(j2 > 0, "durationMillis must be greater than 0");
        this.j = j2;
        int i2 = locationRequest.d;
        kkk.b(i2 > 0, "maxUpdates must be greater than 0");
        this.k = i2;
        c(locationRequest.e);
        this.a = locationRequest.f;
        b(locationRequest.b());
        int i3 = locationRequest.g;
        koy.a(i3);
        this.b = i3;
        int i4 = locationRequest.h;
        kpg.a(i4);
        this.c = i4;
        this.d = locationRequest.i;
        this.e = locationRequest.j;
        ClientIdentity clientIdentity = locationRequest.k;
        kkk.a(clientIdentity == null || !clientIdentity.a());
        this.n = clientIdentity;
    }
}
