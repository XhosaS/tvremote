package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrq implements nkb {
    private final Status a;
    private final njz b;
    private final String c;
    private final String d;
    private final boolean e;

    public nrq(Status status, njz njzVar, String str, String str2, boolean z) {
        this.a = status;
        this.b = njzVar;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // defpackage.nkb
    public final njz a() {
        return this.b;
    }

    @Override // defpackage.nkb
    public final String b() {
        return this.c;
    }

    @Override // defpackage.nkb
    public final String c() {
        return this.d;
    }

    @Override // defpackage.nkb
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.a;
    }

    public nrq(Status status) {
        this(status, null, null, null, false);
    }
}
